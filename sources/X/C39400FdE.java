package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.keva.Keva;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;
import java.lang.ref.WeakReference;

/* renamed from: X.FdE, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39400FdE implements InterfaceC39397FdB {
    public final WeakReference<Context> LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ C87094YGc LIZLLL;

    @Override // X.InterfaceC39397FdB
    public final void LLJJ() {
        C39396FdA.LIZJ("pref_language_key", this.LIZIZ);
        C39396FdA.LIZJ("key_current_locale", this.LIZJ);
        Context context = this.LIZ.get();
        if (context == null) {
            return;
        }
        if (context instanceof Activity) {
            ((Activity) context).finish();
        }
        SmartRoute buildRoute = SmartRouter.buildRoute(context, "//kids/main");
        buildRoute.addFlags(268468224);
        buildRoute.open();
        Keva.getRepo("TTSettingData").erase("last_get_setting_time");
        C56971MXn.LIZIZ();
        if (KidsAccountServiceImpl.LJIIIIZZ().isLogin()) {
            this.LIZLLL.getClass();
            this.LIZLLL.LIZIZ.editLanguageConfig(C87094YGc.LIZ()).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new C39401FdF(context, System.currentTimeMillis()));
        }
    }

    public C39400FdE(Context context, String str, String str2, C87094YGc c87094YGc) {
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = c87094YGc;
        this.LIZ = new WeakReference<>(context);
    }
}
