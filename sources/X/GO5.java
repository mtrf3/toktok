package X;

import kotlin.jvm.internal.AqS173S0100000_7;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.tools.draft.db.DraftDBExt$convertPublishedDraftToNormalDraft$2", f = "DraftDBExt.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GO5 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super Integer>, Object> {
    public GO5(InterfaceC67352kd<? super GO5> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GO5(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C76732zl c76732zl = new C76732zl();
        GPD.LJFF("UPDATE local_draft SET is_published = 0, published_time = 0, published_aweme_id = \"\" WHERE is_published = 1", new AqS173S0100000_7(c76732zl, 394));
        return new Integer(c76732zl.element);
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super Integer> interfaceC67352kd) {
        return new GO5(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
