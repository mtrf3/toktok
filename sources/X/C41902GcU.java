package X;

import Y.IDeS360S0100000_1;
import Y.IDeS362S0100000_10;
import Y.IDfS128S0100000_7;
import fjb.a;
import java.util.List;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.music.aichoosemusic.task.StreamEditUploadFrameTask$decodeFrameList$2$1", f = "StreamEditUploadFrameTask.kt", l = {113}, m = "invokeSuspend")
/* renamed from: X.GcU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41902GcU extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C41906GcY LJLILLLLZI;
    public final /* synthetic */ InterfaceC67352kd<List<String>> LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C41902GcU(C41906GcY c41906GcY, InterfaceC67352kd<? super List<String>> interfaceC67352kd, InterfaceC67352kd<? super C41902GcU> interfaceC67352kd2) {
        super(2, interfaceC67352kd2);
        this.LJLILLLLZI = c41906GcY;
        this.LJLJI = interfaceC67352kd;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C41902GcU(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C41906GcY c41906GcY = this.LJLILLLLZI;
            IDeS360S0100000_1 LJIILLIIL = V1M.LJIILLIIL(new C41901GcT(c41906GcY, null), new IDeS362S0100000_10(c41906GcY.LJIIJ, 1));
            IDfS128S0100000_7 iDfS128S0100000_7 = new IDfS128S0100000_7(this.LJLJI, 0);
            this.LJLIL = 1;
            if (LJIILLIIL.collect(iDfS128S0100000_7, this) == enumC58928NAu) {
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
