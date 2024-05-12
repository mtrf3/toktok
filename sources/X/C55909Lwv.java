package X;

import android.net.Uri;
import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.ecommerce.fashionmall.tools.vo.ToolEntryVO;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.Lwv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55909Lwv {
    public static List<Integer> LIZ;
    public static List<Integer> LIZIZ;
    public static List<Integer> LIZJ;

    public static int LIZLLL() {
        double d = EF7.LIZIZ().getResources().getDisplayMetrics().density;
        if (LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX <= d && d <= 1.4d) {
            return 1;
        }
        if (1.4d <= d && d <= 2.4d) {
            return 2;
        }
        return 3;
    }

    public static String LIZ(String str) {
        try {
            android.net.Uri parse = UriProtector.parse(str);
            Uri.Builder buildUpon = UriProtector.parse(URLDecoder.decode(UriProtector.getQueryParameter(parse, "url"))).buildUpon();
            buildUpon.appendQueryParameter("init_time", String.valueOf(System.currentTimeMillis()));
            String uri = parse.toString();
            o.LJIIIIZZ(uri, "targetUri.toString()");
            OJD ojd = new OJD("(url=[^&]*)");
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("url=");
            LIZ2.append(URLEncoder.encode(buildUpon.toString(), "UTF-8"));
            return ojd.replace(uri, X1D.LIZIZ(LIZ2));
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return str;
        }
    }

    public static String LIZIZ(ToolEntryVO toolEntry) {
        String link;
        String replace;
        android.net.Uri parse;
        String queryParameter;
        String str;
        o.LJIIIZ(toolEntry, "toolEntry");
        try {
            Uri.Builder buildUpon = UriProtector.parse(toolEntry.getLink()).buildUpon();
            if (toolEntry.getCardType() == EnumC56134M1i.CARD_TYPE_MESSAGE_ENTRY.getValue()) {
                buildUpon.appendQueryParameter("click_time", String.valueOf(SystemClock.elapsedRealtime()));
                if (C78685UuP.LJJJZ(toolEntry.getLinkTitleText())) {
                    str = toolEntry.getLinkTitleText();
                } else {
                    str = "Shop Message";
                }
                buildUpon.appendQueryParameter("title", str);
            }
            if (LIZ == null || LIZIZ == null || LIZJ == null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                    String LJI = SettingsManager.LJI("ec_fashion_mall_common_track_params", "{\"bizParamsEntry\":\"10,19,22\",\"techParamsEntry\":\"7,10,22\",\"urlParamsEntry\":\"8\"}");
                    o.LJIIIIZZ(LJI, "getInstance().getStringV…ramsSettings::class.java)");
                    if (C78685UuP.LJJJZ(LJI)) {
                        JSONObject jSONObject = new JSONObject(LJI);
                        if (LIZ == null) {
                            String string = JSONObjectProtectorUtils.getString(jSONObject, "bizParamsEntry");
                            o.LJIIIIZZ(string, "commonParamsJson.getString(\"bizParamsEntry\")");
                            List LJLJJL = s.LJLJJL(s.LJZI(string).toString(), new String[]{","}, 0, 6);
                            ArrayList arrayList = new ArrayList(C32I.LJJL(LJLJJL, 10));
                            Iterator it = LJLJJL.iterator();
                            while (it.hasNext()) {
                                arrayList.add(Integer.valueOf(CastIntegerProtector.parseInt((String) it.next())));
                            }
                            LIZ = arrayList;
                        }
                        if (LIZIZ == null) {
                            String string2 = JSONObjectProtectorUtils.getString(jSONObject, "techParamsEntry");
                            o.LJIIIIZZ(string2, "commonParamsJson.getString(\"techParamsEntry\")");
                            List LJLJJL2 = s.LJLJJL(s.LJZI(string2).toString(), new String[]{","}, 0, 6);
                            ArrayList arrayList2 = new ArrayList(C32I.LJJL(LJLJJL2, 10));
                            Iterator it2 = LJLJJL2.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(Integer.valueOf(CastIntegerProtector.parseInt((String) it2.next())));
                            }
                            LIZIZ = arrayList2;
                        }
                        if (LIZJ == null) {
                            String string3 = JSONObjectProtectorUtils.getString(jSONObject, "urlParamsEntry");
                            o.LJIIIIZZ(string3, "commonParamsJson.getString(\"urlParamsEntry\")");
                            List LJLJJL3 = s.LJLJJL(s.LJZI(string3).toString(), new String[]{","}, 0, 6);
                            ArrayList arrayList3 = new ArrayList(C32I.LJJL(LJLJJL3, 10));
                            Iterator it3 = LJLJJL3.iterator();
                            while (it3.hasNext()) {
                                arrayList3.add(Integer.valueOf(CastIntegerProtector.parseInt((String) it3.next())));
                            }
                            LIZJ = arrayList3;
                        }
                    }
                    C3C5.m7constructorimpl(C76800UCe.LIZ);
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
            }
            List<Integer> list = LIZ;
            if (list != null && ((ArrayList) list).contains(Integer.valueOf(toolEntry.getCardType()))) {
                C56045Lz7.LIZ.getClass();
                buildUpon.appendQueryParameter("enter_from", C56045Lz7.LIZIZ());
            }
            List<Integer> list2 = LIZIZ;
            if (list2 != null && ((ArrayList) list2).contains(Integer.valueOf(toolEntry.getCardType()))) {
                buildUpon.appendQueryParameter("init_time", String.valueOf(System.currentTimeMillis()));
            }
            List<Integer> list3 = LIZJ;
            if (list3 != null && ((ArrayList) list3).contains(Integer.valueOf(toolEntry.getCardType()))) {
                String builder = buildUpon.toString();
                o.LJIIIIZZ(builder, "builder.toString()");
                link = LIZ(builder);
            } else {
                link = buildUpon.toString();
                o.LJIIIIZZ(link, "builder.toString()");
            }
        } catch (Throwable th2) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th2));
            link = toolEntry.getLink();
        }
        try {
            int cardType = toolEntry.getCardType();
            if (cardType != EnumC56134M1i.CARD_TYPE_ADDRESS_ENTRY.getValue()) {
                boolean z = true;
                if (cardType == EnumC56134M1i.CARD_TYPE_ORDER_ENTRY.getValue()) {
                    Uri.Builder buildUpon2 = UriProtector.parse(link).buildUpon();
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("traffic_source_list", new JSONArray(new int[]{6}));
                    jSONObject2.put("start_click_time", System.currentTimeMillis());
                    buildUpon2.appendQueryParameter("trackParams", jSONObject2.toString());
                    replace = buildUpon2.toString();
                    o.LJIIIIZZ(replace, "builder.toString()");
                } else if (cardType == EnumC56134M1i.CARD_TYPE_COUPON_ENTRY.getValue() && (queryParameter = UriProtector.getQueryParameter((parse = UriProtector.parse(URLDecoder.decode(UriProtector.parse(link).toString(), "UTF-8"))), "trackParams")) != null) {
                    try {
                        JSONObject jSONObject3 = new JSONObject(queryParameter);
                        jSONObject3.put("traffic_source_list", new JSONArray(new int[]{6}));
                        String uri = parse.toString();
                        o.LJIIIIZZ(uri, "targetUri.toString()");
                        OJD ojd = new OJD("(trackParams=[^&]*)");
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("trackParams=");
                        LIZ2.append(jSONObject3);
                        String replace2 = ojd.replace(uri, X1D.LIZIZ(LIZ2));
                        if (replace2 == null || !s.LJJJLZIJ(replace2, "url=", false)) {
                            z = false;
                        }
                        if (z) {
                            int LJJLIIIJL = s.LJJLIIIJL(replace2, "url=", 0, false, 6) + 4;
                            String substring = replace2.substring(LJJLIIIJL);
                            o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
                            String substring2 = replace2.substring(0, LJJLIIIJL);
                            o.LJIIIIZZ(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append(substring2);
                            LIZ3.append(URLEncoder.encode(substring, "UTF-8"));
                            return X1D.LIZIZ(LIZ3);
                        }
                        String uri2 = parse.toString();
                        o.LJIIIIZZ(uri2, "targetUri.toString()");
                        return uri2;
                    } catch (Exception e) {
                        C36746EbW.LIZ(6, e.toString());
                        replace = parse.toString();
                        o.LJIIIIZZ(replace, "{\n                      …                        }");
                    }
                }
                return replace;
            }
            android.net.Uri parse2 = UriProtector.parse(link);
            String queryParameter2 = UriProtector.getQueryParameter(parse2, "trackParams");
            if (queryParameter2 != null) {
                JSONObject jSONObject4 = new JSONObject(queryParameter2);
                C56045Lz7.LIZ.getClass();
                jSONObject4.put("enter_from", C56045Lz7.LIZIZ());
                jSONObject4.put("click_time", String.valueOf(SystemClock.elapsedRealtime()));
                String uri3 = parse2.toString();
                o.LJIIIIZZ(uri3, "targetUri.toString()");
                OJD ojd2 = new OJD("(trackParams=[^&]*)");
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("trackParams=");
                LIZ4.append(URLEncoder.encode(jSONObject4.toString(), "UTF-8"));
                replace = ojd2.replace(uri3, X1D.LIZIZ(LIZ4));
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("Subpage Params schema ");
                LIZ5.append(replace);
                C36746EbW.LIZ(3, X1D.LIZIZ(LIZ5));
                return replace;
            }
            replace = link;
            StringBuilder LIZ52 = X1D.LIZ();
            LIZ52.append("Subpage Params schema ");
            LIZ52.append(replace);
            C36746EbW.LIZ(3, X1D.LIZIZ(LIZ52));
            return replace;
        } catch (Throwable th3) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th3));
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("Subpage Params schema ");
            LIZ6.append(link);
            C36746EbW.LIZ(3, X1D.LIZIZ(LIZ6));
            return link;
        }
    }

    public static java.util.Map LIZJ(String str) {
        try {
            android.net.Uri parse = UriProtector.parse(str);
            OSZ[] oszArr = new OSZ[2];
            String queryParameter = UriProtector.getQueryParameter(parse, "previous_page");
            String str2 = "";
            if (queryParameter == null) {
                queryParameter = "";
            }
            oszArr[0] = new OSZ("previous_page", queryParameter);
            String queryParameter2 = UriProtector.getQueryParameter(parse, "deeplink_type");
            if (queryParameter2 != null) {
                str2 = queryParameter2;
            }
            oszArr[1] = new OSZ("deeplink_type", str2);
            return C113554cx.LJJL(oszArr);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return null;
        }
    }
}
