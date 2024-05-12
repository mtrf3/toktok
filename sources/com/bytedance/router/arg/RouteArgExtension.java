package com.bytedance.router.arg;

import X.C141335gf;
import X.C19U;
import X.C3C5;
import X.C5H3;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.X1D;
import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.router.annotation.IRouteArg;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS165S0100000_15;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class RouteArgExtension {
    public static final RouteArgExtension INSTANCE = new RouteArgExtension();

    /* loaded from: classes15.dex */
    public static final class ParamResult<T> {
        public final boolean isPutNull;
        public final T result;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ParamResult copy$default(ParamResult paramResult, Object obj, boolean z, int i, Object obj2) {
            if ((i & 1) != 0) {
                obj = paramResult.result;
            }
            if ((i & 2) != 0) {
                z = paramResult.isPutNull;
            }
            return paramResult.copy(obj, z);
        }

        public final ParamResult<T> copy(T t, boolean z) {
            return new ParamResult<>(t, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ParamResult)) {
                return false;
            }
            ParamResult paramResult = (ParamResult) obj;
            return o.LJ(this.result, paramResult.result) && this.isPutNull == paramResult.isPutNull;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            T t = this.result;
            int hashCode = (t != null ? t.hashCode() : 0) * 31;
            boolean z = this.isPutNull;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("ParamResult(result=");
            LIZ.append(this.result);
            LIZ.append(", isPutNull=");
            return C19U.LIZ(LIZ, this.isPutNull, ")", LIZ);
        }

        public final T getResult() {
            return this.result;
        }

        public final boolean isPutNull() {
            return this.isPutNull;
        }

        public ParamResult(T t, boolean z) {
            this.result = t;
            this.isPutNull = z;
        }

        public /* synthetic */ ParamResult(Object obj, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, (i & 2) != 0 ? false : z);
        }
    }

    /* loaded from: classes16.dex */
    public static final class RouteArgLazy<T> extends RouteArgLifecycle<T> implements C5H3<T> {
        public final InterfaceC65784Pro<Bundle> bundleGetter;
        public final Class<T> cls;
        public final InterfaceC88472Yns<Boolean, T> defaultInvoker;
        public final String key;

        @Override // X.C5H3
        public T getValue() {
            T cached = getCached();
            if (cached == null) {
                try {
                    ParamResult<T> bundleParam = RouteArgExtension.INSTANCE.getBundleParam(this.bundleGetter.invoke(), this.key, this.cls);
                    T result = bundleParam.getResult();
                    if (result == null) {
                        result = this.defaultInvoker.invoke(Boolean.valueOf(bundleParam.isPutNull()));
                    }
                    setCached(result);
                    C3C5.m7constructorimpl(C76800UCe.LIZ);
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
                if (getCached() == null) {
                    setCached(this.defaultInvoker.invoke(Boolean.FALSE));
                }
                T cached2 = getCached();
                o.LJI(cached2);
                return cached2;
            }
            return cached;
        }

        @Override // X.C5H3
        public boolean isInitialized() {
            if (getCached() != null) {
                return true;
            }
            return false;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public RouteArgLazy(LifecycleOwner lifecycleOwner, InterfaceC65784Pro<Bundle> bundleGetter, String key, Class<T> cls, InterfaceC88472Yns<? super Boolean, ? extends T> defaultInvoker) {
            super(lifecycleOwner);
            o.LJIIIZ(bundleGetter, "bundleGetter");
            o.LJIIIZ(key, "key");
            o.LJIIIZ(cls, "cls");
            o.LJIIIZ(defaultInvoker, "defaultInvoker");
            this.bundleGetter = bundleGetter;
            this.key = key;
            this.cls = cls;
            this.defaultInvoker = defaultInvoker;
        }

        public /* synthetic */ RouteArgLazy(LifecycleOwner lifecycleOwner, InterfaceC65784Pro interfaceC65784Pro, String str, Class cls, InterfaceC88472Yns interfaceC88472Yns, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(lifecycleOwner, interfaceC65784Pro, (i & 4) != 0 ? "" : str, cls, interfaceC88472Yns);
        }
    }

    /* loaded from: classes16.dex */
    public static final class RouteArgLazyNullable<T> extends RouteArgLifecycle<T> implements C5H3<T> {
        public final InterfaceC65784Pro<Bundle> bundleGetter;
        public final Class<T> cls;
        public final InterfaceC88472Yns<Boolean, T> defaultInvoker;
        public final String key;

        @Override // X.C5H3
        public T getValue() {
            T cached = getCached();
            if (cached == null) {
                try {
                    ParamResult<T> bundleParam = RouteArgExtension.INSTANCE.getBundleParam(this.bundleGetter.invoke(), this.key, this.cls);
                    T result = bundleParam.getResult();
                    if (result == null) {
                        result = this.defaultInvoker.invoke(Boolean.valueOf(bundleParam.isPutNull()));
                    }
                    setCached(result);
                    C3C5.m7constructorimpl(C76800UCe.LIZ);
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
                if (getCached() == null) {
                    setCached(this.defaultInvoker.invoke(Boolean.FALSE));
                }
                return getCached();
            }
            return cached;
        }

        @Override // X.C5H3
        public boolean isInitialized() {
            if (getCached() != null) {
                return true;
            }
            return false;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public RouteArgLazyNullable(LifecycleOwner lifecycleOwner, InterfaceC65784Pro<Bundle> bundleGetter, String key, Class<T> cls, InterfaceC88472Yns<? super Boolean, ? extends T> defaultInvoker) {
            super(lifecycleOwner);
            o.LJIIIZ(bundleGetter, "bundleGetter");
            o.LJIIIZ(key, "key");
            o.LJIIIZ(cls, "cls");
            o.LJIIIZ(defaultInvoker, "defaultInvoker");
            this.bundleGetter = bundleGetter;
            this.key = key;
            this.cls = cls;
            this.defaultInvoker = defaultInvoker;
        }

        public /* synthetic */ RouteArgLazyNullable(LifecycleOwner lifecycleOwner, InterfaceC65784Pro interfaceC65784Pro, String str, Class cls, InterfaceC88472Yns interfaceC88472Yns, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(lifecycleOwner, interfaceC65784Pro, (i & 4) != 0 ? "" : str, cls, interfaceC88472Yns);
        }
    }

    /* loaded from: classes16.dex */
    public static final class RouteArgLazyRequired<T> extends RouteArgLifecycle<T> implements C5H3<T> {
        public final InterfaceC65784Pro<Bundle> bundleGetter;
        public final Class<T> cls;
        public final InterfaceC65784Pro<T> defaultInvoker;
        public final String key;

        @Override // X.C5H3
        public T getValue() {
            T cached = getCached();
            if (cached == null) {
                try {
                    T result = RouteArgExtension.INSTANCE.getBundleParam(this.bundleGetter.invoke(), this.key, this.cls).getResult();
                    if (result == null) {
                        result = this.defaultInvoker.invoke();
                    }
                    setCached(result);
                    C3C5.m7constructorimpl(C76800UCe.LIZ);
                } catch (Throwable th) {
                    C3C5.m7constructorimpl(C141335gf.LIZ(th));
                }
                T cached2 = getCached();
                o.LJI(cached2);
                return cached2;
            }
            return cached;
        }

        @Override // X.C5H3
        public boolean isInitialized() {
            if (getCached() != null) {
                return true;
            }
            return false;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public RouteArgLazyRequired(LifecycleOwner lifecycleOwner, InterfaceC65784Pro<Bundle> bundleGetter, String key, Class<T> cls, InterfaceC65784Pro<? extends T> defaultInvoker) {
            super(lifecycleOwner);
            o.LJIIIZ(bundleGetter, "bundleGetter");
            o.LJIIIZ(key, "key");
            o.LJIIIZ(cls, "cls");
            o.LJIIIZ(defaultInvoker, "defaultInvoker");
            this.bundleGetter = bundleGetter;
            this.key = key;
            this.cls = cls;
            this.defaultInvoker = defaultInvoker;
        }

        public /* synthetic */ RouteArgLazyRequired(LifecycleOwner lifecycleOwner, InterfaceC65784Pro interfaceC65784Pro, String str, Class cls, InterfaceC65784Pro interfaceC65784Pro2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(lifecycleOwner, interfaceC65784Pro, (i & 4) != 0 ? "" : str, cls, interfaceC65784Pro2);
        }
    }

    /* loaded from: classes16.dex */
    public static class RouteArgNavLazy<T extends IRouteArg> extends RouteArgLifecycle<T> implements C5H3<T> {
        public final InterfaceC65784Pro<Bundle> bundleGetter;
        public final InterfaceC65784Pro<T> defaultValueGetter;
        public final WeakReference<LifecycleOwner> owner;

        @Override // X.C5H3
        public T getValue() {
            Object obj;
            LifecycleOwner lifecycleOwner;
            T t = (T) getCached();
            if (t == null) {
                Bundle invoke = this.bundleGetter.invoke();
                T t2 = null;
                if (invoke != null) {
                    obj = invoke.getParcelable("smart_key_route_arg");
                } else {
                    obj = null;
                }
                if (!(obj instanceof IRouteArg) || obj == null) {
                    WeakReference<LifecycleOwner> weakReference = this.owner;
                    if (weakReference != null && (lifecycleOwner = weakReference.get()) != null) {
                        Class<? extends IRouteArg> argClassByClazz = SmartRouteArgManager.INSTANCE.getArgClassByClazz(lifecycleOwner.getClass());
                        if (argClassByClazz != null) {
                            obj = argClassByClazz.getMethod("__fromBundle", Bundle.class).invoke(null, invoke);
                            if (!(obj instanceof IRouteArg)) {
                                obj = null;
                            }
                        } else {
                            obj = null;
                        }
                    } else {
                        obj = null;
                    }
                }
                setCached(obj);
                if (getCached() == 0) {
                    InterfaceC65784Pro<T> interfaceC65784Pro = this.defaultValueGetter;
                    if (interfaceC65784Pro != null) {
                        t2 = interfaceC65784Pro.invoke();
                    }
                    setCached(t2);
                }
                return (T) getCached();
            }
            return t;
        }

        @Override // X.C5H3
        public boolean isInitialized() {
            if (getCached() != 0) {
                return true;
            }
            return false;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public RouteArgNavLazy(java.lang.ref.WeakReference<androidx.lifecycle.LifecycleOwner> r2, X.InterfaceC65784Pro<? extends T> r3, X.InterfaceC65784Pro<android.os.Bundle> r4) {
            /*
                r1 = this;
                java.lang.String r0 = "bundleGetter"
                kotlin.jvm.internal.o.LJIIIZ(r4, r0)
                if (r2 == 0) goto L17
                java.lang.Object r0 = r2.get()
                androidx.lifecycle.LifecycleOwner r0 = (androidx.lifecycle.LifecycleOwner) r0
            Ld:
                r1.<init>(r0)
                r1.owner = r2
                r1.defaultValueGetter = r3
                r1.bundleGetter = r4
                return
            L17:
                r0 = 0
                goto Ld
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.router.arg.RouteArgExtension.RouteArgNavLazy.<init>(java.lang.ref.WeakReference, X.Pro, X.Pro):void");
        }
    }

    /* loaded from: classes16.dex */
    public static class RouteArgLifecycle<T> {
        public T cached;

        public final T getCached() {
            return this.cached;
        }

        public RouteArgLifecycle(LifecycleOwner lifecycleOwner) {
            if (lifecycleOwner != null) {
                RouteArgInjector.INSTANCE.register(lifecycleOwner, new AqS162S0200000_15(this, lifecycleOwner, 4));
            }
        }

        public final void setCached(T t) {
            this.cached = t;
        }
    }

    public final <T extends IRouteArg> C5H3<T> navArg(Activity navArg) {
        o.LJIIIZ(navArg, "$this$navArg");
        return new RouteArgNavLazy(new WeakReference(navArg), null, new AqS154S0100000_4(navArg, 21));
    }

    public final <T extends IRouteArg> C5H3<T> navArg(Fragment navArg) {
        o.LJIIIZ(navArg, "$this$navArg");
        return new RouteArgNavLazy(new WeakReference(navArg), null, new AqS157S0100000_7(navArg, 39));
    }

    public final <T extends IRouteArg> C5H3<T> navArg(Activity navArg, InterfaceC65784Pro<? extends T> defaultValue) {
        o.LJIIIZ(navArg, "$this$navArg");
        o.LJIIIZ(defaultValue, "defaultValue");
        return new RouteArgNavLazy(new WeakReference(navArg), defaultValue, new AqS153S0100000_3(navArg, 62));
    }

    public final <T> C5H3<T> optionalArg(Activity optionalArg, InterfaceC88472Yns<? super Boolean, ? extends T> defaultValue) {
        o.LJIIIZ(optionalArg, "$this$optionalArg");
        o.LJIIIZ(defaultValue, "defaultValue");
        return new C5H3<T>() { // from class: com.bytedance.router.arg.RouteArgExtension$optionalArg$1
            @Override // X.C5H3
            public boolean isInitialized() {
                return false;
            }

            @Override // X.C5H3
            public T getValue() {
                throw new IllegalAccessException("optionalArg is illegal");
            }
        };
    }

    public final <T> C5H3<T> optionalArgNotNull(Activity optionalArgNotNull, InterfaceC88472Yns<? super Boolean, ? extends T> defaultValue) {
        o.LJIIIZ(optionalArgNotNull, "$this$optionalArgNotNull");
        o.LJIIIZ(defaultValue, "defaultValue");
        return new C5H3<T>() { // from class: com.bytedance.router.arg.RouteArgExtension$optionalArgNotNull$1
            @Override // X.C5H3
            public boolean isInitialized() {
                return false;
            }

            @Override // X.C5H3
            public T getValue() {
                throw new IllegalAccessException("optionalArgNotNull is illegal");
            }
        };
    }

    public final <T> C5H3<T> requiredArg(Activity requiredArg, InterfaceC65784Pro<? extends T> defaultValue) {
        o.LJIIIZ(requiredArg, "$this$requiredArg");
        o.LJIIIZ(defaultValue, "defaultValue");
        return new C5H3<T>() { // from class: com.bytedance.router.arg.RouteArgExtension$requiredArg$1
            @Override // X.C5H3
            public boolean isInitialized() {
                return false;
            }

            @Override // X.C5H3
            public T getValue() {
                throw new IllegalAccessException("requiredArg is illegal");
            }
        };
    }

    public final void withNavArg(Fragment withNavArg, IRouteArg arg) {
        o.LJIIIZ(withNavArg, "$this$withNavArg");
        o.LJIIIZ(arg, "arg");
        if (withNavArg.getArguments() == null) {
            withNavArg.setArguments(new Bundle());
        }
        Bundle arguments = withNavArg.getArguments();
        if (arguments != null) {
            arguments.putParcelable("smart_key_route_arg", arg);
        }
    }

    public final <T extends IRouteArg> C5H3<T> navArg(Fragment navArg, InterfaceC65784Pro<? extends T> defaultValue) {
        o.LJIIIZ(navArg, "$this$navArg");
        o.LJIIIZ(defaultValue, "defaultValue");
        return new RouteArgNavLazy(new WeakReference(navArg), defaultValue, new AqS165S0100000_15(navArg, 45));
    }

    public final <T> C5H3<T> optionalArg(Fragment optionalArg, InterfaceC88472Yns<? super Boolean, ? extends T> defaultValue) {
        o.LJIIIZ(optionalArg, "$this$optionalArg");
        o.LJIIIZ(defaultValue, "defaultValue");
        return new C5H3<T>() { // from class: com.bytedance.router.arg.RouteArgExtension$optionalArg$3
            @Override // X.C5H3
            public boolean isInitialized() {
                return false;
            }

            @Override // X.C5H3
            public T getValue() {
                throw new IllegalAccessException("optionalArg is illegal");
            }
        };
    }

    public final <T> C5H3<T> optionalArgNotNull(Fragment optionalArgNotNull, InterfaceC88472Yns<? super Boolean, ? extends T> defaultValue) {
        o.LJIIIZ(optionalArgNotNull, "$this$optionalArgNotNull");
        o.LJIIIZ(defaultValue, "defaultValue");
        return new C5H3<T>() { // from class: com.bytedance.router.arg.RouteArgExtension$optionalArgNotNull$3
            @Override // X.C5H3
            public boolean isInitialized() {
                return false;
            }

            @Override // X.C5H3
            public T getValue() {
                throw new IllegalAccessException("optionalArgNotNull is illegal");
            }
        };
    }

    public final <T> C5H3<T> requiredArg(Fragment requiredArg, InterfaceC65784Pro<? extends T> defaultValue) {
        o.LJIIIZ(requiredArg, "$this$requiredArg");
        o.LJIIIZ(defaultValue, "defaultValue");
        return new C5H3<T>() { // from class: com.bytedance.router.arg.RouteArgExtension$requiredArg$3
            @Override // X.C5H3
            public boolean isInitialized() {
                return false;
            }

            @Override // X.C5H3
            public T getValue() {
                throw new IllegalAccessException("requiredArg is illegal");
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
    
        return new com.bytedance.router.arg.RouteArgExtension.ParamResult<>(r2, r3, 2, r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> com.bytedance.router.arg.RouteArgExtension.ParamResult<T> getBundleParam(android.os.Bundle r6, java.lang.String r7, java.lang.Class<T> r8) {
        /*
            r5 = this;
            r4 = 0
            r3 = 0
            if (r6 == 0) goto L2f
            boolean r0 = r6.containsKey(r7)
            if (r0 == 0) goto L2f
            java.lang.Object r2 = X.C16880lQ.LLJJIII(r6, r7)
            if (r2 == 0) goto L2e
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L23
            com.bytedance.router.arg.RouteParser r0 = com.bytedance.router.arg.RouteParser.INSTANCE
            java.lang.Object r2 = r0.parse(r2, r8)
            if (r2 == 0) goto L2e
        L1c:
            com.bytedance.router.arg.RouteArgExtension$ParamResult r1 = new com.bytedance.router.arg.RouteArgExtension$ParamResult
            r0 = 2
            r1.<init>(r2, r3, r0, r4)
            return r1
        L23:
            java.lang.Class r0 = r2.getClass()
            boolean r0 = r8.isAssignableFrom(r0)
            if (r0 == 0) goto L2e
            goto L1c
        L2e:
            r3 = 1
        L2f:
            com.bytedance.router.arg.RouteArgExtension$ParamResult r0 = new com.bytedance.router.arg.RouteArgExtension$ParamResult
            r0.<init>(r4, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.router.arg.RouteArgExtension.getBundleParam(android.os.Bundle, java.lang.String, java.lang.Class):com.bytedance.router.arg.RouteArgExtension$ParamResult");
    }

    public final <T> C5H3<T> optionalArg(Activity optionalArg, InterfaceC88472Yns<? super Boolean, ? extends T> defaultValue, String key, Class<T> cls) {
        Object obj;
        o.LJIIIZ(optionalArg, "$this$optionalArg");
        o.LJIIIZ(defaultValue, "defaultValue");
        o.LJIIIZ(key, "key");
        o.LJIIIZ(cls, "cls");
        if (!(optionalArg instanceof LifecycleOwner)) {
            obj = null;
        } else {
            obj = optionalArg;
        }
        return new RouteArgLazyNullable((LifecycleOwner) obj, new AqS154S0100000_4(optionalArg, 22), key, cls, defaultValue);
    }

    public final <T> C5H3<T> optionalArgNotNull(Activity optionalArgNotNull, InterfaceC88472Yns<? super Boolean, ? extends T> defaultValue, String key, Class<T> cls) {
        Object obj;
        o.LJIIIZ(optionalArgNotNull, "$this$optionalArgNotNull");
        o.LJIIIZ(defaultValue, "defaultValue");
        o.LJIIIZ(key, "key");
        o.LJIIIZ(cls, "cls");
        if (!(optionalArgNotNull instanceof LifecycleOwner)) {
            obj = null;
        } else {
            obj = optionalArgNotNull;
        }
        return new RouteArgLazy((LifecycleOwner) obj, new AqS154S0100000_4(optionalArgNotNull, 23), key, cls, defaultValue);
    }

    public final <T> C5H3<T> requiredArg(Activity requiredArg, InterfaceC65784Pro<? extends T> defaultValue, String key, Class<T> cls) {
        Object obj;
        o.LJIIIZ(requiredArg, "$this$requiredArg");
        o.LJIIIZ(defaultValue, "defaultValue");
        o.LJIIIZ(key, "key");
        o.LJIIIZ(cls, "cls");
        if (!(requiredArg instanceof LifecycleOwner)) {
            obj = null;
        } else {
            obj = requiredArg;
        }
        return new RouteArgLazyRequired((LifecycleOwner) obj, new AqS160S0100000_10(requiredArg, 57), key, cls, defaultValue);
    }

    public final <T> C5H3<T> optionalArg(Fragment optionalArg, InterfaceC88472Yns<? super Boolean, ? extends T> defaultValue, String key, Class<T> cls) {
        o.LJIIIZ(optionalArg, "$this$optionalArg");
        o.LJIIIZ(defaultValue, "defaultValue");
        o.LJIIIZ(key, "key");
        o.LJIIIZ(cls, "cls");
        return new RouteArgLazyNullable(optionalArg, new AqS157S0100000_7(optionalArg, 40), key, cls, defaultValue);
    }

    public final <T> C5H3<T> optionalArgNotNull(Fragment optionalArgNotNull, InterfaceC88472Yns<? super Boolean, ? extends T> defaultValue, String key, Class<T> cls) {
        o.LJIIIZ(optionalArgNotNull, "$this$optionalArgNotNull");
        o.LJIIIZ(defaultValue, "defaultValue");
        o.LJIIIZ(key, "key");
        o.LJIIIZ(cls, "cls");
        return new RouteArgLazy(optionalArgNotNull, new AqS162S0100000_12(optionalArgNotNull, 79), key, cls, defaultValue);
    }

    public final <T> C5H3<T> requiredArg(Fragment requiredArg, InterfaceC65784Pro<? extends T> defaultValue, String key, Class<T> cls) {
        o.LJIIIZ(requiredArg, "$this$requiredArg");
        o.LJIIIZ(defaultValue, "defaultValue");
        o.LJIIIZ(key, "key");
        o.LJIIIZ(cls, "cls");
        return new RouteArgLazyRequired(requiredArg, new AqS154S0100000_4(requiredArg, 24), key, cls, defaultValue);
    }

    public static /* synthetic */ C5H3 optionalArg$default(RouteArgExtension routeArgExtension, Activity activity, InterfaceC88472Yns interfaceC88472Yns, String str, Class cls, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return routeArgExtension.optionalArg(activity, interfaceC88472Yns, str, cls);
    }

    public static /* synthetic */ C5H3 optionalArgNotNull$default(RouteArgExtension routeArgExtension, Activity activity, InterfaceC88472Yns interfaceC88472Yns, String str, Class cls, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return routeArgExtension.optionalArgNotNull(activity, interfaceC88472Yns, str, cls);
    }

    public static /* synthetic */ C5H3 requiredArg$default(RouteArgExtension routeArgExtension, Activity activity, InterfaceC65784Pro interfaceC65784Pro, String str, Class cls, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return routeArgExtension.requiredArg(activity, interfaceC65784Pro, str, cls);
    }

    public static /* synthetic */ C5H3 optionalArg$default(RouteArgExtension routeArgExtension, Fragment fragment, InterfaceC88472Yns interfaceC88472Yns, String str, Class cls, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return routeArgExtension.optionalArg(fragment, interfaceC88472Yns, str, cls);
    }

    public static /* synthetic */ C5H3 optionalArgNotNull$default(RouteArgExtension routeArgExtension, Fragment fragment, InterfaceC88472Yns interfaceC88472Yns, String str, Class cls, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return routeArgExtension.optionalArgNotNull(fragment, interfaceC88472Yns, str, cls);
    }

    public static /* synthetic */ C5H3 requiredArg$default(RouteArgExtension routeArgExtension, Fragment fragment, InterfaceC65784Pro interfaceC65784Pro, String str, Class cls, int i, Object obj) {
        if ((i & 2) != 0) {
            str = "";
        }
        return routeArgExtension.requiredArg(fragment, interfaceC65784Pro, str, cls);
    }
}
