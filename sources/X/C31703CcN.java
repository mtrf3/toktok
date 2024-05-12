package X;

import android.widget.ImageView;

/* renamed from: X.CcN, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31703CcN<T> implements InterfaceC04760Gq {
    public final /* synthetic */ C29701Eo LIZ;
    public final /* synthetic */ C31699CcJ LIZIZ;

    public C31703CcN(C29701Eo c29701Eo, C31699CcJ c31699CcJ) {
        this.LIZ = c29701Eo;
        this.LIZIZ = c31699CcJ;
    }

    @Override // X.InterfaceC04760Gq
    public final void onResult(Object obj) {
        this.LIZ.setVisibility(8);
        ImageView imageView = this.LIZIZ.LJLLI;
        if (imageView == null) {
            return;
        }
        imageView.setVisibility(0);
    }
}
