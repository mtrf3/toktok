package X;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.QoA, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C68106QoA {
    public static final List LIZ;
    public static final List LIZIZ;
    public static final List LIZJ;
    public static final List LIZLLL;
    public static final List LJ;

    static {
        new HashSet(Arrays.asList("_in", "_xa", "_xu", "_aq", "_aa", "_ai", "_ac", "campaign_details", "_ug", "_iapx", "_exp_set", "_exp_clear", "_exp_activate", "_exp_timeout", "_exp_expire"));
        LIZ = Arrays.asList("_e", "_f", "_iap", "_s", "_au", "_ui", "_cd");
        LIZIZ = Arrays.asList("auto", "app", "am");
        LIZJ = Arrays.asList("_r", "_dbg");
        String[][] strArr = {C68119QoN.LIZ, C68119QoN.LIZIZ};
        int i = 0;
        int i2 = 0;
        do {
            i2 += strArr[i].length;
            i++;
        } while (i < 2);
        Object[] copyOf = Arrays.copyOf(strArr[0], i2);
        int length = strArr[0].length;
        String[] strArr2 = strArr[1];
        System.arraycopy(strArr2, 0, copyOf, length, strArr2.length);
        LIZLLL = Arrays.asList(copyOf);
        LJ = Arrays.asList("^_ltv_[A-Z]{3}$", "^_cc[1-5]{1}$");
    }
}
