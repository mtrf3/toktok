package com.ss.android.ugc.aweme.commercialize.measurement.mrc.experiment;

import X.C47261Igj;
import X.InterfaceC65349Pkn;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class MRCImpressionEventAbModel {
    public static final List<String> LIZ = C47261Igj.LJJIJIIJI("cover", "gradual_top", "gradual_bottom", "long_press_layout", "player_view", "title_shadow", "spark_container", "view_rootview", "statusBarBackground", "ad_native_product_tile_container", "product_tile_ad_lynx_root_layout", "product_tile_ad_native_root_layout", "ad_feed_card_container", "ad_feed_card_container_v2", "live_ad_card_container", "ad_live_product_banner_container", "native_ad_bottom_label_frame", "feed_ad_lynx_mask_container_spark", "feed_ad_lynx_mask_container_bullet", "spark_ad_sticker_view", "bullet_ad_sticker_view", "ad_hybrid_default_layout", "feed_ad_lynx_super_like_spark_container", "feed_ad_lynx_super_like_bullet_container", "feed_multi_tag_layout", "spark_center_view_container", "bullet_center_view_container", "spark_ad_sticker_view", "view_interaction_fe_container", "feed_shake_egg_container", "interaction_fe_full_container", "ad_play_fun_root");

    @InterfaceC65349Pkn("enable_cache_view_id")
    public final boolean enableCacheViewId;

    @InterfaceC65349Pkn("enable_mrc")
    public final boolean enableMRC;

    @InterfaceC65349Pkn("loop_interval")
    public final long loopInterval;

    @InterfaceC65349Pkn("view_id_white_list")
    public final List<String> viewIdWhiteList;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MRCImpressionEventAbModel() {
        /*
            r8 = this;
            r1 = 0
            r3 = 0
            r4 = 0
            r6 = 15
            r0 = r8
            r5 = r3
            r7 = r4
            r0.<init>(r1, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.measurement.mrc.experiment.MRCImpressionEventAbModel.<init>():void");
    }

    public MRCImpressionEventAbModel(long j, boolean z, List<String> viewIdWhiteList, boolean z2) {
        o.LJIIIZ(viewIdWhiteList, "viewIdWhiteList");
        this.loopInterval = j;
        this.enableMRC = z;
        this.viewIdWhiteList = viewIdWhiteList;
        this.enableCacheViewId = z2;
    }

    public /* synthetic */ MRCImpressionEventAbModel(long j, boolean z, List list, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 180L : j, (i & 2) != 0 ? true : z, (i & 4) != 0 ? LIZ : list, (i & 8) != 0 ? false : z2);
    }
}
