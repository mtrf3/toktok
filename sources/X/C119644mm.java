package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* renamed from: X.4mm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C119644mm extends C119624mk {
    @Override // X.C119624mk, X.C72433Sbl, X.C51588KMm, X.C62846OlW
    public final void LIZ() {
        super.LIZ();
        if (getHierarchy().LIZJ != null) {
            getHierarchy().LIZJ.LIZLLL(KL2.LIZJ(getContext(), 1.0f));
            getHierarchy().LIZJ.LJFF = AnonymousClass636.LJIIIIZZ(R.attr.cj, getContext());
            getHierarchy().LIZJ.LJII(KL2.LIZJ(getContext(), 1.0f));
        }
        getHierarchy().LJIJI(R.raw.icon_color_default_avatar, InterfaceC78716Uuu.LJJLIIIJILLIZJL);
    }

    @Override // X.VA9, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // X.C72433Sbl, X.VA9, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    public void setBorderAttrColor(int i) {
        if (getHierarchy().LIZJ != null && getContext() != null) {
            getHierarchy().LIZJ.LJFF = C79045V0n.LJI(i, getContext()).intValue();
        }
    }

    public void setBorderColor(int i) {
        if (getHierarchy().LIZJ != null) {
            getHierarchy().LIZJ.LJFF = C79045V0n.LJI(i, getContext()).intValue();
        }
    }

    public void setBorderWidth(int i) {
        if (getHierarchy().LIZJ != null) {
            getHierarchy().LIZJ.LIZLLL(KL2.LIZJ(getContext(), i));
        }
    }

    public C119644mm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
