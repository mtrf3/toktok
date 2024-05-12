package com.ss.android.ugc.aweme.poi.detail.v2;

import X.C189927cq;
import X.C35Z;
import X.C73969T1h;
import X.InterfaceC64592gB;
import X.T16;
import Y.AfS2S0100100_3;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import java.util.List;

/* loaded from: classes4.dex */
public final class PoiDetailYmalViewModel extends AssemViewModel<C35Z> {
    public List<PoiListApi.PoiYMALModel> LJLIL;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C35Z defaultState() {
        return new C35Z(this.LJLIL);
    }

    public final void gv0(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        PoiListApi.LIZ.getClass();
        C189927cq.LIZ().getPoiYMAL(str).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS2S0100100_3(currentTimeMillis, this, 2), new InterfaceC64592gB() { // from class: X.7d4
            @Override // X.InterfaceC64592gB
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
    
        if (r11 != null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void hv0(java.lang.String r34, boolean r35) {
        /*
            r33 = this;
            java.lang.String r0 = "poiId"
            r13 = r34
            kotlin.jvm.internal.o.LJIIIZ(r13, r0)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r14 = r33
            java.util.List<com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiYMALModel> r0 = r14.LJLIL
            if (r0 == 0) goto Lbd
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r17 = r0.iterator()
            r3 = 0
            r1 = 0
        L1a:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto Laf
            java.lang.Object r11 = r17.next()
            int r16 = r1 + 1
            r0 = 0
            if (r1 < 0) goto Lab
            com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiYMALModel r11 = (com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiYMALModel) r11
            if (r11 == 0) goto La9
            com.ss.android.ugc.aweme.poi.detail.container.model.PoiBasicInfo r1 = r11.basicInfo
            if (r1 == 0) goto La9
            java.lang.String r1 = r1.id
        L33:
            boolean r1 = kotlin.jvm.internal.o.LJ(r1, r13)
            if (r1 == 0) goto La5
            if (r11 == 0) goto L94
            com.ss.android.ugc.aweme.poi.detail.container.model.PoiBasicInfo r1 = r11.basicInfo
            if (r1 == 0) goto L4d
            java.lang.Boolean r2 = r1.isCollected
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r35)
            boolean r1 = kotlin.jvm.internal.o.LJ(r2, r1)
            if (r1 != 0) goto La5
            if (r11 == 0) goto L94
        L4d:
            com.ss.android.ugc.aweme.poi.detail.container.model.PoiBasicInfo r1 = r11.basicInfo
            if (r1 == 0) goto L94
            java.lang.Boolean r24 = java.lang.Boolean.valueOf(r35)
            java.lang.String r0 = r1.id
            r19 = r0
            java.lang.String r0 = r1.name
            r20 = r0
            java.lang.String r15 = r1.address
            java.lang.Long r10 = r1.videoCount
            com.ss.android.ugc.aweme.base.model.UrlModel r9 = r1.cover
            java.lang.String r8 = r1.collectInfo
            java.lang.String r7 = r1.typeLevel
            com.ss.android.ugc.aweme.poi.detail.container.model.FatherPoiModel r6 = r1.fatherPoi
            java.lang.String r5 = r1.cityCode
            java.lang.String r4 = r1.regionCode
            java.lang.String r3 = r1.poiInfoSource
            com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiLocation r2 = r1.poiLocation
            java.lang.String r1 = r1.categoryName
            com.ss.android.ugc.aweme.poi.detail.container.model.PoiBasicInfo r0 = new com.ss.android.ugc.aweme.poi.detail.container.model.PoiBasicInfo
            r27 = r6
            r28 = r5
            r29 = r4
            r30 = r3
            r31 = r2
            r32 = r1
            r22 = r10
            r23 = r9
            r25 = r8
            r26 = r7
            r18 = r0
            r19 = r19
            r20 = r20
            r21 = r15
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
        L94:
            java.util.List<java.lang.String> r3 = r11.subTags
            java.lang.String r2 = r11.trackInfo
            com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiYMALModel r1 = new com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiYMALModel
            r1.<init>(r0, r3, r2)
            r12.add(r1)
            r3 = 1
        La1:
            r1 = r16
            goto L1a
        La5:
            r12.add(r11)
            goto La1
        La9:
            r1 = r0
            goto L33
        Lab:
            X.C47261Igj.LJJJJJ()
            throw r0
        Laf:
            if (r3 == 0) goto Lbd
            r14.LJLIL = r12
            kotlin.jvm.internal.AqS134S0200000_3 r1 = new kotlin.jvm.internal.AqS134S0200000_3
            r0 = 124(0x7c, float:1.74E-43)
            r1.<init>(r14, r12, r0)
            r14.withState(r1)
        Lbd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.detail.v2.PoiDetailYmalViewModel.hv0(java.lang.String, boolean):void");
    }
}
