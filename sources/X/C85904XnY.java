package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.XnY, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C85904XnY extends C8BR<C8BS<BaseResponse>, InterfaceC85903XnX> {
    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        K k;
        T t = this.LJLIL;
        if (t == 0) {
            return;
        }
        o.LJI(t);
        if (t.getData() == null || (k = this.LJLILLLLZI) == 0) {
            return;
        }
        o.LJI(k);
        ((InterfaceC85903XnX) k).LLJJ();
    }

    public C85904XnY() {
        LJJ(new C85905XnZ());
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception e) {
        o.LJIIIZ(e, "e");
        K k = this.LJLILLLLZI;
        if (k != 0) {
            o.LJI(k);
            ((InterfaceC85903XnX) k).vx();
        }
    }
}
