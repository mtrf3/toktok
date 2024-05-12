package X;

import android.content.Context;
import android.database.Cursor;
import android.text.TextUtils;
import com.ss.android.socialbase.downloader.service.IDownloadComponentManagerService;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* renamed from: X.X4f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84237X4f implements InterfaceC84250X4s {
    public final android.net.Uri LIZ;
    public final File LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;

    @Override // X.InterfaceC84250X4s
    public final String LIZIZ() {
        return "";
    }

    @Override // X.InterfaceC84250X4s
    public final boolean LJII(C84238X4g c84238X4g) {
        return false;
    }

    @Override // X.InterfaceC84250X4s
    public final boolean LJIIJJI() {
        return true;
    }

    @Override // X.InterfaceC84250X4s
    public final boolean LJIIL() {
        if (this.LIZLLL) {
            FileOutputStream LJI = LJI();
            try {
                LJI.write(new byte[0]);
                LJI.close();
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
        ((IDownloadComponentManagerService) X41.LIZ(IDownloadComponentManagerService.class)).getAppContext().getContentResolver().delete(this.LIZ, null, null);
        return false;
    }

    @Override // X.InterfaceC84250X4s
    public final File LIZJ() {
        File file = this.LIZIZ;
        if (file != null) {
            return file.getParentFile();
        }
        return null;
    }

    @Override // X.InterfaceC84250X4s
    public final long LJ() {
        File file = this.LIZIZ;
        if (file != null && file.exists()) {
            return this.LIZIZ.lastModified();
        }
        return 0L;
    }

    @Override // X.InterfaceC84250X4s
    public final FileInputStream LJFF() {
        if (this.LIZ != null) {
            return new FileInputStream(C84236X4e.LIZLLL(this.LIZ, "r").getFileDescriptor());
        }
        throw new IOException("Fail to obtain InputStream, uri is null");
    }

    @Override // X.InterfaceC84250X4s
    public final FileOutputStream LJI() {
        if (this.LIZ != null) {
            return new FileOutputStream(C84236X4e.LIZLLL(this.LIZ, "w").getFileDescriptor());
        }
        throw new IOException("Fail to obtain OutputStream, uri is null");
    }

    @Override // X.InterfaceC84250X4s
    public final String LJIIIIZZ() {
        File file = this.LIZIZ;
        if (file != null) {
            return file.getAbsolutePath();
        }
        return "";
    }

    @Override // X.InterfaceC84250X4s
    public final boolean LJIIJ() {
        if (C84236X4e.LIZJ(this.LIZ) > 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC84250X4s
    public final String getPath() {
        android.net.Uri uri = this.LIZ;
        String[] strArr = {"_data"};
        String str = null;
        try {
            Context appContext = ((IDownloadComponentManagerService) X41.LIZ(IDownloadComponentManagerService.class)).getAppContext();
            if (appContext == null) {
                X4Q.LJJIII(null);
            } else {
                Cursor LIZIZ = C84236X4e.LIZIZ(appContext.getContentResolver(), uri, strArr, null, null);
                if (LIZIZ != 0) {
                    try {
                        if (LIZIZ.moveToFirst()) {
                            str = LIZIZ.getString(LIZIZ.getColumnIndex(strArr[0]));
                        }
                    } catch (Throwable th) {
                        th = th;
                        str = LIZIZ;
                        X4Q.LJJIII(str);
                        throw th;
                    }
                }
                X4Q.LJJIII(LIZIZ);
            }
            return str;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // X.InterfaceC84250X4s
    public final boolean isDirectory() {
        File file = this.LIZIZ;
        if (file != null) {
            return file.isDirectory();
        }
        return false;
    }

    @Override // X.InterfaceC84250X4s
    public final long length() {
        return C84236X4e.LIZJ(this.LIZ);
    }

    @Override // X.InterfaceC84250X4s
    public final int LIZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC84250X4s
    public final File LIZLLL() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC84250X4s
    public final boolean LJIIIZ(long j) {
        File file = this.LIZIZ;
        if (file != null && file.exists()) {
            return this.LIZIZ.setLastModified(j);
        }
        return false;
    }

    public C84237X4f(android.net.Uri uri, int i, boolean z) {
        this.LIZ = uri;
        this.LIZJ = i;
        this.LIZLLL = z;
        String path = getPath();
        if (!TextUtils.isEmpty(path)) {
            this.LIZIZ = new File(path);
        }
    }
}
