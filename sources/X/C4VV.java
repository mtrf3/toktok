package X;

import com.ss.android.ugc.aweme.im.sdk.group.feature.invite.viewmodel.GroupShareViewModel;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.group.feature.invite.viewmodel.GroupShareViewModel$requestGroupShareLink$1", f = "GroupShareViewModel.kt", l = {79, 88}, m = "invokeSuspend")
/* renamed from: X.4VV, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4VV extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ GroupShareViewModel LJLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4VV(GroupShareViewModel groupShareViewModel, InterfaceC67352kd<? super C4VV> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJI = groupShareViewModel;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        C4VV c4vv = new C4VV(this.LJLJI, interfaceC67352kd);
        c4vv.LJLILLLLZI = obj;
        return c4vv;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4VV.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
