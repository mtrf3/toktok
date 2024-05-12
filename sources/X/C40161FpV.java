package X;

import android.os.Build;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.webkit.internal.WebViewFeatureInternal;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.zhiliaoapp.musically.R;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;

/* renamed from: X.FpV, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40161FpV extends AbstractC60811Ntn {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC60673NrZ
    public final void LJJJJLI(InterfaceC60761Nsz interfaceC60761Nsz) {
        C60737Nsb hybridContext;
        InterfaceC40155FpP interfaceC40155FpP;
        if (interfaceC60761Nsz instanceof WebKitView) {
            WebKitView webKitView = (WebKitView) interfaceC60761Nsz;
            if (webKitView != null && (hybridContext = webKitView.getHybridContext()) != null && (interfaceC40155FpP = (InterfaceC40155FpP) hybridContext.LIZIZ(InterfaceC40155FpP.class)) != null && interfaceC40155FpP.LIZJ()) {
                webKitView.setTag(R.id.ni5, new C37039EgF(EnumC37040EgG.THIRD, 2));
            }
            if (C60806Nti.LIZ && interfaceC60761Nsz.getHybridContext().LJ(null) == EnumC60795NtX.DARK) {
                if (Build.VERSION.SDK_INT >= 29) {
                    ((WebView) interfaceC60761Nsz).setForceDarkAllowed(true);
                }
                if (WebViewFeatureInternal.isSupported("FORCE_DARK")) {
                    OM1 om1 = (OM1) interfaceC60761Nsz;
                    WebSettings settings = om1.getSettings();
                    C40411iH c40411iH = WebViewFeatureInternal.FORCE_DARK;
                    if (c40411iH.LIZJ()) {
                        C07920Su.LIZLLL(settings, 2);
                    } else if (c40411iH.LIZLLL()) {
                        ((WebSettingsBoundaryInterface) C07440Qy.LIZ(settings).LJLIL).setForceDark(2);
                    } else {
                        throw WebViewFeatureInternal.getUnsupportedOperationException();
                    }
                    if (WebViewFeatureInternal.isSupported("FORCE_DARK_STRATEGY")) {
                        int LIZIZ = Q7K.LIZIZ("spark_theme_settings", 0);
                        if (LIZIZ != 2) {
                            if (LIZIZ != 3) {
                                if (LIZIZ == 4) {
                                    C07440Qy.LIZIZ(om1.getSettings(), 1);
                                }
                            } else {
                                C07440Qy.LIZIZ(om1.getSettings(), 0);
                            }
                        } else {
                            C07440Qy.LIZIZ(om1.getSettings(), 2);
                        }
                        if (WebViewFeatureInternal.isSupported("ALGORITHMIC_DARKENING")) {
                            WebSettings settings2 = om1.getSettings();
                            if (WebViewFeatureInternal.ALGORITHMIC_DARKENING.LIZLLL()) {
                                ((WebSettingsBoundaryInterface) C07440Qy.LIZ(settings2).LJLIL).setAlgorithmicDarkeningAllowed(true);
                                return;
                            }
                            throw WebViewFeatureInternal.getUnsupportedOperationException();
                        }
                    }
                }
            }
        }
    }
}
