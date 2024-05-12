package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;
import okhttp3.Request;

/* loaded from: classes12.dex */
public final class PW0 implements InterfaceC48121Iub {
    public final InterfaceC61701OJl LIZ;

    public PW0(InterfaceC61701OJl interfaceC61701OJl) {
        this.LIZ = interfaceC61701OJl;
    }

    @Override // X.InterfaceC48121Iub
    public final C64598PWw intercept(PXZ pxz) {
        boolean z;
        PW8 pw8 = (PW8) pxz;
        Request request = pw8.LJFF;
        C64618PXq newBuilder = request.newBuilder();
        PVP body = request.body();
        if (body != null) {
            C39745Fin LIZIZ = body.LIZIZ();
            if (LIZIZ != null) {
                newBuilder.LIZLLL("Content-Type", LIZIZ.LIZ);
            }
            long LIZ = body.LIZ();
            if (LIZ != -1) {
                newBuilder.LIZLLL("Content-Length", Long.toString(LIZ));
                newBuilder.LJFF("Transfer-Encoding");
            } else {
                newBuilder.LIZLLL("Transfer-Encoding", "chunked");
                newBuilder.LJFF("Content-Length");
            }
        }
        if (request.header("Host") == null) {
            newBuilder.LIZLLL("Host", PVA.LJIIL(request.url(), false));
        }
        if (request.header("Connection") == null) {
            newBuilder.LIZLLL("Connection", "Keep-Alive");
        }
        if (request.header("Accept-Encoding") == null && request.header("Range") == null) {
            newBuilder.LIZLLL("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        List<C61702OJm> LIZ2 = this.LIZ.LIZ(request.url());
        if (!LIZ2.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = LIZ2.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append("; ");
                }
                C61702OJm c61702OJm = (C61702OJm) ListProtector.get(LIZ2, i);
                sb.append(c61702OJm.LIZ);
                sb.append('=');
                sb.append(c61702OJm.LIZIZ);
            }
            newBuilder.LIZLLL("Cookie", sb.toString());
        }
        if (request.header("User-Agent") == null) {
            newBuilder.LIZLLL("User-Agent", "okhttp/3.12.13.4-tiktok");
        }
        C64598PWw LIZ3 = pw8.LIZ(newBuilder.LIZIZ());
        C64573PVx.LJ(this.LIZ, request.url(), LIZ3.LJLJJLL);
        C64597PWv c64597PWv = new C64597PWv(LIZ3);
        c64597PWv.LIZ = request;
        if (z && "gzip".equalsIgnoreCase(LIZ3.LIZ("Content-Encoding", null)) && C64573PVx.LIZIZ(LIZ3)) {
            PUL pul = new PUL(LIZ3.LJLJL.source());
            C64605PXd LJI = LIZ3.LJLJJLL.LJI();
            LJI.LIZLLL("Content-Encoding");
            LJI.LIZLLL("Content-Length");
            c64597PWv.LJFF = new C64606PXe(LJI).LJI();
            c64597PWv.LJI = new PVQ(LIZ3.LIZ("Content-Type", null), -1L, PU7.LIZ(pul));
        }
        return c64597PWv.LIZ();
    }
}
