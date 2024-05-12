package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import defpackage.q;
import kotlin.jvm.internal.o;

/* renamed from: X.2PJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2PJ implements IEvent {
    public final String LJLIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2PJ) && o.LJ(this.LJLIL, ((C2PJ) obj).LJLIL);
    }

    public final int hashCode() {
        String str = this.LJLIL;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C2U8.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C2U8.LIZIZ(this);
        return this;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FeaturedAnswerAwemeListMergeEvent(targetAwemeId=");
        return q.LIZIZ(LIZ, this.LJLIL, ')', LIZ);
    }

    public C2PJ(String str) {
        this.LJLIL = str;
    }
}
