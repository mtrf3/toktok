package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.retrofit2.client.Request;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PY7 implements PY9, PYA, InterfaceC58286MuA, PY8, PY6, PYB {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(PYP.LJLIL);
    public static final Object LIZIZ = new Object();
    public static boolean LIZJ;
    public static final PY7 LIZLLL;
    public static final CopyOnWriteArrayList<InterfaceC58286MuA> LJ;

    public static final boolean LIZJ() {
        return PYR.LIZLLL();
    }

    @Override // X.PY8
    public final boolean LJIIJ() {
        return false;
    }

    static {
        C16880lQ.LJLLJ(PY7.class);
        LIZLLL = new PY7();
        LJ = new CopyOnWriteArrayList<>();
        SettingsManager.LIZLLL().LJIIIZ(PV8.LJLIL);
    }

    @Override // X.PY9
    public final PPC<Request, C64797Pbt<?>> LIZ(PPC<Request, C64797Pbt<?>> ppc) {
        String str;
        String str2 = null;
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onBeforeTTNet\n");
            Request request = ppc.LIZ;
            if (request != null) {
                str = request.getUrl();
            } else {
                str = null;
            }
            LIZ2.append(str);
            X1D.LIZIZ(LIZ2);
        } catch (Exception e) {
            Request request2 = ppc.LIZ;
            if (request2 != null) {
                str2 = request2.getUrl();
            }
            PYR.LJFF(str2, "onBeforeTTNet", e);
        }
        if (PYR.LIZLLL() && PPY.LIZ().enableTTNetMonitor) {
            CopyOnWriteArrayList<InterfaceC58286MuA> copyOnWriteArrayList = LJ;
            ArrayList arrayList = new ArrayList();
            Iterator<InterfaceC58286MuA> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                InterfaceC58286MuA next = it.next();
                if (next instanceof PY9) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ppc = ((PY9) it2.next()).LIZ(ppc);
                PPD ppd = ppc.LJFF;
                if (ppd != PPD.INTERCEPT && ppd != PPD.EXCEPTION) {
                }
            }
            return ppc;
        }
        return ppc;
    }

    @Override // X.PYA
    public final PPC<okhttp3.Request, C64598PWw> LIZIZ(PPC<okhttp3.Request, C64598PWw> ppc) {
        try {
        } catch (Exception e) {
            C64598PWw c64598PWw = ppc.LIZIZ;
            o.LJI(c64598PWw);
            PYR.LJFF(c64598PWw.LJLIL.url().LJIIIIZZ, "onAfterOkHttp", e);
        }
        if (PYR.LIZLLL() && PPY.LIZ().enableOkHttpMonitor) {
            CopyOnWriteArrayList<InterfaceC58286MuA> copyOnWriteArrayList = LJ;
            ArrayList arrayList = new ArrayList();
            Iterator<InterfaceC58286MuA> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                InterfaceC58286MuA next = it.next();
                if (next instanceof PYA) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ppc = ((PYA) it2.next()).LIZIZ(ppc);
                PPD ppd = ppc.LJFF;
                if (ppd != PPD.INTERCEPT && ppd != PPD.EXCEPTION) {
                }
            }
            return ppc;
        }
        return ppc;
    }

    @Override // X.PY9
    public final PPC<Request, C64797Pbt<?>> LIZLLL(PPC<Request, C64797Pbt<?>> ppc) {
        String str;
        String str2 = null;
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onAfterTTNet\n");
            Request request = ppc.LIZ;
            if (request != null) {
                str = request.getUrl();
            } else {
                str = null;
            }
            LIZ2.append(str);
            X1D.LIZIZ(LIZ2);
        } catch (Exception e) {
            Request request2 = ppc.LIZ;
            if (request2 != null) {
                str2 = request2.getUrl();
            }
            PYR.LJFF(str2, "onAfterTTNet", e);
        }
        if (PYR.LIZLLL() && PPY.LIZ().enableTTNetMonitor) {
            CopyOnWriteArrayList<InterfaceC58286MuA> copyOnWriteArrayList = LJ;
            ArrayList arrayList = new ArrayList();
            Iterator<InterfaceC58286MuA> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                InterfaceC58286MuA next = it.next();
                if (next instanceof PY9) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ppc = ((PY9) it2.next()).LIZLLL(ppc);
                PPD ppd = ppc.LJFF;
                if (ppd != PPD.INTERCEPT && ppd != PPD.EXCEPTION) {
                }
            }
            return ppc;
        }
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, Integer> LJ(PPC<HttpURLConnection, Integer> ppc) {
        java.net.URL url;
        java.net.URL url2;
        String str = null;
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onBeforeResponseCode\n");
            HttpURLConnection httpURLConnection = ppc.LIZ;
            if (httpURLConnection != null) {
                url2 = httpURLConnection.getURL();
            } else {
                url2 = null;
            }
            LIZ2.append(url2);
            X1D.LIZIZ(LIZ2);
        } catch (Exception e) {
            HttpURLConnection httpURLConnection2 = ppc.LIZ;
            if (httpURLConnection2 != null && (url = httpURLConnection2.getURL()) != null) {
                str = url.toString();
            }
            PYR.LJFF(str, "onBeforeResponseCode", e);
        }
        if (PYR.LIZLLL() && PPY.LIZ().enableUrlConnectionMonitor && ppc.LIZ != null) {
            CopyOnWriteArrayList<InterfaceC58286MuA> copyOnWriteArrayList = LJ;
            ArrayList arrayList = new ArrayList();
            Iterator<InterfaceC58286MuA> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                InterfaceC58286MuA next = it.next();
                if (next instanceof PY8) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (!((PY8) next2).LJIIJ() || !PYR.LIZJ(ppc.LIZ)) {
                    arrayList2.add(next2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ppc = ((PY8) it3.next()).LJ(ppc);
                PPD ppd = ppc.LJFF;
                if (ppd != PPD.INTERCEPT && ppd != PPD.EXCEPTION) {
                }
            }
            return ppc;
        }
        return ppc;
    }

    @Override // X.PY8
    public final PPC<java.net.URL, URLConnection> LJFF(PPC<java.net.URL, URLConnection> ppc) {
        String str;
        try {
        } catch (Exception e) {
            java.net.URL url = ppc.LIZ;
            if (url != null) {
                str = url.toString();
            } else {
                str = null;
            }
            PYR.LJFF(str, "onOpenConnection", e);
        }
        if (PYR.LIZLLL() && PPY.LIZ().enableUrlConnectionMonitor && ppc.LIZ != null) {
            CopyOnWriteArrayList<InterfaceC58286MuA> copyOnWriteArrayList = LJ;
            ArrayList arrayList = new ArrayList();
            Iterator<InterfaceC58286MuA> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                InterfaceC58286MuA next = it.next();
                if (next instanceof PY8) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (!((PY8) next2).LJIIJ()) {
                    arrayList2.add(next2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ppc = ((PY8) it3.next()).LJFF(ppc);
                PPD ppd = ppc.LJFF;
                if (ppd != PPD.INTERCEPT && ppd != PPD.EXCEPTION) {
                }
            }
            return ppc;
        }
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJI(PPC<HttpURLConnection, InputStream> ppc) {
        java.net.URL url;
        java.net.URL url2;
        String str = null;
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onBeforeErrorStream\n");
            HttpURLConnection httpURLConnection = ppc.LIZ;
            if (httpURLConnection != null) {
                url2 = httpURLConnection.getURL();
            } else {
                url2 = null;
            }
            LIZ2.append(url2);
            X1D.LIZIZ(LIZ2);
        } catch (Exception e) {
            HttpURLConnection httpURLConnection2 = ppc.LIZ;
            if (httpURLConnection2 != null && (url = httpURLConnection2.getURL()) != null) {
                str = url.toString();
            }
            PYR.LJFF(str, "onBeforeErrorStream", e);
        }
        if (PYR.LIZLLL() && PPY.LIZ().enableUrlConnectionMonitor && ppc.LIZ != null) {
            CopyOnWriteArrayList<InterfaceC58286MuA> copyOnWriteArrayList = LJ;
            ArrayList arrayList = new ArrayList();
            Iterator<InterfaceC58286MuA> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                InterfaceC58286MuA next = it.next();
                if (next instanceof PY8) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (!((PY8) next2).LJIIJ() || !PYR.LIZJ(ppc.LIZ)) {
                    arrayList2.add(next2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ppc = ((PY8) it3.next()).LJI(ppc);
                PPD ppd = ppc.LJFF;
                if (ppd != PPD.INTERCEPT && ppd != PPD.EXCEPTION) {
                }
            }
            return ppc;
        }
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJII(PPC<HttpURLConnection, InputStream> ppc) {
        java.net.URL url;
        java.net.URL url2;
        String str = null;
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onAfterInputStream\n");
            HttpURLConnection httpURLConnection = ppc.LIZ;
            if (httpURLConnection != null) {
                url2 = httpURLConnection.getURL();
            } else {
                url2 = null;
            }
            LIZ2.append(url2);
            X1D.LIZIZ(LIZ2);
        } catch (Exception e) {
            HttpURLConnection httpURLConnection2 = ppc.LIZ;
            if (httpURLConnection2 != null && (url = httpURLConnection2.getURL()) != null) {
                str = url.toString();
            }
            PYR.LJFF(str, "onAfterInputStream", e);
        }
        if (PYR.LIZLLL() && PPY.LIZ().enableUrlConnectionMonitor && ppc.LIZ != null) {
            CopyOnWriteArrayList<InterfaceC58286MuA> copyOnWriteArrayList = LJ;
            ArrayList arrayList = new ArrayList();
            Iterator<InterfaceC58286MuA> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                InterfaceC58286MuA next = it.next();
                if (next instanceof PY8) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (!((PY8) next2).LJIIJ() || !PYR.LIZJ(ppc.LIZ)) {
                    arrayList2.add(next2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ppc = ((PY8) it3.next()).LJII(ppc);
                PPD ppd = ppc.LJFF;
                if (ppd != PPD.INTERCEPT && ppd != PPD.EXCEPTION) {
                }
            }
            return ppc;
        }
        return ppc;
    }

    @Override // X.PYB
    public final PPC<C64322PMg, Boolean> LJIIIIZZ(PPC<C64322PMg, Boolean> ppc) {
        String str;
        try {
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            C64322PMg c64322PMg = ppc.LIZ;
            String str2 = null;
            if (c64322PMg != null) {
                str = c64322PMg.LIZ;
            } else {
                str = null;
            }
            LIZ2.append(str);
            LIZ2.append('/');
            C64322PMg c64322PMg2 = ppc.LIZ;
            if (c64322PMg2 != null) {
                str2 = c64322PMg2.LIZIZ;
            }
            LIZ2.append(str2);
            PYR.LJFF(X1D.LIZIZ(LIZ2), "onCommonLog", e);
        }
        if (PYR.LIZLLL() && PXY.LIZ().enable) {
            CopyOnWriteArrayList<InterfaceC58286MuA> copyOnWriteArrayList = LJ;
            ArrayList arrayList = new ArrayList();
            Iterator<InterfaceC58286MuA> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                InterfaceC58286MuA next = it.next();
                if (next instanceof PYB) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ppc = ((PYB) it2.next()).LJIIIIZZ(ppc);
                PPD ppd = ppc.LJFF;
                if (ppd != PPD.INTERCEPT && ppd != PPD.EXCEPTION) {
                }
            }
            return ppc;
        }
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, Integer> LJIIIZ(PPC<HttpURLConnection, Integer> ppc) {
        java.net.URL url;
        java.net.URL url2;
        String str = null;
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onAfterResponseCode\n");
            HttpURLConnection httpURLConnection = ppc.LIZ;
            if (httpURLConnection != null) {
                url2 = httpURLConnection.getURL();
            } else {
                url2 = null;
            }
            LIZ2.append(url2);
            X1D.LIZIZ(LIZ2);
        } catch (Exception e) {
            HttpURLConnection httpURLConnection2 = ppc.LIZ;
            if (httpURLConnection2 != null && (url = httpURLConnection2.getURL()) != null) {
                str = url.toString();
            }
            PYR.LJFF(str, "onAfterResponseCode", e);
        }
        if (PYR.LIZLLL() && PPY.LIZ().enableUrlConnectionMonitor && ppc.LIZ != null) {
            CopyOnWriteArrayList<InterfaceC58286MuA> copyOnWriteArrayList = LJ;
            ArrayList arrayList = new ArrayList();
            Iterator<InterfaceC58286MuA> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                InterfaceC58286MuA next = it.next();
                if (next instanceof PY8) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (!((PY8) next2).LJIIJ() || !PYR.LIZJ(ppc.LIZ)) {
                    arrayList2.add(next2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ppc = ((PY8) it3.next()).LJIIIZ(ppc);
                PPD ppd = ppc.LJFF;
                if (ppd != PPD.INTERCEPT && ppd != PPD.EXCEPTION) {
                }
            }
            return ppc;
        }
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJIIJJI(PPC<HttpURLConnection, InputStream> ppc) {
        java.net.URL url;
        java.net.URL url2;
        String str = null;
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onBeforeInputStream\n");
            HttpURLConnection httpURLConnection = ppc.LIZ;
            if (httpURLConnection != null) {
                url2 = httpURLConnection.getURL();
            } else {
                url2 = null;
            }
            LIZ2.append(url2);
            X1D.LIZIZ(LIZ2);
        } catch (Exception e) {
            HttpURLConnection httpURLConnection2 = ppc.LIZ;
            if (httpURLConnection2 != null && (url = httpURLConnection2.getURL()) != null) {
                str = url.toString();
            }
            PYR.LJFF(str, "onBeforeInputStream", e);
        }
        if (PYR.LIZLLL() && PPY.LIZ().enableUrlConnectionMonitor && ppc.LIZ != null) {
            CopyOnWriteArrayList<InterfaceC58286MuA> copyOnWriteArrayList = LJ;
            ArrayList arrayList = new ArrayList();
            Iterator<InterfaceC58286MuA> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                InterfaceC58286MuA next = it.next();
                if (next instanceof PY8) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (!((PY8) next2).LJIIJ() || !PYR.LIZJ(ppc.LIZ)) {
                    arrayList2.add(next2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ppc = ((PY8) it3.next()).LJIIJJI(ppc);
                PPD ppd = ppc.LJFF;
                if (ppd != PPD.INTERCEPT && ppd != PPD.EXCEPTION) {
                }
            }
            return ppc;
        }
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJIIL(PPC<HttpURLConnection, InputStream> ppc) {
        java.net.URL url;
        java.net.URL url2;
        String str = null;
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onAfterErrorStream\n");
            HttpURLConnection httpURLConnection = ppc.LIZ;
            if (httpURLConnection != null) {
                url2 = httpURLConnection.getURL();
            } else {
                url2 = null;
            }
            LIZ2.append(url2);
            X1D.LIZIZ(LIZ2);
        } catch (Exception e) {
            HttpURLConnection httpURLConnection2 = ppc.LIZ;
            if (httpURLConnection2 != null && (url = httpURLConnection2.getURL()) != null) {
                str = url.toString();
            }
            PYR.LJFF(str, "onAfterErrorStream", e);
        }
        if (PYR.LIZLLL() && PPY.LIZ().enableUrlConnectionMonitor && ppc.LIZ != null) {
            CopyOnWriteArrayList<InterfaceC58286MuA> copyOnWriteArrayList = LJ;
            ArrayList arrayList = new ArrayList();
            Iterator<InterfaceC58286MuA> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                InterfaceC58286MuA next = it.next();
                if (next instanceof PY8) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (!((PY8) next2).LJIIJ() || !PYR.LIZJ(ppc.LIZ)) {
                    arrayList2.add(next2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ppc = ((PY8) it3.next()).LJIIL(ppc);
                PPD ppd = ppc.LJFF;
                if (ppd != PPD.INTERCEPT && ppd != PPD.EXCEPTION) {
                }
            }
            return ppc;
        }
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJIILIIL(PPC<HttpURLConnection, InputStream> ppc) {
        java.net.URL url;
        java.net.URL url2;
        String str = null;
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onAddRequestProperty\n");
            HttpURLConnection httpURLConnection = ppc.LIZ;
            if (httpURLConnection != null) {
                url2 = httpURLConnection.getURL();
            } else {
                url2 = null;
            }
            LIZ2.append(url2);
            X1D.LIZIZ(LIZ2);
        } catch (Exception e) {
            HttpURLConnection httpURLConnection2 = ppc.LIZ;
            if (httpURLConnection2 != null && (url = httpURLConnection2.getURL()) != null) {
                str = url.toString();
            }
            PYR.LJFF(str, "onAddRequestProperty", e);
        }
        if (PYR.LIZLLL() && PPY.LIZ().enableUrlConnectionMonitor && ppc.LIZ != null) {
            CopyOnWriteArrayList<InterfaceC58286MuA> copyOnWriteArrayList = LJ;
            ArrayList arrayList = new ArrayList();
            Iterator<InterfaceC58286MuA> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                InterfaceC58286MuA next = it.next();
                if (next instanceof PY8) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (!((PY8) next2).LJIIJ() || !PYR.LIZJ(ppc.LIZ)) {
                    arrayList2.add(next2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ppc = ((PY8) it3.next()).LJIILIIL(ppc);
                PPD ppd = ppc.LJFF;
                if (ppd != PPD.INTERCEPT && ppd != PPD.DROP && ppd != PPD.EXCEPTION) {
                }
            }
            return ppc;
        }
        return ppc;
    }

    @Override // X.PY6
    public final PPC<POA, Boolean> LJIILJJIL(PPC<POA, Boolean> ppc) {
        String str;
        String str2;
        try {
        } catch (Exception e) {
            StringBuilder LIZ2 = X1D.LIZ();
            POA poa = ppc.LIZ;
            String str3 = null;
            if (poa != null) {
                str = poa.LIZ;
            } else {
                str = null;
            }
            LIZ2.append(str);
            LIZ2.append('/');
            POA poa2 = ppc.LIZ;
            if (poa2 != null) {
                str2 = poa2.LIZIZ;
            } else {
                str2 = null;
            }
            LIZ2.append(str2);
            LIZ2.append('/');
            POA poa3 = ppc.LIZ;
            if (poa3 != null) {
                str3 = poa3.LIZIZ;
            }
            LIZ2.append(str3);
            PYR.LJFF(X1D.LIZIZ(LIZ2), "onAppLog", e);
        }
        if (PYR.LIZLLL() && PXY.LIZ().enable) {
            CopyOnWriteArrayList<InterfaceC58286MuA> copyOnWriteArrayList = LJ;
            ArrayList arrayList = new ArrayList();
            Iterator<InterfaceC58286MuA> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                InterfaceC58286MuA next = it.next();
                if (next instanceof PY6) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ppc = ((PY6) it2.next()).LJIILJJIL(ppc);
                PPD ppd = ppc.LJFF;
                if (ppd != PPD.INTERCEPT && ppd != PPD.EXCEPTION) {
                }
            }
            return ppc;
        }
        return ppc;
    }

    @Override // X.PY8
    public final PPC<HttpURLConnection, InputStream> LJIILL(PPC<HttpURLConnection, InputStream> ppc) {
        java.net.URL url;
        java.net.URL url2;
        String str = null;
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onSetRequestProperty\n");
            HttpURLConnection httpURLConnection = ppc.LIZ;
            if (httpURLConnection != null) {
                url2 = httpURLConnection.getURL();
            } else {
                url2 = null;
            }
            LIZ2.append(url2);
            X1D.LIZIZ(LIZ2);
        } catch (Exception e) {
            HttpURLConnection httpURLConnection2 = ppc.LIZ;
            if (httpURLConnection2 != null && (url = httpURLConnection2.getURL()) != null) {
                str = url.toString();
            }
            PYR.LJFF(str, "onSetRequestProperty", e);
        }
        if (PYR.LIZLLL() && PPY.LIZ().enableUrlConnectionMonitor && ppc.LIZ != null) {
            CopyOnWriteArrayList<InterfaceC58286MuA> copyOnWriteArrayList = LJ;
            ArrayList arrayList = new ArrayList();
            Iterator<InterfaceC58286MuA> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                InterfaceC58286MuA next = it.next();
                if (next instanceof PY8) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (!((PY8) next2).LJIIJ() || !PYR.LIZJ(ppc.LIZ)) {
                    arrayList2.add(next2);
                }
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                ppc = ((PY8) it3.next()).LJIILL(ppc);
                PPD ppd = ppc.LJFF;
                if (ppd != PPD.INTERCEPT && ppd != PPD.DROP && ppd != PPD.EXCEPTION) {
                }
            }
            return ppc;
        }
        return ppc;
    }

    @Override // X.PYA
    public final PPC<okhttp3.Request, C64598PWw> LJIILLIIL(PPC<okhttp3.Request, C64598PWw> ppc) {
        C64626PXy url;
        String str;
        C64626PXy url2;
        String str2 = null;
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("onBeforeOkHttp\n");
            okhttp3.Request request = ppc.LIZ;
            if (request != null && (url2 = request.url()) != null) {
                str = url2.LJIIIIZZ;
            } else {
                str = null;
            }
            LIZ2.append(str);
            X1D.LIZIZ(LIZ2);
        } catch (Exception e) {
            okhttp3.Request request2 = ppc.LIZ;
            if (request2 != null && (url = request2.url()) != null) {
                str2 = url.LJIIIIZZ;
            }
            PYR.LJFF(str2, "onBeforeOkHttp", e);
        }
        if (PYR.LIZLLL() && PPY.LIZ().enableOkHttpMonitor) {
            CopyOnWriteArrayList<InterfaceC58286MuA> copyOnWriteArrayList = LJ;
            ArrayList arrayList = new ArrayList();
            Iterator<InterfaceC58286MuA> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                InterfaceC58286MuA next = it.next();
                if (next instanceof PYA) {
                    arrayList.add(next);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ppc = ((PYA) it2.next()).LJIILLIIL(ppc);
                PPD ppd = ppc.LJFF;
                if (ppd != PPD.INTERCEPT && ppd != PPD.EXCEPTION) {
                }
            }
            return ppc;
        }
        return ppc;
    }
}
