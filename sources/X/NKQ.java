package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NKQ {
    public final SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS LIZ;
    public NKV LIZIZ;
    public View LIZJ;
    public boolean LIZLLL;
    public boolean LJ;

    public final void LIZJ() {
        this.LIZLLL = false;
        this.LJ = false;
    }

    public final void LIZIZ() {
        ViewGroup viewGroup;
        ViewParent parent = this.LIZ.getParent();
        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
            C16880lQ.LJLLL(this.LIZ, viewGroup);
        }
    }

    public final void LIZLLL(JSONObject jSONObject) {
        InterfaceC60761Nsz kitView = this.LIZ.getKitView();
        if (kitView != null) {
            kitView.LJIIIZ("event_card_show", jSONObject);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [android.util.AttributeSet] */
    /* JADX WARN: Type inference failed for: r3v1, types: [X.NKV] */
    /* JADX WARN: Type inference failed for: r3v6 */
    public NKQ(Context context, NLW nlw) {
        NKS nks = new NKS(this);
        ?? r3 = 0;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS = new SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS(context, r3, 62);
        sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.LIZ = sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS;
        if (nlw != null) {
            IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
            r3 = nlw.LIZLLL(sharedPreferencesOnSharedPreferenceChangeListenerC60790NtS, LJJI != null ? LJJI.LJIIL("lynx_feed") : null, nks);
        }
        this.LIZIZ = r3;
    }

    public final void LIZ(Bundle bundle, String str) {
        if (this.LIZ.getKitView() != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS.LJ(this.LIZ);
        }
        NKV nkv = this.LIZIZ;
        if (nkv != null) {
            nkv.LIZ(bundle, str, C59209NLp.LIZ().enableLynxCard);
        }
    }
}
