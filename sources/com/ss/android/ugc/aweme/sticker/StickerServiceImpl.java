package com.ss.android.ugc.aweme.sticker;

import X.C58096Mr6;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;

/* loaded from: classes5.dex */
public final class StickerServiceImpl implements IStickerService {
    public static IStickerService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IStickerService.class, false);
        if (LIZ != null) {
            return (IStickerService) LIZ;
        }
        if (C58096Mr6.n7 == null) {
            synchronized (IStickerService.class) {
                if (C58096Mr6.n7 == null) {
                    C58096Mr6.n7 = new StickerServiceImpl();
                }
            }
        }
        return C58096Mr6.n7;
    }

    @Override // com.ss.android.ugc.aweme.sticker.IStickerService
    public final InteractStickerWidget LIZ() {
        return new InteractStickerWidget();
    }
}
