package X;

import com.ss.android.ugc.aweme.main.assems.mainfragment.IMFAbility;
import com.ss.android.ugc.aweme.main.assems.mainfragment.MFUGAssem;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.main.assems.mainfragment.MFUGAssem$onParentViewCreated$3", f = "MFUGAssem.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes10.dex */
public final class LMT extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ MFUGAssem LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LMT(MFUGAssem mFUGAssem, InterfaceC67352kd<? super LMT> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = mFUGAssem;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new LMT(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        MFUGAssem mFUGAssem = this.LJLIL;
        LKF lkf = null;
        IMFAbility iMFAbility = (IMFAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(mFUGAssem), IMFAbility.class, null);
        if (iMFAbility != null) {
            lkf = iMFAbility.H4();
        }
        mFUGAssem.LJLILLLLZI = lkf;
        MFUGAssem mFUGAssem2 = this.LJLIL;
        LKF lkf2 = mFUGAssem2.LJLILLLLZI;
        if (lkf2 != null) {
            lkf2.LIZ(mFUGAssem2);
        }
        MFUGAssem mFUGAssem3 = this.LJLIL;
        LKF lkf3 = mFUGAssem3.LJLILLLLZI;
        if (lkf3 != null) {
            lkf3.LJIIL(mFUGAssem3);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
