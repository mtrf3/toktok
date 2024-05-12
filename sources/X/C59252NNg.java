package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.vast.model.AdVerification;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.model.OmVast;
import com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS33S1000000_10;
import kotlin.jvm.internal.AqS70S0000000_10;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.NNg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59252NNg {
    public static final OJD LIZ = new OJD("(\\d+)%");
    public static final OJD LIZIZ = new OJD("(\\d{2}):(\\d{2}):(\\d{2})");

    /* JADX WARN: Code restructure failed: missing block: B:13:0x000e, code lost:
    
        if (r2 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.bytedance.vast.model.AdVerification LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r2) {
        /*
            r1 = 0
            if (r2 == 0) goto La
            boolean r0 = r2.isAd()
            if (r0 != 0) goto L10
            r1 = 1
        La:
            r0 = 0
            if (r1 == 0) goto Le
        Ld:
            return r0
        Le:
            if (r2 == 0) goto L14
        L10:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r2.getAwemeRawAd()
        L14:
            com.bytedance.vast.model.AdVerification r0 = LIZJ(r0)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59252NNg.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme):com.bytedance.vast.model.AdVerification");
    }

    public static final AdVerification LIZJ(AwemeRawAd awemeRawAd) {
        List<AdVerification> list;
        C59255NNj c59255NNj;
        List<AdVerification> list2;
        AdVerification adVerification;
        C59255NNj c59255NNj2;
        List<AdVerification> list3;
        OmVast omVast;
        boolean z = false;
        if (awemeRawAd != null && (omVast = awemeRawAd.getOmVast()) != null && omVast.providerType == 3) {
            z = true;
        }
        if (z) {
            OmVast omVast2 = awemeRawAd.getOmVast();
            if (omVast2 == null || (c59255NNj2 = omVast2.vast) == null || (list3 = c59255NNj2.adVerificationList) == null) {
                return null;
            }
            return (AdVerification) ORZ.LJLLLL(list3);
        }
        if (awemeRawAd == null) {
            return null;
        }
        OmVast omVast3 = awemeRawAd.getOmVast();
        if (omVast3 == null || (c59255NNj = omVast3.vast) == null || (list2 = c59255NNj.adVerificationList) == null || (adVerification = (AdVerification) ORZ.LJLLLL(list2)) == null) {
            OmVast omVast4 = awemeRawAd.getOmVast();
            if (omVast4 == null || (list = omVast4.adVerificationList) == null) {
                return null;
            }
            return (AdVerification) ORZ.LJLLLL(list);
        }
        return adVerification;
    }

    public static C59257NNl LIZLLL(AwemeRawAd awemeRawAd) {
        InterfaceC1039145z interfaceC1039145z;
        OmVast omVast;
        C59255NNj c59255NNj;
        List<C59259NNn> list;
        if (awemeRawAd != null && (omVast = awemeRawAd.getOmVast()) != null && (c59255NNj = omVast.vast) != null && (list = c59255NNj.creativeList) != null) {
            interfaceC1039145z = OJ4.LJJJJJL(ORZ.LJLIIIL(list), new AqS70S0000000_10(2));
        } else {
            interfaceC1039145z = OJA.LIZ;
        }
        return (C59257NNl) OJ4.LJJJJJ(interfaceC1039145z);
    }

    public static final boolean LJ(Aweme aweme) {
        if (aweme != null && aweme.isAd() && LJFF(aweme.getAwemeRawAd())) {
            return true;
        }
        return false;
    }

    public static final boolean LJFF(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null && awemeRawAd.getOmVast() != null && LIZJ(awemeRawAd) != null) {
            try {
                Boolean disableOmSdk = C2YJ.LIZIZ.LIZ.getDisableOmSdk();
                o.LJIIIIZZ(disableOmSdk, "{\n            SettingsRe…().disableOmSdk\n        }");
                if (!disableOmSdk.booleanValue()) {
                    return true;
                }
            } catch (C158056If e) {
                C78983UzD.LJIIZILJ(e);
            }
        }
        return false;
    }

    public static final boolean LJI(Aweme aweme) {
        if (aweme != null && aweme.isAd() && LJII(aweme.getAwemeRawAd())) {
            return true;
        }
        return false;
    }

    public static final boolean LJII(AwemeRawAd awemeRawAd) {
        if (awemeRawAd != null && awemeRawAd.getOmVast() != null) {
            if (LIZJ(awemeRawAd) == null) {
                return true;
            }
            try {
                Boolean disableOmSdk = C2YJ.LIZIZ.LIZ.getDisableOmSdk();
                o.LJIIIIZZ(disableOmSdk, "{\n            SettingsRe…().disableOmSdk\n        }");
                if (disableOmSdk.booleanValue()) {
                    return true;
                }
            } catch (C158056If e) {
                C78983UzD.LJIIZILJ(e);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0144, code lost:
    
        if (r9 != null) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIJ(com.ss.android.ugc.aweme.feed.model.Aweme r9) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59252NNg.LJIIJ(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    public static final void LJIILJJIL(C59256NNk c59256NNk) {
        List<C59257NNl> list;
        if (c59256NNk != null && (list = c59256NNk.clickList) != null) {
            LJIIL(OJ4.LJJJJI(OJ4.LJJJJJL(ORZ.LJLIIIL(list), NNU.LJLIL), C220968lo.LJLIL), null);
        }
    }

    public static long LJIIJJI(long j, String str) {
        InterfaceC59973NgH matchEntire = LIZ.matchEntire(str);
        if (matchEntire != null) {
            long j2 = j * 100;
            o.LJI(matchEntire.getGroups().LJII(1));
            return j2 / CastIntegerProtector.parseInt(r0.LJLIL);
        }
        InterfaceC59973NgH matchEntire2 = LIZIZ.matchEntire(str);
        if (matchEntire2 != null) {
            TimeUnit timeUnit = TimeUnit.HOURS;
            C59258NNm LJII = matchEntire2.getGroups().LJII(1);
            o.LJI(LJII);
            long millis = timeUnit.toMillis(CastLongProtector.parseLong(LJII.LJLIL));
            TimeUnit timeUnit2 = TimeUnit.MINUTES;
            C59258NNm LJII2 = matchEntire2.getGroups().LJII(2);
            o.LJI(LJII2);
            long millis2 = timeUnit2.toMillis(CastLongProtector.parseLong(LJII2.LJLIL)) + millis;
            TimeUnit timeUnit3 = TimeUnit.SECONDS;
            C59258NNm LJII3 = matchEntire2.getGroups().LJII(3);
            o.LJI(LJII3);
            return timeUnit3.toMillis(CastLongProtector.parseLong(LJII3.LJLIL)) + millis2;
        }
        return -1L;
    }

    public static final void LJIIL(InterfaceC1039145z interfaceC1039145z, C35V c35v) {
        N95.LIZ(c35v, OJ4.LJJLIIIJ(OJ4.LJJJJLL(OJ4.LJJJJIZL(interfaceC1039145z), N3R.LJLIL)));
    }

    public static void LIZ(C59259NNn c59259NNn, Aweme aweme, C59256NNk c59256NNk) {
        if (c59256NNk == null) {
            return;
        }
        String str = c59256NNk.program;
        o.LJIIIIZZ(str, "nativeIcon.program");
        C59256NNk LIZLLL = C59251NNf.LIZLLL(aweme, str);
        if (LIZLLL == null) {
            if (c59259NNn.iconList == null) {
                c59259NNn.iconList = new LinkedList();
            }
            c59259NNn.iconList.add(c59256NNk);
            return;
        }
        java.util.Set<String> set = c59256NNk.staticResource;
        if (set == null || set.isEmpty()) {
            set = LIZLLL.staticResource;
        }
        LIZLLL.staticResource = set;
        java.util.Set<String> set2 = c59256NNk.viewTracking;
        if (set2 != null) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : set2) {
                String str3 = str2;
                if (str3 != null && str3.length() != 0) {
                    arrayList.add(str2);
                }
            }
            if (!arrayList.isEmpty()) {
                if (LIZLLL.viewTracking == null) {
                    LIZLLL.viewTracking = new HashSet();
                }
                LIZLLL.viewTracking.addAll(arrayList);
            }
        }
        List<C59257NNl> list = c59256NNk.clickList;
        if (list == null || list.isEmpty()) {
            return;
        }
        if (LIZLLL.clickList == null) {
            LIZLLL.clickList = new LinkedList();
        }
        List<C59257NNl> list2 = LIZLLL.clickList;
        List<C59257NNl> list3 = c59256NNk.clickList;
        o.LJIIIIZZ(list3, "nativeIcon.clickList");
        list2.addAll(0, list3);
    }

    public static final void LJIILIIL(String str, Aweme aweme, String str2) {
        InterfaceC1039145z interfaceC1039145z;
        AwemeRawAd awemeRawAd;
        OmVast omVast;
        C59255NNj c59255NNj;
        List<C59259NNn> list;
        if (!C59251NNf.LIZIZ(3, aweme)) {
            return;
        }
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null && (omVast = awemeRawAd.getOmVast()) != null && (c59255NNj = omVast.vast) != null && (list = c59255NNj.creativeList) != null) {
            interfaceC1039145z = OJ4.LJJJJJL(ORZ.LJLIIIL(list), new AqS70S0000000_10(3));
        } else {
            interfaceC1039145z = OJA.LIZ;
        }
        LJIIL(OJ4.LJJJJLL(OJ4.LJJJJ(interfaceC1039145z, new AqS33S1000000_10(str, 2)), NNX.LJLIL), new C35V(str2, aweme));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01cf A[Catch: all -> 0x0327, TryCatch #4 {all -> 0x0327, blocks: (B:62:0x0104, B:64:0x011b, B:65:0x0127, B:67:0x012b, B:70:0x0133, B:72:0x013b, B:74:0x0141, B:78:0x014c, B:81:0x015a, B:83:0x0162, B:87:0x016c, B:90:0x0180, B:92:0x0189, B:94:0x018d, B:95:0x0191, B:97:0x0197, B:100:0x01a0, B:103:0x01a4, B:105:0x01a8, B:107:0x01ae, B:109:0x01b4, B:111:0x01ba, B:114:0x0216, B:116:0x0221, B:117:0x0224, B:119:0x022a, B:121:0x022e, B:122:0x0234, B:124:0x0240, B:126:0x027a, B:129:0x0282, B:131:0x0288, B:132:0x0290, B:134:0x02f5, B:135:0x02fc, B:137:0x025c, B:141:0x0266, B:145:0x0275, B:146:0x0273, B:150:0x0211, B:157:0x01cf, B:159:0x01d5, B:161:0x01db, B:165:0x01e6, B:168:0x0200, B:169:0x01f2, B:171:0x01f8, B:173:0x01fe, B:177:0x0178, B:181:0x0158, B:188:0x0307, B:113:0x0207), top: B:61:0x0104, inners: #0, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0176 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x018d A[Catch: all -> 0x0327, TryCatch #4 {all -> 0x0327, blocks: (B:62:0x0104, B:64:0x011b, B:65:0x0127, B:67:0x012b, B:70:0x0133, B:72:0x013b, B:74:0x0141, B:78:0x014c, B:81:0x015a, B:83:0x0162, B:87:0x016c, B:90:0x0180, B:92:0x0189, B:94:0x018d, B:95:0x0191, B:97:0x0197, B:100:0x01a0, B:103:0x01a4, B:105:0x01a8, B:107:0x01ae, B:109:0x01b4, B:111:0x01ba, B:114:0x0216, B:116:0x0221, B:117:0x0224, B:119:0x022a, B:121:0x022e, B:122:0x0234, B:124:0x0240, B:126:0x027a, B:129:0x0282, B:131:0x0288, B:132:0x0290, B:134:0x02f5, B:135:0x02fc, B:137:0x025c, B:141:0x0266, B:145:0x0275, B:146:0x0273, B:150:0x0211, B:157:0x01cf, B:159:0x01d5, B:161:0x01db, B:165:0x01e6, B:168:0x0200, B:169:0x01f2, B:171:0x01f8, B:173:0x01fe, B:177:0x0178, B:181:0x0158, B:188:0x0307, B:113:0x0207), top: B:61:0x0104, inners: #0, #5 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIIIZZ(com.ss.android.ugc.aweme.feed.model.Aweme r19, java.util.concurrent.Executor r20, java.lang.Runnable r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59252NNg.LJIIIIZZ(com.ss.android.ugc.aweme.feed.model.Aweme, java.util.concurrent.Executor, java.lang.Runnable, boolean):void");
    }

    public static void LJIIIZ(String str, String str2, long j, String str3, Aweme aweme, AwemeRawAd awemeRawAd, int i) {
        if ((i & 16) != 0) {
            aweme = null;
        }
        if ((i & 32) != 0) {
            awemeRawAd = null;
        }
        if (str3 == null) {
            return;
        }
        C59127NIl LIZ2 = C59128NIm.LIZ();
        LIZ2.LJ.LIZ("ad_event_priority", "10");
        LIZ2.LJ.LIZ("ad_event_type", "monitor");
        LIZ2.LJ.LIZ("track_url_list", str);
        LIZ2.LJ.LIZ("track_status", str2);
        C59129NIn c59129NIn = LIZ2.LJ;
        c59129NIn.getClass();
        try {
            if (c59129NIn.LIZ == null) {
                c59129NIn.LIZ = new JSONObject();
            }
            c59129NIn.LIZ.put("ts", j);
        } catch (JSONException unused) {
        }
        String LIZIZ2 = FLE.LIZIZ();
        if (!TextUtils.isEmpty(LIZIZ2)) {
            LIZ2.LJ.LIZ("user_agent", LIZIZ2);
        }
        LIZ2.LJFF = "track_url";
        LIZ2.LIZ = "track_ad";
        LIZ2.LJ.LIZ("track_label", str3);
        LIZ2.LJ(aweme);
        LIZ2.LJFF(awemeRawAd);
        Context LIZIZ3 = EF7.LIZIZ();
        LIZ2.LJ.LIZ("is_ad_event", "1");
        String LLJILJILJ = C16880lQ.LLJILJILJ(LIZIZ3);
        if (!C38354F3m.LJ(LLJILJILJ)) {
            LIZ2.LJ.LIZ("nt", LLJILJILJ);
        }
        HashMap hashMap = new HashMap();
        try {
            hashMap.put("category", "event_v3");
            if (!TextUtils.isEmpty(LIZ2.LIZ)) {
                hashMap.put("tag", LIZ2.LIZ);
            }
            if (!TextUtils.isEmpty(LIZ2.LIZIZ)) {
                hashMap.put("label", LIZ2.LIZIZ);
            }
            if (!TextUtils.isEmpty(LIZ2.LIZJ)) {
                hashMap.put("value", LIZ2.LIZJ);
            }
            if (!TextUtils.isEmpty(LIZ2.LIZLLL)) {
                hashMap.put("ext_value", LIZ2.LIZLLL);
            }
            C59129NIn c59129NIn2 = LIZ2.LJ;
            if (c59129NIn2.LIZ == null) {
                c59129NIn2.LIZ = new JSONObject();
            }
            JSONObject jSONObject = c59129NIn2.LIZ;
            ITalentAdRevenueShareService LJIIJJI = TalentAdRevenueShareServiceImpl.LJIIJJI();
            if (LJIIJJI != null && !TextUtils.isEmpty(LIZ2.LIZJ)) {
                LJIIJJI.LJ(LIZ2.LIZJ, jSONObject);
            }
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.equals("has_v3", next)) {
                    try {
                        Object opt = jSONObject.opt(next);
                        if (opt instanceof String) {
                            hashMap.put(next, (String) opt);
                        } else {
                            hashMap.put(next, new Gson().LJIILL(opt));
                        }
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
            if (!TextUtils.isEmpty(LIZ2.LJFF)) {
                FMX.LJIIL(LIZ2.LJFF, hashMap);
            }
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
        }
        synchronized (C59128NIm.class) {
            if (C59128NIm.LIZ == null) {
                C59128NIm.LIZ = LIZ2;
                LIZ2.LIZ = null;
                LIZ2.LIZIZ = null;
                LIZ2.LIZJ = null;
                LIZ2.LIZLLL = null;
                LIZ2.LJ.LIZ = null;
            }
        }
    }
}
