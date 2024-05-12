package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class TDX extends C8HQ {
    public int LJLIL;

    public final void LIZ(float f) {
        if (f <= 0) {
            return;
        }
        TDY tdy = new TDY();
        tdy.LIZIZ(this.LJLIL);
        tdy.LJ(this.LJLIL, 0);
        tdy.LIZLLL(0);
        tdy.LJFF = new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f};
        setBackground(tdy.LIZ());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TDX(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        boolean z;
        float f;
        boolean z2;
        o.LJIIIZ(context, "context");
        this.LJLIL = context.getResources().getColor(R.color.xx);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bla, R.attr.blb, R.attr.blc, R.attr.bld, R.attr.ble, R.attr.blf, R.attr.blg, R.attr.blh, R.attr.bli, R.attr.blj, R.attr.blk, R.attr.bll, R.attr.blm, R.attr.bln, R.attr.blo, R.attr.blp, R.attr.blq, R.attr.blr, R.attr.bls, R.attr.blt, R.attr.blu, R.attr.blv, R.attr.blw, R.attr.blx, R.attr.bly, R.attr.blz, R.attr.bm0});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…styleable.ToolsStyleView)");
            z = obtainStyledAttributes.getBoolean(1, false);
            f = obtainStyledAttributes.getDimension(16, 0.0f);
            z2 = obtainStyledAttributes.getBoolean(26, false);
            this.LJLIL = obtainStyledAttributes.getColor(0, this.LJLIL);
            boolean z3 = obtainStyledAttributes.getBoolean(2, true);
            obtainStyledAttributes.recycle();
            if (!z3) {
                return;
            }
        } else {
            z = false;
            f = 0.0f;
            z2 = false;
        }
        TDY tdy = new TDY();
        tdy.LIZIZ(this.LJLIL);
        tdy.LJ(this.LJLIL, 0);
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
        setBackground(tdy.LIZ());
    }
}
