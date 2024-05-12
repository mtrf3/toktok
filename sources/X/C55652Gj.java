package X;

import Y.IDfS125S0100000;
import com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyFragment;
import com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyFragment$observeViewModel$1", f = "LiveSmallItemBeautyFragment.kt", l = {179}, m = "invokeSuspend")
/* renamed from: X.2Gj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55652Gj extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ LiveSmallItemBeautyFragment LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55652Gj(LiveSmallItemBeautyFragment liveSmallItemBeautyFragment, InterfaceC67352kd<? super C55652Gj> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = liveSmallItemBeautyFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C55652Gj(this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        XLM xlm;
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
            LiveSmallItemBeautyFragment liveSmallItemBeautyFragment = this.LJLILLLLZI;
            LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel = liveSmallItemBeautyFragment.LJLJJI;
            if (liveSmallItemBeautyViewModel != null && (xlm = liveSmallItemBeautyViewModel.LJLJJL) != null) {
                IDfS125S0100000 iDfS125S0100000 = new IDfS125S0100000(liveSmallItemBeautyFragment, 52);
                this.LJLIL = 1;
                if (xlm.collect(iDfS125S0100000, this) == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
