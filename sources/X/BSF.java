package X;

import com.bytedance.android.livesdk.envelope.model.RedEnvelopeInfoModel4FE;
import com.bytedance.android.livesdk.envelope.model.RedEnvelopeMessage4FE;
import com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.envelope.widget.RedEnvelopeWidget$notifyRedEnvelopeInfos$1$1", f = "RedEnvelopeWidget.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BSF extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ RedEnvelopeWidget LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ RedEnvelopeInfoModel4FE LJLJI;
    public final /* synthetic */ boolean LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BSF(RedEnvelopeWidget redEnvelopeWidget, String str, RedEnvelopeInfoModel4FE redEnvelopeInfoModel4FE, boolean z, InterfaceC67352kd<? super BSF> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = redEnvelopeWidget;
        this.LJLILLLLZI = str;
        this.LJLJI = redEnvelopeInfoModel4FE;
        this.LJLJJI = z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new BSF(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int i;
        C141335gf.LIZJ(obj);
        this.LJLIL.LJLJL.lock();
        RedEnvelopeWidget redEnvelopeWidget = this.LJLIL;
        if (redEnvelopeWidget.LJLJJL) {
            redEnvelopeWidget.LJLJJLL.add(new BSI(this.LJLILLLLZI, this.LJLJI.envelopList, this.LJLJJI));
        } else {
            if (redEnvelopeWidget.LJLJI) {
                i = 0;
            } else {
                i = -1;
            }
            String str = this.LJLILLLLZI;
            List<RedEnvelopeMessage4FE> list = this.LJLJI.envelopList;
            Boolean valueOf = Boolean.valueOf(this.LJLJJI);
            RedEnvelopeWidget redEnvelopeWidget2 = this.LJLIL;
            C28792BRs.LIZJ(i, str, list, valueOf, redEnvelopeWidget2.LJLJJI, redEnvelopeWidget2.LJLJJL);
        }
        this.LJLIL.LJLJL.unlock();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
