package X;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* renamed from: X.03j, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C013103j extends PopupWindow {
    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2) {
        super.showAsDropDown(view, i, i2);
    }

    public C013103j(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        AnonymousClass033 LJIILIIL = AnonymousClass033.LJIILIIL(context, attributeSet, new int[]{R.attr.popupBackground, R.attr.popupAnimationStyle, com.zhiliaoapp.musically.R.attr.b3h}, i, i2);
        if (LJIILIIL.LJIIJJI(2)) {
            C07W.LIZ(this, LJIILIIL.LIZ(2, false));
        }
        setBackgroundDrawable(LJIILIIL.LJ(0));
        LJIILIIL.LJIILJJIL();
    }

    @Override // android.widget.PopupWindow
    public final void showAsDropDown(View view, int i, int i2, int i3) {
        super.showAsDropDown(view, i, i2, i3);
    }

    @Override // android.widget.PopupWindow
    public final void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, i2, i3, i4);
    }
}
