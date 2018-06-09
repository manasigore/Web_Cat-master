/*==========================================================================*\
 |  $Id: SysAdminMessage.java,v 1.2 2011/12/25 02:24:54 stedwar2 Exp $
 |*-------------------------------------------------------------------------*|
 |  Copyright (C) 2010-2011 Virginia Tech
 |
 |  This file is part of Web-CAT.
 |
 |  Web-CAT is free software; you can redistribute it and/or modify
 |  it under the terms of the GNU Affero General Public License as published
 |  by the Free Software Foundation; either version 3 of the License, or
 |  (at your option) any later version.
 |
 |  Web-CAT is distributed in the hope that it will be useful,
 |  but WITHOUT ANY WARRANTY; without even the implied warranty of
 |  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 |  GNU General Public License for more details.
 |
 |  You should have received a copy of the GNU Affero General Public License
 |  along with Web-CAT; if not, see <http://www.gnu.org/licenses/>.
\*==========================================================================*/

package org.webcat.core.messaging;

//-------------------------------------------------------------------------
/**
 * An abstract subclass of {@link Message} used for messages that should also
 * be sent to any of the system administrator e-mail addresses that are
 * specified in the Web-CAT installation wizard.
 *
 * @author  Tony Allevato
 * @author  Last changed by $Author: stedwar2 $
 * @version $Revision: 1.2 $, $Date: 2011/12/25 02:24:54 $
 */
public abstract class SysAdminMessage
    extends Message
{
    //~ Methods ...............................................................

    // ----------------------------------------------------------
    @Override
    public boolean isSevere()
    {
        return true;
    }
}
