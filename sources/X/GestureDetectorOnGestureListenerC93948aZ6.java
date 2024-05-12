package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.aZ6, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class GestureDetectorOnGestureListenerC93948aZ6 implements GestureDetector.OnGestureListener {
    public final /* synthetic */ C0CM LJLIL;
    public final /* synthetic */ C76732zl LJLILLLLZI;
    public final /* synthetic */ RecyclerView LJLJI;

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        Float f;
        Integer num;
        Float f2;
        Integer num2;
        Integer num3;
        int i;
        Integer num4;
        Integer num5;
        float LIZ;
        Integer num6;
        C76732zl c76732zl = this.LJLILLLLZI;
        Float f3 = null;
        if (motionEvent != null) {
            f = Float.valueOf(motionEvent.getX());
        } else {
            f = null;
        }
        float LIZ2 = C93949aZ7.LIZ(f);
        RecyclerView recyclerView = this.LJLJI;
        if (recyclerView != null) {
            num = Integer.valueOf(recyclerView.getLeft());
        } else {
            num = null;
        }
        if (LIZ2 < C93949aZ7.LIZIZ(num)) {
            RecyclerView recyclerView2 = this.LJLJI;
            if (recyclerView2 != null) {
                num6 = Integer.valueOf(recyclerView2.getLeft());
            } else {
                num6 = null;
            }
            float LIZIZ = C93949aZ7.LIZIZ(num6);
            if (motionEvent != null) {
                f3 = Float.valueOf(motionEvent.getX());
            }
            LIZ = (LIZIZ - C93949aZ7.LIZ(f3)) + 1;
        } else {
            if (motionEvent != null) {
                f2 = Float.valueOf(motionEvent.getX());
            } else {
                f2 = null;
            }
            float LIZ3 = C93949aZ7.LIZ(f2);
            RecyclerView recyclerView3 = this.LJLJI;
            if (recyclerView3 != null) {
                num2 = Integer.valueOf(recyclerView3.getLeft());
            } else {
                num2 = null;
            }
            float LIZIZ2 = C93949aZ7.LIZIZ(num2);
            RecyclerView recyclerView4 = this.LJLJI;
            if (recyclerView4 != null) {
                num3 = Integer.valueOf(recyclerView4.getWidth());
            } else {
                num3 = null;
            }
            if (LIZ3 > LIZIZ2 + C93949aZ7.LIZIZ(num3)) {
                RecyclerView recyclerView5 = this.LJLJI;
                if (recyclerView5 != null) {
                    num4 = Integer.valueOf(recyclerView5.getLeft());
                } else {
                    num4 = null;
                }
                float LIZIZ3 = C93949aZ7.LIZIZ(num4);
                RecyclerView recyclerView6 = this.LJLJI;
                if (recyclerView6 != null) {
                    num5 = Integer.valueOf(recyclerView6.getWidth());
                } else {
                    num5 = null;
                }
                float LIZIZ4 = LIZIZ3 + C93949aZ7.LIZIZ(num5);
                if (motionEvent != null) {
                    f3 = Float.valueOf(motionEvent.getX());
                }
                LIZ = (LIZIZ4 - C93949aZ7.LIZ(f3)) - 1;
            } else {
                i = 0;
                c76732zl.element = i;
                return false;
            }
        }
        i = (int) LIZ;
        c76732zl.element = i;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        Float f;
        Integer num;
        Float f2;
        Integer num2;
        Integer num3;
        Float f3;
        Float f4;
        Float f5;
        Float f6 = null;
        if (motionEvent != null) {
            f = Float.valueOf(motionEvent.getX());
        } else {
            f = null;
        }
        float LIZ = C93949aZ7.LIZ(f);
        RecyclerView recyclerView = this.LJLJI;
        if (recyclerView != null) {
            num = Integer.valueOf(recyclerView.getLeft());
        } else {
            num = null;
        }
        if (LIZ < C93949aZ7.LIZIZ(num)) {
            if (motionEvent != null) {
                f4 = Float.valueOf(motionEvent.getY());
            } else {
                f4 = null;
            }
            if (C93949aZ7.LIZ(f4) > C93949aZ7.LIZIZ(Integer.valueOf(this.LJLIL.getTop()))) {
                if (motionEvent != null) {
                    f5 = Float.valueOf(motionEvent.getY());
                } else {
                    f5 = null;
                }
                if (C93949aZ7.LIZ(f5) < C93949aZ7.LIZIZ(Integer.valueOf(this.LJLIL.getBottom()))) {
                    C0CM c0cm = this.LJLIL;
                    c0cm.setCurrentItem(c0cm.getCurrentItem() - 1);
                    return true;
                }
            }
        }
        if (motionEvent != null) {
            f2 = Float.valueOf(motionEvent.getX());
        } else {
            f2 = null;
        }
        float LIZ2 = C93949aZ7.LIZ(f2);
        RecyclerView recyclerView2 = this.LJLJI;
        if (recyclerView2 != null) {
            num2 = Integer.valueOf(recyclerView2.getLeft());
        } else {
            num2 = null;
        }
        float LIZIZ = C93949aZ7.LIZIZ(num2);
        RecyclerView recyclerView3 = this.LJLJI;
        if (recyclerView3 != null) {
            num3 = Integer.valueOf(recyclerView3.getWidth());
        } else {
            num3 = null;
        }
        if (LIZ2 > LIZIZ + C93949aZ7.LIZIZ(num3)) {
            if (motionEvent != null) {
                f3 = Float.valueOf(motionEvent.getY());
            } else {
                f3 = null;
            }
            if (C93949aZ7.LIZ(f3) > C93949aZ7.LIZIZ(Integer.valueOf(this.LJLIL.getTop()))) {
                if (motionEvent != null) {
                    f6 = Float.valueOf(motionEvent.getY());
                }
                if (C93949aZ7.LIZ(f6) < C93949aZ7.LIZIZ(Integer.valueOf(this.LJLIL.getBottom()))) {
                    C0CM c0cm2 = this.LJLIL;
                    c0cm2.setCurrentItem(c0cm2.getCurrentItem() + 1);
                }
            }
        }
        return true;
    }

    public GestureDetectorOnGestureListenerC93948aZ6(C0CM c0cm, C76732zl c76732zl, RecyclerView recyclerView) {
        this.LJLIL = c0cm;
        this.LJLILLLLZI = c76732zl;
        this.LJLJI = recyclerView;
    }
}
