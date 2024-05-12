package com.google.android.play.core.assetpacks;

import X.AnonymousClass073;
import X.C13T;
import X.C16880lQ;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/* loaded from: classes7.dex */
public final class p1 {
    public static final C13T LIZIZ = new C13T("MergeSliceTaskHandler");
    public final y LIZ;

    public p1(y yVar) {
        this.LIZ = yVar;
    }

    public final void LIZ(o1 o1Var) {
        File LJIIIZ = this.LIZ.LJIIIZ(o1Var.LIZJ, o1Var.LIZIZ, o1Var.LJ, o1Var.LIZLLL);
        if (LJIIIZ.exists()) {
            y yVar = this.LIZ;
            String str = o1Var.LIZIZ;
            int i = o1Var.LIZJ;
            long j = o1Var.LIZLLL;
            yVar.getClass();
            File file = new File(yVar.LIZLLL(i, j, str), "_packs");
            if (!file.exists()) {
                file.mkdirs();
            }
            LIZIZ(LJIIIZ, file);
            try {
                int LJIIJ = this.LIZ.LJIIJ(o1Var.LIZJ, o1Var.LIZLLL, o1Var.LIZIZ);
                y yVar2 = this.LIZ;
                String str2 = o1Var.LIZIZ;
                int i2 = o1Var.LIZJ;
                long j2 = o1Var.LIZLLL;
                yVar2.getClass();
                File file2 = new File(new File(yVar2.LIZLLL(i2, j2, str2), "_packs"), "merge.tmp");
                Properties properties = new Properties();
                properties.put("numberOfMerges", String.valueOf(LJIIJ + 1));
                file2.getParentFile().mkdirs();
                file2.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                properties.store(fileOutputStream, (String) null);
                fileOutputStream.close();
                return;
            } catch (IOException e) {
                LIZIZ.LIZJ("Writing merge checkpoint failed with %s.", 6, new Object[]{e.getMessage()});
                throw new m0(o1Var.LIZ, "Writing merge checkpoint failed.", e);
            }
        }
        throw new m0(C16880lQ.LLLZ("Cannot find verified files for slice %s.", new Object[]{o1Var.LJ}), o1Var.LIZ);
    }

    public static void LIZIZ(File file, File file2) {
        if (file.isDirectory()) {
            file2.mkdirs();
            for (File file3 : file.listFiles()) {
                LIZIZ(file3, new File(file2, file3.getName()));
            }
            if (C16880lQ.LLLZZIL(file)) {
                return;
            }
            String valueOf = String.valueOf(file);
            throw new m0(AnonymousClass073.LIZIZ(new StringBuilder(valueOf.length() + 28), "Unable to delete directory: ", valueOf));
        }
        if (!file2.exists()) {
            if (file.renameTo(file2)) {
                return;
            }
            String valueOf2 = String.valueOf(file);
            throw new m0(AnonymousClass073.LIZIZ(new StringBuilder(valueOf2.length() + 21), "Unable to move file: ", valueOf2));
        }
        String valueOf3 = String.valueOf(file2);
        throw new m0(AnonymousClass073.LIZIZ(new StringBuilder(valueOf3.length() + 51), "File clashing with existing file from other slice: ", valueOf3));
    }
}
