package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.book.anchor.BookAnchorBusinessService$handleIconClick$1$1$1", f = "BookAnchorBusinessService.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7Pg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185367Pg extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C7S7 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ AnchorCommonStruct LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C185367Pg(C7S7 c7s7, String str, boolean z, AnchorCommonStruct anchorCommonStruct, InterfaceC67352kd<? super C185367Pg> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c7s7;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
        this.LJLJJI = anchorCommonStruct;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C185367Pg(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        this.LJLIL.LJIILLIIL(Boolean.valueOf(this.LJLJI), this.LJLILLLLZI);
        C7S7.LJIILL(this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
