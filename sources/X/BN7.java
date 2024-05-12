package X;

import android.view.OrientationEventListener;
import com.bytedance.android.livesdk.chatroom.helper.AudienceOrientationManager;

/* loaded from: classes6.dex */
public final class BN7 implements Runnable {
    public static final BN7 LJLIL = new BN7();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            AudienceOrientationManager.LIZ.getClass();
            C62822Ol8 c62822Ol8 = AudienceOrientationManager.LIZJ;
            if (((OrientationEventListener) c62822Ol8.getValue()).canDetectOrientation()) {
                ((OrientationEventListener) c62822Ol8.getValue()).enable();
            } else {
                ((OrientationEventListener) c62822Ol8.getValue()).disable();
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
