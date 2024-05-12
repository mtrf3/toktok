package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ImageListViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ImageListViewModel$disableCurrentEffectAndAutoDisplay$1", f = "ImageListViewModel.kt", l = {222}, m = "invokeSuspend")
/* renamed from: X.S5r, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71535S5r extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ImageListViewModel LJLILLLLZI;
    public final /* synthetic */ InterfaceC07990Tb LJLJI;
    public final /* synthetic */ LiveEffect LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71535S5r(ImageListViewModel imageListViewModel, InterfaceC07990Tb interfaceC07990Tb, LiveEffect liveEffect, InterfaceC67352kd<? super C71535S5r> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = imageListViewModel;
        this.LJLJI = interfaceC07990Tb;
        this.LJLJJI = liveEffect;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71535S5r(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        if (i != 0) {
            if (i == 1) {
                C141335gf.LIZJ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj);
            C71562S6s c71562S6s = this.LJLILLLLZI.LJLJJI;
            InterfaceC07990Tb interfaceC07990Tb = this.LJLJI;
            LiveEffect liveEffect = this.LJLJJI;
            this.LJLIL = 1;
            if (c71562S6s.LIZ(interfaceC07990Tb, liveEffect, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
