package X;

import com.bytedance.android.livesdk.envelope.model.RedEnvelopeInfoModel4FE;
import com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget$notifyRedEnvelopeInfos$1", f = "RedEnvelopeWidget.kt", l = {277}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BSE extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ RedEnvelopeWidget LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ RedEnvelopeInfoModel4FE LJLJJI;
    public final /* synthetic */ boolean LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BSE(RedEnvelopeWidget redEnvelopeWidget, String str, RedEnvelopeInfoModel4FE redEnvelopeInfoModel4FE, boolean z, InterfaceC67352kd<? super BSE> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = redEnvelopeWidget;
        this.LJLJI = str;
        this.LJLJJI = redEnvelopeInfoModel4FE;
        this.LJLJJL = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new BSE(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
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
            XIA xia = C78613UtF.LIZJ;
            BSF bsf = new BSF(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, null);
            this.LJLIL = 1;
            if (XKX.LJI(xia, bsf, this) == enumC58928NAu) {
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
