package X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipFile;

/* renamed from: X.FhG, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39650FhG implements InterfaceC39660FhQ {
    public final /* synthetic */ java.util.Set LIZ;
    public final /* synthetic */ C36728EbE LIZIZ;
    public final /* synthetic */ ZipFile LIZJ;

    public C39650FhG(java.util.Set set, C36728EbE c36728EbE, ZipFile zipFile) {
        this.LIZ = set;
        this.LIZIZ = c36728EbE;
        this.LIZJ = zipFile;
    }

    @Override // X.InterfaceC39660FhQ
    public final void LIZ(C39659FhP c39659FhP, File file, boolean z) {
        this.LIZ.add(file);
        if (z) {
            return;
        }
        this.LIZIZ.LIZ.getAbsolutePath();
        c39659FhP.LIZIZ.getName();
        file.getAbsolutePath();
        byte[] bArr = new byte[4096];
        InputStream inputStream = this.LIZJ.getInputStream(c39659FhP.LIZIZ);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            while (true) {
                try {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, read);
                } finally {
                }
            }
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th2) {
                    C36662EaA.LIZ(th, th2);
                }
            }
            throw th;
        }
    }
}
