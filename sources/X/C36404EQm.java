package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.exporttasks.MobileEffectGSExportTask$export$2$deferredSaveSticker$1", f = "MobileEffectGSExportTask.kt", l = {42}, m = "invokeSuspend")
/* renamed from: X.EQm, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36404EQm extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ C36413EQv LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36404EQm(C36413EQv c36413EQv, InterfaceC67352kd<? super C36404EQm> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c36413EQv;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36404EQm(this.LJLILLLLZI, interfaceC67352kd);
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
            C36413EQv c36413EQv = this.LJLILLLLZI;
            String str = c36413EQv.LIZLLL;
            String str2 = c36413EQv.LIZJ.zipFilePath;
            this.LJLIL = 1;
            obj = c36413EQv.LIZJ(str, str2, this);
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
