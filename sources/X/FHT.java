package X;

import com.bytedance.ttmock.TTMock;
import com.bytedance.ttmock.data.ABSettingsMock;
import com.google.gson.j;
import com.google.gson.m;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FHT {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C38720FHo.LJLIL);

    public static void LIZ() {
        m mVar;
        j LJJIJ;
        ABSettingsMock aBSettingsMock = (ABSettingsMock) TTMock.INSTANCE.getMockDelegate(ABSettingsMock.class);
        if (aBSettingsMock == null || (mVar = (m) aBSettingsMock.get()) == null) {
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        java.util.Set<String> LJJIZ = mVar.LJJIZ();
        if (LJJIZ != null) {
            for (String str : LJJIZ) {
                if (str != null && (LJJIJ = mVar.LJJIJ(str)) != null) {
                    concurrentHashMap.put(str, LJJIJ);
                }
            }
        }
        C38731FHz c38731FHz = C38731FHz.LIZIZ;
        InterfaceC38722FHq storageProvider = c38731FHz.LIZ;
        FH5 LIZIZ = FH5.LIZIZ();
        o.LJIIIIZZ(storageProvider, "storageProvider");
        FHS fhs = new FHS(concurrentHashMap, storageProvider);
        LIZIZ.getClass();
        c38731FHz.LIZ = fhs;
        FI6 fi6 = LIZIZ.LJI;
        InterfaceC38722FHq interfaceC38722FHq = c38731FHz.LIZ;
        if (interfaceC38722FHq == null) {
            return;
        }
        interfaceC38722FHq.LJII(fi6);
    }

    public static Boolean LIZIZ() {
        return (Boolean) LIZ.getValue();
    }
}
