package androidx.lifecycle;

/* loaded from: classes.dex */
public final class SharedViewModelHostInjector {
    public static final SharedViewModelHostInjector INSTANCE = new SharedViewModelHostInjector();
    public static boolean optimiseLifecycle;

    public final boolean getOptimiseLifecycle() {
        return optimiseLifecycle;
    }

    public final void setOptimiseLifecycle(boolean z) {
        optimiseLifecycle = z;
    }
}
