package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.poi.PoiSubTag;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes10.dex */
public final class LC5 {
    public static final float LIZ = C7MY.LIZIZ(50);

    public static final boolean LIZ(List<PoiSubTag> list) {
        if (list != null) {
            Iterator<PoiSubTag> it = list.iterator();
            while (it.hasNext()) {
                Integer type = it.next().getType();
                if (type == null || type.intValue() != 6) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public static final int LIZIZ(View view) {
        Number valueOf;
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        int i2 = 0;
        if (view == null || view.getVisibility() != 0) {
            return 0;
        }
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            valueOf = Float.valueOf(textView.getPaint().measureText(textView.getText().toString()));
        } else {
            valueOf = Integer.valueOf(view.getLayoutParams().width);
        }
        int intValue = valueOf.intValue();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            i = marginLayoutParams2.leftMargin;
        } else {
            i = 0;
        }
        int i3 = intValue + i;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
            i2 = marginLayoutParams.rightMargin;
        }
        return i3 + i2;
    }

    public static final void LIZJ(TuxTextView tuxTextView, TuxTextView tuxTextView2, ViewGroup viewGroup, boolean z, int i, int i2, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        int i3 = i;
        if (tuxTextView == null || tuxTextView2 == null) {
            return;
        }
        float measureText = tuxTextView.getPaint().measureText(tuxTextView.getText().toString());
        float measureText2 = tuxTextView2.getPaint().measureText(tuxTextView2.getText().toString());
        if (tuxTextView2.getVisibility() != 0) {
            i3 = 0;
        }
        tuxTextView.post(new LC6(tuxTextView, interfaceC88472Yns, measureText, measureText2, i3, i2, z, tuxTextView2, viewGroup));
    }
}
