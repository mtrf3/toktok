package X;

import com.ss.android.ugc.trill.share.api.AutoShare;

/* renamed from: X.Gxt, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43229Gxt extends C8BR<C8BS<AutoShare>, InterfaceC43231Gxv> {
    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        K k;
        T t = this.LJLIL;
        if (t == 0 || t.getData() == null || (k = this.LJLILLLLZI) == 0) {
            return;
        }
        ((InterfaceC43231Gxv) k).as();
    }

    public C43229Gxt() {
        LJJ(new C43230Gxu());
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        K k = this.LJLILLLLZI;
        if (k != 0) {
            ((InterfaceC43231Gxv) k).pW();
        }
    }
}
