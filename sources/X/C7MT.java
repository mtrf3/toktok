package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7MT, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7MT implements C33Q {
    public final EnumC181857Bt LJLIL;
    public final C43I<OSZ<C80H, Object>> LJLILLLLZI;

    public C7MT() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7MT)) {
            return false;
        }
        C7MT c7mt = (C7MT) obj;
        return this.LJLIL == c7mt.LJLIL && o.LJ(this.LJLILLLLZI, c7mt.LJLILLLLZI);
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        C43I<OSZ<C80H, Object>> c43i = this.LJLILLLLZI;
        return hashCode + (c43i == null ? 0 : c43i.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowShareState(nowShareBtnState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", animationEvent=");
        return C61845OOz.LIZIZ(LIZ, this.LJLILLLLZI, ')', LIZ);
    }

    public /* synthetic */ C7MT(int i) {
        this(EnumC181857Bt.NORMAL, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7MT(EnumC181857Bt nowShareBtnState, C43I<? extends OSZ<? extends C80H, ? extends Object>> c43i) {
        o.LJIIIZ(nowShareBtnState, "nowShareBtnState");
        this.LJLIL = nowShareBtnState;
        this.LJLILLLLZI = c43i;
    }

    public static C7MT LIZ(C7MT c7mt, EnumC181857Bt nowShareBtnState, C43I c43i, int i) {
        if ((i & 1) != 0) {
            nowShareBtnState = c7mt.LJLIL;
        }
        if ((i & 2) != 0) {
            c43i = c7mt.LJLILLLLZI;
        }
        c7mt.getClass();
        o.LJIIIZ(nowShareBtnState, "nowShareBtnState");
        return new C7MT(nowShareBtnState, c43i);
    }
}
