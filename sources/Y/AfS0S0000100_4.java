package Y;

import X.AFF;
import X.AFJ;
import X.C25569A1t;
import X.C38306F1q;
import X.InterfaceC64592gB;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* loaded from: classes5.dex */
public class AfS0S0000100_4 implements InterfaceC64592gB {
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
            case 2:
                accept$2(this, obj);
                return;
            case 3:
                accept$3(this, obj);
                return;
            case 4:
                accept$4(this, obj);
                return;
            default:
                return;
        }
    }

    public AfS0S0000100_4(long j, int i) {
        this.$t = i;
        switch (i) {
            case 0:
            case 1:
            case 2:
                this.j0 = j;
                return;
            default:
                this.j0 = j;
                return;
        }
    }

    public static final void accept$0(AfS0S0000100_4 afS0S0000100_4, Object obj) {
        C25569A1t.LIZ(0, ((BaseResponse) obj).status_code, System.currentTimeMillis() - afS0S0000100_4.j0, "/tiktok/v1/edibility/birthdate/");
    }

    public static final void accept$1(AfS0S0000100_4 afS0S0000100_4, Object obj) {
        int i;
        Throwable th = (Throwable) obj;
        long currentTimeMillis = System.currentTimeMillis() - afS0S0000100_4.j0;
        if (th instanceof C38306F1q) {
            i = ((C38306F1q) th).getErrorCode();
        } else {
            i = -1;
        }
        C25569A1t.LIZ(1, i, currentTimeMillis, "/tiktok/v1/edibility/birthdate/");
    }

    public static final void accept$2(AfS0S0000100_4 afS0S0000100_4, Object obj) {
        AFF.LIZIZ();
        AFJ.LIZ(-1, -1, afS0S0000100_4.j0, "kids_api_report");
    }

    public static final void accept$3(AfS0S0000100_4 afS0S0000100_4, Object obj) {
        C25569A1t.LIZ(0, ((BaseResponse) obj).status_code, System.currentTimeMillis() - afS0S0000100_4.j0, "/tiktok/v1/edibility/birthdate/");
    }

    public static final void accept$4(AfS0S0000100_4 afS0S0000100_4, Object obj) {
        int i;
        Throwable th = (Throwable) obj;
        long currentTimeMillis = System.currentTimeMillis() - afS0S0000100_4.j0;
        if (th instanceof C38306F1q) {
            i = ((C38306F1q) th).getErrorCode();
        } else {
            i = -1;
        }
        C25569A1t.LIZ(1, i, currentTimeMillis, "/tiktok/v1/edibility/birthdate/");
    }
}
