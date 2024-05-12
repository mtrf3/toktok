package X;

import X.InterfaceC93650aUI;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.IDqS5S0201000_42;
import kotlin.jvm.internal.o;

/* renamed from: X.aUJ, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public class C93651aUJ<T extends InterfaceC93650aUI> extends PopupWindow {
    public InterfaceC93649aUH<T> LIZ;
    public LinearLayout LIZIZ;
    public C93621aTp LIZJ;
    public final int LIZLLL;

    public C93651aUJ(int i, int i2) {
        super(i, i2);
        this.LIZLLL = i;
        setAnimationStyle(R.style.adk);
    }

    public final void LIZ(Context context, List<? extends T> list) {
        int i;
        C93788aWW LIZ;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(list, "list");
        LinearLayout linearLayout = this.LIZIZ;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        } else {
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.LIZIZ = linearLayout2;
            linearLayout2.setOrientation(1);
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            View inflate = View.inflate(context, R.layout.dw_, null);
            o.LJIIIIZZ(inflate, "View.inflate(\n          …       null\n            )");
            View findViewById = inflate.findViewById(R.id.npx);
            o.LJIIIIZZ(findViewById, "view.findViewById<TextView>(R.id.tv_name_pop_item)");
            ((TextView) findViewById).setText(context.getString(((InterfaceC93650aUI) ListProtector.get(list, i2)).LIZIZ()));
            ((TextView) inflate.findViewById(R.id.npx)).setTextColor(context.getResources().getColor(((InterfaceC93650aUI) ListProtector.get(list, i2)).LIZ()));
            inflate.findViewById(R.id.nnk).setBackgroundResource(((InterfaceC93650aUI) ListProtector.get(list, i2)).LIZJ());
            View findViewById2 = inflate.findViewById(R.id.n_v);
            o.LJIIIIZZ(findViewById2, "view.findViewById<View>(R.id.view_divider)");
            if (i2 == list.size() - 1) {
                i = 8;
            } else {
                i = 0;
            }
            findViewById2.setVisibility(i);
            inflate.setClickable(true);
            C93750aVu.LIZ(inflate, 800L, new IDqS5S0201000_42(this, i2, list, 0));
            if (list.size() == 1) {
                LIZ = C93787aWV.LIZ(C93410aQQ.LIZ(12.0f), C93410aQQ.LIZ(12.0f), C93410aQQ.LIZ(12.0f), C93410aQQ.LIZ(12.0f), C04330Ez.LIZIZ(context, R.color.adh), C04330Ez.LIZIZ(context, R.color.ado));
            } else if (i2 == 0) {
                LIZ = C93787aWV.LIZ(C93410aQQ.LIZ(12.0f), C93410aQQ.LIZ(12.0f), 0.0f, 0.0f, C04330Ez.LIZIZ(context, R.color.adh), C04330Ez.LIZIZ(context, R.color.ado));
            } else if (i2 == list.size() - 1) {
                LIZ = C93787aWV.LIZ(0.0f, 0.0f, C93410aQQ.LIZ(12.0f), C93410aQQ.LIZ(12.0f), C04330Ez.LIZIZ(context, R.color.adh), C04330Ez.LIZIZ(context, R.color.ado));
            } else {
                LIZ = C93787aWV.LIZ(0.0f, 0.0f, 0.0f, 0.0f, C04330Ez.LIZIZ(context, R.color.adh), C04330Ez.LIZIZ(context, R.color.ado));
            }
            inflate.setBackground(LIZ);
            LinearLayout linearLayout3 = this.LIZIZ;
            if (linearLayout3 != null) {
                linearLayout3.addView(inflate);
            }
        }
        if (this.LIZJ == null) {
            C93621aTp c93621aTp = new C93621aTp(context, null);
            c93621aTp.setBorderPaintColor(context.getResources().getColor(R.color.adm));
            c93621aTp.setGradientBorder(false);
            c93621aTp.setRadius(KL2.LIZJ(context, 12.0f));
            this.LIZJ = c93621aTp;
            c93621aTp.addView(this.LIZIZ);
            setContentView(this.LIZJ);
        }
    }
}
