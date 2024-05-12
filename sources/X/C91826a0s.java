package X;

import android.app.Activity;
import com.bytedance.poplayer.core.PopupManager;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.a0s, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C91826a0s {
    public static String LIZ = "https://f-p.sgsnssdk.com";
    public static final String LIZIZ = C85990Xow.LIZ();
    public static String LIZJ = "";
    public static String LIZLLL = "";
    public static final AtomicBoolean LJ = new AtomicBoolean(false);

    public static void LIZ() {
        ActivityC45651qj activityC45651qj;
        if (!LJ.getAndSet(true)) {
            Activity validTopActivity = ActivityStack.getValidTopActivity();
            if ((validTopActivity instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) validTopActivity) != null) {
                PopupManager.LJIIL(new C93098aLO(activityC45651qj));
            }
        }
    }
}
