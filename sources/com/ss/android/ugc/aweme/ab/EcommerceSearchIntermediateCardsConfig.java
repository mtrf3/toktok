package com.ss.android.ugc.aweme.ab;

import X.C47261Igj;
import X.InterfaceC65349Pkn;
import com.ss.android.ugc.aweme.discover.mixfeed.DynamicPatch;
import com.ss.android.ugc.aweme.model.EcommerceDynamicData;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class EcommerceSearchIntermediateCardsConfig {
    public static DynamicDataList LIZ = new DynamicDataList();
    public static final List<EcommerceDynamicData> LIZIZ;

    static {
        DynamicPatch dynamicPatch = new DynamicPatch();
        dynamicPatch.schema = "aweme://lynxview/?channel=fe_tiktok_ecommerce_search_transfer&bundle=pages/search-transfer-bk/template.js&group=fe_tiktok_ecommerce_search_transfer&dynamic=1&ab_params=history_streaming_style";
        LIZIZ = C47261Igj.LJJIJIL(new EcommerceDynamicData(0, dynamicPatch, 1, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r1 == true) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List LIZ() {
        /*
            com.bytedance.ies.abmock.SettingsManager r3 = com.bytedance.ies.abmock.SettingsManager.LIZLLL()     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = "ecom_search_intermediate_config"
            java.lang.Class<com.ss.android.ugc.aweme.ab.EcommerceSearchIntermediateCardsConfig$DynamicDataList> r1 = com.ss.android.ugc.aweme.ab.EcommerceSearchIntermediateCardsConfig.DynamicDataList.class
            com.ss.android.ugc.aweme.ab.EcommerceSearchIntermediateCardsConfig$DynamicDataList r0 = com.ss.android.ugc.aweme.ab.EcommerceSearchIntermediateCardsConfig.LIZ     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r3.LJIIIIZZ(r2, r1, r0)     // Catch: java.lang.Throwable -> L12
            com.ss.android.ugc.aweme.ab.EcommerceSearchIntermediateCardsConfig$DynamicDataList r0 = (com.ss.android.ugc.aweme.ab.EcommerceSearchIntermediateCardsConfig.DynamicDataList) r0     // Catch: java.lang.Throwable -> L12
            com.ss.android.ugc.aweme.ab.EcommerceSearchIntermediateCardsConfig.LIZ = r0     // Catch: java.lang.Throwable -> L12
        L12:
            com.ss.android.ugc.aweme.ab.EcommerceSearchIntermediateCardsConfig$DynamicDataList r0 = com.ss.android.ugc.aweme.ab.EcommerceSearchIntermediateCardsConfig.LIZ
            if (r0 == 0) goto L35
            java.util.List r0 = r0.getDefaultConfigs()
            if (r0 == 0) goto L35
            boolean r1 = r0.isEmpty()
            r0 = 1
            if (r1 != r0) goto L35
        L23:
            if (r0 == 0) goto L28
            java.util.List<com.ss.android.ugc.aweme.model.EcommerceDynamicData> r0 = com.ss.android.ugc.aweme.ab.EcommerceSearchIntermediateCardsConfig.LIZIZ
        L27:
            return r0
        L28:
            com.ss.android.ugc.aweme.ab.EcommerceSearchIntermediateCardsConfig$DynamicDataList r0 = com.ss.android.ugc.aweme.ab.EcommerceSearchIntermediateCardsConfig.LIZ
            if (r0 == 0) goto L32
            java.util.List r0 = r0.getDefaultConfigs()
            if (r0 != 0) goto L27
        L32:
            java.util.List<com.ss.android.ugc.aweme.model.EcommerceDynamicData> r0 = com.ss.android.ugc.aweme.ab.EcommerceSearchIntermediateCardsConfig.LIZIZ
            goto L27
        L35:
            r0 = 0
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ab.EcommerceSearchIntermediateCardsConfig.LIZ():java.util.List");
    }

    /* loaded from: classes9.dex */
    public static final class DynamicDataList implements Serializable {

        @InterfaceC65349Pkn("data_list")
        public List<EcommerceDynamicData> defaultConfigs = new ArrayList();

        public final List<EcommerceDynamicData> getDefaultConfigs() {
            return this.defaultConfigs;
        }

        public final void setDefaultConfigs(List<EcommerceDynamicData> list) {
            o.LJIIIZ(list, "<set-?>");
            this.defaultConfigs = list;
        }
    }
}
