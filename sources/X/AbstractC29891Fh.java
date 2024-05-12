package X;

import X.C0I6;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import com.bytedance.als.LiveEvent;
import com.bytedance.als.lazy.MultipleInstanceCreatedCallbackWithLifecycleWrapper;
import com.bytedance.als.lazy.SingleInstanceCreatedCallbackWithLifecycleWrapper;
import defpackage.PasskeyFrequencySettingsModel;
import kotlin.jvm.internal.IDqS172S0200000;
import kotlin.jvm.internal.IDqS176S0200000;
import kotlin.jvm.internal.IDqS416S0100000;
import kotlin.jvm.internal.o;

/* renamed from: X.1Fh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC29891Fh<T extends C0I6> implements LifecycleOwner {
    public C0I8 attachedLazyComponentSearcher;
    public InterfaceC82629Wbp registeredObjectContainerName;
    public final LifecycleRegistry lifecycle = new LifecycleRegistry(this);
    public final C06350Mt performanceMonitorCalculate = new C06350Mt(this);
    public final String componentName = C16880lQ.LJLLJ(getClass());

    public static /* synthetic */ void getAttachedLazyComponentSearcher$annotations() {
    }

    public abstract T getApiComponent();

    public final void dispatchOnCreate$als_release() {
        C06350Mt c06350Mt = this.performanceMonitorCalculate;
        c06350Mt.getClass();
        c06350Mt.LIZIZ = SystemClock.uptimeMillis();
        onCreate();
        C06350Mt c06350Mt2 = this.performanceMonitorCalculate;
        c06350Mt2.LIZ(c06350Mt2.LIZJ, EnumC06330Mr.ON_CREATE, SystemClock.uptimeMillis() - c06350Mt2.LIZIZ);
    }

    public final void dispatchOnDestroy$als_release() {
        C06350Mt c06350Mt = this.performanceMonitorCalculate;
        c06350Mt.getClass();
        c06350Mt.LIZIZ = SystemClock.uptimeMillis();
        onDestroy();
        C06350Mt c06350Mt2 = this.performanceMonitorCalculate;
        c06350Mt2.LIZ(c06350Mt2.LIZJ, EnumC06330Mr.ON_DESTROY, SystemClock.uptimeMillis() - c06350Mt2.LIZIZ);
    }

    public final void dispatchOnPause$als_release() {
        C06350Mt c06350Mt = this.performanceMonitorCalculate;
        c06350Mt.getClass();
        c06350Mt.LIZIZ = SystemClock.uptimeMillis();
        onPause();
        C06350Mt c06350Mt2 = this.performanceMonitorCalculate;
        c06350Mt2.LIZ(c06350Mt2.LIZJ, EnumC06330Mr.ON_PAUSE, SystemClock.uptimeMillis() - c06350Mt2.LIZIZ);
    }

    public final void dispatchOnResume$als_release() {
        C06350Mt c06350Mt = this.performanceMonitorCalculate;
        c06350Mt.getClass();
        c06350Mt.LIZIZ = SystemClock.uptimeMillis();
        onResume();
        C06350Mt c06350Mt2 = this.performanceMonitorCalculate;
        c06350Mt2.LIZ(c06350Mt2.LIZJ, EnumC06330Mr.ON_RESUME, SystemClock.uptimeMillis() - c06350Mt2.LIZIZ);
    }

    public final void dispatchOnStart$als_release() {
        C06350Mt c06350Mt = this.performanceMonitorCalculate;
        c06350Mt.getClass();
        c06350Mt.LIZIZ = SystemClock.uptimeMillis();
        onStart();
        C06350Mt c06350Mt2 = this.performanceMonitorCalculate;
        c06350Mt2.LIZ(c06350Mt2.LIZJ, EnumC06330Mr.ON_START, SystemClock.uptimeMillis() - c06350Mt2.LIZIZ);
    }

    public final void dispatchOnStop$als_release() {
        C06350Mt c06350Mt = this.performanceMonitorCalculate;
        c06350Mt.getClass();
        c06350Mt.LIZIZ = SystemClock.uptimeMillis();
        onStop();
        C06350Mt c06350Mt2 = this.performanceMonitorCalculate;
        c06350Mt2.LIZ(c06350Mt2.LIZJ, EnumC06330Mr.ON_STOP, SystemClock.uptimeMillis() - c06350Mt2.LIZIZ);
    }

    public final StackTraceElement[] getRegisteredObjectContainerStackTrace() {
        InterfaceC82629Wbp interfaceC82629Wbp = this.registeredObjectContainerName;
        if (interfaceC82629Wbp != null) {
            return interfaceC82629Wbp.LIZ();
        }
        return null;
    }

    public void onCreate() {
        this.lifecycle.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    public void onDestroy() {
        this.lifecycle.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    public void onPause() {
        this.lifecycle.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
    }

    public void onResume() {
        this.lifecycle.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
    }

    public void onStart() {
        this.lifecycle.handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    public void onStop() {
        this.lifecycle.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    public String getComponentName() {
        return this.componentName;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    public final void afterInit$als_release(long j) {
        C06350Mt c06350Mt = this.performanceMonitorCalculate;
        c06350Mt.LIZ(c06350Mt.LIZJ, EnumC06330Mr.ON_INIT, SystemClock.uptimeMillis() - j);
    }

    public final <T extends C0I6> T findReadyComponent(InterfaceC135635Tz findReadyComponent) {
        o.LJIIIZ(findReadyComponent, "$this$findReadyComponent");
        o.LJIJ();
        throw null;
    }

    public final <T extends C0I6> T findReadyComponent(InterfaceC135635Tz findReadyComponent, Class<T> clazz) {
        C0I8 c0i8;
        AbstractC29891Fh<?> LIZIZ;
        o.LJIIIZ(findReadyComponent, "$this$findReadyComponent");
        o.LJIIIZ(clazz, "clazz");
        if (!findReadyComponent.getDiContainer().LIZIZ(clazz) || (c0i8 = this.attachedLazyComponentSearcher) == null || (LIZIZ = c0i8.LIZIZ(clazz)) == null) {
            return null;
        }
        return (T) LIZIZ.getApiComponent();
    }

    public final <TYPE> void observe(C0IB<TYPE> observe, InterfaceC29911Fj<TYPE> observer) {
        o.LJIIIZ(observe, "$this$observe");
        o.LJIIIZ(observer, "observer");
        observe.LIZIZ(this, observer);
    }

    public final <T extends C0I6> void whenReady(InterfaceC135635Tz whenReady, InterfaceC88472Yns<? super T, C76800UCe> callback) {
        o.LJIIIZ(whenReady, "$this$whenReady");
        o.LJIIIZ(callback, "callback");
        o.LJIJ();
        throw null;
    }

    public final <T extends C0I6> void whenReadyOrThrow(InterfaceC135635Tz whenReadyOrThrow, InterfaceC88472Yns<? super T, C76800UCe> callback) {
        o.LJIIIZ(whenReadyOrThrow, "$this$whenReadyOrThrow");
        o.LJIIIZ(callback, "callback");
        whenReadyOrThrow.getDiContainer();
        o.LJIJ();
        throw null;
    }

    public final <TYPE> void observe(LiveData<TYPE> observe, InterfaceC29911Fj<TYPE> observer) {
        o.LJIIIZ(observe, "$this$observe");
        o.LJIIIZ(observer, "observer");
        observe.observe(this, observer);
    }

    public final <TYPE> void observe(LiveEvent<TYPE> observe, InterfaceC29911Fj<TYPE> observer) {
        o.LJIIIZ(observe, "$this$observe");
        o.LJIIIZ(observer, "observer");
        observe.LIZLLL(this, observer);
    }

    public final <T extends C0I6> void whenReady(InterfaceC135635Tz whenReady, Class<T> clazz, InterfaceC88472Yns<? super T, C76800UCe> callback) {
        o.LJIIIZ(whenReady, "$this$whenReady");
        o.LJIIIZ(clazz, "clazz");
        o.LJIIIZ(callback, "callback");
        if (!whenReady.getDiContainer().LIZIZ(clazz)) {
            return;
        }
        whenReadyOrThrowInternal(whenReady.getDiContainer(), clazz, new IDqS416S0100000(callback, 32));
    }

    public final <T extends C0I6> void whenReadyOrThrow(InterfaceC135635Tz whenReadyOrThrow, Class<T> clazz, InterfaceC88472Yns<? super T, C76800UCe> callback) {
        o.LJIIIZ(whenReadyOrThrow, "$this$whenReadyOrThrow");
        o.LJIIIZ(clazz, "clazz");
        o.LJIIIZ(callback, "callback");
        whenReadyOrThrowInternal(whenReadyOrThrow.getDiContainer(), clazz, new IDqS416S0100000(callback, 33));
    }

    public final <T extends C0I6> void whenReadyOrThrowInternal(C82622Wbi diContainer, Class<T> clazz, InterfaceC88472Yns<? super T, C76800UCe> onReady) {
        C29851Fd LIZ;
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(clazz, "clazz");
        o.LJIIIZ(onReady, "onReady");
        C0I8 c0i8 = this.attachedLazyComponentSearcher;
        if (c0i8 != null) {
            AbstractC29891Fh<?> LIZIZ = c0i8.LIZIZ(clazz);
            if (LIZIZ != null) {
                PasskeyFrequencySettingsModel apiComponent = LIZIZ.getApiComponent();
                if (apiComponent != null) {
                    onReady.invoke(apiComponent);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type T");
            }
            if (diContainer.LIZIZ(clazz)) {
                if (this.lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                    return;
                }
                C0I8 c0i82 = this.attachedLazyComponentSearcher;
                if (c0i82 != null && (LIZ = c0i82.LIZ(clazz)) != null) {
                    C0Y0 c0y0 = new C0Y0();
                    C0Y0 c0y02 = new C0Y0();
                    C34K c34k = new C34K();
                    c34k.element = false;
                    IDqS172S0200000 iDqS172S0200000 = new IDqS172S0200000(onReady, c34k, 6);
                    IDqS176S0200000 iDqS176S0200000 = new IDqS176S0200000(diContainer, LIZ, 23);
                    IDqS176S0200000 iDqS176S02000002 = new IDqS176S0200000(diContainer, LIZ, 24);
                    final SingleInstanceCreatedCallbackWithLifecycleWrapper singleInstanceCreatedCallbackWithLifecycleWrapper = new SingleInstanceCreatedCallbackWithLifecycleWrapper(LIZ.LJLIL, diContainer, this.lifecycle, iDqS172S0200000, c0y0, c0y02, iDqS176S0200000, iDqS176S02000002);
                    singleInstanceCreatedCallbackWithLifecycleWrapper.LJLJI.addObserver(singleInstanceCreatedCallbackWithLifecycleWrapper);
                    C82622Wbi c82622Wbi = singleInstanceCreatedCallbackWithLifecycleWrapper.LJLILLLLZI;
                    Class<?> cls = singleInstanceCreatedCallbackWithLifecycleWrapper.LJLIL;
                    if (cls != null) {
                        c82622Wbi.getClass();
                        if (c82622Wbi.LJIIJ(new C83683Qe(null, cls), singleInstanceCreatedCallbackWithLifecycleWrapper)) {
                            singleInstanceCreatedCallbackWithLifecycleWrapper.LJLJJL.LIZIZ(new InterfaceC09270Xz() { // from class: X.1ER
                                @Override // X.InterfaceC09270Xz
                                public final void onCancel() {
                                    SingleInstanceCreatedCallbackWithLifecycleWrapper.this.LIZIZ();
                                }
                            });
                            if (!(!LIZ.LJLILLLLZI.isEmpty())) {
                                return;
                            }
                            final MultipleInstanceCreatedCallbackWithLifecycleWrapper multipleInstanceCreatedCallbackWithLifecycleWrapper = new MultipleInstanceCreatedCallbackWithLifecycleWrapper(LIZ.LJLILLLLZI, diContainer, this.lifecycle, iDqS172S0200000, c0y0, c0y02, iDqS176S0200000, iDqS176S02000002);
                            multipleInstanceCreatedCallbackWithLifecycleWrapper.LJLJI.addObserver(multipleInstanceCreatedCallbackWithLifecycleWrapper);
                            for (Class<? extends C0I6> cls2 : multipleInstanceCreatedCallbackWithLifecycleWrapper.LJLIL) {
                                C82622Wbi c82622Wbi2 = multipleInstanceCreatedCallbackWithLifecycleWrapper.LJLILLLLZI;
                                if (cls2 != null) {
                                    c82622Wbi2.getClass();
                                    if (!c82622Wbi2.LJIIJ(new C83683Qe(null, cls2), multipleInstanceCreatedCallbackWithLifecycleWrapper)) {
                                        throw new C00X("registerInstanceCreatedCallbacks failed");
                                    }
                                } else {
                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<T>");
                                }
                            }
                            multipleInstanceCreatedCallbackWithLifecycleWrapper.LJLJJLL.LIZIZ(new InterfaceC09270Xz() { // from class: X.1EQ
                                @Override // X.InterfaceC09270Xz
                                public final void onCancel() {
                                    MultipleInstanceCreatedCallbackWithLifecycleWrapper.this.LIZIZ();
                                }
                            });
                            return;
                        }
                        throw new C00X("registerInstanceCreatedCallbacks failed");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<com.bytedance.als.LogicComponent<T>>");
                }
                StringBuilder LIZ2 = X1D.LIZ();
                throw new C00X(AnonymousClass028.LIZLLL(LIZ2, "Impossible! Dependency not registered ", clazz, LIZ2));
            }
            StringBuilder LIZ3 = X1D.LIZ();
            throw new UCJ(AnonymousClass028.LIZLLL(LIZ3, "Dependency not registered ", clazz, LIZ3));
        }
        final String str = "LogicComponent has registered but not attached";
        throw new RuntimeException(str) { // from class: X.00Y
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(str);
                o.LJIIIZ(str, "message");
            }
        };
    }
}
