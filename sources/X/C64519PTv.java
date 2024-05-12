package X;

import com.ss.android.socialbase.downloader.model.DownloadTask;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.PTv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64519PTv implements InterfaceC64510PTm<String> {
    public final InterfaceC32418Cnu LIZ;

    public C64519PTv(InterfaceC32418Cnu interfaceC32418Cnu) {
        this.LIZ = interfaceC32418Cnu;
    }

    public final String LIZ(C32420Cnw c32420Cnw) {
        String LJ = C78934UyQ.LJ(this.LIZ.LIZIZ(c32420Cnw));
        File file = new File(LJ);
        if (file.exists() || file.mkdirs()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(LJ);
            LIZ.append(C38355F3n.LIZ(c32420Cnw.LIZJ[0]));
            return X1D.LIZIZ(LIZ);
        }
        throw new IOException(C0F0.LIZJ("mkdirs return false, dir=", file));
    }

    @Override // X.InterfaceC64510PTm
    public final void LIZLLL(C32420Cnw request, InterfaceC64509PTl<String> consumer) {
        String str;
        o.LJIIIZ(request, "request");
        o.LJIIIZ(consumer, "consumer");
        try {
            String LIZ = LIZ(request);
            PU0 LJI = PU0.LJI();
            long nanoTime = System.nanoTime();
            Iterator it = ((CopyOnWriteArrayList) LJI.LIZJ).iterator();
            while (it.hasNext()) {
                ((InterfaceC64518PTu) it.next()).LIZJ(nanoTime, request);
            }
            DownloadTask with = C84261X5d.with(C15380j0.LIZLLL());
            with.url(request.LIZ());
            int LJJLIIJ = s.LJJLIIJ(LIZ, "/", 6);
            String str2 = null;
            if (LJJLIIJ != -1) {
                str = LIZ.substring(LJJLIIJ);
                o.LJIIIIZZ(str, "this as java.lang.String).substring(startIndex)");
            } else {
                str = null;
            }
            with.name(str);
            int LJJLIIJ2 = s.LJJLIIJ(LIZ, "/", 6);
            if (LJJLIIJ2 != -1) {
                str2 = LIZ.substring(0, LJJLIIJ2);
                o.LJIIIIZZ(str2, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            with.savePath(str2);
            with.subThreadListener(new C64522PTy(request, consumer, LIZ));
            with.download();
        } catch (Exception e) {
            consumer.LIZIZ(request, new C32430Co6("write storage failed.", e, request));
        }
    }
}
