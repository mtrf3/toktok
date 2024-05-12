package X;

import com.ss.android.vesdk.VEEditor;
import kotlin.jvm.internal.o;

/* renamed from: X.5KU, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C5KU {
    public final String LIZ;
    public final String LIZIZ;
    public final C5KT LIZJ;
    public final VEEditor LIZLLL;
    public boolean LJ;

    public final void LIZ() {
        VEEditor vEEditor;
        if (!this.LJ && (vEEditor = this.LIZLLL) != null) {
            synchronized (vEEditor) {
                if (!this.LJ) {
                    this.LIZLLL.LJIILIIL();
                    C5KT c5kt = this.LIZJ;
                    if (c5kt != null) {
                        c5kt.LJ(this.LIZ, this.LIZIZ);
                    }
                    this.LJ = true;
                }
            }
        }
    }

    public C5KU(String inputPath, String outputPath, C5KT c5kt, VEEditor vEEditor) {
        o.LJIIIZ(inputPath, "inputPath");
        o.LJIIIZ(outputPath, "outputPath");
        this.LIZ = inputPath;
        this.LIZIZ = outputPath;
        this.LIZJ = c5kt;
        this.LIZLLL = vEEditor;
        this.LJ = false;
    }
}
