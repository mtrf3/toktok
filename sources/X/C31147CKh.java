package X;

import com.bytedance.android.livesdk.livesetting.broadcast.TTLSPreInitSettings;
import com.bytedance.android.livesdk.livesetting.performance.LiveStreamABThreadPrioritSettings;
import com.bytedance.android.livesdk.livesetting.performance.LiveTTLSDebugLogEnableSettings;
import com.bytedance.android.livesdk.livesetting.performance.LiveTTLSThrowExceptionSettings;
import com.bytedance.android.livesdk.livesetting.performance.TTLSThreadPrioritySettings;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.ss.ttlivestreamer.core.utils.DebugLogUtils;
import com.ss.ttlivestreamer.core.utils.LiveStreamThreadPrioritySettings;
import com.ss.ttlivestreamer.core.utils.LiveStreamThreadPriorityUtils;
import com.ss.ttlivestreamer.core.utils.LiveStreamThreadType;
import com.ss.ttlivestreamer.core.utils.TTLSBuildConfig;
import com.ss.ttlivestreamer.core.utils.TTLSSladarBugReportUtils;
import com.ss.ttlivestreamer.core.utils.TTLSThreadConfigHelper;

/* renamed from: X.CKh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31147CKh {
    public static volatile boolean LIZ;
    public static volatile boolean LIZIZ;

    public static void LIZIZ() {
        if (LIZ) {
            return;
        }
        LIZ = true;
        TTLSSladarBugReportUtils.getInstance().registerReportListener(new C57964Moy());
        TTLSBuildConfig.setDebug(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline());
        TTLSBuildConfig.setThrowExceptionEnable(LiveTTLSThrowExceptionSettings.INSTANCE.canThrowException());
        DebugLogUtils.setIsEnableDebugLog(LiveTTLSDebugLogEnableSettings.INSTANCE.isDebugLogEnabled());
    }

    public static void LIZ() {
        LIZIZ();
        if (!LIZIZ) {
            TTLSPreInitSettings tTLSPreInitSettings = TTLSPreInitSettings.INSTANCE;
            if (tTLSPreInitSettings.enablePreLoad() || tTLSPreInitSettings.enablePreLoadThreads()) {
                LIZIZ = true;
                LiveStreamThreadPrioritySettings liveStreamThreadPrioritySettings = new LiveStreamThreadPrioritySettings();
                for (EnumC31148CKi enumC31148CKi : EnumC31148CKi.values()) {
                    LiveStreamThreadType threadType = enumC31148CKi.getThreadType();
                    LiveStreamABThreadPrioritSettings liveStreamABThreadPrioritSettings = LiveStreamABThreadPrioritSettings.INSTANCE;
                    liveStreamThreadPrioritySettings.addSettings(threadType, liveStreamABThreadPrioritSettings.isEnabled(enumC31148CKi), liveStreamABThreadPrioritSettings.getThreadPriority(enumC31148CKi));
                }
                LiveStreamThreadPriorityUtils.init(liveStreamThreadPrioritySettings);
                TTLSThreadConfigHelper.init(TTLSThreadPrioritySettings.INSTANCE.getThreadConfigs());
            }
        }
    }
}
