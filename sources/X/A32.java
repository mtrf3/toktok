package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class A32 implements C33Q {
    public final AbstractC72932td<BaseResponse> LJLIL;
    public final C25598A2w LJLILLLLZI;

    public A32() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A32)) {
            return false;
        }
        A32 a32 = (A32) obj;
        return o.LJ(this.LJLIL, a32.LJLIL) && o.LJ(this.LJLILLLLZI, a32.LJLILLLLZI);
    }

    public final int hashCode() {
        int hashCode = this.LJLIL.hashCode() * 31;
        C25598A2w c25598A2w = this.LJLILLLLZI;
        return hashCode + (c25598A2w == null ? 0 : c25598A2w.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PaidContentDetailVoucherState(voucherResponse=");
        LIZ.append(this.LJLIL);
        LIZ.append(", voucherPanelColorState=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public /* synthetic */ A32(int i) {
        this(C33X.LIZ, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public A32(AbstractC72932td<? extends BaseResponse> voucherResponse, C25598A2w c25598A2w) {
        o.LJIIIZ(voucherResponse, "voucherResponse");
        this.LJLIL = voucherResponse;
        this.LJLILLLLZI = c25598A2w;
    }

    public static A32 LIZ(A32 a32, AbstractC72932td voucherResponse, C25598A2w c25598A2w, int i) {
        if ((i & 1) != 0) {
            voucherResponse = a32.LJLIL;
        }
        if ((i & 2) != 0) {
            c25598A2w = a32.LJLILLLLZI;
        }
        a32.getClass();
        o.LJIIIZ(voucherResponse, "voucherResponse");
        return new A32(voucherResponse, c25598A2w);
    }
}
