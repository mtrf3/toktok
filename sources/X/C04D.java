package X;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.IDqS443S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.04D, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C04D extends ViewGroup {
    public WeakReference<AbstractC24810yD> LJLIL;
    public IBinder LJLILLLLZI;
    public InterfaceC24790yB LJLJI;
    public AbstractC24810yD LJLJJI;
    public InterfaceC65784Pro<C76800UCe> LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLJL;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C04D(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        o.LJIIIZ(context, "context");
    }

    public static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public abstract void LIZ(InterfaceC24520xk interfaceC24520xk, int i);

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public final void LIZIZ() {
        if (this.LJLJL) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Cannot add views to ");
        LIZ.append(C16880lQ.LJLLJ(getClass()));
        LIZ.append("; only Compose content is supported");
        throw new UnsupportedOperationException(X1D.LIZIZ(LIZ));
    }

    public final void LIZJ() {
        if (this.LJLJJI != null || isAttachedToWindow()) {
            LJ();
        } else {
            "createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString();
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
    }

    public final void LIZLLL() {
        InterfaceC24790yB interfaceC24790yB = this.LJLJI;
        if (interfaceC24790yB != null) {
            interfaceC24790yB.dispose();
        }
        this.LJLJI = null;
        requestLayout();
    }

    public void LJ() {
        if (this.LJLJI == null) {
            try {
                this.LJLJL = true;
                this.LJLJI = C04S.LIZ(this, LJIIIIZZ(), C1DJ.LJFF(new IDqS443S0100000(this, 1), -656146368, true));
            } finally {
                this.LJLJL = false;
            }
        }
    }

    public final AbstractC24810yD LJIIIIZZ() {
        AbstractC24810yD abstractC24810yD = this.LJLJJI;
        if (abstractC24810yD == null) {
            abstractC24810yD = C05M.LIZIZ(this);
            if (abstractC24810yD == null) {
                ViewParent parent = getParent();
                while (parent instanceof View) {
                    abstractC24810yD = C05M.LIZIZ((View) parent);
                    parent = parent.getParent();
                    if (abstractC24810yD != null) {
                        break;
                    }
                }
            }
            if (abstractC24810yD != null) {
                if (LJII(abstractC24810yD)) {
                    this.LJLIL = new WeakReference<>(abstractC24810yD);
                }
            } else {
                WeakReference<AbstractC24810yD> weakReference = this.LJLIL;
                if (weakReference == null || (abstractC24810yD = weakReference.get()) == null || !LJII(abstractC24810yD)) {
                    if (isAttachedToWindow()) {
                        Object parent2 = getParent();
                        View view = this;
                        while (parent2 instanceof View) {
                            View view2 = (View) parent2;
                            if (view2.getId() == 16908290) {
                                break;
                            }
                            view = view2;
                            parent2 = view2.getParent();
                        }
                        abstractC24810yD = C05M.LIZIZ(view);
                        if (abstractC24810yD == null) {
                            abstractC24810yD = AnonymousClass059.LIZ(view);
                        } else if (!(abstractC24810yD instanceof C36001bA)) {
                            "root viewTreeParentCompositionContext is not a Recomposer".toString();
                            throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                        }
                        if (LJII(abstractC24810yD) && abstractC24810yD != null) {
                            this.LJLIL = new WeakReference<>(abstractC24810yD);
                        }
                    } else {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("Cannot locate windowRecomposer; View ");
                        LIZ.append(this);
                        LIZ.append(" is not attached to a window");
                        String LIZIZ = X1D.LIZIZ(LIZ);
                        LIZIZ.toString();
                        throw new IllegalStateException(LIZIZ);
                    }
                }
            }
        }
        return abstractC24810yD;
    }

    public final boolean getHasComposition() {
        if (this.LJLJI != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            LJ();
        }
    }

    public final InterfaceC24790yB getComposition() {
        return this.LJLJI;
    }

    public final boolean getCreatingComposition() {
        return this.LJLJL;
    }

    public final boolean getShowLayoutBounds() {
        return this.LJLJJLL;
    }

    public static boolean LJII(AbstractC24810yD abstractC24810yD) {
        if (!(abstractC24810yD instanceof C36001bA) || ((EnumC24710y3) ((C36001bA) abstractC24810yD).LJIILLIIL.getValue()).compareTo(EnumC24710y3.ShuttingDown) > 0) {
            return true;
        }
        return false;
    }

    private final void setParentContext(AbstractC24810yD abstractC24810yD) {
        if (this.LJLJJI != abstractC24810yD) {
            this.LJLJJI = abstractC24810yD;
            if (abstractC24810yD != null) {
                this.LJLIL = null;
            }
            InterfaceC24790yB interfaceC24790yB = this.LJLJI;
            if (interfaceC24790yB != null) {
                interfaceC24790yB.dispose();
                this.LJLJI = null;
                if (isAttachedToWindow()) {
                    LJ();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.LJLILLLLZI != iBinder) {
            this.LJLILLLLZI = iBinder;
            this.LJLIL = null;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        LIZIZ();
        super.addView(view);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i);
    }

    public final void setComposition(InterfaceC24790yB interfaceC24790yB) {
        this.LJLJI = interfaceC24790yB;
    }

    public final void setCreatingComposition(boolean z) {
        this.LJLJL = z;
    }

    public final void setParentCompositionContext(AbstractC24810yD abstractC24810yD) {
        setParentContext(abstractC24810yD);
    }

    public final void setShowLayoutBounds(boolean z) {
        this.LJLJJLL = z;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((C0DR) childAt).setShowLayoutBounds(z);
        }
    }

    public final void setViewCompositionStrategy(C04W strategy) {
        o.LJIIIZ(strategy, "strategy");
        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJJL;
        if (interfaceC65784Pro != null) {
            interfaceC65784Pro.invoke();
        }
        this.LJLJJL = strategy.LIZ(this);
    }

    public void LJI(int i, int i2) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i, i2);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i2) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i2)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        LIZIZ();
        super.addView(view, i);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        LJ();
        LJI(i, i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        LIZIZ();
        super.addView(view, layoutParams);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C04D(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        o.LJIIIZ(context, "context");
        setClipChildren(false);
        setClipToPadding(false);
        C04W.LIZ.getClass();
        this.LJLJJL = C283519j.LIZIZ.LIZ(this);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, int i2) {
        LIZIZ();
        super.addView(view, i, i2);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams) {
        LIZIZ();
        return super.addViewInLayout(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        LIZIZ();
        super.addView(view, i, layoutParams);
    }

    public /* synthetic */ C04D(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        LIZIZ();
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    public void LJFF(int i, int i2, int i3, int i4, boolean z) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i3 - i) - getPaddingRight(), (i4 - i2) - getPaddingBottom());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        LJFF(i, i2, i3, i4, z);
    }
}
