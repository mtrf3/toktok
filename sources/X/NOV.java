package X;

import java.util.List;

/* loaded from: classes11.dex */
public final class NOV extends C59472NVs {
    public final NP0 LJJJJI = new NP0("ad_id", 0);
    public final NP0 LJJJJIZL = new NP0("bundle_real_ad_id", 0);
    public final C59478NVy LJJJJJ;
    public final C59296NOy LJJJJJL;
    public final C59296NOy LJJJJL;
    public final C59478NVy LJJJJLI;
    public final C59478NVy LJJJJLL;
    public final C59478NVy LJJJJZ;
    public final C59478NVy LJJJJZI;
    public final C59478NVy LJJJLIIL;
    public final C59478NVy LJJJLL;
    public final C59478NVy LJJJLZIJ;
    public final C59478NVy LJJJZ;
    public final C59478NVy LJJL;
    public final C59297NOz LJJLI;
    public final C59296NOy LJJLIIIIJ;
    public final C59296NOy LJJLIIIJ;
    public final C59296NOy LJJLIIIJILLIZJL;
    public final C59297NOz LJJLIIIJJI;
    public final C59297NOz LJJLIIIJJIZ;
    public final C59296NOy LJJLIIIJL;
    public final C59297NOz LJJLIIIJLJLI;
    public final C59478NVy LJJLIIIJLLLLLLLZ;
    public final C59478NVy LJJLIIJ;
    public final C59297NOz LJJLIL;
    public final C59478NVy LJJLJ;
    public final C59478NVy LJJLJLI;
    public final C59478NVy LJJLL;
    public final C59478NVy LJJZ;
    public final C59478NVy LJJZZI;
    public final C59478NVy LJJZZIII;
    public final C59478NVy LJL;
    public final C59296NOy LJLI;
    public final C59296NOy LJLIIIL;
    public final C59478NVy LJLIIL;
    public final C59478NVy LJLIL;
    public final C59478NVy LJLILLLLZI;
    public final C59478NVy LJLJI;
    public final C59296NOy LJLJJI;
    public final C59297NOz LJLJJL;
    public final C59478NVy LJLJJLL;
    public final C59296NOy LJLJL;
    public final C59478NVy LJLJLJ;
    public final C59297NOz LJLJLLL;
    public final NP0 LJLL;
    public final NP0 LJLLI;
    public final C59478NVy LJLLILLLL;

    public final long LIZLLL() {
        Long value = this.LJJJJI.getValue();
        if (value != null) {
            return value.longValue();
        }
        return 0L;
    }

    public final String LJ() {
        String str = (String) this.LJJJJJ.getValue();
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String LJFF() {
        String str = (String) this.LJJJJLI.getValue();
        if (str == null) {
            return "";
        }
        return str;
    }

    public NOV() {
        C113444cm c113444cm = C73442uS.LJ;
        this.LJJJJJ = new C59478NVy("aweme_group_id", c113444cm, null);
        this.LJJJJJL = new C59296NOy("ad_system_origin", 0);
        this.LJJJJL = new C59296NOy("charge_type", 0);
        this.LJJJJLI = new C59478NVy("bundle_download_app_log_extra", c113444cm, null);
        this.LJJJJLL = new C59478NVy("bundle_download_url", c113444cm, null);
        this.LJJJJZ = new C59478NVy("aweme_package_name", c113444cm, null);
        this.LJJJJZI = new C59478NVy("bundle_download_app_name", c113444cm, null);
        this.LJJJLIIL = new C59478NVy("bundle_open_url", c113444cm, null);
        this.LJJJLL = new C59478NVy("bundle_web_url", c113444cm, null);
        this.LJJJLZIJ = new C59478NVy("bundle_ad_quick_app_url", c113444cm, null);
        this.LJJJZ = new C59478NVy("ad_type", c113444cm, null);
        this.LJJL = new C59478NVy("bundle_web_title", c113444cm, null);
        this.LJJLI = new C59297NOz("show_report", false);
        this.LJJLIIIIJ = new C59296NOy("web_type", 0);
        this.LJJLIIIJ = new C59296NOy("bundle_download_mode", 0);
        this.LJJLIIIJILLIZJL = new C59296NOy("bundle_link_mode", 0);
        this.LJJLIIIJJI = new C59297NOz("bundle_support_multiple_download", false);
        this.LJJLIIIJJIZ = new C59297NOz("bundle_disable_download_dialog", true);
        this.LJJLIIIJL = new C59296NOy("bundle_webview_background", -2);
        this.LJJLIIIJLJLI = new C59297NOz("bundle_nav_bar_status_padding", false);
        this.LJJLIIIJLLLLLLLZ = new C59478NVy("track_url_list", c113444cm, null);
        this.LJJLIIJ = new C59478NVy("second_page_preload_channel_prefix", c113444cm, null);
        this.LJJLIL = new C59297NOz("bundle_show_lynx_bottom_label", false);
        this.LJJLJ = new C59478NVy("bundle_lynx_bottom_label_template_url", c113444cm, null);
        this.LJJLJLI = new C59478NVy("bundle_lynx_bottom_label_data", c113444cm, null);
        this.LJJLL = new C59478NVy("bundle_full_screen_bg_image", c113444cm, null);
        this.LJJZ = new C59478NVy("bundle_native_site_custom_data", c113444cm, null);
        this.LJJZZI = new C59478NVy("aweme_id", c113444cm, null);
        this.LJJZZIII = new C59478NVy("owner_id", c113444cm, null);
        this.LJL = new C59478NVy("landing_page_info", c113444cm, null);
        this.LJLI = new C59296NOy("preload_web_status", 0);
        this.LJLIIIL = new C59296NOy("preload_is_web_url", 0);
        this.LJLIIL = new C59478NVy("preload_channel_name", c113444cm, null);
        this.LJLIL = new C59478NVy("bundle_second_page_gecko_channels", C73442uS.LJFF, null);
        this.LJLILLLLZI = new C59478NVy("bundle_extra_param", c113444cm, null);
        this.LJLJI = new C59478NVy("page_id", c113444cm, null);
        this.LJLJJI = new C59296NOy("preload_web_second_page", 0);
        this.LJLJJL = new C59297NOz("ad_landing_show_landing_page_survey", false);
        this.LJLJJLL = new C59478NVy("browser_config", c113444cm, null);
        this.LJLJL = new C59296NOy("is_nine_screen", 0);
        this.LJLJLJ = new C59478NVy("req_id", c113444cm, null);
        this.LJLJLLL = new C59297NOz("ad_landing_enable_landing_page_survey", false);
        this.LJLL = new NP0("ad_landing_show_survey_time_interval", 0L);
        this.LJLLI = new NP0("ad_landing_page_dwell_time", 0L);
        this.LJLLILLLL = new C59478NVy("ad_landing_page_schema_url", c113444cm, null);
    }

    @Override // X.C59472NVs, X.C59474NVu, X.AbstractC59475NVv
    public final List<InterfaceC59479NVz<?>> LIZ() {
        return ORZ.LLIIIZ(C47261Igj.LJJIJIIJI(this.LJJJJI, this.LJJJJIZL, this.LJJJJJ, this.LJJJJJL, this.LJJJJL, this.LJJJJLI, this.LJJJJLL, this.LJJJJZ, this.LJJJJZI, this.LJJJLIIL, this.LJJJLL, this.LJJJLZIJ, this.LJJJZ, this.LJJL, this.LJJLI, this.LJJLIIIIJ, this.LJJLIIIJ, this.LJJLIIIJILLIZJL, this.LJJLIIIJJI, this.LJJLIIIJJIZ, this.LJJLIIIJL, this.LJJLIIIJLJLI, this.LJJLIIIJLLLLLLLZ, this.LJJLIIJ, this.LJJLIL, this.LJJLJ, this.LJJLJLI, this.LJJLL, this.LJJZ, this.LJJZZI, this.LJJZZIII, this.LJL, this.LJLI, this.LJLIIIL, this.LJLIIL, this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLLILLLL), super.LIZ());
    }
}
