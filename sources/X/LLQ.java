package X;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class LLQ {
    public AbstractC225698tR LIZ = C225688tQ.LIZ;
    public boolean LIZIZ = true;

    public abstract void LIZ(String str, InterfaceC88472Yns<? super Context, ? extends View> interfaceC88472Yns);

    public abstract void LIZIZ(String str, UrlModel urlModel);

    public abstract void LIZJ(ActivityC45651qj activityC45651qj);

    public abstract void LIZLLL(boolean z);

    public abstract void LJ(int i, String str);

    public abstract void LJFF(int i, String str, boolean z);

    public abstract void LJI(boolean z);

    public abstract void LJII(String str, String str2, boolean z);

    public abstract View LJIIIIZZ(String str);

    public abstract int LJIIIZ(String str);

    public abstract View LJIIJ(String str);

    public abstract View LJIIJJI();

    public abstract View LJIIL();

    public abstract View LJIILIIL();

    public CharSequence LJIILJJIL() {
        return null;
    }

    public abstract void LJIILL(String str);

    public boolean LJIIZILJ(String tag) {
        o.LJIIIZ(tag, "tag");
        return false;
    }

    public void LJIJ(ActivityC45651qj activityC45651qj, Configuration newConfig) {
        o.LJIIIZ(newConfig, "newConfig");
    }

    public void LJIJI() {
    }

    public abstract void LJIJJ(String str);

    public abstract void LJIJJLI(String str);

    public abstract void LJIL();

    public abstract void LJJ(String str);

    public abstract void LJJI(String str);

    public abstract void LJJIFFI(String str);

    public abstract void LJJII();

    public abstract void LJJIII(String str);

    public abstract void LJJIIJ(String str);

    public abstract void LJJIIJZLJL(float f);

    public abstract void LJJIIZ(C55949LxZ c55949LxZ);

    public abstract void LJJIIZI(String str, Drawable drawable, AbstractC55918Lx4 abstractC55918Lx4, FrameLayout.LayoutParams layoutParams, ImageView.ScaleType scaleType);

    public abstract void LJJIJ(boolean z, boolean z2);

    public abstract void LJJIJIIJI(int i);

    public abstract void LJJIJIIJIL(String str);

    public abstract void LJJIJIL();

    public abstract void LJJIJL(String str);

    public abstract void LJJIJLIJ(String str, C57568Mia c57568Mia);

    public abstract void LJJIL(String str, L7P l7p);

    public void LJJIZ(String tabTag, String str) {
        o.LJIIIZ(tabTag, "tabTag");
    }

    public abstract void LJJJ(List<? extends InterfaceC54080LKi> list);

    public final boolean LJIILLIIL() {
        return o.LJ(this.LIZ, C225688tQ.LIZ);
    }
}
