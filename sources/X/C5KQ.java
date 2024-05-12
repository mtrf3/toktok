package X;

import com.ss.android.vesdk.VEEditor;
import fjb.a;

@InterfaceC65848Psq(c = "com.bytedance.ies.cutsame.prepare.VEEditorUtils$optimizeVideo$1$1$onCompileError$1", f = "VEEditorUtils.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5KQ, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5KQ extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ VEEditor LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5KQ(VEEditor vEEditor, InterfaceC67352kd<? super C5KQ> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = vEEditor;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C5KQ(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJIILIIL();
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
