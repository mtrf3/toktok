package com.ss.android.ugc.aweme.ecommerce.ug.deeplink.bean;

import X.C00F;
import X.C47261Igj;
import X.F9E;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class EcUgSparkUrlAllowlistModel extends F9E {

    @InterfaceC65349Pkn("blockParams")
    public final List<String> blockParams;

    @InterfaceC65349Pkn("enableDeepLink")
    public final boolean enableDeepLink;

    @InterfaceC65349Pkn("enableWhiteList")
    public final boolean enableWhiteList;

    @InterfaceC65349Pkn("host")
    public final List<String> host;

    @InterfaceC65349Pkn("path")
    public final List<String> path;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EcUgSparkUrlAllowlistModel() {
        /*
            r8 = this;
            r1 = 0
            r3 = 0
            r6 = 31
            r0 = r8
            r2 = r1
            r4 = r3
            r5 = r3
            r7 = r3
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.ug.deeplink.bean.EcUgSparkUrlAllowlistModel.<init>():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EcUgSparkUrlAllowlistModel copy$default(EcUgSparkUrlAllowlistModel ecUgSparkUrlAllowlistModel, boolean z, boolean z2, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = ecUgSparkUrlAllowlistModel.enableDeepLink;
        }
        if ((i & 2) != 0) {
            z2 = ecUgSparkUrlAllowlistModel.enableWhiteList;
        }
        if ((i & 4) != 0) {
            list = ecUgSparkUrlAllowlistModel.host;
        }
        if ((i & 8) != 0) {
            list2 = ecUgSparkUrlAllowlistModel.path;
        }
        if ((i & 16) != 0) {
            list3 = ecUgSparkUrlAllowlistModel.blockParams;
        }
        return ecUgSparkUrlAllowlistModel.copy(z, z2, list, list2, list3);
    }

    public final EcUgSparkUrlAllowlistModel copy(boolean z, boolean z2, List<String> host, List<String> path, List<String> blockParams) {
        o.LJIIIZ(host, "host");
        o.LJIIIZ(path, "path");
        o.LJIIIZ(blockParams, "blockParams");
        return new EcUgSparkUrlAllowlistModel(z, z2, host, path, blockParams);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{Boolean.valueOf(this.enableDeepLink), Boolean.valueOf(this.enableWhiteList), this.host, this.path, this.blockParams};
    }

    public final List<String> getBlockParams() {
        return this.blockParams;
    }

    public final boolean getEnableDeepLink() {
        return this.enableDeepLink;
    }

    public final boolean getEnableWhiteList() {
        return this.enableWhiteList;
    }

    public final List<String> getHost() {
        return this.host;
    }

    public final List<String> getPath() {
        return this.path;
    }

    public EcUgSparkUrlAllowlistModel(boolean z, boolean z2, List<String> list, List<String> list2, List<String> list3) {
        C00F.LJ(list, "host", list2, "path", list3, "blockParams");
        this.enableDeepLink = z;
        this.enableWhiteList = z2;
        this.host = list;
        this.path = list2;
        this.blockParams = list3;
    }

    public /* synthetic */ EcUgSparkUrlAllowlistModel(boolean z, boolean z2, List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) == 0 ? z2 : true, (i & 4) != 0 ? C47261Igj.LJJIJIIJI("tiktokcdn", "tiktokcdn.com") : list, (i & 8) != 0 ? C47261Igj.LJJIJIIJI("tiktok_live_ecommerce_promotion_page", "tiktok_live_new_user_deal_page", "tiktok_live_new_user_deal_page_ttf", "tiktok_live_new_user_deal_page_ttp", "tiktok_live_ecommerce_ttmal_flash_sale", "tiktok_live_ecommerce_ttmal_flash_sale_ttf", "tiktok_live_ecommerce_deal_channel_page", "tiktok_live_ecommerce_brand_discount", "tiktok_live_ecommerce_fashion_landing_page_ttf", "tiktok_live_ecommerce_ug_delivery_page", "ecom_promotion_caravel_h5") : list2, (i & 16) != 0 ? C47261Igj.LJJIJ("fallback_url") : list3);
    }
}
