package X;

import android.webkit.WebView;
import com.ss.android.ugc.aweme.music.ui.MusicLandingPageViewModel;
import kotlin.jvm.internal.AqS176S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Nif, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60121Nif implements InterfaceC60651NrD {
    public final /* synthetic */ AbstractC60629Nqr<?> LIZ;

    @Override // X.InterfaceC60651NrD
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC60651NrD
    public final void LJ() {
        if (o.LJ(C60119Nid.LIZ, "not_secure") || o.LJ(C60119Nid.LIZ, "protection")) {
            C60119Nid.LIZ = "safe";
            MusicLandingPageViewModel musicLandingPageViewModel = C60119Nid.LJI;
            if (musicLandingPageViewModel != null) {
                musicLandingPageViewModel.gv0("loading");
                C60119Nid.LIZIZ(C60119Nid.LJFF);
            } else {
                o.LJIJI("safeStatusViewModel");
                throw null;
            }
        }
    }

    public C60121Nif(AbstractC60629Nqr<?> abstractC60629Nqr) {
        this.LIZ = abstractC60629Nqr;
    }

    @Override // X.InterfaceC60651NrD
    public final void LIZ(java.util.Map map) {
        map.put("bid", "music_third_party");
        FMX.LJIIL("scc_cloudservice_result", map);
    }

    @Override // X.InterfaceC60651NrD
    public final void LIZIZ(WebView webView, String str) {
        if (str == null) {
            str = "";
        }
        C60119Nid.LIZJ = str;
        C60119Nid.LIZ = "protection";
        C60119Nid.LIZJ(webView, new AqS176S0100000_10(this.LIZ, (AbstractC60629Nqr<?>) 122));
    }

    @Override // X.InterfaceC60651NrD
    public final void LIZJ(WebView webView, String str) {
        if (str == null) {
            str = "";
        }
        C60119Nid.LIZJ = str;
        C60119Nid.LIZ = "not_secure";
        C60119Nid.LIZJ(webView, new AqS176S0100000_10(this.LIZ, (AbstractC60629Nqr<?>) 121));
    }
}
