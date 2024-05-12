package X;

import Y.IDeS355S0100000_9;
import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.ui.instagram.ThirdPartyDialogConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.Lhy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54982Lhy {
    public static boolean LJIIIIZZ;
    public final C54986Li2 LIZ;
    public final Activity LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public C26231ARf LJ;
    public final ThirdPartyDialogConfig LJFF;
    public final String LJI;
    public final Keva LJII;

    public final void LIZ(boolean z) {
        String str;
        if (z) {
            C26231ARf c26231ARf = this.LJ;
            if (c26231ARf != null) {
                c26231ARf.LIZIZ(null);
            }
        } else {
            HG3.LJFF().bindMobileOrEmailAndSetPwd(this.LIZIZ, this.LIZJ, this.LIZLLL, null, new IDeS355S0100000_9(this, 0));
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", "homepage_hot");
            c188727au.LJIIIZ("enter_method", "feed_popup");
            if (TextUtils.isEmpty(this.LJFF.cancelBtnText)) {
                str = "single_button";
            } else {
                str = "double_button";
            }
            c188727au.LJIIIZ("ui", str);
            c188727au.LJIIIZ("platform", this.LJI);
            FMX.LJIIL("bind_notify_confirm", c188727au.LIZ);
        }
        Keva keva = this.LJII;
        String str2 = this.LIZ.LJLJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str2);
        keva.storeLong(UPJ.LJ((RBX) HG3.LJIILL(), LIZ, LIZ), System.currentTimeMillis() + 86400000);
    }

    public C54982Lhy(C56237M5h c56237M5h, C54986Li2 c54986Li2, ActivityC45651qj context) {
        o.LJIIIZ(context, "context");
        this.LIZ = c54986Li2;
        this.LIZIZ = context;
        this.LIZJ = "homepage_hot";
        this.LIZLLL = "feed_popup";
        this.LJFF = (ThirdPartyDialogConfig) c56237M5h.LIZIZ;
        this.LJI = (String) c56237M5h.LIZ;
        this.LJII = Keva.getRepo(c54986Li2.LJLILLLLZI);
    }
}
