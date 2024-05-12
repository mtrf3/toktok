package X;

import Y.IDuS81S0200000_12;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TJG extends R30<C76800UCe, CategoryPageModel, TJI, CategoryPageModel> {
    public final String LIZJ;
    public final InterfaceC84497XEf LIZLLL;
    public final C5H3<InterfaceC74429TIz> LJ;

    @Override // X.InterfaceC68907R2p
    public final Object LJFF(Object req) {
        o.LJIIIZ(req, "req");
        return C76800UCe.LIZ;
    }

    @Override // X.R30
    public final AbstractC73672Svk<CategoryPageModel> LJII(TJI tji) {
        TJJ LIZJ;
        TJI req = tji;
        o.LJIIIZ(req, "req");
        TI9 ti9 = this.LJ.getValue().LIZLLL().get(req.LIZ);
        if (ti9 != null && (LIZJ = ti9.LIZJ()) != null) {
            return LIZJ.LIZIZ(req).LJJIJL(C78555UsJ.LJLIL);
        }
        return AbstractC73672Svk.LJIIJ(new IDuS81S0200000_12(this, req, 1));
    }

    @Override // X.InterfaceC68907R2p
    public final Object LJI(Object req, Object resp) {
        o.LJIIIZ(req, "req");
        o.LJIIIZ(resp, "resp");
        return resp;
    }

    public TJG(String panel, InterfaceC84497XEf effectPlatform, C62822Ol8 c62822Ol8) {
        o.LJIIIZ(panel, "panel");
        o.LJIIIZ(effectPlatform, "effectPlatform");
        this.LIZJ = panel;
        this.LIZLLL = effectPlatform;
        this.LJ = c62822Ol8;
    }
}
