package com.ss.android.ugc.gamora.editor.music.stream;

import X.C221108m2;
import X.C58096Mr6;
import X.C58125MrZ;
import X.C62822Ol8;
import X.XUM;
import com.ss.android.ugc.aweme.music.service.IMusicExternalService;

/* loaded from: classes11.dex */
public final class MusicStreamServiceImpl implements IMusicExternalService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C58125MrZ.LJLIL);

    public static IMusicExternalService LIZIZ() {
        Object LIZ = C58096Mr6.LIZ(IMusicExternalService.class, false);
        if (LIZ != null) {
            return (IMusicExternalService) LIZ;
        }
        if (C58096Mr6.A8 == null) {
            synchronized (IMusicExternalService.class) {
                if (C58096Mr6.A8 == null) {
                    C58096Mr6.A8 = new MusicStreamServiceImpl();
                }
            }
        }
        return C58096Mr6.A8;
    }

    @Override // com.ss.android.ugc.aweme.music.service.IMusicExternalService
    public final XUM LIZ() {
        return (XUM) this.LIZ.getValue();
    }
}
