package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.BindException;
import java.net.ConnectException;
import java.net.HttpRetryException;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.PortUnreachableException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Request;

/* renamed from: X.PWi, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64584PWi implements InterfaceC48121Iub {
    public final C64600PWy LIZ;
    public volatile C64583PWh LIZIZ;
    public Object LIZJ;
    public volatile boolean LIZLLL;
    public volatile int LJ = -1;
    public volatile boolean LJFF;

    public C64584PWi(C64600PWy c64600PWy) {
        this.LIZ = c64600PWy;
    }

    public final C64563PVn LIZ(C64626PXy c64626PXy) {
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        C64549PUz c64549PUz;
        if (c64626PXy.LIZ.equals("https")) {
            C64600PWy c64600PWy = this.LIZ;
            sSLSocketFactory = c64600PWy.LJLLI;
            hostnameVerifier = c64600PWy.LJLLJ;
            c64549PUz = c64600PWy.LJLLL;
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            c64549PUz = null;
        }
        String str = c64626PXy.LIZLLL;
        int i = c64626PXy.LJ;
        C64600PWy c64600PWy2 = this.LIZ;
        return new C64563PVn(str, i, c64600PWy2.LJZ, c64600PWy2.LJLL, sSLSocketFactory, hostnameVerifier, c64549PUz, c64600PWy2.LJLLLL, c64600PWy2.LJLILLLLZI, c64600PWy2.LJLJI, c64600PWy2.LJLJJI, c64600PWy2.LJLJLJ);
    }

    @Override // X.InterfaceC48121Iub
    public final C64598PWw intercept(PXZ pxz) {
        boolean z;
        C64598PWw LIZLLL;
        PW9 pw9;
        Request request = ((PW8) pxz).LJFF;
        PW8 pw8 = (PW8) pxz;
        InterfaceC48133Iun interfaceC48133Iun = pw8.LJI;
        AbstractC64590PWo abstractC64590PWo = pw8.LJII;
        C64583PWh c64583PWh = new C64583PWh(this.LIZ.LJLZ, LIZ(request.url()), interfaceC48133Iun, abstractC64590PWo, this.LIZJ);
        this.LIZIZ = c64583PWh;
        int i = 0;
        C64598PWw c64598PWw = null;
        while (!this.LIZLLL) {
            try {
                try {
                    try {
                        LIZLLL = pw8.LIZLLL(request, c64583PWh, null, null);
                        if (c64598PWw != null) {
                            C64597PWv c64597PWv = new C64597PWv(LIZLLL);
                            C64597PWv c64597PWv2 = new C64597PWv(c64598PWw);
                            c64597PWv2.LJI = null;
                            C64598PWw LIZ = c64597PWv2.LIZ();
                            if (LIZ.LJLJL == null) {
                                c64597PWv.LJIIIZ = LIZ;
                                LIZLLL = c64597PWv.LIZ();
                            } else {
                                throw new IllegalArgumentException("priorResponse.body != null");
                            }
                        }
                        try {
                            request = LIZIZ(LIZLLL, c64583PWh.LIZJ);
                        } catch (IOException e) {
                            c64583PWh.LJI();
                            throw e;
                        }
                    } catch (PVD e2) {
                        if (!LIZJ(e2.getLastConnectException(), c64583PWh, false, request)) {
                            throw e2.getFirstConnectException();
                        }
                    }
                } catch (IOException e3) {
                    if (!(e3 instanceof C64580PWe)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!LIZJ(e3, c64583PWh, z, request)) {
                        throw e3;
                    }
                }
                if (request != null) {
                    PVA.LJ(LIZLLL.LJLJL);
                    i++;
                    if (i <= 20) {
                        request.body();
                        if (!LJ(LIZLLL, request.url())) {
                            c64583PWh.LJI();
                            c64583PWh = new C64583PWh(this.LIZ.LJLZ, LIZ(request.url()), interfaceC48133Iun, abstractC64590PWo, this.LIZJ);
                            this.LIZIZ = c64583PWh;
                        } else {
                            synchronized (c64583PWh.LIZLLL) {
                                pw9 = c64583PWh.LJIILJJIL;
                            }
                            if (pw9 != null) {
                                StringBuilder LIZ2 = X1D.LIZ();
                                LIZ2.append("Closing the body of ");
                                LIZ2.append(LIZLLL);
                                LIZ2.append(" didn't close its backing stream. Bad interceptor?");
                                throw new IllegalStateException(X1D.LIZIZ(LIZ2));
                            }
                        }
                        c64598PWw = LIZLLL;
                    } else {
                        c64583PWh.LJI();
                        throw new ProtocolException(KMP.LJ("Too many follow-up requests: ", i));
                    }
                } else {
                    c64583PWh.LJI();
                    return LIZLLL;
                }
            } catch (Throwable th) {
                c64583PWh.LJII(null);
                c64583PWh.LJI();
                throw th;
            }
        }
        c64583PWh.LJI();
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("Canceled#Reason=");
        LIZ3.append(this.LJ);
        throw new IOException(X1D.LIZIZ(LIZ3));
    }

    public static int LIZLLL(C64598PWw c64598PWw, int i) {
        String LIZ = c64598PWw.LIZ("Retry-After", null);
        if (LIZ == null) {
            return i;
        }
        if (LIZ.matches("\\d+")) {
            return CastIntegerProtector.valueOf(LIZ).intValue();
        }
        return Integer.MAX_VALUE;
    }

    public static boolean LJ(C64598PWw c64598PWw, C64626PXy c64626PXy) {
        C64626PXy url = c64598PWw.LJLIL.url();
        if (url.LIZLLL.equals(c64626PXy.LIZLLL) && url.LJ == c64626PXy.LJ && url.LIZ.equals(c64626PXy.LIZ)) {
            return true;
        }
        return false;
    }

    public final Request LIZIZ(C64598PWw c64598PWw, C64562PVm c64562PVm) {
        String LIZ;
        boolean z;
        int i = c64598PWw.LJLJI;
        String method = c64598PWw.LJLIL.method();
        PVP pvp = null;
        if (i != 307 && i != 308) {
            if (i != 401) {
                if (i != 503) {
                    if (i != 407) {
                        if (i != 408) {
                            switch (i) {
                                case 300:
                                case 301:
                                case 302:
                                case 303:
                                    break;
                                default:
                                    return null;
                            }
                        } else {
                            if (!this.LIZ.LL) {
                                return null;
                            }
                            c64598PWw.LJLIL.body();
                            C64598PWw c64598PWw2 = c64598PWw.LJLL;
                            if ((c64598PWw2 != null && c64598PWw2.LJLJI == 408) || LIZLLL(c64598PWw, 0) > 0) {
                                return null;
                            }
                            return c64598PWw.LJLIL;
                        }
                    } else {
                        if (c64562PVm.LIZIZ.type() == Proxy.Type.HTTP) {
                            this.LIZ.LJLLLL.LIZ(c64598PWw);
                            return null;
                        }
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                } else {
                    C64598PWw c64598PWw3 = c64598PWw.LJLL;
                    if ((c64598PWw3 != null && c64598PWw3.LJLJI == 503) || LIZLLL(c64598PWw, Integer.MAX_VALUE) != 0) {
                        return null;
                    }
                    return c64598PWw.LJLIL;
                }
            } else {
                this.LIZ.LJLLLLLL.LIZ(c64598PWw);
                return null;
            }
        }
        if (!this.LIZ.LJZL || (LIZ = c64598PWw.LIZ("Location", null)) == null) {
            return null;
        }
        C64626PXy url = c64598PWw.LJLIL.url();
        url.getClass();
        try {
            C64627PXz c64627PXz = new C64627PXz();
            c64627PXz.LJ(url, LIZ);
            C64626PXy LIZJ = c64627PXz.LIZJ();
            if (LIZJ != null) {
                if (!LIZJ.LIZ.equals(c64598PWw.LJLIL.url().LIZ) && !this.LIZ.LJZI) {
                    return null;
                }
                C64618PXq newBuilder = c64598PWw.LJLIL.newBuilder();
                if (C78934UyQ.LJJ(method)) {
                    if (method.equals("PROPFIND") || i == 308 || i == 307) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (i == 308 || i == 307 || !(!method.equals("PROPFIND"))) {
                        if (z) {
                            pvp = c64598PWw.LJLIL.body();
                        }
                        newBuilder.LJ(method, pvp);
                    } else {
                        newBuilder.LJ("GET", null);
                    }
                    if (!z) {
                        newBuilder.LJFF("Transfer-Encoding");
                        newBuilder.LJFF("Content-Length");
                        newBuilder.LJFF("Content-Type");
                    }
                }
                if (!LJ(c64598PWw, LIZJ)) {
                    newBuilder.LJFF("Authorization");
                }
                newBuilder.LJIIIIZZ(LIZJ);
                return newBuilder.LIZIZ();
            }
        } catch (IllegalArgumentException unused) {
        }
        return null;
    }

    public final boolean LJFF(IOException iOException, Request request) {
        int i;
        Throwable cause;
        if (this.LJFF) {
            return false;
        }
        this.LJFF = true;
        if (iOException instanceof SSLHandshakeException) {
            i = -148;
        } else if (iOException instanceof SSLKeyException) {
            i = -149;
        } else if (iOException instanceof SSLProtocolException) {
            i = -107;
        } else if (iOException instanceof SSLPeerUnverifiedException) {
            i = -153;
        } else if (iOException instanceof UnknownHostException) {
            i = -105;
        } else if (iOException instanceof ConnectException) {
            i = C44729Hgz.LJII(iOException, -104);
        } else if (iOException instanceof PortUnreachableException) {
            i = -108;
        } else if (iOException instanceof NoRouteToHostException) {
            i = -109;
        } else if (iOException instanceof BindException) {
            i = -147;
        } else if (iOException instanceof SocketException) {
            i = C44729Hgz.LJII(iOException, -15);
        } else if (iOException instanceof MalformedURLException) {
            i = -300;
        } else if (iOException instanceof SocketTimeoutException) {
            i = -118;
        } else if (iOException instanceof ProtocolException) {
            i = -901;
        } else if (iOException instanceof HttpRetryException) {
            String message = iOException.getMessage();
            if (!TextUtils.isEmpty(message) && message.contains("Too many follow-up requests")) {
                i = -310;
            } else {
                i = -196;
            }
        } else if (iOException instanceof UnknownServiceException) {
            i = -902;
        } else {
            if (iOException != null) {
                if ("Canceled#Reason=-199".equals(iOException.getMessage())) {
                    i = -199;
                } else if ("Canceled#Reason=-192".equals(iOException.getMessage()) || ((iOException instanceof InterruptedIOException) && (cause = iOException.getCause()) != null && !TextUtils.isEmpty(cause.getMessage()) && "Canceled#Reason=-192".equals(cause.getMessage()))) {
                    i = -192;
                }
            }
            i = -1;
        }
        PWY LIZ = PWY.LIZ();
        LIZ.getClass();
        if (iOException != null && request.url() != null && LIZ.LJI.get() && LIZ.LJII.contains(Integer.valueOf(i))) {
            String str = request.url().LIZLLL;
            if (!TextUtils.isEmpty(str) && LIZ.LJIIIIZZ.contains(str)) {
                C64583PWh c64583PWh = this.LIZIZ;
                C64585PWj c64585PWj = c64583PWh.LJII;
                C64563PVn c64563PVn = c64585PWj.LIZ;
                c64585PWj.LIZJ(c64563PVn.LIZ, c64563PVn.LJII);
                c64585PWj.LJI.clear();
                ((ArrayList) c64585PWj.LJII).clear();
                c64583PWh.LIZIZ = null;
                if (PX6.LIZIZ == null) {
                    synchronized (PX6.class) {
                        if (PX6.LIZIZ == null) {
                            PX6.LIZIZ = new PX6();
                        }
                    }
                }
                PX6 px6 = PX6.LIZIZ;
                px6.getClass();
                if (request.url() != null && !TextUtils.isEmpty(request.url().LIZLLL)) {
                    px6.LIZ.add(request.url().LIZLLL);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean LIZJ(IOException iOException, C64583PWh c64583PWh, boolean z, Request request) {
        C64592PWq c64592PWq;
        c64583PWh.LJII(iOException);
        if (!this.LIZ.LL) {
            return false;
        }
        if (z) {
            request.body();
            if (iOException instanceof FileNotFoundException) {
                return false;
            }
        }
        if ((iOException instanceof ProtocolException) || (!(iOException instanceof InterruptedIOException) ? !((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) : !((iOException instanceof SocketTimeoutException) && !z))) {
            return LJFF(iOException, request);
        }
        C64583PWh c64583PWh2 = this.LIZIZ;
        if (c64583PWh2.LIZJ == null && ((c64592PWq = c64583PWh2.LIZIZ) == null || !c64592PWq.LIZ())) {
            C64585PWj c64585PWj = c64583PWh2.LJII;
            if (c64585PWj.LJFF >= c64585PWj.LJ.size() && ((ArrayList) c64585PWj.LJII).isEmpty()) {
                return LJFF(iOException, request);
            }
        }
        return true;
    }
}
