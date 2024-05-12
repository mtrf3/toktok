package com.bytedance.android.livesdk.gift.base.platform.core.assets;

import X.AbstractC73672Svk;
import X.C28467BFf;
import X.E8L;
import X.E8M;
import X.EnumC29608Bjg;
import X.InterfaceC195757mF;
import X.InterfaceC64985Pev;
import X.InterfaceC64986Pew;
import X.InterfaceC65131PhH;
import com.bytedance.android.livesdk.gift.assets.AssetsListResult;

/* loaded from: classes6.dex */
public interface AssetsApi {
    @E8L("/webcast/assets/effects/")
    AbstractC73672Svk<C28467BFf<AssetsListResult>> getAssets(@InterfaceC64986Pew("download_assets_from") int i, @InterfaceC64986Pew("room_id") Long l, @InterfaceC64986Pew("bytevc1") int i2, @InterfaceC64986Pew("video_types") String str, @InterfaceC64986Pew("effect_ids") String str2);

    @InterfaceC65131PhH(EnumC29608Bjg.GIFT)
    @E8L("/webcast/assets/effects/")
    AbstractC73672Svk<C28467BFf<AssetsListResult>> getAssetsPB(@InterfaceC64986Pew("download_assets_from") int i, @InterfaceC64986Pew("room_id") Long l, @InterfaceC64986Pew("bytevc1") int i2, @InterfaceC64986Pew("video_types") String str, @InterfaceC64986Pew("effect_ids") String str2);

    @E8M("/webcast/assets/effects/")
    @InterfaceC65131PhH(EnumC29608Bjg.GIFT)
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<AssetsListResult>> getAssetsPBPost(@InterfaceC64985Pev("download_assets_from") int i, @InterfaceC64985Pev("room_id") Long l, @InterfaceC64985Pev("bytevc1") int i2, @InterfaceC64985Pev("video_types") String str, @InterfaceC64985Pev("effect_ids") String str2);

    @E8M("/webcast/assets/effects/")
    @InterfaceC195757mF
    AbstractC73672Svk<C28467BFf<AssetsListResult>> getAssetsPost(@InterfaceC64985Pev("download_assets_from") int i, @InterfaceC64985Pev("room_id") Long l, @InterfaceC64985Pev("bytevc1") int i2, @InterfaceC64985Pev("video_types") String str, @InterfaceC64985Pev("effect_ids") String str2, @InterfaceC64985Pev("is_preloading") Boolean bool, @InterfaceC64985Pev("anchor_id") Long l2, @InterfaceC64985Pev("available_device_storage") Long l3, @InterfaceC64985Pev("network_condition") Integer num);
}
