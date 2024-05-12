package X;

import com.bytedance.tux.input.TuxTextView;
import java.util.HashMap;

/* renamed from: X.84u, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2055284u {
    public static final HashMap<Integer, Integer> LIZ;

    static {
        boolean z;
        HashMap<Integer, Integer> hashMap;
        C62822Ol8 c62822Ol8 = C52689Km5.LIZ;
        if (((Number) c62822Ol8.getValue()).intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            hashMap = C113554cx.LJJJLZIJ(new OSZ(1, 102), new OSZ(2, 52), new OSZ(3, 51), new OSZ(4, 62), new OSZ(5, 72), new OSZ(6, 62));
        } else if (((Number) c62822Ol8.getValue()).intValue() == 2) {
            hashMap = C113554cx.LJJJLZIJ(new OSZ(1, 0), new OSZ(2, 52), new OSZ(3, 41), new OSZ(4, 62), new OSZ(5, 72), new OSZ(6, 0));
        } else {
            hashMap = new HashMap<>();
        }
        LIZ = hashMap;
    }

    public static float LIZ(boolean z) {
        if (((Number) C52689Km5.LIZ.getValue()).intValue() == 1 && !z) {
            return C32151Nz.LJIIZILJ(14);
        }
        return C32151Nz.LJIIZILJ(15);
    }

    public static void LJFF(TuxTextView tuxTextView) {
        if (tuxTextView == null) {
            return;
        }
        LIZLLL(tuxTextView, 4, null, false);
    }

    public static void LIZJ(TuxTextView tuxTextView, Integer num) {
        if (tuxTextView == null) {
            return;
        }
        LIZLLL(tuxTextView, 6, num, false);
    }

    public static Integer LIZIZ(int i, Integer num, boolean z, boolean z2) {
        Integer num2;
        if (z || C8D3.LIZJ() || z2 || (num2 = LIZ.get(Integer.valueOf(i))) == null || num2.intValue() == 0) {
            return num;
        }
        return num2;
    }

    public static void LIZLLL(TuxTextView tuxTextView, int i, Integer num, boolean z) {
        Integer LIZIZ = LIZIZ(i, num, C79004UzY.LJJIJIIJI(tuxTextView.getContext()), z);
        if (LIZIZ == null || LIZIZ.intValue() == 0) {
            return;
        }
        tuxTextView.setTuxFont(LIZIZ.intValue());
    }

    public static void LJ(TuxTextView tuxTextView, Integer num, boolean z, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        LIZLLL(tuxTextView, 4, num, z);
    }

    public static void LJI(TuxTextView tuxTextView, Integer num, boolean z, int i) {
        if ((i & 2) != 0) {
            num = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        LIZLLL(tuxTextView, 1, num, z);
    }
}
