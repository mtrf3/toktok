package com.ss.android.ugc.aweme.inbox.widget.multi;

import X.AbstractC56676MMe;
import X.AnonymousClass391;
import X.C16880lQ;
import X.C3ML;
import X.C61878OQg;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CombineLiveNotice;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class SkylightLiveGuidePod extends AbstractC56676MMe {

    @InterfaceC65349Pkn("live_notices")
    public List<CombineLiveNotice> liveNotices;

    public SkylightLiveGuidePod() {
        this(null, 1, null);
    }

    @Override // X.AbstractC56676MMe
    public final boolean isUnread() {
        return false;
    }

    @Override // X.AbstractC56676MMe
    public final C3ML convertToInboxEntranceWrapper$awemenotice_release() {
        return new C3ML(550, 0L, this.type, false, this);
    }

    @Override // X.AbstractC56676MMe
    public final int hashCode() {
        return C16880lQ.LLJILJIL(false) + AnonymousClass391.LIZIZ(this.liveNotices, super.hashCode() * 31, 31);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkylightLiveGuidePod(List<CombineLiveNotice> liveNotices) {
        super(200);
        o.LJIIIZ(liveNotices, "liveNotices");
        this.liveNotices = liveNotices;
    }

    @Override // X.AbstractC56676MMe
    public final boolean equals(Object obj) {
        SkylightLiveGuidePod skylightLiveGuidePod;
        if (super.equals(obj)) {
            List<CombineLiveNotice> list = this.liveNotices;
            List<CombineLiveNotice> list2 = null;
            if ((obj instanceof SkylightLiveGuidePod) && (skylightLiveGuidePod = (SkylightLiveGuidePod) obj) != null) {
                list2 = skylightLiveGuidePod.liveNotices;
            }
            if (o.LJ(list, list2)) {
                return true;
            }
        }
        return false;
    }

    public SkylightLiveGuidePod(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C61878OQg.INSTANCE : list);
    }
}
