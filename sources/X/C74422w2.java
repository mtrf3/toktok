package X;

import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.cs.core.model.ClickSearchViewModel$setVisibleIndex$2", f = "ClickSearchDataModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2w2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74422w2 extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ ClickSearchViewModel LJLIL;
    public final /* synthetic */ Integer LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C74422w2(ClickSearchViewModel clickSearchViewModel, Integer num, InterfaceC67352kd<? super C74422w2> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = clickSearchViewModel;
        this.LJLILLLLZI = num;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C74422w2(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        ((LiveData) this.LJLIL.LJLJJI.getValue()).setValue(this.LJLILLLLZI);
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
