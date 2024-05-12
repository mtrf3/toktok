package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.broadcast.guide.GuidanceSceneKt$performActionByScene$1", f = "GuidanceScene.kt", l = {89}, m = "invokeSuspend")
/* renamed from: X.BeN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29279BeN extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ C29285BeT LJLILLLLZI;
    public final /* synthetic */ DataChannel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29279BeN(C29285BeT c29285BeT, DataChannel dataChannel, InterfaceC67352kd<? super C29279BeN> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c29285BeT;
        this.LJLJI = dataChannel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C29279BeN(this.LJLILLLLZI, this.LJLJI, interfaceC67352kd);
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
            C29283BeR c29283BeR = new C29283BeR(this.LJLILLLLZI, this.LJLJI, null);
            this.LJLIL = 1;
            if (XKX.LJI(xia, c29283BeR, this) == enumC58928NAu) {
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
