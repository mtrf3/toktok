package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.viewmodel.PostDiggViewModel;
import fjb.a;
import kotlin.jvm.internal.AqS1S0210100_3;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.viewmodel.PostDiggViewModel$handleDiggClickFailed$1", f = "PostModeDiggViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.7tk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200407tk extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ PostDiggViewModel LJLIL;
    public final /* synthetic */ Aweme LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C200407tk(PostDiggViewModel postDiggViewModel, Aweme aweme, InterfaceC67352kd<? super C200407tk> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = postDiggViewModel;
        this.LJLILLLLZI = aweme;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C200407tk(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C141335gf.LIZJ(obj);
        PostDiggViewModel postDiggViewModel = this.LJLIL;
        if (!postDiggViewModel.LJLILLLLZI) {
            postDiggViewModel.LJLIL++;
            z = true;
        } else {
            postDiggViewModel.LJLIL--;
            z = false;
        }
        long lv0 = postDiggViewModel.lv0(this.LJLILLLLZI, z);
        PostDiggViewModel postDiggViewModel2 = this.LJLIL;
        postDiggViewModel2.setState(new AqS1S0210100_3(postDiggViewModel2, lv0, this.LJLILLLLZI, z, 1));
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
