package com.bytedance.android.livesdk.gift.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;

/* loaded from: classes6.dex */
public final class GiftComboInfo extends F9E {

    @InterfaceC65349Pkn("combo_count")
    public Integer comboCount;

    @InterfaceC65349Pkn("combo_effect_img")
    public ImageModel comboEffectImg;

    @Override // X.F9E
    public final Object[] getObjects() {
        Integer num = this.comboCount;
        ImageModel imageModel = this.comboEffectImg;
        return new Object[]{num, num, imageModel, imageModel};
    }
}
