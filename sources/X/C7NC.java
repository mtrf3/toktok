package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.nows.feed.homepage.NowPostCardFeedViewHolder$Companion$checkUserPublishInfo$1$1", f = "NowPostCardFeedViewHolder.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7NC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7NC extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C7NC(InterfaceC67352kd<? super C7NC> interfaceC67352kd) {
        super(2, interfaceC67352kd);
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C7NC(interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        try {
            C3C5.m7constructorimpl(C78596Usy.LJJIFFI().LIZLLL.LLIIIL());
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return new C7NC(interfaceC67352kd).invokeSuspend(C76800UCe.LIZ);
    }
}
