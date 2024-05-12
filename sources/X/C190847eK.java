package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.7eK, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190847eK {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(C188727au c188727au, Aweme aweme) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        List<AnchorCommonStruct> anchors;
        List<AnchorCommonStruct> anchors2;
        List<AnchorCommonStruct> anchors3;
        List<AnchorCommonStruct> anchors4;
        List<AnchorCommonStruct> anchors5;
        AnchorCommonStruct anchorCommonStruct;
        List<AnchorCommonStruct> anchors6;
        AnchorCommonStruct anchorCommonStruct2;
        List<AnchorCommonStruct> anchors7;
        AnchorCommonStruct anchorCommonStruct3;
        String str7 = null;
        if (aweme != null && (anchors7 = aweme.getAnchors()) != null && (anchorCommonStruct3 = (AnchorCommonStruct) ORZ.LJLLLL(anchors7)) != null) {
            str = anchorCommonStruct3.getLogExtra();
        } else {
            str = null;
        }
        c188727au.LJIIIZ("main_anchor_id", LIZJ(str, "anchor_id"));
        if (aweme != null && (anchors6 = aweme.getAnchors()) != null && (anchorCommonStruct2 = (AnchorCommonStruct) ORZ.LJLLLL(anchors6)) != null) {
            str2 = anchorCommonStruct2.getLogExtra();
        } else {
            str2 = null;
        }
        c188727au.LJIIIZ("main_anchor_name", LIZJ(str2, "anchor_name"));
        if (aweme != null && (anchors5 = aweme.getAnchors()) != null && (anchorCommonStruct = (AnchorCommonStruct) ORZ.LJLLLL(anchors5)) != null) {
            str3 = anchorCommonStruct.getLogExtra();
        } else {
            str3 = null;
        }
        c188727au.LJIIIZ("main_anchor_type", LIZJ(str3, "anchor_type"));
        int i = 0;
        if (aweme != null && (anchors4 = aweme.getAnchors()) != null && anchors4.size() > 1) {
            i = 1;
        }
        c188727au.LIZLLL(i, "multi_anchor");
        if (aweme != null && (anchors3 = aweme.getAnchors()) != null) {
            str4 = ORZ.LLD(anchors3, ",", null, null, C190867eM.LJLIL, 30);
        } else {
            str4 = null;
        }
        c188727au.LJIIIZ("anchor_id", str4);
        if (aweme != null && (anchors2 = aweme.getAnchors()) != null) {
            str5 = ORZ.LLD(anchors2, ",", null, null, C190877eN.LJLIL, 30);
        } else {
            str5 = null;
        }
        c188727au.LJIIIZ("anchor_name", str5);
        if (aweme != null && (anchors = aweme.getAnchors()) != null) {
            str7 = ORZ.LLD(anchors, ",", null, null, C190887eO.LJLIL, 30);
        }
        c188727au.LJIIIZ("anchor_type", str7);
        LogPbBean logPbBean = aweme.getLogPbBean();
        if (logPbBean == null || (str6 = logPbBean.getImprId()) == null) {
            str6 = "";
        }
        c188727au.LJI("log_pb", str6);
    }

    public static String LIZJ(String str, String str2) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        try {
            String optString = new JSONObject(str).optString(str2, "");
            o.LJIIIIZZ(optString, "{\n            val logExt…String(key, \"\")\n        }");
            return optString;
        } catch (Exception unused) {
            return "";
        }
    }

    public static void LIZLLL(int i, Aweme aweme, String str, String str2, String str3) {
        String str4;
        String str5;
        String collectInfo;
        Object LIZ2;
        Object opt;
        o.LJIIIZ(aweme, "aweme");
        PoiAnchorData.Companion.getClass();
        PoiAnchorData LIZLLL = C190827eI.LIZLLL(aweme);
        PoiAnchorData LIZJ = C190827eI.LIZJ(str);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "poi_detail");
        c188727au.LIZLLL(i, "order");
        String str6 = null;
        if (LIZLLL != null) {
            str4 = LIZLLL.getPoiRegionCode();
        } else {
            str4 = null;
        }
        c188727au.LJIIIZ("poi_region_code", str4);
        if (LIZLLL != null) {
            str5 = LIZLLL.getPoiCityCode();
        } else {
            str5 = null;
        }
        c188727au.LJIIIZ("poi_city", str5);
        if (LIZLLL != null) {
            str6 = LIZLLL.getPoiId();
        }
        c188727au.LJIIIZ("poi_id", str6);
        c188727au.LJIIIZ("page_poi_id", str);
        if (str3 == null && (LIZJ == null || (str3 = LIZJ.getFromGroupId()) == null)) {
            str3 = "";
        }
        c188727au.LJIIIZ("from_group_id", str3);
        c188727au.LJIIIZ("group_id", aweme.getGroupId());
        c188727au.LJIIIZ("author_id", aweme.getAuthorUid());
        if (LIZLLL != null && (collectInfo = LIZLLL.getCollectInfo()) != null) {
            try {
                JSONObject jSONObject = new JSONObject(collectInfo);
                c188727au.LJI("collect_info", collectInfo);
                Iterator<String> keys = jSONObject.keys();
                o.LJIIIIZZ(keys, "jsonObject.keys()");
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (C78685UuP.LJJJZ(next) && (opt = jSONObject.opt(next)) != null) {
                        c188727au.LJI(next, opt.toString());
                    }
                }
                LIZ2 = C76800UCe.LIZ;
                C3C5.m7constructorimpl(LIZ2);
            } catch (Throwable th) {
                LIZ2 = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ2);
            }
            C3C5.m6boximpl(LIZ2);
        }
        C43001GuD.LJ(c188727au, str2);
        FMX.LJIIL("poi_video_click", c188727au.LIZ);
    }

    public static void LJ(final int i, final Aweme aweme, final String str, final String str2, final String str3) {
        o.LJIIIZ(aweme, "aweme");
        C38995FSd.LIZIZ().execute(new Runnable() { // from class: X.7eL
            public final void LIZ() {
                C190827eI c190827eI = PoiAnchorData.Companion;
                Aweme aweme2 = aweme;
                c190827eI.getClass();
                PoiAnchorData LIZLLL = C190827eI.LIZLLL(aweme2);
                C190797eF c190797eF = C190787eE.Companion;
                C188727au c188727au = new C188727au();
                C190827eI.LIZIZ(c188727au, LIZLLL);
                c188727au.LJIIIZ("enter_from", "poi_detail");
                c188727au.LIZLLL(i, "order");
                C190827eI.LIZ(c188727au, LIZLLL);
                Aweme aweme3 = aweme;
                c190797eF.getClass();
                C190797eF.LIZ(c188727au, C190797eF.LIZIZ(aweme3));
                C190847eK.LIZ(c188727au, aweme);
                C43001GuD.LJ(c188727au, str2);
                java.util.Map<String, String> ret = c188727au.LIZ;
                o.LJIIIIZZ(ret, "ret");
                HashMap hashMap = (HashMap) ret;
                hashMap.put("page_poi_id", str);
                String str4 = str3;
                if (str4 != null) {
                    hashMap.put("from_group_id", str4);
                }
                FMX.LJIIL("poi_video_show", ret);
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean LIZ2;
                try {
                    LIZ();
                } finally {
                    if (LIZ2) {
                    }
                }
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0144, code lost:
    
        if (r15.LJII() == true) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00a0, code lost:
    
        if (r9 != null) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(java.lang.String r6, java.lang.String r7, com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData r8, X.C190787eE r9, java.lang.String r10, java.lang.Integer r11, int r12, java.lang.Boolean r13, java.lang.String r14, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse r15, boolean r16, boolean r17, int r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C190847eK.LIZIZ(java.lang.String, java.lang.String, com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData, X.7eE, java.lang.String, java.lang.Integer, int, java.lang.Boolean, java.lang.String, com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse, boolean, boolean, int, java.lang.String):void");
    }
}
