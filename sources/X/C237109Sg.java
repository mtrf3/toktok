package X;

import com.ss.android.ugc.aweme.profile.widgets.common.UserProfileInfoVM;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.profile.widgets.common.UserProfileInfoVM$getUserInfo$1", f = "UserProfileInfoVM.kt", l = {108, 109}, m = "invokeSuspend")
/* renamed from: X.9Sg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C237109Sg extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public int LJLIL;
    public final /* synthetic */ UserProfileInfoVM LJLILLLLZI;
    public final /* synthetic */ int LJLJI;
    public final /* synthetic */ EnumC235129Kq LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C237109Sg(UserProfileInfoVM userProfileInfoVM, int i, EnumC235129Kq enumC235129Kq, InterfaceC67352kd<? super C237109Sg> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLILLLLZI = userProfileInfoVM;
        this.LJLJI = i;
        this.LJLJJI = enumC235129Kq;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C237109Sg(this.LJLILLLLZI, this.LJLJI, this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6 A[RETURN] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C237109Sg.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
