package X;

import android.util.SparseIntArray;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;

/* loaded from: classes15.dex */
public final class W8L {
    public final W9W LIZ;
    public final C78937UyT LIZIZ;
    public final W9W LIZJ;
    public final WB6 LIZLLL;
    public final W9W LJ;
    public final C78937UyT LJFF;
    public final W9W LJI;
    public final C78937UyT LJII;
    public final String LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;

    public W8L(WAT wat) {
        int i;
        int i2;
        C81939WDv.LIZIZ();
        wat.getClass();
        this.LIZ = W9E.LIZ();
        this.LIZIZ = C78937UyT.LJIIIIZZ();
        int i3 = C81854WAo.LIZ;
        int i4 = i3 * 4194304;
        SparseIntArray sparseIntArray = new SparseIntArray();
        int i5 = 131072;
        do {
            sparseIntArray.put(i5, i3);
            i5 *= 2;
        } while (i5 <= 4194304);
        this.LIZJ = new W9W(4194304, i4, sparseIntArray, C81854WAo.LIZ);
        WB6 wb6 = wat.LIZ;
        this.LIZLLL = wb6 == null ? C81859WAt.LIZIZ() : wb6;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray2.put(1024, 5);
        sparseIntArray2.put(2048, 5);
        sparseIntArray2.put(4096, 5);
        sparseIntArray2.put(FileUtils.BUFFER_SIZE, 5);
        sparseIntArray2.put(16384, 5);
        sparseIntArray2.put(32768, 5);
        sparseIntArray2.put(65536, 5);
        sparseIntArray2.put(131072, 5);
        sparseIntArray2.put(262144, 2);
        sparseIntArray2.put(524288, 2);
        sparseIntArray2.put(1048576, 2);
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            i = 3145728;
        } else if (min < 33554432) {
            i = 6291456;
        } else {
            i = 12582912;
        }
        int min2 = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min2 < 16777216) {
            i2 = min2 / 2;
        } else {
            i2 = (min2 / 4) * 3;
        }
        this.LJ = new W9W(i, i2, sparseIntArray2, -1);
        this.LJFF = C78937UyT.LJIIIIZZ();
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        sparseIntArray3.put(16384, 5);
        this.LJI = new W9W(81920, 1048576, sparseIntArray3, -1);
        this.LJII = C78937UyT.LJIIIIZZ();
        this.LJIIIIZZ = "legacy";
        this.LJIIIZ = wat.LIZIZ;
        this.LJIIJ = 4194304;
        C81939WDv.LIZIZ();
    }
}
