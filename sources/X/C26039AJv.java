package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.FetchPushOffReasonsResp;

/* renamed from: X.AJv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26039AJv extends C8BR<C8BS<FetchPushOffReasonsResp>, InterfaceC26038AJu> {
    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        FetchPushOffReasonsResp fetchPushOffReasonsResp;
        K k;
        T t = this.LJLIL;
        if (t == 0 || (fetchPushOffReasonsResp = (FetchPushOffReasonsResp) t.getData()) == null || (k = this.LJLILLLLZI) == 0) {
            return;
        }
        ((InterfaceC26038AJu) k).uj0(fetchPushOffReasonsResp);
    }

    public C26039AJv() {
        LJJ(new C26040AJw());
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        K k = this.LJLILLLLZI;
        if (k != 0) {
            ((InterfaceC26038AJu) k).CX();
        }
    }
}
