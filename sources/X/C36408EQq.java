package X;

import Y.ARunnableS15S0301000_15;
import fjb.a;
import kotlin.jvm.internal.AqS172S0100000_6;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.exporttasks.MobileEffectExportTask$export$2$deferredSaveSticker$1", f = "MobileEffectExportTask.kt", l = {35}, m = "invokeSuspend")
/* renamed from: X.EQq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36408EQq extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ C36411EQt LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36408EQq(C36411EQt c36411EQt, InterfaceC67352kd<? super C36408EQq> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c36411EQt;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36408EQq(this.LJLILLLLZI, interfaceC67352kd);
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
            C36411EQt c36411EQt = this.LJLILLLLZI;
            String str = c36411EQt.LIZLLL;
            String str2 = c36411EQt.LIZIZ.zipFilePath;
            this.LJLIL = 1;
            C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Exporting from path=");
            LIZ.append(str);
            C15280iq.LIZIZ("DiyProp", X1D.LIZIZ(LIZ));
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Exporting to path=");
            LIZ2.append(str2);
            C15280iq.LIZIZ("DiyProp", X1D.LIZIZ(LIZ2));
            XN6 xn6 = c36411EQt.LIZJ;
            if (xn6 != null) {
                C38995FSd.LIZJ().execute(new ARunnableS15S0301000_15(0, xn6, str2, new C36451ESh(new AqS172S0100000_6(c84654XKg, 117)), 2));
            }
            obj = c84654XKg.LIZ();
            if (obj == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Boolean> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
