package X;

import androidx.lifecycle.MutableLiveData;

/* renamed from: X.JTl, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49221JTl {
    public static boolean LIZ(InterfaceC49220JTk interfaceC49220JTk) {
        Integer value;
        if (interfaceC49220JTk.LIZ() == null) {
            return true;
        }
        MutableLiveData<Integer> LIZ = interfaceC49220JTk.LIZ();
        if (LIZ != null && (value = LIZ.getValue()) != null && 1 == value.intValue()) {
            return true;
        }
        return false;
    }
}
