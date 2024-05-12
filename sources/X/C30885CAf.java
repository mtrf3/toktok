package X;

import android.view.View;
import android.widget.ImageView;
import com.bytedance.android.livesdk.browser.fragment.HybridDialogFragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.CAf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30885CAf extends C30891CAl {
    public final /* synthetic */ HybridDialogFragment LIZ;

    public C30885CAf(HybridDialogFragment hybridDialogFragment) {
        this.LIZ = hybridDialogFragment;
    }

    @Override // X.C30891CAl, X.C0KA
    public final void LIZ(View view, float f) {
        int LIZ = C15380j0.LIZ(this.LIZ.LLI);
        int i = (int) (((r2.LLILLJJLI - LIZ) * f) + LIZ);
        View re = this.LIZ.LLIIJI.re();
        if (re != null) {
            C78555UsJ.LJJIJLIJ(i, re);
        }
    }

    @Override // X.C0KA
    public final void LIZIZ(int i, View view) {
        ImageView imageView = this.LIZ.LJLJLJ;
        if (imageView == null) {
            return;
        }
        if (i == 3) {
            imageView.setImageResource(R.drawable.d9v);
        } else {
            if (i != 4) {
                return;
            }
            imageView.setImageResource(R.drawable.d9w);
        }
    }
}
