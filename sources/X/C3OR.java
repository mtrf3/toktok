package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.im.sdk.common.data.manager.keva.IMCriticalFlowKeva;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.data.manager.keva.IMCriticalFlowKeva$storeEnterReportPageTimeStamp$1", f = "IMCriticalFlowKeva.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3OR, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3OR extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ long LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3OR(long j, String str, String str2, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = str;
        this.LJLILLLLZI = str2;
        this.LJLJI = j;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C3OR(this.LJLJI, this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        IMCriticalFlowKeva iMCriticalFlowKeva = IMCriticalFlowKeva.LIZ;
        String conversationId = this.LJLIL;
        String entrance = this.LJLILLLLZI;
        long j = this.LJLJI;
        Keva LJ = iMCriticalFlowKeva.LJ();
        o.LJIIIZ(conversationId, "conversationId");
        o.LJIIIZ(entrance, "entrance");
        LJ.storeString(conversationId, C62070OXq.LIZIZ(new IMCriticalFlowKeva.ReportPageConfig(j, entrance)));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
