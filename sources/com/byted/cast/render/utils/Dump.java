package com.byted.cast.render.utils;

import X.X1D;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes29.dex */
public class Dump {
    public File dumpFile;
    public boolean isReady;

    public boolean isReady() {
        return this.isReady;
    }

    public void writeData(byte[] bArr) {
        if (!this.isReady) {
            return;
        }
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(this.dumpFile, true));
            bufferedOutputStream.write(bArr);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
    }

    public boolean setFilePath(String str, String str2) {
        File file = new File(str);
        if (!file.exists() && !file.mkdir()) {
            return false;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(File.separator);
        LIZ.append(str2);
        this.dumpFile = new File(X1D.LIZIZ(LIZ));
        this.isReady = true;
        return true;
    }
}
