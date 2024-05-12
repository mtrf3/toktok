package com.ss.android.ugc.bytebench;

import X.C58096Mr6;
import X.InterfaceC44997HlJ;
import com.ss.android.ugc.aweme.bl.EditorStickerDowngradeService;

/* loaded from: classes8.dex */
public final class EditorStickerDowngradeServiceImpl implements EditorStickerDowngradeService {
    public static EditorStickerDowngradeService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(EditorStickerDowngradeService.class, false);
        if (LIZ != null) {
            return (EditorStickerDowngradeService) LIZ;
        }
        if (C58096Mr6.f88q8 == null) {
            synchronized (EditorStickerDowngradeService.class) {
                if (C58096Mr6.f88q8 == null) {
                    C58096Mr6.f88q8 = new EditorStickerDowngradeServiceImpl();
                }
            }
        }
        return C58096Mr6.f88q8;
    }

    @Override // com.ss.android.ugc.aweme.bl.EditorStickerDowngradeService
    public final boolean LIZ() {
        return InterfaceC44997HlJ.LJIILIIL.isDowngrade();
    }
}
