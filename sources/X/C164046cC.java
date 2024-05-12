package X;

import android.content.Context;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* renamed from: X.6cC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C164046cC extends OPX {
    public void setResizeOptions(C79238V7y c79238V7y) {
    }

    @Override // X.OPX
    public final void LIZ() {
        super.LIZ();
        if (getHierarchy().LIZJ != null) {
            getHierarchy().LIZJ.LIZLLL(KL2.LIZJ(getContext(), 1.0f));
            getHierarchy().LIZJ.LJFF = AnonymousClass636.LJIIIIZZ(R.attr.cl, getContext());
            getHierarchy().LIZJ.LJII(KL2.LIZJ(getContext(), 1.0f));
        }
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public void setBorderColor(int i) {
        if (getHierarchy().LIZJ != null) {
            getHierarchy().LIZJ.LJFF = C04330Ez.LIZIZ(getContext(), i);
        }
    }

    public void setBorderWidth(int i) {
        if (getHierarchy().LIZJ != null) {
            getHierarchy().LIZJ.LIZLLL(KL2.LIZJ(getContext(), i));
        }
    }

    public void setBorderWidthPx(int i) {
        if (getHierarchy().LIZJ != null) {
            getHierarchy().LIZJ.LIZLLL(i);
        }
    }

    public C164046cC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
