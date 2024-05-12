package X;

import Y.IDRunnableS85S0100000;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1C8, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1C8 extends AbstractC030309z implements C0A3 {
    public float LJLJJI;
    public float LJLJJL;
    public float LJLJJLL;
    public float LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public float LJLL;
    public float LJLLI;
    public final C0B4 LJLLJ;
    public int LJLLLL;
    public int LJLZ;
    public RecyclerView LJZ;
    public VelocityTracker LJZL;
    public List<RecyclerView.ViewHolder> LL;
    public List<Integer> LLD;
    public C16230kN LLFF;
    public C0B5 LLFFF;
    public Rect LLFZ;
    public long LLI;
    public final List<View> LJLIL = new ArrayList();
    public final float[] LJLILLLLZI = new float[2];
    public RecyclerView.ViewHolder LJLJI = null;
    public int LJLLILLLL = -1;
    public int LJLLL = 0;
    public final List<C0B6> LJLLLLLL = new ArrayList();
    public final IDRunnableS85S0100000 LJZI = new IDRunnableS85S0100000(this, 28);
    public View LLF = null;
    public final C1C1 LLFII = new C0A5() { // from class: X.1C1
        @Override // X.C0A5
        public final void LIZIZ(boolean z) {
            if (!z) {
                return;
            }
            C1C8.this.LJIJ(null, 0);
        }

        @Override // X.C0A5
        public final void LIZ(RecyclerView recyclerView, MotionEvent motionEvent) {
            C1C8.this.LLFF.LIZ(motionEvent);
            VelocityTracker velocityTracker = C1C8.this.LJZL;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (C1C8.this.LJLLILLLL == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int findPointerIndex = motionEvent.findPointerIndex(C1C8.this.LJLLILLLL);
            if (findPointerIndex >= 0) {
                C1C8.this.LJIIIZ(actionMasked, findPointerIndex, motionEvent);
            }
            C1C8 c1c8 = C1C8.this;
            RecyclerView.ViewHolder viewHolder = c1c8.LJLJI;
            if (viewHolder == null) {
                return;
            }
            int i = 1;
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 6) {
                            return;
                        }
                        int actionIndex = motionEvent.getActionIndex();
                        int pointerId = motionEvent.getPointerId(actionIndex);
                        C1C8 c1c82 = C1C8.this;
                        if (pointerId != c1c82.LJLLILLLL) {
                            return;
                        }
                        if (actionIndex != 0) {
                            i = 0;
                        }
                        c1c82.LJLLILLLL = motionEvent.getPointerId(i);
                        C1C8 c1c83 = C1C8.this;
                        c1c83.LJIJJ(c1c83.LJLLLL, actionIndex, motionEvent);
                        return;
                    }
                    VelocityTracker velocityTracker2 = c1c8.LJZL;
                    if (velocityTracker2 != null) {
                        velocityTracker2.clear();
                    }
                } else {
                    if (findPointerIndex < 0) {
                        return;
                    }
                    c1c8.LJIJJ(c1c8.LJLLLL, findPointerIndex, motionEvent);
                    C1C8.this.LJIILLIIL(viewHolder);
                    C1C8 c1c84 = C1C8.this;
                    c1c84.LJZ.removeCallbacks(c1c84.LJZI);
                    C1C8.this.LJZI.run();
                    C1C8.this.LJZ.invalidate();
                    return;
                }
            }
            C1C8.this.LJIJ(null, 0);
            C1C8.this.LJLLILLLL = -1;
        }

        @Override // X.C0A5
        public final boolean LIZJ(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            C1C8.this.LLFF.LIZ(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                C1C8.this.LJLLILLLL = motionEvent.getPointerId(0);
                C1C8.this.LJLJJI = motionEvent.getX();
                C1C8.this.LJLJJL = motionEvent.getY();
                C1C8 c1c8 = C1C8.this;
                VelocityTracker velocityTracker = c1c8.LJZL;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                c1c8.LJZL = VelocityTracker.obtain();
                C1C8 c1c82 = C1C8.this;
                if (c1c82.LJLJI == null && !((ArrayList) c1c82.LJLLLLLL).isEmpty()) {
                    View LJIIL = c1c82.LJIIL(motionEvent);
                    int size = ((ArrayList) c1c82.LJLLLLLL).size() - 1;
                    while (true) {
                        if (size < 0) {
                            break;
                        }
                        C0B6 c0b6 = (C0B6) ListProtector.get(c1c82.LJLLLLLL, size);
                        if (c0b6.LJLJJL.itemView == LJIIL) {
                            C1C8 c1c83 = C1C8.this;
                            c1c83.LJLJJI -= c0b6.LJLJLLL;
                            c1c83.LJLJJL -= c0b6.LJLL;
                            c1c83.LJIIJJI(c0b6.LJLJJL, true);
                            if (((ArrayList) C1C8.this.LJLIL).remove(c0b6.LJLJJL.itemView)) {
                                C1C8 c1c84 = C1C8.this;
                                c1c84.LJLLJ.LIZIZ(c1c84.LJZ, c0b6.LJLJJL);
                            }
                            C1C8.this.LJIJ(c0b6.LJLJJL, c0b6.LJLJJLL);
                            C1C8 c1c85 = C1C8.this;
                            c1c85.LJIJJ(c1c85.LJLLLL, 0, motionEvent);
                        } else {
                            size--;
                        }
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                C1C8 c1c86 = C1C8.this;
                c1c86.LJLLILLLL = -1;
                c1c86.LJIJ(null, 0);
            } else {
                int i = C1C8.this.LJLLILLLL;
                if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    C1C8.this.LJIIIZ(actionMasked, findPointerIndex, motionEvent);
                }
            }
            VelocityTracker velocityTracker2 = C1C8.this.LJZL;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (C1C8.this.LJLJI != null) {
                return true;
            }
            return false;
        }
    };

    @Override // X.C0A3
    public final void LJJIFFI(View view) {
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.1C1] */
    public C1C8(C0B4 c0b4) {
        this.LJLLJ = c0b4;
    }

    public final void LJII(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.LJZ;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.LJJLIL(this);
            this.LJZ.LJJLJLI(this.LLFII);
            List<C0A3> list = this.LJZ.LLIFFJFJJ;
            if (list != null) {
                ((ArrayList) list).remove(this);
            }
            for (int size = ((ArrayList) this.LJLLLLLL).size() - 1; size >= 0; size--) {
                C0B6 c0b6 = (C0B6) ListProtector.get(this.LJLLLLLL, 0);
                c0b6.LJLJL.cancel();
                this.LJLLJ.LIZIZ(this.LJZ, c0b6.LJLJJL);
            }
            ((ArrayList) this.LJLLLLLL).clear();
            this.LLF = null;
            VelocityTracker velocityTracker = this.LJZL;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.LJZL = null;
            }
            C0B5 c0b5 = this.LLFFF;
            if (c0b5 != null) {
                c0b5.LJLIL = false;
                this.LLFFF = null;
            }
            if (this.LLFF != null) {
                this.LLFF = null;
            }
        }
        this.LJZ = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.LJLJJLL = resources.getDimension(R.dimen.vx);
            this.LJLJL = resources.getDimension(R.dimen.vw);
            this.LJLZ = ViewConfiguration.get(this.LJZ.getContext()).getScaledTouchSlop();
            this.LJZ.LJII(this, -1);
            this.LJZ.LJIIJ(this.LLFII);
            this.LJZ.LJIIIZ(this);
            this.LLFFF = new C0B5(this);
            this.LLFF = new C16230kN(this.LJZ.getContext(), this.LLFFF);
        }
    }

    public final View LJIIL(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.ViewHolder viewHolder = this.LJLJI;
        if (viewHolder != null) {
            View view = viewHolder.itemView;
            if (LJIILL(view, x, y, this.LJLL + this.LJLJLJ, this.LJLLI + this.LJLJLLL)) {
                return view;
            }
        }
        for (int size = ((ArrayList) this.LJLLLLLL).size() - 1; size >= 0; size--) {
            C0B6 c0b6 = (C0B6) ListProtector.get(this.LJLLLLLL, size);
            View view2 = c0b6.LJLJJL.itemView;
            if (LJIILL(view2, x, y, c0b6.LJLJLLL, c0b6.LJLL)) {
                return view2;
            }
        }
        return this.LJZ.LJJIJIIJI(x, y);
    }

    @Override // X.C0A3
    public final void LJIILIIL(View view) {
        LJIIZILJ(view);
        RecyclerView.ViewHolder LJJJJJL = this.LJZ.LJJJJJL(view);
        if (LJJJJJL == null) {
            return;
        }
        RecyclerView.ViewHolder viewHolder = this.LJLJI;
        if (viewHolder != null && LJJJJJL == viewHolder) {
            LJIJ(null, 0);
            return;
        }
        LJIIJJI(LJJJJJL, false);
        if (!((ArrayList) this.LJLIL).remove(LJJJJJL.itemView)) {
            return;
        }
        this.LJLLJ.LIZIZ(this.LJZ, LJJJJJL);
    }

    public final void LJIILJJIL(float[] fArr) {
        if ((this.LJLLLL & 12) != 0) {
            fArr[0] = (this.LJLL + this.LJLJLJ) - this.LJLJI.itemView.getLeft();
        } else {
            fArr[0] = this.LJLJI.itemView.getTranslationX();
        }
        if ((this.LJLLLL & 3) != 0) {
            fArr[1] = (this.LJLLI + this.LJLJLLL) - this.LJLJI.itemView.getTop();
        } else {
            fArr[1] = this.LJLJI.itemView.getTranslationY();
        }
    }

    public final void LJIILLIIL(RecyclerView.ViewHolder viewHolder) {
        if (this.LJZ.isLayoutRequested() || this.LJLLL != 2) {
            return;
        }
        float LIZLLL = this.LJLLJ.LIZLLL(viewHolder);
        int i = (int) (this.LJLL + this.LJLJLJ);
        int i2 = (int) (this.LJLLI + this.LJLJLLL);
        if (Math.abs(i2 - viewHolder.itemView.getTop()) < viewHolder.itemView.getHeight() * LIZLLL && Math.abs(i - viewHolder.itemView.getLeft()) < viewHolder.itemView.getWidth() * LIZLLL) {
            return;
        }
        List<RecyclerView.ViewHolder> list = this.LL;
        if (list == null) {
            this.LL = new ArrayList();
            this.LLD = new ArrayList();
        } else {
            ((ArrayList) list).clear();
            ((ArrayList) this.LLD).clear();
        }
        this.LJLLJ.getClass();
        int round = Math.round(this.LJLL + this.LJLJLJ);
        int round2 = Math.round(this.LJLLI + this.LJLJLLL);
        int width = viewHolder.itemView.getWidth() + round;
        int height = viewHolder.itemView.getHeight() + round2;
        int i3 = (round + width) / 2;
        int i4 = (round2 + height) / 2;
        C0A2 layoutManager = this.LJZ.getLayoutManager();
        int LJJJI = layoutManager.LJJJI();
        for (int i5 = 0; i5 < LJJJI; i5++) {
            View LJJJ = layoutManager.LJJJ(i5);
            if (LJJJ != viewHolder.itemView && LJJJ.getBottom() >= round2 && LJJJ.getTop() <= height && LJJJ.getRight() >= round && LJJJ.getLeft() <= width) {
                RecyclerView.ViewHolder LJJJJJL = this.LJZ.LJJJJJL(LJJJ);
                this.LJLLJ.getClass();
                int abs = Math.abs(i3 - ((LJJJ.getRight() + LJJJ.getLeft()) / 2));
                int abs2 = Math.abs(i4 - ((LJJJ.getBottom() + LJJJ.getTop()) / 2));
                int i6 = (abs2 * abs2) + (abs * abs);
                int size = ((ArrayList) this.LL).size();
                int i7 = 0;
                for (int i8 = 0; i8 < size && i6 > ((Integer) ListProtector.get(this.LLD, i8)).intValue(); i8++) {
                    i7++;
                }
                ListProtector.add(this.LL, i7, LJJJJJL);
                ListProtector.add(this.LLD, i7, Integer.valueOf(i6));
            }
        }
        ArrayList arrayList = (ArrayList) this.LL;
        if (arrayList.size() == 0) {
            return;
        }
        RecyclerView.ViewHolder LIZ = this.LJLLJ.LIZ(viewHolder, arrayList, i, i2);
        if (LIZ == null) {
            ((ArrayList) this.LL).clear();
            ((ArrayList) this.LLD).clear();
            return;
        }
        int absoluteAdapterPosition = LIZ.getAbsoluteAdapterPosition();
        int absoluteAdapterPosition2 = viewHolder.getAbsoluteAdapterPosition();
        if (this.LJLLJ.LJIIL(this.LJZ, viewHolder, LIZ)) {
            this.LJLLJ.LJIILIIL(this.LJZ, viewHolder, absoluteAdapterPosition2, LIZ, absoluteAdapterPosition, i, i2);
        }
    }

    public final void LJIIZILJ(View view) {
        if (view == this.LLF) {
            this.LLF = null;
        }
    }

    public final void LJIJI(RecyclerView.ViewHolder viewHolder) {
        int i;
        C0B4 c0b4 = this.LJLLJ;
        RecyclerView recyclerView = this.LJZ;
        int LJ = c0b4.LJ(recyclerView, viewHolder);
        int LIZLLL = C16310kV.LIZLLL(recyclerView);
        int i2 = LJ & 3158064;
        if (i2 != 0) {
            int i3 = LJ & (~i2);
            if (LIZLLL == 0) {
                i = i2 >> 2;
            } else {
                int i4 = i2 >> 1;
                i3 |= (-3158065) & i4;
                i = (i4 & 3158064) >> 2;
            }
            LJ = i3 | i;
        }
        if ((LJ & 16711680) == 0 || viewHolder.itemView.getParent() != this.LJZ) {
            return;
        }
        VelocityTracker velocityTracker = this.LJZL;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.LJZL = VelocityTracker.obtain();
        this.LJLJLLL = 0.0f;
        this.LJLJLJ = 0.0f;
        LJIJ(viewHolder, 2);
    }

    public final int LJIIIIZZ(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        if ((i & 12) != 0) {
            int i3 = 4;
            if (this.LJLJLJ > 0.0f) {
                i2 = 8;
            } else {
                i2 = 4;
            }
            VelocityTracker velocityTracker = this.LJZL;
            if (velocityTracker != null && this.LJLLILLLL > -1) {
                C0B4 c0b4 = this.LJLLJ;
                float f = this.LJLJL;
                c0b4.getClass();
                velocityTracker.computeCurrentVelocity(1000, f);
                float xVelocity = this.LJZL.getXVelocity(this.LJLLILLLL);
                float yVelocity = this.LJZL.getYVelocity(this.LJLLILLLL);
                if (xVelocity > 0.0f) {
                    i3 = 8;
                }
                float abs = Math.abs(xVelocity);
                if ((i3 & i) != 0 && i2 == i3) {
                    C0B4 c0b42 = this.LJLLJ;
                    float f2 = this.LJLJJLL;
                    c0b42.getClass();
                    if (abs >= f2 && abs > Math.abs(yVelocity)) {
                        return i3;
                    }
                }
            }
            float LJFF = this.LJLLJ.LJFF(viewHolder) * this.LJZ.getWidth();
            if ((i & i2) != 0 && Math.abs(this.LJLJLJ) > LJFF) {
                return i2;
            }
            return 0;
        }
        return 0;
    }

    public final int LJIIJ(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        if ((i & 3) != 0) {
            int i3 = 1;
            if (this.LJLJLLL > 0.0f) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            VelocityTracker velocityTracker = this.LJZL;
            if (velocityTracker != null && this.LJLLILLLL > -1) {
                C0B4 c0b4 = this.LJLLJ;
                float f = this.LJLJL;
                c0b4.getClass();
                velocityTracker.computeCurrentVelocity(1000, f);
                float xVelocity = this.LJZL.getXVelocity(this.LJLLILLLL);
                float yVelocity = this.LJZL.getYVelocity(this.LJLLILLLL);
                if (yVelocity > 0.0f) {
                    i3 = 2;
                }
                float abs = Math.abs(yVelocity);
                if ((i3 & i) != 0 && i3 == i2) {
                    C0B4 c0b42 = this.LJLLJ;
                    float f2 = this.LJLJJLL;
                    c0b42.getClass();
                    if (abs >= f2 && abs > Math.abs(xVelocity)) {
                        return i3;
                    }
                }
            }
            float LJFF = this.LJLLJ.LJFF(viewHolder) * this.LJZ.getHeight();
            if ((i & i2) != 0 && Math.abs(this.LJLJLLL) > LJFF) {
                return i2;
            }
            return 0;
        }
        return 0;
    }

    public final void LJIIJJI(RecyclerView.ViewHolder viewHolder, boolean z) {
        C0B6 c0b6;
        int size = ((ArrayList) this.LJLLLLLL).size();
        do {
            size--;
            if (size >= 0) {
                c0b6 = (C0B6) ListProtector.get(this.LJLLLLLL, size);
            } else {
                return;
            }
        } while (c0b6.LJLJJL != viewHolder);
        c0b6.LJLLI |= z;
        if (!c0b6.LJLLILLLL) {
            c0b6.LJLJL.cancel();
        }
        ListProtector.remove(this.LJLLLLLL, size);
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x01de, code lost:
    
        if (r1 == 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x01d4, code lost:
    
        r1 = r12 << 1;
        r6 = r6 | (r1 & (-789517));
        r1 = (r1 & 789516) << 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01e2, code lost:
    
        r6 = r1 | r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01e0, code lost:
    
        r1 = r12 << 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01ae, code lost:
    
        if (r6 > 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01d1, code lost:
    
        if (r1 == 0) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJ(androidx.recyclerview.widget.RecyclerView.ViewHolder r31, int r32) {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1C8.LJIJ(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
    }

    @Override // X.AbstractC030309z
    public final void LJFF(Canvas canvas, RecyclerView recyclerView, C0AC c0ac) {
        float f;
        float f2;
        if (this.LJLJI != null) {
            LJIILJJIL(this.LJLILLLLZI);
            float[] fArr = this.LJLILLLLZI;
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        C0B4 c0b4 = this.LJLLJ;
        RecyclerView.ViewHolder viewHolder = this.LJLJI;
        List<C0B6> list = this.LJLLLLLL;
        int i = this.LJLLL;
        c0b4.getClass();
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0B6 c0b6 = (C0B6) ListProtector.get(arrayList, i2);
            float f3 = c0b6.LJLIL;
            float f4 = c0b6.LJLJI;
            if (f3 == f4) {
                c0b6.LJLJLLL = c0b6.LJLJJL.itemView.getTranslationX();
            } else {
                c0b6.LJLJLLL = C06420Na.LIZIZ(f4, f3, c0b6.LJLLJ, f3);
            }
            float f5 = c0b6.LJLILLLLZI;
            float f6 = c0b6.LJLJJI;
            if (f5 == f6) {
                c0b6.LJLL = c0b6.LJLJJL.itemView.getTranslationY();
            } else {
                c0b6.LJLL = C06420Na.LIZIZ(f6, f5, c0b6.LJLLJ, f5);
            }
            int save = canvas.save();
            c0b4.LJIIJ(canvas, recyclerView, c0b6.LJLJJL, c0b6.LJLJLLL, c0b6.LJLL, c0b6.LJLJJLL, false);
            canvas.restoreToCount(save);
        }
        if (viewHolder != null) {
            int save2 = canvas.save();
            c0b4.LJIIJ(canvas, recyclerView, viewHolder, f, f2, i, true);
            canvas.restoreToCount(save2);
        }
    }

    @Override // X.AbstractC030309z
    public final void LJI(Canvas canvas, RecyclerView recyclerView, C0AC c0ac) {
        float f;
        float f2;
        if (this.LJLJI != null) {
            LJIILJJIL(this.LJLILLLLZI);
            float[] fArr = this.LJLILLLLZI;
            f = fArr[0];
            f2 = fArr[1];
        } else {
            f = 0.0f;
            f2 = 0.0f;
        }
        C0B4 c0b4 = this.LJLLJ;
        RecyclerView.ViewHolder viewHolder = this.LJLJI;
        List<C0B6> list = this.LJLLLLLL;
        int i = this.LJLLL;
        c0b4.getClass();
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0B6 c0b6 = (C0B6) ListProtector.get(arrayList, i2);
            int save = canvas.save();
            c0b4.LJIIJJI(canvas, recyclerView, c0b6.LJLJJL, c0b6.LJLJLLL, c0b6.LJLL, c0b6.LJLJJLL, false);
            canvas.restoreToCount(save);
        }
        if (viewHolder != null) {
            int save2 = canvas.save();
            c0b4.LJIIJJI(canvas, recyclerView, viewHolder, f, f2, i, true);
            canvas.restoreToCount(save2);
        }
        boolean z = false;
        for (int i3 = size - 1; i3 >= 0; i3--) {
            C0B6 c0b62 = (C0B6) ListProtector.get(arrayList, i3);
            if (c0b62.LJLLILLLL) {
                if (!c0b62.LJLJLJ) {
                    ListProtector.remove(arrayList, i3);
                }
            } else {
                z = true;
            }
        }
        if (z) {
            recyclerView.invalidate();
        }
    }

    public final void LJIIIZ(int i, int i2, MotionEvent motionEvent) {
        View LJIIL;
        RecyclerView.ViewHolder LJJJJJL;
        int i3;
        if (this.LJLJI != null || i != 2 || this.LJLLL == 2 || !this.LJLLJ.LJII() || this.LJZ.getScrollState() == 1) {
            return;
        }
        C0A2 layoutManager = this.LJZ.getLayoutManager();
        int i4 = this.LJLLILLLL;
        if (i4 == -1) {
            return;
        }
        int findPointerIndex = motionEvent.findPointerIndex(i4);
        float x = motionEvent.getX(findPointerIndex) - this.LJLJJI;
        float y = motionEvent.getY(findPointerIndex) - this.LJLJJL;
        float abs = Math.abs(x);
        float abs2 = Math.abs(y);
        float f = this.LJLZ;
        if (abs < f && abs2 < f) {
            return;
        }
        if (abs > abs2 && layoutManager.LJIJJLI()) {
            return;
        }
        if ((abs2 > abs && layoutManager.LJIL()) || (LJIIL = LJIIL(motionEvent)) == null || (LJJJJJL = this.LJZ.LJJJJJL(LJIIL)) == null) {
            return;
        }
        C0B4 c0b4 = this.LJLLJ;
        RecyclerView recyclerView = this.LJZ;
        int LJ = c0b4.LJ(recyclerView, LJJJJJL);
        int LIZLLL = C16310kV.LIZLLL(recyclerView);
        int i5 = LJ & 3158064;
        if (i5 != 0) {
            int i6 = LJ & (~i5);
            if (LIZLLL == 0) {
                i3 = i5 >> 2;
            } else {
                int i7 = i5 >> 1;
                i6 |= (-3158065) & i7;
                i3 = (i7 & 3158064) >> 2;
            }
            LJ = i6 | i3;
        }
        int i8 = (LJ & 65280) >> 8;
        if (i8 == 0) {
            return;
        }
        float x2 = motionEvent.getX(i2);
        float y2 = motionEvent.getY(i2);
        float f2 = x2 - this.LJLJJI;
        float f3 = y2 - this.LJLJJL;
        float abs3 = Math.abs(f2);
        float abs4 = Math.abs(f3);
        float f4 = this.LJLZ;
        if (abs3 < f4 && abs4 < f4) {
            return;
        }
        if (abs3 > abs4) {
            if (f2 < 0.0f && (i8 & 4) == 0) {
                return;
            }
            if (f2 > 0.0f && (i8 & 8) == 0) {
                return;
            }
        } else {
            if (f3 < 0.0f && (i8 & 1) == 0) {
                return;
            }
            if (f3 > 0.0f && (i8 & 2) == 0) {
                return;
            }
        }
        this.LJLJLLL = 0.0f;
        this.LJLJLJ = 0.0f;
        this.LJLLILLLL = motionEvent.getPointerId(0);
        LJIJ(LJJJJJL, 1);
    }

    public final void LJIJJ(int i, int i2, MotionEvent motionEvent) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f = x - this.LJLJJI;
        this.LJLJLJ = f;
        this.LJLJLLL = y - this.LJLJJL;
        if ((i & 4) == 0) {
            this.LJLJLJ = Math.max(0.0f, f);
        }
        if ((i & 8) == 0) {
            this.LJLJLJ = Math.min(0.0f, this.LJLJLJ);
        }
        if ((i & 1) == 0) {
            this.LJLJLLL = Math.max(0.0f, this.LJLJLLL);
        }
        if ((i & 2) == 0) {
            this.LJLJLLL = Math.min(0.0f, this.LJLJLLL);
        }
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        rect.setEmpty();
    }

    public static boolean LJIILL(View view, float f, float f2, float f3, float f4) {
        if (f >= f3 && f <= f3 + view.getWidth() && f2 >= f4 && f2 <= f4 + view.getHeight()) {
            return true;
        }
        return false;
    }
}
