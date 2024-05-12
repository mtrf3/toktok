package X;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import defpackage.a1;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6OI, reason: invalid class name */
/* loaded from: classes3.dex */
public class C6OI extends C81309Vvd {
    public C1NS<TextStickerModel> LJLJJLL;
    public final C62822Ol8 LJLJL;
    public Float LJLJLJ;
    public C6BH LJLJLLL;
    public boolean LJLL;

    public C6OK getTextSizeHelper() {
        return (C6OK) this.LJLJL.getValue();
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return !this.LJLL;
    }

    @Override // X.C81309Vvd, android.widget.AbsSeekBar, android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        C6BH c6bh;
        o.LJIIIZ(event, "event");
        int i = 0;
        if (getVisibility() != 0) {
            return false;
        }
        boolean onTouchEvent = super.onTouchEvent(event);
        if (onTouchEvent) {
            int action = event.getAction();
            Float f = null;
            if (action != 0) {
                if (action == 1 || action == 3) {
                    Float f2 = this.LJLJLJ;
                    C6OK textSizeHelper = getTextSizeHelper();
                    C6OL<?> c6ol = textSizeHelper.LIZJ;
                    if (c6ol != null) {
                        float LIZJ = c6ol.LIZJ();
                        float progress = textSizeHelper.LIZ.getProgress();
                        if (Build.VERSION.SDK_INT >= 26) {
                            i = textSizeHelper.LIZ.getMin();
                        }
                        float f3 = i;
                        float max = textSizeHelper.LIZ.getMax();
                        float f4 = textSizeHelper.LIZLLL;
                        float f5 = textSizeHelper.LJ;
                        if (progress > f3) {
                            if (progress >= max) {
                                f4 = f5;
                            } else {
                                f4 = C06420Na.LIZIZ(progress, f3, f5, (max - progress) * f4) / (max - f3);
                            }
                        }
                        if (Float.valueOf(f4 * LIZJ) != null) {
                            f = Float.valueOf(O6R.LJJIIZ(r0.floatValue()));
                        }
                    }
                    if (!o.LIZLLL(f2, f) && (c6bh = this.LJLJLLL) != null) {
                        c6bh.LIZ();
                    }
                }
            } else {
                C6OL<?> c6ol2 = getTextSizeHelper().LIZJ;
                if (c6ol2 != null) {
                    f = Float.valueOf(c6ol2.LIZLLL());
                }
                this.LJLJLJ = f;
            }
        }
        return onTouchEvent;
    }

    public final void setEnableTextAnimOpt(boolean z) {
        this.LJLL = z;
    }

    public final void setOnAdjustTextRollbarListener(InterfaceC65784Pro<C76800UCe> listener) {
        o.LJIIIZ(listener, "listener");
        getTextSizeHelper().LJII = listener;
    }

    public final void setOnTextSizeChangedListener(C6BH c6bh) {
        this.LJLJLLL = c6bh;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6OI(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLJL = C221108m2.LIZIZ(new AqS152S0100000_2(this, 768));
    }
}
