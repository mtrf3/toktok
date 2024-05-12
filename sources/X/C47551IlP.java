package X;

import Y.ACallableS111S0100000_8;
import com.ss.android.ugc.aweme.services.audio.IDownloadModelCallback;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.o;

/* renamed from: X.IlP, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47551IlP implements IDownloadModelCallback {
    public final /* synthetic */ C47554IlS LIZ;

    @Override // com.ss.android.ugc.aweme.services.audio.IDownloadModelCallback
    public final void onFailure() {
        this.LIZ.LIZIZ();
    }

    public C47551IlP(C47554IlS c47554IlS) {
        this.LIZ = c47554IlS;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.IDownloadModelCallback
    public final void onSuccess(String path) {
        o.LJIIIZ(path, "path");
        File file = new File(path);
        if (file.exists()) {
            C47554IlS c47554IlS = this.LIZ;
            byte[] bArr = null;
            if (file.exists()) {
                try {
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        byte[] bArr2 = new byte[2048];
                        while (true) {
                            int read = fileInputStream.read(bArr2);
                            if (read == -1) {
                                break;
                            } else {
                                byteArrayOutputStream.write(bArr2, 0, read);
                            }
                        }
                        bArr = byteArrayOutputStream.toByteArray();
                    } catch (IOException unused) {
                    } catch (Throwable th) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused2) {
                        }
                        throw th;
                    }
                    fileInputStream.close();
                } catch (FileNotFoundException | IOException unused3) {
                }
            }
            c47554IlS.LJI = bArr;
            C47554IlS c47554IlS2 = this.LIZ;
            c47554IlS2.LJIIL = true;
            C10K.LIZJ(new ACallableS111S0100000_8(c47554IlS2, 21));
        }
    }
}
