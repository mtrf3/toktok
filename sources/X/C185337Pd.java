package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.book.anchor.BookAnchorBusinessService$handleIconClick$1$1$3", f = "BookAnchorBusinessService.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7Pd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C185337Pd extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ C7S7 LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ AnchorCommonStruct LJLJJI;
    public final /* synthetic */ InterfaceC70422pa LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C185337Pd(C7S7 c7s7, String str, boolean z, AnchorCommonStruct anchorCommonStruct, InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C185337Pd> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = c7s7;
        this.LJLILLLLZI = str;
        this.LJLJI = z;
        this.LJLJJI = anchorCommonStruct;
        this.LJLJJL = interfaceC70422pa;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C185337Pd(this.LJLIL, this.LJLILLLLZI, this.LJLJI, this.LJLJJI, this.LJLJJL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        C141335gf.LIZJ(obj);
        C7S7 c7s7 = this.LJLIL;
        String str = this.LJLILLLLZI;
        Boolean bool = c7s7.LIZIZ;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = this.LJLJI;
        }
        c7s7.LJIILLIIL(Boolean.valueOf(z), str);
        C7S7 c7s72 = this.LJLIL;
        String str2 = this.LJLILLLLZI;
        Boolean bool2 = c7s72.LIZIZ;
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        } else {
            z2 = this.LJLJI;
        }
        C7S7.LJIILL(str2, z2, this.LJLJJI);
        C48841JEv.LIZJ(this.LJLJJL, null);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
