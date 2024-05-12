package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;

/* renamed from: X.7WI, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7WI {
    public static final java.util.Set<String> LIZ;
    public static final java.util.Set<String> LIZIZ;

    static {
        new C7WI();
        java.util.Set<String> LJII = C77275UUl.LJII(C16880lQ.LJLLJ(VideoDiggAssem.class));
        LIZ = LJII;
        LIZIZ = (java.util.Set) SettingsManager.LIZLLL().LJIIIIZZ("feed_abnormal_view_interception_settings", java.util.Set.class, LJII);
    }
}
