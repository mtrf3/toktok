package X;

import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.exporttasks.MobileEffectExportTask$export$2$deferredExportIcon$1", f = "MobileEffectExportTask.kt", l = {36}, m = "invokeSuspend")
/* renamed from: X.EQr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36409EQr extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Boolean>, Object> {
    public int LJLIL;
    public final /* synthetic */ C36411EQt LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36409EQr(C36411EQt c36411EQt, InterfaceC67352kd<? super C36409EQr> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = c36411EQt;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C36409EQr(this.LJLILLLLZI, interfaceC67352kd);
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
            String str = c36411EQt.LIZIZ.iconFilePath;
            this.LJLIL = 1;
            obj = c36411EQt.LIZIZ(str, this);
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
