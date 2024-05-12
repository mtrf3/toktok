package X;

import android.os.Bundle;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WVn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82399WVn extends AbstractC65781Prl implements InterfaceC88472Yns<EffectListResponse, C76800UCe> {
    public final /* synthetic */ InterfaceC82400WVo LJLIL;
    public final /* synthetic */ List LJLILLLLZI;
    public final /* synthetic */ Effect LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ Bundle LJLJJL;
    public final /* synthetic */ InterfaceC74398THu LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82399WVn(InterfaceC82400WVo interfaceC82400WVo, InterfaceC82403WVr interfaceC82403WVr, List list, Effect effect, boolean z, Bundle bundle, InterfaceC74398THu interfaceC74398THu) {
        super(1);
        this.LJLIL = interfaceC82400WVo;
        this.LJLILLLLZI = list;
        this.LJLJI = effect;
        this.LJLJJI = z;
        this.LJLJJL = bundle;
        this.LJLJJLL = interfaceC74398THu;
    }

    @Override // X.InterfaceC88472Yns
    public final /* bridge */ /* synthetic */ C76800UCe invoke(EffectListResponse effectListResponse) {
        LIZ(effectListResponse);
        return C76800UCe.LIZ;
    }

    public final void LIZ(EffectListResponse response) {
        int i;
        o.LJIIIZ(response, "response");
        List<Effect> collection = response.getCollection();
        if (collection != null && !collection.isEmpty()) {
            C82398WVm.LJFF(this.LJLIL, collection);
            this.LJLIL.LLLLL().LJIIZILJ((Effect) ORZ.LJLLJ(collection));
        }
        InterfaceC46204IBk LLZL = this.LJLIL.LLZL();
        Effect effect = this.LJLJI;
        o.LJI(effect);
        if (this.LJLJJI) {
            i = 1;
        } else {
            i = -1;
        }
        LLZL.LIZJ(J8V.LJI(effect, i, EnumC44267HYx.MANUAL_SET, null, this.LJLJJL, this.LJLJJLL, null, 0, false, null, 484));
    }
}
