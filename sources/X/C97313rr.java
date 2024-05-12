package X;

import android.app.Activity;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.im.sdk.chat.utils.AvoidRepeatUtil$addLifecycleObserverIfIsFirstTime$1;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.AqS148S0200000_1;

/* renamed from: X.3rr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C97313rr {
    public static final C97313rr LIZ = new C97313rr();

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(java.util.Map map) {
        LifecycleOwner lifecycleOwner;
        long j;
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity == 0 || !(topActivity instanceof LifecycleOwner) || (lifecycleOwner = (LifecycleOwner) topActivity) == null) {
            return;
        }
        AqS148S0200000_1 aqS148S0200000_1 = new AqS148S0200000_1(topActivity, map, 21);
        try {
            long currentTimeMillis = System.currentTimeMillis();
            C62822Ol8 c62822Ol8 = C97323rs.LIZ;
            Long l = (Long) ((java.util.Map) c62822Ol8.getValue()).get("bot_typing_toast");
            if (l != null) {
                j = l.longValue();
            } else {
                j = 0;
            }
            if (currentTimeMillis - j >= 3000) {
                aqS148S0200000_1.invoke();
                Long l2 = (Long) ((java.util.Map) c62822Ol8.getValue()).get("bot_typing_toast");
                if (l2 == null || l2.longValue() == 0) {
                    lifecycleOwner.getLifecycle().addObserver(new AvoidRepeatUtil$addLifecycleObserverIfIsFirstTime$1());
                }
                ((java.util.Map) c62822Ol8.getValue()).put("bot_typing_toast", Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Exception e) {
            QCU.LJFF("anti repeat exception!", e, 4);
        }
    }
}
