package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.movie.anchor.MovieTokAnchorBusinessService$handleIconClick$1$1$1", f = "MovieTokAnchorBusinessService.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7S2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7S2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C7S8 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ AnchorCommonStruct LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7S2(C7S8 c7s8, String str, boolean z, AnchorCommonStruct anchorCommonStruct, InterfaceC67352kd<? super C7S2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c7s8;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
        this.LJLJJI = anchorCommonStruct;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C7S2(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJIILLIIL(Boolean.valueOf(this.LJLJI), this.LJLILLLLZI);
        C7S8.LJIILL(this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
