package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.o;

/* renamed from: X.Toi, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC75784Toi {
    public ViewGroup LIZ;
    public ViewGroup LIZIZ;
    public boolean LIZJ;

    public abstract String LIZ();

    public abstract int LIZIZ();

    public abstract void LIZJ(ViewGroup viewGroup);

    public void LIZLLL() {
        ViewGroup viewGroup = this.LIZ;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        ViewGroup viewGroup2 = this.LIZ;
        if (viewGroup2 != null) {
            C87277YNd.LJJIIZ(viewGroup2);
        }
        ViewGroup viewGroup3 = this.LIZIZ;
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
        }
        ViewGroup viewGroup4 = this.LIZ;
        if (viewGroup4 != null) {
            C87277YNd.LJJIIZ(viewGroup4);
        }
        this.LIZJ = false;
    }

    public final void LJ(ViewGroup container) {
        ViewGroup viewGroup;
        o.LJIIIZ(container, "container");
        Context context = container.getContext();
        o.LJIIIIZZ(context, "container.context");
        if (C29306Beo.LIZJ(context) == null) {
            return;
        }
        this.LIZIZ = container;
        Context context2 = container.getContext();
        o.LJIIIIZZ(context2, "container.context");
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(C29306Beo.LIZJ(context2)), LIZIZ(), container, false);
        if (LLLLIILL instanceof ViewGroup) {
            viewGroup = (ViewGroup) LLLLIILL;
        } else {
            viewGroup = null;
        }
        this.LIZ = viewGroup;
        container.addView(viewGroup);
        LIZJ(this.LIZ);
        this.LIZJ = true;
    }
}
