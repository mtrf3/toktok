package X;

import android.graphics.RectF;
import com.zhiliaoapp.musically.R;

/* renamed from: X.0eh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public enum EnumC12710eh {
    LeftTop(R.id.ci3, "up_left", new RectF(0.032f, 0.2044335f, 0.45866665f, 0.35221675f), new RectF(0.033333335f, 0.240625f, 0.36666667f, 0.38125f), new RectF(0.03f, 0.06486487f, 0.23f, 0.38918918f), new RectF(0.025f, 0.06666667f, 0.2125f, 0.31666666f)),
    RightTop(R.id.ci5, "up_right", new RectF(0.5413333f, 0.2044335f, 0.968f, 0.35221675f), new RectF(0.6333333f, 0.240625f, 0.96666664f, 0.38125f), new RectF(0.77f, 0.06486487f, 0.97f, 0.38918918f), new RectF(0.7875f, 0.06666667f, 0.0234375f, 0.31666666f)),
    LeftBottom(R.id.ci2, "down_left", new RectF(0.032f, 0.47536945f, 0.45866665f, 0.62315273f), new RectF(0.033333335f, 0.353125f, 0.36666667f, 0.49375f), new RectF(0.03f, 0.6108108f, 0.23f, 0.9351351f), new RectF(0.025f, 0.68333334f, 0.2125f, 0.93333334f)),
    RightBottom(R.id.ci4, "down_right", new RectF(0.5413333f, 0.47536945f, 0.968f, 0.62315273f), new RectF(0.6333333f, 0.353125f, 0.96666664f, 0.49375f), new RectF(0.77f, 0.6108108f, 0.97f, 0.9351351f), new RectF(0.7875f, 0.68333334f, 0.0234375f, 0.93333334f));

    public final int LJLIL;
    public final String LJLILLLLZI;
    public final RectF LJLJI;
    public final RectF LJLJJI;
    public final RectF LJLJJL;
    public final RectF LJLJJLL;

    public static EnumC12710eh valueOf(String str) {
        return (EnumC12710eh) V0N.LJJJ(EnumC12710eh.class, str);
    }

    public final String getLogString() {
        return this.LJLILLLLZI;
    }

    public final int getResId() {
        return this.LJLIL;
    }

    public final RectF getRectPort(boolean z, boolean z2, float f) {
        RectF rectF;
        if (z2) {
            if (z) {
                rectF = this.LJLJJLL;
            } else {
                rectF = this.LJLJJL;
            }
        } else if (z) {
            rectF = this.LJLJJI;
        } else {
            rectF = this.LJLJI;
        }
        if (f == 0.0f || Float.isInfinite(f) || Float.isNaN(f)) {
            return rectF;
        }
        RectF rectF2 = new RectF(rectF);
        rectF2.bottom = rectF2.top + ((rectF2.right - rectF2.left) / f);
        return rectF2;
    }

    public static /* synthetic */ RectF getRectPort$default(EnumC12710eh enumC12710eh, boolean z, boolean z2, float f, int i, Object obj) {
        if (obj == null) {
            if ((i & 4) != 0) {
                f = 0.0f;
            }
            return enumC12710eh.getRectPort(z, z2, f);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getRectPort");
    }

    EnumC12710eh(int i, String str, RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
        this.LJLJI = rectF;
        this.LJLJJI = rectF2;
        this.LJLJJL = rectF3;
        this.LJLJJLL = rectF4;
    }
}
