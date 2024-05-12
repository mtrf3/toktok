package X;

import Y.ACListenerS28S0101000_10;
import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* loaded from: classes11.dex */
public final class NZD {
    public PopupWindow LIZ;
    public View LIZIZ;
    public View LIZJ;
    public View LIZLLL;
    public List<Integer> LJ;
    public final Activity LJFF;
    public final InterfaceC59561NZd LJI;
    public final ACListenerS28S0101000_10 LJII = new ACListenerS28S0101000_10(1, this, 0);

    public final PopupWindow LIZ() {
        if (this.LIZ == null) {
            View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(this.LJFF), R.layout.ajh, null, false);
            this.LIZIZ = LLLLIILL.findViewById(R.id.itn);
            this.LIZJ = LLLLIILL.findViewById(R.id.bva);
            this.LIZLLL = LLLLIILL.findViewById(R.id.hbo);
            C16880lQ.LJIIJ(this.LJII, this.LIZIZ);
            C16880lQ.LJIIJ(this.LJII, this.LIZJ);
            C16880lQ.LJIIJ(this.LJII, this.LIZLLL);
            PopupWindow popupWindow = new PopupWindow(LLLLIILL, -2, -2, true);
            this.LIZ = popupWindow;
            popupWindow.setTouchable(true);
            this.LIZ.setAnimationStyle(R.style.a6k);
            this.LIZ.setBackgroundDrawable(new ColorDrawable(0));
        }
        return this.LIZ;
    }

    public NZD(Activity activity, InterfaceC59561NZd interfaceC59561NZd) {
        this.LJFF = activity;
        this.LJI = interfaceC59561NZd;
        LIZ();
    }
}
