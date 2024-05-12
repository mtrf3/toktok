package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.bullet.business.AdLynxStatBusiness;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetBehavior;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageContainer;
import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.web.experiment.CommerceWebCrossToSparkExt;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NWG implements InterfaceC59503NWx {
    public int LIZ;
    public final /* synthetic */ Context LIZIZ;
    public final /* synthetic */ NWF LIZJ;

    @Override // X.InterfaceC59503NWx
    public final void LJFF() {
        this.LIZ = 6;
        this.LIZJ.LJIIZILJ(true);
    }

    @Override // X.InterfaceC59503NWx
    public final void LIZ() {
        String str;
        C59484NWe c59484NWe;
        AdWebStatBusiness adWebStatBusiness;
        NUT nut;
        AdLynxStatBusiness adLynxStatBusiness;
        NUT nut2;
        com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness adWebStatBusiness2;
        NUT nut3;
        AdLynxStatBusiness adLynxStatBusiness2;
        NUT nut4;
        com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness adWebStatBusiness3;
        InterfaceC60761Nsz kitView;
        int i = this.LIZ;
        if (i == 5) {
            return;
        }
        this.LIZ = 5;
        NWF nwf = this.LIZJ;
        if (nwf.LJLJJL) {
            NWJ bulletLoadListener = nwf.getBulletLoadListener();
            bulletLoadListener.LIZLLL = true;
            if (!bulletLoadListener.LIZIZ && bulletLoadListener.LJ != null) {
                System.currentTimeMillis();
            }
        } else {
            nwf.getLoadListener().LIZIZ(true);
        }
        NWM nwm = this.LIZJ.LJLIL;
        if (nwm != null) {
            nwm.enable(false);
        }
        this.LIZJ.LIZ(R.id.hxa).setVisibility(8);
        C16880lQ.LJIILJJIL((FrameLayout) this.LIZJ.LIZ(R.id.hxa), null);
        this.LIZJ.LIZ(R.id.hxa).setClickable(false);
        InterfaceC59489NWj mBehaviorCallback = this.LIZJ.getMBehaviorCallback();
        if (mBehaviorCallback != null) {
            str = mBehaviorCallback.LIZJ(i);
        } else {
            str = null;
        }
        NWF nwf2 = this.LIZJ;
        nwf2.LJLJL = false;
        if (nwf2.LJLJJL) {
            nwf2.getBulletLoadListener().LJFF = true;
            NWF nwf3 = this.LIZJ;
            if (nwf3.LJLJJLL) {
                SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sparkView = ((C59232NMm) nwf3.LIZ(R.id.hxj)).getSparkView();
                if (sparkView != null && (kitView = sparkView.getKitView()) != null) {
                    kitView.onHide();
                }
            } else {
                InterfaceC40516FvE interfaceC40516FvE = (InterfaceC40516FvE) ((C60193Njp) nwf3.LIZ(R.id.hxi)).getProviderFactory().LIZJ(InterfaceC40516FvE.class);
                if (interfaceC40516FvE != null) {
                    interfaceC40516FvE.LLJILJIL();
                }
            }
        } else {
            nwf2.getLoadListener().LJLJJL = true;
            if (CommerceWebCrossToSparkExt.LIZIZ()) {
                NWI nwi = (NWI) this.LIZJ.LIZ(R.id.uv);
                nwi.getClass();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("sendEventToFe event ");
                LIZ.append("onHide");
                LIZ.append(" params ");
                LIZ.append((Object) null);
                C59500NWu.LIZ(X1D.LIZIZ(LIZ));
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("eventName", "onHide");
                    jSONObject.put("data", (Object) null);
                } catch (Exception e) {
                    C78983UzD.LJIIZILJ(e);
                }
                WebKitView webKitView = nwi.LJLJL;
                if (webKitView != null) {
                    webKitView.LJIIIZ("onHide", jSONObject);
                }
            } else {
                NZQ pop_up_web_page_webview = (NZQ) this.LIZJ.LIZ(R.id.hxh);
                o.LJIIIIZZ(pop_up_web_page_webview, "pop_up_web_page_webview");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("eventName", "onHide");
                jSONObject2.put("data", (Object) null);
                pop_up_web_page_webview.LJJII("notification", jSONObject2);
            }
        }
        this.LIZJ.LJIIZILJ(false);
        this.LIZJ.LJIJ();
        NWF nwf4 = this.LIZJ;
        nwf4.LJLLLL = true;
        if (!nwf4.LJIIL()) {
            C59451NUx rootContainer = ((NWH) this.LIZJ.LIZ(R.id.hxi)).getRootContainer();
            if (rootContainer != null && (nut4 = rootContainer.LJLILLLLZI) != null && (adWebStatBusiness3 = (com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness) nut4.LIZ(com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness.class)) != null) {
                adWebStatBusiness3.LJIILJJIL(true);
            }
            C59451NUx rootContainer2 = ((NWH) this.LIZJ.LIZ(R.id.hxi)).getRootContainer();
            if (rootContainer2 != null && (nut3 = rootContainer2.LJLILLLLZI) != null && (adLynxStatBusiness2 = (AdLynxStatBusiness) nut3.LIZ(AdLynxStatBusiness.class)) != null) {
                adLynxStatBusiness2.LJII(true);
            }
            NVO rootContainer3 = ((C59232NMm) this.LIZJ.LIZ(R.id.hxj)).getRootContainer();
            if (rootContainer3 != null && (nut2 = rootContainer3.LJLIL) != null && (adWebStatBusiness2 = (com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness) nut2.LIZ(com.ss.android.ugc.aweme.bullet.business.AdWebStatBusiness.class)) != null) {
                adWebStatBusiness2.LJIILJJIL(true);
            }
            NVO rootContainer4 = ((C59232NMm) this.LIZJ.LIZ(R.id.hxj)).getRootContainer();
            if (rootContainer4 != null && (nut = rootContainer4.LJLIL) != null && (adLynxStatBusiness = (AdLynxStatBusiness) nut.LIZ(AdLynxStatBusiness.class)) != null) {
                adLynxStatBusiness.LJII(true);
            }
            if (CommerceWebCrossToSparkExt.LIZIZ()) {
                ((NWI) this.LIZJ.LIZ(R.id.uv)).LIZ(str);
                return;
            }
            AdPopUpWebPageContainer adPopUpWebPageContainer = this.LIZJ.LJLILLLLZI;
            if (adPopUpWebPageContainer == null || (c59484NWe = adPopUpWebPageContainer.LJLJJL) == null || (adWebStatBusiness = (AdWebStatBusiness) c59484NWe.LIZ(AdWebStatBusiness.class)) == null) {
                return;
            }
            adWebStatBusiness.LJIIIZ(true, ((NZQ) this.LIZJ.LIZ(R.id.hxh)).getWebBackForwardList(), this.LIZJ.getWebView(), str);
        }
    }

    @Override // X.InterfaceC59503NWx
    public final void LIZIZ() {
        String str;
        SharedPreferencesOnSharedPreferenceChangeListenerC60790NtS sparkView;
        InterfaceC60761Nsz kitView;
        if (this.LIZJ.LJIIL()) {
            ((C59501NWv) this.LIZJ.LIZ(R.id.hx7)).getBehavior().setPeekHeight((int) KL2.LIZJ(this.LIZIZ, 64.0f));
            NWF nwf = this.LIZJ;
            if (nwf.LJLLLL) {
                AdPopUpWebPageContainer adPopUpWebPageContainer = nwf.LJLILLLLZI;
                if (adPopUpWebPageContainer != null) {
                    adPopUpWebPageContainer.LIZ();
                }
                NWF nwf2 = this.LIZJ;
                NOJ noj = nwf2.LJLLL;
                if (noj != null) {
                    str = noj.LJFF;
                } else {
                    str = null;
                }
                nwf2.LJIILL(str, 2, null);
                NWF nwf3 = this.LIZJ;
                if (nwf3.LJLJJLL && (sparkView = ((C59232NMm) nwf3.LIZ(R.id.hxj)).getSparkView()) != null && (kitView = sparkView.getKitView()) != null) {
                    kitView.onShow();
                }
                this.LIZJ.LJLLLL = false;
            }
        }
        int i = this.LIZ;
        if (i == 3) {
            return;
        }
        this.LIZ = 3;
        InterfaceC59489NWj mBehaviorCallback = this.LIZJ.getMBehaviorCallback();
        if (mBehaviorCallback != null) {
            mBehaviorCallback.LIZIZ(i);
        }
        this.LIZJ.LIZ(R.id.hxa).setVisibility(0);
        this.LIZJ.LJIIZILJ(true);
    }

    @Override // X.InterfaceC59503NWx
    public final void LIZJ() {
        if (C59501NWv.LLII) {
            C9UE.LIZIZ(this.LIZIZ);
        }
    }

    @Override // X.InterfaceC59503NWx
    public final void LIZLLL() {
        int i;
        InterfaceC59489NWj mBehaviorCallback;
        if (this.LIZJ.LJIIL()) {
            if (this.LIZ != 5) {
                this.LIZJ.LJIJ();
            }
            this.LIZJ.LJLLLL = true;
        }
        int i2 = this.LIZ;
        if (i2 == 4) {
            if (this.LIZJ.LJIIL() && (mBehaviorCallback = this.LIZJ.getMBehaviorCallback()) != null) {
                mBehaviorCallback.LIZLLL(i2, Boolean.TRUE);
                return;
            }
            return;
        }
        this.LIZ = 4;
        if (this.LIZJ.LJIIL()) {
            AdPopUpWebBottomSheetBehavior<C59501NWv> behavior = ((C59501NWv) this.LIZJ.LIZ(R.id.hx7)).getBehavior();
            if (behavior.LIZJ) {
                i = -1;
            } else {
                i = behavior.LIZIZ;
            }
            if (i == ((int) KL2.LIZJ(this.LIZIZ, 64.0f))) {
                this.LIZJ.LIZ(R.id.hxa).setVisibility(8);
                C16880lQ.LJIILJJIL((FrameLayout) this.LIZJ.LIZ(R.id.hxa), null);
                this.LIZJ.LIZ(R.id.hxa).setClickable(false);
                InterfaceC59489NWj mBehaviorCallback2 = this.LIZJ.getMBehaviorCallback();
                if (mBehaviorCallback2 != null) {
                    mBehaviorCallback2.LIZLLL(i2, Boolean.FALSE);
                }
            }
        }
        this.LIZJ.LJIIZILJ(false);
    }

    public NWG(Context context, NWF nwf) {
        this.LIZIZ = context;
        this.LIZJ = nwf;
    }

    @Override // X.InterfaceC59503NWx
    public final void LJ(View view, float f) {
        if (this.LIZJ.LJIIL()) {
            float LJ = C60996Nwm.LJ(this.LIZIZ) - view.getTop();
            if (LJ > KL2.LIZJ(this.LIZIZ, 400.0f)) {
                this.LIZJ.LIZ(R.id.d43).setVisibility(8);
            } else {
                this.LIZJ.LIZ(R.id.d43).setVisibility(0);
            }
            if (LJ > KL2.LIZJ(this.LIZIZ, 400.0f)) {
                this.LIZJ.LIZ(R.id.d43).setAlpha(0.0f);
                this.LIZJ.LIZ(R.id.hx_).setAlpha(1.0f);
            } else if (LJ >= KL2.LIZJ(this.LIZIZ, 300.0f) && LJ <= KL2.LIZJ(this.LIZIZ, 400.0f)) {
                this.LIZJ.LIZ(R.id.d43).setAlpha(0.0f);
                this.LIZJ.LIZ(R.id.hx_).setAlpha(((1 - ((KL2.LIZJ(this.LIZIZ, 400.0f) - LJ) / KL2.LIZJ(this.LIZIZ, 100.0f))) * 0.9f) + 0.1f);
            } else if (LJ >= KL2.LIZJ(this.LIZIZ, 200.0f) && LJ < KL2.LIZJ(this.LIZIZ, 300.0f)) {
                this.LIZJ.LIZ(R.id.hx_).setAlpha(0.0f);
                this.LIZJ.LIZ(R.id.d43).setAlpha((KL2.LIZJ(this.LIZIZ, 300.0f) - LJ) / KL2.LIZJ(this.LIZIZ, 100.0f));
            } else {
                this.LIZJ.LIZ(R.id.hx_).setAlpha(0.0f);
                this.LIZJ.LIZ(R.id.d43).setAlpha(1.0f);
            }
            this.LIZJ.LIZ(R.id.hxa).setVisibility(0);
            this.LIZJ.LIZ(R.id.hxa).setAlpha(1 - (view.getTop() / (C60996Nwm.LJ(this.LIZIZ) - KL2.LIZJ(this.LIZIZ, 64.0f))));
            return;
        }
        this.LIZJ.LIZ(R.id.d43).setVisibility(8);
        if (Float.isNaN(f)) {
            this.LIZJ.LIZ(R.id.hxa).setAlpha(1.0f);
        } else {
            if (f >= 0.0f) {
                return;
            }
            this.LIZJ.LIZ(R.id.hxa).setAlpha(1.0f - Math.abs(f));
        }
    }
}
