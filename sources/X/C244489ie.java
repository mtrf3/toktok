package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.userservice.api.IUserService;

/* renamed from: X.9ie, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C244489ie implements InterfaceC214228aw<InterfaceC244509ig> {
    public final IUserService LIZ;
    public final C244499if LIZIZ = new InterfaceC244509ig() { // from class: X.9if
        @Override // X.InterfaceC244509ig
        public final AbstractC73672Svk<BaseResponse> LIZJ(String str, String str2) {
            return C244489ie.this.LIZ.LIZJ(str, str2);
        }
    };

    @Override // X.InterfaceC214228aw
    public final void release() {
    }

    @Override // X.InterfaceC214228aw
    public final /* bridge */ /* synthetic */ InterfaceC244509ig getOperator() {
        return this.LIZIZ;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.9if] */
    public C244489ie(IUserService iUserService) {
        this.LIZ = iUserService;
    }
}
