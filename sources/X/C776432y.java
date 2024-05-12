package X;

import com.ss.android.ugc.aweme.im.sdk.search.data.api.SearchDoc;
import fjb.a;
import java.util.List;
import kotlin.jvm.internal.AqS167S0100000_1;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.search.data.SuggestedContactDataSource$getLatestSuggestedContact$3", f = "SuggestedContactDataSource.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.32y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C776432y extends AbstractC65782Prm implements InterfaceC88472Yns<InterfaceC67352kd<? super List<? extends InterfaceC57784Mm4>>, Object> {
    public final /* synthetic */ List<SearchDoc> LJLIL;
    public final /* synthetic */ C776532z LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C776432y(List<SearchDoc> list, C776532z c776532z, InterfaceC67352kd<? super C776432y> interfaceC67352kd) {
        super(1, interfaceC67352kd);
        this.LJLIL = list;
        this.LJLILLLLZI = c776532z;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(InterfaceC67352kd<?> interfaceC67352kd) {
        return new C776432y(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // X.InterfaceC88472Yns
    public final Object invoke(InterfaceC67352kd<? super List<? extends InterfaceC57784Mm4>> interfaceC67352kd) {
        return ((a) create(interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        List<SearchDoc> list = this.LJLIL;
        C776532z c776532z = this.LJLILLLLZI;
        return C785636m.LIZ(list, c776532z.LJ, c776532z.LIZLLL, c776532z.LIZ, new AqS167S0100000_1(c776532z, 14));
    }
}
