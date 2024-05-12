package X;

import com.bytedance.android.live_settings.LiveSettingModel;
import java.lang.reflect.Field;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class CK5 implements InterfaceC30752C5c {
    public static final CK5 LIZ = new CK5();
    public static volatile InterfaceC30752C5c LIZIZ;

    @Override // X.InterfaceC30752C5c
    public final HashMap<String, LiveSettingModel> getModelMap() {
        Object obj;
        if (LIZIZ == null) {
            synchronized (CK5.class) {
                if (LIZIZ == null) {
                    try {
                        Field field = Class.forName("com.bytedance.android.live.settings.initializer.SettingsInitializer").getField("INSTANCE");
                        if (field != null) {
                            obj = field.get(null);
                        } else {
                            obj = null;
                        }
                        if (obj instanceof InterfaceC30752C5c) {
                            LIZIZ = (InterfaceC30752C5c) obj;
                        }
                    } catch (Exception e) {
                        HashMap hashMap = new HashMap(1);
                        hashMap.put("error_msg", e.toString());
                        hashMap.put("error_event", "getModelsMap");
                        C0K2.LJII(1, "ttlive_get_settings_error", hashMap);
                    }
                }
            }
        }
        InterfaceC30752C5c interfaceC30752C5c = LIZIZ;
        if (interfaceC30752C5c == null) {
            return null;
        }
        return interfaceC30752C5c.getModelMap();
    }
}
