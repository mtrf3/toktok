package com.ss.android.ugc.aweme.sticker;

import X.C58096Mr6;
import X.C6U9;

/* loaded from: classes3.dex */
public final class StickerContainerService implements InteractStickerContainerGetterApi {
    public static InteractStickerContainerGetterApi LIZ() {
        Object LIZ = C58096Mr6.LIZ(InteractStickerContainerGetterApi.class, false);
        if (LIZ != null) {
            return (InteractStickerContainerGetterApi) LIZ;
        }
        if (C58096Mr6.m7 == null) {
            synchronized (InteractStickerContainerGetterApi.class) {
                if (C58096Mr6.m7 == null) {
                    C58096Mr6.m7 = new StickerContainerService();
                }
            }
        }
        return C58096Mr6.m7;
    }

    @Override // com.ss.android.ugc.aweme.sticker.InteractStickerContainerGetterApi
    public final C6U9 getContainer() {
        return new C6U9();
    }
}
