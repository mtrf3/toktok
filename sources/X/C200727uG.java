package X;

import com.ss.android.ugc.aweme.awemeservice.AwemeService;

/* renamed from: X.7uG, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C200727uG extends C200737uH<C178476zT, InterfaceC200717uF> {
    @Override // X.C8BR, X.C8BT
    public final void onSuccess() {
        C15070iV<String, Integer> c15070iV;
        T t = this.LJLIL;
        if (t == 0) {
            c15070iV = null;
        } else {
            c15070iV = (C15070iV) t.getData();
            if (c15070iV != null) {
                AwemeService.LIZ().l6(c15070iV.LIZIZ.intValue(), c15070iV.LIZ);
            }
        }
        K k = this.LJLILLLLZI;
        if (k != 0) {
            ((InterfaceC200717uF) k).onItemDiggSuccess(c15070iV);
        }
    }

    @Override // X.C8BR, X.C8BT
    public final void onFailed(Exception exc) {
        K k = this.LJLILLLLZI;
        if (k != 0) {
            ((InterfaceC200717uF) k).onItemDiggFailed(exc);
        }
    }
}
