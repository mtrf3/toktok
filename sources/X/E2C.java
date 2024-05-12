package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* loaded from: classes7.dex */
public final /* synthetic */ class E2C implements InterfaceC67677QhF {
    @Override // X.InterfaceC67677QhF
    public void onSuccess(Object obj) {
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("app_instance_id", (String) obj);
        c188727au.LIZLLL(3, "growth_deepevent");
        FMX.LJIIL("firebase_to_server", c188727au.LIZ);
    }

    public static java.util.Map LIZJ(String str, String str2) {
        return C51029K0z.LJJIIZI(new OSZ(str, str2));
    }

    public static Object LIZIZ(EnumC68385Qsf enumC68385Qsf, int i, List list, List list2, int i2) {
        C68368QsO.LJII(i, enumC68385Qsf.name(), list);
        return ListProtector.get(list2, i2);
    }

    public static Keva LIZ(int i, int i2, String str, boolean z, Keva keva, String str2) {
        FFL.LJIIIZ().getClass();
        keva.storeInt(str2, FFL.LJIIJ(i, i2, str, z));
        return C34580Dhg.LIZ();
    }
}
