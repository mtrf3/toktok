package com.ss.android.ugc.gamora.editor.audio.copyrightdetect;

import X.C221108m2;
import X.C58096Mr6;
import X.C62822Ol8;
import X.C63362eC;
import X.C63372eD;
import X.C63382eE;
import X.C76800UCe;
import X.C780334l;
import X.C78613UtF;
import X.InterfaceC88472Yns;
import X.XKX;
import com.ss.android.ugc.aweme.check.IAutoSoundCheckService;
import defpackage.e1;

/* loaded from: classes2.dex */
public final class AutoSoundCheckService implements IAutoSoundCheckService {
    public final C62822Ol8 LIZ = C221108m2.LIZIZ(C63382eE.LJLIL);

    @Override // com.ss.android.ugc.aweme.check.IAutoSoundCheckService
    public final boolean LIZ() {
        return e1.LIZ(31744, "enable_long_video_audio_copyright_detection", true, false);
    }

    public static IAutoSoundCheckService LIZLLL() {
        Object LIZ = C58096Mr6.LIZ(IAutoSoundCheckService.class, false);
        if (LIZ != null) {
            return (IAutoSoundCheckService) LIZ;
        }
        if (C58096Mr6.v8 == null) {
            synchronized (IAutoSoundCheckService.class) {
                if (C58096Mr6.v8 == null) {
                    C58096Mr6.v8 = new AutoSoundCheckService();
                }
            }
        }
        return C58096Mr6.v8;
    }

    @Override // com.ss.android.ugc.aweme.check.IAutoSoundCheckService
    public final void LIZJ(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C63372eD(this, interfaceC88472Yns, null), 2);
    }

    @Override // com.ss.android.ugc.aweme.check.IAutoSoundCheckService
    public final void LIZIZ(InterfaceC88472Yns interfaceC88472Yns, boolean z) {
        XKX.LIZLLL(C780334l.LJLIL, C78613UtF.LIZJ, null, new C63362eC(this, z, interfaceC88472Yns, null), 2);
    }
}
