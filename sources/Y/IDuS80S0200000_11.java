package Y;

import X.C16880lQ;
import X.C47261Igj;
import X.C73433Srt;
import X.InterfaceC73573Su9;
import X.InterfaceC86003Zc;
import X.QM6;
import X.QMB;
import X.QMC;
import X.RunnableC39007FSp;
import android.content.Context;
import android.os.Handler;
import com.ss.android.account.share.data.model.AccountShareInfo;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class IDuS80S0200000_11 implements InterfaceC86003Zc {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9<AccountShareInfo> interfaceC73573Su9) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC73573Su9);
                return;
            case 1:
                subscribe$1(this, interfaceC73573Su9);
                return;
            default:
                return;
        }
    }

    public static final void subscribe$0(IDuS80S0200000_11 iDuS80S0200000_11, InterfaceC73573Su9 interfaceC73573Su9) {
        Context context = (Context) iDuS80S0200000_11.l0;
        List<QMB> LJJIJ = C47261Igj.LJJIJ((QMB) iDuS80S0200000_11.l1);
        QMC qmc = new QMC((C73433Srt) interfaceC73573Su9);
        o.LJIIIZ(context, "context");
        QM6.LIZ = C16880lQ.LLLLL(context);
        QM6.LJ = false;
        QM6.LIZJ = qmc;
        Handler handler = QM6.LIZLLL;
        ARunnableS18S0000000_11 aRunnableS18S0000000_11 = QM6.LJI;
        handler.removeCallbacks(aRunnableS18S0000000_11);
        handler.postDelayed(aRunnableS18S0000000_11, 3000L);
        QM6.LIZIZ = LJJIJ;
        RunnableC39007FSp.LIZIZ(new IDRunnableS0S1201000(context, LJJIJ, 0));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:3|(2:4|5)|(20:7|8|9|(3:11|12|13)|52|(1:62)(1:(1:(3:57|(1:59)|15)(1:60))(1:61))|(1:17)(1:49)|18|(1:48)|20|21|22|(5:24|25|(1:(2:(1:34)|30)(1:35))(1:36)|31|32)|37|38|39|(5:41|25|(0)(0)|31|32)|30|31|32)|63|9|(0)|52|(0)|62|(0)(0)|18|(2:46|48)|20|21|22|(0)|37|38|39|(0)|30|31|32) */
    /* JADX WARN: Can't wrap try/catch for region: R(24:3|4|5|(20:7|8|9|(3:11|12|13)|52|(1:62)(1:(1:(3:57|(1:59)|15)(1:60))(1:61))|(1:17)(1:49)|18|(1:48)|20|21|22|(5:24|25|(1:(2:(1:34)|30)(1:35))(1:36)|31|32)|37|38|39|(5:41|25|(0)(0)|31|32)|30|31|32)|63|9|(0)|52|(0)|62|(0)(0)|18|(2:46|48)|20|21|22|(0)|37|38|39|(0)|30|31|32) */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (X.FFL.LJIIJ(31744, 0, "ec_photo_search_request_size", true) == 3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
    
        if (0 != 0) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void subscribe$1(Y.IDuS80S0200000_11 r16, X.InterfaceC73573Su9 r17) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDuS80S0200000_11.subscribe$1(Y.IDuS80S0200000_11, X.Su9):void");
    }

    public IDuS80S0200000_11(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
