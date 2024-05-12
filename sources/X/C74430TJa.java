package X;

import Y.IDuS20S0300000_12;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.TJa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C74430TJa extends R30<C76800UCe, C74438TJi, C74438TJi, List<? extends String>> {
    public final String LIZJ;
    public final InterfaceC84497XEf LIZLLL;

    @Override // X.InterfaceC68907R2p
    public final Object LJFF(Object req) {
        o.LJIIIZ(req, "req");
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.String] */
    @Override // X.R30
    public final AbstractC73672Svk<List<? extends String>> LJII(C74438TJi c74438TJi) {
        C74438TJi req = c74438TJi;
        o.LJIIIZ(req, "req");
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = req.LJLIL.getEffectId();
        if (ID0.LJIILJJIL(req.LJLIL)) {
            c68322mC.element = String.valueOf(req.LJLIL.getEffect_source_id());
        }
        return AbstractC73672Svk.LJIIJ(new IDuS20S0300000_12(this, c68322mC, req, 1));
    }

    public C74430TJa(String panel, InterfaceC84497XEf effectPlatform) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(effectPlatform, "effectPlatform");
        this.LIZJ = panel;
        this.LIZLLL = effectPlatform;
    }

    @Override // X.InterfaceC68907R2p
    public final Object LJI(Object req, Object resp) {
        o.LJIIIZ(req, "req");
        o.LJIIIZ(resp, "resp");
        return req;
    }
}
