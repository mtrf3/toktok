package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* renamed from: X.Vte, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81186Vte extends LinearLayout {
    public int LJLIL;

    public float getLeftX() {
        return super.getX();
    }

    public float getStartX() {
        if (C16310kV.LIZLLL(this) == 1) {
            return (this.LJLIL - super.getX()) - getMeasuredWidth();
        }
        return super.getX();
    }

    public void setLeftX(float f) {
        super.setX(f);
    }

    public void setStartX(float f) {
        if (C16310kV.LIZLLL(this) == 1) {
            super.setX((this.LJLIL - f) - getMeasuredWidth());
        } else {
            super.setX(f);
        }
    }

    public C81186Vte(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Context context2 = getContext();
        while (context2 != null) {
            if (!(context2 instanceof Activity)) {
                if (!(context2 instanceof ContextWrapper)) {
                    break;
                } else {
                    context2 = ((ContextWrapper) context2).getBaseContext();
                }
            } else {
                break;
            }
        }
        context2 = null;
        this.LJLIL = C81184Vtc.LJ(context2);
    }
}
