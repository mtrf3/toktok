package X;

import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.io.IOException;
import java.util.List;

/* renamed from: X.Iwg, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48250Iwg implements InterfaceC48252Iwi {
    @Override // X.InterfaceC48252Iwi
    /* renamed from: LIZ */
    public final X5J mo33LIZ(String str, List<HttpHeader> list) {
        C64598PWw execute;
        C64600PWy LJIIJJI = C84212X3g.LJIIJJI();
        if (LJIIJJI != null) {
            C64618PXq c64618PXq = new C64618PXq();
            c64618PXq.LJII(str);
            c64618PXq.LJ("HEAD", null);
            if (list != null && list.size() > 0) {
                for (HttpHeader httpHeader : list) {
                    if (!"x-ttnet-req-biz-id".equals(httpHeader.name) && !"x-ttnet-req-biz-ver".equals(httpHeader.name)) {
                        c64618PXq.LIZ(httpHeader.name, X4Q.LJIIJJI(httpHeader.value));
                    }
                }
            }
            C64587PWl LIZJ = C64587PWl.LIZJ(LJIIJJI, c64618PXq.LIZIZ(), false);
            C39519Ff9 LIZJ2 = new C03880Dg(2).LIZJ(400102, "okhttp3/Call", "execute", LIZJ, new Object[0], "okhttp3.Response", new C65300Pk0(false, "()Lokhttp3/Response;", "-6995573168175974614"));
            if (LIZJ2.LIZ) {
                execute = (C64598PWw) LIZJ2.LIZIZ;
            } else {
                execute = LIZJ.execute();
            }
            if (execute != null) {
                execute.close();
                return new C48251Iwh(execute, LIZJ);
            }
            throw new IOException("can't get response");
        }
        throw new IOException("can't get httpClient");
    }
}
