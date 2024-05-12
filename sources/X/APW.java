package X;

import android.graphics.drawable.Animatable;
import com.ss.android.ugc.aweme.live.notification.ui.NotificationLiveBottomDialog;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class APW extends W4V<InterfaceC81599W0t> {
    public final /* synthetic */ NotificationLiveBottomDialog LIZIZ;

    public APW(NotificationLiveBottomDialog notificationLiveBottomDialog) {
        this.LIZIZ = notificationLiveBottomDialog;
    }

    @Override // X.W4V, X.W4Z
    public final void LJFF(String id, Object obj, Animatable animatable) {
        InterfaceC81252Vui controller;
        Animatable LIZ;
        o.LJIIIZ(id, "id");
        VA9 va9 = (VA9) this.LIZIZ._$_findCachedViewById(R.id.dkd);
        if (va9 != null && (controller = va9.getController()) != null && (LIZ = controller.LIZ()) != null) {
            NotificationLiveBottomDialog notificationLiveBottomDialog = this.LIZIZ;
            if (ProfileServiceImpl.LIZ().getAndResetPauseAvatarAnim()) {
                LIZ.stop();
                return;
            }
            if (notificationLiveBottomDialog.getUserVisibleHint() && !LIZ.isRunning()) {
                LIZ.start();
            } else {
                if (notificationLiveBottomDialog.getUserVisibleHint() || !LIZ.isRunning()) {
                    return;
                }
                LIZ.stop();
            }
        }
    }
}
