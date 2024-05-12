package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import fjb.a;
import kotlin.jvm.internal.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.topic.movie.anchor.MovieTokAnchorBusinessService$handleIconClick$1$1$3", f = "MovieTokAnchorBusinessService.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7Rz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C186077Rz extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ XGX<? extends InterfaceC199277rv> LJLIL;
    public final /* synthetic */ C7S8 LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ AnchorCommonStruct LJLJJL;
    public final /* synthetic */ InterfaceC70422pa LJLJJLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C186077Rz(XGX xgx, AnchorCommonStruct anchorCommonStruct, C7S8 c7s8, String str, InterfaceC67352kd interfaceC67352kd, InterfaceC70422pa interfaceC70422pa, boolean z) {
        super(2, interfaceC67352kd);
        this.LJLIL = xgx;
        this.LJLILLLLZI = c7s8;
        this.LJLJI = str;
        this.LJLJJI = z;
        this.LJLJJL = anchorCommonStruct;
        this.LJLJJLL = interfaceC70422pa;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C186077Rz(this.LJLIL, this.LJLJJL, this.LJLILLLLZI, this.LJLJI, interfaceC67352kd, this.LJLJJLL, this.LJLJJI);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C141335gf.LIZJ(obj);
        C36922EeM.LJFF(((XGT) this.LJLIL).LJFF);
        C7S8 c7s8 = this.LJLILLLLZI;
        String str = this.LJLJI;
        Boolean bool = c7s8.LIZIZ;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = this.LJLJJI;
        }
        c7s8.LJIILLIIL(Boolean.valueOf(z), str);
        C7S8.LJIILL(this.LJLJI, o.LJ(this.LJLILLLLZI.LIZIZ, Boolean.TRUE), this.LJLJJL);
        C48841JEv.LIZJ(this.LJLJJLL, null);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
