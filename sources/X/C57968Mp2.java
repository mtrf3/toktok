package X;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.relation.usercard.source.UserCardDataSource$init$3$1", f = "UserCardDataSource.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.Mp2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57968Mp2 extends AbstractC65782Prm implements InterfaceC88473Ynt<C57970Mp4, C57948Moi, InterfaceC67352kd<? super OSZ<? extends C57970Mp4, ? extends C57948Moi>>, Object> {
    public /* synthetic */ C57970Mp4 LJLIL;
    public /* synthetic */ C57948Moi LJLILLLLZI;

    public C57968Mp2(InterfaceC67352kd<? super C57968Mp2> interfaceC67352kd) {
        super(3, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        return new OSZ(this.LJLIL, this.LJLILLLLZI);
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(C57970Mp4 c57970Mp4, C57948Moi c57948Moi, InterfaceC67352kd<? super OSZ<? extends C57970Mp4, ? extends C57948Moi>> interfaceC67352kd) {
        C57968Mp2 c57968Mp2 = new C57968Mp2(interfaceC67352kd);
        c57968Mp2.LJLIL = c57970Mp4;
        c57968Mp2.LJLILLLLZI = c57948Moi;
        return c57968Mp2.invokeSuspend(C76800UCe.LIZ);
    }
}
