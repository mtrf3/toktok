package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.notification.vm.NotificationCombineVM;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MPG {
    public static NotificationCombineVM LIZ(Fragment frag) {
        o.LJIIIZ(frag, "frag");
        NotificationCombineVM notificationCombineVM = (NotificationCombineVM) ViewModelProviders.of(frag).get(NotificationCombineVM.class);
        Context context = frag.getContext();
        notificationCombineVM.getClass();
        if (context != null) {
            notificationCombineVM.LJLL = new WeakReference<>(context);
        }
        notificationCombineVM.LJLLI = new WeakReference<>(frag);
        return notificationCombineVM;
    }
}
