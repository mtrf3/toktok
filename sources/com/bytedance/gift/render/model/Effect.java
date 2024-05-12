package com.bytedance.gift.render.model;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class Effect {
    public String LIZ;
    public transient int LIZIZ;
    public transient boolean LIZJ;
    public transient AssetsModel LIZLLL;

    @InterfaceC65349Pkn("effect_id")
    public long assetId;

    @InterfaceC65349Pkn("gift_icon")
    public ImageModel giftIcon;

    @InterfaceC65349Pkn("gift_id")
    public long giftId;

    public final AssetsModel LIZ() {
        AssetsModel assetsModel = this.LIZLLL;
        if (assetsModel != null) {
            return assetsModel;
        }
        o.LJIJI("asset");
        throw null;
    }
}
