package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.specact.api.ISpecActService;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.G3d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40893G3d {
    public static final ConcurrentHashMap<Integer, InterfaceC56322M8o> LIZ = new ConcurrentHashMap<>();

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZ(Fragment fragment, String str) {
        InterfaceC56322M8o interfaceC56322M8o;
        if (fragment == 0 || fragment.getContext() == null) {
            return;
        }
        int hashCode = fragment.hashCode();
        if (!(fragment instanceof InterfaceC56322M8o)) {
            ConcurrentHashMap<Integer, InterfaceC56322M8o> concurrentHashMap = LIZ;
            if (!concurrentHashMap.containsKey(Integer.valueOf(hashCode))) {
                concurrentHashMap.put(Integer.valueOf(hashCode), new AXB(fragment, str));
            }
            ConcurrentHashMap<Integer, InterfaceC56322M8o> concurrentHashMap2 = LIZ;
            if (!concurrentHashMap2.containsKey(Integer.valueOf(hashCode))) {
                return;
            } else {
                interfaceC56322M8o = concurrentHashMap2.get(Integer.valueOf(hashCode));
            }
        } else {
            interfaceC56322M8o = (InterfaceC56322M8o) fragment;
        }
        if (interfaceC56322M8o == null) {
            return;
        }
        ISpecActService.LIZ.getClass();
        C40894G3e.LIZ().LJIIJ(interfaceC56322M8o, str, 101, true);
    }
}
