package com.ss.android.ugc.aweme.album;

import X.C58096Mr6;
import X.HVB;
import X.HVC;

/* loaded from: classes8.dex */
public final class ToolsAlbumServiceImpl implements IToolsAlbumService {
    public static IToolsAlbumService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IToolsAlbumService.class, false);
        if (LIZ != null) {
            return (IToolsAlbumService) LIZ;
        }
        if (C58096Mr6.LLI == null) {
            synchronized (IToolsAlbumService.class) {
                if (C58096Mr6.LLI == null) {
                    C58096Mr6.LLI = new ToolsAlbumServiceImpl();
                }
            }
        }
        return C58096Mr6.LLI;
    }

    @Override // com.ss.android.ugc.aweme.album.IToolsAlbumService
    public final HVB LIZ(HVC hvc) {
        return new HVB(hvc);
    }
}
