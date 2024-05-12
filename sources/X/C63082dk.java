package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.qna.mob.QnaMob$Companion$enterQuestionSearch$1", f = "QnaMob.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2dk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C63082dk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C63082dk(InterfaceC67352kd<? super C63082dk> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C63082dk(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("enter_from", "qa_personal_profile");
        c188727au.LJIIIZ("enter_method", "click_search");
        FMX.LJIIL("enter_question_search", c188727au.LIZ);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C63082dk(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
