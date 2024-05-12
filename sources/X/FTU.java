package X;

import com.google.gson.Gson;
import com.google.gson.e;
import com.google.gson.internal.Excluder;

/* loaded from: classes7.dex */
public final class FTU {
    public static final Gson LIZ;

    static {
        e eVar = new e();
        int[] iArr = {128, 8};
        Excluder clone = eVar.LIZ.clone();
        int i = 0;
        clone.LJLILLLLZI = 0;
        int i2 = 0;
        do {
            clone.LJLILLLLZI = iArr[i2] | clone.LJLILLLLZI;
            i2++;
        } while (i2 < 2);
        eVar.LIZ = clone;
        LIZ = eVar.LIZ();
        e eVar2 = new e();
        eVar2.LJIIL = false;
        int[] iArr2 = {128, 8};
        Excluder clone2 = eVar2.LIZ.clone();
        clone2.LJLILLLLZI = 0;
        do {
            clone2.LJLILLLLZI = iArr2[i] | clone2.LJLILLLLZI;
            i++;
        } while (i < 2);
        eVar2.LIZ = clone2;
        eVar2.LIZ();
    }
}
