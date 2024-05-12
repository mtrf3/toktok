package X;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NKR {
    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ;
    public final NKV LIZIZ;
    public View LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    public final void LIZIZ() {
        ViewGroup viewGroup;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LIZ;
        ViewParent viewParent = null;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            viewParent = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getParent();
        }
        if ((viewParent instanceof ViewGroup) && (viewGroup = (ViewGroup) viewParent) != null) {
            C16880lQ.LJLLL(this.LIZ, viewGroup);
        }
    }

    public final void LIZJ(JSONObject jSONObject) {
        InterfaceC60761Nsz kitView;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && (kitView = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView()) != null) {
            kitView.LJIIIZ("event_card_show", jSONObject);
        }
    }

    public NKR(NLW nlw, NKN nkn) {
        NKT nkt = new NKT(this, nkn);
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = nkn.LIZLLL;
        C59190NKw c59190NKw = null;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null) {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        } else {
            sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = null;
        }
        this.LIZ = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        if (nlw != null) {
            IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
            c59190NKw = nlw.LIZLLL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, LJJI != null ? LJJI.LJIIL("lynx_feed") : null, nkt);
        }
        this.LIZIZ = c59190NKw;
    }

    public final void LIZ(Bundle bundle, String str) {
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = this.LIZ;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS != null && sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.getKitView() != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(this.LIZ);
        }
        NKV nkv = this.LIZIZ;
        if (nkv != null) {
            nkv.LIZ(bundle, str, C59209NLp.LIZ().enableLynxCard);
        }
    }
}
