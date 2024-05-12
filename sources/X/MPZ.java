package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.notification.vm.NotificationVM;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MPZ {
    public static NotificationVM LIZ(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        NotificationVM notificationVM = (NotificationVM) ViewModelProviders.of(fragment).get(NotificationVM.class);
        if (notificationVM.LJLLILLLL == null) {
            notificationVM.LJLLILLLL = new MPY(fragment);
        }
        return notificationVM;
    }
}
