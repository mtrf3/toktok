package X;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.rich.model.CommonAdData;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.landpage.AdLandPageServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes11.dex */
public abstract class NOS extends AbstractC59249NNd {
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final boolean LJFF;
    public final int LJI;
    public final String LJII;
    public final long LJIIIIZZ;
    public final String LJIIIZ;
    public final long LJIIJ;
    public final String LJIIJJI;
    public final String LJIIL;
    public final int LJIILIIL;
    public final String LJIILJJIL;
    public final boolean LJIILL;
    public final String LJIILLIIL;
    public final String LJIIZILJ;
    public final String LJIJ;
    public final String LJIJI;
    public final String LJIJJ;
    public final String LJIJJLI;
    public final int LJIL;
    public final int LJJ;
    public final boolean LJJI;
    public final String LJJIFFI;
    public final String LJJII;
    public final boolean LJJIII;
    public final String LJJIIJ;
    public final String LJJIIJZLJL;
    public final String LJJIIZ;
    public final boolean LJJIIZI;
    public final String LJJIJ;
    public final int LJJIJIIJI;
    public final int LJJIJIIJIL;
    public final int LJJIJIL;
    public final boolean LJJIJL;
    public final int LJJIJLIJ;
    public final String LJJIL;

    public final Intent LIZLLL() {
        String str;
        C59280NOi c59280NOi = C59280NOi.LIZIZ;
        Intent LJIIL = c59280NOi.LJIIL(this.LIZIZ);
        LJIIL.setData(UriProtector.parse(this.LIZJ));
        boolean z = true;
        if (!TextUtils.isEmpty(this.LJ)) {
            LJIIL.putExtra("title", this.LJ);
        } else {
            LJIIL.putExtra("title", " ");
            LJIIL.putExtra("use_webview_title", true);
        }
        LJIIL.putExtra("show_report", this.LJFF);
        if (!TextUtils.isEmpty(this.LJIIIZ)) {
            LJIIL.putExtra("bundle_download_app_log_extra", this.LJIIIZ);
        }
        LJIIL.putExtra("bundle_app_ad_from", this.LJI);
        String str2 = this.LJII;
        if (str2 != null) {
            LJIIL.putExtra("enter_from", str2);
        }
        long j = this.LJIIIIZZ;
        if (j != 0) {
            LJIIL.putExtra("ad_id", j);
            LJIIL.putExtra("ad_type", this.LJIIL);
            LJIIL.putExtra("ad_system_origin", this.LJIILIIL);
            LJIIL.putExtra("bundle_download_app_extra", String.valueOf(this.LJIIIIZZ));
            LJIIL.putExtra("landing_page_info", this.LJIILJJIL);
        }
        String LJ = c59280NOi.LJ();
        if (!TextUtils.isEmpty(LJ)) {
            LJIIL.putExtra("ad_js_url", LJ);
        }
        LJIIL.putExtra("bundle_disable_download_dialog", this.LJIILL);
        if (!TextUtils.isEmpty(this.LJIILLIIL)) {
            LJIIL.putExtra("bundle_is_from_app_ad", true);
            LJIIL.putExtra("bundle_download_url", this.LJIILLIIL);
            LJIIL.putExtra("aweme_package_name", this.LJIIZILJ);
            LJIIL.putExtra("bundle_ad_quick_app_url", this.LJIJ);
            boolean isEmpty = TextUtils.isEmpty(this.LJIJI);
            if (isEmpty) {
                str = this.LJIJJLI;
            } else if (!isEmpty) {
                str = this.LJIJI;
            } else {
                throw new C162476Zf();
            }
            LJIIL.putExtra("bundle_download_app_name", str);
            LJIIL.putExtra("bundle_download_mode", this.LJIL);
            LJIIL.putExtra("bundle_link_mode", this.LJJ);
            LJIIL.putExtra("bundle_support_multiple_download", this.LJJI);
            LJIIL.putExtra("bundle_web_url", this.LJIJJ);
            LJIIL.putExtra("bundle_web_title", this.LJIJJLI);
            String str3 = this.LJJIFFI;
            if (str3 != null && s.LJJJLZIJ(str3, "__back_url__", false)) {
                String builder = UriProtector.parse(NO2.LIZ).buildUpon().toString();
                o.LJIIIIZZ(builder, "backUrlBuilder.toString()");
                str3 = ujb.o.LJJJJZ(str3, "__back_url__", builder, false);
            }
            LJIIL.putExtra("bundle_open_url", str3);
        }
        LJIIL.putExtra("aweme_json_extra", this.LJJII);
        long j2 = this.LJIIJ;
        if (j2 != 0) {
            LJIIL.putExtra("aweme_group_id", String.valueOf(j2));
        }
        long j3 = this.LJIIIIZZ;
        if (j3 != 0) {
            LJIIL.putExtra("aweme_creative_id", String.valueOf(j3));
        }
        if (!TextUtils.isEmpty(this.LJIIZILJ)) {
            LJIIL.putExtra("aweme_package_name", this.LJIIZILJ);
        }
        if (this.LJJIII) {
            LJIIL.putExtra("bundle_webview_background", C78609UtB.LJJJ(R.attr.cl, this.LIZIZ));
        } else {
            LJIIL.putExtra("bundle_webview_background", -1);
        }
        LJIIL.putExtra("aweme_id", this.LJJIIJZLJL);
        LJIIL.putExtra("owner_id", this.LJJIIZ);
        LJIIL.putExtra("bundle_forbidden_jump", true);
        LJIIL.putExtra("use_ordinary_web", this.LJJIIZI);
        LJIIL.addFlags(268435456);
        LJIIL.putExtra("preload_channel_name", this.LJJIIJ);
        LJIIL.putExtra("preload_scene", "feed");
        LJIIL.putExtra("preload_web_status", this.LJJIJIIJI);
        LJIIL.putExtra("preload_is_web_url", this.LJJIJIIJIL);
        LJIIL.putExtra("web_type", this.LJJIJIL);
        LJIIL.putExtra("enable_web_report", this.LJJIJL);
        if (this.LJJIJLIJ != 1) {
            z = false;
        }
        LJIIL.putExtra("webview_progress_bar", z);
        LJIIL.putExtra("commerce_enter_from", this.LJJIL);
        CommonAdData LIZ = this.LIZ.LIZ();
        if (LIZ instanceof AwemeRawAd) {
            C59082NGs.LIZ = (AwemeRawAd) LIZ;
        }
        return LJIIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NOS(InterfaceC59247NNb taskContext, Bundle bundle) {
        super(taskContext, bundle);
        o.LJIIIZ(taskContext, "taskContext");
        String string = bundle.getString("real_web_url", "");
        o.LJIIIIZZ(string, "params.getString(RichTas…ams.KEY_REAL_WEB_URL, \"\")");
        this.LIZJ = string;
        AdLandPageServiceImpl.LIZIZ().LIZ();
        this.LIZLLL = "ad_commerce";
        this.LJ = bundle.getString("title");
        this.LJFF = bundle.getBoolean("show_report");
        this.LJI = bundle.getInt("app_ad_from");
        this.LJII = bundle.getString("enter_from");
        this.LJIIIIZZ = bundle.getLong("creative_id", 0L);
        String string2 = bundle.getString("log_extra", "");
        o.LJIIIIZZ(string2, "params.getString(RichTaskParams.KEY_LOG_EXTRA, \"\")");
        this.LJIIIZ = string2;
        this.LJIIJ = bundle.getLong("group_id", 0L);
        String string3 = bundle.getString("log_tag", "draw_ad");
        o.LJIIIIZZ(string3, "params.getString(RichTas…cializeMob.Event.DRAW_AD)");
        this.LJIIJJI = string3;
        this.LJIIL = bundle.getString("ad_type");
        this.LJIILIIL = bundle.getInt("ad_system_origin");
        this.LJIILJJIL = bundle.getString("landing_page_info");
        this.LJIILL = bundle.getBoolean("disable_download_dialog");
        this.LJIILLIIL = bundle.getString("download_url");
        this.LJIIZILJ = bundle.getString("aweme_package_name");
        this.LJIJ = bundle.getString("ad_quick_app_url");
        this.LJIJI = bundle.getString("download_app_name");
        String string4 = bundle.getString("web_url", "");
        o.LJIIIIZZ(string4, "params.getString(RichTaskParams.KEY_WEB_URL, \"\")");
        this.LJIJJ = string4;
        this.LJIJJLI = bundle.getString("web_title");
        this.LJIL = bundle.getInt("download_mode");
        this.LJJ = bundle.getInt("link_mode");
        this.LJJI = bundle.getBoolean("support_multiple_download");
        String string5 = bundle.getString("open_url", "");
        o.LJIIIIZZ(string5, "params.getString(RichTaskParams.KEY_OPEN_URL, \"\")");
        this.LJJIFFI = string5;
        String string6 = bundle.getString("aweme_json_extra", "");
        o.LJIIIIZZ(string6, "params.getString(RichTas…KEY_AWEME_JSON_EXTRA, \"\")");
        this.LJJII = string6;
        this.LJJIII = bundle.getBoolean("use_default_color");
        this.LJJIIJ = bundle.getString("channel_name");
        String string7 = bundle.getString("aweme_id", "");
        o.LJIIIIZZ(string7, "params.getString(RichTaskParams.KEY_AWEME_ID, \"\")");
        this.LJJIIJZLJL = string7;
        String string8 = bundle.getString("owner_id", "");
        o.LJIIIIZZ(string8, "params.getString(RichTaskParams.KEY_OWNER_ID, \"\")");
        this.LJJIIZ = string8;
        this.LJJIIZI = bundle.getBoolean("use_ordinary_web");
        String string9 = bundle.getString("site_id", "");
        o.LJIIIIZZ(string9, "params.getString(RichTaskParams.KEY_SITE_ID, \"\")");
        this.LJJIJ = string9;
        this.LJJIJIIJI = bundle.getInt("preload_web_status");
        this.LJJIJIIJIL = bundle.getInt("preload_is_web_url");
        this.LJJIJIL = bundle.getInt("web_type");
        this.LJJIJL = bundle.getBoolean("enable_web_report");
        this.LJJIJLIJ = bundle.getInt("webview_progress_bar");
        String string10 = bundle.getString("commerce_enter_from", "feedad");
        o.LJIIIIZZ(string10, "params.getString(RichTas…FROM, WebUrlTask.FEED_AD)");
        this.LJJIL = string10;
    }
}
