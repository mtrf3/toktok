package X;

import com.bytedance.ies.cutsame.source.model.ProcessorConfig;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.ies.cutsame.source.helper.ServerEffectHelper$toPicture$2", f = "ServerEffectHelper.kt", l = {99}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class FR1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C172456pl>, Object> {
    public int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ ProcessorConfig LJLJJI;
    public final /* synthetic */ C172526ps LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FR1(String str, String str2, ProcessorConfig processorConfig, C172526ps c172526ps, InterfaceC67352kd<? super FR1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = processorConfig;
        this.LJLJJL = c172526ps;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new FR1(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x019e A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FR1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C172456pl> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
