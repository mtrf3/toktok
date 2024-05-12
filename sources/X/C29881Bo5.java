package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.performance.PanelOpenCostTimesSetting;
import java.util.EnumMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Bo5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29881Bo5 {
    public static final java.util.Map<EnumC29609Bjh, Long> LIZ = new EnumMap(EnumC29609Bjh.class);

    public static final void LIZ(EnumC29609Bjh panel) {
        o.LJIIIZ(panel, "panel");
        if (!PanelOpenCostTimesSetting.INSTANCE.getValue().mSwitch || panel == EnumC29609Bjh.DEFAULT || panel == null) {
            return;
        }
        ((EnumMap) LIZ).put((EnumMap) panel, (EnumC29609Bjh) Long.valueOf(SystemClock.uptimeMillis()));
    }
}
