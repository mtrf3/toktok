package X;

import com.bytedance.helios.api.config.CacheConfig;
import com.bytedance.helios.api.config.NetworkConfig;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.api.config.StackConfig;
import com.bytedance.helios.network.NetworkComponent;
import kotlin.jvm.internal.AqS158S0200000_11;

/* renamed from: X.Ptn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65907Ptn {
    public static final C65908Pto<C65896Ptc> LIZ = new C65908Pto<>(C65915Ptv.LJLIL, C65906Ptm.LJLIL, new C65910Ptq(), null, 8, null);

    public static CacheConfig LIZ() {
        NetworkConfig networkConfig;
        StackConfig stackConfig;
        CacheConfig cacheConfig;
        SettingsModel settings = NetworkComponent.INSTANCE.getSettings();
        if (settings != null && (networkConfig = settings.networkConfig) != null && (stackConfig = networkConfig.stackConfig) != null && (cacheConfig = stackConfig.cacheConfig) != null) {
            return cacheConfig;
        }
        return new CacheConfig(0, 0L, 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
    public static C65896Ptc LIZIZ(Object obj) {
        Object obj2;
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = null;
        C65908Pto<C65896Ptc> c65908Pto = LIZ;
        if (obj != null) {
            obj2 = obj;
        } else {
            obj2 = C76800UCe.LIZ;
        }
        ?? elementByUniqueKey = c65908Pto.getElementByUniqueKey(obj2);
        if (elementByUniqueKey != 0) {
            c65908Pto.remove(elementByUniqueKey);
            c68322mC.element = elementByUniqueKey;
        }
        C65926Pu6.LIZIZ("Helios:Network-Stack", new AqS158S0200000_11(c68322mC, obj, 17), 2, null, 8);
        return (C65896Ptc) c68322mC.element;
    }
}
