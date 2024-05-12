package X;

import com.ss.android.ugc.aweme.actionai.action.data.AutoCutFrameOutPut;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.actionai.bot.frame.autocut.AutoCutFrameExtractManager$startAutoCutFrameExtractJobAsync$1$output$1", f = "AutoCutFrameExtractManager.kt", l = {66}, m = "invokeSuspend")
/* renamed from: X.2vp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74292vp extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super AutoCutFrameOutPut>, Object> {
    public int LJLIL;
    public final /* synthetic */ C74282vo LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74292vp(C74282vo c74282vo, InterfaceC67352kd<? super C74292vp> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c74282vo;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C74292vp(this.LJLILLLLZI, interfaceC67352kd);
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
            C45172Ho8 c45172Ho8 = (C45172Ho8) this.LJLILLLLZI.LJ.getValue();
            this.LJLIL = 1;
            obj = c45172Ho8.LIZ(this);
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super AutoCutFrameOutPut> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
