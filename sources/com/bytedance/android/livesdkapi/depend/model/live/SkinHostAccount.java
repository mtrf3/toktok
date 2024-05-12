package com.bytedance.android.livesdkapi.depend.model.live;

import X.F9E;
import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class SkinHostAccount extends F9E {

    @InterfaceC65349Pkn("bg_image")
    public ImageModel bgImage;

    /* JADX WARN: Multi-variable type inference failed */
    public SkinHostAccount() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ SkinHostAccount copy$default(SkinHostAccount skinHostAccount, ImageModel imageModel, int i, Object obj) {
        if ((i & 1) != 0) {
            imageModel = skinHostAccount.bgImage;
        }
        return skinHostAccount.copy(imageModel);
    }

    public final ImageModel component1() {
        return this.bgImage;
    }

    public final SkinHostAccount copy(ImageModel imageModel) {
        return new SkinHostAccount(imageModel);
    }

    @Override // X.F9E
    public Object[] getObjects() {
        return new Object[]{this.bgImage};
    }

    public SkinHostAccount(ImageModel imageModel) {
        this.bgImage = imageModel;
    }

    public /* synthetic */ SkinHostAccount(ImageModel imageModel, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : imageModel);
    }
}
