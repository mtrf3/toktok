package X;

import com.ss.android.ugc.aweme.ecommercebase.monitor.ClientLogApi;
import com.ss.android.ugc.aweme.ecommercebase.monitor.ClientLogReportRequest;
import fjb.a;
import java.util.concurrent.CancellationException;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.ecommercebase.monitor.ECommerceExceptionMonitor$sendServerEvent$1", f = "ECommerceExceptionMonitor.kt", l = {110}, m = "invokeSuspend")
/* renamed from: X.2kV, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C67272kV extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ EnumC53638L3i LJLILLLLZI;
    public final /* synthetic */ Integer LJLJI;
    public final /* synthetic */ java.util.Map<String, Object> LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C67272kV(EnumC53638L3i enumC53638L3i, Integer num, java.util.Map<String, Object> map, InterfaceC67352kd<? super C67272kV> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = enumC53638L3i;
        this.LJLJI = num;
        this.LJLJJI = map;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C67272kV(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        int intValue;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i == 1) {
                    try {
                        C141335gf.LIZJ(obj);
                    } catch (CancellationException e) {
                        throw e;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C141335gf.LIZJ(obj);
                EnumC53638L3i enumC53638L3i = this.LJLILLLLZI;
                Integer num = this.LJLJI;
                java.util.Map<String, Object> map = this.LJLJJI;
                try {
                    try {
                        try {
                            ClientLogApi clientLogApi = (ClientLogApi) C67332kb.LIZ().create(ClientLogApi.class);
                            try {
                                try {
                                    int ordinal = enumC53638L3i.ordinal();
                                    if (num != null) {
                                        try {
                                            intValue = num.intValue();
                                        } catch (CancellationException e2) {
                                            throw e2;
                                        }
                                    } else {
                                        intValue = 0;
                                    }
                                    try {
                                        try {
                                            ClientLogReportRequest clientLogReportRequest = new ClientLogReportRequest(ordinal, intValue, String.valueOf(map));
                                            try {
                                                this.LJLIL = 1;
                                                try {
                                                    obj = clientLogApi.getClientLogReportResponse(clientLogReportRequest, this);
                                                    if (obj == enumC58928NAu) {
                                                        return enumC58928NAu;
                                                    }
                                                } catch (CancellationException e3) {
                                                    throw e3;
                                                }
                                            } catch (CancellationException e4) {
                                                throw e4;
                                            }
                                        } catch (CancellationException e5) {
                                            throw e5;
                                        }
                                    } catch (CancellationException e6) {
                                        throw e6;
                                    }
                                } catch (CancellationException e7) {
                                    throw e7;
                                }
                            } catch (CancellationException e8) {
                                throw e8;
                            }
                        } catch (CancellationException e9) {
                            throw e9;
                        }
                    } catch (CancellationException e10) {
                        throw e10;
                    }
                } catch (CancellationException e11) {
                    throw e11;
                }
            }
        } catch (Throwable unused) {
        }
        try {
            return C76800UCe.LIZ;
        } catch (CancellationException e12) {
            throw e12;
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
