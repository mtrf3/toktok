package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import defpackage.s0;
import kotlin.jvm.internal.o;

/* renamed from: X.2WP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2WP implements IEvent {
    public final Integer LJLIL;
    public final Integer LJLILLLLZI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2WP)) {
            return false;
        }
        C2WP c2wp = (C2WP) obj;
        return o.LJ(this.LJLIL, c2wp.LJLIL) && o.LJ(this.LJLILLLLZI, c2wp.LJLILLLLZI);
    }

    public final int hashCode() {
        Integer num = this.LJLIL;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LJLILLLLZI;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
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
        LIZ.append("ExitTabHorizontalVideo(tabIndex=");
        LIZ.append(this.LJLIL);
        LIZ.append(", index=");
        return s0.LIZJ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public C2WP(Integer num, Integer num2) {
        this.LJLIL = num;
        this.LJLILLLLZI = num2;
    }
}
