package X;

import android.view.View;
import android.view.ViewParent;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdSparkHybridContext;
import com.ss.android.ugc.aweme.share.ShareH5Service;

/* loaded from: classes11.dex */
public final class NWR implements NMY {
    public final /* synthetic */ AdSparkHybridContext LIZ;

    @Override // X.NMY
    public final void LIZ() {
        EnumC60794NtW enumC60794NtW;
        C31999Ch9 c31999Ch9 = C31999Ch9.LIZJ;
        String str = this.LIZ.containerId;
        c31999Ch9.getClass();
        Object LIZIZ = C31999Ch9.LIZIZ(str);
        if (LIZIZ instanceof WebKitView) {
            ViewParent parent = ((View) LIZIZ).getParent();
            if (parent == null || !(parent instanceof SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) || (enumC60794NtW = ((SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS) parent).LJZI) == null) {
                enumC60794NtW = EnumC60794NtW.INIT;
            }
            if (enumC60794NtW.ordinal() >= EnumC60794NtW.SUCCESS.ordinal()) {
                AbstractC37353ElJ abstractC37353ElJ = (AbstractC37353ElJ) this.LIZ.LIZIZ(AbstractC37353ElJ.class);
                if (abstractC37353ElJ != null) {
                    ShareH5Service.LIZ.getClass();
                    C58149Mrx.LIZ().LIZ(abstractC37353ElJ, (WebView) LIZIZ);
                    return;
                }
                return;
            }
            AbstractC37353ElJ abstractC37353ElJ2 = (AbstractC37353ElJ) this.LIZ.LIZIZ(AbstractC37353ElJ.class);
            if (abstractC37353ElJ2 == null) {
                return;
            }
            ShareH5Service.LIZ.getClass();
            C58149Mrx.LIZ().LJIIIIZZ(abstractC37353ElJ2);
        }
    }

    @Override // X.NMY
    public final void LIZIZ() {
        InterfaceC60770Nt8 interfaceC60770Nt8 = (InterfaceC60770Nt8) this.LIZ.LIZIZ(InterfaceC60770Nt8.class);
        if (interfaceC60770Nt8 != null) {
            interfaceC60770Nt8.LJIIIZ("full_screen_page_click");
        }
    }

    public NWR(AdSparkHybridContext adSparkHybridContext) {
        this.LIZ = adSparkHybridContext;
    }
}
