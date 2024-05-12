package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.7Fl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C182817Fl {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, View view) {
        int i2;
        if (!((Boolean) C182827Fm.LIZ.getValue()).booleanValue() || !o.LJ("local_test", EF7.LJIILIIL)) {
            if (!o.LJ("debug", EF7.LJIILIIL) || view == null || !(view instanceof ViewGroup)) {
                return;
            }
        } else if (view == null) {
            return;
        }
        if (view.getTag() != null && (view.getTag() instanceof TuxTextView)) {
            ViewGroup viewGroup = (ViewGroup) view;
            C16880lQ.LJLLL((View) viewGroup.getTag(), viewGroup);
        }
        Context context = view.getContext();
        o.LJIIIIZZ(context, "it.context");
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        Integer LIZIZ = C19N.LIZIZ(view, "it.context", R.attr.eb);
        if (LIZIZ != null) {
            i2 = LIZIZ.intValue();
        } else {
            i2 = 0;
        }
        tuxTextView.setTextColor(i2);
        if (i != -1) {
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        return;
                    }
                    tuxTextView.setText("chunk_remain");
                    tuxTextView.setVisibility(0);
                    ViewGroup viewGroup2 = (ViewGroup) view;
                    viewGroup2.addView(tuxTextView);
                    viewGroup2.setTag(tuxTextView);
                    return;
                }
                tuxTextView.setText("chunk_1");
                tuxTextView.setVisibility(0);
                ViewGroup viewGroup3 = (ViewGroup) view;
                viewGroup3.addView(tuxTextView);
                viewGroup3.setTag(tuxTextView);
                return;
            }
            tuxTextView.setText("predict");
            tuxTextView.setVisibility(0);
            ViewGroup viewGroup4 = (ViewGroup) view;
            viewGroup4.addView(tuxTextView);
            viewGroup4.setTag(tuxTextView);
            return;
        }
        tuxTextView.setVisibility(8);
    }
}
