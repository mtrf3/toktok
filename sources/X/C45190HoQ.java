package X;

import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.HoQ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45190HoQ implements C5KT {
    public final /* synthetic */ QXX LJLIL;

    @Override // X.C5KT
    public final void LJI(C5KU c5ku) {
    }

    public C45190HoQ(QXX qxx) {
        this.LJLIL = qxx;
    }

    @Override // X.C5KT
    public final void onProgress(float f) {
        QXX qxx = this.LJLIL;
        if (qxx != null) {
            qxx.LLLIILIL(f);
        }
    }

    @Override // X.C5KT
    public final void LJ(String inputPath, String outputPath) {
        o.LJIIIZ(inputPath, "inputPath");
        o.LJIIIZ(outputPath, "outputPath");
        if (this.LJLIL != null) {
            C152275yJ c152275yJ = C152275yJ.LIZ;
            File file = new File(outputPath);
            c152275yJ.getClass();
            C152275yJ.LJIIIIZZ(file);
        }
    }

    @Override // X.C5KT
    public final void LJFF(String inputPath, String outputPath) {
        o.LJIIIZ(inputPath, "inputPath");
        o.LJIIIZ(outputPath, "outputPath");
        QXX qxx = this.LJLIL;
        if (qxx != null) {
            qxx.LLLL(inputPath, outputPath);
        }
    }

    @Override // X.C5KT
    public final void LIZ(String str, String str2, String str3) {
        HH1.LIZ(str, "inputPath", str2, "outputPath", str3, "errorInfo");
        QXX qxx = this.LJLIL;
        if (qxx != null) {
            qxx.LLJLLL(str, str2, str3);
        }
    }
}
