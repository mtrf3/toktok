package X;

import com.bytedance.android.livesdk.comp.api.network.INetworkService;
import java.util.List;

/* renamed from: X.PhA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65124PhA {
    public static volatile C65124PhA LIZ;

    public static java.util.Map LIZIZ() {
        return ((INetworkService) CN1.LIZ(INetworkService.class)).getCommonParams();
    }

    public static String LIZJ() {
        return ((INetworkService) CN1.LIZ(INetworkService.class)).getHostDomain();
    }

    public static C65124PhA LIZLLL() {
        if (LIZ == null) {
            synchronized (C65124PhA.class) {
                if (LIZ == null) {
                    LIZ = new C65124PhA();
                }
            }
        }
        return LIZ;
    }

    public static InterfaceC31105CIr LJ(Class cls) {
        return ((INetworkService) CN1.LIZ(INetworkService.class)).Kq0(cls);
    }

    public static InterfaceC31677Cbx LIZ(String str, List list) {
        return ((INetworkService) CN1.LIZ(INetworkService.class)).get(str, list);
    }

    public static InterfaceC31677Cbx LJFF(String str, List list, String str2, byte[] bArr) {
        return ((INetworkService) CN1.LIZ(INetworkService.class)).mL(str, list, str2, bArr);
    }

    public static InterfaceC31677Cbx LJI(int i, String str, List list, String str2, byte[] bArr, long j, String str3) {
        return ((INetworkService) CN1.LIZ(INetworkService.class)).uploadFile(i, str, list, str2, bArr, j, str3);
    }
}
