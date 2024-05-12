package X;

/* renamed from: X.7dJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C190217dJ {
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b2, code lost:
    
        if (r2 != null) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData LIZ(com.ss.android.ugc.aweme.feed.model.Aweme r29) {
        /*
            java.lang.String r0 = "<this>"
            r5 = r29
            kotlin.jvm.internal.o.LJIIIZ(r5, r0)
            java.util.List r0 = r5.getAnchors()
            r6 = 0
            if (r0 == 0) goto L35
            java.util.Iterator r4 = r0.iterator()
        L12:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L64
            java.lang.Object r3 = r4.next()
            r2 = r3
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r2 = (com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r2
            int r1 = r2.getType()
            r0 = 45
            if (r1 != r0) goto L12
            java.lang.String r0 = r2.getExtra()
            int r0 = r0.length()
            if (r0 <= 0) goto L12
        L31:
            com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r3 = (com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct) r3
            if (r3 != 0) goto L36
        L35:
            return r6
        L36:
            java.lang.String r4 = r3.getExtra()
            boolean r0 = X.C78685UuP.LJJJZ(r4)
            if (r0 == 0) goto L35
            if (r4 == 0) goto L35
            java.util.HashMap<java.lang.String, java.lang.String> r3 = com.ss.android.ugc.aweme.poi.collect.PoiCollectStatusViewModel.LJLILLLLZI
            java.lang.Object r1 = r3.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = X.C78685UuP.LJJJZ(r1)
            if (r0 == 0) goto L58
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData> r0 = com.ss.android.ugc.aweme.poi.collect.PoiCollectStatusViewModel.LJLJI
            java.lang.Object r2 = r0.get(r1)
            if (r2 != 0) goto Lc4
        L58:
            X.7eI r0 = com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData.Companion
            r0.getClass()
            com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData r5 = X.C190827eI.LIZLLL(r5)
            if (r5 != 0) goto L66
            return r6
        L64:
            r3 = r6
            goto L31
        L66:
            java.util.HashMap<java.lang.String, java.lang.Boolean> r1 = com.ss.android.ugc.aweme.poi.collect.PoiCollectStatusViewModel.LJLJJI
            java.lang.String r0 = r5.getPoiId()
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto Lc7
            java.lang.String r0 = r5.getPoiId()
            java.lang.Object r1 = r1.remove(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 != 0) goto L80
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
        L80:
            java.lang.String r0 = "POIID_COLLECT_STATUS.rem…nchorData.poiId) ?: false"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            boolean r21 = r1.booleanValue()
            r6 = 0
            r28 = 4161535(0x3f7fff, float:5.831553E-39)
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            r12 = r6
            r13 = r6
            r14 = r6
            r15 = r6
            r16 = r6
            r17 = r6
            r18 = r6
            r19 = r6
            r20 = r6
            r22 = r6
            r23 = r6
            r24 = r6
            r25 = r6
            r26 = r6
            r27 = r6
            r29 = r6
            com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData r2 = com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData.copy$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
        Lb2:
            if (r2 == 0) goto Lc4
        Lb4:
            java.lang.String r0 = r2.getPoiId()
            r3.put(r4, r0)
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData> r1 = com.ss.android.ugc.aweme.poi.collect.PoiCollectStatusViewModel.LJLJI
            java.lang.String r0 = r2.getPoiId()
            r1.put(r0, r2)
        Lc4:
            com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData r2 = (com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData) r2
            return r2
        Lc7:
            java.util.HashMap<java.lang.String, com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData> r1 = com.ss.android.ugc.aweme.poi.collect.PoiCollectStatusViewModel.LJLJI
            java.lang.String r0 = r5.getPoiId()
            java.lang.Object r2 = r1.get(r0)
            com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData r2 = (com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData) r2
            if (r2 == 0) goto Ld6
            goto Lb2
        Ld6:
            r2 = r5
            goto Lb4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C190217dJ.LIZ(com.ss.android.ugc.aweme.feed.model.Aweme):com.ss.android.ugc.aweme.poi.anchor.PoiAnchorData");
    }
}
