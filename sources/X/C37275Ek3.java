package X;

import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import kotlin.jvm.internal.o;

/* renamed from: X.Ek3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37275Ek3 implements InterfaceC36621EYv, IAVEffectService.IAVEffectReadyCallback {
    public final /* synthetic */ XJL LJLIL;

    public /* synthetic */ C37275Ek3(XKS xks) {
        this.LJLIL = xks;
    }

    @Override // com.ss.android.ugc.aweme.services.external.ability.IAVEffectService.IAVEffectReadyCallback
    public void finish(Object obj) {
        if (obj == null) {
            XJL xjl = this.LJLIL;
            C3C4 LIZ = C141335gf.LIZ(new RuntimeException("effect so fail"));
            C3C5.m7constructorimpl(LIZ);
            xjl.resumeWith(LIZ);
            return;
        }
        XJL xjl2 = this.LJLIL;
        C3C5.m7constructorimpl(obj);
        xjl2.resumeWith(obj);
    }

    @Override // X.InterfaceC36621EYv
    public void LIZJ(InterfaceC37276Ek4 call, Throwable t) {
        o.LJIIIZ(call, "call");
        o.LJIIIZ(t, "t");
        XJL xjl = this.LJLIL;
        C3C4 LIZ = C141335gf.LIZ(t);
        C3C5.m7constructorimpl(LIZ);
        xjl.resumeWith(LIZ);
    }

    @Override // X.InterfaceC36621EYv
    public void LJII(InterfaceC37276Ek4 call, C64797Pbt response) {
        o.LJIIIZ(call, "call");
        o.LJIIIZ(response, "response");
        if (response.LIZIZ()) {
            XJL xjl = this.LJLIL;
            Object obj = response.LIZIZ;
            C3C5.m7constructorimpl(obj);
            xjl.resumeWith(obj);
            return;
        }
        XJL xjl2 = this.LJLIL;
        C3C4 LIZ = C141335gf.LIZ(new EPU(response));
        C3C5.m7constructorimpl(LIZ);
        xjl2.resumeWith(LIZ);
    }
}
