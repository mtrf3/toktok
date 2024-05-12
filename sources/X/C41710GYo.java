package X;

import fjb.a;
import kotlin.jvm.internal.IDqS432S0100000_7;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.editor.lightening.canvas.forward.ForwardOnThisDayEnvironment$downloadCanvasStyle$1", f = "ForwardOnThisDayEnvironment.kt", l = {615}, m = "invokeSuspend")
/* renamed from: X.GYo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41710GYo extends AbstractC65782Prm implements InterfaceC88471Ynr<C3CK<? super C163166am>, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;

    public C41710GYo(InterfaceC67352kd<? super C41710GYo> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C41710GYo c41710GYo = new C41710GYo(interfaceC67352kd);
        c41710GYo.LJLILLLLZI = obj;
        return c41710GYo;
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
            C41700GYe.LJI("downloadCanvasStyle start");
            C44428Hc8 c44428Hc8 = C41700GYe.LJFF;
            if (c44428Hc8 != null && !c44428Hc8.LIZIZ) {
                c44428Hc8.LIZLLL();
            }
            C43314GzG.LIZ(new IDqS432S0100000_7(c3ck, (C3CK<? super C163166am>) 13));
            C41715GYt c41715GYt = C41715GYt.LJLIL;
            this.LJLIL = 1;
            if (C3T0.LIZ(c3ck, c41715GYt, this) == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(C3CK<? super C163166am> c3ck, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(c3ck, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
