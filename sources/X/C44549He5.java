package X;

import com.ss.android.ugc.aweme.creative.compileConfig.CompileConfigLevelStruct;
import java.util.List;

/* renamed from: X.He5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44549He5 {
    public C44570HeQ LIZ;
    public C44564HeK LIZIZ;
    public C44543Hdz LIZJ;
    public H57 LIZLLL;
    public C44560HeG LJ;
    public C44609Hf3 LJFF;

    public C44549He5() {
        this(0);
    }

    public final List<AbstractC44565HeL> LIZIZ() {
        C44543Hdz c44543Hdz = this.LIZJ;
        if (c44543Hdz != null) {
            return c44543Hdz.LIZ;
        }
        return null;
    }

    public C44549He5(int i) {
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = new C44560HeG();
        this.LJFF = new C44609Hf3();
    }

    public final int[] LIZ(boolean z) {
        CompileConfigLevelStruct<int[]> compileConfigLevelStruct;
        int[] iArr;
        CompileConfigLevelStruct<int[]> compileConfigLevelStruct2;
        int[] hd;
        if (z) {
            C44564HeK c44564HeK = this.LIZIZ;
            if (c44564HeK == null || (compileConfigLevelStruct2 = c44564HeK.LIZLLL) == null || (hd = compileConfigLevelStruct2.getHd()) == null) {
                return this.LJ.LJFF;
            }
            return hd;
        }
        C44564HeK c44564HeK2 = this.LIZIZ;
        if (c44564HeK2 != null && (compileConfigLevelStruct = c44564HeK2.LIZLLL) != null && (iArr = compileConfigLevelStruct.getDefault()) != null) {
            return iArr;
        }
        return this.LJ.LJ;
    }
}
