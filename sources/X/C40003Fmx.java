package X;

import android.app.Application;
import android.content.IntentFilter;
import android.os.Build;
import com.ss.android.ugc.aweme.feed.earphone.IEarphonePlayerControlService;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.ss.android.ugc.aweme.main.LauncherAssem;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.ss.android.ugc.feed.platform.panel.earphone.EarphonePlayerControl;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.Fmx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40003Fmx extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public final /* synthetic */ LauncherAssem LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40003Fmx(LauncherAssem launcherAssem) {
        super(0);
        this.LJLIL = launcherAssem;
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        LauncherAssem launcherAssem = this.LJLIL;
        launcherAssem.getClass();
        ActivityC45651qj LIZ = C212428Vi.LIZ(launcherAssem);
        if (LIZ != null && C16330kX.LIZIZ(LIZ.getWindow().getDecorView()) && a.LJIJI().LIZ()) {
            C188727au c188727au = new C188727au();
            c188727au.LIZLLL(LTT.LIZIZ(LIZ) ? 1 : 0, "virtual_bar_status");
            c188727au.LIZLLL(LTT.LIZ(LIZ) ? 1 : 0, "physical_bar_status");
            int i = -1;
            if (Build.VERSION.SDK_INT > 28) {
                try {
                    int i2 = LIZ.getWindow().getDecorView().getRootWindowInsets().getTappableElementInsets().bottom;
                    if (i2 >= 0) {
                        i = i2 > 0 ? 1 : 0;
                    }
                } catch (Exception unused) {
                }
            }
            c188727au.LIZLLL(i, "tappable_element_insets");
            FMX.LJIIL("system_navigation_bar_status", c188727au.LIZ);
        }
        ActivityC45651qj LIZ2 = C212428Vi.LIZ(launcherAssem);
        if (LIZ2 != null) {
            RuntimeBehaviorServiceImpl.LJ().LIZJ(LIZ2);
            if (!FCO.LIZIZ && !LIZ2.isDestroyed() && Build.VERSION.SDK_INT <= 30) {
                C38778FJu LJJII = SpecActServiceImpl.LJJJIL().LJJII();
                launcherAssem.LJLIL = LJJII;
                C16880lQ.LJJLIIIJJIZ(LIZ2, LJJII, new IntentFilter("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
                launcherAssem.LJLJI = true;
            }
            launcherAssem.LJLILLLLZI = F69.LIZIZ.LIZ();
            if (LIZ2.getApplication() != null) {
                InterfaceC40004Fmy interfaceC40004Fmy = launcherAssem.LJLILLLLZI;
                o.LJI(interfaceC40004Fmy);
                Application application = LIZ2.getApplication();
                o.LJIIIIZZ(application, "activity.application");
                interfaceC40004Fmy.LIZ(application);
                IEarphonePlayerControlService LJII = EarphonePlayerControl.LJII();
                Application application2 = LIZ2.getApplication();
                o.LJIIIIZZ(application2, "activity.application");
                LJII.LIZ(application2);
            }
        }
        return C76800UCe.LIZ;
    }
}
