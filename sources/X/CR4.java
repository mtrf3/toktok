package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.live.publicscreen.impl.messagehistory.MessageHistoryFetcher$fetchHistory$1", f = "MessageHistoryFetcher.kt", l = {98}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class CR4 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ CRF LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CR4(CRF crf, InterfaceC67352kd<? super CR4> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = crf;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new CR4(this.LJLILLLLZI, interfaceC67352kd);
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
            CRF crf = this.LJLILLLLZI;
            crf.LIZ = true;
            XIA xia = C78613UtF.LIZJ;
            CR7 cr7 = new CR7(crf, null);
            this.LJLIL = 1;
            obj = XKX.LJI(xia, cr7, this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        CRU cru = (CRU) obj;
        this.LJLILLLLZI.LIZ = false;
        if (cru == null) {
            cru = new CRU(C61878OQg.INSTANCE, false, "");
        }
        CRF crf2 = this.LJLILLLLZI;
        crf2.LJ = cru.LIZIZ;
        crf2.LIZLLL = cru.LIZJ;
        InterfaceC31392CTs interfaceC31392CTs = crf2.LJI;
        if (interfaceC31392CTs != null) {
            ((C31319CQx) interfaceC31392CTs).LJJLL(cru);
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
