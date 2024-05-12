package X;

import kotlin.jvm.internal.o;

/* renamed from: X.7n6, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C196287n6 implements C33Q {
    public final AbstractC196927o8 LJLIL;
    public final C7NN LJLILLLLZI;
    public final C43I<EnumC196967oC> LJLJI;
    public final C43I<Boolean> LJLJJI;

    public C196287n6() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C196287n6)) {
            return false;
        }
        C196287n6 c196287n6 = (C196287n6) obj;
        return o.LJ(this.LJLIL, c196287n6.LJLIL) && this.LJLILLLLZI == c196287n6.LJLILLLLZI && o.LJ(this.LJLJI, c196287n6.LJLJI) && o.LJ(this.LJLJJI, c196287n6.LJLJJI);
    }

    public final int hashCode() {
        int hashCode = (this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31)) * 31;
        C43I<EnumC196967oC> c43i = this.LJLJI;
        int hashCode2 = (hashCode + (c43i == null ? 0 : c43i.hashCode())) * 31;
        C43I<Boolean> c43i2 = this.LJLJJI;
        return hashCode2 + (c43i2 != null ? c43i2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NowAreaMonitorState(areaState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", scrollState=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", areaChangedEvent=");
        LIZ.append(this.LJLJI);
        LIZ.append(", checkRequest=");
        return C61845OOz.LIZIZ(LIZ, this.LJLJJI, ')', LIZ);
    }

    public /* synthetic */ C196287n6(int i) {
        this(C196957oB.LIZIZ, C7NN.NOT_VISIBLE_ENOUGH, null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C196287n6(AbstractC196927o8 areaState, C7NN scrollState, C43I<? extends EnumC196967oC> c43i, C43I<Boolean> c43i2) {
        o.LJIIIZ(areaState, "areaState");
        o.LJIIIZ(scrollState, "scrollState");
        this.LJLIL = areaState;
        this.LJLILLLLZI = scrollState;
        this.LJLJI = c43i;
        this.LJLJJI = c43i2;
    }

    public static C196287n6 LIZ(C196287n6 c196287n6, AbstractC196927o8 areaState, C7NN scrollState, C43I c43i, C43I c43i2, int i) {
        if ((i & 1) != 0) {
            areaState = c196287n6.LJLIL;
        }
        if ((i & 2) != 0) {
            scrollState = c196287n6.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i = c196287n6.LJLJI;
        }
        if ((i & 8) != 0) {
            c43i2 = c196287n6.LJLJJI;
        }
        c196287n6.getClass();
        o.LJIIIZ(areaState, "areaState");
        o.LJIIIZ(scrollState, "scrollState");
        return new C196287n6(areaState, scrollState, c43i, c43i2);
    }
}
