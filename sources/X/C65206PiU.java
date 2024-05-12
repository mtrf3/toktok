package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.socialbase.downloader.exception.DownloadTTNetException;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/* renamed from: X.PiU, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C65206PiU implements InterfaceC84217X3l, InterfaceC48252Iwi, Observer {
    public static volatile boolean LIZIZ;
    public final C65209PiX LIZ;

    public C65206PiU(C65209PiX c65209PiX) {
        this.LIZ = c65209PiX;
        if (LIZIZ) {
            return;
        }
        LIZIZ = true;
        PNI.LIZ().addObserver(this);
    }

    public static void LIZIZ(C65208PiW c65208PiW, Exception exc) {
        if (exc != null) {
            int i = c65208PiW.LJIIIIZZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Exception:");
            LIZ.append(exc.toString());
            C65210PiY.LJ(i, "TTNetDownloadHttpService", "afterDownload", X1D.LIZIZ(LIZ));
            TTNetInit.getTTNetDepend().LIZIZ();
            if (exc instanceof C64799Pbv) {
                String requestLog = ((C64799Pbv) exc).getRequestLog();
                if (!TextUtils.isEmpty(requestLog)) {
                    c65208PiW.LIZLLL = requestLog;
                    return;
                }
            }
        }
        InterfaceC37276Ek4 interfaceC37276Ek4 = c65208PiW.LIZIZ;
        if (interfaceC37276Ek4 == null) {
            C65210PiY.LJ(c65208PiW.LJIIIIZZ, "TTNetDownloadHttpService", "afterDownload", "DownloadCall is null");
            return;
        }
        C64797Pbt c64797Pbt = c65208PiW.LIZJ;
        if (c64797Pbt == null || c64797Pbt.LIZ == null) {
            C65210PiY.LJ(c65208PiW.LJIIIIZZ, "TTNetDownloadHttpService", "afterDownload", "Response or raw response is null");
            return;
        }
        try {
            if (interfaceC37276Ek4 instanceof InterfaceC37818Eso) {
                ((InterfaceC37818Eso) interfaceC37276Ek4).doCollect();
                Object obj = c65208PiW.LIZJ.LIZ.LJFF;
                if (obj instanceof C64668PZo) {
                    String str = ((C64668PZo) obj).LJIL;
                    if (!TextUtils.isEmpty(str)) {
                        c65208PiW.LIZLLL = str;
                    }
                }
            }
        } catch (Throwable th) {
            int i2 = c65208PiW.LJIIIIZZ;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("Exception2:");
            LIZ2.append(th.toString());
            C65210PiY.LJ(i2, "TTNetDownloadHttpService", "afterDownload", X1D.LIZIZ(LIZ2));
        }
    }

    public static void LJII(C65208PiW c65208PiW, String str) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> LIZJ = EZX.LIZJ(str, linkedHashMap);
            StringBuilder sb = new StringBuilder();
            if (c65208PiW.LJFF) {
                sb.append((String) LIZJ.second);
            }
            boolean z = true;
            for (String str2 : c65208PiW.LJI) {
                String str3 = (String) linkedHashMap.get(str2);
                if (str3 != null) {
                    if (z) {
                        if (c65208PiW.LJFF) {
                            sb.append("?");
                        }
                        z = false;
                    } else {
                        sb.append("&");
                    }
                    sb.append(str2);
                    sb.append("=");
                    sb.append(str3);
                }
            }
            c65208PiW.LIZIZ.cancel();
            c65208PiW.LJII = sb.toString();
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("handleRedirect Error:");
            LIZ.append(th.toString());
            throw new DownloadTTNetException(1086, X1D.LIZIZ(LIZ));
        }
    }

    @Override // X.InterfaceC84217X3l
    public final X5F LIZ(String str, List list) {
        return LJFF(str, list, true);
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        if (observable == null || !(observable instanceof PNI) || obj == null || !(obj instanceof HashMap)) {
            return;
        }
        try {
            String str = (String) ((HashMap) obj).get("request_log");
            if (!C65210PiY.LIZ()) {
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RequestLog:");
            LIZ.append(str);
            C65210PiY.LIZIZ("TTNetDownloadHttpService", "update", X1D.LIZIZ(LIZ));
        } catch (Throwable unused) {
        }
    }

    @Override // X.InterfaceC48252Iwi
    /* renamed from: LIZ, reason: collision with other method in class */
    public final X5J mo33LIZ(String str, List<HttpHeader> list) {
        return LJFF(str, list, false);
    }

    public static void LIZJ(C65208PiW c65208PiW, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        java.net.URL url = new java.net.URL(str);
        c65208PiW.LJIIIZ = new java.net.URL(url.getProtocol(), str2, url.getFile()).toString();
        if (C65210PiY.LIZ()) {
            int i = c65208PiW.LJIIIIZZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Host: ");
            LIZ.append(str2);
            C65210PiY.LIZLLL(i, "TTNetDownloadHttpService", "changeHost", X1D.LIZIZ(LIZ));
        }
    }

    public final C65098Pgk LJFF(String str, List list, boolean z) {
        C65208PiW c65208PiW = new C65208PiW();
        try {
            return LJI(str, list, c65208PiW, z);
        } catch (Exception e) {
            InterfaceC37276Ek4 interfaceC37276Ek4 = c65208PiW.LIZIZ;
            if (interfaceC37276Ek4 != null) {
                try {
                    if (!interfaceC37276Ek4.isCanceled()) {
                        interfaceC37276Ek4.cancel();
                    }
                } catch (Throwable unused) {
                }
            }
            LIZIZ(c65208PiW, e);
            DownloadTTNetException LIZ = C84212X3g.LJIJI().LIZ(c65208PiW.LIZLLL, e);
            if (LIZ == null) {
                LIZ = new DownloadTTNetException(1079, e);
                LIZ.setRequestLog(c65208PiW.LIZLLL);
            }
            if (!TextUtils.isEmpty(c65208PiW.LIZ.LIZ)) {
                LIZ.setRemoteIp(c65208PiW.LIZ.LIZ);
            }
            LIZ.parseRemoteIp();
            throw new IOException(LIZ);
        }
    }

    public static void LIZLLL(C65208PiW c65208PiW, String str, String str2, List list) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        java.net.URL url = new java.net.URL(str);
        c65208PiW.LJIIIZ = new java.net.URL(url.getProtocol(), str2, url.getFile()).toString();
        if (C65210PiY.LIZ()) {
            int i = c65208PiW.LJIIIIZZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Host: ");
            LIZ.append(str2);
            C65210PiY.LIZLLL(i, "TTNetDownloadHttpService", "changeHostAndIp", X1D.LIZIZ(LIZ));
        }
        ((ArrayList) list).add(new EJ6("Host", url.getHost()));
    }

    public static void LJ(C65208PiW c65208PiW, String str, String str2, List list) {
        List<String> list2;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        String[] split = str2.split(",");
        if (split == null || split.length <= 0) {
            if (C65210PiY.LIZ()) {
                int i = c65208PiW.LJIIIIZZ;
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("Ips Error:");
                LIZ.append(split);
                C65210PiY.LIZLLL(i, "TTNetDownloadHttpService", "changeIP", X1D.LIZIZ(LIZ));
                return;
            }
            return;
        }
        java.net.URL url = new java.net.URL(str);
        String host = url.getHost();
        if (TextUtils.isEmpty(host)) {
            if (C65210PiY.LIZ()) {
                int i2 = c65208PiW.LJIIIIZZ;
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("Host Error:");
                LIZ2.append(host);
                C65210PiY.LIZLLL(i2, "TTNetDownloadHttpService", "changeIP", X1D.LIZIZ(LIZ2));
                return;
            }
            return;
        }
        C64781Pbd TTDnsResolve = TTNetInit.TTDnsResolve(host, -1);
        if (TTDnsResolve == null || (list2 = TTDnsResolve.LIZ) == null || list2.isEmpty()) {
            if (C65210PiY.LIZ()) {
                int i3 = c65208PiW.LJIIIIZZ;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("TTDnsResolve Error:");
                LIZ3.append(TTDnsResolve);
                C65210PiY.LIZLLL(i3, "TTNetDownloadHttpService", "changeIP", X1D.LIZIZ(LIZ3));
                return;
            }
            return;
        }
        HashSet hashSet = new HashSet();
        for (String str3 : split) {
            hashSet.add(str3);
        }
        Collections.shuffle(TTDnsResolve.LIZ);
        if (C65210PiY.LIZ()) {
            int i4 = c65208PiW.LJIIIIZZ;
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("Dns Result: ");
            LIZ4.append(TTDnsResolve.LIZ.toString());
            C65210PiY.LIZLLL(i4, "TTNetDownloadHttpService", "changeIP", X1D.LIZIZ(LIZ4));
        }
        for (String str4 : TTDnsResolve.LIZ) {
            if (!hashSet.contains(str4)) {
                c65208PiW.LJIIIZ = new java.net.URL(url.getProtocol(), str4, url.getFile()).toString();
                ((ArrayList) list).add(new EJ6("Host", host));
                if (C65210PiY.LIZ()) {
                    C65210PiY.LIZLLL(c65208PiW.LJIIIIZZ, "TTNetDownloadHttpService", "changeIP", C0ON.LIZJ("Set Host: ", host, " Ip:", str4));
                    return;
                }
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:217:0x02c3, code lost:
    
        throw new com.ss.android.socialbase.downloader.exception.DownloadTTNetException(1086, "handleRedirect Error: redirect location empty");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C65098Pgk LJI(java.lang.String r19, java.util.List r20, X.C65208PiW r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 1114
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65206PiU.LJI(java.lang.String, java.util.List, X.PiW, boolean):X.Pgk");
    }
}
