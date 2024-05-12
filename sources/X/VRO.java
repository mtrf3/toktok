package X;

import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.lynx.react.bridge.ReadableArray;
import com.lynx.tasm.base.LLog;

/* loaded from: classes15.dex */
public final class VRO extends VRP {
    public final int LJLJLJ;
    public final int LJLJLLL;
    public final int LJLL;
    public final float LJLLI;
    public final float LJLLILLLL;
    public final PointF LJLLJ = new PointF(0.5f, 0.5f);

    public static float LJIIIZ(float f, float f2, int i) {
        if (i == 11) {
            return (f2 * f) / 100.0f;
        }
        switch (i) {
            case 32:
            case 35:
                return 0.0f;
            case 33:
            case 34:
                return f2;
            case 36:
                return f2 * 0.5f;
            default:
                return f;
        }
    }

    public VRO(ReadableArray readableArray) {
        this.LJLJLLL = 36;
        this.LJLL = 36;
        this.LJLLI = 0.5f;
        this.LJLLILLLL = 0.5f;
        if (readableArray == null) {
            LLog.LIZLLL(4, "RadialGradient", "native parser error, array is null");
            return;
        }
        if (readableArray.size() != 3) {
            LLog.LIZLLL(4, "RadialGradient", "native parser error, array.size must be 3");
        }
        ReadableArray array = readableArray.getArray(0);
        this.LJLJLJ = array.getInt(1);
        this.LJLJLLL = array.getInt(2);
        this.LJLLI = (float) array.getDouble(3);
        this.LJLL = array.getInt(4);
        this.LJLLILLLL = (float) array.getDouble(5);
        LJIIIIZZ(readableArray.getArray(1), readableArray.getArray(2));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        double sqrt;
        this.LJLJI = rect.width();
        this.LJLJJI = rect.height();
        this.LJLLJ.x = LJIIIZ(this.LJLLI, this.LJLJI, this.LJLJLLL);
        this.LJLLJ.y = LJIIIZ(this.LJLLILLLL, this.LJLJJI, this.LJLL);
        PointF pointF = this.LJLLJ;
        float f = pointF.x;
        float f2 = pointF.y;
        int i = this.LJLJLJ;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        sqrt = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
                    } else {
                        sqrt = Math.max(Math.min(Math.min(f, this.LJLJI - f), Math.min(f2, this.LJLJJI - f2)), 1.0d);
                    }
                } else {
                    float min = Math.min(f, this.LJLJI - f);
                    float min2 = Math.min(f2, this.LJLJJI - f2);
                    sqrt = Math.sqrt((min2 * min2) + (min * min));
                }
            } else {
                sqrt = Math.max(Math.max(f, this.LJLJI - f), Math.max(f2, this.LJLJJI - f2));
            }
        } else {
            float max = Math.max(f, this.LJLJI - f);
            float max2 = Math.max(f2, this.LJLJJI - f2);
            sqrt = Math.sqrt((max2 * max2) + (max * max));
        }
        int[] iArr = this.LJLJJLL;
        if (iArr == null || iArr.length < 2) {
            this.LJLILLLLZI = null;
        } else {
            float[] fArr = this.LJLJL;
            if (fArr != null && fArr.length != iArr.length) {
                this.LJLILLLLZI = null;
            } else {
                try {
                    this.LJLILLLLZI = new RadialGradient(f, f2, (float) sqrt, this.LJLJJLL, this.LJLJL, Shader.TileMode.CLAMP);
                } catch (Exception e) {
                    this.LJLILLLLZI = null;
                    StringBuilder LIZIZ = C59895Nf1.LIZIZ(e, "exception:\n");
                    LIZIZ.append(e.toString());
                    LLog.LIZLLL(3, "BackgroundRadialGradientLayer", X1D.LIZIZ(LIZIZ));
                }
            }
        }
        super.setBounds(rect);
    }
}
