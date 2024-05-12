package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4LE, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4LE {
    public View LIZ;
    public TuxTextView LIZIZ;

    public final void LIZ() {
        ViewGroup viewGroup;
        View view = this.LIZ;
        if (view != null) {
            Context context = view.getContext();
            if (context == null || this.LIZIZ != null) {
                return;
            }
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            tuxTextView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            tuxTextView.setBackgroundColor(AnonymousClass636.LJIIIIZZ(R.attr.cv, context));
            C26338AVi.LJIIIZ(tuxTextView, Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(16))), AnonymousClass391.LIZJ(12), AnonymousClass391.LIZJ(16), Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(12))), 16);
            tuxTextView.setText(context.getText(R.string.cim));
            tuxTextView.setMaxLines(1);
            tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.gu, context));
            tuxTextView.setTuxFont(41);
            tuxTextView.measure(0, 0);
            View view2 = this.LIZ;
            if (view2 != null) {
                C26338AVi.LJI(view2, null, Integer.valueOf(tuxTextView.getMeasuredHeight()), null, null, false, 29);
                View view3 = this.LIZ;
                if (view3 != null) {
                    ViewParent parent = view3.getParent();
                    if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                        viewGroup.addView(tuxTextView, 0);
                    }
                    this.LIZIZ = tuxTextView;
                    return;
                }
                o.LJIJI("collectListView");
                throw null;
            }
            o.LJIJI("collectListView");
            throw null;
        }
        o.LJIJI("collectListView");
        throw null;
    }

    public final void LIZIZ() {
        ViewGroup viewGroup;
        TuxTextView tuxTextView = this.LIZIZ;
        if (tuxTextView != null) {
            this.LIZIZ = null;
            View view = this.LIZ;
            if (view != null) {
                C26338AVi.LJI(view, null, AnonymousClass391.LIZJ(8), null, null, false, 29);
                View view2 = this.LIZ;
                if (view2 != null) {
                    ViewParent parent = view2.getParent();
                    if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                        C16880lQ.LJLLL(tuxTextView, viewGroup);
                        return;
                    }
                    return;
                }
                o.LJIJI("collectListView");
                throw null;
            }
            o.LJIJI("collectListView");
            throw null;
        }
    }

    @QD3
    public final void onPrivacyChanged(C79723Ay event) {
        o.LJIIIZ(event, "event");
        Integer M = event.LJLIL.M("favorite_music");
        if (M == null || M.intValue() != 2) {
            LIZ();
        } else {
            LIZIZ();
        }
    }
}
