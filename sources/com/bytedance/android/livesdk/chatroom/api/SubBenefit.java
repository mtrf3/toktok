package com.bytedance.android.livesdk.chatroom.api;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;

/* loaded from: classes6.dex */
public final class SubBenefit extends F9E {

    @InterfaceC65349Pkn("background_color")
    public String backgroundColor;

    @InterfaceC65349Pkn("benefit_description")
    public String benefitDescription;

    @InterfaceC65349Pkn("benefit_image")
    public ImageModel benefitImage;

    @InterfaceC65349Pkn("benefit_type")
    public int benefitType;

    @Override // X.F9E
    public final Object[] getObjects() {
        ImageModel imageModel = this.benefitImage;
        String str = this.benefitDescription;
        return new Object[]{Integer.valueOf(this.benefitType), imageModel, imageModel, str, str};
    }
}
