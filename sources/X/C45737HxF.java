package X;

import Y.ALAdapterS1S0100000_2;
import Y.ARunnableS12S0101000_8;
import Y.AUListenerS66S0101000_2;
import Y.AUListenerS91S0100000_2;
import Y.IDRunnableS6S0101000;
import Y.IDrS46S0100000_7;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* renamed from: X.HxF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45737HxF extends LinearLayout {
    public int LJLIL;
    public FrameLayout LJLILLLLZI;
    public RecyclerView LJLJI;
    public TextView LJLJJI;
    public ViewGroup LJLJJL;
    public FrameLayout LJLJJLL;
    public TuxTextView LJLJL;
    public View LJLJLJ;
    public View LJLJLLL;
    public InterfaceC45740HxI LJLL;
    public InterfaceC45721Hwz LJLLI;
    public boolean LJLLILLLL;
    public String LJLLJ;
    public final IDRunnableS6S0101000 LJLLL;
    public boolean LJLLLL;
    public final RunnableC45739HxH LJLLLLLL;
    public final Interpolator LJLZ;
    public final IDrS46S0100000_7 LJZ;
    public float LJZI;
    public float LJZL;
    public long LL;

    private void setScrollBarStartTransX(float f) {
    }

    public final void LIZJ() {
        this.LJLJLLL.setVisibility(8);
        this.LJLJJI.setVisibility(4);
        ViewGroup.LayoutParams layoutParams = this.LJLILLLLZI.getLayoutParams();
        layoutParams.width = (int) KL2.LIZJ(C44172HVg.LIZ, 56.0f);
        this.LJLILLLLZI.setLayoutParams(layoutParams);
        this.LJLLILLLL = false;
    }

    public final void LIZLLL() {
        RecyclerView recyclerView;
        int i;
        if (this.LJLLI != null && (recyclerView = this.LJLJI) != null && recyclerView.getLayoutManager() != null) {
            InterfaceC45721Hwz interfaceC45721Hwz = this.LJLLI;
            C0A2 layoutManager = this.LJLJI.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                i = ((LinearLayoutManager) layoutManager).LLILL();
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                i = ((StaggeredGridLayoutManager) layoutManager).LLIL(null)[0];
            } else {
                i = 0;
            }
            String charSequence = interfaceC45721Hwz.LJLJJL(i).toString();
            if (!this.LJLJL.getText().equals(charSequence)) {
                this.LJLJL.setText(charSequence);
            }
        }
    }

    public C45737HxF(Context context) {
        super(context, null, 0);
        this.LJLLJ = "";
        this.LJLLL = new IDRunnableS6S0101000(8, this, 3);
        this.LJLLLL = false;
        this.LJLLLLLL = new RunnableC45739HxH();
        this.LJLZ = C18950ol.LIZIZ(0.25f, 0.0f, 0.25f, 1.0f);
        this.LJZ = new IDrS46S0100000_7(this, 1);
        this.LJZI = 0.0f;
        this.LJZL = 0.0f;
        this.LL = 0L;
        LinearLayout.inflate(context, R.layout.aut, this);
        setClipChildren(false);
        setOrientation(0);
        this.LJLJJI = (TextView) findViewById(R.id.d50);
        this.LJLILLLLZI = (FrameLayout) findViewById(R.id.d51);
        this.LJLJLLL = findViewById(R.id.d52);
        this.LJLJJL = (ViewGroup) findViewById(R.id.l84);
        this.LJLJJLL = (FrameLayout) findViewById(R.id.l83);
        this.LJLJL = (TuxTextView) findViewById(R.id.l87);
        this.LJLJLJ = findViewById(R.id.l86);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZJ = Float.valueOf(KL2.LIZJ(getContext(), 20.0f));
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.dj);
        this.LJLJJLL.setBackground(c110614Vt.LIZ(getContext()));
        C110614Vt c110614Vt2 = new C110614Vt();
        c110614Vt2.LIZJ = Float.valueOf(KL2.LIZJ(getContext(), 4.0f));
        c110614Vt2.LIZIZ = Integer.valueOf(R.attr.dk);
        this.LJLJLJ.setBackground(c110614Vt2.LIZ(getContext()));
        this.LJLJJI.setVisibility(8);
        this.LJLILLLLZI.setVisibility(8);
        this.LJLJJL.setVisibility(0);
        KL2.LJIIJJI(context);
        if (C173636rf.LIZIZ(context)) {
            this.LJLLLL = true;
        }
        setScrollBarStartTransX(56.0f);
    }

    private void setHandleSelected(boolean z) {
        this.LJLILLLLZI.setSelected(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void setRecyclerViewPosition(float r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r5.LJLJI
            if (r0 == 0) goto L81
            X.09q r0 = r0.getAdapter()
            if (r0 == 0) goto L81
            androidx.recyclerview.widget.RecyclerView r0 = r5.LJLJI
            X.0A2 r0 = r0.getLayoutManager()
            if (r0 == 0) goto L81
            androidx.recyclerview.widget.RecyclerView r0 = r5.LJLJI
            X.09q r0 = r0.getAdapter()
            int r4 = r0.getItemCount()
            android.view.ViewGroup r0 = r5.LJLJJL
            float r0 = r0.getY()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 != 0) goto L99
        L27:
            float r0 = (float) r4
            float r1 = r1 * r0
            int r2 = java.lang.Math.round(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r5.LJLJI
            X.0A2 r1 = r0.getLayoutManager()
            boolean r0 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            r3 = 0
            if (r0 == 0) goto L90
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            boolean r0 = r1.LL
        L3c:
            if (r0 == 0) goto L40
            int r2 = r4 - r2
        L40:
            int r1 = r4 + (-1)
            int r0 = java.lang.Math.max(r3, r2)
            int r1 = java.lang.Math.min(r0, r1)
            androidx.recyclerview.widget.RecyclerView r0 = r5.LJLJI
            X.0A2 r0 = r0.getLayoutManager()
            r0.LJZL(r1)
            r5.LIZLLL()
            X.Hwz r2 = r5.LJLLI
            if (r2 == 0) goto L81
            androidx.recyclerview.widget.RecyclerView r0 = r5.LJLJI
            X.0A2 r1 = r0.getLayoutManager()
            boolean r0 = r1 instanceof androidx.recyclerview.widget.LinearLayoutManager
            if (r0 == 0) goto L82
            androidx.recyclerview.widget.LinearLayoutManager r1 = (androidx.recyclerview.widget.LinearLayoutManager) r1
            int r3 = r1.LLILL()
        L6a:
            java.lang.CharSequence r0 = r2.LJLJJL(r3)
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = r5.LJLLJ
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L81
            r5.LJLLJ = r1
            android.widget.TextView r0 = r5.LJLJJI
            r0.setText(r1)
        L81:
            return
        L82:
            boolean r0 = r1 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r0 == 0) goto L6a
            androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r1
            r0 = 0
            int[] r0 = r1.LLIL(r0)
            r3 = r0[r3]
            goto L6a
        L90:
            boolean r0 = r1 instanceof androidx.recyclerview.widget.StaggeredGridLayoutManager
            if (r0 == 0) goto L40
            androidx.recyclerview.widget.StaggeredGridLayoutManager r1 = (androidx.recyclerview.widget.StaggeredGridLayoutManager) r1
            boolean r0 = r1.LLFF
            goto L3c
        L99:
            android.view.ViewGroup r0 = r5.LJLJJL
            float r2 = r0.getY()
            android.view.ViewGroup r0 = r5.LJLJJL
            int r0 = r0.getMeasuredHeight()
            float r0 = (float) r0
            float r2 = r2 + r0
            int r1 = r5.LJLIL
            int r0 = r1 + (-5)
            float r0 = (float) r0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto Lb4
            r1 = 1065353216(0x3f800000, float:1.0)
            goto L27
        Lb4:
            float r0 = (float) r1
            float r1 = r6 / r0
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45737HxF.setRecyclerViewPosition(float):void");
    }

    private void setViewPositions(float f) {
        float min = Math.min(Math.max(0, (int) (f - (r0 / 2))), this.LJLIL - this.LJLILLLLZI.getMeasuredHeight());
        this.LJLILLLLZI.setY(min);
        this.LJLJJI.setY(min);
    }

    public final void LIZ(RecyclerView recyclerView) {
        this.LJLJI = recyclerView;
        if (getParent() instanceof ViewGroup) {
            setLayoutParams((ViewGroup) getParent());
        } else if (recyclerView.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) recyclerView.getParent();
            viewGroup.addView(this);
            setLayoutParams(viewGroup);
        }
        recyclerView.LJIIJJI(this.LJZ);
        post(new ARunnableS12S0101000_8(6, this, 9));
    }

    public final float LIZIZ(RecyclerView recyclerView) {
        if (recyclerView == null) {
            return 0.0f;
        }
        this.LJLILLLLZI.getMeasuredHeight();
        int measuredHeight = this.LJLJJL.getMeasuredHeight();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        float computeVerticalScrollRange = (recyclerView.computeVerticalScrollRange() - this.LJLIL) + measuredHeight;
        float f = computeVerticalScrollOffset;
        if (computeVerticalScrollRange <= 0.0f) {
            computeVerticalScrollRange = 1.0f;
        }
        float f2 = f / computeVerticalScrollRange;
        if (this.LJLLILLLL) {
            getHandler().removeCallbacks(this.LJLLL);
            this.LJLJJL.clearAnimation();
        }
        View view = this.LJLJLLL;
        if (view == null || view.getVisibility() != 0) {
            this.LJLJLLL.setAlpha(0.0f);
            this.LJLJLLL.setVisibility(0);
            this.LJLLILLLL = false;
            this.LJLJJL.setAlpha(0.0f);
            this.LJLJLLL.setTranslationX(0.0f);
            this.LJLJLLL.setAlpha(1.0f);
            this.LJLJJL.setVisibility(0);
            this.LJLJJL.animate().alpha(1.0f).setListener(null).setDuration(200L).start();
        }
        return (measuredHeight / 2.0f) + ((this.LJLIL - measuredHeight) * f2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int i;
        int i2;
        int measuredWidth;
        int measuredHeight;
        float f;
        int action = motionEvent.getAction();
        Integer valueOf = Integer.valueOf(R.attr.dj);
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return super.onTouchEvent(motionEvent);
                    }
                }
            }
            requestDisallowInterceptTouchEvent(false);
            this.LJLJJL.setSelected(false);
            this.LJLJJLL.animate().setInterpolator(this.LJLZ).translationX(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(200L).start();
            C110614Vt c110614Vt = new C110614Vt();
            c110614Vt.LIZJ = Float.valueOf(KL2.LIZJ(getContext(), 20.0f));
            c110614Vt.LIZIZ = valueOf;
            this.LJLJJLL.setBackground(c110614Vt.LIZ(getContext()));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.LJLJLJ.getMeasuredWidth(), KL2.LIZJ(C44172HVg.LIZ, 3.0f));
            ofFloat.setInterpolator(this.LJLZ);
            ofFloat.setDuration(200L);
            ofFloat.addUpdateListener(new AUListenerS66S0101000_2(0, this, 1));
            ofFloat.addListener(new ALAdapterS1S0100000_2(this, 18));
            ofFloat.start();
            if (Math.abs(motionEvent.getY() - this.LJZI) > 10.0f) {
                this.LJLL.LJJLIIIJ();
            }
            InterfaceC45740HxI interfaceC45740HxI = this.LJLL;
            if (interfaceC45740HxI != null) {
                interfaceC45740HxI.LJJLIIIIJ(true);
            }
            if (W5I.LIZ().LJIIJ()) {
                getHandler().removeCallbacks(this.LJLLLLLL);
                W5I.LIZ().LJIILL();
            }
            return true;
        }
        View view = this.LJLJLLL;
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        this.LJZI = motionEvent.getY();
        this.LJZL = this.LJLJJL.getY();
        int[] iArr = new int[2];
        this.LJLJJLL.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        this.LJLJLJ.getLocationOnScreen(iArr2);
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        if (this.LJLLLL) {
            i = iArr2[0];
            i2 = iArr2[1];
            measuredWidth = this.LJLJJLL.getMeasuredWidth() + iArr[0];
            measuredHeight = this.LJLJJLL.getMeasuredHeight() + iArr[1];
        } else {
            i = iArr[0];
            i2 = iArr[1];
            measuredWidth = this.LJLJLJ.getMeasuredWidth() + iArr2[0];
            measuredHeight = this.LJLJLJ.getMeasuredHeight() + iArr2[1];
        }
        if (rawY < i2 || rawY > measuredHeight || rawX < i || rawX > measuredWidth || this.LJLLILLLL) {
            return false;
        }
        requestDisallowInterceptTouchEvent(true);
        this.LJLJJL.setSelected(true);
        getHandler().removeCallbacks(this.LJLLL);
        if (this.LJLLLL) {
            f = KL2.LIZJ(getContext(), 56.0f);
        } else {
            f = -KL2.LIZJ(getContext(), 56.0f);
        }
        this.LJLJJLL.animate().setInterpolator(this.LJLZ).translationX(f).scaleX(1.25f).scaleY(1.25f).setDuration(200L).start();
        C110614Vt c110614Vt2 = new C110614Vt();
        c110614Vt2.LIZJ = Float.valueOf(KL2.LIZJ(getContext(), 25.0f));
        c110614Vt2.LIZIZ = valueOf;
        this.LJLJJLL.setBackground(c110614Vt2.LIZ(getContext()));
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(KL2.LIZJ(C44172HVg.LIZ, 3.0f), KL2.LIZJ(C44172HVg.LIZ, 4.0f));
        ofFloat2.setInterpolator(this.LJLZ);
        ofFloat2.setDuration(200L);
        ofFloat2.addUpdateListener(new AUListenerS91S0100000_2(this, 39));
        ofFloat2.addListener(new ALAdapterS1S0100000_2(this, 17));
        ofFloat2.start();
        if (!W5I.LIZ().LJIIJ()) {
            W5I.LIZ().LJIIJJI();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.LL < 50) {
            getHandler().removeCallbacks(this.LJLLLLLL);
        }
        this.LL = currentTimeMillis;
        getHandler().postDelayed(this.LJLLLLLL, 50L);
        float y = motionEvent.getY();
        float measuredHeight2 = (this.LJLJJL.getMeasuredHeight() / 2.0f) + (y - this.LJZI) + this.LJZL;
        setTimeLineViewsPosition(measuredHeight2);
        if (Math.abs(y - this.LJZI) > 10.0f) {
            setRecyclerViewPosition(measuredHeight2);
        }
        return true;
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        int i;
        super.setEnabled(z);
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
    }

    public void setFastScrollListener(InterfaceC45740HxI interfaceC45740HxI) {
        this.LJLL = interfaceC45740HxI;
    }

    public void setLayoutParams(ViewGroup viewGroup) {
        RecyclerView recyclerView = this.LJLJI;
        if (recyclerView != null && recyclerView.getId() != -1) {
            if (viewGroup instanceof FrameLayout) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getLayoutParams();
                layoutParams.height = -1;
                layoutParams.gravity = 8388613;
                layoutParams.setMargins(0, 0, 0, 0);
                setLayoutParams(layoutParams);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.LJLJJI.measure(makeMeasureSpec, makeMeasureSpec);
                this.LJLILLLLZI.measure(makeMeasureSpec, makeMeasureSpec);
                this.LJLILLLLZI.getMeasuredHeight();
                this.LJLJJL.measure(makeMeasureSpec, makeMeasureSpec);
                return;
            }
            throw new IllegalArgumentException("Parent ViewGroup must be a ConstraintLayout, CoordinatorLayout, FrameLayout, or RelativeLayout");
        }
        throw new IllegalArgumentException("RecyclerView must have a view ID");
    }

    public void setSectionIndexer(InterfaceC45721Hwz interfaceC45721Hwz) {
        this.LJLLI = interfaceC45721Hwz;
    }

    public void setTimeLineViewsPosition(float f) {
        int measuredHeight = this.LJLJJL.getMeasuredHeight();
        this.LJLJJL.setY(Math.min(Math.max(0, (int) (f - (measuredHeight / 2))), this.LJLIL - measuredHeight));
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        layoutParams.width = -1;
        super.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LJLIL = i2;
    }
}
