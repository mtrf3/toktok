package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Eva, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37990Eva {
    public static final C37990Eva LIZ = new C37990Eva();

    public static OSJ LIZ(String str, String jsbName) {
        boolean z;
        Object LIZ2;
        ArrayList<String> arrayList;
        ArrayList<String> arrayList2;
        o.LJIIJ(jsbName, "jsbName");
        boolean z2 = false;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C37989EvZ.LIZIZ.getClass();
            C37991Evb c37991Evb = C37989EvZ.LIZ;
            if (!c37991Evb.LIZ || ((arrayList2 = c37991Evb.LIZIZ) != null && arrayList2.contains(jsbName))) {
                z2 = true;
            }
            return new OSJ(Boolean.valueOf(z2), null, "dataflowId is empty!");
        }
        try {
            LIZ2 = Integer.valueOf(CastIntegerProtector.parseInt(str));
            C3C5.m7constructorimpl(LIZ2);
        } catch (Throwable th) {
            LIZ2 = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ2);
        }
        if (C3C5.m12isFailureimpl(LIZ2)) {
            LIZ2 = null;
        }
        if (LIZ2 == null) {
            C37989EvZ.LIZIZ.getClass();
            C37991Evb c37991Evb2 = C37989EvZ.LIZ;
            if (!c37991Evb2.LIZ || ((arrayList = c37991Evb2.LIZIZ) != null && arrayList.contains(jsbName))) {
                z2 = true;
            }
            return new OSJ(Boolean.valueOf(z2), null, "dataflowId is invalid!");
        }
        return new OSJ(Boolean.FALSE, LIZ2, "dataflowId is invalid!");
    }
}
