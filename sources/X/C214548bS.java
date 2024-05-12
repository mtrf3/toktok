package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.detail.vm.BaseDetailShareVM;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.8bS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C214548bS {
    public static BaseDetailShareVM LIZ(C7U3 c7u3, M89 param, LifecycleOwner owner) {
        Class<? extends BaseDetailShareVM<?, ?, ?>> second;
        o.LJIIIZ(param, "param");
        o.LJIIIZ(owner, "owner");
        OSZ<String, Class<? extends BaseDetailShareVM<?, ?, ?>>> LIZ = c7u3.LIZ(param);
        if (LIZ == null || (second = LIZ.getSecond()) == null) {
            return null;
        }
        SharedViewModelProvider sharedViewModelProvider = new SharedViewModelProvider((ViewModelProvider.Factory) null, 1, (DefaultConstructorMarker) null);
        Lifecycle lifecycle = owner.getLifecycle();
        o.LJIIIIZZ(lifecycle, "owner.lifecycle");
        BaseDetailShareVM baseDetailShareVM = (BaseDetailShareVM) sharedViewModelProvider.get(lifecycle, LIZ.getFirst(), second);
        if (!baseDetailShareVM._initialized) {
            baseDetailShareVM.initialize(owner);
        }
        return baseDetailShareVM;
    }
}
