package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebPageContainer;
import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.NXn, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59519NXn implements NY8 {
    public int LIZ;
    public final /* synthetic */ Context LIZIZ;
    public final /* synthetic */ C59518NXm LIZJ;

    @Override // X.NY8
    public final void LIZ() {
        C59484NWe c59484NWe;
        AdWebStatBusiness adWebStatBusiness;
        if (this.LIZ == 5) {
            return;
        }
        this.LIZ = 5;
        this.LIZJ.getLoadListener().LIZIZ(true);
        C59525NXt c59525NXt = this.LIZJ.LJLIL;
        if (c59525NXt != null) {
            c59525NXt.enable(false);
        }
        this.LIZJ.LIZIZ(R.id.hxa).setVisibility(8);
        C16880lQ.LJIILJJIL((FrameLayout) this.LIZJ.LIZIZ(R.id.hxa), null);
        this.LIZJ.LIZIZ(R.id.hxa).setClickable(false);
        AdPopUpWebPageContainer adPopUpWebPageContainer = this.LIZJ.LJLILLLLZI;
        if (adPopUpWebPageContainer != null && (c59484NWe = adPopUpWebPageContainer.LJLJJL) != null && (adWebStatBusiness = (AdWebStatBusiness) c59484NWe.LIZ(AdWebStatBusiness.class)) != null) {
            adWebStatBusiness.LJIIIZ(true, ((NZQ) this.LIZJ.LIZIZ(R.id.hxh)).getWebBackForwardList(), this.LIZJ.getWebView(), null);
        }
        NYO mBehaviorCallback = this.LIZJ.getMBehaviorCallback();
        if (mBehaviorCallback != null) {
            mBehaviorCallback.LIZ();
        }
        NZQ pop_up_web_page_webview = (NZQ) this.LIZJ.LIZIZ(R.id.hxh);
        o.LJIIIIZZ(pop_up_web_page_webview, "pop_up_web_page_webview");
        NZQ.LJIJI(pop_up_web_page_webview, "about:blank", false, null, 14);
        C59518NXm c59518NXm = this.LIZJ;
        C59529NXx c59529NXx = c59518NXm.LJLLI;
        if (c59529NXx != null) {
            String str = c59529NXx.LIZJ.get("EVENT_NAME_FOR_STAY");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, String> entry : c59529NXx.LIZJ.entrySet()) {
                if (!o.LJ(entry.getKey(), "EVENT_NAME_WHEN_REQUEST") && !o.LJ(entry.getKey(), "EVENT_NAME_FOR_STAY")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            linkedHashMap.put("duration", String.valueOf(c59518NXm.LJLJLLL.LIZIZ(TimeUnit.MILLISECONDS)));
            if (C78857UxB.LJJJIL(str)) {
                FMX.LJIIL(str, linkedHashMap);
            }
        }
        C59518NXm c59518NXm2 = this.LIZJ;
        c59518NXm2.LJLL = false;
        c59518NXm2.LJLJI = false;
        c59518NXm2.getLoadListener().LJLJJL = true;
    }

    @Override // X.NY8
    public final void LIZIZ() {
        if (this.LIZ == 3) {
            return;
        }
        this.LIZ = 3;
    }

    @Override // X.NY8
    public final void LIZJ() {
        if (C59520NXo.LLIFFJFJJ) {
            C9UE.LIZIZ(this.LIZIZ);
        }
    }

    @Override // X.NY8
    public final void LIZLLL() {
        if (this.LIZ == 4) {
            return;
        }
        this.LIZ = 4;
    }

    public C59519NXn(ActivityC45651qj activityC45651qj, C59518NXm c59518NXm) {
        this.LIZIZ = activityC45651qj;
        this.LIZJ = c59518NXm;
    }

    @Override // X.NY8
    public final void LJ(View view, float f) {
        if (Float.isNaN(f)) {
            this.LIZJ.LIZIZ(R.id.hxa).setAlpha(1.0f);
        } else {
            if (f >= 0.0f) {
                return;
            }
            this.LIZJ.LIZIZ(R.id.hxa).setAlpha(1.0f - Math.abs(f));
        }
    }
}
