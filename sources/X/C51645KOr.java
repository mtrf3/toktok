package X;

import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.dsp.service.IMusicDspService;
import com.ss.android.ugc.aweme.dsp.service.MusicDspServiceEmptyImpl;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.KOr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51645KOr {
    public static final IPluginService LIZ;
    public static final IMusicDspService LIZIZ;

    static {
        IMusicDspService musicDspServiceEmptyImpl;
        Object LIZ2;
        IPluginService LIZLLL = AabPluginServiceImpl.LIZLLL();
        LIZ = LIZLLL;
        if (LIZLLL == null) {
            musicDspServiceEmptyImpl = new MusicDspServiceEmptyImpl();
        } else {
            try {
                musicDspServiceEmptyImpl = (IMusicDspService) ServiceManager.get().getService(C51646KOs.LIZ);
                if (musicDspServiceEmptyImpl instanceof MusicDspServiceEmptyImpl) {
                    try {
                        LIZ2 = Class.forName("com.ss.android.ugc.aweme.dsp.service.MusicDspServiceImpl");
                        C3C5.m7constructorimpl(LIZ2);
                    } catch (Throwable th) {
                        LIZ2 = C141335gf.LIZ(th);
                        C3C5.m7constructorimpl(LIZ2);
                    }
                    if (C3C5.m12isFailureimpl(LIZ2)) {
                        LIZ2 = null;
                    }
                    Class cls = (Class) LIZ2;
                    if (cls != null) {
                        ServiceManager.get().bind(C51646KOs.LIZ, new C51644KOq(cls)).asSingleton();
                    }
                    musicDspServiceEmptyImpl = (IMusicDspService) ServiceManager.get().getService(C51646KOs.LIZ);
                }
            } catch (Throwable unused) {
                musicDspServiceEmptyImpl = new MusicDspServiceEmptyImpl();
            }
            o.LJIIIIZZ(musicDspServiceEmptyImpl, "{\n        try {\n        …ptyImpl()\n        }\n    }");
        }
        LIZIZ = musicDspServiceEmptyImpl;
    }
}
