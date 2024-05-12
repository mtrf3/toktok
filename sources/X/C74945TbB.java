package X;

import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveAbLabelSetting;
import kotlin.jvm.internal.o;

/* renamed from: X.TbB, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C74945TbB {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(Boolean bool) {
        if (o.LJ(bool, Boolean.TRUE)) {
            return LiveAbLabelSetting.INSTANCE.getIntValue("live_sdk_multiguest_opt_link_mic_mode");
        }
        Integer LIZIZ = U4C.LIZIZ("live_sdk_multiguest_opt_link_mic_mode");
        if (LIZIZ != null) {
            return LIZIZ.intValue();
        }
        return 0;
    }

    public static boolean LIZIZ(Boolean bool) {
        if (LIZ(bool) != 0) {
            return true;
        }
        return false;
    }
}
