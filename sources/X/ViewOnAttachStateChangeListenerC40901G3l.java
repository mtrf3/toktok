package X;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.view.View;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* renamed from: X.G3l, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class ViewOnAttachStateChangeListenerC40901G3l implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ View LJLILLLLZI;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v) {
        o.LJIIIZ(v, "v");
        FFL.LJIIIZ().getClass();
        if (FFL.LJ(31744, "gray_mode", true, false)) {
            Paint paint = new Paint();
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            paint.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            v.setLayerType(2, paint);
            return;
        }
        if (!e1.LIZ(31744, "test_gray_mode", true, false)) {
            return;
        }
        Paint paint2 = new Paint();
        paint2.setColorFilter(new ColorMatrixColorFilter(new ColorMatrix()));
        v.setLayerType(2, paint2);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v) {
        o.LJIIIZ(v, "v");
        AX9.LIZIZ.remove(Integer.valueOf(this.LJLIL));
        this.LJLILLLLZI.removeOnAttachStateChangeListener(this);
    }

    public ViewOnAttachStateChangeListenerC40901G3l(int i, View view) {
        this.LJLIL = i;
        this.LJLILLLLZI = view;
    }
}
