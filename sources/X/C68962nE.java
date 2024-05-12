package X;

import com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.FakeMessageViewModel;
import fjb.a;
import java.util.ArrayList;
import java.util.Iterator;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.chat.viewmodel.FakeMessageViewModel$checkBlockStatus$1$1", f = "FakeMessageViewModel.kt", l = {}, m = "invokeSuspend")
/* renamed from: X.2nE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C68962nE extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public final /* synthetic */ FakeMessageViewModel LJLIL;
    public final /* synthetic */ java.util.Set<String> LJLILLLLZI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C68962nE(FakeMessageViewModel fakeMessageViewModel, java.util.Set<String> set, InterfaceC67352kd<? super C68962nE> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLIL = fakeMessageViewModel;
        this.LJLILLLLZI = set;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C68962nE(this.LJLIL, this.LJLILLLLZI, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        C141335gf.LIZJ(obj);
        FakeMessageViewModel fakeMessageViewModel = this.LJLIL;
        ArrayList<String> arrayList = fakeMessageViewModel.LJLJL;
        java.util.Set<String> set = this.LJLILLLLZI;
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (set.contains(next)) {
                InterfaceC68952nD interfaceC68952nD = fakeMessageViewModel.LJLJJI;
                if (interfaceC68952nD != null) {
                    interfaceC68952nD.w(next, true, false);
                }
            } else {
                InterfaceC68952nD interfaceC68952nD2 = fakeMessageViewModel.LJLJJI;
                if (interfaceC68952nD2 != null) {
                    interfaceC68952nD2.w(next, false, false);
                }
            }
        }
        return C76800UCe.LIZ;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
