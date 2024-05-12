package X;

import com.bytedance.retrofit2.mime.MimeUtil;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;

/* loaded from: classes12.dex */
public final class QDV implements InterfaceC66632QDc<Object> {
    public final /* synthetic */ InterfaceC66632QDc LIZ;
    public final /* synthetic */ QDY LIZIZ;

    @Override // X.InterfaceC66632QDc
    public final void onComplete() {
        this.LIZ.onComplete();
    }

    @Override // X.InterfaceC66632QDc
    public final void onFailed(Throwable th) {
        this.LIZ.onFailed(th);
    }

    @Override // X.InterfaceC66632QDc
    public final void onNext(Object obj) {
        InterfaceC66632QDc interfaceC66632QDc = this.LIZ;
        C66630QDa c66630QDa = (C66630QDa) this.LIZIZ.LIZ;
        c66630QDa.getClass();
        byte[] bArr = (byte[]) obj;
        String str = "UTF-8";
        if (c66630QDa.LIZ.mimeType() != null) {
            str = MimeUtil.parseCharset(c66630QDa.LIZ.mimeType(), "UTF-8");
        }
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new ByteArrayInputStream(bArr), str);
            try {
                Object read = c66630QDa.LIZJ.LIZIZ.read(c66630QDa.LIZJ.LIZ.LJIIL(inputStreamReader));
                if (read instanceof K4J) {
                    ((K4J) read).setRequestInfo(c66630QDa.LIZIZ.LJLJI);
                }
                if (read instanceof InterfaceC65316PkG) {
                    ((InterfaceC65316PkG) read).setRequestId(c66630QDa.LIZIZ.LJLILLLLZI);
                }
                if (read instanceof InterfaceC49941Jir) {
                    ((InterfaceC49941Jir) read).LIZLLL(c66630QDa.LIZIZ.LJLJJI);
                }
                if (read instanceof InterfaceC66634QDe) {
                    c66630QDa.LIZIZ.getClass();
                    ((InterfaceC66634QDe) read).LIZ();
                }
                inputStreamReader.close();
                interfaceC66632QDc.onNext(read);
            } finally {
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public QDV(QDY qdy, InterfaceC66632QDc interfaceC66632QDc) {
        this.LIZIZ = qdy;
        this.LIZ = interfaceC66632QDc;
    }
}
