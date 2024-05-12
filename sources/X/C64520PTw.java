package X;

import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.o;

/* renamed from: X.PTw, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64520PTw implements InterfaceC64510PTm<String> {
    public final InterfaceC32418Cnu LIZ;
    public InterfaceC64509PTl<String> LIZIZ;

    public C64520PTw(InterfaceC32418Cnu interfaceC32418Cnu) {
        this.LIZ = interfaceC32418Cnu;
    }

    public final File LIZ(C32420Cnw request) {
        Boolean bool;
        o.LJIIIZ(request, "request");
        String LIZIZ = this.LIZ.LIZIZ(request);
        o.LJIIIIZZ(LIZIZ, "fileCacheFactory.getFileCachePath(request)");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getSaveFilePath cachePath = ");
        LIZ.append(LIZIZ);
        C0NB.LJIIIZ("ColdDataDownloadProducer", X1D.LIZIZ(LIZ));
        File file = new File(LIZIZ);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            File parentFile2 = file.getParentFile();
            if (parentFile2 != null) {
                bool = Boolean.valueOf(parentFile2.mkdirs());
            } else {
                bool = null;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("getSaveFilePath result = ");
            LIZ2.append(bool);
            C0NB.LJIIIZ("ColdDataDownloadProducer", X1D.LIZIZ(LIZ2));
            if (o.LJ(bool, Boolean.FALSE)) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("mkdirs return false, dir=");
                LIZ3.append(file.getParentFile());
                throw new IOException(X1D.LIZIZ(LIZ3));
            }
        }
        return file;
    }

    @Override // X.InterfaceC64510PTm
    public final void LIZLLL(C32420Cnw request, InterfaceC64509PTl<String> consumer) {
        String str;
        o.LJIIIZ(request, "request");
        o.LJIIIZ(consumer, "consumer");
        this.LIZIZ = consumer;
        try {
            File LIZ = LIZ(request);
            if (LIZ.exists()) {
                C0RN.LIZLLL("remove file isSuccess = ", C16880lQ.LLLZZIL(LIZ), "ColdDataDownloadProducer");
            }
            StringBuilder sb = new StringBuilder("saveFilePath ");
            sb.append(request.LIZ());
            sb.append(' ');
            File parentFile = LIZ.getParentFile();
            String str2 = null;
            if (parentFile != null) {
                str = parentFile.getAbsolutePath();
            } else {
                str = null;
            }
            sb.append(str);
            C0NB.LJIIIZ("ColdDataDownloadProducer", sb.toString());
            long nanoTime = System.nanoTime();
            DownloadTask with = C84261X5d.with(C15380j0.LIZLLL());
            with.url(request.LIZ());
            with.name(LIZ.getName());
            File parentFile2 = LIZ.getParentFile();
            if (parentFile2 != null) {
                str2 = parentFile2.getAbsolutePath();
            }
            with.savePath(str2);
            with.subThreadListener(new C64523PTz(this, request, nanoTime, consumer));
            with.download();
        } catch (Exception e) {
            C32430Co6 c32430Co6 = new C32430Co6("File path is invalid", e, request);
            InterfaceC64509PTl<String> interfaceC64509PTl = this.LIZIZ;
            if (interfaceC64509PTl != null) {
                interfaceC64509PTl.LIZIZ(request, c32430Co6);
            }
        }
    }
}
