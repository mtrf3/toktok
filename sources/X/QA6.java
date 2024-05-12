package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.pipo.kyc.singpass.PipoMiddleActivity;
import com.bytedance.pipo.kyc.singpass.network.model.PersonInfo;
import com.google.gson.Gson;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.pipo.kyc.singpass.PipoMiddleActivity$getPersonInfo$1$1$1$1", f = "PipoMiddleActivity.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class QA6 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ OSZ LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ QA9 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QA6(OSZ osz, InterfaceC67352kd interfaceC67352kd, String str, QA9 qa9) {
        super(2, interfaceC67352kd);
        this.LJLIL = osz;
        this.LJLILLLLZI = str;
        this.LJLJI = qa9;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> completion) {
        o.LJIIIZ(completion, "completion");
        return new QA6(this.LJLIL, completion, this.LJLILLLLZI, this.LJLJI);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Integer num;
        C141335gf.LIZJ(obj);
        PersonInfo personInfo = (PersonInfo) this.LJLIL.getFirst();
        String str = null;
        if (personInfo != null) {
            PipoMiddleActivity pipoMiddleActivity = this.LJLJI.LJLILLLLZI;
            pipoMiddleActivity.getClass();
            QAR qar = QA8.LIZ;
            if (qar != null) {
                o.LJIIIIZZ(GsonProtectorUtils.toJson(new Gson(), personInfo), "Gson().toJson(this)");
                qar.LIZ(personInfo, null);
            }
            pipoMiddleActivity.finish();
        } else {
            PipoMiddleActivity pipoMiddleActivity2 = this.LJLJI.LJLILLLLZI;
            QAJ qaj = (QAJ) this.LJLIL.getSecond();
            if (qaj != null) {
                num = qaj.LJLIL;
            } else {
                num = null;
            }
            QAJ qaj2 = (QAJ) this.LJLIL.getSecond();
            if (qaj2 != null) {
                str = qaj2.LJLILLLLZI;
            }
            pipoMiddleActivity2.LLFII(new QAE(106, "fail to get person info", num, str));
        }
        return C76800UCe.LIZ;
    }
}
