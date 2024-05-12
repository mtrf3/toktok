package com.ss.android.ugc.aweme.ecommercelive.common.data;

import X.InterfaceC65349Pkn;
import android.os.SystemClock;
import com.bytedance.android.livesdk.model.message.ext.HotTag;
import com.ss.android.ugc.aweme.ecommercelive.business.common.data.AtmosphereTag;
import java.util.List;

/* loaded from: classes13.dex */
public final class OecInitData {

    @InterfaceC65349Pkn("atmosphere_tags")
    public final List<AtmosphereTag> atmosphereTags;

    @InterfaceC65349Pkn("bag_animation")
    public final String bagAnimation;

    @InterfaceC65349Pkn("bag_index")
    public final int bagIndex;

    @InterfaceC65349Pkn("display_product_num")
    public final int displayProductNum;

    @InterfaceC65349Pkn("hot_tag")
    public final HotTag hotTag;

    @InterfaceC65349Pkn("is_new_user")
    public final boolean isNewUser;

    @InterfaceC65349Pkn("is_new_user_fixed")
    public final boolean isNewUserFixed;

    @InterfaceC65349Pkn("pin_atmosphere_tags")
    public final List<AtmosphereTag> pinAtmosphereTags;

    @InterfaceC65349Pkn("pin_card_minimalism")
    public final int pinCardMinimalism;

    @InterfaceC65349Pkn("pop_product_id")
    public final String popProductId;

    @InterfaceC65349Pkn("pop_product")
    public final Product product;

    @InterfaceC65349Pkn("product_num")
    public final int productNum;

    @InterfaceC65349Pkn("promotion_skin")
    public final PromotionSkin promotionSkin;

    @InterfaceC65349Pkn("schema")
    public final String schema;

    @InterfaceC65349Pkn("server_time")
    public final long serverTime;
    public final long LIZ = SystemClock.elapsedRealtime();

    @InterfaceC65349Pkn("live_bag_and_pin_card_type")
    public final int liveBagAndPinCardType = 1;
}
