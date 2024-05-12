package X;

import kotlin.jvm.internal.o;

/* renamed from: X.98r, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2320198r implements C33Q {
    public final AnonymousClass991 LJLIL;
    public final C43I<C76800UCe> LJLILLLLZI;
    public final C43I<AnonymousClass993> LJLJI;
    public final AnonymousClass992 LJLJJI;

    public C2320198r() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2320198r)) {
            return false;
        }
        C2320198r c2320198r = (C2320198r) obj;
        return this.LJLIL == c2320198r.LJLIL && o.LJ(this.LJLILLLLZI, c2320198r.LJLILLLLZI) && o.LJ(this.LJLJI, c2320198r.LJLJI) && this.LJLJJI == c2320198r.LJLJJI;
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        C43I<C76800UCe> c43i = this.LJLILLLLZI;
        int hashCode2 = (hashCode + (c43i == null ? 0 : c43i.hashCode())) * 31;
        C43I<AnonymousClass993> c43i2 = this.LJLJI;
        return this.LJLJJI.hashCode() + ((hashCode2 + (c43i2 != null ? c43i2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HomepageRecommendState(uiState=");
        LIZ.append(this.LJLIL);
        LIZ.append(", triggerRefresh=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", toastEvent=");
        LIZ.append(this.LJLJI);
        LIZ.append(", expandReason=");
        LIZ.append(this.LJLJJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C2320198r(int i) {
        this(AnonymousClass991.HIDE, null, null, AnonymousClass992.UNINITIALIZED);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C2320198r(AnonymousClass991 uiState, C43I<C76800UCe> c43i, C43I<? extends AnonymousClass993> c43i2, AnonymousClass992 expandReason) {
        o.LJIIIZ(uiState, "uiState");
        o.LJIIIZ(expandReason, "expandReason");
        this.LJLIL = uiState;
        this.LJLILLLLZI = c43i;
        this.LJLJI = c43i2;
        this.LJLJJI = expandReason;
    }

    public static C2320198r LIZ(C2320198r c2320198r, AnonymousClass991 uiState, C43I c43i, C43I c43i2, AnonymousClass992 expandReason, int i) {
        if ((i & 1) != 0) {
            uiState = c2320198r.LJLIL;
        }
        if ((i & 2) != 0) {
            c43i = c2320198r.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            c43i2 = c2320198r.LJLJI;
        }
        if ((i & 8) != 0) {
            expandReason = c2320198r.LJLJJI;
        }
        c2320198r.getClass();
        o.LJIIIZ(uiState, "uiState");
        o.LJIIIZ(expandReason, "expandReason");
        return new C2320198r(uiState, c43i, c43i2, expandReason);
    }
}
