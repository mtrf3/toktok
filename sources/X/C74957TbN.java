package X;

import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TbN, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74957TbN {
    public static InterfaceC31981Ni LIZ() {
        InterfaceC06390Mx LIZ = CN1.LIZ(IEffectService.class);
        o.LJIIIIZZ(LIZ, "getService(T::class.java)");
        InterfaceC31981Ni composerManagerB = ((IEffectService) LIZ).composerManagerB();
        o.LJIIIIZZ(composerManagerB, "{\n                servic…/ singleton\n            }");
        return composerManagerB;
    }

    public static void LIZIZ(InterfaceC31981Ni interfaceC31981Ni) {
        int i;
        if (C29306Beo.LJIILLIIL(Boolean.TRUE)) {
            return;
        }
        InterfaceC06390Mx LIZ = CN1.LIZ(IEffectService.class);
        o.LJIIIIZZ(LIZ, "getService(T::class.java)");
        InterfaceC31981Ni composerManagerB = ((IEffectService) LIZ).composerManagerB();
        if (interfaceC31981Ni != null) {
            composerManagerB.LIZLLL("liveguestbeauty");
            List<LiveEffect> LIZ2 = interfaceC31981Ni.LIZ("liveguestbeauty");
            if (LIZ2 != null) {
                for (LiveEffect beauty : LIZ2) {
                    o.LJIIIIZZ(beauty, "beauty");
                    composerManagerB.LJJII(beauty);
                    LiveEffect.ComposerConfig composerConfig = (LiveEffect.ComposerConfig) ORZ.LJLLLL(beauty.composerConfigList);
                    if (composerConfig != null) {
                        i = composerConfig.LIZ;
                    } else {
                        i = 0;
                    }
                    composerManagerB.LJ(i, beauty);
                }
            }
        }
    }
}
