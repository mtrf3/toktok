package X;

import android.graphics.PointF;
import android.graphics.RectF;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KLC extends F9E {
    public final int LJLIL;
    public RectF LJLILLLLZI;
    public PointF LJLJI;
    public boolean LJLJJI;
    public boolean LJLJJL;
    public final RectF LJLJJLL;
    public final boolean LJLJL;

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{Integer.valueOf(this.LJLIL), this.LJLILLLLZI, this.LJLJI, Boolean.valueOf(this.LJLJJI), Boolean.valueOf(this.LJLJJL), this.LJLJJLL, Boolean.valueOf(this.LJLJL)};
    }

    public KLC(int i, RectF rectF, boolean z, boolean z2, int i2) {
        PointF centralPoint;
        i = (i2 & 1) != 0 ? 0 : i;
        if ((i2 & 4) != 0) {
            float f = 2;
            centralPoint = new PointF((rectF.width() / f) + rectF.left, (rectF.height() / f) + rectF.top);
        } else {
            centralPoint = null;
        }
        z = (i2 & 8) != 0 ? true : z;
        RectF clickRectF = (i2 & 32) != 0 ? new RectF() : null;
        z2 = (i2 & 64) != 0 ? false : z2;
        o.LJIIIZ(centralPoint, "centralPoint");
        o.LJIIIZ(clickRectF, "clickRectF");
        this.LJLIL = i;
        this.LJLILLLLZI = rectF;
        this.LJLJI = centralPoint;
        this.LJLJJI = z;
        this.LJLJJL = false;
        this.LJLJJLL = clickRectF;
        this.LJLJL = z2;
    }
}
