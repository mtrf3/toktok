package X;

import com.ss.android.ugc.aweme.IAccountUserService;

/* renamed from: X.K0n, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51017K0n implements InterfaceC214228aw<C51016K0m> {
    public final IAccountUserService LIZ;

    @Override // X.InterfaceC214228aw
    public final void release() {
    }

    @Override // X.InterfaceC214228aw
    public final C51016K0m getOperator() {
        return new C51016K0m(this.LIZ);
    }

    public C51017K0n(IAccountUserService iAccountUserService) {
        this.LIZ = iAccountUserService;
    }
}
