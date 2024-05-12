package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* loaded from: classes7.dex */
public final class p0 extends OutputStream {
    public final n1 LJLIL = new n1();
    public final File LJLILLLLZI;
    public final z1 LJLJI;
    public long LJLJJI;
    public long LJLJJL;
    public FileOutputStream LJLJJLL;
    public e2 LJLJL;

    public p0(File file, z1 z1Var) {
        this.LJLILLLLZI = file;
        this.LJLJI = z1Var;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        int i3;
        String str;
        int i4 = i;
        int i5 = i2;
        while (i5 > 0) {
            boolean z = true;
            if (this.LJLJJI == 0 && this.LJLJJL == 0) {
                int LIZ = this.LJLIL.LIZ(i4, bArr, i5);
                if (LIZ == -1) {
                    return;
                }
                i4 += LIZ;
                i5 -= LIZ;
                e2 LIZIZ = this.LJLIL.LIZIZ();
                this.LJLJL = LIZIZ;
                if (LIZIZ.LJ) {
                    this.LJLJJI = 0L;
                    z1 z1Var = this.LJLJI;
                    byte[] bArr2 = LIZIZ.LJFF;
                    z1Var.LJIIJ(bArr2.length, bArr2);
                    this.LJLJJL = this.LJLJL.LJFF.length;
                } else if (LIZIZ.LIZJ == 0 && ((str = LIZIZ.LIZ) == null || !str.endsWith("/"))) {
                    this.LJLJI.LJFF(this.LJLJL.LJFF);
                    File file = new File(this.LJLILLLLZI, this.LJLJL.LIZ);
                    file.getParentFile().mkdirs();
                    this.LJLJJI = this.LJLJL.LIZIZ;
                    this.LJLJJLL = new FileOutputStream(file);
                } else {
                    byte[] bArr3 = this.LJLJL.LJFF;
                    this.LJLJI.LJIIJ(bArr3.length, bArr3);
                    this.LJLJJI = this.LJLJL.LIZIZ;
                }
            }
            String str2 = this.LJLJL.LIZ;
            if (str2 == null || !str2.endsWith("/")) {
                e2 e2Var = this.LJLJL;
                if (e2Var.LJ) {
                    this.LJLJI.LJII(i4, this.LJLJJL, bArr, i5);
                    this.LJLJJL += i5;
                    i3 = i5;
                } else {
                    if (e2Var.LIZJ != 0) {
                        z = false;
                    }
                    long min = Math.min(i5, this.LJLJJI);
                    if (z) {
                        i3 = (int) min;
                        this.LJLJJLL.write(bArr, i4, i3);
                        long j = this.LJLJJI - i3;
                        this.LJLJJI = j;
                        if (j == 0) {
                            this.LJLJJLL.close();
                        }
                    } else {
                        i3 = (int) min;
                        e2 e2Var2 = this.LJLJL;
                        int i6 = i4;
                        this.LJLJI.LJII(i6, (e2Var2.LJFF.length + e2Var2.LIZIZ) - this.LJLJJI, bArr, i3);
                        this.LJLJJI -= i3;
                    }
                }
                i4 += i3;
                i5 -= i3;
            }
        }
    }
}
