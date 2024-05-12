package X;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.MultiGuestV3AudioBeOccupiedGuestABSetting;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS163S0100000_13;

/* renamed from: X.U5t, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C76633U5t extends LiveIconView {
    public int LJZ;
    public long LJZI;
    public final Paint LJZL;
    public final RectF LL;
    public boolean LLD;
    public boolean LLF;
    public final C62822Ol8 LLFF;
    public boolean LLFFF;

    private final ObjectAnimator getObjectAnimator() {
        return (ObjectAnimator) this.LLFF.getValue();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        getObjectAnimator().cancel();
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.LLD || !this.LLF) {
            return;
        }
        if (this.LJZ < 10) {
            if (canvas == null) {
                return;
            }
            RectF rectF = this.LL;
            float f = rectF.left;
            float f2 = rectF.top;
            float f3 = rectF.bottom;
            canvas.clipRect(f, (((f3 - f2) / 10.0f) * (10 - r4)) + f2, rectF.right, f3, Region.Op.INTERSECT);
        } else if (canvas == null) {
            return;
        }
        canvas.drawRoundRect(this.LL, 10.0f, 10.0f, this.LJZL);
    }

    public void setAudioClickable(boolean z) {
        float f;
        if (MultiGuestV3AudioBeOccupiedGuestABSetting.INSTANCE.showOccupied()) {
            C10S.LIZ("setAudioClickable:", z, "MicSoundEffectView");
            this.LLF = z;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.6f;
            }
            setAlpha(f);
        }
    }

    public void setAudioEnabled(boolean z) {
        this.LLD = z;
        if (z) {
            setIconAttr(R.attr.aui);
        } else {
            setIconAttr(R.attr.auk);
        }
    }

    public final void setVolumeLevel(int i) {
        if (i < 0 || i > 10 || !this.LLD || !this.LLFFF) {
            return;
        }
        getObjectAnimator().setIntValues(this.LJZ, i);
        getObjectAnimator().setAutoCancel(true);
        getObjectAnimator().start();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C76633U5t(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJZI = 100L;
        Paint paint = new Paint();
        paint.setColor(C15380j0.LIZIZ(R.color.a8h));
        paint.setStyle(Paint.Style.FILL);
        this.LJZL = paint;
        this.LL = new RectF();
        this.LLF = true;
        this.LLFF = C221108m2.LIZIZ(new AqS163S0100000_13(this, 236));
        this.LLFFF = true;
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float f = i3 - i;
        float f2 = f / 2.0f;
        float f3 = (f / 24.0f) * 5;
        this.LL.left = f2 - ((getIconWidthRatio() * f3) / 2.0f);
        RectF rectF = this.LL;
        rectF.right = (getIconWidthRatio() * f3) + rectF.left;
        float f4 = (i4 - i2) / 24.0f;
        this.LL.top = (4 * f4) / getIconHeightRatio();
        RectF rectF2 = this.LL;
        rectF2.bottom = (getIconHeightRatio() * f4 * 11) + rectF2.top;
    }
}
