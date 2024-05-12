package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;

/* renamed from: X.JuN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50655JuN implements LifecycleOwner {
    public static final C50655JuN LJLIL;
    public static final LifecycleRegistry LJLILLLLZI;

    static {
        C50655JuN c50655JuN = new C50655JuN();
        LJLIL = c50655JuN;
        LJLILLLLZI = new LifecycleRegistry(c50655JuN);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return LJLILLLLZI;
    }
}
