package X;

import Y.IDLListenerS188S0100000;
import Y.IDRunnableS6S0101000;
import Y.IDRunnableS85S0100000;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RenderNode;
import android.os.Build;
import android.os.Trace;
import android.util.SparseArray;
import android.view.DisplayListCanvas;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.ui.platform.g1;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import defpackage.i0;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.jvm.internal.IDqS176S0200000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.IDqS420S0100000;
import kotlin.jvm.internal.o;
import o3.h0;

/* renamed from: X.1q1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C45211q1 extends ViewGroup implements GenericLifecycleObserver, C0DR, InterfaceC284619u, C11A, DefaultLifecycleObserver {
    public static Class<?> LLJJJJJIL;
    public static Method LLJJJJLIIL;
    public long LJLIL;
    public InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final boolean LJLJI;
    public final C46051rN LJLJJI;
    public C35431aF LJLJJL;
    public final C1PC LJLJJLL;
    public final C1A1 LJLJL;
    public final C531626u LJLJLJ;
    public final InterfaceC07790Sh LJLJLLL;
    public final C11780dC LJLL;
    public final C29321Dc LJLLI;
    public final C45211q1 LJLLILLLL;
    public final C07220Qc LJLLJ;
    public final C1A5 LJLLL;
    public final C08320Ui LJLLLL;
    public final List<C0DN> LJLLLLLL;
    public List<C0DN> LJLZ;
    public boolean LJZ;
    public final C11D LJZI;
    public final C11U LJZL;
    public InterfaceC88472Yns<? super Configuration, C76800UCe> LL;
    public final C1N8 LLD;
    public boolean LLF;
    public final C284319r LLFF;
    public final C284019o LLFFF;
    public final C03750Ct LLFII;
    public boolean LLFZ;
    public C016404q LLI;
    public C05N LLIFFJFJJ;
    public C23360vs LLII;
    public final C03800Cy LLIIII;
    public final C284419s LLIIIILZ;
    public long LLIIIJ;
    public final int[] LLIIIL;
    public final float[] LLIIIZ;
    public final float[] LLIIJI;
    public long LLIIJLIL;
    public boolean LLIIL;
    public long LLIILII;
    public boolean LLIILZL;
    public final ParcelableSnapshotMutableState LLIIZ;
    public InterfaceC88472Yns<? super AnonymousClass048, C76800UCe> LLIL;
    public final IDLListenerS188S0100000 LLILII;
    public final ViewTreeObserverOnScrollChangedListenerC016704t LLILIL;
    public final ViewTreeObserverOnTouchModeChangeListenerC017104x LLILL;
    public final C1UA LLILLIZIL;
    public final C15020iQ LLILLJJLI;
    public final C283719l LLILLL;
    public final ParcelableSnapshotMutableState LLILZ;
    public int LLILZIL;
    public final ParcelableSnapshotMutableState LLILZLL;
    public final C1YY LLIZ;
    public final C1ZQ LLIZLLLIL;
    public final C00D LLJ;
    public final C283819m LLJI;
    public MotionEvent LLJIJIL;
    public long LLJILJIL;
    public final C284919x LLJILJILJ;
    public final C25710zf<InterfaceC65784Pro<C76800UCe>> LLJILLL;
    public final IDRunnableS85S0100000 LLJJ;
    public final IDRunnableS6S0101000 LLJJI;
    public boolean LLJJIII;
    public final IDqS420S0100000 LLJJIJI;
    public final InterfaceC016804u LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public IDqS176S0200000 LLJJJ;
    public C11M LLJJJIL;
    public final C282919d LLJJJJ;
    public boolean wasMeasuredWithMultipleConstraints;

    static {
        new AnonymousClass047();
    }

    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public static /* synthetic */ void getTextInputService$annotations() {
    }

    @Override // X.C0DR
    public final void LJIIIIZZ(C29321Dc node) {
        o.LJIIIZ(node, "node");
    }

    public View getView() {
        return this;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C09G.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
        C09G.LIZIZ(this, lifecycleOwner);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C09G.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C09G.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C09G.LJFF(this, lifecycleOwner);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // X.C0DR
    public final void LJFF() {
        if (this.LLF) {
            C0OJ c0oj = getSnapshotObserver().LIZ;
            C45741qs predicate = C45741qs.LJLIL;
            c0oj.getClass();
            o.LJIIIZ(predicate, "predicate");
            synchronized (c0oj.LIZLLL) {
                C25710zf<C0OI> c25710zf = c0oj.LIZLLL;
                int i = c25710zf.LJLJI;
                if (i > 0) {
                    C0OI[] c0oiArr = c25710zf.LJLIL;
                    o.LJII(c0oiArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
                    int i2 = 0;
                    do {
                        c0oiArr[i2].LIZLLL(predicate);
                        i2++;
                    } while (i2 < i);
                }
            }
            this.LLF = false;
        }
        C016404q c016404q = this.LLI;
        if (c016404q != null) {
            LJIJ(c016404q);
        }
        while (this.LLJILLL.LJIIJJI()) {
            int i3 = this.LLJILLL.LJLJI;
            for (int i4 = 0; i4 < i3; i4++) {
                InterfaceC65784Pro<C76800UCe>[] interfaceC65784ProArr = this.LLJILLL.LJLIL;
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = interfaceC65784ProArr[i4];
                interfaceC65784ProArr[i4] = null;
                if (interfaceC65784Pro != null) {
                    interfaceC65784Pro.invoke();
                }
            }
            this.LLJILLL.LJIILLIIL(0, i3);
        }
    }

    @Override // X.C0DR
    public final void LJIIL() {
        C1A5 c1a5 = this.LJLLL;
        c1a5.LJIIL = true;
        if (c1a5.LJIIIZ() && !c1a5.LJIJ) {
            c1a5.LJIJ = true;
            c1a5.LIZLLL.post(c1a5.LJIJI);
        }
    }

    public final void LJJIIJ() {
        if (!this.LLIIL) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.LLIIJLIL) {
                this.LLIIJLIL = currentAnimationTimeMillis;
                this.LLJJIJIIJIL.LIZ(this, this.LLIIIZ);
                C79146V4k.LJJIZ(this.LLIIIZ, this.LLIIJI);
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = view.getParent();
                }
                view.getLocationOnScreen(this.LLIIIL);
                int[] iArr = this.LLIIIL;
                float f = iArr[0];
                float f2 = iArr[1];
                view.getLocationInWindow(iArr);
                int[] iArr2 = this.LLIIIL;
                this.LLIILII = C78923UyF.LIZ(f - iArr2[0], f2 - iArr2[1]);
            }
        }
    }

    public final void LJJIJIIJI() {
        getLocationOnScreen(this.LLIIIL);
        long j = this.LLIIIJ;
        int i = (int) (j >> 32);
        int LIZJ = C23450w1.LIZJ(j);
        int[] iArr = this.LLIIIL;
        boolean z = false;
        int i2 = iArr[0];
        if (i != i2 || LIZJ != iArr[1]) {
            this.LLIIIJ = C78939UyV.LIZ(i2, iArr[1]);
            if (i != Integer.MAX_VALUE && LIZJ != Integer.MAX_VALUE) {
                getRoot().LLIFFJFJJ.LJIIJ.LJLIL();
                z = true;
            }
        }
        this.LLIIII.LIZIZ(z);
    }

    public final C016404q getAndroidViewsHandler$ui_release() {
        if (this.LLI == null) {
            Context context = getContext();
            o.LJIIIIZZ(context, "context");
            C016404q c016404q = new C016404q(context);
            this.LLI = c016404q;
            addView(c016404q);
        }
        C016404q c016404q2 = this.LLI;
        o.LJI(c016404q2);
        return c016404q2;
    }

    @Override // X.C0DR
    public InterfaceC13480fw getFontFamilyResolver() {
        return (InterfaceC13480fw) this.LLILZ.getValue();
    }

    public boolean getHasPendingMeasureOrLayout() {
        return !isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View, android.view.ViewParent, X.C0DR
    public EnumC23500w6 getLayoutDirection() {
        return (EnumC23500w6) this.LLILZLL.getValue();
    }

    public long getMeasureIteration() {
        C03800Cy c03800Cy = this.LLIIII;
        if (c03800Cy.LIZJ) {
            return c03800Cy.LJFF;
        }
        "measureIteration should be only used during the measure/layout pass".toString();
        throw new IllegalArgumentException("measureIteration should be only used during the measure/layout pass");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AnonymousClass048 getViewTreeOwners() {
        return (AnonymousClass048) this.LLIIZ.getValue();
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        return this.LLILLIZIL.LIZJ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        if (r3 != r0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a4, code lost:
    
        if (r1 != null) goto L14;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            X.1Dc r0 = r5.getRoot()
            r5.LJJ(r0)
            X.1Dc r0 = r5.getRoot()
            LJIL(r0)
            X.0Ct r0 = r5.getSnapshotObserver()
            X.0OJ r1 = r0.LIZ
            r1.getClass()
            kotlin.jvm.internal.IDqS443S0100000 r0 = r1.LIZIZ
            X.1IK r0 = X.C0O8.LIZJ(r0)
            r1.LJ = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r1 < r0) goto L31
            X.1N8 r1 = r5.LLD
            if (r1 == 0) goto L31
            X.0Uf r0 = X.C08290Uf.LIZ
            r0.LIZ(r1)
        L31:
            androidx.lifecycle.LifecycleOwner r4 = androidx.lifecycle.ViewTreeLifecycleOwner.get(r5)
            X.1c5 r3 = X.C10A.LIZ(r5)
            X.048 r1 = r5.getViewTreeOwners()
            if (r1 == 0) goto La0
            if (r4 == 0) goto L6d
            if (r3 == 0) goto L6d
            androidx.lifecycle.LifecycleOwner r0 = r1.LIZ
            if (r4 != r0) goto L49
            if (r3 == r0) goto L6d
        L49:
            androidx.lifecycle.LifecycleOwner r0 = r1.LIZ
            if (r0 == 0) goto L56
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            if (r0 == 0) goto L56
            r0.removeObserver(r5)
        L56:
            androidx.lifecycle.Lifecycle r0 = r4.getLifecycle()
            r0.addObserver(r5)
            X.048 r2 = new X.048
            r2.<init>(r4, r3)
            r5.setViewTreeOwners(r2)
            kotlin.jvm.internal.IDqS176S0200000 r1 = new kotlin.jvm.internal.IDqS176S0200000
            r0 = 2
            r1.<init>(r5, r2, r0)
            r5.LLJJJ = r1
        L6d:
            kotlin.jvm.internal.IDqS176S0200000 r0 = r5.LLJJJ
            if (r0 == 0) goto L74
            r0.invoke()
        L74:
            X.048 r0 = r5.getViewTreeOwners()
            kotlin.jvm.internal.o.LJI(r0)
            androidx.lifecycle.LifecycleOwner r0 = r0.LIZ
            androidx.lifecycle.Lifecycle r0 = r0.getLifecycle()
            r0.addObserver(r5)
            android.view.ViewTreeObserver r1 = r5.getViewTreeObserver()
            Y.IDLListenerS188S0100000 r0 = r5.LLILII
            r1.addOnGlobalLayoutListener(r0)
            android.view.ViewTreeObserver r1 = r5.getViewTreeObserver()
            X.04t r0 = r5.LLILIL
            r1.addOnScrollChangedListener(r0)
            android.view.ViewTreeObserver r1 = r5.getViewTreeObserver()
            X.04x r0 = r5.LLILL
            r1.addOnTouchModeChangeListener(r0)
            return
        La0:
            if (r4 == 0) goto Laf
            if (r3 == 0) goto La7
            if (r1 == 0) goto L56
            goto L49
        La7:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!"
            r1.<init>(r0)
            throw r1
        Laf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Composed into the View which doesn't propagate ViewTreeLifecycleOwner!"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45211q1.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1N8 c1n8;
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        super.onDetachedFromWindow();
        C03750Ct snapshotObserver = getSnapshotObserver();
        C1IK c1ik = snapshotObserver.LIZ.LJ;
        if (c1ik != null) {
            c1ik.dispose();
        }
        snapshotObserver.LIZ.LIZ();
        AnonymousClass048 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.LIZ) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        if (Build.VERSION.SDK_INT >= 26 && (c1n8 = this.LLD) != null) {
            C08290Uf.LIZ.LIZIZ(c1n8);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.LLILII);
        getViewTreeObserver().removeOnScrollChangedListener(this.LLILIL);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.LLILL);
    }

    @Override // X.C0DR
    public InterfaceC08260Uc getAutofill() {
        return this.LLD;
    }

    @Override // X.C0DR
    public C08320Ui getAutofillTree() {
        return this.LJLLLL;
    }

    public final InterfaceC65784Pro<C76800UCe> getBlockAfterAttachToWindow() {
        return this.LJLILLLLZI;
    }

    public final InterfaceC88472Yns<Configuration, C76800UCe> getConfigurationChangeObserver() {
        return this.LL;
    }

    @Override // X.C0DR
    public InterfaceC23370vt getDensity() {
        return this.LJLJJL;
    }

    @Override // X.C0DR
    public C0Z5 getFocusManager() {
        return this.LJLJJLL;
    }

    @Override // X.C0DR
    public InterfaceC13440fs getFontLoader() {
        return this.LLILLL;
    }

    @Override // X.C0DR
    public InterfaceC20340r0 getHapticFeedBack() {
        return this.LLIZ;
    }

    @Override // X.C0DR
    public InterfaceC21850tR getInputModeManager() {
        return this.LLIZLLLIL;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.LLIIJLIL;
    }

    @Override // X.C0DR
    public C00D getModifierLocalManager() {
        return this.LLJ;
    }

    @Override // X.C0DR
    public C11N getPointerIconService() {
        return this.LLJJJJ;
    }

    public C29321Dc getRoot() {
        return this.LJLLI;
    }

    public InterfaceC03810Cz getRootForTest() {
        return this.LJLLILLLL;
    }

    public C07220Qc getSemanticsOwner() {
        return this.LJLLJ;
    }

    @Override // X.C0DR
    public C46051rN getSharedDrawScope() {
        return this.LJLJJI;
    }

    @Override // X.C0DR
    public boolean getShowLayoutBounds() {
        return this.LLFZ;
    }

    @Override // X.C0DR
    public C03750Ct getSnapshotObserver() {
        return this.LLFII;
    }

    @Override // X.C0DR
    public C15020iQ getTextInputService() {
        return this.LLILLJJLI;
    }

    @Override // X.C0DR
    public C04C getTextToolbar() {
        return this.LLJI;
    }

    @Override // X.C0DR
    public InterfaceC015404g getViewConfiguration() {
        return this.LLIIIILZ;
    }

    @Override // X.C0DR
    public InterfaceC017304z getWindowInfo() {
        return this.LJLJL;
    }

    @Override // X.C0DR
    public C284019o getAccessibilityManager() {
        return this.LLFFF;
    }

    @Override // X.C0DR
    public C284319r getClipboardManager() {
        return this.LLFF;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.19o] */
    /* JADX WARN: Type inference failed for: r0v37, types: [X.04t] */
    /* JADX WARN: Type inference failed for: r0v38, types: [X.04x] */
    /* JADX WARN: Type inference failed for: r0v55, types: [X.1YY] */
    /* JADX WARN: Type inference failed for: r0v70, types: [X.19d] */
    /* JADX WARN: Type inference failed for: r8v2, types: [X.19s] */
    public C45211q1(final Context context) {
        super(context);
        C1N8 c1n8;
        int i;
        EnumC23500w6 enumC23500w6;
        InterfaceC016804u interfaceC016804u;
        this.LJLIL = C10370av.LIZLLL;
        this.LJLJI = true;
        this.LJLJJI = new C46051rN();
        this.LJLJJL = C78847Ux1.LIZIZ(context);
        C48621vW c48621vW = new C48621vW(false, C45201q0.LJLIL, g1.LIZ);
        C1PC c1pc = new C1PC();
        this.LJLJJLL = c1pc;
        this.LJLJL = new C1A1();
        C531626u c531626u = new C531626u(new IDqS416S0100000(this, 2), null);
        this.LJLJLJ = c531626u;
        C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
        C45191pz onRotaryScrollEvent = C45191pz.LJLIL;
        o.LJIIIZ(c1m1, "<this>");
        o.LJIIIZ(onRotaryScrollEvent, "onRotaryScrollEvent");
        InterfaceC07790Sh LIZ = g1.LIZ(c1m1, new AnonymousClass265(new IDqS416S0100000(onRotaryScrollEvent, 364), C14V.LIZ));
        this.LJLJLLL = LIZ;
        this.LJLL = new C11780dC();
        C29321Dc c29321Dc = new C29321Dc(false, 3, 0);
        c29321Dc.LJFF(new AbstractC29311Db() { // from class: X.1pc
            @Override // X.InterfaceC273215k
            public final InterfaceC273515n LIZJ(InterfaceC44861pS measure, List<? extends InterfaceC39071g7> measurables, long j) {
                InterfaceC273515n LJJLIL;
                InterfaceC273515n LJJLIL2;
                InterfaceC273515n LJJLIL3;
                o.LJIIIZ(measure, "$this$measure");
                o.LJIIIZ(measurables, "measurables");
                if (!measurables.isEmpty()) {
                    if (measurables.size() == 1) {
                        AbstractC39201gK LJJJIL = ((InterfaceC39071g7) ListProtector.get(measurables, 0)).LJJJIL(j);
                        LJJLIL2 = measure.LJJLIL(C78555UsJ.LJIIJJI(LJJJIL.LJLIL, j), C78555UsJ.LJIIJ(LJJJIL.LJLILLLLZI, j), C113554cx.LJJJLIIL(), new IDqS416S0100000(LJJJIL, 370));
                        return LJJLIL2;
                    }
                    ArrayList arrayList = new ArrayList(measurables.size());
                    int size = measurables.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        arrayList.add(((InterfaceC39071g7) ListProtector.get(measurables, i2)).LJJJIL(j));
                    }
                    int size2 = arrayList.size();
                    int i3 = 0;
                    int i4 = 0;
                    for (int i5 = 0; i5 < size2; i5++) {
                        AbstractC39201gK abstractC39201gK = (AbstractC39201gK) ListProtector.get(arrayList, i5);
                        i3 = Math.max(abstractC39201gK.LJLIL, i3);
                        i4 = Math.max(abstractC39201gK.LJLILLLLZI, i4);
                    }
                    LJJLIL = measure.LJJLIL(C78555UsJ.LJIIJJI(i3, j), C78555UsJ.LJIIJ(i4, j), C113554cx.LJJJLIIL(), new IDqS416S0100000((List) arrayList, (List<? extends AbstractC39201gK>) 371));
                    return LJJLIL;
                }
                LJJLIL3 = measure.LJJLIL(C23360vs.LJIIIZ(j), C23360vs.LJIIIIZZ(j), C113554cx.LJJJLIIL(), C536928v.LJLIL);
                return LJJLIL3;
            }
        });
        c29321Dc.LIZIZ(getDensity());
        c29321Dc.LIZLLL(C07780Sg.LIZ(c48621vW, LIZ).LLLIIIL(c1pc.LIZIZ).LLLIIIL(c531626u));
        this.LJLLI = c29321Dc;
        this.LJLLILLLL = this;
        this.LJLLJ = new C07220Qc(getRoot());
        C1A5 c1a5 = new C1A5(this);
        this.LJLLL = c1a5;
        this.LJLLLL = new C08320Ui();
        this.LJLLLLLL = new ArrayList();
        this.LJZI = new C11D();
        this.LJZL = new C11U(getRoot());
        this.LL = C45181py.LJLIL;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            c1n8 = new C1N8(this, getAutofillTree());
        } else {
            c1n8 = null;
        }
        this.LLD = c1n8;
        this.LLFF = new C284319r(context);
        this.LLFFF = new InterfaceC014904b(context) { // from class: X.19o
            {
                o.LJII(C16880lQ.LLILL(context, "accessibility"), "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            }
        };
        this.LLFII = new C03750Ct(new IDqS416S0100000(this, 3));
        this.LLIIII = new C03800Cy(getRoot());
        final ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        o.LJIIIIZZ(viewConfiguration, "get(context)");
        this.LLIIIILZ = new InterfaceC015404g(viewConfiguration) { // from class: X.19s
            public final ViewConfiguration LIZ;

            @Override // X.InterfaceC015404g
            public final void LIZJ() {
            }

            @Override // X.InterfaceC015404g
            public final float LIZLLL() {
                return this.LIZ.getScaledTouchSlop();
            }

            @Override // X.InterfaceC015404g
            public final long LJ() {
                float f = 48;
                return C78963Uyt.LIZIZ(f, f);
            }

            @Override // X.InterfaceC015404g
            public final long LIZ() {
                return ViewConfiguration.getDoubleTapTimeout();
            }

            @Override // X.InterfaceC015404g
            public final long LIZIZ() {
                return ViewConfiguration.getLongPressTimeout();
            }

            {
                this.LIZ = viewConfiguration;
            }
        };
        this.LLIIIJ = C78939UyV.LIZ(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.LLIIIL = new int[]{0, 0};
        this.LLIIIZ = C11520cm.LIZ();
        this.LLIIJI = C11520cm.LIZ();
        this.LLIIJLIL = -1L;
        this.LLIILII = C10370av.LIZJ;
        this.LLIILZL = true;
        this.LLIIZ = C78966Uyw.LJJJIL(null);
        this.LLILII = new IDLListenerS188S0100000(this, 4);
        this.LLILIL = new ViewTreeObserver.OnScrollChangedListener() { // from class: X.04t
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                C45211q1 this$0 = C45211q1.this;
                o.LJIIIZ(this$0, "this$0");
                this$0.LJJIJIIJI();
            }
        };
        this.LLILL = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: X.04x
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z) {
                int i3;
                C45211q1 this$0 = C45211q1.this;
                o.LJIIIZ(this$0, "this$0");
                C1ZQ c1zq = this$0.LLIZLLLIL;
                if (z) {
                    i3 = 1;
                } else {
                    i3 = 2;
                }
                c1zq.LIZIZ.setValue(new C21840tQ(i3));
                C0ZA.LIZIZ(this$0.LJLJJLL.LIZ);
            }
        };
        C1UA c1ua = new C1UA(this);
        this.LLILLIZIL = c1ua;
        this.LLILLJJLI = (C15020iQ) C04M.LIZ.invoke(c1ua);
        this.LLILLL = new C283719l(context);
        this.LLILZ = C78966Uyw.LJJJI(C77413UZt.LJIIIZ(context), C35791ap.LIZ);
        Configuration configuration = context.getResources().getConfiguration();
        o.LJIIIIZZ(configuration, "context.resources.configuration");
        if (i2 >= 31) {
            i = configuration.fontWeightAdjustment;
        } else {
            i = 0;
        }
        this.LLILZIL = i;
        Configuration configuration2 = context.getResources().getConfiguration();
        o.LJIIIIZZ(configuration2, "context.resources.configuration");
        int layoutDirection = configuration2.getLayoutDirection();
        if (layoutDirection != 0) {
            if (layoutDirection != 1) {
                enumC23500w6 = EnumC23500w6.Ltr;
            } else {
                enumC23500w6 = EnumC23500w6.Rtl;
            }
        } else {
            enumC23500w6 = EnumC23500w6.Ltr;
        }
        this.LLILZLL = C78966Uyw.LJJJIL(enumC23500w6);
        this.LLIZ = new InterfaceC20340r0(this) { // from class: X.1YY
            public final View LIZ;

            {
                o.LJIIIZ(this, "view");
                this.LIZ = this;
            }

            @Override // X.InterfaceC20340r0
            public final void LIZ(int i3) {
                if (i3 == 0) {
                    this.LIZ.performHapticFeedback(0);
                } else {
                    if (i3 != C20370r3.LIZ) {
                        return;
                    }
                    this.LIZ.performHapticFeedback(9);
                }
            }
        };
        this.LLIZLLLIL = new C1ZQ(new IDqS416S0100000(this, 1), isInTouchMode() ? 1 : 2);
        this.LLJ = new C00D(this);
        this.LLJI = new C283819m(this);
        this.LLJILJILJ = new C284919x();
        this.LLJILLL = new C25710zf<>(new InterfaceC65784Pro[16]);
        this.LLJJ = new IDRunnableS85S0100000(this, 13);
        this.LLJJI = new IDRunnableS6S0101000(0, this, 4);
        this.LLJJIJI = new IDqS420S0100000(this, 2);
        if (i2 >= 29) {
            interfaceC016804u = new InterfaceC016804u() { // from class: X.19y
                public final Matrix LIZ = new Matrix();
                public final int[] LIZIZ = new int[2];

                @Override // X.InterfaceC016804u
                public void LIZ(View view, float[] matrix) {
                    o.LJIIIZ(view, "view");
                    o.LJIIIZ(matrix, "matrix");
                    this.LIZ.reset();
                    view.transformMatrixToGlobal(this.LIZ);
                    ViewParent parent = view.getParent();
                    while (parent instanceof View) {
                        view = parent;
                        parent = view.getParent();
                    }
                    view.getLocationOnScreen(this.LIZIZ);
                    int[] iArr = this.LIZIZ;
                    int i3 = iArr[0];
                    int i4 = iArr[1];
                    view.getLocationInWindow(iArr);
                    int[] iArr2 = this.LIZIZ;
                    this.LIZ.postTranslate(iArr2[0] - i3, iArr2[1] - i4);
                    C46104I7o.LJJJ(this.LIZ, matrix);
                }
            };
        } else {
            interfaceC016804u = new InterfaceC016804u() { // from class: X.19v
                public final int[] LIZ = new int[2];
                public final float[] LIZIZ = C11520cm.LIZ();

                @Override // X.InterfaceC016804u
                public final void LIZ(View view, float[] matrix) {
                    o.LJIIIZ(view, "view");
                    o.LJIIIZ(matrix, "matrix");
                    C11520cm.LIZLLL(matrix);
                    LIZJ(view, matrix);
                }

                public final void LIZJ(View view, float[] fArr) {
                    Object parent = view.getParent();
                    if (parent instanceof View) {
                        LIZJ((View) parent, fArr);
                        LIZIZ(fArr, -view.getScrollX(), -view.getScrollY());
                        LIZIZ(fArr, view.getLeft(), view.getTop());
                    } else {
                        view.getLocationInWindow(this.LIZ);
                        LIZIZ(fArr, -view.getScrollX(), -view.getScrollY());
                        LIZIZ(fArr, r2[0], r2[1]);
                    }
                    Matrix matrix = view.getMatrix();
                    if (!matrix.isIdentity()) {
                        C46104I7o.LJJJ(matrix, this.LIZIZ);
                        C04M.LIZ(fArr, this.LIZIZ);
                    }
                }

                public final void LIZIZ(float[] fArr, float f, float f2) {
                    C11520cm.LIZLLL(this.LIZIZ);
                    C11520cm.LJ(this.LIZIZ, f, f2);
                    C04M.LIZ(fArr, this.LIZIZ);
                }
            };
        }
        this.LLJJIJIIJIL = interfaceC016804u;
        setWillNotDraw(false);
        setFocusable(true);
        if (i2 >= 26) {
            C04H.LIZ(this, 1, false);
        }
        setFocusableInTouchMode(true);
        setClipChildren(false);
        setTransitionGroup(true);
        h0.LJIJI(this, c1a5);
        InterfaceC284619u.LIZJ.getClass();
        getRoot().LJIIIIZZ(this);
        if (i2 >= 29) {
            C04B.LIZ(this);
        }
        this.LLJJJJ = new C11N(this) { // from class: X.19d
        };
    }

    public static void LJIJ(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof C45211q1) {
                ((C45211q1) childAt).LJFF();
            } else if (childAt instanceof ViewGroup) {
                LJIJ((ViewGroup) childAt);
            }
        }
    }

    public static OSZ LJIJI(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    return new OSZ(Integer.valueOf(size), Integer.valueOf(size));
                }
                throw new IllegalStateException();
            }
            return new OSZ(0, Integer.MAX_VALUE);
        }
        return new OSZ(0, Integer.valueOf(size));
    }

    public static void LJIL(C29321Dc c29321Dc) {
        c29321Dc.LJJIII();
        C25710zf<C29321Dc> LJJ = c29321Dc.LJJ();
        int i = LJJ.LJLJI;
        if (i > 0) {
            C29321Dc[] c29321DcArr = LJJ.LJLIL;
            o.LJII(c29321DcArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            int i2 = 0;
            do {
                LJIL(c29321DcArr[i2]);
                i2++;
            } while (i2 < i);
        }
    }

    public static boolean LJJI(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        if (!Float.isInfinite(x) && !Float.isNaN(x)) {
            float y = motionEvent.getY();
            if (!Float.isInfinite(y) && !Float.isNaN(y)) {
                float rawX = motionEvent.getRawX();
                if (!Float.isInfinite(rawX) && !Float.isNaN(rawX)) {
                    float rawY = motionEvent.getRawY();
                    if (!Float.isInfinite(rawY) && !Float.isNaN(rawY)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private void setFontFamilyResolver(InterfaceC13480fw interfaceC13480fw) {
        this.LLILZ.setValue(interfaceC13480fw);
    }

    private void setLayoutDirection(EnumC23500w6 enumC23500w6) {
        this.LLILZLL.setValue(enumC23500w6);
    }

    private final void setViewTreeOwners(AnonymousClass048 anonymousClass048) {
        this.LLIIZ.setValue(anonymousClass048);
    }

    @Override // X.C0DR
    public final void LIZ(boolean z) {
        IDqS420S0100000 iDqS420S0100000;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (!z) {
            iDqS420S0100000 = null;
        } else {
            try {
                iDqS420S0100000 = this.LLJJIJI;
            } finally {
                Trace.endSection();
            }
        }
        if (this.LLIIII.LJI(iDqS420S0100000)) {
            requestLayout();
        }
        this.LLIIII.LIZIZ(false);
    }

    @Override // X.C0DR
    public final void LIZIZ(C29321Dc layoutNode) {
        o.LJIIIZ(layoutNode, "layoutNode");
        this.LLIIII.LJ(layoutNode);
    }

    @Override // X.C0DR
    public final long LIZLLL(long j) {
        LJJIIJ();
        return C11520cm.LIZIZ(this.LLIIJI, j);
    }

    @Override // X.C0DR
    public final void LJ(C29321Dc c29321Dc) {
        C03800Cy c03800Cy = this.LLIIII;
        c03800Cy.getClass();
        C0DH c0dh = c03800Cy.LIZLLL;
        c0dh.getClass();
        c0dh.LIZ.LIZLLL(c29321Dc);
        c29321Dc.LLIIJLIL = true;
        LJJIIZ(null);
    }

    @Override // X.C0DR
    public final void LJI(C29321Dc node) {
        o.LJIIIZ(node, "node");
        C03800Cy c03800Cy = this.LLIIII;
        c03800Cy.getClass();
        c03800Cy.LIZIZ.LIZIZ(node);
        this.LLF = true;
    }

    @Override // X.C0DR
    public final long LJII(long j) {
        LJJIIJ();
        return C11520cm.LIZIZ(this.LLIIIZ, j);
    }

    @Override // X.C11A
    public final long LJIIIZ(long j) {
        LJJIIJ();
        long LIZIZ = C11520cm.LIZIZ(this.LLIIIZ, j);
        return C78923UyF.LIZ(C10370av.LIZLLL(this.LLIILII) + C10370av.LIZLLL(LIZIZ), C10370av.LJ(this.LLIILII) + C10370av.LJ(LIZIZ));
    }

    @Override // X.C0DR
    public final void LJIIJ(C29321Dc layoutNode) {
        o.LJIIIZ(layoutNode, "layoutNode");
        C1A5 c1a5 = this.LJLLL;
        c1a5.getClass();
        c1a5.LJIIL = true;
        if (!c1a5.LJIIIZ()) {
            return;
        }
        c1a5.LJIIJ(layoutNode);
    }

    @Override // X.C0DR
    public final void LJIILIIL(C1DK c1dk) {
        C03800Cy c03800Cy = this.LLIIII;
        c03800Cy.getClass();
        c03800Cy.LJ.LIZLLL(c1dk);
        LJJIIZ(null);
    }

    @Override // X.C0DR
    public final void LJIILJJIL(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (!this.LLJILLL.LJIIIIZZ(interfaceC65784Pro)) {
            this.LLJILLL.LIZLLL(interfaceC65784Pro);
        }
    }

    @Override // X.C11A
    public final long LJIILL(long j) {
        LJJIIJ();
        return C11520cm.LIZIZ(this.LLIIJI, C78923UyF.LIZ(C10370av.LIZLLL(j) - C10370av.LIZLLL(this.LLIILII), C10370av.LJ(j) - C10370av.LJ(this.LLIILII)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0068, code lost:
    
        if (r7 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJIJJLI(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45211q1.LJIJJLI(android.view.MotionEvent):int");
    }

    public final void LJJ(C29321Dc c29321Dc) {
        int i = 0;
        this.LLIIII.LJIILL(c29321Dc, false);
        C25710zf<C29321Dc> LJJ = c29321Dc.LJJ();
        int i2 = LJJ.LJLJI;
        if (i2 > 0) {
            C29321Dc[] c29321DcArr = LJJ.LJLIL;
            o.LJII(c29321DcArr, "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>");
            do {
                LJJ(c29321DcArr[i]);
                i++;
            } while (i < i2);
        }
    }

    public final boolean LJJIFFI(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (0.0f <= x && x <= getWidth() && 0.0f <= y && y <= getHeight()) {
            return true;
        }
        return false;
    }

    public final boolean LJJII(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.LLJIJIL) == null || motionEvent.getRawX() != motionEvent2.getRawX() || motionEvent.getRawY() != motionEvent2.getRawY()) {
            return true;
        }
        return false;
    }

    public final boolean LJJIIJZLJL(C0DN layer) {
        o.LJIIIZ(layer, "layer");
        if (this.LLIFFJFJJ != null && !C283919n.LJZ && Build.VERSION.SDK_INT < 23) {
            C284919x c284919x = this.LLJILJILJ;
            c284919x.LIZIZ();
            if (((C25710zf) c284919x.LJLIL).LJLJI >= 10) {
                return false;
            }
        }
        C284919x c284919x2 = this.LLJILJILJ;
        c284919x2.LIZIZ();
        ((C25710zf) c284919x2.LJLIL).LIZLLL(new WeakReference(layer, (ReferenceQueue) c284919x2.LJLILLLLZI));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        r3 = r3.LJIJJLI();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001c, code lost:
    
        if (r3 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0023, code lost:
    
        if (r3 != getRoot()) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        requestLayout();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
    
        if (r3 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r3.LLF != X.C0DL.InMeasureBlock) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIIZ(X.C29321Dc r3) {
        /*
            r2 = this;
            boolean r0 = r2.isLayoutRequested()
            if (r0 != 0) goto L38
            boolean r0 = r2.isAttachedToWindow()
            if (r0 == 0) goto L38
            boolean r0 = r2.wasMeasuredWithMultipleConstraints
            if (r0 == 0) goto L29
            if (r3 == 0) goto L29
        L12:
            X.0DL r1 = r3.LLF
            X.0DL r0 = X.C0DL.InMeasureBlock
            if (r1 != r0) goto L1f
            X.1Dc r3 = r3.LJIJJLI()
            if (r3 == 0) goto L1f
            goto L12
        L1f:
            X.1Dc r0 = r2.getRoot()
            if (r3 != r0) goto L29
            r2.requestLayout()
            return
        L29:
            int r0 = r2.getWidth()
            if (r0 == 0) goto L35
            int r0 = r2.getHeight()
            if (r0 != 0) goto L39
        L35:
            r2.requestLayout()
        L38:
            return
        L39:
            r2.invalidate()
            goto L38
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45211q1.LJJIIZ(X.1Dc):void");
    }

    public final int LJJIIZI(MotionEvent motionEvent) {
        Object obj;
        int i = 0;
        if (this.LLJJIJIL) {
            this.LLJJIJIL = false;
            C1A1 c1a1 = this.LJLJL;
            int metaState = motionEvent.getMetaState();
            c1a1.getClass();
            C1A1.LIZIZ.setValue(new AnonymousClass115(metaState));
        }
        C11S LIZ = this.LJZI.LIZ(motionEvent, this);
        if (LIZ != null) {
            List list = (List) LIZ.LIZIZ;
            ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    obj = listIterator.previous();
                    if (((C11T) obj).LJ) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            C11T c11t = (C11T) obj;
            if (c11t != null) {
                this.LJLIL = c11t.LIZLLL;
            }
            i = this.LJZL.LIZ(LIZ, this, LJJIFFI(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && (i & 1) == 0) {
                C11D c11d = this.LJZI;
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                c11d.LIZJ.delete(pointerId);
                c11d.LIZIZ.delete(pointerId);
            }
        } else {
            this.LJZL.LIZIZ();
        }
        return i;
    }

    @Override // android.view.View
    public final void autofill(SparseArray<AutofillValue> values) {
        C1N8 c1n8;
        o.LJIIIZ(values, "values");
        if (Build.VERSION.SDK_INT >= 26 && (c1n8 = this.LLD) != null) {
            int size = values.size();
            for (int i = 0; i < size; i++) {
                int keyAt = values.keyAt(i);
                AutofillValue value = values.get(keyAt);
                o.LJIIIIZZ(value, "value");
                if (C08280Ue.LIZLLL(value)) {
                    C08320Ui c08320Ui = c1n8.LIZIZ;
                    String value2 = C08280Ue.LJIIIIZZ(value).toString();
                    c08320Ui.getClass();
                    o.LJIIIZ(value2, "value");
                    ((LinkedHashMap) c08320Ui.LIZ).get(Integer.valueOf(keyAt));
                } else if (!C08280Ue.LIZIZ(value)) {
                    if (!C08280Ue.LIZJ(value)) {
                        if (C08280Ue.LJ(value)) {
                            throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "b/138604541:  Add onFill() callback for toggle"));
                        }
                    } else {
                        throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "b/138604541: Add onFill() callback for list"));
                    }
                } else {
                    throw new C39427Fdf(i0.LJFF("An operation is not implemented: ", "b/138604541: Add onFill() callback for date"));
                }
            }
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i) {
        return this.LJLLL.LIZIZ(i, this.LJLIL, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i) {
        return this.LJLLL.LIZIZ(i, this.LJLIL, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        Trace.beginSection("AndroidOwner:dispatchDraw");
        try {
            if (!isAttachedToWindow()) {
                LJIL(getRoot());
            }
            LIZ(true);
            this.LJZ = true;
            C11780dC c11780dC = this.LJLL;
            C1QR c1qr = c11780dC.LIZ;
            Canvas canvas2 = c1qr.LIZ;
            c1qr.LIZ = canvas;
            getRoot().LJIILLIIL(c1qr);
            C1QR c1qr2 = c11780dC.LIZ;
            c1qr2.getClass();
            o.LJIIIZ(canvas2, "<set-?>");
            c1qr2.LIZ = canvas2;
            if (true ^ ((ArrayList) this.LJLLLLLL).isEmpty()) {
                int size = ((ArrayList) this.LJLLLLLL).size();
                for (int i = 0; i < size; i++) {
                    ((C0DN) ((ArrayList) this.LJLLLLLL).get(i)).LJII();
                }
            }
            if (C283919n.LJZ) {
                int save = canvas.save();
                canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
                super.dispatchDraw(canvas);
                canvas.restoreToCount(save);
            }
            ((ArrayList) this.LJLLLLLL).clear();
            this.LJZ = false;
            List<C0DN> list = this.LJLZ;
            if (list != null) {
                ((ArrayList) this.LJLLLLLL).addAll(list);
                ((ArrayList) list).clear();
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [X.1fX] */
    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent event) {
        float LIZ;
        float LIZ2;
        AnonymousClass265<C38711fX> anonymousClass265;
        o.LJIIIZ(event, "event");
        if (event.getActionMasked() == 8) {
            if (event.isFromSource(4194304)) {
                ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                float f = -event.getAxisValue(26);
                Context context = getContext();
                int i = Build.VERSION.SDK_INT;
                if (i >= 26) {
                    LIZ = C16500ko.LIZIZ(viewConfiguration);
                } else {
                    LIZ = C16520kq.LIZ(viewConfiguration, context);
                }
                final float f2 = LIZ * f;
                Context context2 = getContext();
                if (i >= 26) {
                    LIZ2 = C16500ko.LIZ(viewConfiguration);
                } else {
                    LIZ2 = C16520kq.LIZ(viewConfiguration, context2);
                }
                final float f3 = LIZ2 * f;
                final long eventTime = event.getEventTime();
                ?? r4 = new InterfaceC23340vq(eventTime, f2, f3) { // from class: X.1fX
                    public final float LIZ;
                    public final float LIZIZ;
                    public final long LIZJ;

                    public final int hashCode() {
                        return C16880lQ.LLJIJIL(this.LIZJ) + C47959Irz.LIZIZ(this.LIZIZ, C47959Irz.LIZIZ(this.LIZ, 0, 31), 31);
                    }

                    public final String toString() {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append("RotaryScrollEvent(verticalScrollPixels=");
                        LIZ3.append(this.LIZ);
                        LIZ3.append(",horizontalScrollPixels=");
                        LIZ3.append(this.LIZIZ);
                        LIZ3.append(",uptimeMillis=");
                        return C47135Ieh.LIZIZ(LIZ3, this.LIZJ, ')', LIZ3);
                    }

                    public final boolean equals(Object obj) {
                        if (!(obj instanceof C38711fX)) {
                            return false;
                        }
                        C38711fX c38711fX = (C38711fX) obj;
                        if (c38711fX.LIZ != this.LIZ || c38711fX.LIZIZ != this.LIZIZ || c38711fX.LIZJ != this.LIZJ) {
                            return false;
                        }
                        return true;
                    }

                    {
                        this.LIZ = f2;
                        this.LIZIZ = f3;
                        this.LIZJ = eventTime;
                    }
                };
                C51171zd LIZ3 = C0ZA.LIZ(this.LJLJJLL.LIZ);
                if (LIZ3 != null && (anonymousClass265 = LIZ3.LJLJL) != null && (anonymousClass265.LIZIZ(r4) || anonymousClass265.LIZ(r4))) {
                    return true;
                }
            } else {
                if (LJJI(event) || !isAttachedToWindow()) {
                    return super.dispatchGenericMotionEvent(event);
                }
                if ((LJIJJLI(event) & 1) != 0) {
                    return true;
                }
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(event);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45211q1.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
    
        if (r8 != null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
    
        if (r8.LIZIZ(r11) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        return r8.LIZ(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0084, code lost:
    
        if (r8 != null) goto L24;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchKeyEvent(android.view.KeyEvent r11) {
        /*
            r10 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.LJIIIZ(r11, r0)
            boolean r0 = r10.isFocused()
            if (r0 == 0) goto L8c
            X.1A1 r0 = r10.LJLJL
            int r2 = r11.getMetaState()
            r0.getClass()
            androidx.compose.runtime.ParcelableSnapshotMutableState r1 = X.C1A1.LIZIZ
            X.115 r0 = new X.115
            r0.<init>(r2)
            r1.setValue(r0)
            X.26u r0 = r10.LJLJLJ
            r0.getClass()
            X.1zd r0 = r0.LJLJI
            if (r0 == 0) goto L36
            X.1zd r9 = X.C0Z0.LIZIZ(r0)
            if (r9 == 0) goto L36
            X.29g r0 = r9.LJLLJ
            r8 = 0
            if (r0 == 0) goto L36
            X.1Dc r7 = r0.LJLJL
            if (r7 != 0) goto L41
        L36:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "KeyEvent can't be processed because this key input node is not active."
            r0.toString()
            r1.<init>(r0)
            throw r1
        L41:
            X.0zf<X.26u> r0 = r9.LJLLLLLL
            int r6 = r0.LJLJI
            if (r6 <= 0) goto L82
            T[] r5 = r0.LJLIL
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T of androidx.compose.runtime.collection.MutableVector>"
            kotlin.jvm.internal.o.LJII(r5, r0)
            r4 = 0
        L4f:
            r3 = r5[r4]
            X.26u r3 = (X.C531626u) r3
            X.1Dc r0 = r3.LJLJJL
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r7)
            if (r0 == 0) goto L5e
            if (r8 != 0) goto L6c
        L5d:
            r8 = r3
        L5e:
            int r4 = r4 + 1
            if (r4 < r6) goto L4f
            if (r8 == 0) goto L82
        L64:
            boolean r0 = r8.LIZIZ(r11)
            if (r0 == 0) goto L87
            r0 = 1
            goto L90
        L6c:
            X.1Dc r2 = r3.LJLJJL
            r1 = r8
        L6f:
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r3)
            if (r0 != 0) goto L5e
            X.26u r1 = r1.LJLJJI
            if (r1 == 0) goto L5d
            X.1Dc r0 = r1.LJLJJL
            boolean r0 = kotlin.jvm.internal.o.LJ(r0, r2)
            if (r0 != 0) goto L6f
            goto L5d
        L82:
            X.26u r8 = r9.LJLLLL
            if (r8 == 0) goto L36
            goto L64
        L87:
            boolean r0 = r8.LIZ(r11)
            goto L90
        L8c:
            boolean r0 = super.dispatchKeyEvent(r11)
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45211q1.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        o.LJIIIZ(motionEvent, "motionEvent");
        if (this.LLJJIII) {
            removeCallbacks(this.LLJJI);
            MotionEvent motionEvent2 = this.LLJIJIL;
            o.LJI(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || motionEvent2.getSource() != motionEvent.getSource() || motionEvent2.getToolType(0) != motionEvent.getToolType(0)) {
                this.LLJJI.run();
            } else {
                this.LLJJIII = false;
            }
        }
        if (LJJI(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !LJJII(motionEvent)) {
            return false;
        }
        int LJIJJLI = LJIJJLI(motionEvent);
        if ((LJIJJLI & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        if ((LJIJJLI & 1) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        r1 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View findViewByAccessibilityIdTraversal(int r7) {
        /*
            r6 = this;
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.NoSuchMethodException -> L31
            r0 = 29
            if (r1 < r0) goto L2c
            java.lang.Class<android.view.View> r5 = android.view.View.class
            java.lang.String r2 = "findViewByAccessibilityIdTraversal"
            r4 = 1
            java.lang.Class[] r1 = new java.lang.Class[r4]     // Catch: java.lang.NoSuchMethodException -> L31
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch: java.lang.NoSuchMethodException -> L31
            r3 = 0
            r1[r3] = r0     // Catch: java.lang.NoSuchMethodException -> L31
            java.lang.reflect.Method r2 = r5.getDeclaredMethod(r2, r1)     // Catch: java.lang.NoSuchMethodException -> L31
            r2.setAccessible(r4)     // Catch: java.lang.NoSuchMethodException -> L31
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch: java.lang.NoSuchMethodException -> L31
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.NoSuchMethodException -> L31
            r1[r3] = r0     // Catch: java.lang.NoSuchMethodException -> L31
            java.lang.Object r1 = r2.invoke(r6, r1)     // Catch: java.lang.NoSuchMethodException -> L31
            boolean r0 = r1 instanceof android.view.View     // Catch: java.lang.NoSuchMethodException -> L31
            if (r0 == 0) goto L31
            android.view.View r1 = (android.view.View) r1     // Catch: java.lang.NoSuchMethodException -> L31
            goto L32
        L2c:
            android.view.View r1 = LJIJJ(r7, r6)     // Catch: java.lang.NoSuchMethodException -> L31
            goto L32
        L31:
            r1 = 0
        L32:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45211q1.findViewByAccessibilityIdTraversal(int):android.view.View");
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        o.LJIIIZ(rect, "rect");
        C51171zd LIZ = C0ZA.LIZ(this.LJLJJLL.LIZ);
        if (LIZ != null) {
            C10390ax LIZLLL = C0Z0.LIZLLL(LIZ);
            rect.left = O6R.LJJIIZ(LIZLLL.LIZ);
            rect.top = O6R.LJJIIZ(LIZLLL.LIZIZ);
            rect.right = O6R.LJJIIZ(LIZLLL.LIZJ);
            rect.bottom = O6R.LJJIIZ(LIZLLL.LIZLLL);
            if (C76800UCe.LIZ != null) {
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration newConfig) {
        int i;
        o.LJIIIZ(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        this.LJLJJL = C78847Ux1.LIZIZ(context);
        int i2 = Build.VERSION.SDK_INT;
        int i3 = 0;
        if (i2 >= 31) {
            i = newConfig.fontWeightAdjustment;
        } else {
            i = 0;
        }
        if (i != this.LLILZIL) {
            if (i2 >= 31) {
                i3 = newConfig.fontWeightAdjustment;
            }
            this.LLILZIL = i3;
            Context context2 = getContext();
            o.LJIIIIZZ(context2, "context");
            setFontFamilyResolver(C77413UZt.LJIIIZ(context2));
        }
        this.LL.invoke(newConfig);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Type inference failed for: r0v25, types: [X.1U0] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r15) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45211q1.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onResume(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        setShowLayoutBounds(AnonymousClass047.LIZ());
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        EnumC23500w6 enumC23500w6;
        if (this.LJLJI) {
            if (i != 0) {
                if (i != 1) {
                    enumC23500w6 = EnumC23500w6.Ltr;
                } else {
                    enumC23500w6 = EnumC23500w6.Rtl;
                }
            } else {
                enumC23500w6 = EnumC23500w6.Ltr;
            }
            setLayoutDirection(enumC23500w6);
            C1PC c1pc = this.LJLJJLL;
            c1pc.getClass();
            o.LJIIIZ(enumC23500w6, "<set-?>");
            c1pc.LIZJ = enumC23500w6;
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        boolean LIZ;
        this.LJLJL.LIZ.setValue(Boolean.valueOf(z));
        this.LLJJIJIL = true;
        super.onWindowFocusChanged(z);
        if (z && getShowLayoutBounds() != (LIZ = AnonymousClass047.LIZ())) {
            setShowLayoutBounds(LIZ);
            LJIL(getRoot());
        }
    }

    public final void setBlockAfterAttachToWindow(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LJLILLLLZI = interfaceC65784Pro;
    }

    public final void setConfigurationChangeObserver(InterfaceC88472Yns<? super Configuration, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(interfaceC88472Yns, "<set-?>");
        this.LL = interfaceC88472Yns;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j) {
        this.LLIIJLIL = j;
    }

    public final void setOnViewTreeOwnersAvailable(InterfaceC88472Yns<? super AnonymousClass048, C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        AnonymousClass048 viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            callback.invoke(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.LLIL = callback;
        }
    }

    @Override // X.C0DR
    public void setShowLayoutBounds(boolean z) {
        this.LLFZ = z;
    }

    public static View LJIJJ(int i, View view) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
            declaredMethod.setAccessible(true);
            if (o.LJ(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    o.LJIIIIZZ(childAt, "currentView.getChildAt(i)");
                    View LJIJJ = LJIJJ(i, childAt);
                    if (LJIJJ != null) {
                        return LJIJJ;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }

    @Override // X.C0DR
    public final void LJIIJJI(C29321Dc layoutNode, long j) {
        o.LJIIIZ(layoutNode, "layoutNode");
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.LLIIII.LJII(layoutNode, j);
            this.LLIIII.LIZIZ(false);
        } finally {
            Trace.endSection();
        }
    }

    @Override // X.C0DR
    public final C0DN LJIIZILJ(final IDqS420S0100000 invalidateParentLayer, final InterfaceC88472Yns drawBlock) {
        Object obj;
        C05N c05n;
        o.LJIIIZ(drawBlock, "drawBlock");
        o.LJIIIZ(invalidateParentLayer, "invalidateParentLayer");
        C284919x c284919x = this.LLJILJILJ;
        c284919x.LIZIZ();
        while (true) {
            if (((C25710zf) c284919x.LJLIL).LJIIJJI()) {
                obj = ((Reference) ((C25710zf) c284919x.LJLIL).LJIILJJIL(r1.LJLJI - 1)).get();
                if (obj != null) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        C0DN c0dn = (C0DN) obj;
        if (c0dn != null) {
            c0dn.LIZLLL(invalidateParentLayer, drawBlock);
            return c0dn;
        }
        if (isHardwareAccelerated() && Build.VERSION.SDK_INT >= 23 && this.LLIILZL) {
            try {
                return new C0DN(this, drawBlock, invalidateParentLayer) { // from class: X.1A0
                    public static final C45361qG LJLLJ = C45361qG.LJLIL;
                    public final C45211q1 LJLIL;
                    public InterfaceC88472Yns<? super InterfaceC11750d9, C76800UCe> LJLILLLLZI;
                    public InterfaceC65784Pro<C76800UCe> LJLJI;
                    public boolean LJLJJI;
                    public final C016504r LJLJJL;
                    public boolean LJLJJLL;
                    public boolean LJLJL;
                    public C1QW LJLJLJ;
                    public final C015304f<C05K> LJLJLLL;
                    public final C11780dC LJLL;
                    public long LJLLI;
                    public final C05K LJLLILLLL;

                    /* JADX WARN: Removed duplicated region for block: B:14:0x0029  */
                    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
                    @Override // X.C0DN
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LJII() {
                        /*
                            r4 = this;
                            boolean r0 = r4.LJLJJI
                            if (r0 != 0) goto Lc
                            X.05K r0 = r4.LJLLILLLL
                            boolean r0 = r0.LJIJJ()
                            if (r0 != 0) goto L30
                        Lc:
                            r0 = 0
                            r4.LJIIIZ(r0)
                            X.05K r0 = r4.LJLLILLLL
                            boolean r0 = r0.LJJIJ()
                            if (r0 == 0) goto L31
                            X.04r r1 = r4.LJLJJL
                            boolean r0 = r1.LJIIIIZZ
                            r0 = r0 ^ 1
                            if (r0 != 0) goto L31
                            r1.LJ()
                            X.0cv r3 = r1.LJI
                        L25:
                            X.Yns<? super X.0d9, X.UCe> r2 = r4.LJLILLLLZI
                            if (r2 == 0) goto L30
                            X.05K r1 = r4.LJLLILLLL
                            X.0dC r0 = r4.LJLL
                            r1.LJJIIZI(r0, r3, r2)
                        L30:
                            return
                        L31:
                            r3 = 0
                            goto L25
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1A0.LJII():void");
                    }

                    @Override // X.C0DN
                    public final void destroy() {
                        if (this.LJLLILLLL.LJIJJ()) {
                            this.LJLLILLLL.LJJIFFI();
                        }
                        this.LJLILLLLZI = null;
                        this.LJLJI = null;
                        this.LJLJJLL = true;
                        LJIIIZ(false);
                        C45211q1 c45211q1 = this.LJLIL;
                        c45211q1.LLF = true;
                        c45211q1.LJJIIJZLJL(this);
                    }

                    @Override // X.C0DN
                    public final void invalidate() {
                        if (!this.LJLJJI && !this.LJLJJLL) {
                            this.LJLIL.invalidate();
                            LJIIIZ(true);
                        }
                    }

                    @Override // X.C0DN
                    public final boolean LJ(long j) {
                        float LIZLLL = C10370av.LIZLLL(j);
                        float LJ = C10370av.LJ(j);
                        if (this.LJLLILLLL.LJJIL()) {
                            if (0.0f <= LIZLLL && LIZLLL < this.LJLLILLLL.getWidth() && 0.0f <= LJ && LJ < this.LJLLILLLL.getHeight()) {
                                return true;
                            }
                            return false;
                        }
                        if (!this.LJLLILLLL.LJJIJ()) {
                            return true;
                        }
                        return this.LJLJJL.LIZJ(j);
                    }

                    @Override // X.C0DN
                    public final void LJFF(InterfaceC11750d9 canvas) {
                        o.LJIIIZ(canvas, "canvas");
                        Canvas canvas2 = ((C1QR) canvas).LIZ;
                        boolean z = false;
                        if (canvas2.isHardwareAccelerated()) {
                            LJII();
                            if (this.LJLLILLLL.LJJIZ() > 0.0f) {
                                z = true;
                            }
                            this.LJLJL = z;
                            if (z) {
                                canvas.LJIJI();
                            }
                            this.LJLLILLLL.LJIJ(canvas2);
                            if (this.LJLJL) {
                                canvas.LJFF();
                                return;
                            }
                            return;
                        }
                        float left = this.LJLLILLLL.getLeft();
                        float top = this.LJLLILLLL.getTop();
                        float LJJIJL = this.LJLLILLLL.LJJIJL();
                        float LJJIJIL = this.LJLLILLLL.LJJIJIL();
                        if (this.LJLLILLLL.LIZ() < 1.0f) {
                            C1QW c1qw = this.LJLJLJ;
                            if (c1qw == null) {
                                c1qw = new C1QW();
                                this.LJLJLJ = c1qw;
                            }
                            c1qw.setAlpha(this.LJLLILLLL.LIZ());
                            canvas2.saveLayer(left, top, LJJIJL, LJJIJIL, c1qw.LIZ);
                        } else {
                            canvas.LJIIL();
                        }
                        canvas.LJIILLIIL(left, top);
                        canvas.LJIILIIL(this.LJLJLLL.LIZIZ(this.LJLLILLLL));
                        if (this.LJLLILLLL.LJJIJ() || this.LJLLILLLL.LJJIL()) {
                            this.LJLJJL.LIZ(canvas);
                        }
                        InterfaceC88472Yns<? super InterfaceC11750d9, C76800UCe> interfaceC88472Yns = this.LJLILLLLZI;
                        if (interfaceC88472Yns != null) {
                            interfaceC88472Yns.invoke(canvas);
                        }
                        canvas.LJIIJ();
                        LJIIIZ(false);
                    }

                    @Override // X.C0DN
                    public final void LJI(long j) {
                        int left = this.LJLLILLLL.getLeft();
                        int top = this.LJLLILLLL.getTop();
                        int i = (int) (j >> 32);
                        int LIZJ = C23450w1.LIZJ(j);
                        if (left != i || top != LIZJ) {
                            this.LJLLILLLL.LJJIJIIJIL(i - left);
                            this.LJLLILLLL.LJJIIJZLJL(LIZJ - top);
                            if (Build.VERSION.SDK_INT >= 26) {
                                C04K.LIZ(this.LJLIL);
                            } else {
                                this.LJLIL.invalidate();
                            }
                            this.LJLJLLL.LIZJ();
                        }
                    }

                    @Override // X.C0DN
                    public final void LJIIIIZZ(long j) {
                        int i = (int) (j >> 32);
                        int LIZIZ = C23490w5.LIZIZ(j);
                        float f = i;
                        this.LJLLILLLL.LJIJJLI(C12000dY.LIZ(this.LJLLI) * f);
                        float f2 = LIZIZ;
                        this.LJLLILLLL.LJIL(C12000dY.LIZIZ(this.LJLLI) * f2);
                        C05K c05k = this.LJLLILLLL;
                        if (c05k.LJJIJLIJ(c05k.getLeft(), this.LJLLILLLL.getTop(), this.LJLLILLLL.getLeft() + i, this.LJLLILLLL.getTop() + LIZIZ)) {
                            C016504r c016504r = this.LJLJJL;
                            long LIZIZ2 = C1DF.LIZIZ(f, f2);
                            if (!C10430b1.LIZ(c016504r.LIZLLL, LIZIZ2)) {
                                c016504r.LIZLLL = LIZIZ2;
                                c016504r.LJII = true;
                            }
                            this.LJLLILLLL.LJJ(this.LJLJJL.LIZIZ());
                            if (!this.LJLJJI && !this.LJLJJLL) {
                                this.LJLIL.invalidate();
                                LJIIIZ(true);
                            }
                            this.LJLJLLL.LIZJ();
                        }
                    }

                    public final void LJIIIZ(boolean z) {
                        if (z != this.LJLJJI) {
                            this.LJLJJI = z;
                            this.LJLIL.LJJIII(this, z);
                        }
                    }

                    @Override // X.C0DN
                    public final void LIZIZ(C10350at c10350at, boolean z) {
                        if (z) {
                            float[] LIZ = this.LJLJLLL.LIZ(this.LJLLILLLL);
                            if (LIZ == null) {
                                c10350at.LIZ = 0.0f;
                                c10350at.LIZIZ = 0.0f;
                                c10350at.LIZJ = 0.0f;
                                c10350at.LIZLLL = 0.0f;
                                return;
                            }
                            C11520cm.LIZJ(LIZ, c10350at);
                            return;
                        }
                        C11520cm.LIZJ(this.LJLJLLL.LIZIZ(this.LJLLILLLL), c10350at);
                    }

                    @Override // X.C0DN
                    public final long LIZJ(long j, boolean z) {
                        if (z) {
                            float[] LIZ = this.LJLJLLL.LIZ(this.LJLLILLLL);
                            if (LIZ != null) {
                                return C11520cm.LIZIZ(LIZ, j);
                            }
                            return C10370av.LIZJ;
                        }
                        return C11520cm.LIZIZ(this.LJLJLLL.LIZIZ(this.LJLLILLLL), j);
                    }

                    @Override // X.C0DN
                    public final void LIZLLL(IDqS420S0100000 invalidateParentLayer2, InterfaceC88472Yns drawBlock2) {
                        o.LJIIIZ(drawBlock2, "drawBlock");
                        o.LJIIIZ(invalidateParentLayer2, "invalidateParentLayer");
                        LJIIIZ(false);
                        this.LJLJJLL = false;
                        this.LJLJL = false;
                        this.LJLLI = C12000dY.LIZIZ;
                        this.LJLILLLLZI = drawBlock2;
                        this.LJLJI = invalidateParentLayer2;
                    }

                    {
                        C05K c05k;
                        o.LJIIIZ(this, "ownerView");
                        o.LJIIIZ(drawBlock, "drawBlock");
                        o.LJIIIZ(invalidateParentLayer, "invalidateParentLayer");
                        this.LJLIL = this;
                        this.LJLILLLLZI = drawBlock;
                        this.LJLJI = invalidateParentLayer;
                        this.LJLJJL = new C016504r(this.getDensity());
                        this.LJLJLLL = new C015304f<>(LJLLJ);
                        this.LJLL = new C11780dC();
                        this.LJLLI = C12000dY.LIZIZ;
                        if (Build.VERSION.SDK_INT >= 29) {
                            c05k = new C05K(this) { // from class: X.19w
                                public final RenderNode LIZ;

                                @Override // X.C05K
                                public final boolean LJJIIZ() {
                                    return this.LIZ.setHasOverlappingRendering(true);
                                }

                                @Override // X.C05K
                                public final float LIZ() {
                                    return this.LIZ.getAlpha();
                                }

                                @Override // X.C05K
                                public final void LJIIIZ() {
                                    if (Build.VERSION.SDK_INT >= 31) {
                                        C017204y.LIZ(this.LIZ, null);
                                    }
                                }

                                @Override // X.C05K
                                public final boolean LJIJJ() {
                                    return this.LIZ.hasDisplayList();
                                }

                                @Override // X.C05K
                                public final void LJJIFFI() {
                                    this.LIZ.discardDisplayList();
                                }

                                @Override // X.C05K
                                public final boolean LJJIJ() {
                                    return this.LIZ.getClipToOutline();
                                }

                                @Override // X.C05K
                                public final int LJJIJIL() {
                                    return this.LIZ.getBottom();
                                }

                                @Override // X.C05K
                                public final int LJJIJL() {
                                    return this.LIZ.getRight();
                                }

                                @Override // X.C05K
                                public final boolean LJJIL() {
                                    return this.LIZ.getClipToBounds();
                                }

                                @Override // X.C05K
                                public final float LJJIZ() {
                                    return this.LIZ.getElevation();
                                }

                                @Override // X.C05K
                                public final int getHeight() {
                                    return this.LIZ.getHeight();
                                }

                                @Override // X.C05K
                                public final int getLeft() {
                                    return this.LIZ.getLeft();
                                }

                                @Override // X.C05K
                                public final int getTop() {
                                    return this.LIZ.getTop();
                                }

                                @Override // X.C05K
                                public final int getWidth() {
                                    return this.LIZ.getWidth();
                                }

                                {
                                    o.LJIIIZ(this, "ownerView");
                                    this.LIZ = new RenderNode("Compose");
                                }

                                @Override // X.C05K
                                public final void LIZJ(float f) {
                                    this.LIZ.setRotationX(f);
                                }

                                @Override // X.C05K
                                public final void LJ(float f) {
                                    this.LIZ.setRotationY(f);
                                }

                                @Override // X.C05K
                                public final void LJFF(float f) {
                                    this.LIZ.setRotationZ(f);
                                }

                                @Override // X.C05K
                                public final void LJII(float f) {
                                    this.LIZ.setTranslationY(f);
                                }

                                @Override // X.C05K
                                public final void LJIIIIZZ(float f) {
                                    this.LIZ.setCameraDistance(f);
                                }

                                @Override // X.C05K
                                public final void LJIILJJIL(float f) {
                                    this.LIZ.setScaleX(f);
                                }

                                @Override // X.C05K
                                public final void LJIILLIIL(float f) {
                                    this.LIZ.setScaleY(f);
                                }

                                @Override // X.C05K
                                public final void LJIIZILJ(float f) {
                                    this.LIZ.setTranslationX(f);
                                }

                                @Override // X.C05K
                                public final void LJIJ(Canvas canvas) {
                                    canvas.drawRenderNode(this.LIZ);
                                }

                                @Override // X.C05K
                                public final void LJIJI(boolean z) {
                                    this.LIZ.setClipToBounds(z);
                                }

                                @Override // X.C05K
                                public final void LJIJJLI(float f) {
                                    this.LIZ.setPivotX(f);
                                }

                                @Override // X.C05K
                                public final void LJIL(float f) {
                                    this.LIZ.setPivotY(f);
                                }

                                @Override // X.C05K
                                public final void LJJ(Outline outline) {
                                    this.LIZ.setOutline(outline);
                                }

                                @Override // X.C05K
                                public final void LJJI(boolean z) {
                                    this.LIZ.setClipToOutline(z);
                                }

                                @Override // X.C05K
                                public final void LJJII(int i) {
                                    this.LIZ.setAmbientShadowColor(i);
                                }

                                @Override // X.C05K
                                public final void LJJIII(int i) {
                                    this.LIZ.setSpotShadowColor(i);
                                }

                                @Override // X.C05K
                                public final void LJJIIJ(float f) {
                                    this.LIZ.setElevation(f);
                                }

                                @Override // X.C05K
                                public final void LJJIIJZLJL(int i) {
                                    this.LIZ.offsetTopAndBottom(i);
                                }

                                @Override // X.C05K
                                public final void LJJIJIIJI(Matrix matrix) {
                                    o.LJIIIZ(matrix, "matrix");
                                    this.LIZ.getMatrix(matrix);
                                }

                                @Override // X.C05K
                                public final void LJJIJIIJIL(int i) {
                                    this.LIZ.offsetLeftAndRight(i);
                                }

                                @Override // X.C05K
                                public final void setAlpha(float f) {
                                    this.LIZ.setAlpha(f);
                                }

                                @Override // X.C05K
                                public final void LJJIIZI(C11780dC canvasHolder, InterfaceC11610cv interfaceC11610cv, InterfaceC88472Yns<? super InterfaceC11750d9, C76800UCe> interfaceC88472Yns) {
                                    o.LJIIIZ(canvasHolder, "canvasHolder");
                                    RecordingCanvas beginRecording = this.LIZ.beginRecording();
                                    o.LJIIIIZZ(beginRecording, "renderNode.beginRecording()");
                                    C1QR c1qr = canvasHolder.LIZ;
                                    Canvas canvas = c1qr.LIZ;
                                    c1qr.LIZ = beginRecording;
                                    if (interfaceC11610cv != null) {
                                        c1qr.LJIIL();
                                        GFJ.LIZ(c1qr, interfaceC11610cv);
                                    }
                                    interfaceC88472Yns.invoke(c1qr);
                                    if (interfaceC11610cv != null) {
                                        c1qr.LJIIJ();
                                    }
                                    C1QR c1qr2 = canvasHolder.LIZ;
                                    c1qr2.getClass();
                                    o.LJIIIZ(canvas, "<set-?>");
                                    c1qr2.LIZ = canvas;
                                    this.LIZ.endRecording();
                                }

                                @Override // X.C05K
                                public final boolean LJJIJLIJ(int i, int i2, int i3, int i4) {
                                    return this.LIZ.setPosition(i, i2, i3, i4);
                                }
                            };
                        } else {
                            c05k = new C05K(this) { // from class: X.19t
                                public static boolean LJI = true;
                                public final android.view.RenderNode LIZ;
                                public int LIZIZ;
                                public int LIZJ;
                                public int LIZLLL;
                                public int LJ;
                                public boolean LJFF;

                                @Override // X.C05K
                                public final void LJIIIZ() {
                                }

                                @Override // X.C05K
                                public final boolean LJJIIZ() {
                                    return this.LIZ.setHasOverlappingRendering(true);
                                }

                                @Override // X.C05K
                                public final float LIZ() {
                                    return this.LIZ.getAlpha();
                                }

                                @Override // X.C05K
                                public final boolean LJIJJ() {
                                    return this.LIZ.isValid();
                                }

                                @Override // X.C05K
                                public final void LJJIFFI() {
                                    if (Build.VERSION.SDK_INT >= 24) {
                                        AnonymousClass058.LIZ(this.LIZ);
                                    } else {
                                        AnonymousClass054.LIZ(this.LIZ);
                                    }
                                }

                                @Override // X.C05K
                                public final boolean LJJIJ() {
                                    return this.LIZ.getClipToOutline();
                                }

                                @Override // X.C05K
                                public final float LJJIZ() {
                                    return this.LIZ.getElevation();
                                }

                                @Override // X.C05K
                                public final int getHeight() {
                                    return this.LJ - this.LIZJ;
                                }

                                @Override // X.C05K
                                public final int getWidth() {
                                    return this.LIZLLL - this.LIZIZ;
                                }

                                @Override // X.C05K
                                public final int LJJIJIL() {
                                    return this.LJ;
                                }

                                @Override // X.C05K
                                public final int LJJIJL() {
                                    return this.LIZLLL;
                                }

                                @Override // X.C05K
                                public final boolean LJJIL() {
                                    return this.LJFF;
                                }

                                @Override // X.C05K
                                public final int getLeft() {
                                    return this.LIZIZ;
                                }

                                @Override // X.C05K
                                public final int getTop() {
                                    return this.LIZJ;
                                }

                                {
                                    o.LJIIIZ(this, "ownerView");
                                    android.view.RenderNode create = android.view.RenderNode.create("Compose", this);
                                    o.LJIIIIZZ(create, "create(\"Compose\", ownerView)");
                                    this.LIZ = create;
                                    if (LJI) {
                                        create.setScaleX(create.getScaleX());
                                        create.setScaleY(create.getScaleY());
                                        create.setTranslationX(create.getTranslationX());
                                        create.setTranslationY(create.getTranslationY());
                                        create.setElevation(create.getElevation());
                                        create.setRotation(create.getRotation());
                                        create.setRotationX(create.getRotationX());
                                        create.setRotationY(create.getRotationY());
                                        create.setCameraDistance(create.getCameraDistance());
                                        create.setPivotX(create.getPivotX());
                                        create.setPivotY(create.getPivotY());
                                        create.setClipToOutline(create.getClipToOutline());
                                        create.setClipToBounds(false);
                                        create.setAlpha(create.getAlpha());
                                        create.isValid();
                                        create.setLeftTopRightBottom(0, 0, 0, 0);
                                        create.offsetLeftAndRight(0);
                                        create.offsetTopAndBottom(0);
                                        int i = Build.VERSION.SDK_INT;
                                        if (i >= 28) {
                                            C05A.LIZJ(create, C05A.LIZ(create));
                                            C05A.LIZLLL(create, C05A.LIZIZ(create));
                                        } else if (i < 24) {
                                            AnonymousClass054.LIZ(create);
                                            LJI = false;
                                        }
                                        AnonymousClass058.LIZ(create);
                                        LJI = false;
                                    }
                                }

                                @Override // X.C05K
                                public final void LIZJ(float f) {
                                    this.LIZ.setRotationX(f);
                                }

                                @Override // X.C05K
                                public final void LJ(float f) {
                                    this.LIZ.setRotationY(f);
                                }

                                @Override // X.C05K
                                public final void LJFF(float f) {
                                    this.LIZ.setRotation(f);
                                }

                                @Override // X.C05K
                                public final void LJII(float f) {
                                    this.LIZ.setTranslationY(f);
                                }

                                @Override // X.C05K
                                public final void LJIIIIZZ(float f) {
                                    this.LIZ.setCameraDistance(-f);
                                }

                                @Override // X.C05K
                                public final void LJIILJJIL(float f) {
                                    this.LIZ.setScaleX(f);
                                }

                                @Override // X.C05K
                                public final void LJIILLIIL(float f) {
                                    this.LIZ.setScaleY(f);
                                }

                                @Override // X.C05K
                                public final void LJIIZILJ(float f) {
                                    this.LIZ.setTranslationX(f);
                                }

                                @Override // X.C05K
                                public final void LJIJ(Canvas canvas) {
                                    ((DisplayListCanvas) canvas).drawRenderNode(this.LIZ);
                                }

                                @Override // X.C05K
                                public final void LJIJI(boolean z) {
                                    this.LJFF = z;
                                    this.LIZ.setClipToBounds(z);
                                }

                                @Override // X.C05K
                                public final void LJIJJLI(float f) {
                                    this.LIZ.setPivotX(f);
                                }

                                @Override // X.C05K
                                public final void LJIL(float f) {
                                    this.LIZ.setPivotY(f);
                                }

                                @Override // X.C05K
                                public final void LJJ(Outline outline) {
                                    this.LIZ.setOutline(outline);
                                }

                                @Override // X.C05K
                                public final void LJJI(boolean z) {
                                    this.LIZ.setClipToOutline(z);
                                }

                                @Override // X.C05K
                                public final void LJJII(int i) {
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        C05A.LIZJ(this.LIZ, i);
                                    }
                                }

                                @Override // X.C05K
                                public final void LJJIII(int i) {
                                    if (Build.VERSION.SDK_INT >= 28) {
                                        C05A.LIZLLL(this.LIZ, i);
                                    }
                                }

                                @Override // X.C05K
                                public final void LJJIIJ(float f) {
                                    this.LIZ.setElevation(f);
                                }

                                @Override // X.C05K
                                public final void LJJIIJZLJL(int i) {
                                    this.LIZJ += i;
                                    this.LJ += i;
                                    this.LIZ.offsetTopAndBottom(i);
                                }

                                @Override // X.C05K
                                public final void LJJIJIIJI(Matrix matrix) {
                                    o.LJIIIZ(matrix, "matrix");
                                    this.LIZ.getMatrix(matrix);
                                }

                                @Override // X.C05K
                                public final void LJJIJIIJIL(int i) {
                                    this.LIZIZ += i;
                                    this.LIZLLL += i;
                                    this.LIZ.offsetLeftAndRight(i);
                                }

                                @Override // X.C05K
                                public final void setAlpha(float f) {
                                    this.LIZ.setAlpha(f);
                                }

                                @Override // X.C05K
                                public final void LJJIIZI(C11780dC canvasHolder, InterfaceC11610cv interfaceC11610cv, InterfaceC88472Yns<? super InterfaceC11750d9, C76800UCe> interfaceC88472Yns) {
                                    o.LJIIIZ(canvasHolder, "canvasHolder");
                                    Canvas start = this.LIZ.start(this.LIZLLL - this.LIZIZ, this.LJ - this.LIZJ);
                                    o.LJIIIIZZ(start, "renderNode.start(width, height)");
                                    C1QR c1qr = canvasHolder.LIZ;
                                    Canvas canvas = c1qr.LIZ;
                                    c1qr.LIZ = start;
                                    if (interfaceC11610cv != null) {
                                        c1qr.LJIIL();
                                        GFJ.LIZ(c1qr, interfaceC11610cv);
                                    }
                                    interfaceC88472Yns.invoke(c1qr);
                                    if (interfaceC11610cv != null) {
                                        c1qr.LJIIJ();
                                    }
                                    C1QR c1qr2 = canvasHolder.LIZ;
                                    c1qr2.getClass();
                                    o.LJIIIZ(canvas, "<set-?>");
                                    c1qr2.LIZ = canvas;
                                    this.LIZ.end(start);
                                }

                                @Override // X.C05K
                                public final boolean LJJIJLIJ(int i, int i2, int i3, int i4) {
                                    this.LIZIZ = i;
                                    this.LIZJ = i2;
                                    this.LIZLLL = i3;
                                    this.LJ = i4;
                                    return this.LIZ.setLeftTopRightBottom(i, i2, i3, i4);
                                }
                            };
                        }
                        c05k.LJJIIZ();
                        this.LJLLILLLL = c05k;
                    }

                    @Override // X.C0DN
                    public final void LIZ(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, InterfaceC11790dD shape, boolean z, long j2, long j3, EnumC23500w6 layoutDirection, InterfaceC23370vt density) {
                        boolean z2;
                        boolean z3;
                        boolean z4;
                        InterfaceC65784Pro<C76800UCe> interfaceC65784Pro;
                        o.LJIIIZ(shape, "shape");
                        o.LJIIIZ(layoutDirection, "layoutDirection");
                        o.LJIIIZ(density, "density");
                        this.LJLLI = j;
                        boolean z5 = false;
                        if (this.LJLLILLLL.LJJIJ() && !(!this.LJLJJL.LJIIIIZZ)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.LJLLILLLL.LJIILJJIL(f);
                        this.LJLLILLLL.LJIILLIIL(f2);
                        this.LJLLILLLL.setAlpha(f3);
                        this.LJLLILLLL.LJIIZILJ(f4);
                        this.LJLLILLLL.LJII(f5);
                        this.LJLLILLLL.LJJIIJ(f6);
                        this.LJLLILLLL.LJJII(C78897Uxp.LJJJZ(j2));
                        this.LJLLILLLL.LJJIII(C78897Uxp.LJJJZ(j3));
                        this.LJLLILLLL.LJFF(f9);
                        this.LJLLILLLL.LIZJ(f7);
                        this.LJLLILLLL.LJ(f8);
                        this.LJLLILLLL.LJIIIIZZ(f10);
                        this.LJLLILLLL.LJIJJLI(C12000dY.LIZ(j) * this.LJLLILLLL.getWidth());
                        this.LJLLILLLL.LJIL(C12000dY.LIZIZ(j) * this.LJLLILLLL.getHeight());
                        C05K c05k = this.LJLLILLLL;
                        if (z && shape != C11710d5.LIZ) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        c05k.LJJI(z3);
                        C05K c05k2 = this.LJLLILLLL;
                        if (z && shape == C11710d5.LIZ) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        c05k2.LJIJI(z4);
                        this.LJLLILLLL.LJIIIZ();
                        boolean LIZLLL = this.LJLJJL.LIZLLL(shape, this.LJLLILLLL.LIZ(), this.LJLLILLLL.LJJIJ(), this.LJLLILLLL.LJJIZ(), layoutDirection, density);
                        this.LJLLILLLL.LJJ(this.LJLJJL.LIZIZ());
                        if (this.LJLLILLLL.LJJIJ() && !(!this.LJLJJL.LJIIIIZZ)) {
                            z5 = true;
                        }
                        if (z2 != z5 || (z5 && LIZLLL)) {
                            if (!this.LJLJJI && !this.LJLJJLL) {
                                this.LJLIL.invalidate();
                                LJIIIZ(true);
                            }
                        } else if (Build.VERSION.SDK_INT >= 26) {
                            C04K.LIZ(this.LJLIL);
                        } else {
                            this.LJLIL.invalidate();
                        }
                        if (!this.LJLJL && this.LJLLILLLL.LJJIZ() > 0.0f && (interfaceC65784Pro = this.LJLJI) != null) {
                            interfaceC65784Pro.invoke();
                        }
                        this.LJLJLLL.LIZJ();
                    }
                };
            } catch (Throwable unused) {
                this.LLIILZL = false;
            }
        }
        if (this.LLIFFJFJJ == null) {
            if (!C283919n.LJLZ) {
                C016004m.LIZ(new View(getContext()));
            }
            if (C283919n.LJZ) {
                Context context = getContext();
                o.LJIIIIZZ(context, "context");
                c05n = new C05N(context);
            } else {
                final Context context2 = getContext();
                o.LJIIIIZZ(context2, "context");
                c05n = new C05N(context2) { // from class: X.19q
                    @Override // X.C05N, android.view.ViewGroup, android.view.View
                    public final void dispatchDraw(Canvas canvas) {
                        o.LJIIIZ(canvas, "canvas");
                    }

                    public final void dispatchGetDisplayList() {
                    }
                };
            }
            this.LLIFFJFJJ = c05n;
            addView(c05n);
        }
        C05N c05n2 = this.LLIFFJFJJ;
        o.LJI(c05n2);
        return new C283919n(this, c05n2, drawBlock, invalidateParentLayer);
    }

    public final void LJJIII(C0DN layer, boolean z) {
        o.LJIIIZ(layer, "layer");
        if (!z) {
            if (this.LJZ || this.LJLLLLLL.remove(layer)) {
                return;
            }
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (!this.LJZ) {
            this.LJLLLLLL.add(layer);
            return;
        }
        List list = this.LJLZ;
        if (list == null) {
            list = new ArrayList();
            this.LJLZ = list;
        }
        list.add(layer);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                LJJ(getRoot());
            }
            OSZ LJIJI = LJIJI(i);
            int intValue = ((Number) LJIJI.getFirst()).intValue();
            int intValue2 = ((Number) LJIJI.getSecond()).intValue();
            OSZ LJIJI2 = LJIJI(i2);
            long LIZJ = C78555UsJ.LIZJ(intValue, intValue2, ((Number) LJIJI2.getFirst()).intValue(), ((Number) LJIJI2.getSecond()).intValue());
            C23360vs c23360vs = this.LLII;
            if (c23360vs == null) {
                this.LLII = new C23360vs(LIZJ);
                this.wasMeasuredWithMultipleConstraints = false;
            } else if (!C23360vs.LIZIZ(c23360vs.LIZ, LIZJ)) {
                this.wasMeasuredWithMultipleConstraints = true;
            }
            this.LLIIII.LJIILLIIL(LIZJ);
            this.LLIIII.LJIIIIZZ();
            setMeasuredDimension(getRoot().LLIFFJFJJ.LJIIJ.LJLIL, getRoot().LLIFFJFJJ.LJIIJ.LJLILLLLZI);
            if (this.LLI != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().LLIFFJFJJ.LJIIJ.LJLIL, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().LLIFFJFJJ.LJIIJ.LJLILLLLZI, 1073741824));
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i) {
        C1N8 c1n8;
        if (Build.VERSION.SDK_INT >= 26 && viewStructure != null && (c1n8 = this.LLD) != null) {
            int LIZ = C08270Ud.LIZ(viewStructure, c1n8.LIZIZ.LIZ.size());
            for (Map.Entry entry : ((LinkedHashMap) c1n8.LIZIZ.LIZ).entrySet()) {
                int intValue = ((Number) entry.getKey()).intValue();
                Object value = entry.getValue();
                ViewStructure LIZIZ = C08270Ud.LIZIZ(viewStructure, LIZ);
                if (LIZIZ == null) {
                    LIZ++;
                } else {
                    AutofillId LIZ2 = C08280Ue.LIZ(viewStructure);
                    o.LJI(LIZ2);
                    C08280Ue.LJI(LIZIZ, LIZ2, intValue);
                    C08270Ud.LIZLLL(LIZIZ, intValue, c1n8.LIZ.getContext().getPackageName(), null, null);
                    C08280Ue.LJII(LIZIZ, 1);
                    value.getClass();
                    throw null;
                }
            }
        }
    }

    @Override // X.C0DR
    public final void LIZJ(C29321Dc layoutNode, boolean z, boolean z2) {
        o.LJIIIZ(layoutNode, "layoutNode");
        if (z) {
            if (this.LLIIII.LJIIL(layoutNode, z2)) {
                LJJIIZ(null);
            }
        } else {
            if (!this.LLIIII.LJIILJJIL(layoutNode, z2)) {
                return;
            }
            LJJIIZ(null);
        }
    }

    @Override // X.C0DR
    public final void LJIILLIIL(C29321Dc layoutNode, boolean z, boolean z2) {
        o.LJIIIZ(layoutNode, "layoutNode");
        if (z) {
            if (this.LLIIII.LJIILIIL(layoutNode, z2)) {
                LJJIIZ(layoutNode);
            }
        } else {
            if (!this.LLIIII.LJIILL(layoutNode, z2)) {
                return;
            }
            LJJIIZ(layoutNode);
        }
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        C1PC c1pc = this.LJLJJLL;
        if (z) {
            C51171zd c51171zd = c1pc.LIZ;
            if (c51171zd.LJLJJI == C1PB.Inactive) {
                c51171zd.LIZ(C1PB.Active);
                return;
            }
            return;
        }
        C09520Yy.LIZJ(c1pc.LIZ, true);
    }

    public final void LJJIJ(MotionEvent motionEvent, int i, long j, boolean z) {
        int i2;
        int buttonState;
        long downTime;
        int i3;
        int actionMasked = motionEvent.getActionMasked();
        int i4 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i4 = motionEvent.getActionIndex();
            }
        } else if (i != 9 && i != 10) {
            i4 = 0;
        }
        int pointerCount = motionEvent.getPointerCount();
        if (i4 >= 0) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int i5 = pointerCount - i2;
        if (i5 == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[i5];
        for (int i6 = 0; i6 < i5; i6++) {
            pointerPropertiesArr[i6] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[i5];
        for (int i7 = 0; i7 < i5; i7++) {
            pointerCoordsArr[i7] = new MotionEvent.PointerCoords();
        }
        for (int i8 = 0; i8 < i5; i8++) {
            if (i4 < 0 || i8 < i4) {
                i3 = 0;
            } else {
                i3 = 1;
            }
            int i9 = i3 + i8;
            motionEvent.getPointerProperties(i9, pointerPropertiesArr[i8]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i8];
            motionEvent.getPointerCoords(i9, pointerCoords);
            long LJIIIZ = LJIIIZ(C78923UyF.LIZ(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = C10370av.LIZLLL(LJIIIZ);
            pointerCoords.y = C10370av.LJ(LJIIIZ);
        }
        if (z) {
            buttonState = 0;
        } else {
            buttonState = motionEvent.getButtonState();
        }
        if (motionEvent.getDownTime() == motionEvent.getEventTime()) {
            downTime = j;
        } else {
            downTime = motionEvent.getDownTime();
        }
        MotionEvent event = MotionEvent.obtain(downTime, j, i, i5, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), buttonState, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        C11D c11d = this.LJZI;
        o.LJIIIIZZ(event, "event");
        C11S LIZ = c11d.LIZ(event, this);
        o.LJI(LIZ);
        this.LJZL.LIZ(LIZ, this, true);
        event.recycle();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.LLIIII.LJI(this.LLJJIJI);
        this.LLII = null;
        LJJIJIIJI();
        if (this.LLI != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i3 - i, i4 - i2);
        }
        try {
            Field field = C4CS.LIZ;
            if (field == null) {
                field = C45211q1.class.getDeclaredField("wasMeasuredWithMultipleConstraints");
                C4CS.LIZ = field;
            }
            field.setAccessible(true);
            field.set(this, Boolean.FALSE);
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Error accessing wasMeasuredWithMultipleConstraints field ");
            LIZ.append(e);
            C36922EeM.LIZLLL(4, "AndroidComposeView", X1D.LIZIZ(LIZ));
        }
    }
}
