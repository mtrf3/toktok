package X;

import com.ss.android.ugc.aweme.im.service.model.IMUser;
import fjb.a;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.im.sdk.common.data.service.IMUserService$updateIMUserFollowStatus$1", f = "IMUserService.kt", l = {117}, m = "invokeSuspend")
/* renamed from: X.3Fb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C80793Fb extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super C76800UCe>, Object> {
    public C68322mC LJLIL;
    public IMUser LJLILLLLZI;
    public int LJLJI;
    public final /* synthetic */ IMUser LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C80793Fb(IMUser iMUser, InterfaceC67352kd<? super C80793Fb> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJI = iMUser;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new C80793Fb(this.LJLJJI, interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.ss.android.ugc.aweme.im.service.model.IMUser, T] */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.ss.android.ugc.aweme.im.service.model.IMUser, T] */
    @Override // fjb.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80793Fb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
