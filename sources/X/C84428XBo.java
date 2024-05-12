package X;

import com.ss.android.ttve.nativePort.TENativeLibsLoader;
import com.ss.android.ugc.aweme.services.effectplatform.EffectPlatformBuilder;
import defpackage.e1;

/* renamed from: X.XBo, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84428XBo implements InterfaceC84427XBn {
    public final XBC LIZ;
    public final /* synthetic */ EffectPlatformBuilder LIZIZ;

    public C84428XBo(EffectPlatformBuilder effectPlatformBuilder) {
        this.LIZIZ = effectPlatformBuilder;
        XBE.LJIIIIZZ.getClass();
        this.LIZ = C84419XBf.LIZ().LIZIZ();
    }

    @Override // X.InterfaceC84427XBn
    public final XBW<C84430XBq> LIZ(C84415XBb c84415XBb) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        try {
            FFL.LJIIIZ().getClass();
            z = FFL.LJ(31744, "creative_tools_effect_parallel_download_enabled", true, false);
        } catch (Exception unused) {
            z = false;
        }
        try {
            z2 = C146345ok.LIZ();
        } catch (Exception unused2) {
            z2 = false;
        }
        if (z || z2) {
            if (e1.LIZ(31744, "creative_tools_effect_download_pause_resume_enabled", true, false) || z2) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!e1.LIZ(31744, "creative_tools_effect_parallel_download_enabled", true, false) && !z2 && !this.LIZIZ.isSingleton()) {
                z4 = false;
            }
            c84415XBb.LJLJJI = new XAT(z3, z4, new String[]{"default", "effect", "editingeffect"});
        }
        TENativeLibsLoader.loadLibrary();
        return this.LIZ.LIZ(c84415XBb);
    }
}
