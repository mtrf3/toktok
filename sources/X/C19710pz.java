package X;

import com.bytedance.android.live.broadcast.setting.MobileHighPingAdjustBitrateInfo;
import com.bytedance.android.livesdk.livesetting.game.ShowHighPingTipsSwitcher;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.0pz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C19710pz {
    public static final java.util.Map<EnumC21060sA, InterfaceC21070sB> LIZ;
    public static final AtomicBoolean LIZIZ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LIZ = linkedHashMap;
        LIZIZ = new AtomicBoolean(false);
        if (ShowHighPingTipsSwitcher.INSTANCE.isEnable()) {
            linkedHashMap.put(EnumC21060sA.HIGH_PING_TIPS_MODULE, new C1Y5());
        }
        if (MobileHighPingAdjustBitrateInfo.INSTANCE.isEnableAdjustBitrateScope()) {
            linkedHashMap.put(EnumC21060sA.HIGH_PING_BITRATE_ADJUST_MODULE, new C1Y4());
        }
    }
}
