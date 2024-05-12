package X;

import android.text.TextUtils;
import com.ttnet.org.chromium.net.impl.CronetUrlRequest;
import com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import zdb.g;

/* loaded from: classes12.dex */
public class QE8 extends QER {
    public final /* synthetic */ CronetHttpURLConnection LIZ;

    public final void LJIIIIZZ() {
        String str;
        CronetHttpURLConnection cronetHttpURLConnection = this.LIZ;
        cronetHttpURLConnection.LJIL = cronetHttpURLConnection.LIZJ.LJFF();
        try {
            CronetHttpURLConnection cronetHttpURLConnection2 = this.LIZ;
            if (cronetHttpURLConnection2.LJIIJJI != null) {
                QE2 qe2 = cronetHttpURLConnection2.LJJ;
                if (qe2 != null && ((C66655QDz) qe2).LIZJ != null && ((C66654QDy) ((C66655QDz) qe2).LIZJ).LJIJ != null) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append(((C66654QDy) ((C66655QDz) this.LIZ.LJJ).LIZJ).LJIJ);
                    LIZ.append(":");
                    LIZ.append(((C66654QDy) ((C66655QDz) this.LIZ.LJJ).LIZJ).LJIJI);
                    str = X1D.LIZIZ(LIZ);
                } else {
                    str = null;
                }
                if (!TextUtils.isEmpty(str)) {
                    String message = this.LIZ.LJIIJJI.getMessage();
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append("|");
                    if (message == null) {
                        message = "null";
                    }
                    sb.append(message);
                    IOException iOException = this.LIZ.LJIIJJI;
                    C36598EXy c36598EXy = new C36598EXy(iOException);
                    Object sb2 = sb.toString();
                    try {
                        Field LJFF = c36598EXy.LJFF(new Class[0]);
                        if (sb2 instanceof C36598EXy) {
                            sb2 = ((C36598EXy) sb2).LIZ;
                        }
                        LJFF.set(iOException, sb2);
                    } catch (Exception e) {
                        throw new C36599EXz(e);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        CronetHttpURLConnection cronetHttpURLConnection3 = this.LIZ;
        cronetHttpURLConnection3.LJIILIIL = true;
        cronetHttpURLConnection3.LIZIZ.LJLILLLLZI = false;
    }

    public QE8(CronetHttpURLConnection cronetHttpURLConnection) {
        this.LIZ = cronetHttpURLConnection;
    }

    @Override // X.QER
    public final void LIZ(AbstractC66659QEd abstractC66659QEd, AbstractC58324Mum abstractC58324Mum) {
        this.LIZ.LJIIJ = abstractC58324Mum;
        if (V2B.LJFF()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onCanceled loop quit url = ");
            LIZ.append(this.LIZ.getURL().toString());
            X1D.LIZIZ(LIZ);
        }
        CronetHttpURLConnection cronetHttpURLConnection = this.LIZ;
        if (cronetHttpURLConnection.LJIIJJI == null) {
            cronetHttpURLConnection.LJIIJJI = new g("request canceled, ErrorCode=11, InternalErrorCode=-999");
        }
        LJIIIZ(this.LIZ.LJIIJJI, false);
    }

    @Override // X.QER
    public final void LIZJ(CronetUrlRequest cronetUrlRequest, QE2 qe2) {
        this.LIZ.LJJ = qe2;
        if (V2B.LJFF()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onMetricsCollected loop quit url = ");
            LIZ.append(this.LIZ.getURL().toString());
            X1D.LIZIZ(LIZ);
        }
        LJIIIIZZ();
    }

    @Override // X.QER
    public final void LJFF(String str, C66655QDz c66655QDz) {
        this.LIZ.LJIL = str;
        CronetHttpURLConnection cronetHttpURLConnection = this.LIZ;
        cronetHttpURLConnection.LJJ = c66655QDz;
        cronetHttpURLConnection.LJJIIJ.countDown();
    }

    @Override // X.QER
    public final void LJII(AbstractC66659QEd abstractC66659QEd, AbstractC58324Mum abstractC58324Mum) {
        this.LIZ.LJIIJ = abstractC58324Mum;
        if (V2B.LJFF()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onSucceeded url = ");
            LIZ.append(this.LIZ.getURL().toString());
            X1D.LIZIZ(LIZ);
        }
        LJIIIZ(null, true);
    }

    public final void LJIIIZ(IOException iOException, boolean z) {
        CronetHttpURLConnection cronetHttpURLConnection = this.LIZ;
        cronetHttpURLConnection.LJIIJJI = iOException;
        QEB qeb = cronetHttpURLConnection.LJIIIIZZ;
        if (qeb != null) {
            qeb.LJLJJI = iOException;
            qeb.LJLILLLLZI = true;
            qeb.LJLJI = null;
        }
        QEG qeg = cronetHttpURLConnection.LJIIIZ;
        if (qeg != null) {
            qeg.LJLIL = iOException;
            qeg.LJLJI = true;
        }
        cronetHttpURLConnection.LJIILIIL = true;
        if (!z) {
            LJIIIIZZ();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // X.QER
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(X.AbstractC66659QEd r5, X.AbstractC58324Mum r6, X.AbstractC66673QEr r7) {
        /*
            r4 = this;
            if (r7 == 0) goto L93
            com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection r2 = r4.LIZ
            r2.LJIIJ = r6
            boolean r0 = r7 instanceof X.AbstractC66670QEo
            if (r0 != 0) goto L31
        La:
            r3 = r7
        Lb:
            r2.LJIIJJI = r3
            boolean r0 = X.V2B.LJFF()
            if (r0 == 0) goto L2c
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "onFailed url = "
            r1.append(r0)
            com.ttnet.org.chromium.net.urlconnection.CronetHttpURLConnection r0 = r4.LIZ
            java.net.URL r0 = r0.getURL()
            java.lang.String r0 = r0.toString()
            r1.append(r0)
            X.X1D.LIZIZ(r1)
        L2c:
            r0 = 1
            r4.LJIIIZ(r7, r0)
            return
        L31:
            r0 = r7
            X.QEo r0 = (X.AbstractC66670QEo) r0
            int r0 = r0.getErrorCode()
            switch(r0) {
                case 1: goto L3c;
                case 2: goto L46;
                case 3: goto L46;
                case 4: goto L50;
                case 5: goto L5a;
                case 6: goto L64;
                case 7: goto L5a;
                case 8: goto L6e;
                case 9: goto L88;
                default: goto L3b;
            }
        L3b:
            goto La
        L3c:
            java.net.UnknownHostException r3 = new java.net.UnknownHostException
            java.lang.String r0 = r7.getMessage()
            r3.<init>(r0)
            goto Lb
        L46:
            java.net.ConnectException r3 = new java.net.ConnectException
            java.lang.String r0 = r7.getMessage()
            r3.<init>(r0)
            goto Lb
        L50:
            java.net.SocketTimeoutException r3 = new java.net.SocketTimeoutException
            java.lang.String r0 = r7.getMessage()
            r3.<init>(r0)
            goto Lb
        L5a:
            java.net.ConnectException r3 = new java.net.ConnectException
            java.lang.String r0 = r7.getMessage()
            r3.<init>(r0)
            goto Lb
        L64:
            org.apache.http.conn.ConnectTimeoutException r3 = new org.apache.http.conn.ConnectTimeoutException
            java.lang.String r0 = r7.getMessage()
            r3.<init>(r0)
            goto Lb
        L6e:
            java.net.SocketException r3 = new java.net.SocketException
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "reset by peer "
            r1.append(r0)
            java.lang.String r0 = r7.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            r3.<init>(r0)
            goto Lb
        L88:
            java.net.NoRouteToHostException r3 = new java.net.NoRouteToHostException
            java.lang.String r0 = r7.getMessage()
            r3.<init>(r0)
            goto Lb
        L93:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Exception cannot be null in onFailed."
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QE8.LIZIZ(X.QEd, X.Mum, X.QEr):void");
    }

    @Override // X.QER
    public final void LIZLLL(AbstractC66659QEd abstractC66659QEd, AbstractC58324Mum abstractC58324Mum, ByteBuffer byteBuffer) {
        this.LIZ.LJIIJ = abstractC58324Mum;
        if (V2B.LJFF()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onReadCompleted loop quit url = ");
            LIZ.append(this.LIZ.getURL().toString());
            X1D.LIZIZ(LIZ);
        }
        this.LIZ.LIZIZ.LJLILLLLZI = false;
    }

    @Override // X.QER
    public final void LJI(AbstractC66659QEd abstractC66659QEd, C61460OAe c61460OAe, String str) {
        CronetHttpURLConnection cronetHttpURLConnection = this.LIZ;
        cronetHttpURLConnection.LJIIJ = c61460OAe;
        cronetHttpURLConnection.LJIILIIL = true;
        if (c61460OAe != null) {
            cronetHttpURLConnection.LJIIJ(str, cronetHttpURLConnection.LJII());
        }
        if (V2B.LJFF()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onResponseStarted loop quit url = ");
            LIZ.append(this.LIZ.getURL().toString());
            X1D.LIZIZ(LIZ);
        }
        this.LIZ.LIZIZ.LJLILLLLZI = false;
    }

    @Override // X.QER
    public final void LJ(AbstractC66659QEd abstractC66659QEd, AbstractC58324Mum abstractC58324Mum, String str, String str2) {
        CronetHttpURLConnection cronetHttpURLConnection = this.LIZ;
        cronetHttpURLConnection.LJIIL = true;
        if (abstractC58324Mum != null) {
            cronetHttpURLConnection.LJIIJ(str2, abstractC58324Mum.LIZ());
        }
        try {
            java.net.URL url = new java.net.URL(str);
            boolean equals = url.getHost().equals(CronetHttpURLConnection.LIZIZ(this.LIZ).getHost());
            if (CronetHttpURLConnection.LIZJ(this.LIZ)) {
                CronetHttpURLConnection.LIZLLL(this.LIZ, url);
            }
            if (CronetHttpURLConnection.LJ(this.LIZ)) {
                QEI qei = this.LIZ.LIZJ;
                if (qei != null) {
                    if (!equals) {
                        qei.LIZIZ();
                        java.net.URL url2 = new java.net.URL(str);
                        CronetHttpURLConnection cronetHttpURLConnection2 = this.LIZ;
                        cronetHttpURLConnection2.getClass();
                        HashMap hashMap = (HashMap) cronetHttpURLConnection2.LIZ(CronetHttpURLConnection.LJIILIIL(url2));
                        if (!hashMap.isEmpty()) {
                            for (Map.Entry entry : hashMap.entrySet()) {
                                this.LIZ.LIZJ.LIZ((String) entry.getKey(), (String) entry.getValue());
                            }
                        }
                    }
                    this.LIZ.LIZJ.LJ();
                    return;
                }
                return;
            }
        } catch (MalformedURLException unused) {
        }
        CronetHttpURLConnection cronetHttpURLConnection3 = this.LIZ;
        cronetHttpURLConnection3.LJIIJ = abstractC58324Mum;
        if (cronetHttpURLConnection3.LIZJ != null) {
            LJIIIZ(null, false);
        }
        if (V2B.LJFF()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("onRedirectReceived loop quit url = ");
            LIZ.append(this.LIZ.getURL().toString());
            X1D.LIZIZ(LIZ);
        }
    }
}
