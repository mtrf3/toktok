package X;

import android.text.TextUtils;
import java.io.IOException;
import okhttp3.Request;

/* loaded from: classes12.dex */
public final class PWA implements InterfaceC48121Iub {
    public final C64600PWy LIZ;

    public PWA(C64600PWy c64600PWy) {
        this.LIZ = c64600PWy;
    }

    @Override // X.InterfaceC48121Iub
    public final C64598PWw intercept(PXZ pxz) {
        PW8 pw8 = (PW8) pxz;
        Request request = pw8.LJFF;
        C64583PWh c64583PWh = pw8.LIZIZ;
        boolean z = !request.method().equals("GET");
        C64600PWy c64600PWy = this.LIZ;
        c64583PWh.getClass();
        PW8 pw82 = (PW8) pxz;
        int i = pw82.LJIIIIZZ;
        int i2 = pw82.LJIIIZ;
        int i3 = pw82.LJIIJ;
        int i4 = c64600PWy.LLFII;
        InterfaceC48133Iun interfaceC48133Iun = c64583PWh.LJ;
        if (interfaceC48133Iun != null && interfaceC48133Iun.request() != null && c64583PWh.LJ.request().url() != null && c64583PWh.LJ.request().url().LIZLLL != null) {
            String str = c64583PWh.LJ.request().url().LIZLLL;
            int i5 = c64583PWh.LJ.request().url().LJ;
            if (!TextUtils.isEmpty(str)) {
                if (PWY.LIZ().LIZIZ.contains(str + ":" + i5)) {
                    i4 = PWY.LIZ().LIZ.get();
                }
            }
            i4 = c64600PWy.LLFII;
        }
        try {
            PW9 LJIIIIZZ = c64583PWh.LJ(i, i2, i3, i4, c64600PWy.LL, z).LJIIIIZZ(c64600PWy, (PW8) pxz, c64583PWh);
            synchronized (c64583PWh.LIZLLL) {
                c64583PWh.LJIILJJIL = LJIIIIZZ;
            }
            return pw8.LIZLLL(request, c64583PWh, LJIIIIZZ, c64583PWh.LIZIZ());
        } catch (IOException e) {
            throw new PVD(e);
        }
    }
}
