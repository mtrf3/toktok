package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.als.AlsLogicContainer;

/* renamed from: X.1FT, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1FT implements LifecycleOwner {
    public final /* synthetic */ AlsLogicContainer LJLIL;

    public C1FT(AlsLogicContainer alsLogicContainer) {
        this.LJLIL = alsLogicContainer;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LJLIL.LJLJLLL;
    }
}
