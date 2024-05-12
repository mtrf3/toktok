package X;

import Y.ACListenerS32S0100000_12;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Sgl, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72743Sgl {
    public final Context LIZ;
    public boolean LIZIZ;
    public final FrameLayout LIZJ;
    public final View LIZLLL;

    public final void LIZ() {
        String string;
        View findViewById = this.LIZLLL.findViewById(R.id.hx4);
        View maskContent = this.LIZLLL.findViewById(R.id.gen);
        TextView textView = (TextView) this.LIZLLL.findViewById(R.id.geo);
        if (C77266UUc.LIZIZ.LJI()) {
            string = this.LIZ.getString(R.string.rzy);
        } else {
            string = this.LIZ.getString(R.string.duy);
        }
        o.LJIIIIZZ(string, "if (FriendsService.isSup…ess_disclosure)\n        }");
        textView.setText(string);
        findViewById.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.ed, this.LIZ));
        o.LJIIIIZZ(maskContent, "maskContent");
        ViewGroup.LayoutParams layoutParams = maskContent.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = (int) ((C63081OpJ.LJJJJJL(this.LIZ) * 0.025d) + C63081OpJ.LJJJJLI(this.LIZ));
            maskContent.setLayoutParams(marginLayoutParams);
            C16880lQ.LJLLLL(this.LIZLLL, this.LIZJ);
            this.LIZJ.addView(this.LIZLLL);
            this.LIZIZ = true;
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public C72743Sgl(Context context) {
        o.LJIIIZ(context, "context");
        this.LIZ = context;
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
        o.LJI(LJJIFFI);
        FrameLayout frameLayout = (FrameLayout) LJJIFFI.getWindow().getDecorView().findViewById(android.R.id.content);
        this.LIZJ = frameLayout;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.ayc, frameLayout, false);
        this.LIZLLL = LLLLIILL;
        C16880lQ.LJIIJ(new ACListenerS32S0100000_12(this, 20), LLLLIILL);
    }
}
