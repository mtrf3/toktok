package X;

import android.content.res.Configuration;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.tablet.impl.business.bookmode.split.DrawerLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public abstract class Y94 {
    public final Y91 LIZ;
    public final DrawerLayout LIZIZ;
    public final ViewGroup LIZJ;
    public final ViewGroup LIZLLL;
    public final float LJ;
    public final Y9A LJFF;

    public abstract void LIZ();

    public abstract void LIZIZ();

    public abstract void LJ(boolean z, Configuration configuration);

    public abstract void LJFF();

    public abstract void LJI();

    public abstract void LJII(float f);

    public abstract void LJIIIIZZ();

    public final void LIZLLL(float f) {
        ViewGroup viewGroup = this.LIZJ;
        int width = this.LIZIZ.getWidth();
        int i = width - ((int) ((width * this.LJ) * f));
        if (i == viewGroup.getLayoutParams().width) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.width = i;
        viewGroup.setLayoutParams(layoutParams);
    }

    public final void LIZJ(int i, int i2) {
        ViewGroup viewGroup = this.LIZJ;
        o.LJIIIZ(viewGroup, "<this>");
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.width = i;
        viewGroup.setLayoutParams(layoutParams);
        ViewGroup viewGroup2 = this.LIZLLL;
        o.LJIIIZ(viewGroup2, "<this>");
        ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
        layoutParams2.width = i2;
        viewGroup2.setLayoutParams(layoutParams2);
    }

    public Y94(Y91 bookModeContainer, DrawerLayout drawerLayout, ViewGroup viewGroup, ViewGroup viewGroup2, float f, Y9A hiddenChangedAction) {
        o.LJIIIZ(bookModeContainer, "bookModeContainer");
        o.LJIIIZ(hiddenChangedAction, "hiddenChangedAction");
        this.LIZ = bookModeContainer;
        this.LIZIZ = drawerLayout;
        this.LIZJ = viewGroup;
        this.LIZLLL = viewGroup2;
        this.LJ = f;
        this.LJFF = hiddenChangedAction;
    }
}
