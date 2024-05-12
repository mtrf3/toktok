package X;

import Y.IDfS20S0200000;
import com.bytedance.android.live.effect.smallitem.LiveSmallItemBeautyViewModel;
import com.bytedance.android.live.effect.smallitem.LiveSmallSubItemBeautyFragment;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.effect.smallitem.LiveSmallSubItemBeautyFragment$registerDataChannel$1", f = "LiveSmallSubItemBeautyFragment.kt", l = {207}, m = "invokeSuspend")
/* renamed from: X.2Gp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C55712Gp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ LiveSmallSubItemBeautyFragment LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C55712Gp(LiveSmallSubItemBeautyFragment liveSmallSubItemBeautyFragment, InterfaceC67352kd<? super C55712Gp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = liveSmallSubItemBeautyFragment;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C55712Gp c55712Gp = new C55712Gp(this.LJLJI, interfaceC67352kd);
        c55712Gp.LJLILLLLZI = obj;
        return c55712Gp;
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
            InterfaceC70422pa interfaceC70422pa = (InterfaceC70422pa) this.LJLILLLLZI;
            LiveSmallSubItemBeautyFragment liveSmallSubItemBeautyFragment = this.LJLJI;
            LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel = liveSmallSubItemBeautyFragment.LJLJL;
            if (liveSmallItemBeautyViewModel != null && (xlm = liveSmallItemBeautyViewModel.LJLJJL) != null) {
                IDfS20S0200000 iDfS20S0200000 = new IDfS20S0200000(interfaceC70422pa, liveSmallSubItemBeautyFragment, 8);
                this.LJLIL = 1;
                if (xlm.collect(iDfS20S0200000, this) == enumC58928NAu) {
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
