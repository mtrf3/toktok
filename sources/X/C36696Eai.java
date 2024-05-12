package X;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Eai, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36696Eai implements InterfaceC43052Gv2 {
    public final AtomicBoolean LIZ = new AtomicBoolean(false);

    @Override // X.InterfaceC43052Gv2
    public final void LIZLLL() {
        if (!this.LIZ.compareAndSet(false, true)) {
            return;
        }
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new EDF(null), 3);
    }

    @Override // X.InterfaceC43052Gv2
    public final boolean isEnabled() {
        boolean storageMonitorLocalSwitch = C60903NvH.LJIIJJI().LJJIL().getStorageMonitorLocalSwitch(true);
        Boolean settingsSwitch = C2YJ.LIZIZ.LIZ.getEnableAvStorageMonitor();
        if (storageMonitorLocalSwitch) {
            o.LJIIIIZZ(settingsSwitch, "settingsSwitch");
            if (settingsSwitch.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC43052Gv2
    public final void LIZ(boolean z) {
        C60903NvH.LJIIJJI().LJJIL().setStorageMonitorLocalSwitch(z);
    }

    @Override // X.InterfaceC43052Gv2
    public final void LJFF(File file) {
        isEnabled();
    }

    @Override // X.InterfaceC43052Gv2
    public final void LIZIZ(long j, String key) {
        o.LJIIIZ(key, "key");
        if (!isEnabled()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("module", key);
        jSONObject.put("duration", j);
        C43882HKc.LIZIZ("av_storage_storage_size_count_time", jSONObject);
    }

    @Override // X.InterfaceC43052Gv2
    public final void LIZJ(long j, String key) {
        o.LJIIIZ(key, "key");
        if (!isEnabled()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("module", key);
        jSONObject.put("duration", j);
        C43882HKc.LIZIZ("av_storage_storage_clean_time", jSONObject);
    }

    @Override // X.InterfaceC43052Gv2
    public final void LJ(Exception exc, String key) {
        o.LJIIIZ(key, "key");
        if (!isEnabled()) {
            return;
        }
        GXW.LIZJ();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("module", key);
        jSONObject.put("exception", android.util.Log.getStackTraceString(exc));
        C43882HKc.LIZIZ("av_storage_storage_clean_error", jSONObject);
    }
}
