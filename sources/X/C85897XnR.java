package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: X.XnR, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85897XnR extends C8BR<C8BS<BaseResponse>, InterfaceC85903XnX> {
    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        K k;
        T t = this.LJLIL;
        if (t == 0 || t.getData() == null || (k = this.LJLILLLLZI) == 0) {
            return;
        }
        ((InterfaceC85903XnX) k).LLJJ();
    }

    public C85897XnR() {
        LJJ(new C85898XnS());
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        K k = this.LJLILLLLZI;
        if (k != 0) {
            ((InterfaceC85903XnX) k).vx();
        }
    }
}
