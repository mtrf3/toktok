package X;

import android.content.Intent;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.mvtemplate.duet.DuetUploadChosenResultImpl$onChosenResult$1$1", f = "DuetUploadChosenResultImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Gf9, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42067Gf9 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ H9U LJLIL;
    public final /* synthetic */ Intent LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C42067Gf9(H9U h9u, Intent intent, InterfaceC67352kd<? super C42067Gf9> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = h9u;
        this.LJLILLLLZI = intent;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C42067Gf9(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJ(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}