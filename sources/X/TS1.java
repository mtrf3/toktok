package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.util.MultiGuestDialogManager;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class TS1 {
    public static MultiGuestDialogManager LIZ() {
        return (MultiGuestDialogManager) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_DIALOG_MANAGER");
    }

    public static void LIZIZ(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        C75559Tl5.LIZIZ.LJI(new MultiGuestDialogManager(lifecycleOwner), null);
    }
}
