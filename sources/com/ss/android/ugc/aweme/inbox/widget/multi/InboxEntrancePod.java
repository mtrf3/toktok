package com.ss.android.ugc.aweme.inbox.widget.multi;

import X.AbstractC56676MMe;
import X.C16880lQ;
import X.C3ML;
import X.InterfaceC65349Pkn;
import X.MLS;
import X.X1D;
import com.ss.android.ugc.aweme.notice.repo.list.bean.InboxEntranceCell;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class InboxEntrancePod extends AbstractC56676MMe {

    @InterfaceC65349Pkn("entrance_cell")
    public final InboxEntranceCell entranceCell;

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("InboxEntrancePod(entranceCell=");
        LIZ.append(this.entranceCell);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.AbstractC56676MMe
    public final C3ML convertToInboxEntranceWrapper$awemenotice_release() {
        boolean z;
        int priority = this.entranceCell.getPriority();
        long lastNoticeCreateTime = this.entranceCell.getLastNoticeCreateTime();
        int i = this.type;
        if (MLS.LIZLLL(this.entranceCell) > 0) {
            z = true;
        } else {
            z = false;
        }
        return new C3ML(priority, lastNoticeCreateTime, i, z, this);
    }

    @Override // X.AbstractC56676MMe
    public final long getLastNoticeTime$awemenotice_release() {
        return this.entranceCell.getLastNoticeCreateTime();
    }

    @Override // X.AbstractC56676MMe
    public final int getPriority$awemenotice_release() {
        return this.entranceCell.getPriority();
    }

    @Override // X.AbstractC56676MMe
    public final boolean isUnread() {
        if (MLS.LIZLLL(this.entranceCell) > 0) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC56676MMe
    public final int hashCode() {
        return this.entranceCell.getBeforeMarkUnreadCount() + C16880lQ.LLJIJIL(this.entranceCell.getLastNoticeCreateTime()) + this.entranceCell.getUnreadCount() + this.entranceCell.getPriority() + this.entranceCell.getCellId() + super.hashCode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InboxEntrancePod(InboxEntranceCell entranceCell) {
        super(102);
        o.LJIIIZ(entranceCell, "entranceCell");
        this.entranceCell = entranceCell;
    }

    @Override // X.AbstractC56676MMe
    public final boolean equals(Object obj) {
        if (super.equals(obj) && (obj instanceof InboxEntrancePod)) {
            InboxEntrancePod inboxEntrancePod = (InboxEntrancePod) obj;
            if (inboxEntrancePod.entranceCell.getCellId() == this.entranceCell.getCellId() && inboxEntrancePod.entranceCell.getPriority() == this.entranceCell.getPriority() && inboxEntrancePod.entranceCell.getUnreadCount() == this.entranceCell.getUnreadCount() && inboxEntrancePod.entranceCell.getLastNoticeCreateTime() == this.entranceCell.getLastNoticeCreateTime() && inboxEntrancePod.entranceCell.getBeforeMarkUnreadCount() == this.entranceCell.getBeforeMarkUnreadCount() && o.LJ(inboxEntrancePod.entranceCell.getExposedInfo(), this.entranceCell.getExposedInfo()) && o.LJ(inboxEntrancePod.entranceCell.getUiInfo(), this.entranceCell.getUiInfo())) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC56676MMe
    public final boolean isSameItem(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof InboxEntrancePod) && this.entranceCell.getCellId() == ((InboxEntrancePod) obj).entranceCell.getCellId()) {
            return true;
        }
        return false;
    }
}
