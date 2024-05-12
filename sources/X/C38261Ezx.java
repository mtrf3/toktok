package X;

import com.lynx.tasm.LynxSettingsManager;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ezx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38261Ezx implements InterfaceC86859Y7b {
    @Override // X.InterfaceC86859Y7b
    public final void LIZ(String reason) {
        o.LJIIIZ(reason, "reason");
    }

    @Override // X.InterfaceC86859Y7b
    public final void LIZIZ(String str, JSONObject jSONObject) {
    }

    @Override // X.InterfaceC86859Y7b
    public final void LIZJ(String content, JSONObject config) {
        o.LJIIIZ(config, "config");
        o.LJIIIZ(content, "content");
        LynxSettingsManager inst = LynxSettingsManager.inst();
        C39836FkG.LJII.getClass();
        inst.initSettings(C38262Ezy.LIZ().LIZIZ());
        LynxSettingsManager.inst().setSettingsWithTime(content, Integer.valueOf((int) (System.currentTimeMillis() / 1000)));
    }
}
