package X;

import Y.ARunnableS33S0200000_14;
import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.VxJ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81413VxJ implements InterfaceC81422VxS {
    public final /* synthetic */ C81518Vz0 LIZ;

    public C81413VxJ(C81518Vz0 c81518Vz0) {
        this.LIZ = c81518Vz0;
    }

    @Override // X.InterfaceC81422VxS
    public final void LIZ(Object obj, int i, int i2, boolean z, boolean z2) {
        C81366VwY c81366VwY;
        TextView textView;
        int childCount = this.LIZ.LLJILJILJ().getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.LIZ.LLJILJILJ().getChildAt(i3);
            if ((childAt instanceof C81366VwY) && (c81366VwY = (C81366VwY) childAt) != null && (textView = c81366VwY.getTextView()) != null) {
                C81518Vz0 c81518Vz0 = this.LIZ;
                if (i3 == i) {
                    if (c81518Vz0.LJLL) {
                        textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
                    }
                    textView.post(new ARunnableS33S0200000_14(textView, c81518Vz0, 44));
                } else if (c81518Vz0.LJLL) {
                    textView.setShadowLayer(5.0f, 0.0f, 1.0f, textView.getContext().getResources().getColor(R.color.ca));
                }
            }
        }
    }
}
