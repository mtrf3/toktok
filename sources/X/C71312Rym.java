package X;

import Y.IDObjectS332S0100000_12;
import Y.IDObjectS5S0101000_12;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.Rym, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71312Rym extends AbstractC030309z {
    public static final /* synthetic */ int LJLJJI = 0;
    public final int LJLIL;
    public final float LJLILLLLZI;
    public final Paint LJLJI;

    public C71312Rym(float f, int i, int i2) {
        this.LJLIL = i2;
        this.LJLILLLLZI = f;
        Paint paint = new Paint();
        this.LJLJI = paint;
        paint.setColor(i);
    }

    @Override // X.AbstractC030309z
    public final void LJFF(Canvas c, RecyclerView parent, C0AC state) {
        o.LJIIIZ(c, "c");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(state, "state");
        Iterator it = new IDObjectS332S0100000_12(parent, 15).iterator();
        while (true) {
            IDObjectS5S0101000_12 iDObjectS5S0101000_12 = (IDObjectS5S0101000_12) it;
            if (iDObjectS5S0101000_12.hasNext()) {
                View view = (View) iDObjectS5S0101000_12.next();
                o.LJIIIZ(view, "view");
                if (view.getTag(R.id.bn_) != null) {
                    int left = view.getLeft();
                    int right = view.getRight();
                    int bottom = view.getBottom();
                    int bottom2 = view.getBottom() + this.LJLIL;
                    float f = this.LJLILLLLZI;
                    c.drawRect(left + f, bottom, right - f, bottom2, this.LJLJI);
                }
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C71312Rym(float r3, int r4, int r5, int r6) {
        /*
            r2 = this;
            r0 = r5 & 2
            if (r0 == 0) goto L10
            r1 = 1
        L5:
            r0 = r5 & 4
            if (r0 == 0) goto Lc
            int r0 = X.C27162AlK.LJIIIIZZ
            float r3 = (float) r0
        Lc:
            r2.<init>(r3, r4, r1)
            return
        L10:
            r1 = 0
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71312Rym.<init>(float, int, int, int):void");
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect outRect, View view, RecyclerView parent, C0AC state) {
        o.LJIIIZ(outRect, "outRect");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(state, "state");
        if (view.getTag(R.id.bn_) != null) {
            outRect.set(0, 0, 0, this.LJLIL);
        }
    }
}
