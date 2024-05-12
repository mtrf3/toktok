package Y;

import X.C0NB;
import X.C30868C9o;
import X.C77448UaS;
import X.CH1;
import X.InterfaceC64592gB;
import X.JBR;
import X.U4R;
import X.X1D;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.live.wallet.WalletExchange;
import com.bytedance.android.live.wallet.model.AutoExchangeData;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public class AfS7S2000000_13 implements InterfaceC64592gB {
    public final int $t;
    public String s0;
    public String s1;

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
            case 5:
                accept$5(this, obj);
                return;
            case 6:
                accept$6(this, obj);
                return;
            case 7:
                accept$7(this, obj);
                return;
            case 8:
                accept$8(this, obj);
                return;
            default:
                return;
        }
    }

    public AfS7S2000000_13(int i) {
        this.$t = i;
        this.s0 = "MultiGuestLiveShowLeaveRankDialog";
        this.s1 = "getShowRank";
    }

    public AfS7S2000000_13(String str, int i) {
        this.$t = i;
        this.s0 = "Linker";
        this.s1 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void accept$0(AfS7S2000000_13 afS7S2000000_13, Object obj) {
        BaseResponse response = (BaseResponse) obj;
        o.LJIIIZ(response, "response");
        WalletExchange walletExchange = WalletExchange.LJLIL;
        boolean after = ((AutoExchangeData) response.data).getAfter();
        walletExchange.getClass();
        WalletExchange.LJJIIJ(after);
        C77448UaS.LJI(afS7S2000000_13.s0, "ug_exchange", afS7S2000000_13.s1, ((AutoExchangeData) response.data).getAfter());
        if (walletExchange.LJIJJ()) {
            C30868C9o.LIZJ(R.string.kca);
        }
    }

    public static final void accept$1(AfS7S2000000_13 afS7S2000000_13, Object obj) {
        String str = afS7S2000000_13.s0;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(afS7S2000000_13.s1);
        LIZ.append(" success logId=");
        JBR.LJIIJ(LIZ, ((BaseResponse) obj).LIZIZ, LIZ, str);
    }

    public static final void accept$2(AfS7S2000000_13 afS7S2000000_13, Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof CH1) {
            String str = afS7S2000000_13.s0;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(afS7S2000000_13.s1);
            LIZ.append(" fail logId=");
            LIZ.append(((CH1) th).getxTtLogId());
            LIZ.append(" throwable=");
            LIZ.append(th);
            C0NB.LJIIIZ(str, X1D.LIZIZ(LIZ));
            return;
        }
        String str2 = afS7S2000000_13.s0;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(afS7S2000000_13.s1);
        LIZ2.append(" fail throwable=");
        LIZ2.append(th);
        C0NB.LJIIIZ(str2, X1D.LIZIZ(LIZ2));
    }

    public static final void accept$3(AfS7S2000000_13 afS7S2000000_13, Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof CH1) {
            String str = afS7S2000000_13.s0;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(afS7S2000000_13.s1);
            LIZ.append(" fail logId=");
            LIZ.append(((CH1) th).getxTtLogId());
            LIZ.append(" throwable=");
            LIZ.append(th);
            U4R.LIZLLL(str, X1D.LIZIZ(LIZ));
            return;
        }
        String str2 = afS7S2000000_13.s0;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(afS7S2000000_13.s1);
        LIZ2.append(" fail throwable=");
        LIZ2.append(th);
        U4R.LIZLLL(str2, X1D.LIZIZ(LIZ2));
    }

    public static final void accept$4(AfS7S2000000_13 afS7S2000000_13, Object obj) {
        String str = afS7S2000000_13.s0;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(afS7S2000000_13.s1);
        LIZ.append(" success logId=");
        LIZ.append(((BaseResponse) obj).LIZIZ);
        U4R.LIZLLL(str, X1D.LIZIZ(LIZ));
    }

    public static final void accept$5(AfS7S2000000_13 afS7S2000000_13, Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof CH1) {
            String str = afS7S2000000_13.s0;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(afS7S2000000_13.s1);
            LIZ.append(" fail logId=");
            LIZ.append(((CH1) th).getxTtLogId());
            LIZ.append(" throwable=");
            LIZ.append(th);
            U4R.LIZLLL(str, X1D.LIZIZ(LIZ));
            return;
        }
        String str2 = afS7S2000000_13.s0;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(afS7S2000000_13.s1);
        LIZ2.append(" fail throwable=");
        LIZ2.append(th);
        U4R.LIZLLL(str2, X1D.LIZIZ(LIZ2));
    }

    public static final void accept$6(AfS7S2000000_13 afS7S2000000_13, Object obj) {
        String str;
        BaseResponse baseResponse = (BaseResponse) obj;
        String str2 = afS7S2000000_13.s0;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(afS7S2000000_13.s1);
        LIZ.append(" success logId=");
        if (baseResponse != null) {
            str = baseResponse.LIZIZ;
        } else {
            str = null;
        }
        LIZ.append(str);
        U4R.LIZLLL(str2, X1D.LIZIZ(LIZ));
    }

    public static final void accept$7(AfS7S2000000_13 afS7S2000000_13, Object obj) {
        String str = afS7S2000000_13.s0;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(afS7S2000000_13.s1);
        LIZ.append(" success logId=");
        JBR.LJIIJ(LIZ, ((BaseResponse) obj).LIZIZ, LIZ, str);
    }

    public static final void accept$8(AfS7S2000000_13 afS7S2000000_13, Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof CH1) {
            String str = afS7S2000000_13.s0;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(afS7S2000000_13.s1);
            LIZ.append(" fail logId=");
            LIZ.append(((CH1) th).getxTtLogId());
            LIZ.append(" throwable=");
            LIZ.append(th);
            C0NB.LJIIIZ(str, X1D.LIZIZ(LIZ));
            return;
        }
        String str2 = afS7S2000000_13.s0;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(afS7S2000000_13.s1);
        LIZ2.append(" fail throwable=");
        LIZ2.append(th);
        C0NB.LJIIIZ(str2, X1D.LIZIZ(LIZ2));
    }

    public AfS7S2000000_13(String str, String str2, int i) {
        this.$t = i;
        this.s0 = str;
        this.s1 = str2;
    }
}
