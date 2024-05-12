package X;

import com.bytedance.android.live.broadcast.speeddetector.core.impl.proto.ConfigData;
import fjb.a;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.android.live.broadcast.speeddetector.core.impl.NetworkSpeedDetectorManager$receiveConfigMessage$1", f = "NetworkSpeedDetectorManager.kt", l = {327}, m = "invokeSuspend")
/* renamed from: X.2DO, reason: invalid class name */
/* loaded from: classes.dex */
public final class C2DO extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ ConfigData LJLILLLLZI;
    public final /* synthetic */ C42111l1 LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2DO(C42111l1 c42111l1, ConfigData configData, InterfaceC67352kd interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = configData;
        this.LJLJI = c42111l1;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C2DO(this.LJLJI, this.LJLILLLLZI, interfaceC67352kd);
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
            long j = this.LJLILLLLZI.waitDuration;
            this.LJLIL = 1;
            if (C1JD.LIZJ(j, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        if (this.LJLJI.LJFF.get()) {
            String sessionId = this.LJLJI.LIZJ;
            long j2 = this.LJLILLLLZI.waitDuration;
            o.LJIIIZ(sessionId, "sessionId");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("session_id", sessionId);
            linkedHashMap.put("wait_duration", Long.valueOf(j2));
            C0K2.LJII(1, O5Y.LJJLI("ttlive_speed_detection_wait_duration_not_receive_report_service"), linkedHashMap);
        }
        this.LJLJI.LJII();
        C42111l1 c42111l1 = this.LJLJI;
        C0W0 c0w0 = C0W0.DisconnectTypeWaitReportTimeOut;
        c42111l1.LJFF(c0w0.getCode(), c0w0.getMessage());
        this.LJLJI.LIZLLL(c0w0.getCode(), c0w0.getMessage());
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
