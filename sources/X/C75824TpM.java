package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveCoverMinSizeSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestUseLinkmicAloggerSetting;
import fjb.a;
import kotlin.jvm.internal.o;
import webcast.im.LinkStateMessage;

@InterfaceC65848Psq(c = "com.bytedance.android.live.liveinteract.platform.statemanager.handler.IMStateHandler$ackStateMessage$1", f = "IMStateHandler.kt", l = {242}, m = "invokeSuspend")
/* renamed from: X.TpM, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75824TpM extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C75813TpB LJLILLLLZI;
    public final /* synthetic */ LinkStateMessage LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C75824TpM(C75813TpB c75813TpB, LinkStateMessage linkStateMessage, InterfaceC67352kd<? super C75824TpM> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c75813TpB;
        this.LJLJI = linkStateMessage;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C75824TpM(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object LIZ;
        String LIZ2;
        String str;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i = this.LJLIL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C141335gf.LIZJ(obj);
            } else {
                C141335gf.LIZJ(obj);
                C75813TpB c75813TpB = this.LJLILLLLZI;
                LinkStateMessage linkStateMessage = this.LJLJI;
                InterfaceC75826TpO interfaceC75826TpO = (InterfaceC75826TpO) c75813TpB.LJLJJI.getValue();
                long messageId = linkStateMessage.getMessageId();
                this.LJLIL = 1;
                obj = interfaceC75826TpO.LJLLI(messageId, this);
                if (obj == enumC58928NAu) {
                    return enumC58928NAu;
                }
            }
            R2P r2p = (R2P) obj;
            if (r2p != null) {
                str = r2p.toString();
            } else {
                str = null;
            }
            C0NB.LIZIZ("StateApi", str);
            LIZ = (R2P) obj;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C75813TpB c75813TpB2 = this.LJLILLLLZI;
        Throwable m10exceptionOrNullimpl = C3C5.m10exceptionOrNullimpl(LIZ);
        if (m10exceptionOrNullimpl != null) {
            if (m10exceptionOrNullimpl instanceof CH1) {
                c75813TpB2.getClass();
                if (MultiGuestUseLinkmicAloggerSetting.INSTANCE.isEnable()) {
                    StackTraceElement LJ = C32014ChO.LJ();
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ2 = C77800Ug8.LIZLLL(U44.BIZ, LIZ3, "_StateApi_", LJ, LIZ3);
                } else {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ2 = C17M.LIZ(U44.BIZ, LIZ4, "_StateApi_", LiveCoverMinSizeSetting.DEFAULT, LIZ4);
                }
                String errorMsg = ((C29401Dk) m10exceptionOrNullimpl).getErrorMsg();
                o.LJIIIIZZ(errorMsg, "it.errorMsg");
                C32014ChO.LJIIJ(LIZ2, errorMsg);
            } else {
                ((InterfaceC88472Yns) c75813TpB2.LJLJJL.getValue()).invoke(m10exceptionOrNullimpl);
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
