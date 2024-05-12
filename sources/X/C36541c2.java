package X;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import kotlin.jvm.internal.IDqS11S0101000;
import kotlin.jvm.internal.o;

/* renamed from: X.1c2 */
/* loaded from: classes.dex */
public final class C36541c2 extends C04D {
    public InterfaceC65784Pro<C76800UCe> LJLJLJ;
    public C25780zm LJLJLLL;
    public String LJLL;
    public final View LJLLI;
    public final AnonymousClass100 LJLLILLLL;
    public final WindowManager LJLLJ;
    public final WindowManager.LayoutParams LJLLL;
    public AnonymousClass101 LJLLLL;
    public EnumC23500w6 LJLLLLLL;
    public final ParcelableSnapshotMutableState LJLZ;
    public final ParcelableSnapshotMutableState LJZ;
    public C23470w3 LJZI;
    public final C44001o4 LJZL;
    public final Rect LL;
    public final ParcelableSnapshotMutableState LLD;
    public boolean LLF;
    public final int[] LLFF;

    public C36541c2() {
        throw null;
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    public C04D getSubCompositionView() {
        return this;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }

    private final InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> getContent() {
        return (InterfaceC88471Ynr) this.LLD.getValue();
    }

    public final InterfaceC274415w getParentLayoutCoordinates() {
        return (InterfaceC274415w) this.LJZ.getValue();
    }

    public final void LJIILJJIL() {
        C23490w5 m4getPopupContentSizebOM6tXw;
        C23470w3 c23470w3 = this.LJZI;
        if (c23470w3 != null && (m4getPopupContentSizebOM6tXw = m4getPopupContentSizebOM6tXw()) != null) {
            long j = m4getPopupContentSizebOM6tXw.LIZ;
            Rect rect = this.LL;
            this.LJLLILLLL.LIZIZ(rect, this.LJLLI);
            long LIZIZ = C78996UzQ.LIZIZ(rect.right - rect.left, rect.bottom - rect.top);
            long LIZ = this.LJLLLL.LIZ(c23470w3, LIZIZ, this.LJLLLLLL, j);
            WindowManager.LayoutParams layoutParams = this.LJLLL;
            layoutParams.x = (int) (LIZ >> 32);
            layoutParams.y = C23450w1.LIZJ(LIZ);
            if (this.LJLJLLL.LJ) {
                this.LJLLILLLL.LIZJ((int) (LIZIZ >> 32), C23490w5.LIZIZ(LIZIZ), this);
            }
            this.LJLLILLLL.LIZ(this.LJLLJ, this, this.LJLLL);
        }
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.LJZL.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getPopupContentSize-bOM6tXw */
    public final C23490w5 m4getPopupContentSizebOM6tXw() {
        return (C23490w5) this.LJLZ.getValue();
    }

    private final int getDisplayHeight() {
        return O6R.LJJIIZ(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return O6R.LJJIIZ(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    public final void LJIIL() {
        InterfaceC274415w parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null) {
            return;
        }
        long LIZ = parentLayoutCoordinates.LIZ();
        long LJJJJLL = parentLayoutCoordinates.LJJJJLL(C10370av.LIZIZ);
        long LIZ2 = C78939UyV.LIZ(O6R.LJJIIZ(C10370av.LIZLLL(LJJJJLL)), O6R.LJJIIZ(C10370av.LJ(LJJJJLL)));
        int i = (int) (LIZ2 >> 32);
        C23470w3 c23470w3 = new C23470w3(i, C23450w1.LIZJ(LIZ2), ((int) (LIZ >> 32)) + i, C23490w5.LIZIZ(LIZ) + C23450w1.LIZJ(LIZ2));
        if (!o.LJ(c23470w3, this.LJZI)) {
            this.LJZI = c23470w3;
            LJIILJJIL();
        }
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.LJLLL;
    }

    public final EnumC23500w6 getParentLayoutDirection() {
        return this.LJLLLLLL;
    }

    public final AnonymousClass101 getPositionProvider() {
        return this.LJLLLL;
    }

    @Override // X.C04D
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.LLF;
    }

    public final String getTestTag() {
        return this.LJLL;
    }

    public static final /* synthetic */ InterfaceC274415w LJIIIZ(C36541c2 c36541c2) {
        return c36541c2.getParentLayoutCoordinates();
    }

    private final void setClippingEnabled(boolean z) {
        int i;
        if (z) {
            i = this.LJLLL.flags & (-513);
        } else {
            i = this.LJLLL.flags | 512;
        }
        WindowManager.LayoutParams layoutParams = this.LJLLL;
        layoutParams.flags = i;
        this.LJLLILLLL.LIZ(this.LJLLJ, this, layoutParams);
    }

    private final void setContent(InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr) {
        this.LLD.setValue(interfaceC88471Ynr);
    }

    private final void setIsFocusable(boolean z) {
        int i;
        if (!z) {
            i = this.LJLLL.flags | 8;
        } else {
            i = this.LJLLL.flags & (-9);
        }
        WindowManager.LayoutParams layoutParams = this.LJLLL;
        layoutParams.flags = i;
        this.LJLLILLLL.LIZ(this.LJLLJ, this, layoutParams);
    }

    private final void setParentLayoutCoordinates(InterfaceC274415w interfaceC274415w) {
        this.LJZ.setValue(interfaceC274415w);
    }

    private final void setSecurePolicy(EnumC25790zn enumC25790zn) {
        int i;
        if (C25810zp.LIZ(enumC25790zn, C25830zr.LIZJ(this.LJLLI))) {
            i = this.LJLLL.flags | FileUtils.BUFFER_SIZE;
        } else {
            i = this.LJLLL.flags & (-8193);
        }
        WindowManager.LayoutParams layoutParams = this.LJLLL;
        layoutParams.flags = i;
        this.LJLLILLLL.LIZ(this.LJLLJ, this, layoutParams);
    }

    public final void LJIILIIL(InterfaceC274415w interfaceC274415w) {
        setParentLayoutCoordinates(interfaceC274415w);
        LJIIL();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent event) {
        KeyEvent.DispatcherState keyDispatcherState;
        o.LJIIIZ(event, "event");
        if (event.getKeyCode() == 4 && this.LJLJLLL.LIZIZ) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(event);
            }
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(event, this);
                }
                return true;
            }
            if (event.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(event) && !event.isCanceled()) {
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJLJ;
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.LJLJLLL.LIZJ) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null) {
            if (motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJLJ;
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                }
                return true;
            }
            if (motionEvent.getAction() == 4) {
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = this.LJLJLJ;
                if (interfaceC65784Pro2 != null) {
                    interfaceC65784Pro2.invoke();
                }
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setParentLayoutDirection(EnumC23500w6 enumC23500w6) {
        o.LJIIIZ(enumC23500w6, "<set-?>");
        this.LJLLLLLL = enumC23500w6;
    }

    /* renamed from: setPopupContentSize-fhxjrPA */
    public final void m5setPopupContentSizefhxjrPA(C23490w5 c23490w5) {
        this.LJLZ.setValue(c23490w5);
    }

    public final void setPositionProvider(AnonymousClass101 anonymousClass101) {
        o.LJIIIZ(anonymousClass101, "<set-?>");
        this.LJLLLL = anonymousClass101;
    }

    public final void setTestTag(String str) {
        o.LJIIIZ(str, "<set-?>");
        this.LJLL = str;
    }

    @Override // X.C04D
    public final void LIZ(InterfaceC24520xk interfaceC24520xk, int i) {
        C35931b3 LJIL = interfaceC24520xk.LJIL(-857613600);
        getContent().invoke(LJIL, 0);
        C35991b9 LJJJJLI = LJIL.LJJJJLI();
        if (LJJJJLI == null) {
            return;
        }
        LJJJJLI.LIZLLL = new IDqS11S0101000(this, i, 14);
    }

    @Override // X.C04D
    public final void LJI(int i, int i2) {
        if (this.LJLJLLL.LJI) {
            super.LJI(i, i2);
        } else {
            super.LJI(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), LiveLayoutPreloadThreadPriority.DEFAULT), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), LiveLayoutPreloadThreadPriority.DEFAULT));
        }
    }

    public final void LJIIJ(AbstractC24810yD parent, InterfaceC88471Ynr<? super InterfaceC24520xk, ? super Integer, C76800UCe> interfaceC88471Ynr) {
        o.LJIIIZ(parent, "parent");
        setParentCompositionContext(parent);
        setContent(interfaceC88471Ynr);
        this.LLF = true;
    }

    public final void LJIIJJI(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, C25780zm properties, String testTag, EnumC23500w6 layoutDirection) {
        o.LJIIIZ(properties, "properties");
        o.LJIIIZ(testTag, "testTag");
        o.LJIIIZ(layoutDirection, "layoutDirection");
        this.LJLJLJ = interfaceC65784Pro;
        this.LJLJLLL = properties;
        this.LJLL = testTag;
        setIsFocusable(properties.LIZ);
        setSecurePolicy(properties.LIZLLL);
        setClippingEnabled(properties.LJFF);
        int i = C25910zz.LIZ[layoutDirection.ordinal()];
        int i2 = 1;
        if (i != 1) {
            if (i != 2) {
                throw new C162476Zf();
            }
        } else {
            i2 = 0;
        }
        super.setLayoutDirection(i2);
    }

    @Override // X.C04D
    public final void LJFF(int i, int i2, int i3, int i4, boolean z) {
        super.LJFF(i, i2, i3, i4, z);
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        this.LJLLL.width = childAt.getMeasuredWidth();
        this.LJLLL.height = childAt.getMeasuredHeight();
        this.LJLLILLLL.LIZ(this.LJLLJ, this, this.LJLLL);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C36541c2(X.InterfaceC65784Pro r6, X.C25780zm r7, java.lang.String r8, android.view.View r9, X.InterfaceC23370vt r10, X.AnonymousClass101 r11, java.util.UUID r12) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36541c2.<init>(X.Pro, X.0zm, java.lang.String, android.view.View, X.0vt, X.101, java.util.UUID):void");
    }
}
