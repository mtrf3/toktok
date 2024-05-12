package com.ss.android.ugc.aweme.notification.bean;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CombineLiveNotice;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class LiveMessage {

    @InterfaceC65349Pkn("live_message")
    public final List<CombineLiveNotice> liveNotice;

    /* JADX WARN: Multi-variable type inference failed */
    public LiveMessage() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LiveMessage copy$default(LiveMessage liveMessage, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = liveMessage.liveNotice;
        }
        return liveMessage.copy(list);
    }

    public final LiveMessage copy(List<CombineLiveNotice> list) {
        return new LiveMessage(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LiveMessage) && o.LJ(this.liveNotice, ((LiveMessage) obj).liveNotice);
    }

    public int hashCode() {
        List<CombineLiveNotice> list = this.liveNotice;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LiveMessage(liveNotice=");
        return C1NE.LIZIZ(LIZ, this.liveNotice, ')', LIZ);
    }

    public LiveMessage(List<CombineLiveNotice> list) {
        this.liveNotice = list;
    }

    public /* synthetic */ LiveMessage(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list);
    }
}
