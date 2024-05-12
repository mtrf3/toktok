package X;

import Y.ARunnableS38S0100000_2;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveMaxRetainAlogMessageSizeSetting;
import com.bytedance.android.livesdk.livesetting.pullstream.LiveNetAdaptiveHurryTimeSetting;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5GA, reason: invalid class name */
/* loaded from: classes3.dex */
public class C5GA extends View {
    public float LJLIL;
    public float LJLILLLLZI;
    public int LJLJI;
    public final List<C5GB> LJLJJI;

    public void setInterpolator(Interpolator interpolator) {
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Iterator it = ((ArrayList) this.LJLJJI).iterator();
        if (!it.hasNext()) {
            return;
        }
        it.next().getClass();
        System.currentTimeMillis();
        throw null;
    }

    public void setWaveColor(int i) {
        this.LJLJI = i;
    }

    public C5GA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, -1);
        this.LJLJJI = new ArrayList();
        new LinearInterpolator();
        new ARunnableS38S0100000_2(this, 23);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bwg, R.attr.bwi, R.attr.bwj, R.attr.bwk, R.attr.bwl, R.attr.bwm, R.attr.bwq}, -1, 0);
        this.LJLJI = obtainStyledAttributes.getColor(0, -7829368);
        this.LJLIL = obtainStyledAttributes.getDimension(3, 0.0f);
        this.LJLILLLLZI = obtainStyledAttributes.getDimension(5, -1.0f);
        obtainStyledAttributes.getInt(1, LiveNetAdaptiveHurryTimeSetting.DEFAULT);
        obtainStyledAttributes.getInt(4, LiveMaxRetainAlogMessageSizeSetting.DEFAULT);
        obtainStyledAttributes.getFloat(6, 1.0f);
        obtainStyledAttributes.getFloat(2, 0.0f);
        obtainStyledAttributes.recycle();
        new Paint(1).setColor(this.LJLJI);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int min = Math.min(i, i2) / 2;
        float f = this.LJLILLLLZI;
        if (f == -1.0f || f > min) {
            this.LJLILLLLZI = min;
        }
        if (this.LJLIL > min) {
            this.LJLIL = this.LJLILLLLZI / 2.0f;
        }
    }
}
