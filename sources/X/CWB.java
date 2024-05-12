package X;

import Y.ARunnableS41S0100000_5;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import kotlin.jvm.internal.AqS155S0100000_5;
import kotlin.jvm.internal.AqS187S0100000_5;
import kotlin.jvm.internal.IDqS430S0100000_5;

/* loaded from: classes6.dex */
public final class CWB implements View.OnTouchListener {
    public final View LJLIL;
    public final View LJLILLLLZI;
    public final InterfaceC88471Ynr<Integer, CWC, C76800UCe> LJLJI;
    public final InterfaceC88473Ynt<Integer, Integer, CWC, C76800UCe> LJLJJI;
    public final InterfaceC88471Ynr<Integer, Integer, C76800UCe> LJLJJL;
    public int LJLJJLL;
    public int LJLJL;
    public boolean LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJZL;
    public int LL;
    public int LLD;
    public int LLF;
    public final int[] LLFF;
    public CWD LJLJLJ = CWD.RIGHT_BOTTOM;
    public final int LJLLL = C15380j0.LIZ(12.0f);
    public final int LJLLLL = C15380j0.LIZ(12.0f);
    public final C5H3 LJLLLLLL = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 417));
    public final C5H3 LJLZ = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 415));
    public final C5H3 LJZ = C78996UzQ.LJJIJIIJI(new AqS155S0100000_5(this, 419));
    public CWC LJZI = CWC.Default;

    public final float LIZLLL() {
        return ((Number) this.LJLLLLLL.getValue()).floatValue();
    }

    public final float LJ() {
        return ((Number) this.LJZ.getValue()).floatValue();
    }

    public static CWC LIZIZ(CWC cwc) {
        CWC[] values = CWC.values();
        if (cwc.ordinal() >= CWC.values().length - 1) {
            return cwc;
        }
        for (CWC cwc2 : values) {
            if (cwc2 == cwc) {
                CWC cwc3 = (CWC) ORY.LJJJJI(cwc2.ordinal() + 1, values);
                if (cwc3 == null) {
                    return cwc;
                }
                return cwc3;
            }
        }
        return cwc;
    }

    public final CWC LIZJ(int i) {
        float LIZLLL = (i * 10.0f) / LIZLLL();
        if (Float.isNaN(LIZLLL)) {
            return this.LJZI;
        }
        float LJJIIZ = O6R.LJJIIZ(LIZLLL);
        CWC cwc = CWC.Scale120;
        float f = 10;
        float ratio = cwc.getRatio() * f;
        CWC cwc2 = CWC.Default;
        if (LJJIIZ > ((cwc2.getRatio() * f) + ratio) / 2) {
            return cwc;
        }
        if (LJJIIZ >= cwc2.getRatio() * f) {
            return cwc2;
        }
        CWC cwc3 = CWC.Scale90;
        if (LJJIIZ >= cwc3.getRatio() * f) {
            return cwc3;
        }
        CWC cwc4 = CWC.Scale80;
        if (LJJIIZ >= cwc4.getRatio() * f) {
            return cwc4;
        }
        CWC cwc5 = CWC.Scale70;
        if (LJJIIZ >= cwc5.getRatio() * f) {
            return cwc5;
        }
        return CWC.Scale60;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Integer valueOf;
        CWC LIZIZ;
        int LJ;
        float ratio;
        float LIZLLL;
        boolean z = false;
        if (view == null || view.getContext() == null) {
            return false;
        }
        if (motionEvent != null && (valueOf = Integer.valueOf(motionEvent.getAction())) != null) {
            if (valueOf.intValue() == 0) {
                view.getLeft();
                view.getRight();
                view.getTop();
                view.getBottom();
                this.LJLJL = (int) motionEvent.getRawY();
                this.LJLJJLL = (int) motionEvent.getRawX();
                this.LJLL = view.getMeasuredWidth();
                this.LJLLI = view.getMeasuredHeight();
                this.LLD = C81185Vtd.LJ(view.getContext());
                this.LLF = C81185Vtd.LIZJ(view.getContext());
                View view2 = this.LJLILLLLZI;
                int x = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                int top = view2.getTop();
                int left = view2.getLeft();
                int bottom = view2.getBottom();
                int right = view2.getRight();
                if (y < bottom && y > top && x > left && x < right) {
                    z = true;
                }
                this.LJLJLLL = z;
                if (z) {
                    this.LJLIL.getLocationOnScreen(this.LLFF);
                }
            } else if (valueOf.intValue() == 2) {
                this.LJZL = ((int) motionEvent.getRawX()) - this.LJLJJLL;
                this.LL = ((int) motionEvent.getRawY()) - this.LJLJL;
                if (this.LJLJLJ.isLeft()) {
                    this.LJZL = -this.LJZL;
                }
                if (this.LJLJLJ.isTop()) {
                    this.LL = -this.LL;
                }
                if (this.LJLJLLL) {
                    if (Math.abs(this.LJZL) > Math.abs(this.LL / LJ())) {
                        LJ = this.LJZL;
                    } else {
                        LJ = (int) (this.LL / LJ());
                    }
                    int i = this.LJLL + LJ;
                    this.LJLLILLLL = i;
                    float f = i;
                    CWC cwc = CWC.Scale120;
                    if (f > LIZLLL() * cwc.getRatio()) {
                        ratio = cwc.getRatio();
                        LIZLLL = LIZLLL();
                    } else {
                        CWC cwc2 = CWC.Scale60;
                        if (f < LIZLLL() * cwc2.getRatio()) {
                            ratio = cwc2.getRatio();
                            LIZLLL = LIZLLL();
                        }
                        this.LJLLILLLL = i;
                        int LJ2 = (int) (LJ() * i);
                        this.LJLLJ = LJ2;
                        int i2 = this.LJLLILLLL;
                        int LJI = LJI(i2 - this.LJLL, LJ2 - this.LJLLI, i2, LJ2);
                        this.LJLLILLLL = LJI;
                        int LJ3 = (int) (LJ() * LJI);
                        this.LJLLJ = LJ3;
                        int i3 = this.LJLLILLLL;
                        LIZ(view, i3 - this.LJLL, LJ3 - this.LJLLI, i3, LJ3);
                        int i4 = this.LJLLILLLL;
                        this.LJLL = i4;
                        this.LJLLI = this.LJLLJ;
                        this.LJZI = LIZJ(i4);
                        this.LJLJI.invoke(Integer.valueOf((int) ((this.LJLLILLLL * 100) / LIZLLL())), this.LJZI);
                    }
                    i = (int) (LIZLLL * ratio);
                    this.LJLLILLLL = i;
                    int LJ22 = (int) (LJ() * i);
                    this.LJLLJ = LJ22;
                    int i22 = this.LJLLILLLL;
                    int LJI2 = LJI(i22 - this.LJLL, LJ22 - this.LJLLI, i22, LJ22);
                    this.LJLLILLLL = LJI2;
                    int LJ32 = (int) (LJ() * LJI2);
                    this.LJLLJ = LJ32;
                    int i32 = this.LJLLILLLL;
                    LIZ(view, i32 - this.LJLL, LJ32 - this.LJLLI, i32, LJ32);
                    int i42 = this.LJLLILLLL;
                    this.LJLL = i42;
                    this.LJLLI = this.LJLLJ;
                    this.LJZI = LIZJ(i42);
                    this.LJLJI.invoke(Integer.valueOf((int) ((this.LJLLILLLL * 100) / LIZLLL())), this.LJZI);
                }
                this.LJLJL = (int) motionEvent.getRawY();
                this.LJLJJLL = (int) motionEvent.getRawX();
            } else if (valueOf.intValue() == 1) {
                this.LJLJLLL = false;
                int ratio2 = (int) (this.LJZI.getRatio() * LIZLLL());
                this.LJLLILLLL = ratio2;
                int LJ4 = (int) (LJ() * ratio2);
                this.LJLLJ = LJ4;
                int i5 = this.LJLLILLLL;
                int LJI3 = LJI(i5 - this.LJLL, LJ4 - this.LJLLI, i5, LJ4);
                while (this.LJLLILLLL != LJI3 && (LIZIZ = LIZIZ(this.LJZI)) != this.LJZI) {
                    this.LJZI = LIZIZ;
                    int ratio3 = (int) (this.LJZI.getRatio() * LIZLLL());
                    this.LJLLILLLL = ratio3;
                    int LJ5 = (int) (LJ() * ratio3);
                    this.LJLLJ = LJ5;
                    int i6 = this.LJLLILLLL;
                    LJI3 = LJI(i6 - this.LJLL, LJ5 - this.LJLLI, i6, LJ5);
                }
                int LJ6 = (int) (LJ() * this.LJLLILLLL);
                this.LJLLJ = LJ6;
                int i7 = this.LJLLILLLL;
                LIZ(view, i7 - this.LJLL, LJ6 - this.LJLLI, i7, LJ6);
                int i8 = this.LJLLILLLL;
                this.LJLL = i8;
                this.LJLLI = this.LJLLJ;
                this.LJZI = LIZJ(i8);
                this.LJLJI.invoke(Integer.valueOf((int) ((this.LJLLILLLL * 100) / LIZLLL())), this.LJZI);
                this.LJLJJI.invoke(Integer.valueOf(this.LJLLILLLL), Integer.valueOf(this.LJLLJ), this.LJZI);
            }
        }
        return this.LJLJLLL;
    }

    public final boolean LJFF(int i, int i2, int i3) {
        if (((C15380j0.LJIIL() - (this.LJLLL * 2)) - i) - i3 < 0 || (C15380j0.LJIIJJI() - (this.LJLLLL * 2)) - i2 < 0) {
            return false;
        }
        return true;
    }

    public final int LJI(int i, int i2, int i3, int i4) {
        CWD cwd = this.LJLJLJ;
        int[] iArr = CWF.LIZ;
        int i5 = iArr[cwd.ordinal()];
        if (i5 != 1 && i5 != 2) {
            if ((i5 == 3 || i5 == 4) && this.LLFF[0] + i3 > this.LLD - this.LJLLL) {
                return i3 - i;
            }
        } else if (this.LLFF[0] - i < this.LJLLL) {
            return i3 - i;
        }
        int i6 = iArr[this.LJLJLJ.ordinal()];
        if (i6 != 1) {
            if (i6 != 2 && i6 != 3) {
                if (i6 != 4) {
                    return i3;
                }
            } else {
                if (this.LLFF[1] - i2 >= this.LJLLLL) {
                    return i3;
                }
                return i3 - i;
            }
        }
        if (this.LLFF[1] + i4 <= this.LLF - this.LJLLLL) {
            return i3;
        }
        return i3 - i;
    }

    public CWB(ConstraintLayout constraintLayout, LiveIconView liveIconView, CWE cwe, IDqS430S0100000_5 iDqS430S0100000_5, AqS187S0100000_5 aqS187S0100000_5) {
        this.LJLIL = constraintLayout;
        this.LJLILLLLZI = liveIconView;
        this.LJLJI = cwe;
        this.LJLJJI = iDqS430S0100000_5;
        this.LJLJJL = aqS187S0100000_5;
        constraintLayout.post(new ARunnableS41S0100000_5(this, 330));
        this.LLFF = new int[2];
    }

    public final void LIZ(View view, int i, int i2, int i3, int i4) {
        int i5 = CWF.LIZ[this.LJLJLJ.ordinal()];
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    this.LJLJJL.invoke(0, Integer.valueOf(-i2));
                    int[] iArr = this.LLFF;
                    iArr[1] = iArr[1] - i2;
                }
            } else {
                this.LJLJJL.invoke(Integer.valueOf(-i), Integer.valueOf(-i2));
                int[] iArr2 = this.LLFF;
                iArr2[0] = iArr2[0] - i;
                iArr2[1] = iArr2[1] - i2;
            }
        } else {
            this.LJLJJL.invoke(Integer.valueOf(-i), 0);
            int[] iArr3 = this.LLFF;
            iArr3[0] = iArr3[0] - i;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i3;
        layoutParams.height = i4;
        view.setLayoutParams(layoutParams);
    }
}
