package X;

import Y.IDfS21S0200000_1;
import android.view.View;
import com.ss.android.ugc.aweme.casting.ui.playback.feed.InteractInfoTVCastAssem;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.casting.ui.playback.feed.InteractInfoTVCastAssem$onViewCreated$1", f = "InteractInfoTVCastAssem.kt", l = {141}, m = "invokeSuspend")
/* renamed from: X.2qh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71112qh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ InteractInfoTVCastAssem LJLILLLLZI;
    public final /* synthetic */ View LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C71112qh(InteractInfoTVCastAssem interactInfoTVCastAssem, View view, InterfaceC67352kd<? super C71112qh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = interactInfoTVCastAssem;
        this.LJLJI = view;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C71112qh(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            XLM xlm = C71042qa.LIZJ;
            IDfS21S0200000_1 iDfS21S0200000_1 = new IDfS21S0200000_1(this.LJLILLLLZI, this.LJLJI, 1);
            this.LJLIL = 1;
            if (xlm.collect(iDfS21S0200000_1, this) == enumC58928NAu) {
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
