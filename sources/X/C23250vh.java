package X;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import java.lang.reflect.Method;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.0vh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C23250vh extends View {
    public static final int[] LJLJJLL = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] LJLJL = new int[0];
    public C23330vp LJLIL;
    public Boolean LJLILLLLZI;
    public Long LJLJI;
    public RunnableC23230vf LJLJJI;
    public InterfaceC65784Pro<C76800UCe> LJLJJL;

    public final void LIZIZ() {
        this.LJLJJL = null;
        Runnable runnable = this.LJLJJI;
        if (runnable != null) {
            removeCallbacks(runnable);
            RunnableC23230vf runnableC23230vf = this.LJLJJI;
            o.LJI(runnableC23230vf);
            runnableC23230vf.run();
        } else {
            C23330vp c23330vp = this.LJLIL;
            if (c23330vp != null) {
                c23330vp.setState(LJLJL);
            }
        }
        C23330vp c23330vp2 = this.LJLIL;
        if (c23330vp2 == null) {
            return;
        }
        c23330vp2.setVisible(false, false);
        unscheduleDrawable(c23330vp2);
    }

    public final void LIZLLL() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    public C23250vh(Context context) {
        super(context);
    }

    private final void setRippleState(boolean z) {
        long j;
        int[] iArr;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.LJLJJI;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.LJLJI;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        long j2 = currentAnimationTimeMillis - j;
        if (!z) {
            if (j2 < 5) {
                RunnableC23230vf runnableC23230vf = new RunnableC23230vf(0, this);
                this.LJLJJI = runnableC23230vf;
                postDelayed(runnableC23230vf, 50L);
                this.LJLJI = Long.valueOf(currentAnimationTimeMillis);
            }
            iArr = LJLJL;
        } else {
            iArr = LJLJJLL;
        }
        C23330vp c23330vp = this.LJLIL;
        if (c23330vp != null) {
            c23330vp.setState(iArr);
        }
        this.LJLJI = Long.valueOf(currentAnimationTimeMillis);
    }

    /* renamed from: setRippleState$lambda-2, reason: not valid java name */
    public static final void m0setRippleState$lambda2(C23250vh this$0) {
        o.LJIIIZ(this$0, "this$0");
        C23330vp c23330vp = this$0.LJLIL;
        if (c23330vp != null) {
            c23330vp.setState(LJLJL);
        }
        this$0.LJLJJI = null;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable who) {
        o.LJIIIZ(who, "who");
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public final void LJ(long j, long j2, float f, int i) {
        C23330vp c23330vp = this.LJLIL;
        if (c23330vp == null) {
            return;
        }
        Integer num = c23330vp.LJLJI;
        if (num == null || num.intValue() != i) {
            c23330vp.LJLJI = Integer.valueOf(i);
            if (Build.VERSION.SDK_INT < 23) {
                try {
                    if (!C23330vp.LJLJJLL) {
                        C23330vp.LJLJJLL = true;
                        C23330vp.LJLJJL = RippleDrawable.class.getDeclaredMethod("setMaxRadius", Integer.TYPE);
                    }
                    Method method = C23330vp.LJLJJL;
                    if (method != null) {
                        method.invoke(c23330vp, Integer.valueOf(i));
                    }
                } catch (Exception unused) {
                }
            } else {
                C23320vo.LIZ(c23330vp, i);
            }
        }
        if (Build.VERSION.SDK_INT < 28) {
            f *= 2;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        long LIZIZ = C11850dJ.LIZIZ(j2, f);
        C11850dJ c11850dJ = c23330vp.LJLILLLLZI;
        if (c11850dJ == null || !C11850dJ.LIZJ(c11850dJ.LIZ, LIZIZ)) {
            c23330vp.LJLILLLLZI = new C11850dJ(LIZIZ);
            c23330vp.setColor(ColorStateList.valueOf(C78897Uxp.LJJJZ(LIZIZ)));
        }
        Rect LJJJJZ = C78939UyV.LJJJJZ(C78929UyL.LIZ(C10370av.LIZIZ, j));
        setLeft(LJJJJZ.left);
        setTop(LJJJJZ.top);
        setRight(LJJJJZ.right);
        setBottom(LJJJJZ.bottom);
        c23330vp.setBounds(LJJJJZ);
    }

    public final void LIZ(C1OJ interaction, boolean z, long j, int i, long j2, float f, IDqS420S0100000 onInvalidateRipple) {
        o.LJIIIZ(interaction, "interaction");
        o.LJIIIZ(onInvalidateRipple, "onInvalidateRipple");
        if (this.LJLIL == null || !o.LJ(Boolean.valueOf(z), this.LJLILLLLZI)) {
            C23330vp c23330vp = new C23330vp(z);
            setBackground(c23330vp);
            this.LJLIL = c23330vp;
            this.LJLILLLLZI = Boolean.valueOf(z);
        }
        C23330vp c23330vp2 = this.LJLIL;
        o.LJI(c23330vp2);
        this.LJLJJL = onInvalidateRipple;
        LJ(j, j2, f, i);
        if (z) {
            c23330vp2.setHotspot(C10370av.LIZLLL(interaction.LIZ), C10370av.LJ(interaction.LIZ));
        } else {
            c23330vp2.setHotspot(c23330vp2.getBounds().centerX(), c23330vp2.getBounds().centerY());
        }
        setRippleState(true);
    }
}
