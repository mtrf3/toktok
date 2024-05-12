package com.bytedance.android.livesdk.gift.model;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;

/* loaded from: classes17.dex */
public final class CollectionEffect extends F9E {

    @InterfaceC65349Pkn("effect_content")
    public String effectContent;

    @InterfaceC65349Pkn("effect_id")
    public Long effectId;

    @InterfaceC65349Pkn("effect_name")
    public String effectName;

    @InterfaceC65349Pkn("first_contributor")
    public CollectionUser firstContributor;

    @InterfaceC65349Pkn("has_been_collected")
    public Boolean hasBeenCollected;

    @InterfaceC65349Pkn("img")
    public ImageModel img;

    @InterfaceC65349Pkn("is_rare_effect")
    public Boolean isRareEffect;

    @InterfaceC65349Pkn("non_activated_img")
    public ImageModel nonActivatedImg;

    @Override // X.F9E
    public final Object[] getObjects() {
        Long l = this.effectId;
        String str = this.effectName;
        String str2 = this.effectContent;
        CollectionUser collectionUser = this.firstContributor;
        Boolean bool = this.isRareEffect;
        Boolean bool2 = this.hasBeenCollected;
        ImageModel imageModel = this.img;
        ImageModel imageModel2 = this.nonActivatedImg;
        return new Object[]{l, l, str, str, str2, str2, collectionUser, collectionUser, bool, bool, bool2, bool2, imageModel, imageModel, imageModel2, imageModel2};
    }
}
