package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.android.livesdk.broadcast.guide.GuidanceSceneKt$performActionByScene$1$1$1$2$1", f = "GuidanceScene.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.BeP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29281BeP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ DataChannel LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29281BeP(DataChannel dataChannel, InterfaceC67352kd<? super C29281BeP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = dataChannel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C29281BeP(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C29293Beb.LIZ(this.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}