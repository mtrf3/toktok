package X;

import Y.AUListenerS100S0100000_13;
import Y.IDAListenerS43S0200000_13;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchPreviewEnabledSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchPreviewMinGapSetting;
import com.bytedance.android.livesdk.livesetting.wallet.CanRechargeSetting;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS163S0100000_13;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class U2C extends View {
    public static final /* synthetic */ int LLII = 0;
    public int LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public int LJLJLJ;
    public int LJLJLLL;
    public boolean LJLL;
    public int LJLLI;
    public float LJLLILLLL;
    public int LJLLJ;
    public float LJLLL;
    public ValueAnimator LJLLLL;
    public ValueAnimator LJLLLLLL;
    public final C62822Ol8 LJLZ;
    public final RectF LJZ;
    public final RectF LJZI;
    public boolean LJZL;
    public boolean LL;
    public boolean LLD;
    public final C62822Ol8 LLF;
    public float LLFF;
    public InterfaceC88472Yns<? super Float, C76800UCe> LLFFF;
    public InterfaceC88472Yns<? super Float, C76800UCe> LLFII;
    public C5X8 LLFZ;
    public final Path LLI;
    public Path LLIFFJFJJ;

    public final void LIZIZ() {
        this.LJLL = false;
        C76265TwT.LIZ.LJJJJIZL = false;
        this.LJLLI = 0;
        this.LJLLILLLL = 0.0f;
        this.LJLLJ = 1;
        C5X8 c5x8 = this.LLFZ;
        if (c5x8 != null) {
            c5x8.LJLLILLLL.cancel();
        } else {
            o.LJIJI("stripesDrawable");
            throw null;
        }
    }

    public final void setAnimationToRight(boolean z) {
    }

    private final Paint getPaint() {
        return (Paint) this.LJLZ.getValue();
    }

    private final float getStartSpacing() {
        return ((Number) this.LLF.getValue()).floatValue();
    }

    public final void LIZLLL() {
        String str;
        if (C30922CBq.LIZIZ) {
            int i = this.LJLJLLL;
            int i2 = this.LJLJLJ;
            if (i > i2) {
                str = "right";
            } else if (i == i2) {
                str = "tie";
            } else {
                str = "left";
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("PK Progress,left score:");
            LIZ.append(this.LJLJLJ);
            LIZ.append(",right score:");
            LIZ.append(this.LJLJLLL);
            LIZ.append(",winner:");
            LIZ.append(str);
            setTag(X1D.LIZIZ(LIZ));
        }
    }

    private final Path getClipPath() {
        float leftPaddingOffset = getLeftPaddingOffset();
        float topPaddingOffset = getTopPaddingOffset();
        float rightPaddingOffset = getRightPaddingOffset();
        float width = (getWidth() - leftPaddingOffset) - rightPaddingOffset;
        float height = (getHeight() - topPaddingOffset) - getBottomPaddingOffset();
        this.LLI.reset();
        this.LLI.moveTo(leftPaddingOffset, topPaddingOffset);
        float f = width + leftPaddingOffset;
        this.LLI.lineTo(f, topPaddingOffset);
        float f2 = height + topPaddingOffset;
        this.LLI.lineTo(f, f2);
        this.LLI.lineTo(leftPaddingOffset, f2);
        this.LLI.lineTo(leftPaddingOffset, topPaddingOffset);
        this.LLI.close();
        return this.LLI;
    }

    public final float getStartSpace$liveinteract_impl_release() {
        return getStartSpacing() + this.LLFF;
    }

    public final float getCoverWidth() {
        return this.LJLLL;
    }

    public final float getExtraSpace() {
        return this.LLFF;
    }

    public final int getLeftValue() {
        return this.LJLJLJ;
    }

    public final Path getPath() {
        return this.LLI;
    }

    public final int getRightValue() {
        return this.LJLJLLL;
    }

    private final void setPreviewProgress(float f) {
        ValueAnimator valueAnimator;
        float f2 = this.LJLLILLLL;
        ValueAnimator valueAnimator2 = this.LJLLLLLL;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.LJLLLLLL) != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.LJLLLLLL = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(300L);
        }
        ValueAnimator valueAnimator3 = this.LJLLLLLL;
        if (valueAnimator3 != null) {
            valueAnimator3.addUpdateListener(new AUListenerS100S0100000_13(this, 19));
        }
        ValueAnimator valueAnimator4 = this.LJLLLLLL;
        if (valueAnimator4 != null) {
            valueAnimator4.start();
        }
    }

    public final void LIZ(boolean z) {
        int i;
        float f;
        float f2;
        if (!CanRechargeSetting.INSTANCE.getValue() || !LiveMatchPreviewEnabledSetting.INSTANCE.getValue() || (i = this.LJLLI * this.LJLLJ) <= 0) {
            return;
        }
        int i2 = this.LJLJLJ;
        if (i2 + this.LJLJLLL == 0) {
            f = 1.0f;
        } else {
            f = (i2 + i) / ((i2 + i) + r1);
        }
        C76280Twi c76280Twi = C76265TwT.LIZ;
        c76280Twi.LJJJJI = f;
        if (z) {
            f2 = this.LJLJJLL;
        } else {
            f2 = this.LJLJL;
        }
        if (f - f2 < LiveMatchPreviewMinGapSetting.INSTANCE.getValue()) {
            this.LJLL = false;
            c76280Twi.LJJJJIZL = false;
            LJI(f);
            C5X8 c5x8 = this.LLFZ;
            if (c5x8 != null) {
                c5x8.LJLLILLLL.cancel();
                return;
            } else {
                o.LJIJI("stripesDrawable");
                throw null;
            }
        }
        this.LJLL = true;
        c76280Twi.LJJJJIZL = true;
        C5X8 c5x82 = this.LLFZ;
        if (c5x82 != null) {
            c5x82.LJLLILLLL.cancel();
            c5x82.LJLLILLLL.removeUpdateListener(c5x82);
            c5x82.LJLLILLLL.addUpdateListener(c5x82);
            c5x82.LJLLILLLL.start();
            setPreviewProgress(f);
            return;
        }
        o.LJIJI("stripesDrawable");
        throw null;
    }

    public final float LIZJ(float f) {
        if (f <= 0.0f) {
            f = getStartSpace$liveinteract_impl_release() + ((getWidth() - (getStartSpace$liveinteract_impl_release() * 2.0f)) * this.LJLJJLL);
        }
        return (f + (C15380j0.LIZ(this.LJLLL) / 2)) - 11;
    }

    public final void LJFF(boolean z) {
        if (z) {
            this.LJLIL = C15380j0.LIZIZ(R.color.a89);
            this.LJLILLLLZI = C15380j0.LIZIZ(R.color.a87);
            this.LJLJI = C15380j0.LIZIZ(R.color.a8e);
            this.LJLJJI = C15380j0.LIZIZ(R.color.a8c);
            this.LJLJJL = C15380j0.LIZIZ(R.color.a8a);
        }
    }

    public final void LJI(float f) {
        this.LJLLILLLL = f;
        float LIZJ = LIZJ(getStartSpace$liveinteract_impl_release() + ((C15380j0.LJIIL() - (getStartSpace$liveinteract_impl_release() * 2.0f)) * f));
        C5X8 c5x8 = this.LLFZ;
        if (c5x8 != null) {
            c5x8.setBounds(0, 0, (int) LIZJ, getHeight());
        } else {
            o.LJIJI("stripesDrawable");
            throw null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        LinearGradient linearGradient;
        LinearGradient linearGradient2;
        super.onDraw(canvas);
        if (canvas == null) {
            return;
        }
        float startSpace$liveinteract_impl_release = getStartSpace$liveinteract_impl_release();
        if (this.LL) {
            f = 0.5f;
        } else {
            f = this.LJLJJLL;
        }
        float width = ((getWidth() - (2.0f * startSpace$liveinteract_impl_release)) * f) + startSpace$liveinteract_impl_release;
        this.LJZ.set(0.0f, 0.0f, width, getHeight());
        this.LJZI.set(width, 0.0f, getWidth(), getHeight());
        canvas.drawPath(getClipPath(), getPaint());
        if (!this.LL) {
            RectF rectF = this.LJZI;
            linearGradient = new LinearGradient(rectF.left, rectF.top, rectF.right, rectF.bottom, this.LJLJI, this.LJLJJI, Shader.TileMode.MIRROR);
        } else {
            RectF rectF2 = this.LJZI;
            linearGradient = new LinearGradient(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, this.LJLJJL, this.LJLJJI, Shader.TileMode.CLAMP);
        }
        getPaint().setShader(linearGradient);
        canvas.drawRect(this.LJZI, getPaint());
        if (this.LJLL) {
            C5X8 c5x8 = this.LLFZ;
            if (c5x8 != null) {
                c5x8.draw(canvas);
            } else {
                o.LJIJI("stripesDrawable");
                throw null;
            }
        }
        if (!this.LL) {
            RectF rectF3 = this.LJZ;
            linearGradient2 = new LinearGradient(rectF3.left, rectF3.top, rectF3.right, rectF3.bottom, this.LJLIL, this.LJLILLLLZI, Shader.TileMode.MIRROR);
        } else {
            RectF rectF4 = this.LJZ;
            linearGradient2 = new LinearGradient(rectF4.left, rectF4.top, rectF4.right, rectF4.bottom, this.LJLIL, this.LJLJJL, Shader.TileMode.CLAMP);
        }
        if ((this.LJZL && !this.LLD) || this.LL) {
            getPaint().setShader(linearGradient2);
            canvas.drawRect(this.LJZ, getPaint());
        } else {
            getPaint().setShader(linearGradient2);
            Path LIZ = C5X9.LIZ(this.LLIFFJFJJ, LIZJ(width), getHeight(), 24.0f, 24.0f);
            this.LLIFFJFJJ = LIZ;
            canvas.drawPath(LIZ, getPaint());
        }
        getPaint().setShader(null);
    }

    public final void setCoverWidth(float f) {
        this.LJLLL = f;
    }

    public final void setCriticalBuff(boolean z) {
        this.LLD = z;
        invalidate();
    }

    public final void setExtraSpace(float f) {
        this.LLFF = f;
    }

    public final void setPreviewMultiple(int i) {
        if (i == this.LJLLJ) {
            return;
        }
        this.LJLLJ = i;
        LIZ(false);
    }

    public final void setPreviewValue(int i) {
        this.LJLLI = i;
        LIZ(false);
    }

    public final void setRightValue(int i) {
        this.LJZL = false;
        this.LJLJLLL = i;
        int i2 = this.LJLJLJ;
        int i3 = i + i2;
        if (i3 == 0) {
            this.LJZL = true;
            LJ(0.5f, U2G.LJLIL);
        } else {
            LJ(i2 / i3, U2G.LJLIL);
        }
        LIZ(false);
        LIZLLL();
    }

    public final void setSmokeDebuff(boolean z) {
        this.LL = z;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U2C(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a1.LJFF(context, "context");
        this.LJLLJ = 1;
        this.LJLZ = C221108m2.LIZIZ(DIM.LJLIL);
        this.LJZ = new RectF();
        this.LJZI = new RectF();
        this.LJZL = true;
        this.LLF = C221108m2.LIZIZ(C73111Smh.LJLIL);
        this.LLI = new Path();
        this.LJLJLJ = 0;
        this.LJLJLLL = 0;
        this.LJLJJLL = 0.5f;
        this.LJLJL = 0.5f;
        this.LJLIL = C15380j0.LIZIZ(R.color.a88);
        this.LJLILLLLZI = C15380j0.LIZIZ(R.color.a86);
        this.LJLJI = C15380j0.LIZIZ(R.color.a8d);
        this.LJLJJI = C15380j0.LIZIZ(R.color.a8b);
        this.LJLJJL = C15380j0.LIZIZ(R.color.a8_);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.bf2, R.attr.bf3, R.attr.bf4, R.attr.bf5});
        o.LJIIIIZZ(obtainStyledAttributes, "context.obtainStyledAttr….styleable.PKProgressBar)");
        int color = obtainStyledAttributes.getColor(0, -7829368);
        C5X8 c5x8 = new C5X8(obtainStyledAttributes.getDimension(2, 8.0f), obtainStyledAttributes.getColor(1, -1), obtainStyledAttributes.getDimension(3, 8.0f), color);
        this.LLFZ = c5x8;
        c5x8.LJLLJ = new AqS163S0100000_13(this, 287);
        obtainStyledAttributes.recycle();
        LIZLLL();
    }

    public final void LJ(float f, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        ValueAnimator valueAnimator;
        InterfaceC88472Yns<? super Float, C76800UCe> interfaceC88472Yns = this.LLFFF;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Float.valueOf(f));
        }
        float f2 = this.LJLJJLL;
        this.LJLJL = f;
        C76265TwT.LIZ.LJJJJ = f;
        ValueAnimator valueAnimator2 = this.LJLLLL;
        if (valueAnimator2 != null && valueAnimator2.isRunning() && (valueAnimator = this.LJLLLL) != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
        this.LJLLLL = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(300L);
        }
        ValueAnimator valueAnimator3 = this.LJLLLL;
        if (valueAnimator3 != null) {
            valueAnimator3.addListener(new IDAListenerS43S0200000_13(this, interfaceC65784Pro, 1));
        }
        ValueAnimator valueAnimator4 = this.LJLLLL;
        if (valueAnimator4 != null) {
            valueAnimator4.addUpdateListener(new AUListenerS100S0100000_13(this, 20));
        }
        ValueAnimator valueAnimator5 = this.LJLLLL;
        if (valueAnimator5 != null) {
            valueAnimator5.start();
        }
    }
}
