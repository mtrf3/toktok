package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.feed.platform.container.info.button.BottomButtonPriorityConfig;

/* renamed from: X.8P1, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8P1 {
    public static final java.util.Set<String> LIZ;
    public static final java.util.Set<String> LIZIZ;

    static {
        new C8P1();
        java.util.Set<String> set = BottomButtonPriorityConfig.LIZ;
        LIZ = set;
        LIZIZ = (java.util.Set) SettingsManager.LIZLLL().LJIIIIZZ("feed_bottom_button_priority_settings", java.util.Set.class, set);
    }
}
