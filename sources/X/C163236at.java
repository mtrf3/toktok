package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.shoutouts.ShoutoutSettings;
import kotlin.jvm.internal.o;

/* renamed from: X.6at, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163236at {
    public static ShoutoutSettings LIZ() {
        if (SettingsManager.LIZLLL().LJIIIIZZ("shoutouts_config_collection", ShoutoutSettings.class, null) == null) {
            return new ShoutoutSettings();
        }
        ShoutoutSettings shoutoutSettings = (ShoutoutSettings) SettingsManager.LIZLLL().LJIIIIZZ("shoutouts_config_collection", ShoutoutSettings.class, null);
        o.LJI(shoutoutSettings);
        return shoutoutSettings;
    }
}
