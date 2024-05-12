package X;

import android.content.Intent;
import android.os.Bundle;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.H8t, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43587H8t {
    public static boolean LIZIZ;
    public static final java.util.Map<HBR, InterfaceC36085EEf> LIZ = new ConcurrentHashMap();
    public static final C43589H8v LIZJ = new C43589H8v();

    public static void LIZ(Bundle bundle, InterfaceC43591H8x interfaceC43591H8x) {
        for (HBR hbr : HBR.values()) {
            interfaceC43591H8x.LIZIZ(hbr, bundle.getString(hbr.intentKey));
        }
    }

    public static void LIZIZ(Intent intent, InterfaceC43592H8y interfaceC43592H8y, EnumC43590H8w enumC43590H8w, EnumC43590H8w enumC43590H8w2) {
        for (HBR hbr : HBR.values()) {
            String str = hbr.intentKey;
            InterfaceC36085EEf interfaceC36085EEf = (InterfaceC36085EEf) ((ConcurrentHashMap) LIZ).get(hbr);
            if (interfaceC36085EEf == null) {
                interfaceC36085EEf = LIZJ;
            }
            intent.putExtra(str, interfaceC36085EEf.LIZ(interfaceC43592H8y.LIZIZ(hbr), enumC43590H8w, enumC43590H8w2));
        }
    }

    public static void LIZJ(InterfaceC43592H8y interfaceC43592H8y, InterfaceC43591H8x interfaceC43591H8x, EnumC43590H8w enumC43590H8w, EnumC43590H8w enumC43590H8w2) {
        for (HBR hbr : HBR.values()) {
            InterfaceC36085EEf interfaceC36085EEf = (InterfaceC36085EEf) ((ConcurrentHashMap) LIZ).get(hbr);
            if (interfaceC36085EEf == null) {
                interfaceC36085EEf = LIZJ;
            }
            interfaceC43591H8x.LIZIZ(hbr, interfaceC36085EEf.LIZ(interfaceC43592H8y.LIZIZ(hbr), enumC43590H8w, enumC43590H8w2));
        }
    }
}
