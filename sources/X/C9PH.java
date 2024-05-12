package X;

import android.util.SparseArray;

/* renamed from: X.9PH, reason: invalid class name */
/* loaded from: classes5.dex */
public enum C9PH {
    DEFAULT(0),
    UNMETERED_ONLY(1),
    UNMETERED_OR_DAILY(2),
    FAST_IF_RADIO_AWAKE(3),
    NEVER(4),
    UNRECOGNIZED(-1);

    public final int LJLIL;

    static {
        C9PH c9ph = DEFAULT;
        C9PH c9ph2 = UNMETERED_ONLY;
        C9PH c9ph3 = UNMETERED_OR_DAILY;
        C9PH c9ph4 = FAST_IF_RADIO_AWAKE;
        C9PH c9ph5 = NEVER;
        C9PH c9ph6 = UNRECOGNIZED;
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, c9ph);
        sparseArray.put(1, c9ph2);
        sparseArray.put(2, c9ph3);
        sparseArray.put(3, c9ph4);
        sparseArray.put(4, c9ph5);
        sparseArray.put(-1, c9ph6);
    }

    public final int getNumber() {
        return this.LJLIL;
    }

    public static C9PH forNumber(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            return null;
                        }
                        return NEVER;
                    }
                    return FAST_IF_RADIO_AWAKE;
                }
                return UNMETERED_OR_DAILY;
            }
            return UNMETERED_ONLY;
        }
        return DEFAULT;
    }

    public static C9PH valueOf(String str) {
        return (C9PH) V0N.LJJJ(C9PH.class, str);
    }

    C9PH(int i) {
        this.LJLIL = i;
    }
}
