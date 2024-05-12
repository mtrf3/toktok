package Y;

import X.C38306F1q;
import X.InterfaceC64592gB;
import X.OPZ;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes11.dex */
public class AfS3S0000100_10 implements InterfaceC64592gB {
    public final int $t;
    public long j0;

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                return;
            case 1:
                accept$1(this, obj);
                return;
            default:
                return;
        }
    }

    public AfS3S0000100_10(long j, int i) {
        this.$t = i;
        this.j0 = j;
    }

    public static final void accept$0(AfS3S0000100_10 afS3S0000100_10, Object obj) {
        OPZ.LIZLLL(0, ((BaseResponse) obj).status_code, System.currentTimeMillis() - afS3S0000100_10.j0, "/tiktok/v1/edibility/birthdate/");
    }

    public static final void accept$1(AfS3S0000100_10 afS3S0000100_10, Object obj) {
        int i;
        Throwable th = (Throwable) obj;
        long currentTimeMillis = System.currentTimeMillis() - afS3S0000100_10.j0;
        if (th instanceof C38306F1q) {
            i = ((C38306F1q) th).getErrorCode();
        } else {
            i = -1;
        }
        OPZ.LIZLLL(1, i, currentTimeMillis, "/tiktok/v1/edibility/birthdate/");
    }
}
