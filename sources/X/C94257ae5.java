package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Field;
import kotlin.jvm.internal.o;

/* renamed from: X.ae5, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94257ae5 extends C011602u {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94257ae5(Context context) {
        super(context, null, 0);
        o.LJIIIZ(context, "context");
        int i = 0;
        setShowText(false);
        setClickable(true);
        setTrackDrawable(context.getDrawable(R.drawable.dgn));
        setThumbDrawable(context.getDrawable(R.drawable.df9));
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            Integer valueOf = Integer.valueOf(layoutParams.width);
            if (valueOf.intValue() > 0) {
                i = valueOf.intValue();
                setSwitchMinWidth(i);
            }
        }
        Drawable trackDrawable = getTrackDrawable();
        o.LJIIIIZZ(trackDrawable, "trackDrawable");
        int intrinsicWidth = trackDrawable.getIntrinsicWidth();
        if (intrinsicWidth >= 0) {
            i = intrinsicWidth;
        }
        setSwitchMinWidth(i);
    }

    @Override // X.C011602u, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable thumbDrawable = getThumbDrawable();
        o.LJIIIIZZ(thumbDrawable, "thumbDrawable");
        Rect bounds = thumbDrawable.getBounds();
        o.LJIIIIZZ(bounds, "thumbDrawable.bounds");
        int height = (getHeight() - bounds.width()) / 2;
        Drawable thumbDrawable2 = getThumbDrawable();
        Drawable thumbDrawable3 = getThumbDrawable();
        o.LJIIIIZZ(thumbDrawable3, "thumbDrawable");
        int i = thumbDrawable3.getBounds().left;
        Drawable thumbDrawable4 = getThumbDrawable();
        o.LJIIIIZZ(thumbDrawable4, "thumbDrawable");
        thumbDrawable2.setBounds(i, height, thumbDrawable4.getBounds().right, getHeight() - height);
        super.onDraw(canvas);
    }

    @Override // X.C011602u, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        try {
            Field mSwitchWidth = C011602u.class.getDeclaredField("mSwitchWidth");
            o.LJIIIIZZ(mSwitchWidth, "mSwitchWidth");
            mSwitchWidth.setAccessible(true);
            mSwitchWidth.setInt(this, getMeasuredWidth());
        } catch (Exception unused) {
            C94034aaU.LIZ("CKESwitch", "can not reflect mSwitchWidth");
        }
    }
}
