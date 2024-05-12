package X;

import com.bytedance.helios.api.config.NetworkConfig;
import com.bytedance.helios.api.config.SettingsModel;
import com.bytedance.helios.api.config.ShutdownConfig;
import com.bytedance.helios.network.NetworkComponent;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.Pu1, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65921Pu1 {
    public static String LIZ = CardStruct.IStatusCode.DEFAULT;
    public static String LIZIZ = CardStruct.IStatusCode.DEFAULT;
    public static HashSet<String> LIZJ = new HashSet<>();
    public static HashSet<String> LIZLLL = new HashSet<>();
    public static final ConcurrentHashMap<String, Boolean> LJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Boolean> LJFF = new ConcurrentHashMap<>();
    public static final AtomicBoolean LJI = new AtomicBoolean(false);

    public static boolean LIZ(String str, java.util.Set set) {
        int length = str.length() - 1;
        int i = 0;
        while (true) {
            if (length < 0) {
                break;
            }
            if (str.charAt(length) == '.') {
                i++;
                if (i == 2) {
                    String substring = str.substring(length + 1, str.length());
                    o.LJIIIIZZ(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (((HashSet) set).contains(substring)) {
                        return true;
                    }
                } else if (i == 3) {
                    String substring2 = str.substring(length + 1, str.length());
                    o.LJIIIIZZ(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (((HashSet) set).contains(substring2)) {
                        return true;
                    }
                }
            }
            length--;
        }
        return ((HashSet) set).contains(str);
    }

    public static void LIZIZ(C66226Pyw commonProxy, ShutdownConfig shutdownConfig) {
        String str;
        o.LJIIIZ(commonProxy, "commonProxy");
        HashSet<String> hashSet = new HashSet<>(64);
        InterfaceC65784Pro<java.util.Set<String>> interfaceC65784Pro = commonProxy.LJLLILLLL;
        if (interfaceC65784Pro != null) {
            hashSet.addAll(interfaceC65784Pro.invoke());
        }
        if (!shutdownConfig.onePartyDomains.isEmpty()) {
            hashSet.addAll(shutdownConfig.onePartyDomains);
        }
        HashSet<String> hashSet2 = new HashSet<>(1024);
        hashSet2.addAll(hashSet);
        InterfaceC65784Pro<java.util.Set<String>> interfaceC65784Pro2 = commonProxy.LJLLJ;
        if (interfaceC65784Pro2 != null) {
            hashSet2.addAll(interfaceC65784Pro2.invoke());
        }
        if (!shutdownConfig.thirdPartyDomains.isEmpty()) {
            hashSet2.addAll(shutdownConfig.thirdPartyDomains);
        }
        LIZJ = hashSet;
        LIZLLL = hashSet2;
        LJ.clear();
        LJFF.clear();
        SettingsModel settings = NetworkComponent.INSTANCE.getSettings();
        if (settings == null || (str = settings.version) == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        LIZIZ = str;
    }

    public static boolean LIZJ(String str, java.util.Set set, java.util.Map map) {
        NetworkConfig networkConfig;
        ShutdownConfig shutdownConfig;
        SettingsModel settings = NetworkComponent.INSTANCE.getSettings();
        if (settings != null && (networkConfig = settings.networkConfig) != null && (shutdownConfig = networkConfig.shutdownConfig) != null && shutdownConfig.enableDomainCache) {
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) map;
            Boolean bool = (Boolean) concurrentHashMap.get(str);
            if (bool != null) {
                return bool.booleanValue();
            }
            boolean LIZ2 = LIZ(str, set);
            concurrentHashMap.put(str, Boolean.valueOf(LIZ2));
            return LIZ2;
        }
        return LIZ(str, set);
    }
}
