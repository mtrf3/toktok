package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveAudienceLinkmicLowestAgeSetting;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import defpackage.a1;
import defpackage.i0;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes10.dex */
public abstract class M6P {
    public abstract android.net.Uri LIZ(android.net.Uri uri);

    public static android.net.Uri LIZIZ(int i, android.net.Uri uri, String str, String patterUrl) {
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        C75552xr c75552xr;
        String[] strArr;
        String LJFF;
        String str9;
        String str10;
        String queryParameter;
        android.net.Uri parse;
        o.LJIIIZ(patterUrl, "patterUrl");
        if (TextUtils.isEmpty(str) && i != 9 && i != 14 && i != 15 && i != 16 && i != 21 && i != 22 && i != 28 && i != 36 && i != 29 && i != 31 && i != 35 && i != 32 && i != 37) {
            return null;
        }
        String str11 = "";
        switch (i) {
            case 0:
                StringBuilder LIZ = X1D.LIZ();
                str11 = C025908h.LIZIZ(LIZ, "musically", "://detail?id=", str, LIZ);
                break;
            case 1:
                StringBuilder LIZ2 = X1D.LIZ();
                str11 = C025908h.LIZIZ(LIZ2, "musically", "://live?room_id=", str, LIZ2);
                break;
            case 2:
                StringBuilder LIZ3 = X1D.LIZ();
                str11 = C025908h.LIZIZ(LIZ3, "musically", "://profile?unique_id=", str, LIZ3);
                break;
            case 3:
                StringBuilder LIZ4 = X1D.LIZ();
                str11 = C025908h.LIZIZ(LIZ4, "musically", "://challenge/detail/", str, LIZ4);
                break;
            case 4:
                StringBuilder LIZ5 = X1D.LIZ();
                str11 = C025908h.LIZIZ(LIZ5, "musically", "://music/detail/", str, LIZ5);
                break;
            case 5:
                StringBuilder LIZ6 = X1D.LIZ();
                str11 = C025908h.LIZIZ(LIZ6, "musically", "://stickers/detail/", str, LIZ6);
                break;
            case 6:
                StringBuilder LIZ7 = X1D.LIZ();
                str11 = C025908h.LIZIZ(LIZ7, "musically", "://profile?id=", str, LIZ7);
                if (uri != null) {
                    String queryParameter2 = UriProtector.getQueryParameter(uri, "sec_uid");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        str11 = a1.LJ(str11, "&sec_uid=", queryParameter2);
                        break;
                    }
                }
                break;
            case 7:
                StringBuilder LIZ8 = X1D.LIZ();
                str11 = C025908h.LIZIZ(LIZ8, "musically", "://item?id=", str, LIZ8);
                break;
            case 8:
                StringBuilder LIZ9 = X1D.LIZ();
                str11 = C025908h.LIZIZ(LIZ9, "musically", "://tag?id=", str, LIZ9);
                break;
            case 9:
                StringBuilder LIZ10 = X1D.LIZ();
                str11 = C025908h.LIZIZ(LIZ10, "musically", "://game?game_id=", str, LIZ10);
                break;
            case 10:
                StringBuilder LIZ11 = X1D.LIZ();
                str11 = C025908h.LIZIZ(LIZ11, "musically", "://mix_video/detail/", str, LIZ11);
                break;
            case 12:
                String LJIILIIL = C30591Hz.LJIILIIL(String.valueOf(uri), "id");
                if (!TextUtils.isEmpty(LJIILIIL)) {
                    String LJIILIIL2 = C30591Hz.LJIILIIL(String.valueOf(uri), "edition_uid");
                    StringBuilder LIZ12 = X1D.LIZ();
                    YE1.LIZLLL(LIZ12, "musically", "://search/trending?type=", LJIILIIL, "&trending=");
                    LIZ12.append(LJIILIIL2);
                    str11 = X1D.LIZIZ(LIZ12);
                    break;
                }
                break;
            case ABRConfig.ABR_STARTUP_MAX_BITRATE /* 13 */:
                StringBuilder LIZ13 = X1D.LIZ();
                YE1.LIZLLL(LIZ13, "musically", "://challenge/detail?id=", str, "&group=0&is_commerce=1");
                str11 = X1D.LIZIZ(LIZ13);
                break;
            case 15:
                String LJIILIIL3 = C30591Hz.LJIILIIL(String.valueOf(uri), "object_id");
                StringBuilder LIZ14 = X1D.LIZ();
                str11 = C025908h.LIZIZ(LIZ14, "musically", "://goods/shop/?uid=", LJIILIIL3, LIZ14);
                break;
            case LiveAudienceLinkmicLowestAgeSetting.DEFAULT /* 16 */:
                String LJIILIIL4 = C30591Hz.LJIILIIL(String.valueOf(uri), "object_id");
                StringBuilder LIZ15 = X1D.LIZ();
                str11 = C025908h.LIZIZ(LIZ15, "musically", "://openRecord?recordParam=sticker&id=", LJIILIIL4, LIZ15);
                break;
            case 17:
                StringBuilder LIZ16 = X1D.LIZ();
                LIZ16.append("musically");
                LIZ16.append("://webview");
                str11 = UriProtector.parse(X1D.LIZIZ(LIZ16)).buildUpon().appendQueryParameter("url", String.valueOf(uri)).build().toString();
                break;
            case 18:
                StringBuilder LIZ17 = X1D.LIZ();
                str11 = C025908h.LIZIZ(LIZ17, "musically", "://live?unique_id=", str, LIZ17);
                break;
            case 19:
                StringBuilder LIZ18 = X1D.LIZ();
                str11 = C025908h.LIZIZ(LIZ18, "musically", "://messages/group?invite_id=", str, LIZ18);
                break;
            case 20:
                StringBuilder LIZ19 = X1D.LIZ();
                str11 = JBR.LJFF(LIZ19, "musically", "://search?", LIZ19);
                break;
            case 21:
                if (uri != null) {
                    str11 = UriProtector.getQueryParameter(uri, "af_dp");
                    break;
                } else {
                    str11 = null;
                    break;
                }
            case 22:
                StringBuilder LIZ20 = X1D.LIZ();
                LIZ20.append("musically");
                LIZ20.append("://feed?");
                Uri.Builder buildUpon = UriProtector.parse(X1D.LIZIZ(LIZ20)).buildUpon();
                if (uri != null) {
                    str2 = UriProtector.getQueryParameter(uri, "invitation_code");
                } else {
                    str2 = null;
                }
                Uri.Builder appendQueryParameter = buildUpon.appendQueryParameter("invitation_code", str2);
                if (uri != null) {
                    str3 = UriProtector.getQueryParameter(uri, "inviter_uid");
                } else {
                    str3 = null;
                }
                Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("inviter_uid", str3);
                if (uri != null) {
                    str4 = UriProtector.getQueryParameter(uri, "inviter_sec_uid");
                } else {
                    str4 = null;
                }
                str11 = appendQueryParameter2.appendQueryParameter("inviter_sec_uid", str4).build().toString();
                break;
            case 24:
                StringBuilder LIZ21 = X1D.LIZ();
                LIZ21.append("musically");
                LIZ21.append("://search?");
                Uri.Builder appendQueryParameter3 = UriProtector.parse(X1D.LIZIZ(LIZ21)).buildUpon().appendQueryParameter("keyword", str);
                if (uri == null || (str5 = UriProtector.getQueryParameter(uri, "enter_from")) == null) {
                    str5 = "search_engine";
                }
                Uri.Builder appendQueryParameter4 = appendQueryParameter3.appendQueryParameter("enter_from", str5);
                if (uri == null || (str6 = UriProtector.getQueryParameter(uri, "enter_method")) == null) {
                    str6 = "click_open";
                }
                str11 = appendQueryParameter4.appendQueryParameter("enter_method", str6).appendQueryParameter("set_hint_by_sug_word", "1").build().toString();
                break;
            case 25:
                StringBuilder LIZ22 = X1D.LIZ();
                str11 = C025908h.LIZIZ(LIZ22, "musically", "://assmusic/category?cid=", str, LIZ22);
                break;
            case 26:
                ArrayList arrayList = new ArrayList();
                if (str != null) {
                    arrayList.add(str);
                }
                HashMap hashMap = new HashMap();
                hashMap.put("product_id", arrayList);
                StringBuilder LIZ23 = X1D.LIZ();
                LIZ23.append("musically");
                LIZ23.append("://ec/pdp?");
                Uri.Builder appendQueryParameter5 = UriProtector.parse(X1D.LIZIZ(LIZ23)).buildUpon().appendQueryParameter("requestParams", GsonProtectorUtils.toJson(GsonHolder.LIZLLL().LIZ(), hashMap));
                if (uri != null) {
                    str7 = UriProtector.getQueryParameter(uri, "trackParams");
                } else {
                    str7 = null;
                }
                str11 = appendQueryParameter5.appendQueryParameter("trackParams", str7).toString();
                break;
            case 27:
                StringBuilder LIZ24 = X1D.LIZ();
                str11 = C025908h.LIZIZ(LIZ24, "musically", "://mix/detail?id=", str, LIZ24);
                break;
            case 28:
                StringBuilder LIZ25 = X1D.LIZ();
                str11 = JBR.LJFF(LIZ25, "musically", "://openRecord?enter_from=direct_shoot&tab=live&record_type=live&exit_room=0", LIZ25);
                break;
            case 29:
                if (TextUtils.isEmpty(str)) {
                    StringBuilder LIZ26 = X1D.LIZ();
                    str11 = JBR.LJFF(LIZ26, "musically", "://now/feed?", LIZ26);
                } else {
                    StringBuilder LIZ27 = X1D.LIZ();
                    str11 = C025908h.LIZIZ(LIZ27, "musically", "://now/feed?unique_id=", str, LIZ27);
                }
                if (uri != null) {
                    String queryParameter3 = UriProtector.getQueryParameter(uri, "uid");
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        str11 = a1.LJ(str11, "&uid=", queryParameter3);
                        break;
                    }
                }
                break;
            case 31:
                StringBuilder LIZ28 = X1D.LIZ();
                LIZ28.append("musically");
                LIZ28.append("://chatting/message?");
                Uri.Builder buildUpon2 = UriProtector.parse(X1D.LIZIZ(LIZ28)).buildUpon();
                if (uri != null) {
                    str8 = UriProtector.getQueryParameter(uri, "user_id");
                } else {
                    str8 = null;
                }
                str11 = buildUpon2.appendQueryParameter("uid", str8).appendQueryParameter("params_url", String.valueOf(uri)).build().toString();
                break;
            case 32:
                StringBuilder LIZ29 = X1D.LIZ();
                str11 = JBR.LJFF(LIZ29, "musically", "://live_square?", LIZ29);
                break;
            case 33:
                if (str != null) {
                    int LJJLIIJ = s.LJJLIIJ(str, "-", 6);
                    if (LJJLIIJ == -1) {
                        return null;
                    }
                    String substring = str.substring(LJJLIIJ + 1);
                    o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
                    String substring2 = str.substring(0, LJJLIIJ);
                    o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                    StringBuilder LIZ30 = X1D.LIZ();
                    LIZ30.append("musically");
                    LIZ30.append("://collection/detail");
                    str11 = UriProtector.parse(X1D.LIZIZ(LIZ30)).buildUpon().appendQueryParameter("collection_id", substring).appendQueryParameter("collection_name", substring2).appendQueryParameter("enter_from", "reflow_collection").appendQueryParameter("gd_label", "collection_video").build().toString();
                    break;
                }
                break;
            case 34:
                StringBuilder LIZ31 = X1D.LIZ();
                LIZ31.append("musically");
                LIZ31.append("://poi/detail");
                str11 = UriProtector.parse(X1D.LIZIZ(LIZ31)).buildUpon().appendQueryParameter("poi_id", str).appendQueryParameter("enter_method", "external_link").build().toString();
                break;
            case 35:
                HashMap<String, C75552xr> hashMap2 = ((M6Q) M6Q.LIZIZ.getValue()).LIZ;
                if (hashMap2.keySet().contains(patterUrl) && (c75552xr = hashMap2.get(patterUrl)) != null && (strArr = c75552xr.LJI) != null && strArr.length != 0) {
                    String str12 = strArr[0];
                    StringBuilder LIZ32 = X1D.LIZ();
                    LIZ32.append("musically");
                    LIZ32.append(':');
                    if (ujb.o.LJJJLIIL(str12, "//", false)) {
                        LJFF = str12;
                    } else {
                        LJFF = i0.LJFF("//", str12);
                    }
                    LIZ32.append(LJFF);
                    str11 = X1D.LIZIZ(LIZ32);
                    if (!TextUtils.isEmpty(str)) {
                        if (ujb.o.LJJJJ(str12, "/", false)) {
                            str11 = i0.LJFF(str11, str);
                            break;
                        } else {
                            str11 = a1.LJ(str11, "?id=", str);
                            break;
                        }
                    }
                }
                break;
            case 36:
                Object LJIIIZ = LiveOuterService.LJJJLL().LJJIZ().LJJIJIL().LJIIIZ("", "subscribe_entry_share_scheme");
                o.LJIIIIZZ(LJIIIZ, "get().getService(ILiveOu…_entry_share_scheme\", \"\")");
                StringBuilder LIZ33 = X1D.LIZ();
                str11 = ujb.o.LJJJJZ((String) LJIIIZ, "sslocal://", JBR.LJFF(LIZ33, "musically", "://", LIZ33), false);
                break;
            case 37:
                StringBuilder LIZ34 = X1D.LIZ();
                LIZ34.append("musically");
                LIZ34.append("://search");
                Uri.Builder buildUpon3 = UriProtector.parse(X1D.LIZIZ(LIZ34)).buildUpon();
                if (uri == null || (str9 = UriProtector.getQueryParameter(uri, "enter_from")) == null) {
                    str9 = "";
                }
                Uri.Builder appendQueryParameter6 = buildUpon3.appendQueryParameter("enter_from", str9);
                if (uri == null || (str10 = UriProtector.getQueryParameter(uri, "enter_from_sub")) == null) {
                    str10 = "";
                }
                Uri.Builder appendQueryParameter7 = appendQueryParameter6.appendQueryParameter("enter_from_sub", str10);
                if (uri != null && (queryParameter = UriProtector.getQueryParameter(uri, "enter_method")) != null) {
                    str11 = queryParameter;
                }
                str11 = appendQueryParameter7.appendQueryParameter("enter_method", str11).appendQueryParameter("enter_blank_page", "1").appendQueryParameter("set_hint_by_sug_word", "1").build().toString();
                break;
        }
        if (TextUtils.isEmpty(str11) || (parse = UriProtector.parse(str11)) == null) {
            return null;
        }
        if (uri != null && !TextUtils.equals(UriProtector.parse(str11).getHost(), "webview")) {
            java.util.Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
            Uri.Builder buildUpon4 = parse.buildUpon();
            if (queryParameterNames != null && buildUpon4 != null) {
                for (String str13 : queryParameterNames) {
                    buildUpon4.appendQueryParameter(str13, UriProtector.getQueryParameter(uri, str13));
                }
            }
            return buildUpon4.build();
        }
        return parse;
    }
}
