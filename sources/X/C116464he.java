package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.4he, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public class C116464he extends AppCompatImageView {
    public boolean LJLIL;
    public boolean LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public final void LIZ(Drawable drawable) {
        if (this.LJLIL) {
            super.setImageDrawable(C78880UxY.LJLIL(drawable, this.LJLJJLL));
        } else {
            super.setImageDrawable(drawable);
        }
    }

    public final void setDefaultTintColor(int i) {
        this.LJLJI = i;
    }

    public final void setEnableSelectionTint(boolean z) {
        this.LJLILLLLZI = z;
        if (!z) {
            this.LJLJJLL = this.LJLJI;
        }
    }

    public final void setEnableTint(boolean z) {
        boolean z2 = this.LJLIL;
        this.LJLIL = z;
        if (!z2 && z) {
            LIZ(getDrawable());
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        LIZ(drawable);
    }

    public final void setSelectTintColor(int i) {
        this.LJLJJI = i;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setSelected(boolean z) {
        int i;
        super.setSelected(z);
        if (this.LJLILLLLZI) {
            if (z) {
                i = this.LJLJJI;
            } else {
                i = this.LJLJJL;
            }
            this.LJLJJLL = i;
            LIZ(getDrawable());
        }
    }

    public final void setUnSelectTintColor(int i) {
        this.LJLJJL = i;
    }

    public C116464he(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C116464he(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o.LJIIIZ(context, "context");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bla, R.attr.blb, R.attr.blc, R.attr.bld, R.attr.ble, R.attr.blf, R.attr.blg, R.attr.blh, R.attr.bli, R.attr.blj, R.attr.blk, R.attr.bll, R.attr.blm, R.attr.bln, R.attr.blo, R.attr.blp, R.attr.blq, R.attr.blr, R.attr.bls, R.attr.blt, R.attr.blu, R.attr.blv, R.attr.blw, R.attr.blx, R.attr.bly, R.attr.blz, R.attr.bm0});
            o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr…styleable.ToolsStyleView)");
            this.LJLIL = obtainStyledAttributes.getBoolean(5, true);
            this.LJLILLLLZI = obtainStyledAttributes.getBoolean(3, true);
            this.LJLJI = obtainStyledAttributes.getColor(23, context.getResources().getColor(R.color.y0));
            this.LJLJJI = obtainStyledAttributes.getColor(24, context.getResources().getColor(R.color.y0));
            this.LJLJJL = obtainStyledAttributes.getColor(25, context.getResources().getColor(R.color.y1));
            obtainStyledAttributes.recycle();
        } else {
            this.LJLIL = true;
            this.LJLILLLLZI = true;
            this.LJLJI = context.getResources().getColor(R.color.y0);
            this.LJLJJI = context.getResources().getColor(R.color.y0);
            this.LJLJJL = context.getResources().getColor(R.color.y1);
        }
        this.LJLJJLL = this.LJLJI;
        if (this.LJLIL) {
            LIZ(getDrawable());
        }
    }
}
