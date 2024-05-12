package X;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.NVb, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59455NVb {
    public final Activity LIZ;
    public PopupWindow LIZIZ;
    public View LIZJ;
    public View LIZLLL;
    public View LJ;

    public final void LIZ() {
        View view = this.LIZJ;
        if (view != null) {
            view.setVisibility(0);
        }
        View view2 = this.LIZLLL;
        o.LJI(view2);
        view2.setVisibility(0);
        View view3 = this.LJ;
        o.LJI(view3);
        view3.setVisibility(0);
    }

    public final PopupWindow LIZIZ(View.OnClickListener onClickListener) {
        if (this.LIZIZ == null) {
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LIZ), R.layout.g0, null, false);
            this.LIZJ = LLLLIILL.findViewById(R.id.itn);
            this.LIZLLL = LLLLIILL.findViewById(R.id.bva);
            this.LJ = LLLLIILL.findViewById(R.id.hbo);
            View view = this.LIZJ;
            if (view != null) {
                C16880lQ.LJIIJ(onClickListener, view);
            }
            View view2 = this.LIZLLL;
            if (view2 != null) {
                C16880lQ.LJIIJ(onClickListener, view2);
            }
            View view3 = this.LJ;
            if (view3 != null) {
                C16880lQ.LJIIJ(onClickListener, view3);
            }
            PopupWindow popupWindow = new PopupWindow(LLLLIILL, -2, -2, true);
            this.LIZIZ = popupWindow;
            popupWindow.setTouchable(true);
            PopupWindow popupWindow2 = this.LIZIZ;
            o.LJI(popupWindow2);
            popupWindow2.setAnimationStyle(R.style.a4o);
            PopupWindow popupWindow3 = this.LIZIZ;
            o.LJI(popupWindow3);
            popupWindow3.setBackgroundDrawable(new ColorDrawable(0));
        }
        PopupWindow popupWindow4 = this.LIZIZ;
        o.LJI(popupWindow4);
        return popupWindow4;
    }

    public C59455NVb(Activity activity, View.OnClickListener onClickListener) {
        this.LIZ = activity;
        LIZIZ(onClickListener);
    }
}
