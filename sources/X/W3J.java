package X;

import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoViewModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoViewModel$processFavoritesClicked$2$1$1$1", f = "EffectInfoViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class W3J extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ InterfaceC74443TJn LJLIL;
    public final /* synthetic */ Boolean LJLILLLLZI;
    public final /* synthetic */ EffectInfoViewModel LJLJI;
    public final /* synthetic */ Effect LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W3J(EffectInfoViewModel effectInfoViewModel, InterfaceC74443TJn interfaceC74443TJn, Effect effect, Boolean bool, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = interfaceC74443TJn;
        this.LJLILLLLZI = bool;
        this.LJLJI = effectInfoViewModel;
        this.LJLJJI = effect;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new W3J(this.LJLJI, this.LJLIL, this.LJLJJI, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC74443TJn interfaceC74443TJn = this.LJLIL;
        if (interfaceC74443TJn != null) {
            boolean z = false;
            if (this.LJLILLLLZI != null && (!r0.booleanValue())) {
                z = true;
            }
            interfaceC74443TJn.LJIILIIL(z);
        }
        this.LJLJI.Xv0(this.LJLJJI, o.LJ(this.LJLILLLLZI, Boolean.TRUE));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
