package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: X.AJn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26031AJn extends C8BR<C8BS<BaseResponse>, InterfaceC26036AJs> {
    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        BaseResponse baseResponse;
        K k;
        T t = this.LJLIL;
        if (t == 0 || (baseResponse = (BaseResponse) t.getData()) == null || (k = this.LJLILLLLZI) == 0) {
            return;
        }
        if (baseResponse.status_code == 0) {
            ((InterfaceC26036AJs) k).Vt();
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("status_code: ");
        LIZ.append(baseResponse.status_code);
        X1D.LIZIZ(LIZ);
        ((InterfaceC26036AJs) k).pf();
    }

    public C26031AJn() {
        LJJ(new C26033AJp());
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        K k = this.LJLILLLLZI;
        if (k != 0) {
            exc.getMessage();
            ((InterfaceC26036AJs) k).pf();
        }
    }
}
