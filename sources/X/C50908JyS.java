package X;

import com.ss.android.ugc.aweme.detail.model.BatchDetailList;

/* renamed from: X.JyS, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50908JyS extends C8BR<C224478rT, InterfaceC50666JuY> {
    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        T t;
        if (this.LJLILLLLZI != 0 && (t = this.LJLIL) != 0 && t.getData() != null) {
            ((InterfaceC50666JuY) this.LJLILLLLZI).s00(((BatchDetailList) this.LJLIL.getData()).items);
        }
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        K k = this.LJLILLLLZI;
        if (k != 0) {
            ((InterfaceC50666JuY) k).Yv(exc);
        }
    }
}
