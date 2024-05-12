package X;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* renamed from: X.VLo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79592VLo {
    public static final /* synthetic */ InterfaceC74236TBo[] LIZ;
    public static final C62822Ol8 LIZIZ;
    public static final C62822Ol8 LIZJ;
    public static final C62822Ol8 LIZLLL;
    public static final C79592VLo LJ;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(C79592VLo.class), "setExtraTimingMethod", "getSetExtraTimingMethod()Lcom/bytedance/android/monitorV2/util/Reflector$RefMethod;");
        C65352Pkq.LIZ.getClass();
        LIZ = new InterfaceC74236TBo[]{tbt, new TBT(C65352Pkq.LIZ(C79592VLo.class), "isHasActualFMP", "isHasActualFMP()Lcom/bytedance/android/monitorV2/util/Reflector$RefMethod;"), new TBT(C65352Pkq.LIZ(C79592VLo.class), "onTimingSetupMethod", "getOnTimingSetupMethod()Lcom/bytedance/android/monitorV2/util/Reflector$RefMethod;"), new TBT(C65352Pkq.LIZ(C79592VLo.class), "getOriginLeft", "getGetOriginLeft()Lcom/bytedance/android/monitorV2/util/Reflector$RefMethod;")};
        LJ = new C79592VLo();
        LIZIZ = C221108m2.LIZIZ(C79588VLk.LJLIL);
        LIZJ = C221108m2.LIZIZ(C79589VLl.LJLIL);
        LIZLLL = C221108m2.LIZIZ(C79587VLj.LJLIL);
        C221108m2.LIZIZ(C79590VLm.LJLIL);
    }

    public static void LIZ(VNS vns) {
        if (vns != null) {
            C62822Ol8 c62822Ol8 = LIZIZ;
            if (((C79583VLf) c62822Ol8.getValue()).LIZ() != null) {
                java.util.Map<String, Object> LLLLZ = OFI.LJI(vns).LLLLZ();
                LLLLZ.toString();
                C79583VLf c79583VLf = (C79583VLf) c62822Ol8.getValue();
                c79583VLf.getClass();
                c79583VLf.LIZIZ = new WeakReference<>(vns);
                Object[] objArr = new Object[1];
                String[] strArr = {"open_time", "container_init_start", "container_init_end", "prepare_template_start", "prepare_template_end"};
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int i = 0;
                do {
                    String str = strArr[i];
                    if (LLLLZ.containsKey(str)) {
                        linkedHashMap.put(str, ((LinkedHashMap) LLLLZ).get(str));
                    }
                    i++;
                } while (i < 5);
                objArr[0] = linkedHashMap;
                c79583VLf.LIZIZ(objArr);
            }
        }
    }
}
