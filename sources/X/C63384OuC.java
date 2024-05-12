package X;

import android.os.SystemClock;
import com.bytedance.im.core.proto.NewMessageNotify;
import com.bytedance.im.core.proto.Response;
import com.bytedance.im.core.proto.ResponseBody;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.bytedance.im.core.client.IMUseCaseClient$handleNewMsgNotify$1", f = "IMUseCaseClient.kt", l = {201}, m = "invokeSuspend")
/* renamed from: X.OuC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63384OuC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C63383OuB LJLILLLLZI;
    public final /* synthetic */ Response LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C63384OuC(C63383OuB c63383OuB, Response response, InterfaceC67352kd<? super C63384OuC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c63383OuB;
        this.LJLJI = response;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63384OuC(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        NewMessageNotify newMessageNotify;
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
            C63383OuB c63383OuB = this.LJLILLLLZI;
            C63408Oua c63408Oua = c63383OuB.LJ;
            Response response = this.LJLJI;
            Integer num = response.inbox_type;
            o.LJIIIIZZ(num, "response.inbox_type");
            InterfaceC63396OuO LIZ = c63383OuB.LIZ(num.intValue());
            this.LJLIL = 1;
            c63408Oua.getClass();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("processResponseAndNotify begin with log id: ");
            LIZ2.append(response.log_id);
            C63322OtC.LJI("NewMsgNotifyWithBufferUseCase", X1D.LIZIZ(LIZ2), null);
            ResponseBody responseBody = response.body;
            if (responseBody == null || (newMessageNotify = responseBody.has_new_message_notify) == null) {
                obj2 = C76800UCe.LIZ;
            } else {
                Integer num2 = response.inbox_type;
                if (num2 == null) {
                    obj2 = C76800UCe.LIZ;
                } else {
                    int intValue = num2.intValue();
                    long uptimeMillis = SystemClock.uptimeMillis();
                    int[] supportedInboxes = C63312Ot2.LIZLLL();
                    o.LJIIIIZZ(supportedInboxes, "supportedInboxes");
                    if (!ORY.LJJIJ(intValue, supportedInboxes)) {
                        obj2 = C76800UCe.LIZ;
                    } else if (c63408Oua.LIZ.LJ(intValue, newMessageNotify)) {
                        obj2 = C76800UCe.LIZ;
                    } else {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("processResponseAndNotify add to buffer: ");
                        LIZ3.append(response.log_id);
                        C63322OtC.LJI("NewMsgNotifyWithBufferUseCase", X1D.LIZIZ(LIZ3), null);
                        String str = response.log_id;
                        if (str == null) {
                            str = "";
                        }
                        obj2 = LIZ.LIZIZ(new C63426Ous(newMessageNotify, uptimeMillis, str), this);
                        if (obj2 != enumC58928NAu) {
                            obj2 = C76800UCe.LIZ;
                        }
                    }
                }
            }
            if (obj2 == enumC58928NAu) {
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
