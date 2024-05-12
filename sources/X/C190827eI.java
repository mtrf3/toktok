package X;

import com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.7eI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190827eI {
    public static PoiAnchorData LIZJ(String poiId) {
        o.LJIIIZ(poiId, "poiId");
        return PoiAnchorData.store.get(poiId);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme r32) {
        /*
            java.lang.String r0 = "aweme"
            r3 = r32
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            java.util.List r0 = r3.getAnchors()
            r7 = 0
            if (r0 == 0) goto L36
            java.util.Iterator r6 = r0.iterator()
        L12:
            boolean r0 = r6.hasNext()
            r2 = 0
            if (r0 == 0) goto Ld1
            java.lang.Object r5 = r6.next()
            r4 = r5
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r4 = (com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r4
            int r1 = r4.getType()
            r0 = 45
            if (r1 != r0) goto L12
            java.lang.String r0 = r4.getExtra()
            int r0 = r0.length()
            if (r0 <= 0) goto L12
        L32:
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r5 = (com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r5
            if (r5 != 0) goto L37
        L36:
            return r7
        L37:
            com.google.gson.Gson r4 = X.C75792yF.LIZIZ()     // Catch: java.lang.Exception -> L36
            java.lang.String r1 = r5.getExtra()     // Catch: java.lang.Exception -> L36
            java.lang.Class<com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData> r0 = com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData.class
            java.lang.Object r8 = r4.LJI(r1, r0)     // Catch: java.lang.Exception -> L36
            com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData r8 = (com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData) r8     // Catch: java.lang.Exception -> L36
            X.7eI r1 = com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData.Companion     // Catch: java.lang.Exception -> L36
            java.lang.String r0 = r8.getPoiId()     // Catch: java.lang.Exception -> L36
            r1.getClass()     // Catch: java.lang.Exception -> L36
            com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData r4 = LIZJ(r0)     // Catch: java.lang.Exception -> L36
            java.lang.Boolean r0 = r8.isClaimed()     // Catch: java.lang.Exception -> L36
            if (r0 == 0) goto L88
        L5a:
            boolean r2 = r0.booleanValue()     // Catch: java.lang.Exception -> L36
        L5e:
            java.lang.String r10 = r5.getKeyword()     // Catch: java.lang.Exception -> L36
            java.lang.String r12 = r5.getDescription()     // Catch: java.lang.Exception -> L36
            com.ss.android.ugc.aweme.base.model.UrlModel r19 = r5.getIcon()     // Catch: java.lang.Exception -> L36
            java.lang.String r18 = r3.getGroupId()     // Catch: java.lang.Exception -> L36
            if (r4 == 0) goto L76
            java.lang.String r21 = r4.getPoiDetailTypeFromLevelType()     // Catch: java.lang.Exception -> L36
            if (r21 != 0) goto L91
        L76:
            X.7cw r1 = X.EnumC189997cx.Companion     // Catch: java.lang.Exception -> L36
            java.lang.String r0 = r8.getTypeLevel()     // Catch: java.lang.Exception -> L36
            r1.getClass()     // Catch: java.lang.Exception -> L36
            X.7cx r0 = X.C189987cw.LIZ(r0, r2)     // Catch: java.lang.Exception -> L36
            java.lang.String r21 = r0.getTypeName()     // Catch: java.lang.Exception -> L36
            goto L91
        L88:
            if (r4 == 0) goto L5e
            java.lang.Boolean r0 = r4.isClaimed()     // Catch: java.lang.Exception -> L36
            if (r0 == 0) goto L5e
            goto L5a
        L91:
            if (r4 == 0) goto L94
            goto L9d
        L94:
            r25 = r7
            r26 = r7
            r27 = r7
            r29 = r7
            goto Lad
        L9d:
            java.lang.String r25 = r4.getEntranceEnterPage()     // Catch: java.lang.Exception -> L36
            java.lang.String r26 = r4.getEntranceEnterMethod()     // Catch: java.lang.Exception -> L36
            java.lang.String r27 = r4.getPreviousPage()     // Catch: java.lang.Exception -> L36
            java.util.Map r29 = r4.getSearchParams()     // Catch: java.lang.Exception -> L36
        Lad:
            java.util.Map r30 = r3.getSearchExtraParams()     // Catch: java.lang.Exception -> L36
            r9 = 0
            java.lang.Boolean r23 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Exception -> L36
            r24 = 0
            r31 = 567797(0x8a9f5, float:7.95653E-40)
            r11 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r17 = r9
            r20 = r9
            r22 = r9
            r28 = r9
            r32 = r9
            com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData r7 = com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData.copy$default(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch: java.lang.Exception -> L36
            goto L36
        Ld1:
            r5 = r7
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C190827eI.LIZLLL(com.ss.android.ugc.aweme.feed.model.Aweme):com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData");
    }

    public static void LJ(PoiAnchorData poiAnchorData) {
        o.LJIIIZ(poiAnchorData, "<this>");
        PoiAnchorData.store.put(poiAnchorData.getPoiId(), poiAnchorData);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006d, code lost:
    
        if (r1 != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C188727au r4, com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData r5) {
        /*
            r2 = 0
            if (r5 == 0) goto L8a
            java.lang.Integer r1 = r5.getPoiDeviceSameCity()
        L7:
            java.lang.String r0 = "poi_device_samecity"
            r4.LJFF(r1, r0)
            if (r5 == 0) goto L88
            java.lang.String r1 = r5.getPoiId()
        L12:
            java.lang.String r0 = "poi_id"
            r4.LJIIIZ(r0, r1)
            if (r5 == 0) goto L86
            java.lang.String r1 = r5.getPoiCityCode()
        L1d:
            java.lang.String r0 = "poi_city"
            r4.LJIIIZ(r0, r1)
            if (r5 == 0) goto L84
            java.lang.String r1 = r5.getPoiRegionCode()
        L28:
            java.lang.String r0 = "poi_region_code"
            r4.LJIIIZ(r0, r1)
            if (r5 == 0) goto L82
            java.lang.String r1 = r5.getPoiInfoSource()
        L33:
            java.lang.String r0 = "poi_info_source"
            r4.LJIIIZ(r0, r1)
            if (r5 == 0) goto L3e
            java.lang.String r2 = r5.getPoiDetailType()
        L3e:
            java.lang.String r0 = "poi_detail_type"
            r4.LJIIIZ(r0, r2)
            if (r5 == 0) goto L6f
            java.lang.Boolean r0 = r5.isClaimed()
            if (r0 == 0) goto L58
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7f
            java.lang.String r1 = "1"
        L53:
            java.lang.String r0 = "is_claimed"
            r4.LJI(r0, r1)
        L58:
            java.lang.String r1 = r5.getPoiId()
            if (r1 == 0) goto L6f
            X.7eI r0 = com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData r0 = LIZJ(r1)
            if (r0 == 0) goto L6f
            java.lang.String r1 = r0.getFromGroupId()
            if (r1 != 0) goto L71
        L6f:
            java.lang.String r1 = ""
        L71:
            java.lang.String r0 = "from_group_id"
            r4.LJI(r0, r1)
            if (r5 == 0) goto Lcc
            java.lang.String r0 = r5.getCollectInfo()
            if (r0 == 0) goto Lcc
            goto L8d
        L7f:
            java.lang.String r1 = "0"
            goto L53
        L82:
            r1 = r2
            goto L33
        L84:
            r1 = r2
            goto L28
        L86:
            r1 = r2
            goto L1d
        L88:
            r1 = r2
            goto L12
        L8a:
            r1 = r2
            goto L7
        L8d:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lc1
            r3.<init>(r0)     // Catch: java.lang.Throwable -> Lc1
            java.util.Iterator r2 = r3.keys()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r0 = "jsonObject.keys()"
            kotlin.jvm.internal.o.LJIIIIZZ(r2, r0)     // Catch: java.lang.Throwable -> Lc1
        L9b:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto Lbb
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Lc1
            boolean r0 = X.C78685UuP.LJJJZ(r1)     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto L9b
            java.lang.Object r0 = r3.opt(r1)     // Catch: java.lang.Throwable -> Lc1
            if (r0 == 0) goto L9b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lc1
            r4.LJI(r1, r0)     // Catch: java.lang.Throwable -> Lc1
            goto L9b
        Lbb:
            X.UCe r0 = X.C76800UCe.LIZ     // Catch: java.lang.Throwable -> Lc1
            X.C3C5.m7constructorimpl(r0)     // Catch: java.lang.Throwable -> Lc1
            goto Lc9
        Lc1:
            r0 = move-exception
            X.3C4 r0 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r0)
        Lc9:
            X.C3C5.m6boximpl(r0)
        Lcc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C190827eI.LIZ(X.7au, com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData):void");
    }

    public static void LIZIZ(C188727au c188727au, PoiAnchorData poiAnchorData) {
        if (poiAnchorData != null) {
            String previousPage = poiAnchorData.getPreviousPage();
            if (previousPage != null) {
                c188727au.LJI("previous_page", previousPage);
            }
            String entranceEnterPage = poiAnchorData.getEntranceEnterPage();
            if (entranceEnterPage != null) {
                c188727au.LJI("entrance_enter_page", entranceEnterPage);
            }
            String entranceEnterMethod = poiAnchorData.getEntranceEnterMethod();
            if (entranceEnterMethod != null) {
                c188727au.LJI("entrance_enter_method", entranceEnterMethod);
            }
            java.util.Map<String, String> searchParams = poiAnchorData.getSearchParams();
            if (searchParams != null) {
                for (Map.Entry<String, String> entry : searchParams.entrySet()) {
                    if (!o.LJ(entry.getKey(), "enter_method") && !o.LJ(entry.getKey(), "enter_from")) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        if (value == null) {
                            value = "";
                        }
                        c188727au.LJI(key, value);
                    }
                }
            }
        }
    }
}
