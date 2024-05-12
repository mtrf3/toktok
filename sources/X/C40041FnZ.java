package X;

import com.ss.android.socialbase.downloader.depend.AbsDownloadListener;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import java.io.File;
import java.io.FileReader;
import kotlin.jvm.internal.o;

/* renamed from: X.FnZ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40041FnZ extends AbsDownloadListener {
    public final /* synthetic */ InterfaceC40042Fna LJLIL;
    public final /* synthetic */ File LJLILLLLZI;

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onCanceled(DownloadInfo downloadInfo) {
        super.onCanceled(downloadInfo);
        InterfaceC40042Fna interfaceC40042Fna = this.LJLIL;
        if (interfaceC40042Fna != null) {
            interfaceC40042Fna.LIZ("canceled");
        }
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onSuccessed(DownloadInfo downloadInfo) {
        super.onSuccessed(downloadInfo);
        if (!this.LJLILLLLZI.exists() || !this.LJLILLLLZI.isFile()) {
            InterfaceC40042Fna interfaceC40042Fna = this.LJLIL;
            if (interfaceC40042Fna != null) {
                interfaceC40042Fna.LIZ("download succeeded but file not exists");
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        FileReader fileReader = null;
        try {
            FileReader fileReader2 = new FileReader(this.LJLILLLLZI);
            try {
                for (int read = fileReader2.read(); read != -1; read = fileReader2.read()) {
                    sb.append((char) read);
                }
                fileReader2.close();
                C16880lQ.LLLZZIL(this.LJLILLLLZI);
                String sb2 = sb.toString();
                o.LJFF(sb2, "builder.toString()");
                InterfaceC40042Fna interfaceC40042Fna2 = this.LJLIL;
                if (interfaceC40042Fna2 != null) {
                    interfaceC40042Fna2.LIZIZ(sb2);
                }
            } catch (Throwable th) {
                th = th;
                fileReader = fileReader2;
                try {
                    InterfaceC40042Fna interfaceC40042Fna3 = this.LJLIL;
                    if (interfaceC40042Fna3 != null) {
                        String message = th.getMessage();
                        if (message == null) {
                            message = "read content error";
                        }
                        interfaceC40042Fna3.LIZ(message);
                    }
                } finally {
                    if (fileReader != null) {
                        fileReader.close();
                    }
                    C16880lQ.LLLZZIL(this.LJLILLLLZI);
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public C40041FnZ(Y7V y7v, File file) {
        this.LJLIL = y7v;
        this.LJLILLLLZI = file;
    }

    @Override // com.ss.android.socialbase.downloader.depend.AbsDownloadListener, com.ss.android.socialbase.downloader.depend.IDownloadListener
    public final void onFailed(DownloadInfo downloadInfo, BaseException baseException) {
        String str;
        super.onFailed(downloadInfo, baseException);
        InterfaceC40042Fna interfaceC40042Fna = this.LJLIL;
        if (interfaceC40042Fna != null) {
            if (baseException == null || (str = baseException.getErrorMessage()) == null) {
                str = "download failed";
            }
            interfaceC40042Fna.LIZ(str);
        }
    }
}
