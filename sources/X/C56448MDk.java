package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.experiment.SeekBarEdgeOptiExp;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.MDk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C56448MDk extends LinearLayout {
    public static final float LJZL = C32151Nz.LJIIZILJ(13);
    public static final float LL = C32151Nz.LJIIZILJ(8);
    public static final float LLD = C32151Nz.LJIIZILJ(4);
    public final IHZ LJLIL;
    public C81238VuU LJLILLLLZI;
    public Float LJLJI;
    public InterfaceC56456MDs LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL;
    public final boolean LJLJL;
    public final boolean LJLJLJ;
    public boolean LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public final int LJLLILLLL;
    public final int LJLLJ;
    public final int LJLLL;
    public final int LJLLLL;
    public final int LJLLLLLL;
    public final int LJLZ;
    public int LJZ;
    public float LJZI;

    public C56448MDk() {
        throw null;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    public final boolean getDisableSeekTouch() {
        return this.LJLJJLL;
    }

    public final boolean getForceDispatchTouchEvent() {
        return this.LJLJLLL;
    }

    public final InterfaceC56456MDs getMOnSeekBarChangeListener() {
        return this.LJLJJI;
    }

    public final Float getMProgress() {
        return this.LJLJI;
    }

    public final int getMScreenWidth() {
        return this.LJLJJL;
    }

    public final C81238VuU getMutableSeekBar() {
        return this.LJLILLLLZI;
    }

    public final int getPageType() {
        return this.LJLLI;
    }

    public final float getProgressHeight() {
        return this.LJZI;
    }

    public final int getSeekBarShowType() {
        return this.LJLL;
    }

    public final void LIZ(Context context) {
        ViewGroup.LayoutParams layoutParams;
        this.LJLJJL = KL2.LJIIJJI(context);
        View LIZ = C16950lX.LIZ(context, R.layout.af1, this, true, -1);
        bringToFront();
        C81238VuU c81238VuU = (C81238VuU) LIZ.findViewById(R.id.jkd);
        this.LJLILLLLZI = c81238VuU;
        if (c81238VuU != null && (layoutParams = c81238VuU.getLayoutParams()) != null) {
            layoutParams.height = (int) KL2.LIZJ(context, 28.0f);
        }
        C81238VuU c81238VuU2 = this.LJLILLLLZI;
        if (c81238VuU2 != null) {
            C81238VuU.LIZLLL(c81238VuU2, Integer.valueOf(this.LJZ), Integer.valueOf(this.LJLLLL), Float.valueOf(this.LJZI), null, false, 56);
            float f = LLD;
            C81238VuU.LJ(c81238VuU2, Float.valueOf(f), Float.valueOf(f), Float.valueOf(f / 2), Integer.valueOf(this.LJZ), 0.0f, false, 496);
        }
        C81238VuU c81238VuU3 = this.LJLILLLLZI;
        if (c81238VuU3 != null) {
            c81238VuU3.setCustomOnSeekBarChangeListener(new C56453MDp(this));
        }
    }

    public final void LIZIZ(float f) {
        Float f2;
        C81238VuU c81238VuU;
        this.LJLJI = Float.valueOf(f);
        if (!this.LJLJL) {
            C81238VuU c81238VuU2 = this.LJLILLLLZI;
            if (c81238VuU2 == null) {
                return;
            }
            c81238VuU2.setProgress((int) (f * 100.0f));
            return;
        }
        C81238VuU c81238VuU3 = this.LJLILLLLZI;
        if (c81238VuU3 != null) {
            f2 = Float.valueOf(c81238VuU3.getAlpha());
        } else {
            f2 = null;
        }
        if (o.LIZJ(f2, 0.0f) || (c81238VuU = this.LJLILLLLZI) == null) {
            return;
        }
        c81238VuU.setProgress((int) (f * 100.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LIZJ(int r25) {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C56448MDk.LIZJ(int):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.LJLJLLL) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return false;
    }

    public final void setDisableSeekTouch(boolean z) {
        this.LJLJJLL = z;
    }

    public final void setEnableClickToSeek(boolean z) {
        C81238VuU c81238VuU = this.LJLILLLLZI;
        if (c81238VuU == null) {
            return;
        }
        c81238VuU.setEnableClickToSeek(z);
    }

    public final void setForceDispatchTouchEvent(boolean z) {
        this.LJLJLLL = z;
    }

    public final void setHorizontalMargin(int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C81238VuU c81238VuU = this.LJLILLLLZI;
        ViewGroup.LayoutParams layoutParams = null;
        if (c81238VuU != null) {
            layoutParams = c81238VuU.getLayoutParams();
        }
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginStart(i);
            marginLayoutParams.setMarginEnd(i);
        }
    }

    public final void setMOnSeekBarChangeListener(InterfaceC56456MDs interfaceC56456MDs) {
        this.LJLJJI = interfaceC56456MDs;
    }

    public final void setMProgress(Float f) {
        this.LJLJI = f;
    }

    public final void setMScreenWidth(int i) {
        this.LJLJJL = i;
    }

    public final void setOnSeekBarChangeListener(InterfaceC56456MDs listener) {
        o.LJIIIZ(listener, "listener");
        this.LJLJJI = listener;
    }

    public final void setPageType(int i) {
        C81238VuU c81238VuU;
        this.LJLLI = i;
        if (C79004UzY.LJJIJIIJI(getContext()) && (c81238VuU = this.LJLILLLLZI) != null) {
            C81238VuU.LIZLLL(c81238VuU, Integer.valueOf(this.LJLLILLLL), Integer.valueOf(this.LJLLLL), C61328O5c.LIZJ(3), C61328O5c.LIZJ(2), true, 48);
            float f = LJZL;
            C81238VuU.LJ(c81238VuU, Float.valueOf(f), Float.valueOf(f), Float.valueOf(f / 2), Integer.valueOf(this.LJLLILLLL), 0.0f, true, 496);
        }
    }

    public final void setPauseStatus(boolean z) {
        C81238VuU c81238VuU = this.LJLILLLLZI;
        if (c81238VuU != null) {
            c81238VuU.setPauseStatus(z);
        }
    }

    public final void setProgress(float f) {
        LIZIZ(f);
    }

    public final void setProgressHeight(float f) {
        this.LJZI = f;
    }

    public final void setSecondaryProgress(int i) {
        C81238VuU c81238VuU = this.LJLILLLLZI;
        if (c81238VuU == null) {
            return;
        }
        c81238VuU.setSecondaryProgress(i * 100);
    }

    public final void setSeekBarShowType(int i) {
        if (this.LJLL != i) {
            this.LJLL = i;
            IHZ ihz = this.LJLIL;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("seekbar show type change, change to:");
            LIZ.append(i);
            ihz.LJIIIIZZ(X1D.LIZIZ(LIZ));
            float f = 0.0f;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                switch (i) {
                                    case 100:
                                        C81238VuU c81238VuU = this.LJLILLLLZI;
                                        if (c81238VuU == null) {
                                            return;
                                        }
                                        c81238VuU.setAlpha(1.0f);
                                        Float f2 = this.LJLJI;
                                        if (f2 != null) {
                                            f = f2.floatValue();
                                        }
                                        setProgress(f);
                                        c81238VuU.setVisibility(0);
                                        LIZJ(100);
                                        c81238VuU.setCanDrag(true);
                                        return;
                                    case 101:
                                        C81238VuU c81238VuU2 = this.LJLILLLLZI;
                                        if (c81238VuU2 == null) {
                                            return;
                                        }
                                        c81238VuU2.setVisibility(0);
                                        LIZJ(101);
                                        c81238VuU2.setCanDrag(true);
                                        return;
                                    case 102:
                                        C81238VuU c81238VuU3 = this.LJLILLLLZI;
                                        if (c81238VuU3 == null) {
                                            return;
                                        }
                                        c81238VuU3.setVisibility(0);
                                        LIZJ(102);
                                        c81238VuU3.setCanDrag(true);
                                        return;
                                    default:
                                        return;
                                }
                            }
                            C81238VuU c81238VuU4 = this.LJLILLLLZI;
                            if (c81238VuU4 == null) {
                                return;
                            }
                            c81238VuU4.setAlpha(0.0f);
                            c81238VuU4.setVisibility(0);
                            LIZJ(4);
                            c81238VuU4.setCanDrag(true);
                            return;
                        }
                        C81238VuU c81238VuU5 = this.LJLILLLLZI;
                        if (c81238VuU5 == null) {
                            return;
                        }
                        c81238VuU5.setCanDrag(false);
                        c81238VuU5.setVisibility(8);
                        return;
                    }
                    C81238VuU c81238VuU6 = this.LJLILLLLZI;
                    if (c81238VuU6 == null) {
                        return;
                    }
                    c81238VuU6.setAlpha(1.0f);
                    Float f3 = this.LJLJI;
                    if (f3 != null) {
                        f = f3.floatValue();
                    }
                    setProgress(f);
                    c81238VuU6.setVisibility(0);
                    LIZJ(2);
                    c81238VuU6.setCanDrag(true);
                    return;
                }
                C81238VuU c81238VuU7 = this.LJLILLLLZI;
                if (c81238VuU7 == null) {
                    return;
                }
                c81238VuU7.setAlpha(1.0f);
                Float f4 = this.LJLJI;
                if (f4 != null) {
                    f = f4.floatValue();
                }
                setProgress(f);
                c81238VuU7.setVisibility(0);
                LIZJ(1);
                c81238VuU7.setCanDrag(true);
                return;
            }
            C81238VuU c81238VuU8 = this.LJLILLLLZI;
            if (c81238VuU8 == null) {
                return;
            }
            c81238VuU8.setAlpha(1.0f);
            Float f5 = this.LJLJI;
            if (f5 != null) {
                f = f5.floatValue();
            }
            setProgress(f);
            c81238VuU8.setVisibility(0);
            LIZJ(0);
            c81238VuU8.setCanDrag(true);
        }
    }

    public C56448MDk(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C56448MDk(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        Integer LJI;
        Integer LJI2;
        new LinkedHashMap();
        this.LJLIL = new IHZ("VideoSeekBar");
        this.LJLJL = ((Boolean) C52327KgF.LIZ.getValue()).booleanValue();
        this.LJLJLJ = SeekBarEdgeOptiExp.INSTANCE.edgeOptimized();
        this.LJLL = 3;
        this.LJLLI = -1;
        Context context2 = getContext();
        o.LJI(context2);
        this.LJLLILLLL = C04330Ez.LIZIZ(context2, R.color.ar);
        Context context3 = getContext();
        o.LJI(context3);
        int LIZIZ = C04330Ez.LIZIZ(context3, R.color.bg);
        this.LJLLJ = LIZIZ;
        Context context4 = getContext();
        int i3 = 0;
        if (context4 != null && (LJI2 = C79045V0n.LJI(R.attr.dn, context4)) != null) {
            i2 = LJI2.intValue();
        } else {
            i2 = 0;
        }
        this.LJLLL = i2;
        Context context5 = getContext();
        o.LJI(context5);
        this.LJLLLL = C04330Ez.LIZIZ(context5, R.color.ba);
        Context context6 = getContext();
        if (context6 != null && (LJI = C79045V0n.LJI(R.attr.dl, context6)) != null) {
            i3 = LJI.intValue();
        }
        this.LJLLLLLL = i3;
        Context context7 = getContext();
        o.LJI(context7);
        this.LJLZ = C04330Ez.LIZIZ(context7, R.color.bc);
        this.LJZ = LIZIZ;
        this.LJZI = C32151Nz.LJIIZILJ(2);
        try {
            LIZ(context);
        } catch (Throwable th) {
            C36922EeM.LJFF(th);
        }
    }
}
