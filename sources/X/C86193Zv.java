package X;

@InterfaceC65848Psq(c = "com.bytedance.im.core.search.IMSearchEngine$getSearchResultFlow$1$2", f = "IMSearchEngine.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.3Zv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C86193Zv extends AbstractC65782Prm implements InterfaceC88473Ynt {
    public final /* synthetic */ C86233Zz<SEARCH_RESULT> LJLIL;
    public final /* synthetic */ C86283a4 LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C86193Zv(C86233Zz<SEARCH_RESULT> c86233Zz, C86283a4 c86283a4, InterfaceC67352kd<? super C86193Zv> interfaceC67352kd) {
        super(3, interfaceC67352kd);
        this.LJLIL = c86233Zz;
        this.LJLILLLLZI = c86283a4;
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJ.invoke(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88473Ynt
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new C86193Zv(this.LJLIL, this.LJLILLLLZI, (InterfaceC67352kd) obj3).invokeSuspend(C76800UCe.LIZ);
    }
}
