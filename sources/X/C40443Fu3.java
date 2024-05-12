package X;

import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Fu3, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40443Fu3 {
    public static InterfaceC55057LjB LIZ(String type) {
        o.LJIIIZ(type, "type");
        if (C35112DqG.LIZ(type)) {
            HashMap<String, PRJ> hashMap = C38847FMl.LIZIZ;
            PRJ prj = hashMap.get(type);
            if (prj != null) {
                return prj;
            }
            PRJ prj2 = new PRJ(type);
            hashMap.put(type, prj2);
            return prj2;
        }
        HashMap<String, InterfaceC55057LjB> hashMap2 = C38847FMl.LIZ;
        InterfaceC55057LjB interfaceC55057LjB = hashMap2.get(type);
        if (interfaceC55057LjB != null) {
            return interfaceC55057LjB;
        }
        PRD prd = new PRD(type);
        hashMap2.put(type, prd);
        return prd;
    }

    public static InterfaceC55057LjB LIZIZ(String type) {
        o.LJIIIZ(type, "type");
        if (C35112DqG.LIZ(type)) {
            return C38847FMl.LIZIZ.get(type);
        }
        return C38847FMl.LIZ.get(type);
    }
}
