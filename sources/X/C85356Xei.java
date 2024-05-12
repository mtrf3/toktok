package X;

import com.ss.android.ugc.aweme.poi.videopublish.v2.rcmdcell.PoiPublishRcmdListCell;

/* renamed from: X.Xei, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85356Xei implements InterfaceC19530ph {
    public final /* synthetic */ PoiPublishRcmdListCell LIZ;

    public C85356Xei(PoiPublishRcmdListCell poiPublishRcmdListCell) {
        this.LIZ = poiPublishRcmdListCell;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b5, code lost:
    
        if (r4 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c0, code lost:
    
        if (r1 != null) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    @Override // X.InterfaceC19530ph
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(android.view.View r13, java.lang.String r14) {
        /*
            r12 = this;
            java.lang.String r0 = "itemID"
            kotlin.jvm.internal.o.LJIIIZ(r14, r0)
            com.ss.android.ugc.aweme.poi.videopublish.v2.rcmdcell.PoiPublishRcmdListCell r0 = r12.LIZ
            androidx.lifecycle.LifecycleOwner r0 = r0.getParent()
            r11 = 0
            if (r0 == 0) goto L1d
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            if (r0 == 0) goto L1d
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
        L18:
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r1 != r0) goto L1f
            return
        L1d:
            r1 = r11
            goto L18
        L1f:
            com.ss.android.ugc.aweme.poi.videopublish.v2.rcmdcell.PoiPublishRcmdListCell r0 = r12.LIZ
            com.ss.android.ugc.aweme.poi.videopublish.v2.PoiPublishExtensionVMV2 r1 = r0.L()
            X.Xf1 r0 = X.C85375Xf1.LJLIL
            java.lang.Object r1 = X.C212418Vh.LJIIJJI(r1, r0)
            com.ss.android.ugc.aweme.poi.api.PoiSearchApi$PoiSearchResultWrapper r1 = (com.ss.android.ugc.aweme.poi.api.PoiSearchApi.PoiSearchResultWrapper) r1
            if (r1 == 0) goto Lbf
            com.ss.android.ugc.aweme.poi.api.PoiSearchApi$PoiSearchResult r0 = r1.poiSearchResult
            if (r0 == 0) goto Lbf
            java.lang.String r10 = r0.getLogId()
        L37:
            com.ss.android.ugc.aweme.poi.api.PoiSearchApi$PoiSearchResult r0 = r1.poiSearchResult
            if (r0 == 0) goto Lc4
            java.util.List r4 = r0.getPoiList()
        L3f:
            com.ss.android.ugc.aweme.poi.videopublish.v2.rcmdcell.PoiPublishRcmdListCell r0 = r12.LIZ
            X.Mm4 r0 = r0.getItem()
            X.Xen r0 = (X.C85361Xen) r0
            r3 = 0
            r2 = 1
            if (r0 == 0) goto Lb8
            boolean r0 = r0.LJLJI
            if (r0 != r2) goto Lb8
            com.ss.android.ugc.aweme.poi.videopublish.v2.rcmdcell.PoiPublishRcmdListCell r0 = r12.LIZ
            int r1 = r0.getLayoutPosition()
            int r1 = r1 - r2
        L56:
            if (r4 == 0) goto L5c
            int r3 = r4.size()
        L5c:
            if (r1 < 0) goto L60
            if (r1 < r3) goto L61
        L60:
            return
        L61:
            if (r4 == 0) goto Lb4
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r1)
            com.ss.android.ugc.aweme.poi.PoiData r0 = (com.ss.android.ugc.aweme.poi.PoiData) r0
            if (r0 == 0) goto Lb4
            java.lang.String r8 = r0.getPoiId()
        L6f:
            java.lang.Object r11 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r1)
            com.ss.android.ugc.aweme.poi.PoiData r11 = (com.ss.android.ugc.aweme.poi.PoiData) r11
        L75:
            com.ss.android.ugc.aweme.poi.videopublish.v2.rcmdcell.PoiPublishRcmdListCell r0 = r12.LIZ
            X.Mm4 r0 = r0.getItem()
            X.Xen r0 = (X.C85361Xen) r0
            if (r0 == 0) goto L60
            X.Xel r3 = r0.LJLILLLLZI
            if (r3 == 0) goto L60
            com.ss.android.ugc.aweme.poi.videopublish.v2.rcmdcell.PoiPublishRcmdListCell r2 = r12.LIZ
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r0 = r3.LJLILLLLZI
            com.ss.android.ugc.aweme.services.publish.MobParam r0 = r0.getMobParam()
            java.lang.String r4 = r0.getCreationId()
            com.ss.android.ugc.aweme.services.publish.AVPublishContentType r0 = r3.LJLIL
            java.lang.String r5 = r0.getContentType()
            com.ss.android.ugc.aweme.services.publish.ExtensionMisc r0 = r3.LJLILLLLZI
            com.ss.android.ugc.aweme.services.publish.MobParam r0 = r0.getMobParam()
            java.lang.String r6 = r0.getShootWay()
            X.XeR r0 = r2.LJLJJLL
            boolean r0 = r0.LIZJ()
            if (r0 == 0) goto Lb1
            java.lang.String r7 = "1"
        La9:
            java.lang.String r9 = java.lang.String.valueOf(r1)
            X.C225248si.LJJIFFI(r4, r5, r6, r7, r8, r9, r10, r11)
            goto L60
        Lb1:
            java.lang.String r7 = "0"
            goto La9
        Lb4:
            r8 = r11
            if (r4 == 0) goto L75
            goto L6f
        Lb8:
            com.ss.android.ugc.aweme.poi.videopublish.v2.rcmdcell.PoiPublishRcmdListCell r0 = r12.LIZ
            int r1 = r0.getLayoutPosition()
            goto L56
        Lbf:
            r10 = r11
            if (r1 == 0) goto Lc4
            goto L37
        Lc4:
            r4 = r11
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C85356Xei.LIZ(android.view.View, java.lang.String):void");
    }
}
