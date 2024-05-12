package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;

/* loaded from: classes15.dex */
public class WFS extends C170736mz {
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

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WFS(Context context) {
        super(context, null);
        Context context2 = null;
        Context context3 = getContext();
        while (true) {
            if (context3 != null) {
                if (context3 instanceof Activity) {
                    context2 = context3;
                    break;
                } else if (!(context3 instanceof ContextWrapper)) {
                    break;
                } else {
                    context3 = ((ContextWrapper) context3).getBaseContext();
                }
            } else {
                break;
            }
        }
        this.LJLIL = C81184Vtc.LJ(context2);
    }

    public void setLeftX(float f) {
        super.setX(f);
    }

    public void setStartX(float f) {
        if (C16310kV.LIZLLL(this) == 1) {
            f = (this.LJLIL - f) - getMeasuredWidth();
        }
        super.setX(f);
    }

    public WFS(Context context, AttributeSet attributeSet) {
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
