package X;

import android.view.View;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS158S0100000_8;

/* renamed from: X.KJk, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51508KJk implements InterfaceC51510KJm {
    public final C62822Ol8 LIZ;
    public final C62822Ol8 LIZIZ;

    public C51508KJk(C51509KJl c51509KJl) {
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS158S0100000_8(c51509KJl, 538));
        this.LIZ = LIZIZ;
        this.LIZIZ = C221108m2.LIZIZ(C51507KJj.LJLIL);
        View view = (View) LIZIZ.getValue();
        if (view != null && c51509KJl.LIZIZ.invoke(view).intValue() == 1) {
            view.findViewById(R.id.ajk).setBackgroundResource(R.drawable.c1h);
        }
    }

    @Override // X.InterfaceC51510KJm
    public final void LIZ(C51511KJn c51511KJn) {
        View view = (View) this.LIZ.getValue();
        if (view != null) {
            int intValue = ((Number) this.LIZIZ.getValue()).intValue();
            int i = c51511KJn.LIZ;
            if (i >= 0 && i <= intValue) {
                view.setVisibility(0);
                ((TextView) view.findViewById(R.id.chu)).setText(String.valueOf(c51511KJn.LIZ + 1));
            } else {
                view.setVisibility(8);
            }
        }
    }
}
