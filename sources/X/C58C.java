package X;

import Y.ALAdapterS1S0100000_2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.58C, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C58C extends LinearLayout {
    public final java.util.Map<Integer, View> LJLIL;

    public final void LIZ() {
        setVisibility(0);
        if (!C135125Sa.LIZ().getBoolean("btnGuideShown", false)) {
            C135125Sa.LIZ().storeBoolean("btnGuideShown", true);
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLIL;
            View view = (View) linkedHashMap.get(Integer.valueOf(R.id.g_y));
            if (view == null) {
                view = findViewById(R.id.g_y);
                if (view != null) {
                    linkedHashMap.put(Integer.valueOf(R.id.g_y), view);
                } else {
                    view = null;
                }
            }
            C29701Eo c29701Eo = (C29701Eo) view;
            if (c29701Eo == null) {
                return;
            }
            c29701Eo.addAnimatorListener(new ALAdapterS1S0100000_2(c29701Eo, 2));
            c29701Eo.playAnimation();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58C(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLIL = C62850Ola.LJFF(context, "context");
        View LLLZIIL = C16880lQ.LLLZIIL(R.layout.i8, C16880lQ.LLZIL(context), this);
        View findViewById = LLLZIIL.findViewById(R.id.ej7);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        View findViewById2 = LLLZIIL.findViewById(R.id.ej7);
        if (findViewById2 != null) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMarginEnd(0);
            findViewById2.setLayoutParams(layoutParams);
        }
        View findViewById3 = LLLZIIL.findViewById(R.id.g_y);
        if (findViewById3 != null) {
            findViewById3.setLayoutParams(new FrameLayout.LayoutParams(C7MY.LIZIZ(30), C7MY.LIZIZ(30)));
        }
        C29701Eo c29701Eo = (C29701Eo) LLLZIIL.findViewById(R.id.g_y);
        if (c29701Eo != null) {
            c29701Eo.setAnimation("tool_editorpro_btn_tux_lottie.json");
        }
        TextView textView = (TextView) LLLZIIL.findViewById(R.id.azq);
        if (textView == null) {
            return;
        }
        textView.setText(C1533360b.LIZ());
    }
}
