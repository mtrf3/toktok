package X;

import android.content.Context;
import android.graphics.Paint;
import android.util.TypedValue;
import com.bytedance.android.livesdk.livesetting.broadcast.LivePreviewNetworkSpeedThresholdSetting;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VY6 extends VY7 {
    public long LJLJLLL;
    public final Paint LJLL;
    public float LJLLI;
    public final Paint LJLLILLLL;
    public final float LJLLJ;
    public final float LJLLL;
    public final LinkedList<Object> LJLLLL;
    public final LinkedList<Float> LJLLLLLL;
    public final HashMap<Integer, Float> LJLZ;
    public boolean LJZ;
    public int LJZI;
    public final LinkedList<Integer> LJZL;
    public int LL;
    public float LLD;

    @Override // X.VY7
    public final float LIZIZ() {
        return (this.LJLLJ * 2) + ((((float) this.LJLJLLL) * 1.0f) / getScaleRuler());
    }

    public final int getXOffset() {
        return (int) (-this.LJLLJ);
    }

    @Override // X.VY7
    public final void LIZJ() {
        super.LIZJ();
        this.LL = (int) Math.ceil((getHopeWidth() - (2 * this.LJLLJ)) / getParentWidth());
        LIZLLL(true);
    }

    @Override // X.VY7
    public final float LIZ() {
        return this.LJLLL;
    }

    public final void LIZLLL(boolean z) {
        int floor = (int) Math.floor(((getParentWidth() / 2) - getXOnScreen()) / getParentWidth());
        if (this.LJZI != floor || z) {
            this.LJZI = floor;
            this.LJZL.clear();
            int i = this.LJZI;
            if (i - 1 >= 0) {
                this.LJZL.add(Integer.valueOf(i - 1));
            }
            this.LJZL.add(Integer.valueOf(this.LJZI));
            int i2 = this.LJZI;
            if (i2 + 1 < this.LL && i2 + 1 >= 0) {
                this.LJZL.add(Integer.valueOf(i2 + 1));
            }
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x012c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r22) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.VY6.onDraw(android.graphics.Canvas):void");
    }

    public final void setSortAnimF(float f) {
        this.LLD = f;
        invalidate();
    }

    public final void setTotalProgress(long j) {
        this.LJLJLLL = j;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VY6(Context context, VYX vyx) {
        super(context, vyx);
        new LinkedHashMap();
        o.LJI(vyx);
        this.LJLJLLL = LivePreviewNetworkSpeedThresholdSetting.DEFAULT;
        Paint paint = new Paint();
        this.LJLL = paint;
        Paint paint2 = new Paint();
        this.LJLLILLLL = paint2;
        Context context2 = getContext();
        o.LJIIIIZZ(context2, "getContext()");
        this.LJLLJ = J75.LIZ(context2, 20.0f);
        Context context3 = getContext();
        o.LJIIIIZZ(context3, "getContext()");
        this.LJLLL = J75.LIZ(context3, 16.0f);
        this.LJLLLL = new LinkedList<>();
        this.LJLLLLLL = new LinkedList<>();
        this.LJLZ = new HashMap<>();
        this.LJZ = true;
        this.LJZI = -9999;
        this.LJZL = new LinkedList<>();
        paint.setColor(-16777216);
        paint.setAntiAlias(true);
        paint.setTextSize(TypedValue.applyDimension(2, 10.0f, getContext().getResources().getDisplayMetrics()));
        paint2.setAntiAlias(true);
        paint2.setColor(-16777216);
        Context context4 = getContext();
        o.LJIIIIZZ(context4, "getContext()");
        paint2.setStrokeWidth(J75.LIZ(context4, 2.0f));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setAlpha(127);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension((int) getHopeWidth(), (int) getHopeHeight());
    }
}
