package X;

import com.ss.android.ugc.aweme.bnpl.network.model.ConsultRegisterInfoResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.a7w, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92264a7w implements C33Q {
    public final boolean LJLIL;
    public final EnumC91916a2K LJLILLLLZI;
    public final boolean LJLJI;
    public final ConsultRegisterInfoResponse LJLJJI;
    public final boolean LJLJJL;
    public final String LJLJJLL;

    public C92264a7w() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C92264a7w)) {
            return false;
        }
        C92264a7w c92264a7w = (C92264a7w) obj;
        return this.LJLIL == c92264a7w.LJLIL && this.LJLILLLLZI == c92264a7w.LJLILLLLZI && this.LJLJI == c92264a7w.LJLJI && o.LJ(this.LJLJJI, c92264a7w.LJLJJI) && this.LJLJJL == c92264a7w.LJLJJL && o.LJ(this.LJLJJLL, c92264a7w.LJLJJLL);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean] */
    public final int hashCode() {
        boolean z = this.LJLIL;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int hashCode = ((r0 * 31) + this.LJLILLLLZI.hashCode()) * 31;
        ?? r02 = this.LJLJI;
        int i = r02;
        if (r02 != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        ConsultRegisterInfoResponse consultRegisterInfoResponse = this.LJLJJI;
        int hashCode2 = (((i2 + (consultRegisterInfoResponse == null ? 0 : consultRegisterInfoResponse.hashCode())) * 31) + (this.LJLJJL ? 1 : 0)) * 31;
        String str = this.LJLJJLL;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("LandingContentState(isBarTransparent=");
        LIZ.append(this.LJLIL);
        LIZ.append(", loadingStatus=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", isActivateClicked=");
        LIZ.append(this.LJLJI);
        LIZ.append(", consultRegisterInfoResponse=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", isFirstRequest=");
        LIZ.append(this.LJLJJL);
        LIZ.append(", errorContent=");
        LIZ.append(this.LJLJJLL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ C92264a7w(int i) {
        this(true, EnumC91916a2K.LOADING, false, null, true, null);
    }

    public C92264a7w(boolean z, EnumC91916a2K loadingStatus, boolean z2, ConsultRegisterInfoResponse consultRegisterInfoResponse, boolean z3, String str) {
        o.LJIIIZ(loadingStatus, "loadingStatus");
        this.LJLIL = z;
        this.LJLILLLLZI = loadingStatus;
        this.LJLJI = z2;
        this.LJLJJI = consultRegisterInfoResponse;
        this.LJLJJL = z3;
        this.LJLJJLL = str;
    }

    public static C92264a7w LIZ(C92264a7w c92264a7w, boolean z, EnumC91916a2K enumC91916a2K, boolean z2, ConsultRegisterInfoResponse consultRegisterInfoResponse, String str, int i) {
        boolean z3;
        String str2 = str;
        ConsultRegisterInfoResponse consultRegisterInfoResponse2 = consultRegisterInfoResponse;
        boolean z4 = z2;
        boolean z5 = z;
        EnumC91916a2K loadingStatus = enumC91916a2K;
        if ((i & 1) != 0) {
            z5 = c92264a7w.LJLIL;
        }
        if ((i & 2) != 0) {
            loadingStatus = c92264a7w.LJLILLLLZI;
        }
        if ((i & 4) != 0) {
            z4 = c92264a7w.LJLJI;
        }
        if ((i & 8) != 0) {
            consultRegisterInfoResponse2 = c92264a7w.LJLJJI;
        }
        if ((i & 16) != 0) {
            z3 = c92264a7w.LJLJJL;
        } else {
            z3 = false;
        }
        if ((i & 32) != 0) {
            str2 = c92264a7w.LJLJJLL;
        }
        c92264a7w.getClass();
        o.LJIIIZ(loadingStatus, "loadingStatus");
        return new C92264a7w(z5, loadingStatus, z4, consultRegisterInfoResponse2, z3, str2);
    }
}
