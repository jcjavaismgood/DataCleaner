/**
 * DataCleaner (community edition)
 * Copyright (C) 2014 Neopost - Customer Information Management
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 */
package org.datacleaner.monitor.server.wizard.synonymcatalog.datastore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class DatastoreSynonymCatalogReferenceDataPageSynonymTest {

    @Test
    public void testGetPageIndex() throws Exception {
        final DatastoreSynonymCatalogReferenceDataPageSynonym page =
                new DatastoreSynonymCatalogReferenceDataPageSynonym(null);
        assertEquals(new Integer(4), page.getPageIndex());
    }

    @Test
    public void testGetTemplateFilename() throws Exception {
        final DatastoreSynonymCatalogReferenceDataPageSynonym page =
                new DatastoreSynonymCatalogReferenceDataPageSynonym(null);
        assertNotEquals("", page.getTemplateFilename());
    }
}
