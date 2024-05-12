package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public class TDW extends LinearLayout {
    public final TDY LJLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TDW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        boolean z;
        float f;
        boolean z2;
        boolean z3;
        TDY tdy;
        o.LJIIIZ(context, "context");
        int color = context.getResources().getColor(R.color.xx);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bla, R.attr.blb, R.attr.blc, R.attr.bld, R.attr.ble, R.attr.blf, R.attr.blg, R.attr.blh, R.attr.bli, R.attr.blj, R.attr.blk, R.attr.bll, R.attr.blm, R.attr.bln, R.attr.blo, R.attr.blp, R.attr.blq, R.attr.blr, R.attr.bls, R.attr.blt, R.attr.blu, R.attr.blv, R.attr.blw, R.attr.blx, R.attr.bly, R.attr.blz, R.attr.bm0});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…styleable.ToolsStyleView)");
            z = obtainStyledAttributes.getBoolean(1, false);
            f = obtainStyledAttributes.getDimension(16, 0.0f);
            z2 = obtainStyledAttributes.getBoolean(26, false);
            color = obtainStyledAttributes.getColor(0, color);
            z3 = obtainStyledAttributes.getBoolean(2, true);
            obtainStyledAttributes.recycle();
        } else {
            z = false;
            f = 0.0f;
            z2 = false;
            z3 = true;
        }
        if (z3) {
            tdy = new TDY();
            tdy.LIZIZ(color);
            tdy.LJ(color, 0);
            if (z) {
                tdy.LIZLLL(1);
            } else {
                tdy.LIZLLL(0);
                if (z2) {
                    tdy.LJFF = new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f};
                } else {
                    tdy.LIZJ(f);
                }
            }
        } else {
            tdy = null;
        }
        this.LJLIL = tdy;
        setBackground(tdy != null ? tdy.LIZ() : null);
    }
}
