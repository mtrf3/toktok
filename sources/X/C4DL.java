package X;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.4DL, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4DL extends AbstractC030309z {
    public static double LJII(View view) {
        Object parent = view.getParent();
        if (parent != null && (parent instanceof View)) {
            return LJII((View) parent);
        }
        return view.getHeight();
    }

    public static int LJIIIIZZ(View view, ViewGroup viewGroup) {
        if (view.getParent() != null && !o.LJ(view.getParent(), viewGroup)) {
            int top = view.getTop();
            Object parent = view.getParent();
            o.LJII(parent, "null cannot be cast to non-null type android.view.View");
            return LJIIIIZZ((View) parent, viewGroup) + top;
        }
        return view.getTop();
    }

    @Override // X.AbstractC030309z
    public final void LJFF(Canvas c, RecyclerView parent, C0AC state) {
        AnonymousClass480 anonymousClass480;
        View view;
        C80862VoQ c80862VoQ;
        o.LJIIIZ(c, "c");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(state, "state");
        if (state.LJIIIIZZ || state.LJI) {
            return;
        }
        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = parent.getChildAt(i);
            RecyclerView.ViewHolder LJJIJIL = parent.LJJIJIL(childAt);
            if (LJJIJIL != null && LJJIJIL.getItemViewType() == EnumC110124Tw.TEXT_SEND.getViewType()) {
                if (!(LJJIJIL instanceof AnonymousClass480) || (anonymousClass480 = (AnonymousClass480) LJJIJIL) == null || anonymousClass480.v0() || (view = anonymousClass480.LLIIIZ) == null) {
                    return;
                }
                Drawable background = view.getBackground();
                if (!(background instanceof C80862VoQ) || (c80862VoQ = (C80862VoQ) background) == null) {
                    return;
                }
                float translationY = childAt.getTranslationY() + LJIIIIZZ(view, parent);
                double LJII = LJII(parent);
                double d = translationY;
                if (c80862VoQ.LJ != LJII || d != c80862VoQ.LJFF) {
                    c80862VoQ.LJ = LJII;
                    C80863VoR c80863VoR = c80862VoQ.LIZ;
                    if (c80863VoR != null) {
                        c80863VoR.LIZLLL = LJII;
                    }
                    c80862VoQ.LJFF = d;
                    c80862VoQ.LIZLLL.setShader(c80862VoQ.LIZ());
                    view.invalidateDrawable(view.getBackground());
                }
            }
        }
    }
}
