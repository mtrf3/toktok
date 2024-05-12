package X;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;

/* renamed from: X.3cL, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C87693cL implements ViewModelStoreOwner, LifecycleOwner {
    public final String LJLIL;
    public final java.util.Map<String, String> LJLILLLLZI;
    public final ActivityC45651qj LJLJI;
    public final Lifecycle LJLJJI;
    public final ViewModelStore LJLJJL;

    public final Context LIZ() {
        ActivityC45651qj activityC45651qj = this.LJLJI;
        if (activityC45651qj != null) {
            return activityC45651qj;
        }
        "Required value was null.".toString();
        throw new IllegalStateException("Required value was null.");
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LJLJJI;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        return this.LJLJJL;
    }

    public C87693cL(ActivityC45651qj activityC45651qj, String str) {
        Lifecycle lifecycle;
        ViewModelStore viewModelStore;
        C93833mF LJJJLIIL = C113554cx.LJJJLIIL();
        this.LJLIL = str;
        this.LJLILLLLZI = LJJJLIIL;
        if (activityC45651qj == null) {
            "Social Context init params error!".toString();
            throw new IllegalArgumentException("Social Context init params error!");
        }
        this.LJLJI = activityC45651qj;
        if (activityC45651qj != null && (lifecycle = activityC45651qj.getLifecycle()) != null) {
            this.LJLJJI = lifecycle;
            if (activityC45651qj != null && (viewModelStore = activityC45651qj.getViewModelStore()) != null) {
                this.LJLJJL = viewModelStore;
                return;
            }
            throw new IllegalStateException("Social Context need ViewModel store!");
        }
        throw new IllegalStateException("Social Context need Lifecycle!");
    }
}
