package X;

import Y.IDObjectS326S0100000_1;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.4ig, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C117104ig extends AbstractC030309z {
    public static final /* synthetic */ int LJLJI = 0;
    public final int LJLIL;
    public final Paint LJLILLLLZI = new Paint();

    public C117104ig(int i) {
        this.LJLIL = i;
    }

    @Override // X.AbstractC030309z
    public final void LJFF(Canvas c, RecyclerView parent, C0AC state) {
        C117114ih c117114ih;
        int bottom;
        int bottom2;
        o.LJIIIZ(c, "c");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(state, "state");
        Iterator it = new IDObjectS326S0100000_1(parent, 0).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            o.LJIIIZ(view, "view");
            if (view.getTag(R.id.bn_) != null) {
                Object tag = view.getTag(R.id.bn_);
                if ((tag instanceof C117114ih) && (c117114ih = (C117114ih) tag) != null) {
                    int left = view.getLeft();
                    int right = view.getRight();
                    if (c117114ih.LJIIIIZZ) {
                        if (c117114ih.LJ == 48) {
                            bottom2 = view.getTop() - c117114ih.LIZ;
                        } else {
                            bottom2 = view.getBottom();
                        }
                        int i = c117114ih.LIZ + bottom2;
                        this.LJLILLLLZI.setColor(0);
                        c.drawRect(left, bottom2, right, i, this.LJLILLLLZI);
                    }
                    if (c117114ih.LJI) {
                        if (c117114ih.LIZLLL == 48) {
                            bottom = view.getTop() - c117114ih.LJFF;
                        } else {
                            bottom = view.getBottom();
                        }
                        int i2 = c117114ih.LJFF + bottom;
                        this.LJLILLLLZI.setColor(this.LJLIL);
                        float f = c117114ih.LJII;
                        c.drawRect(left + f, bottom, right - f, i2, this.LJLILLLLZI);
                    }
                }
            }
        }
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect outRect, View view, RecyclerView parent, C0AC state) {
        C117114ih c117114ih;
        int i;
        int i2;
        int i3;
        int i4;
        o.LJIIIZ(outRect, "outRect");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(state, "state");
        Object tag = view.getTag(R.id.bn_);
        if (!(tag instanceof C117114ih) || (c117114ih = (C117114ih) tag) == null) {
            return;
        }
        int i5 = 0;
        if (c117114ih.LJIIIIZZ) {
            if (c117114ih.LJ == 48) {
                i5 = c117114ih.LIZ;
                i = 0;
            } else {
                i = c117114ih.LIZ;
            }
            i2 = c117114ih.LIZJ;
            i3 = c117114ih.LIZIZ;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        if (c117114ih.LJI) {
            int i6 = c117114ih.LIZLLL;
            if (i6 == 48) {
                int i7 = c117114ih.LJFF;
                if (i5 < i7) {
                    i5 = i7;
                }
            } else if (i6 == 80 && i < (i4 = c117114ih.LJFF)) {
                i = i4;
            }
        }
        outRect.set(i2, i5, i3, i);
    }
}
