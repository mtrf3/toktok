package X;

import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.operate.DraftSaveOpKt$convertToDraft$2", f = "DraftSaveOp.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GLH extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super AwemeDraft>, Object> {
    public final /* synthetic */ C41021G8b LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GLH(C41021G8b c41021G8b, InterfaceC67352kd<? super GLH> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c41021G8b;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GLH(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        InterfaceC168776jp LJIIJJI = C60903NvH.LJIIJJI().LJIIJJI();
        C41021G8b c41021G8b = this.LJLIL;
        return LJIIJJI.LJ(c41021G8b.LJLIL, c41021G8b.LJLILLLLZI);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super AwemeDraft> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
