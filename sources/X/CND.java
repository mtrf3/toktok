package X;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.livesdk.container.ui.HybridFragment;
import com.bytedance.android.livesdk.container.ui.PopupContainerFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class CND extends C30891CAl {
    public final /* synthetic */ PopupContainerFragment LIZ;

    public CND(PopupContainerFragment popupContainerFragment) {
        this.LIZ = popupContainerFragment;
    }

    @Override // X.C30891CAl, X.C0KA
    public final void LIZ(View view, float f) {
        CNX cnx;
        View re;
        if (this.LIZ.Dl().getExtraConfig() != null) {
            int height = this.LIZ.Dl().getHeight() + ((int) ((r0.getVariableHeight() - this.LIZ.Dl().getHeight()) * f));
            HybridFragment hybridFragment = this.LIZ.LJLJLLL;
            if (hybridFragment != null && (cnx = hybridFragment.LJLILLLLZI) != null && (re = cnx.re()) != null) {
                C78555UsJ.LJJIJLIJ(height, re);
            }
        }
    }

    @Override // X.C0KA
    public final void LIZIZ(int i, View view) {
        ImageView imageView;
        if (i != 3) {
            if (i != 4 || (imageView = this.LIZ.LJLL) == null) {
                return;
            }
            imageView.setImageResource(R.drawable.d9w);
            return;
        }
        ImageView imageView2 = this.LIZ.LJLL;
        if (imageView2 == null) {
            return;
        }
        imageView2.setImageResource(R.drawable.d9v);
    }
}
