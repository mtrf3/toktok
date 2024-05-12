package X;

import android.content.Intent;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.editcut.CutOptimizedVideoChosenHandler$compileForEditorPro$3$videoSegments$1", f = "CutOptimizedVideoChosenHandler.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.5W1, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5W1 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ Intent LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5W1(Intent intent, InterfaceC67352kd<? super C5W1> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = intent;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C5W1(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C142185i2.INSTANCE.recheckCache(this.LJLIL);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
