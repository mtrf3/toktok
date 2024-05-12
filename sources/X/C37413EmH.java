package X;

import com.bytedance.pia.core.setting.Settings;
import kotlin.jvm.internal.o;

/* renamed from: X.EmH, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37413EmH {
    public static Settings LIZ(C37413EmH c37413EmH) {
        Settings settings;
        c37413EmH.getClass();
        if (!Settings.LJII) {
            return (Settings) Settings.LJI.getValue();
        }
        Settings settings2 = Settings.LJIIIIZZ;
        if (settings2 != null && (!o.LJ(settings2, Settings.LJFF.getValue()))) {
            return settings2;
        }
        InterfaceC37417EmL interfaceC37417EmL = C37509Enp.LIZJ;
        if (interfaceC37417EmL == null || (settings = (Settings) interfaceC37417EmL.LIZ("pia_global_config", Settings.LJFF.getValue(), Settings.class)) == null) {
            settings = (Settings) Settings.LJFF.getValue();
        }
        Settings.LJIIIIZZ = settings;
        return settings;
    }
}
