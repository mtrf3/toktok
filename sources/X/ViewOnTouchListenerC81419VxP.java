package X;

import Y.ALAdapterS11S0100000_14;
import Y.AUListenerS101S0100000_14;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Scroller;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.VxP, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class ViewOnTouchListenerC81419VxP extends FrameLayout implements View.OnTouchListener {
    public int LJLIL;
    public int LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJI;
    public List<Integer> LJLJJL;
    public Scroller LJLJJLL;
    public LinearLayout LJLJL;
    public GestureDetector LJLJLJ;
    public InterfaceC81422VxS LJLJLLL;
    public InterfaceC81423VxT LJLL;
    public final C81977WFh LJLLI;
    public InterfaceC81421VxR LJLLILLLL;
    public int LJLLJ;
    public float LJLLL;
    public float LJLLLL;
    public float LJLLLLLL;
    public float LJLZ;
    public View LJZ;
    public int LJZI;
    public int LJZL;
    public final int LL;
    public boolean LLD;
    public Paint LLF;
    public float LLFF;
    public float LLFFF;
    public float LLFII;
    public float LLFZ;
    public int LLI;
    public int LLIFFJFJJ;
    public int LLII;
    public int LLIIII;
    public int LLIIIILZ;

    public void setOnInterceptIndexChangedListener(InterfaceC81424VxU interfaceC81424VxU) {
    }

    public void setTouchEventWrapper(InterfaceC81425VxV interfaceC81425VxV) {
    }

    static {
        C16880lQ.LJLLJ(ViewOnTouchListenerC81419VxP.class);
    }

    public final int LIZIZ() {
        boolean z;
        int i;
        if (this.LJLLL < this.LJLLLL) {
            z = true;
        } else {
            z = false;
        }
        float scrollX = this.LJLJL.getScrollX() + ((Integer) ListProtector.get(this.LJLJJL, 0)).intValue();
        int size = ((ArrayList) this.LJLJJL).size();
        if (z) {
            i = 0;
            for (int i2 = size - 1; i2 >= 0; i2--) {
                if (((Integer) ListProtector.get(this.LJLJJL, i2)).intValue() < scrollX) {
                    return i2;
                }
                i = i2;
            }
        } else {
            i = 0;
            for (int i3 = 0; i3 < size; i3++) {
                if (((Integer) ListProtector.get(this.LJLJJL, i3)).intValue() >= scrollX) {
                    return i3;
                }
                i = i3;
            }
        }
        return i;
    }

    public final int LIZJ() {
        boolean z;
        int i;
        if (this.LJLLL < this.LJLLLL) {
            z = true;
        } else {
            z = false;
        }
        float scrollX = this.LJLJL.getScrollX() + ((Integer) ListProtector.get(this.LJLJJL, 0)).intValue();
        int size = ((ArrayList) this.LJLJJL).size();
        if (z) {
            i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                if (((Integer) ListProtector.get(this.LJLJJL, i2)).intValue() < scrollX) {
                    return i2;
                }
                i = i2;
            }
        } else {
            i = 0;
            for (int i3 = size - 1; i3 >= 0; i3--) {
                if (((Integer) ListProtector.get(this.LJLJJL, i3)).intValue() >= scrollX) {
                    return i3;
                }
                i = i3;
            }
        }
        return i;
    }

    public final void LJI() {
        int i;
        int i2;
        if (!this.LLD) {
            return;
        }
        if (C173636rf.LIZIZ(getContext())) {
            int LIZJ = LIZJ();
            if (LIZJ >= 0 && LIZJ < ((ArrayList) this.LJLJJL).size()) {
                int intValue = (((Integer) ListProtector.get(this.LJLJJL, 0)).intValue() + this.LJLJL.getScrollX()) - ((Integer) ListProtector.get(this.LJLJJL, LIZJ)).intValue();
                this.LLI = intValue;
                if (LIZJ != 0 || intValue < 0) {
                    if (LIZJ == ((ArrayList) this.LJLJJL).size() - 1 && this.LLI <= 0) {
                        return;
                    }
                    if (this.LLI < 0) {
                        i2 = LIZJ + 1;
                    } else {
                        i2 = LIZJ - 1;
                    }
                    if (i2 < 0 || i2 >= ((ArrayList) this.LJLJJL).size()) {
                        return;
                    }
                    LIZ(LIZJ, i2);
                    return;
                }
                return;
            }
            return;
        }
        int LIZIZ = LIZIZ();
        if (LIZIZ < 0 || LIZIZ >= ((ArrayList) this.LJLJJL).size()) {
            return;
        }
        int intValue2 = (((Integer) ListProtector.get(this.LJLJJL, 0)).intValue() + this.LJLJL.getScrollX()) - ((Integer) ListProtector.get(this.LJLJJL, LIZIZ)).intValue();
        this.LLI = intValue2;
        if (LIZIZ == 0 && intValue2 <= 0) {
            return;
        }
        if (LIZIZ == ((ArrayList) this.LJLJJL).size() - 1 && this.LLI >= 0) {
            return;
        }
        if (this.LLI < 0) {
            i = LIZIZ - 1;
        } else {
            i = LIZIZ + 1;
        }
        if (i < 0 || i >= ((ArrayList) this.LJLJJL).size()) {
            return;
        }
        LIZ(LIZIZ, i);
    }

    public int getTabCount() {
        LinearLayout linearLayout = this.LJLJL;
        if (linearLayout == null) {
            return 0;
        }
        return linearLayout.getChildCount();
    }

    public final boolean LJFF() {
        ShortVideoContext shortVideoContext;
        if (C45804HyK.LJIJJ(getContext()) != null && (shortVideoContext = ((ShortVideoContextViewModel) C165706es.LIZLLL(this).get(ShortVideoContextViewModel.class)).LJLIL) != null && shortVideoContext.LJJIIJZLJL()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.LJLJL = (LinearLayout) findViewById(R.id.bs8);
    }

    public int getCurrentIndex() {
        return this.LJLIL;
    }

    public int getLastIndex() {
        return this.LJLILLLLZI;
    }

    public final Object LIZLLL(int i) {
        View childAt;
        LinearLayout linearLayout = this.LJLJL;
        if (linearLayout == null || (childAt = linearLayout.getChildAt(i)) == null) {
            return null;
        }
        return childAt.getTag();
    }

    public final Object LJ(int i) {
        View childAt;
        LinearLayout linearLayout = this.LJLJL;
        if (linearLayout == null || (childAt = linearLayout.getChildAt(i)) == null) {
            return null;
        }
        return childAt.getTag();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (this.LLD) {
            float measuredWidth = (getMeasuredWidth() - this.LLFII) / 2.0f;
            float measuredWidth2 = (getMeasuredWidth() + this.LLFII) / 2.0f;
            float f = this.LLFZ;
            RectF rectF = new RectF(measuredWidth, f, measuredWidth2, this.LLFFF + f);
            float f2 = this.LLFF;
            canvas.drawRoundRect(rectF, f2, f2, this.LLF);
        }
        super.dispatchDraw(canvas);
    }

    public void setOnIndexChangedListener(InterfaceC81422VxS interfaceC81422VxS) {
        this.LJLJLLL = interfaceC81422VxS;
    }

    public void setScrollEnabled(boolean z) {
        this.LJLJI = z;
    }

    public void setSelectedTextColor(int i) {
        this.LJZI = AnonymousClass636.LJIIIIZZ(i, getContext());
    }

    public void setSharedARTabChangeListener(InterfaceC81423VxT interfaceC81423VxT) {
        this.LJLL = interfaceC81423VxT;
    }

    public void setStartMargin(int i) {
        this.LLII = i;
        LinearLayout linearLayout = this.LJLJL;
        if (linearLayout != null && (linearLayout instanceof C119344mI)) {
            C119344mI c119344mI = (C119344mI) linearLayout;
            c119344mI.LJLIL = i;
            c119344mI.requestLayout();
        }
        requestLayout();
    }

    public void setTabHostGestureListener(InterfaceC81421VxR interfaceC81421VxR) {
        this.LJLLILLLL = interfaceC81421VxR;
    }

    public void setUISwitchEnabled(boolean z) {
        this.LJLJJI = z;
    }

    public void setUnselectedTextColor(int i) {
        this.LJZL = AnonymousClass636.LJIIIIZZ(i, getContext());
    }

    public ViewOnTouchListenerC81419VxP(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LJLJI = true;
        this.LJLJJI = true;
        this.LJLLI = new C81977WFh();
        this.LJZI = AnonymousClass636.LJIIIIZZ(R.attr.dj, getContext());
        this.LJZL = AnonymousClass636.LJIIIIZZ(R.attr.dm, getContext());
        this.LL = C04330Ez.LIZIZ(getContext(), R.color.bh);
        this.LLD = false;
        this.LLIIII = 0;
        this.LLIIIILZ = getCurrentIndex();
        this.LLIFFJFJJ = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.LJLJJL = new ArrayList();
        setOnTouchListener(this);
        this.LJLJJLL = new Scroller(getContext());
        this.LJLJLJ = new GestureDetector(getContext(), new GestureDetectorOnGestureListenerC81420VxQ(this));
    }

    public final void LIZ(int i, int i2) {
        if (i >= 0 && i < ((ArrayList) this.LJLJJL).size() && i2 >= 0 && i2 < ((ArrayList) this.LJLJJL).size()) {
            int measuredWidth = this.LJLJL.getChildAt(i).getMeasuredWidth();
            int measuredWidth2 = this.LJLJL.getChildAt(i2).getMeasuredWidth();
            this.LLFII = (((measuredWidth2 - measuredWidth) / ((measuredWidth + measuredWidth2) / 2)) * Math.abs(this.LLI)) + measuredWidth;
        }
    }

    public final void LJIIJ(int i, boolean z) {
        View childAt;
        LinearLayout linearLayout = this.LJLJL;
        if (linearLayout == null || (childAt = linearLayout.getChildAt(i)) == null) {
            return;
        }
        if (childAt instanceof C81366VwY) {
            ((C81366VwY) childAt).setTabSelected(z);
        } else {
            if (!(childAt instanceof TextView)) {
                return;
            }
            childAt.setSelected(z);
        }
    }

    public final void LJIIJJI(int i, int i2) {
        View childAt;
        LinearLayout linearLayout = this.LJLJL;
        if (linearLayout == null || (childAt = linearLayout.getChildAt(i)) == null) {
            return;
        }
        if (!childAt.isEnabled()) {
            i2 = this.LL;
        }
        int i3 = 0;
        if (childAt instanceof C81366VwY) {
            C81366VwY c81366VwY = (C81366VwY) childAt;
            c81366VwY.setTextColor(i2);
            int alpha = Color.alpha(i2);
            Drawable[] compoundDrawables = c81366VwY.getTextView().getCompoundDrawables();
            int length = compoundDrawables.length;
            while (i3 < length) {
                Drawable drawable = compoundDrawables[i3];
                if (drawable == null) {
                    return;
                }
                drawable.setAlpha(alpha);
                i3++;
            }
            return;
        }
        if (childAt instanceof TextView) {
            TextView textView = (TextView) childAt;
            textView.setTextColor(i2);
            int alpha2 = Color.alpha(i2);
            Drawable[] compoundDrawables2 = textView.getCompoundDrawables();
            int length2 = compoundDrawables2.length;
            while (i3 < length2) {
                Drawable drawable2 = compoundDrawables2[i3];
                if (drawable2 == null) {
                    return;
                }
                drawable2.setAlpha(alpha2);
                i3++;
            }
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int LIZIZ;
        if (motionEvent.getAction() == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            this.LJLLL = motionEvent.getX();
            this.LJLLLLLL = motionEvent.getY();
            if (C173636rf.LIZIZ(getContext())) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                LinearLayout linearLayout = this.LJLJL;
                if (linearLayout != null) {
                    int childCount = linearLayout.getChildCount();
                    int i = 0;
                    while (true) {
                        if (i < childCount) {
                            View childAt = this.LJLJL.getChildAt(i);
                            if (x < (childAt.getRight() - this.LLII) - this.LJLJL.getScrollX() && x > (childAt.getLeft() - this.LLII) - this.LJLJL.getScrollX() && y < childAt.getBottom() && y > childAt.getTop()) {
                                this.LJLLJ = i;
                                this.LJZ = childAt;
                                break;
                            }
                            i++;
                        } else {
                            this.LJZ = this.LJLJL;
                            break;
                        }
                    }
                }
            } else {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                LinearLayout linearLayout2 = this.LJLJL;
                if (linearLayout2 != null) {
                    int childCount2 = linearLayout2.getChildCount();
                    int i2 = 0;
                    while (true) {
                        if (i2 < childCount2) {
                            View childAt2 = this.LJLJL.getChildAt(i2);
                            if (x2 < (childAt2.getRight() + this.LLII) - this.LJLJL.getScrollX() && x2 > (childAt2.getLeft() + this.LLII) - this.LJLJL.getScrollX() && y2 < childAt2.getBottom() && y2 > childAt2.getTop()) {
                                this.LJLLJ = i2;
                                this.LJZ = childAt2;
                                break;
                            }
                            i2++;
                        } else {
                            this.LJZ = this.LJLJL;
                            break;
                        }
                    }
                }
            }
        }
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action != 2) {
                if (action == 3) {
                    LJII(this.LJLIL, 0, true);
                    InterfaceC81421VxR interfaceC81421VxR = this.LJLLILLLL;
                    if (interfaceC81421VxR != null) {
                        interfaceC81421VxR.LIZ(motionEvent);
                    }
                }
            } else {
                float x3 = motionEvent.getX() - this.LJLLL;
                float y3 = motionEvent.getY() - this.LJLLLLLL;
                if (Math.abs(x3) > this.LLIFFJFJJ && Math.abs(x3) > Math.abs(y3)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                } else {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                InterfaceC81421VxR interfaceC81421VxR2 = this.LJLLILLLL;
                if (interfaceC81421VxR2 != null) {
                    interfaceC81421VxR2.LIZIZ(motionEvent);
                }
            }
        } else {
            this.LJLLLL = motionEvent.getX();
            this.LJLZ = motionEvent.getY();
            if (Math.abs(this.LJLLLL - this.LJLLL) < this.LLIFFJFJJ * 2 || Math.abs(this.LJLZ - this.LJLLLLLL) > C60996Nwm.LJ(getContext()) / 4) {
                LJII(this.LJLIL, 0, true);
            } else if (this.LJLLI.LIZ(this) && this.LJLJJI) {
                if (C173636rf.LIZIZ(getContext())) {
                    LIZIZ = LIZJ();
                } else {
                    LIZIZ = LIZIZ();
                }
                LJII(LIZIZ, this.LLIIII, true);
                InterfaceC81421VxR interfaceC81421VxR3 = this.LJLLILLLL;
                if (interfaceC81421VxR3 != null && this.LJLILLLLZI != this.LJLIL) {
                    interfaceC81421VxR3.LIZJ();
                }
            }
            InterfaceC81421VxR interfaceC81421VxR4 = this.LJLLILLLL;
            if (interfaceC81421VxR4 != null) {
                interfaceC81421VxR4.LIZ(motionEvent);
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.LLIIII = 0;
        }
        return this.LJLJLJ.onTouchEvent(motionEvent);
    }

    public final void LJII(int i, int i2, boolean z) {
        InterfaceC81422VxS interfaceC81422VxS;
        int i3;
        InterfaceC81423VxT interfaceC81423VxT;
        if (LJFF() && (interfaceC81423VxT = this.LJLL) != null) {
            interfaceC81423VxT.LIZ((String) LJ(i));
            return;
        }
        this.LLIIIILZ = i;
        for (int i4 = 0; i4 < this.LJLJL.getChildCount(); i4++) {
            if (i4 == i) {
                i3 = this.LJZI;
            } else {
                i3 = this.LJZL;
            }
            LJIIJJI(i4, i3);
            if (this.LJLJL != null) {
                for (int i5 = 0; i5 < this.LJLJL.getChildCount(); i5++) {
                    if (i5 != i) {
                        LJIIJ(i5, false);
                    }
                }
                LJIIJ(i, true);
            }
        }
        int i6 = this.LJLIL;
        if (i6 != i && (interfaceC81422VxS = this.LJLJLLL) != null && z) {
            interfaceC81422VxS.LIZ(LJ(i6), i, i2, false, true);
        }
        StringBuilder LJ = C7MY.LJ("withoutAnim the set index is ", i, " mCurIndex:");
        LJ.append(this.LJLIL);
        C170666ms.LIZIZ(X1D.LIZIZ(LJ));
        this.LJLILLLLZI = this.LJLIL;
        this.LJLIL = i;
        if (((ArrayList) this.LJLJJL).isEmpty() || i < 0 || i >= ((ArrayList) this.LJLJJL).size()) {
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(this.LJLJL.getScrollX(), ((Integer) ListProtector.get(this.LJLJJL, i)).intValue() - ((Integer) ListProtector.get(this.LJLJJL, 0)).intValue());
        ofInt.setDuration(150L);
        ofInt.addUpdateListener(new AUListenerS101S0100000_14(this, 44));
        if (this.LLD) {
            ofInt.addListener(new ALAdapterS11S0100000_14(this, 31));
        }
        ofInt.start();
    }

    public final void LJIIIIZZ(int i, boolean z, boolean z2) {
        LJIIIZ(z, false, i, 0, z2);
    }

    public final void LJIIIZ(boolean z, boolean z2, int i, int i2, boolean z3) {
        InterfaceC81422VxS interfaceC81422VxS;
        int i3;
        this.LLIIIILZ = i;
        for (int i4 = 0; i4 < this.LJLJL.getChildCount(); i4++) {
            if (i4 == i) {
                i3 = this.LJZI;
            } else {
                i3 = this.LJZL;
            }
            LJIIJJI(i4, i3);
            if (this.LJLJL != null) {
                for (int i5 = 0; i5 < this.LJLJL.getChildCount(); i5++) {
                    if (i5 != i) {
                        LJIIJ(i5, false);
                    }
                }
                LJIIJ(i, true);
            }
        }
        int i6 = this.LJLIL;
        if ((i6 != i || i2 == 6) && (interfaceC81422VxS = this.LJLJLLL) != null && z) {
            interfaceC81422VxS.LIZ(LJ(i6), i, i2, z2, z3);
        }
        StringBuilder LJ = C7MY.LJ("the set index is ", i, " mCurIndex:");
        LJ.append(this.LJLIL);
        C170666ms.LIZIZ(X1D.LIZIZ(LJ));
        this.LJLIL = i;
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = 0;
        if (C173636rf.LIZIZ(getContext())) {
            int childCount = this.LJLJL.getChildCount();
            ((ArrayList) this.LJLJJL).clear();
            int i6 = i3;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = this.LJLJL.getChildAt(i7);
                if (childAt != null) {
                    if (i7 == 0) {
                        int i8 = i3 - i;
                        i6 = this.LLII + (childAt.getWidth() / 2) + (i6 - (i8 / 2)) + ((this.LJLJL.getRight() - this.LJLJL.getLeft()) - i8);
                    }
                    ((ArrayList) this.LJLJJL).add(Integer.valueOf(i6 - (childAt.getWidth() / 2)));
                    childAt.layout(i6 - childAt.getWidth(), childAt.getTop(), i6, childAt.getBottom());
                    i6 -= childAt.getWidth();
                }
            }
            StringBuilder LJ = C7MY.LJ("the xPivots size is ", childCount, " mCurIndex:");
            LJ.append(this.LJLIL);
            C170666ms.LIZIZ(X1D.LIZIZ(LJ));
            int LJJIIZ = C78609UtB.LJJIIZ(this.LJLIL, 0, childCount - 1);
            try {
                this.LJLJL.scrollTo(((Integer) ListProtector.get(this.LJLJJL, LJJIIZ)).intValue() - ((Integer) ListProtector.get(this.LJLJJL, 0)).intValue(), 0);
                if (this.LJLIL > LJJIIZ) {
                    StringBuilder LJ2 = C7MY.LJ("mCurIndex is dangerous， modify it !!! safeIndex: ", LJJIIZ, " mCurIndex:");
                    LJ2.append(this.LJLIL);
                    C170666ms.LIZIZ(X1D.LIZIZ(LJ2));
                    this.LJLIL = LJJIIZ;
                }
            } catch (IndexOutOfBoundsException e) {
                StringBuilder sb = new StringBuilder();
                while (i5 < childCount) {
                    View childAt2 = this.LJLJL.getChildAt(i5);
                    sb.append("index ");
                    sb.append(i5);
                    sb.append(' ');
                    sb.append(childAt2.getClass());
                    sb.append(' ');
                    sb.append(childAt2.getTag());
                    sb.append('\n');
                    i5++;
                }
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Inconsistency detected. children are ");
                LIZ.append((Object) sb);
                throw new IllegalStateException(X1D.LIZIZ(LIZ), e);
            }
        } else {
            int childCount2 = this.LJLJL.getChildCount();
            ((ArrayList) this.LJLJJL).clear();
            int i9 = i;
            for (int i10 = 0; i10 < childCount2; i10++) {
                View childAt3 = this.LJLJL.getChildAt(i10);
                if (childAt3 != null) {
                    if (i10 == 0) {
                        i9 = (AnonymousClass030.LIZJ(i3, i, 2, i9) - (childAt3.getWidth() / 2)) - this.LLII;
                    }
                    if (childAt3 instanceof C81366VwY) {
                        C81366VwY c81366VwY = (C81366VwY) childAt3;
                        int width = (c81366VwY.getTextView().getWidth() - c81366VwY.getTextView().getPaddingLeft()) - c81366VwY.getTextView().getPaddingRight();
                        ((ArrayList) this.LJLJJL).add(Integer.valueOf((width / 2) + c81366VwY.getTextView().getPaddingLeft() + i9));
                    } else if (childAt3 instanceof TextView) {
                        ((ArrayList) this.LJLJJL).add(Integer.valueOf((childAt3.getWidth() / 2) + i9));
                    }
                    childAt3.layout(i9, childAt3.getTop(), childAt3.getWidth() + i9, childAt3.getBottom());
                    i9 += childAt3.getWidth();
                }
            }
            StringBuilder LJ3 = C7MY.LJ("the xPivots size is ", childCount2, " mCurIndex:");
            LJ3.append(this.LJLIL);
            C170666ms.LIZIZ(X1D.LIZIZ(LJ3));
            int LJJIIZ2 = C78609UtB.LJJIIZ(this.LJLIL, 0, childCount2 - 1);
            try {
                this.LJLJL.scrollTo(((Integer) ListProtector.get(this.LJLJJL, LJJIIZ2)).intValue() - ((Integer) ListProtector.get(this.LJLJJL, 0)).intValue(), 0);
                if (this.LJLIL > LJJIIZ2) {
                    StringBuilder LJ4 = C7MY.LJ("mCurIndex is dangerous， modify it !!! safeIndex: ", LJJIIZ2, " mCurIndex:");
                    LJ4.append(this.LJLIL);
                    C170666ms.LIZIZ(X1D.LIZIZ(LJ4));
                    this.LJLIL = LJJIIZ2;
                }
            } catch (IndexOutOfBoundsException e2) {
                StringBuilder sb2 = new StringBuilder();
                while (i5 < childCount2) {
                    View childAt4 = this.LJLJL.getChildAt(i5);
                    sb2.append("index ");
                    sb2.append(i5);
                    sb2.append(' ');
                    sb2.append(childAt4.getClass());
                    sb2.append(' ');
                    sb2.append(childAt4.getTag());
                    sb2.append('\n');
                    i5++;
                }
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Inconsistency detected. children are ");
                LIZ2.append((Object) sb2);
                throw new IllegalStateException(X1D.LIZIZ(LIZ2), e2);
            }
        }
        LJI();
    }
}
