package X;

import Y.IDFactoryS410S0100000_9;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.profile.ListLiveCircleItemVM;
import kotlin.jvm.internal.o;

/* renamed from: X.Lk8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55116Lk8 {
    public static ListLiveCircleItemVM LIZ(int i, ActivityC45651qj activity) {
        o.LJIIIZ(activity, "activity");
        InterfaceC55117Lk9.LJJZ.getClass();
        if (i == 1) {
            return (ListLiveCircleItemVM) ViewModelProviders.of(activity, new IDFactoryS410S0100000_9(activity, 3)).get(ListLiveCircleItemVM.ListLiveCircleItemVMFollowing.class);
        }
        if (i == 2) {
            return (ListLiveCircleItemVM) ViewModelProviders.of(activity, new IDFactoryS410S0100000_9(activity, 2)).get(ListLiveCircleItemVM.ListLiveCircleItemVMFollower.class);
        }
        return (ListLiveCircleItemVM) ViewModelProviders.of(activity, new IDFactoryS410S0100000_9(activity, 1)).get(ListLiveCircleItemVM.class);
    }
}
