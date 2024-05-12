package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import com.zhiliaoapp.musically.R;

/* renamed from: X.AXj, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class DialogC26391AXj extends Dialog {
    public static final int PADDING_DIALOG = (int) KL2.LIZJ(EF7.LIZIZ(), 20.0f);
    public int mHeight;
    public int mWidth;

    private int getFullHeightStrategy() {
        return -1;
    }

    private int getFullWidthStrategy() {
        return -1;
    }

    private int getWrapHeightStrategy() {
        return -2;
    }

    private int getWrapWidthStrategy() {
        return -2;
    }

    public void customerWidthAndHeight() {
    }

    private int getDefaultHeightStrategy() {
        return KL2.LJIIIZ(getContext()) - (PADDING_DIALOG * 4);
    }

    private int getDefaultWidthStrategy() {
        return KL2.LJIIJJI(getContext()) - (PADDING_DIALOG * 2);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        if (getWindow() == null) {
            return;
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setLayout(this.mWidth, this.mHeight);
    }

    public DialogC26391AXj(Context context, int i, int i2, int i3) {
        super(context, R.style.a8x);
        this.mWidth = KL2.LJIIJJI(getContext()) - (i2 * 2);
        this.mHeight = KL2.LJIIIZ(getContext()) - (i3 * 2);
        requestWindowFeature(1);
        customerWidthAndHeight();
    }

    public DialogC26391AXj(Context context, int i, boolean z, boolean z2) {
        this(context, i, z, z2, false);
    }

    public DialogC26391AXj(Context context, int i, boolean z, boolean z2, boolean z3) {
        super(context, i);
        int defaultWidthStrategy;
        int defaultHeightStrategy;
        requestWindowFeature(1);
        if (z3) {
            defaultWidthStrategy = getWrapWidthStrategy();
        } else if (z) {
            defaultWidthStrategy = getFullWidthStrategy();
        } else {
            defaultWidthStrategy = getDefaultWidthStrategy();
        }
        this.mWidth = defaultWidthStrategy;
        if (z) {
            defaultHeightStrategy = getFullHeightStrategy();
        } else if (z2) {
            defaultHeightStrategy = getWrapHeightStrategy();
        } else {
            defaultHeightStrategy = getDefaultHeightStrategy();
        }
        this.mHeight = defaultHeightStrategy;
        customerWidthAndHeight();
    }
}
