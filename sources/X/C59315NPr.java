package X;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Locale;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.NPr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59315NPr {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(android.net.Uri uri, Intent intent, C59314NPq crossPlatformParams) {
        Uri.Builder appendQueryParameter;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        int i;
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(intent, "intent");
        o.LJIIIZ(crossPlatformParams, "crossPlatformParams");
        String host = uri.getHost();
        boolean z = false;
        if (host != null && s.LJJJLZIJ(host, "webview", false)) {
            z = true;
        }
        if (z && UriProtector.getQueryParameter(uri, "url") != null) {
            appendQueryParameter = uri.buildUpon();
            o.LJIIIIZZ(appendQueryParameter, "uri.buildUpon()");
        } else {
            appendQueryParameter = new Uri.Builder().scheme("aweme").authority("webview").appendQueryParameter("url", uri.toString());
            o.LJIIIIZZ(appendQueryParameter, "Builder().scheme(\"aweme\"…er(\"url\", uri.toString())");
        }
        boolean z2 = crossPlatformParams.LIZ.LIZLLL;
        String str14 = CardStruct.IStatusCode.DEFAULT;
        if (z2) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        appendQueryParameter.appendQueryParameter("append_common_params", str);
        if (crossPlatformParams.LIZ.LJI) {
            str2 = "1";
        } else {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        appendQueryParameter.appendQueryParameter("auto_play_bgm", str2);
        if (crossPlatformParams.LIZ.LJIIJJI) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        appendQueryParameter.appendQueryParameter("disable_hardware_accelerate", str3);
        if (crossPlatformParams.LIZ.LJIILIIL) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        appendQueryParameter.appendQueryParameter("hide_system_video_poster", str4);
        appendQueryParameter.appendQueryParameter("page_depth_of_report_show", String.valueOf(crossPlatformParams.LIZ.LJIILL));
        if (crossPlatformParams.LIZJ.LIZ) {
            str5 = "1";
        } else {
            str5 = CardStruct.IStatusCode.DEFAULT;
        }
        appendQueryParameter.appendQueryParameter("forbidden_anim", str5);
        if (crossPlatformParams.LIZJ.LIZIZ) {
            str6 = "dark";
        } else {
            str6 = "light";
        }
        appendQueryParameter.appendQueryParameter("status_font_mode", str6);
        String str15 = crossPlatformParams.LIZJ.LJ;
        String str16 = "";
        if (o.LJ("null", str15) || str15 == null) {
            str15 = "";
        }
        appendQueryParameter.appendQueryParameter("title", str15);
        String hexString = Integer.toHexString(crossPlatformParams.LIZJ.LJFF);
        o.LJIIIIZZ(hexString, "toHexString(crossPlatfor…arams.uiInfo.navBarColor)");
        Locale locale = Locale.ROOT;
        String upperCase = hexString.toUpperCase(locale);
        o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        appendQueryParameter.appendQueryParameter("nav_bar_color", C59976NgK.LIZIZ(upperCase));
        String hexString2 = Integer.toHexString(crossPlatformParams.LIZJ.LJFF);
        o.LJIIIIZZ(hexString2, "toHexString(crossPlatfor…arams.uiInfo.navBarColor)");
        String upperCase2 = hexString2.toUpperCase(locale);
        o.LJIIIIZZ(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        appendQueryParameter.appendQueryParameter("loading_bg_color", C59976NgK.LIZIZ(upperCase2));
        String hexString3 = Integer.toHexString(crossPlatformParams.LIZJ.LJII);
        o.LJIIIIZZ(hexString3, "toHexString(crossPlatformParams.uiInfo.titleColor)");
        String upperCase3 = hexString3.toUpperCase(locale);
        o.LJIIIIZZ(upperCase3, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        appendQueryParameter.appendQueryParameter("title_color", C59976NgK.LIZIZ(upperCase3));
        C59309NPl c59309NPl = crossPlatformParams.LIZJ;
        if (c59309NPl.LJIIIIZZ) {
            appendQueryParameter.appendQueryParameter("show_closeall", "1");
        } else {
            String str17 = c59309NPl.LJIIJ;
            if (o.LJ(str17, "1")) {
                str16 = "1";
            } else if (o.LJ(str17, CardStruct.IStatusCode.DEFAULT)) {
                str16 = CardStruct.IStatusCode.DEFAULT;
            }
            appendQueryParameter.appendQueryParameter("show_closeall", str16);
        }
        String hexString4 = Integer.toHexString(crossPlatformParams.LIZJ.LJIILJJIL);
        o.LJIIIIZZ(hexString4, "toHexString(crossPlatfor….uiInfo.containerBgColor)");
        String upperCase4 = hexString4.toUpperCase(locale);
        o.LJIIIIZZ(upperCase4, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        appendQueryParameter.appendQueryParameter("container_bg_color", upperCase4);
        if (crossPlatformParams.LIZJ.LJIIZILJ) {
            str7 = "1";
        } else {
            str7 = CardStruct.IStatusCode.DEFAULT;
        }
        appendQueryParameter.appendQueryParameter("trans_status_bar", str7);
        if (crossPlatformParams.LIZJ.LJIJ) {
            str8 = "1";
        } else {
            str8 = CardStruct.IStatusCode.DEFAULT;
        }
        appendQueryParameter.appendQueryParameter("hide_nav_bar", str8);
        if (crossPlatformParams.LIZJ.LJIJI) {
            str9 = "1";
        } else {
            str9 = CardStruct.IStatusCode.DEFAULT;
        }
        appendQueryParameter.appendQueryParameter("hide_status_bar", str9);
        String hexString5 = Integer.toHexString(crossPlatformParams.LIZJ.LJIJJ);
        o.LJIIIIZZ(hexString5, "toHexString(crossPlatfor…ms.uiInfo.statusBarColor)");
        String upperCase5 = hexString5.toUpperCase(locale);
        o.LJIIIIZZ(upperCase5, "this as java.lang.String).toUpperCase(Locale.ROOT)");
        appendQueryParameter.appendQueryParameter("status_bar_bg_color", C59976NgK.LIZIZ(upperCase5));
        if (crossPlatformParams.LIZJ.LJIL) {
            str10 = "1";
        } else {
            str10 = CardStruct.IStatusCode.DEFAULT;
        }
        appendQueryParameter.appendQueryParameter("use_webview_title", str10);
        if (!crossPlatformParams.LIZJ.LJJIFFI) {
            str11 = "1";
        } else {
            str11 = CardStruct.IStatusCode.DEFAULT;
        }
        appendQueryParameter.appendQueryParameter("hide_loading", str11);
        if (crossPlatformParams.LIZJ.LJJIIJ) {
            str12 = "auto";
        } else {
            str12 = "portrait";
        }
        appendQueryParameter.appendQueryParameter("screen_orientation", str12);
        if (crossPlatformParams.LIZJ.LJJIIJZLJL) {
            str13 = "1";
        } else {
            str13 = CardStruct.IStatusCode.DEFAULT;
        }
        appendQueryParameter.appendQueryParameter("show_nav_bar_in_trans_status_bar", str13);
        if (crossPlatformParams.LIZJ.LJJIIZI) {
            str14 = "1";
        }
        appendQueryParameter.appendQueryParameter("show_separate_line", str14);
        appendQueryParameter.appendQueryParameter("ignore_cache_policy", crossPlatformParams.LIZLLL.LIZ);
        C59309NPl c59309NPl2 = crossPlatformParams.LIZJ;
        if (c59309NPl2.LIZLLL || c59309NPl2.LJJII == 1 || !TextUtils.isEmpty(crossPlatformParams.LIZ.LJIILJJIL)) {
            appendQueryParameter.appendQueryParameter("nav_btn_type", "report");
            if (crossPlatformParams.LIZJ.LJJII == 1) {
                appendQueryParameter.appendQueryParameter("legacy_report", "1");
            }
        } else {
            C59309NPl c59309NPl3 = crossPlatformParams.LIZJ;
            if (!c59309NPl3.LIZJ && ((i = c59309NPl3.LJJII) == 2 || i == 0 || i == -1)) {
                appendQueryParameter.appendQueryParameter("nav_btn_type", "share");
            }
        }
        String uri2 = appendQueryParameter.build().toString();
        o.LJIIIIZZ(uri2, "sparkSchemaUriBuilder.build().toString()");
        return uri2;
    }
}
