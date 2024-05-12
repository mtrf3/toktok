package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.OverScroller;

/* renamed from: X.WEv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C81965WEv extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ C81964WEu LJLIL;

    public C81965WEv(C81964WEu c81964WEu) {
        this.LJLIL = c81964WEu;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        float f;
        float f2;
        this.LJLIL.LLIIL.LIZJ();
        RectF rectF = this.LJLIL.LLIIIILZ;
        float width = (rectF.width() / 2.0f) + rectF.left;
        RectF rectF2 = this.LJLIL.LLIIIILZ;
        float height = (rectF2.height() / 2.0f) + rectF2.top;
        this.LJLIL.LLIIJI.set(width, height);
        this.LJLIL.LLIIJLIL.set(width, height);
        C81964WEu c81964WEu = this.LJLIL;
        c81964WEu.LLFII = 0;
        c81964WEu.LLFZ = 0;
        if (c81964WEu.LL) {
            f = c81964WEu.LLFFF;
            InterfaceC81962WEs interfaceC81962WEs = c81964WEu.LLILII;
            f2 = 1.0f;
            if (interfaceC81962WEs != null) {
                ((C81953WEj) interfaceC81962WEs).LIZ(1.0f);
            }
        } else {
            f = c81964WEu.LLFFF;
            f2 = c81964WEu.LJLILLLLZI;
            InterfaceC81962WEs interfaceC81962WEs2 = c81964WEu.LLILII;
            if (interfaceC81962WEs2 != null) {
                ((C81953WEj) interfaceC81962WEs2).LIZ(f2);
            }
            this.LJLIL.LLIIJI.set(motionEvent.getX(), motionEvent.getY());
        }
        this.LJLIL.LJLJLLL.reset();
        C81964WEu c81964WEu2 = this.LJLIL;
        Matrix matrix = c81964WEu2.LJLJLLL;
        RectF rectF3 = c81964WEu2.LLIIII;
        matrix.postTranslate(-rectF3.left, -rectF3.top);
        C81964WEu c81964WEu3 = this.LJLIL;
        Matrix matrix2 = c81964WEu3.LJLJLLL;
        PointF pointF = c81964WEu3.LLIIJLIL;
        matrix2.postTranslate(pointF.x, pointF.y);
        C81964WEu c81964WEu4 = this.LJLIL;
        c81964WEu4.LJLJLLL.postTranslate(-c81964WEu4.LLI, -c81964WEu4.LLIFFJFJJ);
        C81964WEu c81964WEu5 = this.LJLIL;
        Matrix matrix3 = c81964WEu5.LJLJLLL;
        float f3 = c81964WEu5.LLFF;
        PointF pointF2 = c81964WEu5.LLIIJLIL;
        matrix3.postRotate(f3, pointF2.x, pointF2.y);
        C81964WEu c81964WEu6 = this.LJLIL;
        Matrix matrix4 = c81964WEu6.LJLJLLL;
        PointF pointF3 = c81964WEu6.LLIIJI;
        matrix4.postScale(f2, f2, pointF3.x, pointF3.y);
        this.LJLIL.LJLJLLL.postTranslate(r6.LLFII, r6.LLFZ);
        C81964WEu c81964WEu7 = this.LJLIL;
        c81964WEu7.LJLJLLL.mapRect(c81964WEu7.LLIIIJ, c81964WEu7.LLIIII);
        C81964WEu c81964WEu8 = this.LJLIL;
        c81964WEu8.LJ(c81964WEu8.LLIIIJ);
        C81964WEu c81964WEu9 = this.LJLIL;
        c81964WEu9.LL = !c81964WEu9.LL;
        c81964WEu9.LLIIL.LIZLLL(f, f2);
        RunnableC81966WEw runnableC81966WEw = this.LJLIL.LLIIL;
        runnableC81966WEw.LJLIL = true;
        runnableC81966WEw.LJLLL.post(runnableC81966WEw);
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        C81964WEu c81964WEu = this.LJLIL;
        c81964WEu.LJLZ = false;
        c81964WEu.LJLLL = false;
        c81964WEu.removeCallbacks(c81964WEu.LLILIL);
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        C81964WEu c81964WEu = this.LJLIL;
        View.OnLongClickListener onLongClickListener = c81964WEu.LLIL;
        if (onLongClickListener != null) {
            onLongClickListener.onLongClick(c81964WEu);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        C81964WEu c81964WEu = this.LJLIL;
        c81964WEu.postDelayed(c81964WEu.LLILIL, 250L);
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float f3;
        float f4;
        int i;
        float f5;
        int i2;
        int i3;
        int i4;
        float f6;
        int i5;
        int i6;
        C81964WEu c81964WEu = this.LJLIL;
        if (c81964WEu.LJLLL) {
            return false;
        }
        if ((!c81964WEu.LLD && !c81964WEu.LLF) || c81964WEu.LLIIL.LJLIL) {
            return false;
        }
        if (Math.round(c81964WEu.LLIIIILZ.left) >= this.LJLIL.LLII.left || Math.round(r1.LLIIIILZ.right) <= this.LJLIL.LLII.right) {
            f3 = 0.0f;
        } else {
            f3 = f;
        }
        if (Math.round(this.LJLIL.LLIIIILZ.top) >= this.LJLIL.LLII.top || Math.round(r1.LLIIIILZ.bottom) <= this.LJLIL.LLII.bottom) {
            f4 = 0.0f;
        } else {
            f4 = f2;
        }
        this.LJLIL.getClass();
        C81964WEu c81964WEu2 = this.LJLIL;
        float f7 = c81964WEu2.LLFF;
        float f8 = f7 % 90.0f;
        if (f8 != 0.0f) {
            float f9 = ((int) (f7 / 90.0f)) * 90;
            if (f8 > 45.0f) {
                f9 += 90.0f;
            } else if (f8 < -45.0f) {
                f9 -= 90.0f;
            }
            RunnableC81966WEw runnableC81966WEw = c81964WEu2.LLIIL;
            int i7 = (int) f7;
            runnableC81966WEw.LJLJJLL.startScroll(i7, 0, ((int) f9) - i7, 0, runnableC81966WEw.LJLLL.LJLIL);
            this.LJLIL.LLFF = f9;
        }
        C81964WEu c81964WEu3 = this.LJLIL;
        c81964WEu3.LJ(c81964WEu3.LLIIIILZ);
        RunnableC81966WEw runnableC81966WEw2 = this.LJLIL.LLIIL;
        runnableC81966WEw2.getClass();
        if (f3 < 0.0f) {
            i = Integer.MAX_VALUE;
        } else {
            i = 0;
        }
        runnableC81966WEw2.LJLJLJ = i;
        C81964WEu c81964WEu4 = runnableC81966WEw2.LJLLL;
        if (f3 > 0.0f) {
            f5 = Math.abs(c81964WEu4.LLIIIILZ.left);
        } else {
            f5 = c81964WEu4.LLIIIILZ.right - c81964WEu4.LLII.right;
        }
        int i8 = (int) f5;
        if (f3 < 0.0f) {
            i2 = Integer.MAX_VALUE - i8;
            i3 = Integer.MAX_VALUE;
            i8 = Integer.MAX_VALUE - i2;
        } else {
            i2 = 0;
            i3 = i8;
        }
        if (f4 < 0.0f) {
            i4 = Integer.MAX_VALUE;
        } else {
            i4 = 0;
        }
        runnableC81966WEw2.LJLJLLL = i4;
        C81964WEu c81964WEu5 = runnableC81966WEw2.LJLLL;
        if (f4 > 0.0f) {
            f6 = Math.abs(c81964WEu5.LLIIIILZ.top);
        } else {
            f6 = c81964WEu5.LLIIIILZ.bottom - c81964WEu5.LLII.bottom;
        }
        int i9 = (int) f6;
        if (f4 < 0.0f) {
            i5 = Integer.MAX_VALUE - i9;
            i6 = Integer.MAX_VALUE;
            i9 = Integer.MAX_VALUE - i5;
        } else {
            i5 = 0;
            i6 = i9;
        }
        if (f3 == 0.0f) {
            i2 = 0;
            i3 = 0;
        }
        if (f4 == 0.0f) {
            i5 = 0;
            i6 = 0;
        }
        OverScroller overScroller = runnableC81966WEw2.LJLJI;
        int i10 = runnableC81966WEw2.LJLJLJ;
        int i11 = runnableC81966WEw2.LJLJLLL;
        int i12 = (int) f3;
        int i13 = (int) f4;
        int abs = Math.abs(i8);
        int i14 = runnableC81966WEw2.LJLLL.LJLJI;
        if (abs < i14 * 2) {
            i14 = 0;
        }
        int abs2 = Math.abs(i9);
        int i15 = runnableC81966WEw2.LJLLL.LJLJI;
        if (abs2 < i15 * 2) {
            i15 = 0;
        }
        overScroller.fling(i10, i11, i12, i13, i2, i3, i5, i6, i14, i15);
        RunnableC81966WEw runnableC81966WEw3 = this.LJLIL.LLIIL;
        runnableC81966WEw3.LJLIL = true;
        runnableC81966WEw3.LJLLL.post(runnableC81966WEw3);
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        RunnableC81966WEw runnableC81966WEw = this.LJLIL.LLIIL;
        if (runnableC81966WEw.LJLIL) {
            runnableC81966WEw.LIZJ();
        }
        if (this.LJLIL.LIZ(f)) {
            if (f < 0.0f) {
                C81964WEu c81964WEu = this.LJLIL;
                float f3 = c81964WEu.LLIIIILZ.left;
                if (f3 - f > c81964WEu.LLII.left) {
                    f = f3;
                }
            }
            if (f > 0.0f) {
                C81964WEu c81964WEu2 = this.LJLIL;
                float f4 = c81964WEu2.LLIIIILZ.right;
                float f5 = f4 - f;
                float f6 = c81964WEu2.LLII.right;
                if (f5 < f6) {
                    f = f4 - f6;
                }
            }
            this.LJLIL.LJLJL.postTranslate(-f, 0.0f);
            this.LJLIL.LLFII = (int) (r1.LLFII - f);
        } else {
            C81964WEu c81964WEu3 = this.LJLIL;
            if (c81964WEu3.LLD || c81964WEu3.LJLLL || c81964WEu3.LJLZ) {
                c81964WEu3.LIZJ();
                C81964WEu c81964WEu4 = this.LJLIL;
                if (!c81964WEu4.LJLLL) {
                    if (f < 0.0f) {
                        float f7 = c81964WEu4.LLIIIILZ.left;
                        float f8 = f7 - f;
                        float f9 = c81964WEu4.LLIIIL.left;
                        if (f8 > f9) {
                            f *= Math.abs(Math.abs(f7 - f9) - c81964WEu4.LJLJJI) / c81964WEu4.LJLJJI;
                        }
                    }
                    if (f > 0.0f) {
                        C81964WEu c81964WEu5 = this.LJLIL;
                        float f10 = c81964WEu5.LLIIIILZ.right;
                        float f11 = f10 - f;
                        float f12 = c81964WEu5.LLIIIL.right;
                        if (f11 < f12) {
                            f *= Math.abs(Math.abs(f10 - f12) - c81964WEu5.LJLJJI) / c81964WEu5.LJLJJI;
                        }
                    }
                }
                C81964WEu c81964WEu6 = this.LJLIL;
                c81964WEu6.LLFII = (int) (c81964WEu6.LLFII - f);
                c81964WEu6.LJLJL.postTranslate(-f, 0.0f);
                this.LJLIL.LJLZ = true;
            }
        }
        if (this.LJLIL.LIZIZ(f2)) {
            if (f2 < 0.0f) {
                C81964WEu c81964WEu7 = this.LJLIL;
                float f13 = c81964WEu7.LLIIIILZ.top;
                if (f13 - f2 > c81964WEu7.LLII.top) {
                    f2 = f13;
                }
            }
            if (f2 > 0.0f) {
                C81964WEu c81964WEu8 = this.LJLIL;
                float f14 = c81964WEu8.LLIIIILZ.bottom;
                float f15 = f14 - f2;
                float f16 = c81964WEu8.LLII.bottom;
                if (f15 < f16) {
                    f2 = f14 - f16;
                }
            }
            this.LJLIL.LJLJL.postTranslate(0.0f, -f2);
            this.LJLIL.LLFZ = (int) (r1.LLFZ - f2);
        } else {
            C81964WEu c81964WEu9 = this.LJLIL;
            if (c81964WEu9.LLF || c81964WEu9.LJLZ || c81964WEu9.LJLLL) {
                c81964WEu9.LIZJ();
                C81964WEu c81964WEu10 = this.LJLIL;
                if (!c81964WEu10.LJLLL) {
                    if (f2 < 0.0f) {
                        float f17 = c81964WEu10.LLIIIILZ.top;
                        float f18 = f17 - f2;
                        float f19 = c81964WEu10.LLIIIL.top;
                        if (f18 > f19) {
                            f2 *= Math.abs(Math.abs(f17 - f19) - c81964WEu10.LJLJJI) / c81964WEu10.LJLJJI;
                        }
                    }
                    if (f2 > 0.0f) {
                        C81964WEu c81964WEu11 = this.LJLIL;
                        float f20 = c81964WEu11.LLIIIILZ.bottom;
                        float f21 = f20 - f2;
                        float f22 = c81964WEu11.LLIIIL.bottom;
                        if (f21 < f22) {
                            f2 *= Math.abs(Math.abs(f20 - f22) - c81964WEu11.LJLJJI) / c81964WEu11.LJLJJI;
                        }
                    }
                }
                this.LJLIL.LJLJL.postTranslate(0.0f, -f2);
                C81964WEu c81964WEu12 = this.LJLIL;
                c81964WEu12.LLFZ = (int) (c81964WEu12.LLFZ - f2);
                c81964WEu12.LJLZ = true;
            }
        }
        this.LJLIL.LJFF();
        return true;
    }
}
