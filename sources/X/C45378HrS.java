package X;

import Y.IDHandlerS20S0100000_7;
import android.app.Activity;
import android.content.Context;
import android.os.Message;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HrS, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45378HrS implements InterfaceC87758YcM {
    public final String LIZ;
    public final String LIZIZ;
    public final Aweme LIZJ;
    public Context LIZLLL;
    public AlertDialogC45396Hrk LJ;
    public final IDHandlerS20S0100000_7 LJFF;

    public final void LJ() {
        Activity LJIJJ;
        Context context = this.LIZLLL;
        if (context != null && (LJIJJ = C45804HyK.LJIJJ(context)) != null && (LJIJJ.isFinishing() || LJIJJ.isDestroyed())) {
            return;
        }
        AlertDialogC45396Hrk alertDialogC45396Hrk = this.LJ;
        if (alertDialogC45396Hrk != null && alertDialogC45396Hrk.isShowing()) {
            alertDialogC45396Hrk.dismiss();
        }
        if (this.LJFF.hasMessages(1)) {
            this.LJFF.removeMessages(1);
        }
    }

    @Override // X.InterfaceC87758YcM
    public final void LIZIZ() {
        LJ();
    }

    @Override // X.InterfaceC87758YcM
    public final void LIZLLL() {
        LJ();
    }

    @Override // X.InterfaceC87758YcM
    public final void LIZ(Context context) {
        long j;
        o.LJIIIZ(context, "context");
        int i = 0;
        if (this.LJ == null) {
            this.LIZLLL = context;
            Activity LJIJJ = C45804HyK.LJIJJ(context);
            if (LJIJJ != null) {
                C217628gQ c217628gQ = C217628gQ.LIZIZ;
                if (c217628gQ.LIZJ(LJIJJ)) {
                    Activity LJIIIIZZ = C84763XOl.LJIIIIZZ();
                    if (LJIIIIZZ == null || c217628gQ.LIZJ(LJIIIIZZ)) {
                        C44936HkK.LIZ(new AqS154S0200000_7(this, context, 127));
                    } else {
                        this.LJ = AlertDialogC45396Hrk.LIZLLL(LJIIIIZZ, context.getResources().getString(R.string.q_k), R.style.hq);
                    }
                } else {
                    this.LJ = AlertDialogC45396Hrk.LIZLLL(context, context.getResources().getString(R.string.q_k), R.style.hq);
                }
                C188727au c188727au = new C188727au();
                c188727au.LJIIIZ("enter_from", this.LIZ);
                c188727au.LIZLLL(0, "is_long_item");
                c188727au.LJIIIZ("group_id", this.LIZJ.getGroupId());
                c188727au.LJIIIZ("download_method", this.LIZIZ);
                FMX.LJIIL("download_process_popup_show", c188727au.LIZ);
            }
        }
        AlertDialogC45396Hrk alertDialogC45396Hrk = this.LJ;
        if (alertDialogC45396Hrk != null) {
            alertDialogC45396Hrk.LIZJ(0);
        }
        if (!C45354Hr4.LIZ()) {
            j = 20000;
        } else {
            try {
                SettingsManager.LIZLLL().getClass();
                i = SettingsManager.LJ("show_share_cancel_interval", 0);
            } catch (Throwable unused) {
            }
            j = i * 1000;
        }
        this.LJFF.sendEmptyMessageDelayed(1, j);
    }

    @Override // X.InterfaceC87758YcM
    public final void LIZJ(int i) {
        LJ();
        if (i == -113) {
            C5S1 c5s1 = new C5S1(this.LIZLLL);
            c5s1.LIZJ(R.string.r49);
            c5s1.LJ();
        } else {
            C5S1 c5s12 = new C5S1(this.LIZLLL);
            c5s12.LIZJ(R.string.q_l);
            c5s12.LJ();
        }
    }

    @Override // X.InterfaceC87758YcM
    public final void updateProgress(int i) {
        Message message = new Message();
        message.what = 2;
        message.obj = Integer.valueOf(i);
        this.LJFF.sendMessage(message);
    }

    public C45378HrS(String enterFrom, Aweme aweme, String enterMethod) {
        o.LJIIIZ(enterFrom, "enterFrom");
        o.LJIIIZ(enterMethod, "enterMethod");
        o.LJIIIZ(aweme, "aweme");
        this.LIZ = enterFrom;
        this.LIZIZ = enterMethod;
        this.LIZJ = aweme;
        this.LJFF = new IDHandlerS20S0100000_7(this, C16880lQ.LLJJJJ(), 2);
    }
}
