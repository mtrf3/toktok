package X;

import android.graphics.PointF;
import android.graphics.RectF;

/* renamed from: X.67Y, reason: invalid class name */
/* loaded from: classes3.dex */
public class C67Y {
    public final /* synthetic */ C67P LIZ;

    public C67Y(C67P c67p) {
        this.LIZ = c67p;
    }

    public final void LIZ(String str, boolean z, boolean z2, boolean z3) {
        if (z) {
            C67P c67p = this.LIZ;
            if (c67p.LLIFFJFJJ != null && !C1JI.LJIL(c67p)) {
                this.LIZ.LLIFFJFJJ.LIZ(str);
            }
        }
        C6DA c6da = this.LIZ.LLFII;
        if (c6da == null) {
            return;
        }
        if (z) {
            H7B.LIZ("TextStickerView -> show bubbleView");
            C67P c67p2 = this.LIZ;
            C6DA c6da2 = c67p2.LLFII;
            if (c6da2 instanceof C6DB) {
                ((C6DB) c6da2).LJIIL = c67p2.LLII;
            }
            RectF bubbleShowLimitRect = c67p2.getBubbleShowLimitRect();
            C67P c67p3 = this.LIZ;
            PointF pointF = c67p3.LLFZ;
            c6da2.LJIIL(bubbleShowLimitRect, (int) pointF.x, (int) pointF.y, c67p3.LJLJJI.LIZIZ, z3);
            return;
        }
        if (z2) {
            c6da.LJII();
        } else {
            c6da.LJII();
        }
    }
}
