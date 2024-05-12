package X;

import Y.IDAListenerS69S0100000;
import Y.IDRunnableS85S0100000;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.bytedance.android.live.common.keyboard.MeasureLinearLayout;
import com.bytedance.android.livesdk.chatroom.ui.LiveEmojiInputDialogFragment;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1GQ, reason: invalid class name */
/* loaded from: classes.dex */
public class C1GQ extends C0P4 implements C0PF {
    public int LIZJ;
    public boolean LIZLLL;
    public C0PI LJ;
    public int LJFF = 0;
    public boolean LJI = false;
    public final /* synthetic */ MeasureLinearLayout LJII;

    public C1GQ(MeasureLinearLayout measureLinearLayout) {
        this.LJII = measureLinearLayout;
    }

    @Override // X.C0P4
    public final void LIZIZ(C0PA c0pa) {
        C15H c15h;
        if (this.LIZLLL && (c0pa.LIZ() & 8) != 0) {
            this.LIZLLL = false;
        }
        if (this.LJI && (c15h = this.LJII.LJLILLLLZI) != null) {
            ((LiveEmojiInputDialogFragment) c15h).Zl(0, 0, false);
        }
    }

    @Override // X.C0P4
    public final void LIZJ(C0PA c0pa) {
        if ((c0pa.LIZ() & 8) != 0) {
            this.LIZLLL = true;
        }
    }

    @Override // X.C0PF
    public final C0PI LIZ(View view, C0PI c0pi) {
        int i;
        long j;
        int i2;
        final int i3;
        if (this.LJ != null && c0pi.LIZ(8).LIZLLL == this.LJ.LIZ(8).LIZLLL) {
            return C0PI.LIZIZ;
        }
        int i4 = c0pi.LIZ(2).LIZLLL;
        final int i5 = 0;
        boolean z = false;
        this.LIZJ = Math.max(c0pi.LIZ(8).LIZLLL - i4, 0);
        this.LJII.setPadding(c0pi.LIZ(7).LIZ, this.LJII.getPaddingTop(), c0pi.LIZ(7).LIZJ, c0pi.LIZ(2).LIZLLL);
        if (this.LIZLLL) {
            i = 2;
        } else {
            i = 10;
        }
        C06920Oy LIZ = c0pi.LIZ(i);
        int i6 = LIZ.LIZLLL;
        if (i4 > 0) {
            i6 -= i4;
        }
        final MeasureLinearLayout measureLinearLayout = this.LJII;
        C15G c15g = measureLinearLayout.LJLJI;
        final boolean z2 = true;
        if (c15g != null) {
            int i7 = this.LIZJ;
            if (i7 > 0) {
                z = true;
            }
            c15g.LLILLL(i7, z);
        } else {
            Rect rect = new Rect(LIZ.LIZ, LIZ.LIZIZ, LIZ.LIZJ, Math.max(i6, 0));
            Rect rect2 = measureLinearLayout.LJLJLJ;
            if (rect2 != null && rect2.bottom != rect.bottom) {
                ValueAnimator valueAnimator = measureLinearLayout.LJLJJLL;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (rect.bottom <= measureLinearLayout.LJLJJI) {
                    z2 = false;
                }
                boolean z3 = !z2;
                measureLinearLayout.LJLJJL = z3;
                if (z3) {
                    j = 120;
                } else {
                    j = 100;
                }
                long abs = (Math.abs(r8 - rect2.bottom) / (Math.max(rect.bottom, rect2.bottom) * 1.0f)) * ((float) j);
                ValueAnimator valueAnimator2 = measureLinearLayout.LJLJJLL;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(abs);
                measureLinearLayout.LJLJJLL = duration;
                if (measureLinearLayout.LJLJJL) {
                    duration.setInterpolator(new AccelerateInterpolator());
                } else {
                    duration.setInterpolator(new DecelerateInterpolator());
                }
                int i8 = rect.bottom;
                int i9 = rect2.bottom;
                int i10 = measureLinearLayout.LJLJJI;
                if (i9 == i10) {
                    i2 = i8 - i10;
                    i3 = 0;
                } else {
                    i2 = i8;
                    i3 = i9;
                }
                if (i8 == i10) {
                    i3 = i9 - i10;
                } else {
                    i5 = i2;
                }
                measureLinearLayout.LJLJJLL.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.15K
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        MeasureLinearLayout measureLinearLayout2 = MeasureLinearLayout.this;
                        boolean z4 = z2;
                        int i11 = i5;
                        int i12 = i3;
                        C15H c15h = measureLinearLayout2.LJLILLLLZI;
                        if (c15h != null) {
                            ((LiveEmojiInputDialogFragment) c15h).Zl(i11, i12 + ((int) (valueAnimator3.getAnimatedFraction() * (i11 - i12))), z4);
                        }
                    }
                });
                measureLinearLayout.LJLJJLL.addListener(new IDAListenerS69S0100000(measureLinearLayout, 17));
                ViewTreeObserverOnPreDrawListenerC06930Oz.LIZ(measureLinearLayout, new IDRunnableS85S0100000(measureLinearLayout, 130));
                measureLinearLayout.LJLJLJ = rect;
            }
        }
        this.LJ = c0pi;
        return c0pi;
    }

    @Override // X.C0P4
    public final C0PI LIZLLL(C0PI c0pi, List<C0PA> list) {
        boolean z;
        Iterator<C0PA> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((it.next().LIZ() & 8) != 0) {
                MeasureLinearLayout measureLinearLayout = this.LJII;
                ValueAnimator valueAnimator = measureLinearLayout.LJLJJLL;
                if (valueAnimator != null && !measureLinearLayout.LJLJJL) {
                    valueAnimator.cancel();
                }
                int i = c0pi.LIZ(8).LIZLLL - c0pi.LIZ(2).LIZLLL;
                boolean z2 = false;
                if (i < 0) {
                    i = 0;
                }
                int i2 = this.LIZJ;
                if (i2 != 0 || this.LJFF != 0) {
                    this.LJFF = i;
                    C15H c15h = this.LJII.LJLILLLLZI;
                    if (c15h != null) {
                        if (i2 == 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.LJI = z;
                        if (i > 0) {
                            if (i2 != 0) {
                                z2 = true;
                            }
                            ((LiveEmojiInputDialogFragment) c15h).Zl(i2, i, z2);
                        } else {
                            if (i2 != 0) {
                                z2 = true;
                            }
                            ((LiveEmojiInputDialogFragment) c15h).Zl(i2, 1, z2);
                        }
                    }
                }
            }
        }
        return c0pi;
    }

    @Override // X.C0P4
    public final C0P3 LJ(C0PA c0pa, C0P3 c0p3) {
        this.LJI = false;
        return c0p3;
    }
}
