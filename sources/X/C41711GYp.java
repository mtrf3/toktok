package X;

import com.ss.android.vesdk.VEUtils;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.ForwardOnThisDayEnvironment$calculateBackgroundColor$1", f = "ForwardOnThisDayEnvironment.kt", l = {575}, m = "invokeSuspend")
/* renamed from: X.GYp, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41711GYp extends AbstractC65782Prm implements InterfaceC88471Ynr<C3CK<? super GYE>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ GYE LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41711GYp(GYE gye, InterfaceC67352kd<? super C41711GYp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = gye;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C41711GYp c41711GYp = new C41711GYp(this.LJLJI, interfaceC67352kd);
        c41711GYp.LJLILLLLZI = obj;
        return c41711GYp;
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
            C3CK c3ck = (C3CK) this.LJLILLLLZI;
            GYE gye = this.LJLJI;
            VEUtils.getVideoFrames(gye.LIZ, new int[]{0}, 256, 256, false, new C41712GYq(c3ck, gye));
            C41716GYu c41716GYu = C41716GYu.LJLIL;
            this.LJLIL = 1;
            if (C3T0.LIZ(c3ck, c41716GYu, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C3CK<? super GYE> c3ck, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c3ck, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
