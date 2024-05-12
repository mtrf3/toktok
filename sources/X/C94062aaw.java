package X;

import android.content.Context;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.aaw, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94062aaw extends C02Z {
    public final List<InterfaceC88472Yns<Double, C76800UCe>> LJLILLLLZI;
    public double LJLJI;
    public double LJLJJI;
    public boolean LJLJJL;

    @Override // android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LJLJJL) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setTouchable(boolean z) {
        this.LJLJJL = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C94062aaw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        o.LJIIIZ(context, "context");
        this.LJLILLLLZI = new ArrayList();
        this.LJLJJI = 100.0d;
        this.LJLJJL = true;
        setMax(300);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.mutate();
        gradientDrawable.setCornerRadius(C93742aVm.LIZ(6.0f));
        gradientDrawable.setSize(C93742aVm.LIZIZ(16), C93742aVm.LIZIZ(20));
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(C04330Ez.LIZIZ(context, R.color.adi));
        setThumb(gradientDrawable);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.mutate();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(C93742aVm.LIZIZ(12));
        gradientDrawable2.setColor(C04330Ez.LIZIZ(getContext(), R.color.ado));
        setId(android.R.id.background);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.mutate();
        gradientDrawable3.setShape(0);
        gradientDrawable3.setCornerRadius(C93742aVm.LIZIZ(12));
        gradientDrawable3.setColor(C04330Ez.LIZIZ(getContext(), R.color.adq));
        setId(android.R.id.progress);
        setProgressDrawable(new LayerDrawable(new Drawable[]{gradientDrawable2, new ClipDrawable(gradientDrawable3, 8388611, 1)}));
        setOnSeekBarChangeListener(new C93686aUs(this));
    }
}
