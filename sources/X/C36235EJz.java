package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.network.BaseResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.EJz, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36235EJz {
    public final BaseResponse<String> LIZ;
    public final String LIZIZ;
    public final Throwable LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C36235EJz() {
        this((BaseResponse) null, (String) (0 == true ? 1 : 0), 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36235EJz)) {
            return false;
        }
        C36235EJz c36235EJz = (C36235EJz) obj;
        return o.LJ(this.LIZ, c36235EJz.LIZ) && o.LJ(this.LIZIZ, c36235EJz.LIZIZ) && o.LJ(this.LIZJ, c36235EJz.LIZJ);
    }

    public final int hashCode() {
        BaseResponse<String> baseResponse = this.LIZ;
        int hashCode = (baseResponse == null ? 0 : baseResponse.hashCode()) * 31;
        String str = this.LIZIZ;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th = this.LIZJ;
        return hashCode2 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OperateProductResult(response=");
        LIZ.append(this.LIZ);
        LIZ.append(", productId=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", throwable=");
        return C169696lJ.LIZLLL(LIZ, this.LIZJ, ')', LIZ);
    }

    public /* synthetic */ C36235EJz(BaseResponse baseResponse, String str, int i) {
        this((BaseResponse<String>) ((i & 1) != 0 ? null : baseResponse), (i & 2) != 0 ? null : str, (Throwable) null);
    }

    public C36235EJz(BaseResponse<String> baseResponse, String str, Throwable th) {
        this.LIZ = baseResponse;
        this.LIZIZ = str;
        this.LIZJ = th;
    }
}
