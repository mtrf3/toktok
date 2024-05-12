package com.bytedance.android.livesdk.gift.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;

/* loaded from: classes6.dex */
public final class GiftColorInfo extends F9E {

    @InterfaceC65349Pkn("color_effect_id")
    public Long colorEffectId;

    @InterfaceC65349Pkn("color_id")
    public Long colorId;

    @InterfaceC65349Pkn("color_image")
    public ImageModel colorImage;

    @InterfaceC65349Pkn("color_name")
    public String colorName;

    @InterfaceC65349Pkn("color_values")
    public List<String> colorValues;

    @InterfaceC65349Pkn("gift_image")
    public ImageModel giftImage;

    @InterfaceC65349Pkn("is_default")
    public boolean isDefault;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.colorId;
        String str = this.colorName;
        List<String> list = this.colorValues;
        ImageModel imageModel = this.colorImage;
        ImageModel imageModel2 = this.giftImage;
        Long l2 = this.colorEffectId;
        return new Object[]{l, l, str, str, list, list, list, imageModel, imageModel, imageModel2, imageModel2, l2, l2, Boolean.valueOf(this.isDefault)};
    }
}
