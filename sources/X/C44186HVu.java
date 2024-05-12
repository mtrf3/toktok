package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.modeo.IModeoInit;
import defpackage.e1;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HVu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44186HVu implements InterfaceC170826n8 {
    @Override // X.InterfaceC170826n8
    public final String LIZLLL() {
        boolean LIZ;
        boolean isModeoVersion = ((IModeoInit) ServiceManager.get().getService(IModeoInit.class)).isModeoVersion();
        C60903NvH.LJIIJJI().LJJIIJ();
        if (isModeoVersion) {
            if (C52531KjX.LIZ()) {
                LIZ = ((Boolean) C44187HVv.LIZ.getValue()).booleanValue();
            } else {
                LIZ = e1.LIZ(31744, "use_effectcam_key", true, false);
            }
            if (LIZ) {
                return "68d32050064f11e891efe7cc07299bc5";
            }
        }
        return "142710f02c3a11e8b42429f14557854a";
    }

    @Override // X.InterfaceC170826n8
    public final int LIZIZ() {
        Integer editEffectAutoDownloadSize = C2YJ.LIZIZ.LIZ.getEditEffectAutoDownloadSize();
        o.LJIIIIZZ(editEffectAutoDownloadSize, "get().editEffectAutoDownloadSize");
        return editEffectAutoDownloadSize.intValue();
    }

    @Override // X.InterfaceC170826n8
    public final List<String> LIZJ() {
        List<String> filterColors = C2YJ.LIZIZ.LIZ.getFilterColors();
        o.LJIIIIZZ(filterColors, "get().filterColors");
        return filterColors;
    }

    @Override // X.InterfaceC170826n8
    public final String getEffectSDKVersion() {
        String LIZIZ = C44172HVg.LIZIZ();
        o.LJIIIIZZ(LIZIZ, "getEffectSDKVersion()");
        return LIZIZ;
    }

    @Override // X.InterfaceC170826n8
    public final C135625Ty LIZ(ActivityC45651qj activityC45651qj) {
        return new C135625Ty(activityC45651qj, new InterfaceC135635Tz() { // from class: X.6Av
            @Override // X.InterfaceC135635Tz
            public final C82622Wbi getDiContainer() {
                return new C82622Wbi(new C82621Wbh[0]);
            }
        });
    }
}
