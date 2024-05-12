package X;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService;
import com.ss.android.ugc.aweme.autofill.AdAutofillService;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class NOR extends NOS {
    public final long LJJIZ;
    public final String LJJJ;
    public final String LJJJI;
    public final int LJJJIL;
    public final String LJJJJ;
    public final String LJJJJI;
    public final String LJJJJIZL;
    public final List<String> LJJJJJ;
    public final String LJJJJJL;
    public final String LJJJJL;

    @Override // X.AbstractC59248NNc
    public final boolean LIZIZ() {
        if (TextUtils.equals(this.LJJJ, "lynx") && !TextUtils.isEmpty(this.LJJJI)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC59249NNd
    public final C59289NOr LIZJ() {
        String str;
        Bundle LLJJIJI = C16880lQ.LLJJIJI(LIZLLL());
        if (LLJJIJI == null) {
            LLJJIJI = new Bundle();
        }
        String str2 = this.LJJJI;
        LLJJIJI.putBoolean("is_lynx_landing_page", true);
        LLJJIJI.putBoolean("hide_nav_bar", true);
        LLJJIJI.putBoolean("hide_status_bar", false);
        LLJJIJI.putBoolean("bundle_nav_bar_status_padding", true);
        LLJJIJI.putBoolean("need_bottom_out", true);
        if (this.LJJJIL == 1) {
            if (!TextUtils.isEmpty(this.LJJJJ)) {
                LLJJIJI.putString("bundle_full_screen_bg_image", this.LJJJJ);
            }
            LLJJIJI.putInt("bundle_webview_background", 0);
        }
        LLJJIJI.putString("lynx_channel_name", this.LJJJJI);
        LLJJIJI.putString("bundle_native_site_custom_data", this.LJJJJIZL);
        List<String> list = this.LJJJJJ;
        if (list != null && !list.isEmpty()) {
            IAdLandPagePreloadService LJJI = AdLandPagePreloadServiceImpl.LJJI();
            if (LJJI == null || (str = LJJI.LIZLLL(Long.valueOf(this.LJJIZ))) == null) {
                str = "";
            }
            LLJJIJI.putString("second_page_preload_channel_prefix", str);
            LJJI.LJI();
            NHG.LJIILLIIL(this.LJJJJJ);
        }
        LLJJIJI.putInt("preset_width", View.MeasureSpec.makeMeasureSpec(KL2.LJIIJJI(this.LIZIZ), 1073741824));
        LLJJIJI.putInt("preset_height", View.MeasureSpec.makeMeasureSpec(KL2.LJIIIZ(this.LIZIZ) - C63081OpJ.LJJJJLI(this.LIZIZ), 1073741824));
        android.net.Uri parse = UriProtector.parse(str2);
        if (parse.isHierarchical()) {
            LLJJIJI.putString("bundle_origin_url", UriProtector.getQueryParameter(parse, "fallback_url"));
            if (TextUtils.equals(UriProtector.getQueryParameter(parse, "async_layout"), "1")) {
                LLJJIJI.putBoolean("preset_safe_point", true);
                LLJJIJI.putInt("thread_strategy", 2);
            }
        }
        Uri.Builder buildUpon = parse.buildUpon();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("siteId", this.LJJIJ);
        jSONObject.put("adId", String.valueOf(this.LJJIZ));
        jSONObject.put("creativeId", String.valueOf(this.LJIIIIZZ));
        jSONObject.put("logExtra", this.LJIIIZ);
        jSONObject.put("groupId", String.valueOf(this.LJIIJ));
        jSONObject.put("webUrl", this.LJIJJ);
        jSONObject.put("pageData", this.LJJJJJL);
        jSONObject.put("appData", this.LJJJJL);
        jSONObject.put("isRTL", C90193gN.LIZIZ(this.LIZIZ) ? 1 : 0);
        jSONObject.put("topSafeAreaHeight", C63081OpJ.LJJJJLI(this.LIZIZ));
        jSONObject.put("isAutoFillEnable", C53201KuL.LIZ() ? 1 : 0);
        jSONObject.put("autoFillInfo", AdAutofillService.LJIIIIZZ().LIZIZ());
        String jSONObject2 = jSONObject.toString();
        o.LJIIIIZZ(jSONObject2, "dataObj.toString()");
        buildUpon.appendQueryParameter("lynx_landing_page_data", jSONObject2);
        buildUpon.appendQueryParameter("lynx_landing_page_title", this.LJIJJLI);
        String builder = buildUpon.toString();
        o.LJIIIIZZ(builder, "urlBuilder.toString()");
        C59280NOi.LIZIZ.LIZLLL(this.LIZIZ, builder, this.LIZLLL, LLJJIJI);
        return new C59289NOr(true);
    }

    @Override // X.AbstractC59248NNc
    public final void LIZ(boolean z) {
        CommonAdData LIZ = this.LIZ.LIZ();
        if (LIZ instanceof AwemeRawAd) {
            C58655N0h LIZLLL = C58704N2e.LIZLLL(this.LJIIJJI, "open_url_h5", LIZ);
            LIZLLL.LIZIZ("lynx", "render_type");
            LIZLLL.LJI();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NOR(InterfaceC59247NNb taskContext, Bundle bundle) {
        super(taskContext, bundle);
        o.LJIIIZ(taskContext, "taskContext");
        this.LJJIZ = bundle.getLong("ad_id");
        String string = bundle.getString("render_type", "");
        o.LJIIIIZZ(string, "params.getString(RichTas…rams.KEY_RENDER_TYPE, \"\")");
        this.LJJJ = string;
        String string2 = bundle.getString("lynx_scheme", "");
        o.LJIIIIZZ(string2, "params.getString(RichTas…rams.KEY_LYNX_SCHEME, \"\")");
        this.LJJJI = string2;
        this.LJJJIL = bundle.getInt("lynx_landing_style");
        this.LJJJJ = bundle.getString("video_cover");
        this.LJJJJI = bundle.getString("lynx_channel_name");
        this.LJJJJIZL = bundle.getString("native_site_custom_data");
        this.LJJJJJ = bundle.getStringArrayList("second_page_preload_channels");
        String string3 = bundle.getString("key_native_site_ad_info", "");
        o.LJIIIIZZ(string3, "params.getString(RichTas…_NATIVE_SITE_AD_INFO, \"\")");
        this.LJJJJJL = string3;
        String string4 = bundle.getString("native_site_app_data", "");
        o.LJIIIIZZ(string4, "params.getString(RichTas…NATIVE_SITE_APP_DATA, \"\")");
        this.LJJJJL = string4;
    }
}
