package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.feed.platform.container.protocol.priority.PriorityProtocol;
import kotlin.jvm.internal.o;

/* renamed from: X.8PW, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8PW<T extends PriorityProtocol> {
    public final T LIZ;
    public final InterfaceC88472Yns<T, C76800UCe> LIZIZ;
    public final Boolean LIZJ;
    public final C62822Ol8 LIZLLL;

    public final MutableLiveData<Boolean> LIZ() {
        return (MutableLiveData) this.LIZLLL.getValue();
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PriorityProtocolData(priority=");
        LIZ.append(this.LIZ);
        LIZ.append(", finish=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", needPending=");
        return C78920UyC.LIZIZ(LIZ, this.LIZJ, ')', LIZ);
    }

    public final boolean equals(Object obj) {
        C8PW c8pw;
        T t = this.LIZ;
        T t2 = null;
        if ((obj instanceof C8PW) && (c8pw = (C8PW) obj) != null) {
            t2 = c8pw.LIZ;
        }
        return o.LJ(t, t2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C8PW(PriorityProtocol priority, Boolean bool, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(priority, "priority");
        this.LIZ = priority;
        this.LIZIZ = interfaceC88472Yns;
        this.LIZJ = bool;
        this.LIZLLL = C221108m2.LIZIZ(C210798Pb.LJLIL);
    }
}
