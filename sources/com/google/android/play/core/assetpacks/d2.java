package com.google.android.play.core.assetpacks;

import X.C13T;
import X.C16880lQ;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes7.dex */
public final class d2 {
    public static final C13T LIZIZ = new C13T("VerifySliceTaskHandler");
    public final y LIZ;

    public d2(y yVar) {
        this.LIZ = yVar;
    }

    public final void LIZ(c2 c2Var) {
        File LJIIIIZZ = this.LIZ.LJIIIIZZ(c2Var.LIZJ, c2Var.LIZIZ, c2Var.LJ, c2Var.LIZLLL);
        if (LJIIIIZZ.exists()) {
            try {
                y yVar = this.LIZ;
                String str = c2Var.LIZIZ;
                int i = c2Var.LIZJ;
                long j = c2Var.LIZLLL;
                String str2 = c2Var.LJ;
                yVar.getClass();
                File file = new File(new File(new File(yVar.LIZLLL(i, j, str), "_slices"), "_metadata"), str2);
                if (file.exists()) {
                    try {
                        if (l1.LIZ(b2.LIZ(LJIIIIZZ, file)).equals(c2Var.LJFF)) {
                            LIZIZ.LIZJ("Verification of slice %s of pack %s successful.", 4, new Object[]{c2Var.LJ, c2Var.LIZIZ});
                            File LJIIIZ = this.LIZ.LJIIIZ(c2Var.LIZJ, c2Var.LIZIZ, c2Var.LJ, c2Var.LIZLLL);
                            if (!LJIIIZ.exists()) {
                                LJIIIZ.mkdirs();
                            }
                            if (LJIIIIZZ.renameTo(LJIIIZ)) {
                                return;
                            } else {
                                throw new m0(C16880lQ.LLLZ("Failed to move slice %s after verification.", new Object[]{c2Var.LJ}), c2Var.LIZ);
                            }
                        }
                        throw new m0(C16880lQ.LLLZ("Verification failed for slice %s.", new Object[]{c2Var.LJ}), c2Var.LIZ);
                    } catch (IOException e) {
                        throw new m0(c2Var.LIZ, C16880lQ.LLLZ("Could not digest file during verification for slice %s.", new Object[]{c2Var.LJ}), e);
                    } catch (NoSuchAlgorithmException e2) {
                        throw new m0(c2Var.LIZ, "SHA256 algorithm not supported.", e2);
                    }
                }
                throw new m0(C16880lQ.LLLZ("Cannot find metadata files for slice %s.", new Object[]{c2Var.LJ}), c2Var.LIZ);
            } catch (IOException e3) {
                throw new m0(c2Var.LIZ, C16880lQ.LLLZ("Could not reconstruct slice archive during verification for slice %s.", new Object[]{c2Var.LJ}), e3);
            }
        }
        throw new m0(C16880lQ.LLLZ("Cannot find unverified files for slice %s.", new Object[]{c2Var.LJ}), c2Var.LIZ);
    }
}
