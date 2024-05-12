package X;

import Y.ARunnableS40S0100000_4;
import Y.ARunnableS45S0100000_9;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.AccountService;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.M5f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56235M5f {
    public static long LIZ;
    public static long LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static boolean LJ;
    public static String LJFF;
    public static String LJI;
    public static boolean LJII;
    public static boolean LJIIIIZZ;
    public static boolean LJIIL;
    public static boolean LJIILIIL;
    public static String LJIIIZ = "old";
    public static String LJIIJ = "normal_deeplink";
    public static final HashMap<String, Long> LJIIJJI = new HashMap<>();
    public static String LJIILJJIL = "";

    public static boolean LIZIZ(android.net.Uri uri) {
        String str;
        if (uri != null) {
            str = uri.getHost();
        } else {
            str = null;
        }
        if (TextUtils.equals("shortlink", str)) {
            return true;
        }
        return false;
    }

    public static final void LIZJ(String str) {
        LJIIJJI.put(str, Long.valueOf(System.currentTimeMillis()));
    }

    public static final void LJFF(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        Long l = LJIIJJI.get(str);
        if (l == null) {
            l = 0L;
        }
        long longValue = currentTimeMillis - l.longValue();
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("type", LJFF);
        c198517qh.LIZ.put("enter_to", LJI);
        c198517qh.LIZ.put("node_name", str);
        c198517qh.LIZ.put("cost_time", Long.valueOf(longValue));
        c198517qh.LIZ.put("link_version", LJIIIZ);
        ARunnableS45S0100000_9 aRunnableS45S0100000_9 = new ARunnableS45S0100000_9(c198517qh, 0);
        if (C33710DKw.LIZJ()) {
            FMX.LIZIZ().execute(aRunnableS45S0100000_9);
        } else {
            aRunnableS45S0100000_9.run();
        }
    }

    public static final void LJI(Intent intent) {
        String str;
        String str2;
        String str3;
        String str4;
        String uri;
        o.LJIIIZ(intent, "intent");
        android.net.Uri data = intent.getData();
        if (LIZIZ(data) || intent.getBooleanExtra("is_short_link", false)) {
            return;
        }
        LIZ = System.currentTimeMillis();
        LJIILJJIL = AnonymousClass629.LIZ("randomUUID().toString()");
        android.net.Uri data2 = intent.getData();
        if (data2 != null) {
            intent.setData(data2.buildUpon().appendQueryParameter("ugdp_id", LJIILJJIL).build());
        }
        String str5 = "";
        if (data == null || (str = UriProtector.getQueryParameter(data, "sharer_biz")) == null) {
            str = "";
        }
        C198517qh c198517qh = new C198517qh();
        String str6 = null;
        if (data != null) {
            str2 = data.toString();
        } else {
            str2 = null;
        }
        c198517qh.LIZ.put("url", str2);
        c198517qh.LIZ.put("type", LJFF);
        c198517qh.LIZ.put("startTime", Long.valueOf(LIZ));
        c198517qh.LIZ.put("linkVersion", LJIIIZ);
        c198517qh.LIZ.put("event_id", LJIILJJIL);
        c198517qh.LIZ.put("sharer_biz", str);
        c198517qh.LIZ.put("async", Integer.valueOf(LJII ? 1 : 0));
        ARunnableS45S0100000_9 aRunnableS45S0100000_9 = new ARunnableS45S0100000_9(c198517qh, 1);
        if (C33710DKw.LIZJ()) {
            FMX.LIZIZ().execute(aRunnableS45S0100000_9);
        } else {
            aRunnableS45S0100000_9.run();
        }
        if (!o.LJ(LJFF, "appsflyer") && !o.LJ(LJFF, "self")) {
            if (!C38586FCk.LIZIZ()) {
                String LIZLLL2 = AccountService.LJIJ().LIZLLL();
                o.LJIIIIZZ(LIZLLL2, "get().getService(\n      … ).currentRegionUpperCase");
                String LIZJ2 = AnonymousClass028.LIZJ("getDefault()", LIZLLL2, "this as java.lang.String).toLowerCase(locale)");
                C78966Uyw c78966Uyw = new C78966Uyw();
                C26408AYa.LJ = LIZJ2;
                C26408AYa.LJFF = c78966Uyw;
            }
            if (data == null || (str3 = UriProtector.getQueryParameter(data, "media_source")) == null) {
                str3 = "";
            }
            if (data != null && (uri = data.toString()) != null) {
                str5 = uri;
            }
            C26408AYa.LJFF(str5, str3, false);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (data != null) {
                str4 = data.toString();
            } else {
                str4 = null;
            }
            C26408AYa.LJI("inc_activity_start", str4, linkedHashMap);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (data != null) {
            str6 = data.toString();
        }
        C26408AYa.LJI("inc_activity_deep_link_start", str6, linkedHashMap2);
    }

    public static final void LIZ(Intent intent, String str) {
        o.LJIIIZ(intent, "intent");
        boolean equals = TextUtils.equals(C16880lQ.LLJJIJIIJIL(intent, "dl_from"), "af");
        String str2 = "facebook";
        boolean equals2 = TextUtils.equals(C16880lQ.LLJJIJIIJIL(intent, "dl_from"), "facebook");
        boolean LJJJ = C78977Uz7.LJJJ(intent, "is_from_self");
        boolean LJJJ2 = C78977Uz7.LJJJ(intent, "from_notification");
        if (equals) {
            str2 = "appsflyer";
        } else if (!equals2) {
            if (LJJJ2) {
                str2 = "push";
            } else if (LJJJ) {
                str2 = "self";
            } else {
                str2 = "other";
            }
        }
        LJFF = str2;
        android.net.Uri data = intent.getData();
        if (data != null) {
            String LIZ2 = C38758FJa.LIZ(data);
            if (ujb.o.LJJJLIIL(LIZ2, "user/homepage", false)) {
                LIZ2 = "mine";
            } else {
                String str3 = "discovery";
                if (!ujb.o.LJJJLIIL(LIZ2, "discovery", false)) {
                    if (ujb.o.LJJJLIIL(LIZ2, "user/find_friends", false)) {
                        LIZ2 = "friends";
                    } else if (ujb.o.LJJJLIIL(LIZ2, "profile", false)) {
                        LIZ2 = "others_homepage";
                    } else {
                        str3 = "detail";
                        if (!ujb.o.LJJJLIIL(LIZ2, "detail", false) && !ujb.o.LJJJLIIL(LIZ2, "item", false)) {
                            str3 = "live";
                            if (!ujb.o.LJJJLIIL(LIZ2, "live", false)) {
                                str3 = "notification";
                                if (!ujb.o.LJJJLIIL(LIZ2, "notification", false)) {
                                    if (ujb.o.LJJJLIIL(LIZ2, "challenge/detail", false)) {
                                        LIZ2 = "challenge_detail";
                                    } else if (ujb.o.LJJJLIIL(LIZ2, "music/detail", false)) {
                                        LIZ2 = "music_detail";
                                    } else {
                                        str3 = "webview";
                                        if (!ujb.o.LJJJLIIL(LIZ2, "webview", false)) {
                                            if (ujb.o.LJJJLIIL(LIZ2, "messages/group", false)) {
                                                LIZ2 = "message_group";
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                LIZ2 = str3;
            }
            LJI = LIZ2;
        }
        LJII = M5K.LJFF(intent);
        LJIIIIZZ = M5K.LIZLLL(intent);
        LJIIIZ = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        if (r10.length() == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00a4, code lost:
    
        if (android.text.TextUtils.isEmpty(r8) == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0247, code lost:
    
        if (r10 != null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(int r18, android.net.Uri r19, java.lang.String r20) {
        /*
            Method dump skipped, instructions count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56235M5f.LIZLLL(int, android.net.Uri, java.lang.String):void");
    }

    public static final void LJ(int i, android.net.Uri uri, String str) {
        boolean z;
        String str2;
        if (LIZIZ(uri)) {
            return;
        }
        if (o.LJ(LJIIJ, "short_to_long")) {
            LJFF = "applink";
        }
        long currentTimeMillis = System.currentTimeMillis();
        LIZIZ = currentTimeMillis;
        long j = currentTimeMillis - LIZ;
        String str3 = C56251M5v.LIZ;
        if (str3 == null || str3.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        String str4 = null;
        if (z) {
            if (uri != null) {
                str2 = uri.toString();
            } else {
                str2 = null;
            }
        } else {
            str2 = C56251M5v.LIZ;
        }
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("url", str2);
        c198517qh.LIZ.put("type", LJFF);
        c198517qh.LIZ.put("enter_to", LJI);
        c198517qh.LIZ.put("errorCode", Integer.valueOf(i));
        c198517qh.LIZ.put("step", str);
        c198517qh.LIZ.put("duration", Long.valueOf(j));
        c198517qh.LIZ.put("event_id", LJIILJJIL);
        c198517qh.LIZ.put("async", Integer.valueOf(LJII ? 1 : 0));
        c198517qh.LIZ.put("async_fact", Integer.valueOf(LJIIIIZZ ? 1 : 0));
        if (uri != null) {
            str4 = UriProtector.getQueryParameter(uri, "page_name");
        }
        if (o.LJ(str4, "reflow_chat_invitation") && str4 != null) {
            c198517qh.LIZLLL("enter_to", "chat");
        }
        ARunnableS40S0100000_4 aRunnableS40S0100000_4 = new ARunnableS40S0100000_4(c198517qh, 1);
        if (C33710DKw.LIZJ()) {
            FMX.LIZIZ().execute(aRunnableS40S0100000_4);
        } else {
            aRunnableS40S0100000_4.run();
        }
    }
}
