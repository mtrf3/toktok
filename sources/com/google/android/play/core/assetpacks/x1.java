package com.google.android.play.core.assetpacks;

import X.C13T;
import X.C16880lQ;
import X.C40654FxS;
import X.InterfaceC38408F5o;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* loaded from: classes7.dex */
public final class x1 {
    public static final C13T LIZJ = new C13T("PatchSliceTaskHandler");
    public final y LIZ;
    public final InterfaceC38408F5o<s2> LIZIZ;

    public x1(y yVar, InterfaceC38408F5o<s2> interfaceC38408F5o) {
        this.LIZ = yVar;
        this.LIZIZ = interfaceC38408F5o;
    }

    public final void LIZ(w1 w1Var) {
        File LJII = this.LIZ.LJII(w1Var.LIZJ, w1Var.LIZLLL, w1Var.LIZIZ);
        y yVar = this.LIZ;
        String str = w1Var.LIZIZ;
        int i = w1Var.LIZJ;
        long j = w1Var.LIZLLL;
        String str2 = w1Var.LJII;
        yVar.getClass();
        File file = new File(new File(yVar.LJII(i, j, str), "_metadata"), str2);
        try {
            InputStream inputStream = w1Var.LJIIIZ;
            if (w1Var.LJI == 2) {
                inputStream = new GZIPInputStream(inputStream, FileUtils.BUFFER_SIZE);
            }
            try {
                b0 b0Var = new b0(LJII, file);
                File LJIIIIZZ = this.LIZ.LJIIIIZZ(w1Var.LJ, w1Var.LIZIZ, w1Var.LJII, w1Var.LJFF);
                if (!LJIIIIZZ.exists()) {
                    LJIIIIZZ.mkdirs();
                }
                z1 z1Var = new z1(this.LIZ, w1Var.LIZIZ, w1Var.LJ, w1Var.LJFF, w1Var.LJII);
                C40654FxS.LJII(b0Var, inputStream, new p0(LJIIIIZZ, z1Var), w1Var.LJIIIIZZ);
                z1Var.LIZLLL(0);
                inputStream.close();
                LIZJ.LIZJ("Patching and extraction finished for slice %s of pack %s.", 4, new Object[]{w1Var.LJII, w1Var.LIZIZ});
                this.LIZIZ.a().LIZLLL(w1Var.LIZ, 0, w1Var.LIZIZ, w1Var.LJII);
                try {
                    w1Var.LJIIIZ.close();
                } catch (IOException unused) {
                    LIZJ.LIZJ("Could not close file for slice %s of pack %s.", 5, new Object[]{w1Var.LJII, w1Var.LIZIZ});
                }
            } finally {
            }
        } catch (IOException e) {
            LIZJ.LIZJ("IOException during patching %s.", 6, new Object[]{e.getMessage()});
            throw new m0(w1Var.LIZ, C16880lQ.LLLZ("Error patching slice %s of pack %s.", new Object[]{w1Var.LJII, w1Var.LIZIZ}), e);
        }
    }
}
