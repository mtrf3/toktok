package X;

import Y.IDfS125S0100000;
import com.bytedance.android.live.effect.bgeffect.BgEffectViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.EffectBroadcastLifecycle$fetchBgPanelEffectList$1$1", f = "EffectBroadcastLifecycle.kt", l = {158}, m = "invokeSuspend")
/* renamed from: X.2Bd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C54292Bd extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ BgEffectViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C54292Bd(BgEffectViewModel bgEffectViewModel, InterfaceC67352kd<? super C54292Bd> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = bgEffectViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C54292Bd c54292Bd = new C54292Bd(this.LJLJI, interfaceC67352kd);
        c54292Bd.LJLILLLLZI = obj;
        return c54292Bd;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC70422pa interfaceC70422pa;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            this.LJLJI.wv0("solo");
            BgEffectViewModel bgEffectViewModel = this.LJLJI;
            XLL xll = bgEffectViewModel.LJLJI;
            IDfS125S0100000 iDfS125S0100000 = new IDfS125S0100000(bgEffectViewModel, 14);
            this.LJLILLLLZI = interfaceC70422pa;
            this.LJLIL = 1;
            if (xll.collect(iDfS125S0100000, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        C48841JEv.LIZJ(interfaceC70422pa, null);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
