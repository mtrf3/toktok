package com.ss.android.ugc.aweme.poi.experiment;

import X.C1NE;
import X.InterfaceC65349Pkn;
import X.X1D;
import com.bytedance.ies.abmock.SettingsManager;
import defpackage.q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public final class TiktokPoiLynxSettings {
    public static final TiktokPoiLynxModel LIZ = new TiktokPoiLynxModel(new ArrayList());

    /* loaded from: classes4.dex */
    public static final class LynxURLConfig {

        @InterfaceC65349Pkn("name")
        public final String name;

        @InterfaceC65349Pkn("url")
        public final String url;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LynxURLConfig)) {
                return false;
            }
            LynxURLConfig lynxURLConfig = (LynxURLConfig) obj;
            return o.LJ(this.url, lynxURLConfig.url) && o.LJ(this.name, lynxURLConfig.name);
        }

        public final int hashCode() {
            return this.name.hashCode() + (this.url.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LynxURLConfig(url=");
            LIZ.append(this.url);
            LIZ.append(", name=");
            return q.LIZIZ(LIZ, this.name, ')', LIZ);
        }

        public LynxURLConfig(String url, String name) {
            o.LJIIIZ(url, "url");
            o.LJIIIZ(name, "name");
            this.url = url;
            this.name = name;
        }
    }

    /* loaded from: classes4.dex */
    public static final class TiktokPoiLynxModel {

        @InterfaceC65349Pkn("lynx_url_config")
        public final List<LynxURLConfig> lynxURLConfig;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TiktokPoiLynxModel) && o.LJ(this.lynxURLConfig, ((TiktokPoiLynxModel) obj).lynxURLConfig);
        }

        public final int hashCode() {
            return this.lynxURLConfig.hashCode();
        }

        public final String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("TiktokPoiLynxModel(lynxURLConfig=");
            return C1NE.LIZIZ(LIZ, this.lynxURLConfig, ')', LIZ);
        }

        public TiktokPoiLynxModel(List<LynxURLConfig> lynxURLConfig) {
            o.LJIIIZ(lynxURLConfig, "lynxURLConfig");
            this.lynxURLConfig = lynxURLConfig;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:3:0x0007 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZ(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1992828759: goto L5d;
                case -1227652558: goto L51;
                case -61719317: goto L45;
                case 314601435: goto L39;
                case 412295788: goto L2d;
                case 883878462: goto L21;
                case 1054876338: goto L15;
                case 1117968728: goto L9;
                default: goto L7;
            }
        L7:
            r0 = 0
        L8:
            return r0
        L9:
            java.lang.String r0 = "poi_about"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L12
            goto L7
        L12:
            java.lang.String r0 = "aweme://lynxview/?channel=fe_poi_react_lynx&bundle=poi_about/template.js&use_spark=1&trans_status_bar=0&container_bg_color=f5f5f5&container_bg_color_light=f5f5f5&container_bg_color_dark=000000&dynamic=1&surl=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2F8%2Fgecko%2Fresource%2Ffe_poi_react_lynx%2Fpoi_about%2Ftemplate.js&hide_nav_bar=1&should_full_screen=1"
            goto L8
        L15:
            java.lang.String r0 = "poi_review_post"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L1e
            goto L7
        L1e:
            java.lang.String r0 = "aweme://lynxview/?channel=fe_poi_react_lynx&bundle=poi_review_post/template.js&use_spark=1&hide_nav_bar=1&hide_status_bar=0&trans_status_bar=1&should_full_screen=1&dynamic=1&surl=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2F8%2Fgecko%2Fresource%2Ffe_poi_react_lynx%2Fpoi_review_post%2Ftemplate.js"
            goto L8
        L21:
            java.lang.String r0 = "poi_discover"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L2a
            goto L7
        L2a:
            java.lang.String r0 = "aweme://lynxview/?channel=fe_poi_react_lynx&bundle=poi_discover/template.js&use_spark=1&hide_nav_bar=1&hide_status_bar=0&trans_status_bar=0&should_full_screen=1&dynamic=1&surl=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2F8%2Fgecko%2Fresource%2Ffe_poi_react_lynx%2Fpoi_discover%2Ftemplate.js"
            goto L8
        L2d:
            java.lang.String r0 = "poi_about_dtc"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L36
            goto L7
        L36:
            java.lang.String r0 = "aweme://lynxview/?channel=fe_poi_react_lynx&bundle=poi_about_dtc/template.js&use_spark=1&trans_status_bar=0&container_bg_color=f5f5f5&container_bg_color_light=f5f5f5&container_bg_color_dark=000000&dynamic=1&surl=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2F8%2Fgecko%2Fresource%2Ffe_poi_react_lynx%2Fpoi_about_dtc%2Ftemplate.js&hide_nav_bar=1&should_full_screen=1"
            goto L8
        L39:
            java.lang.String r0 = "poi_discover_map"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L42
            goto L7
        L42:
            java.lang.String r0 = "aweme://lynxview/?channel=fe_poi_react_lynx&bundle=poi_discover_map_mode/template.js&use_spark=1&_enter_from=places_discover_map_mode&_enable_stay_time_report=1&tabbar_height=44&dynamic=1&surl=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2F8%2Fgecko%2Fresource%2Ffe_poi_react_lynx%2Fpoi_discover_map_mode%2Ftemplate.js"
            goto L8
        L45:
            java.lang.String r0 = "poi_sug_edit_ugc"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L4e
            goto L7
        L4e:
            java.lang.String r0 = "aweme://lynxview/?channel=fe_poi_react_lynx&bundle=poi_sug_edit_ugc/template.js&use_spark=1&hide_nav_bar=1&keyboard_adjust=0&hide_status_bar=0&should_full_screen=1&container_bg_color=f5f5f5&container_bg_color_light=f5f5f5&container_bg_color_dark=000000&status_bar_color=f5f5f5&status_bar_color_light=f5f5f5&status_bar_color_dark=000000&dynamic=1&surl=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2F8%2Fgecko%2Fresource%2Ffe_poi_react_lynx%2Fpoi_sug_edit_ugc%2Ftemplate.js"
            goto L8
        L51:
            java.lang.String r0 = "poi_store_detail_lynx"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L5a
            goto L7
        L5a:
            java.lang.String r0 = "aweme://lynxview/?channel=fe_poi_react_lynx&bundle=poi_store_detail/template.js&use_spark=1&trans_status_bar=0&container_bg_color=f5f5f5&container_bg_color_light=f5f5f5&container_bg_color_dark=000000&nav_bar_color_light=f5f5f5&nav_bar_color_dark=000000&nav_bar_color=f5f5f5&title_color=161823&title_color_light=161823&title_color_dark=ffffff&hide_nav_bar_bottom_line=1&status_bar_color=f5f5f5&status_bar_color_light=f5f5f5&status_bar_color_dark=000000&should_full_screen=1&dynamic=1&surl=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2F8%2Fgecko%2Fresource%2Ffe_poi_react_lynx%2Fpoi_store_detail%2Ftemplate.js"
            goto L8
        L5d:
            java.lang.String r0 = "poi_claim_store"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L66
            goto L7
        L66:
            java.lang.String r0 = "aweme://lynxview/?bundle=pages%2Fba%2Ftemplate.js&channel=fe_poi_ba_lynx&dynamic=3&enable_canvas=1&group=ba_poi&hide_nav_bar=1&hide_status_bar=0&pageModule=poi&poiPath=list&status_bar_color=00000000&surl=https%3A%2F%2Flf19-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2F8%2Fgecko%2Fresource%2Ffe_poi_ba_lynx%2Fpages%2Fba%2Ftemplate.js&trans_status_bar=1&use_bdx=0&use_spark=1&webview_clear_color=0"
            goto L8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.experiment.TiktokPoiLynxSettings.LIZ(java.lang.String):java.lang.String");
    }

    public static String LIZIZ(String str) {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        TiktokPoiLynxModel tiktokPoiLynxModel = LIZ;
        TiktokPoiLynxModel tiktokPoiLynxModel2 = (TiktokPoiLynxModel) LIZLLL.LJIIIIZZ("tiktok_poi_lynx", TiktokPoiLynxModel.class, tiktokPoiLynxModel);
        if (tiktokPoiLynxModel2 != null) {
            tiktokPoiLynxModel = tiktokPoiLynxModel2;
        }
        List<LynxURLConfig> list = tiktokPoiLynxModel.lynxURLConfig;
        if (list != null && !list.isEmpty()) {
            for (LynxURLConfig lynxURLConfig : list) {
                if (o.LJ(lynxURLConfig.name, str)) {
                    String str2 = lynxURLConfig.url;
                    if (str2.length() == 0) {
                        return LIZ(str);
                    }
                    return str2;
                }
            }
        }
        return LIZ(str);
    }
}
