package X;

import com.ss.android.ugc.aweme.draft.model.DraftDBSaveResult;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.service.CreativeDraftUpdateServiceImpl$updateDB$2", f = "DraftUpdateServiceImpl.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.GMh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41391GMh extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super DraftDBSaveResult>, Object> {
    public final /* synthetic */ NDG LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41391GMh(NDG ndg, InterfaceC67352kd<? super C41391GMh> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = ndg;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C41391GMh(this.LJLIL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return C45804HyK.LJJLJLI(this.LJLIL);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super DraftDBSaveResult> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
