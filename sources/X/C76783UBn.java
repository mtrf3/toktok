package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.service.IHostMonitorAndLog;
import kotlin.jvm.internal.o;

/* renamed from: X.UBn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76783UBn implements UBG {
    @Override // X.UBG
    public final void LIZ(String scene) {
        IHostMonitorAndLog iHostMonitorAndLog;
        o.LJIIIZ(scene, "scene");
        if (!TextUtils.isEmpty(scene) && (iHostMonitorAndLog = (IHostMonitorAndLog) CN1.LIZ(IHostMonitorAndLog.class)) != null) {
            iHostMonitorAndLog.zC(scene);
        }
    }

    @Override // X.UBG
    public final void LIZIZ(String str) {
        IHostMonitorAndLog iHostMonitorAndLog;
        if (!TextUtils.isEmpty(str) && (iHostMonitorAndLog = (IHostMonitorAndLog) CN1.LIZ(IHostMonitorAndLog.class)) != null) {
            iHostMonitorAndLog.Xc0(str);
        }
    }
}
