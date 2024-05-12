package X;

import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes7.dex */
public final class EEZ {
    public static final CopyOnWriteArrayList<InterfaceC36081EEb> LIZ = new CopyOnWriteArrayList<>();
    public static EEU LIZIZ = EEU.COLD_BOOT_BEGIN;
    public static boolean LIZJ = true;

    public static boolean LIZIZ() {
        if (LIZIZ == EEU.COLD_BOOT_END || LIZIZ == EEU.HOT_BOOT_END) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ() {
        if (LIZIZ == EEU.COLD_BOOT_BEGIN || LIZIZ == EEU.COLD_BOOT_END) {
            return true;
        }
        return false;
    }

    public static void LIZ(InterfaceC36081EEb interfaceC36081EEb) {
        if (LIZIZ == EEU.COLD_BOOT_BEGIN) {
            LIZ.add(interfaceC36081EEb);
        }
    }
}
