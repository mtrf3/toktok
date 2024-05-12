package X;

import Y.AfS61S0100000_9;
import Y.IDuS320S0100000_9;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AqS172S0100000_6;
import kotlin.jvm.internal.AqS175S0100000_9;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class L5Y extends C77869UhF {
    public C53478Kyo LJLIL;
    public EnumC53663L4h LJLILLLLZI;
    public final C62822Ol8 LJLJI;
    public L69 LJLJJI;
    public int LJLJJL;
    public float LJLJJLL;
    public final C62822Ol8 LJLJL;
    public boolean LJLJLJ;
    public boolean LJLJLLL;
    public C73411SrX LJLL;
    public AqS175S0100000_9 LJLLI;
    public ValueAnimator LJLLILLLL;
    public float LJLLJ;
    public float LJLLL;
    public int LJLLLL;
    public boolean LJLLLLLL;

    private final RectF getRingRecF() {
        return (RectF) this.LJLJL.getValue();
    }

    public final Paint getPaint() {
        return (Paint) this.LJLJI.getValue();
    }

    @Override // X.C29701Eo
    public final void cancelAnimation() {
        super.cancelAnimation();
        this.LJLLLLLL = true;
    }

    @Override // X.C77869UhF, X.C29701Eo, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C54339LUh.LIZ(this);
    }

    public final float getAnimateProgress() {
        return this.LJLLL;
    }

    public final EnumC53663L4h getBusinessTag() {
        return this.LJLILLLLZI;
    }

    public final boolean getCanDrawRing() {
        return this.LJLLLLLL;
    }

    public final C53478Kyo getUiData() {
        return this.LJLIL;
    }

    public final void LIZ(L59 command) {
        o.LJIIIZ(command, "command");
        int i = L5C.LIZ[command.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.LJLJLLL = false;
            C73411SrX c73411SrX = this.LJLL;
            if (c73411SrX != null) {
                c73411SrX.dispose();
            }
            this.LJLL = null;
            this.LJLLI = null;
            return;
        }
        if (!this.LJLJLJ || this.LJLJLLL) {
            return;
        }
        this.LJLJLLL = true;
        C73411SrX c73411SrX2 = this.LJLL;
        if (c73411SrX2 != null) {
            c73411SrX2.dispose();
        }
        this.LJLL = null;
        this.LJLLI = null;
        setAnimateProgress(0.0f);
        this.LJLL = (C73411SrX) AbstractC73672Svk.LJIIJ(new IDuS320S0100000_9(this, 11)).LJIIJJI(300L, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJLIIL(new AfS61S0100000_9(this, 84), L5Z.LJLIL);
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        InterfaceC88472Yns<C53447KyJ, Shader> interfaceC88472Yns;
        InterfaceC88472Yns<C53447KyJ, Shader> interfaceC88472Yns2;
        super.onDraw(canvas);
        if (this.LJLILLLLZI == null || !this.LJLLLLLL) {
            return;
        }
        L69 l69 = this.LJLJJI;
        if (l69 != null) {
            i = l69.getAvatarSizePx();
        } else {
            i = 0;
        }
        this.LJLJJL = i;
        L69 l692 = this.LJLJJI;
        Shader shader = null;
        if (l692 != null && l692.getAvatar() != null && this.LJLJJL > 0) {
            RectF ringRecF = getRingRecF();
            float f = 2;
            float f2 = this.LJLJJLL / f;
            ringRecF.left = f2;
            ringRecF.top = f2;
            ringRecF.right = getWidth() - (this.LJLJJLL / f);
            ringRecF.bottom = getWidth() - (this.LJLJJLL / f);
        }
        C53447KyJ LJ = C78929UyL.LJ(this.LJLJJI);
        getPaint().setStrokeWidth(this.LJLJJLL);
        if (!this.LJLJLJ || this.LJLL == null) {
            C53478Kyo c53478Kyo = this.LJLIL;
            if (c53478Kyo != null) {
                LIZIZ(c53478Kyo, new AqS172S0100000_6(this, 128));
            }
            Paint paint = getPaint();
            C53478Kyo c53478Kyo2 = this.LJLIL;
            if (c53478Kyo2 != null && (interfaceC88472Yns = c53478Kyo2.LIZJ) != null) {
                shader = interfaceC88472Yns.invoke(LJ);
            }
            paint.setShader(shader);
            if (canvas != null) {
                canvas.drawArc(getRingRecF(), -90.0f, 360.0f, false, getPaint());
                return;
            }
            return;
        }
        Paint paint2 = getPaint();
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setShader(null);
        paint2.setColor(this.LJLLLL);
        if (canvas != null) {
            canvas.drawArc(getRingRecF(), 0.0f, 360.0f, false, getPaint());
        }
        Paint paint3 = getPaint();
        paint3.setStyle(Paint.Style.STROKE);
        C53478Kyo c53478Kyo3 = this.LJLIL;
        if (c53478Kyo3 != null && (interfaceC88472Yns2 = c53478Kyo3.LIZJ) != null) {
            shader = interfaceC88472Yns2.invoke(LJ);
        }
        paint3.setShader(shader);
        C53478Kyo c53478Kyo4 = this.LJLIL;
        if (c53478Kyo4 != null) {
            LIZIZ(c53478Kyo4, new AqS172S0100000_6(paint3, 129));
        }
        if (canvas == null) {
            return;
        }
        canvas.drawArc(getRingRecF(), -90.0f, this.LJLLJ * 360.0f, false, getPaint());
    }

    public final void setAnimateProgress(float f) {
        this.LJLLL = f;
        if (f < this.LJLLJ) {
            ValueAnimator valueAnimator = this.LJLLILLLL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator valueAnimator2 = this.LJLLILLLL;
            if (valueAnimator2 != null) {
                valueAnimator2.removeAllUpdateListeners();
            }
            ValueAnimator valueAnimator3 = this.LJLLILLLL;
            if (valueAnimator3 != null) {
                C16880lQ.LJLJL(valueAnimator3);
            }
            float f2 = this.LJLLL;
            if (f2 == 0.0f) {
                this.LJLLJ = f2;
                invalidate();
                return;
            }
            return;
        }
        AqS175S0100000_9 aqS175S0100000_9 = this.LJLLI;
        if (aqS175S0100000_9 != null) {
            aqS175S0100000_9.invoke(Float.valueOf(f));
        }
    }

    public final void setCanDrawRing(boolean z) {
        this.LJLLLLLL = z;
    }

    public final void setContainerView(L69 containerView) {
        o.LJIIIZ(containerView, "containerView");
        this.LJLJJI = containerView;
        this.LJLJJL = containerView.getAvatarSizePx();
    }

    public final void setUIStyle(L4W avatarNodeFullData) {
        C53478Kyo c53478Kyo;
        o.LJIIIZ(avatarNodeFullData, "avatarNodeFullData");
        this.LJLILLLLZI = avatarNodeFullData.LIZ;
        L50 LIZ = avatarNodeFullData.LIZJ.LIZ().LIZ();
        if (LIZ instanceof C53478Kyo) {
            c53478Kyo = (C53478Kyo) LIZ;
        } else {
            c53478Kyo = null;
        }
        this.LJLIL = c53478Kyo;
    }

    public final void LIZIZ(C53478Kyo c53478Kyo, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        Context context;
        Integer LJI;
        Integer num = c53478Kyo.LIZ;
        if (num != null) {
            interfaceC88472Yns.invoke(num);
            return;
        }
        Integer num2 = c53478Kyo.LIZIZ;
        if (num2 == null) {
            return;
        }
        int intValue = num2.intValue();
        L69 l69 = this.LJLJJI;
        if (l69 == null || (context = l69.getContext()) == null || (LJI = C79045V0n.LJI(intValue, context)) == null) {
            return;
        }
        interfaceC88472Yns.invoke(LJI);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        InterfaceC88472Yns<C53447KyJ, Float> interfaceC88472Yns;
        InterfaceC88472Yns<C53447KyJ, Float> interfaceC88472Yns2;
        L69 l69 = this.LJLJJI;
        if (l69 != null) {
            i3 = l69.getAvatarSizePx();
        } else {
            i3 = 0;
        }
        this.LJLJJL = i3;
        C53447KyJ LJ = C78929UyL.LJ(this.LJLJJI);
        C53478Kyo c53478Kyo = this.LJLIL;
        if (c53478Kyo != null && (interfaceC88472Yns = c53478Kyo.LIZLLL) != null) {
            float floatValue = interfaceC88472Yns.invoke(LJ).floatValue();
            C53478Kyo c53478Kyo2 = this.LJLIL;
            if (c53478Kyo2 != null && (interfaceC88472Yns2 = c53478Kyo2.LJ) != null) {
                float floatValue2 = interfaceC88472Yns2.invoke(LJ).floatValue();
                this.LJLJJLL = floatValue2;
                int i4 = (int) ((2 * floatValue2) + floatValue);
                setMeasuredDimension(i4, i4);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L5Y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new LinkedHashMap();
        this.LJLJI = C221108m2.LIZIZ(C33676DJo.LJLIL);
        this.LJLJL = C221108m2.LIZIZ(C33680DJs.LJLIL);
        this.LJLLLL = -7829368;
        this.LJLLLLLL = true;
    }
}
