package X;

import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.api.consumer.ApmEvent;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Pua, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65956Pua implements InterfaceC66066PwM {
    public III LIZ;

    @Override // X.InterfaceC66066PwM
    public final String LIZ() {
        return "ApmEvent";
    }

    @Override // X.InterfaceC66066PwM
    public final void LIZIZ(InterfaceC66068PwO aEvent) {
        o.LJIIIZ(aEvent, "aEvent");
        if (aEvent instanceof ApmEvent) {
            ApmEvent apmEvent = (ApmEvent) aEvent;
            HeliosEnvImpl heliosEnvImpl = HeliosEnvImpl.get();
            o.LJIIIIZZ(heliosEnvImpl, "HeliosEnvImpl.get()");
            SettingsModel settingsModel = heliosEnvImpl.LJIIJ;
            double d = settingsModel.sampleRateConfig.localAPMConfig;
            if (o.LJ(apmEvent.mName, "sky_eye_apm_log") && !apmEvent.LJLIL && !C65972Puq.LJ(d)) {
                return;
            }
            String str = settingsModel.abTag;
            if (str != null && str.length() != 0) {
                java.util.Map<String, Object> categories = apmEvent.mCategories;
                o.LJIIIIZZ(categories, "categories");
                categories.put("ab_tag", settingsModel.abTag);
            }
            III iii = this.LIZ;
            if (iii != null) {
                String name = apmEvent.mName;
                o.LJIIIIZZ(name, "name");
                iii.LIZ(name, apmEvent.mCategories, apmEvent.mMetrics, apmEvent.mExtras);
            }
        }
    }
}
