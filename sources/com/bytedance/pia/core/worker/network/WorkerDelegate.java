package com.bytedance.pia.core.worker.network;

import X.C141335gf;
import X.C37167EiJ;
import X.C37171EiN;
import X.C37238EjS;
import X.C37620Epc;
import X.C37621Epd;
import X.C39745Fin;
import X.C3C5;
import X.C62848OlY;
import X.EJ6;
import X.InterfaceC37169EiL;
import X.InterfaceC37170EiM;
import X.InterfaceC37276Ek4;
import X.InterfaceC37599EpH;
import X.ORZ;
import X.PVJ;
import X.PVP;
import X.X1D;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.vmsdk.net.Request;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class WorkerDelegate implements InterfaceC37170EiM {
    public final String LIZ;
    public final String LIZIZ;
    public final InterfaceC37169EiL LIZJ;
    public final InterfaceC37599EpH LIZLLL;

    public static String LIZ(List list) {
        Object obj;
        String str;
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                String str2 = ((EJ6) obj).LIZ;
                o.LJFF(str2, "it.name");
                Locale locale = Locale.ROOT;
                o.LJFF(locale, "Locale.ROOT");
                String lowerCase = str2.toLowerCase(locale);
                o.LJFF(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (o.LJ(lowerCase, "content-type")) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        EJ6 ej6 = (EJ6) obj;
        if (ej6 != null && (str = ej6.LIZIZ) != null) {
            return str;
        }
        return "application/json";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x0179. Please report as an issue. */
    public final C37167EiJ LIZIZ(Request request, C37621Epd c37621Epd, C37620Epc c37620Epc) {
        Object LIZ;
        JSONObject jSONObject;
        PVJ pvj;
        InterfaceC37276Ek4<TypedInput> deleteStreamRequest;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(this.LIZ);
        LIZ2.append("Begin to fetch (URL: ");
        LIZ2.append(request.getUrl());
        LIZ2.append(')');
        C37238EjS.LJI(6, X1D.LIZIZ(LIZ2), null);
        String remove = request.getHeaders().remove("pia-fetch-params");
        if (remove != null) {
            try {
                LIZ = new JSONObject(remove);
                C3C5.m7constructorimpl(LIZ);
            } catch (Throwable th) {
                LIZ = C141335gf.LIZ(th);
                C3C5.m7constructorimpl(LIZ);
            }
            if (C3C5.m12isFailureimpl(LIZ)) {
                LIZ = null;
            }
            jSONObject = (JSONObject) LIZ;
        } else {
            jSONObject = null;
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append(this.LIZ);
        LIZ3.append("Read fetch parameter (Params: ");
        LIZ3.append(jSONObject);
        LIZ3.append(')');
        C37238EjS.LJI(6, X1D.LIZIZ(LIZ3), null);
        boolean z = false;
        if (jSONObject != null) {
            z = jSONObject.optBoolean("needCommonParams", false);
        }
        if (!request.getHeaders().containsKey("User-Agent")) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append(this.LIZ);
            LIZ4.append("Append 'User-Agent' for fetch (URL: ");
            LIZ4.append(request.getUrl());
            LIZ4.append(')');
            C37238EjS.LJI(6, X1D.LIZIZ(LIZ4), null);
            request.getHeaders().put("User-Agent", this.LIZIZ);
        }
        Uri parse = UriProtector.parse(request.getUrl());
        if (parse != null && parse.getHost() != null && parse.getScheme() != null) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(parse.getScheme());
            LIZ5.append("://");
            LIZ5.append(parse.getHost());
            LIZ5.append("/");
            String LIZIZ = X1D.LIZIZ(LIZ5);
            if (LIZIZ != null) {
                IWorkerRetrofitApi iWorkerRetrofitApi = (IWorkerRetrofitApi) this.LIZJ.LIZ(IWorkerRetrofitApi.class, LIZIZ);
                Map<String, String> headers = request.getHeaders();
                o.LJFF(headers, "request.headers");
                ArrayList arrayList = new ArrayList(headers.size());
                for (Map.Entry<String, String> entry : headers.entrySet()) {
                    arrayList.add(new EJ6(entry.getKey(), entry.getValue()));
                }
                List<EJ6> LLJI = ORZ.LLJI(arrayList);
                C39745Fin LIZJ = C39745Fin.LIZJ(LIZ(LLJI));
                InputStream body = request.getBody();
                if (body != null) {
                    pvj = PVP.LIZLLL(LIZJ, C62848OlY.LJFF(body));
                } else {
                    pvj = null;
                }
                String method = request.getMethod();
                o.LJFF(method, "request.method");
                Locale locale = Locale.ROOT;
                o.LJFF(locale, "Locale.ROOT");
                String lowerCase = method.toLowerCase(locale);
                o.LJFF(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                switch (lowerCase.hashCode()) {
                    case -1335458389:
                        if (lowerCase.equals("delete")) {
                            deleteStreamRequest = iWorkerRetrofitApi.deleteStreamRequest(z, parse.toString(), LLJI);
                            o.LJFF(deleteStreamRequest, "api.deleteStreamRequest(… uri.toString(), headers)");
                            deleteStreamRequest.enqueue(new C37171EiN(this, c37620Epc, c37621Epd));
                            return new C37167EiJ(deleteStreamRequest);
                        }
                        StringBuilder LIZ6 = X1D.LIZ();
                        LIZ6.append(this.LIZ);
                        LIZ6.append("Fetch failed (Reason: Invalid method!)");
                        C37238EjS.LIZLLL(6, X1D.LIZIZ(LIZ6), null);
                        c37620Epc.LIZ(new Error("Invalid method!"));
                        return null;
                    case -1249474914:
                        if (lowerCase.equals("options")) {
                            deleteStreamRequest = iWorkerRetrofitApi.optionsStreamRequest(z, parse.toString(), LLJI);
                            o.LJFF(deleteStreamRequest, "api.optionsStreamRequest… uri.toString(), headers)");
                            deleteStreamRequest.enqueue(new C37171EiN(this, c37620Epc, c37621Epd));
                            return new C37167EiJ(deleteStreamRequest);
                        }
                        StringBuilder LIZ62 = X1D.LIZ();
                        LIZ62.append(this.LIZ);
                        LIZ62.append("Fetch failed (Reason: Invalid method!)");
                        C37238EjS.LIZLLL(6, X1D.LIZIZ(LIZ62), null);
                        c37620Epc.LIZ(new Error("Invalid method!"));
                        return null;
                    case 102230:
                        if (lowerCase.equals("get")) {
                            deleteStreamRequest = iWorkerRetrofitApi.getStreamRequest(z, parse.toString(), LLJI);
                            o.LJFF(deleteStreamRequest, "api.getStreamRequest(nee… uri.toString(), headers)");
                            deleteStreamRequest.enqueue(new C37171EiN(this, c37620Epc, c37621Epd));
                            return new C37167EiJ(deleteStreamRequest);
                        }
                        StringBuilder LIZ622 = X1D.LIZ();
                        LIZ622.append(this.LIZ);
                        LIZ622.append("Fetch failed (Reason: Invalid method!)");
                        C37238EjS.LIZLLL(6, X1D.LIZIZ(LIZ622), null);
                        c37620Epc.LIZ(new Error("Invalid method!"));
                        return null;
                    case 111375:
                        if (lowerCase.equals("put")) {
                            deleteStreamRequest = iWorkerRetrofitApi.putStreamRequest(z, parse.toString(), pvj, LLJI);
                            o.LJFF(deleteStreamRequest, "api.putStreamRequest(nee…oString(), body, headers)");
                            deleteStreamRequest.enqueue(new C37171EiN(this, c37620Epc, c37621Epd));
                            return new C37167EiJ(deleteStreamRequest);
                        }
                        StringBuilder LIZ6222 = X1D.LIZ();
                        LIZ6222.append(this.LIZ);
                        LIZ6222.append("Fetch failed (Reason: Invalid method!)");
                        C37238EjS.LIZLLL(6, X1D.LIZIZ(LIZ6222), null);
                        c37620Epc.LIZ(new Error("Invalid method!"));
                        return null;
                    case 3198432:
                        if (lowerCase.equals("head")) {
                            deleteStreamRequest = iWorkerRetrofitApi.headStreamRequest(z, parse.toString(), LLJI);
                            o.LJFF(deleteStreamRequest, "api.headStreamRequest(ne… uri.toString(), headers)");
                            deleteStreamRequest.enqueue(new C37171EiN(this, c37620Epc, c37621Epd));
                            return new C37167EiJ(deleteStreamRequest);
                        }
                        StringBuilder LIZ62222 = X1D.LIZ();
                        LIZ62222.append(this.LIZ);
                        LIZ62222.append("Fetch failed (Reason: Invalid method!)");
                        C37238EjS.LIZLLL(6, X1D.LIZIZ(LIZ62222), null);
                        c37620Epc.LIZ(new Error("Invalid method!"));
                        return null;
                    case 3446944:
                        if (lowerCase.equals("post")) {
                            deleteStreamRequest = iWorkerRetrofitApi.postStreamRequest(z, parse.toString(), pvj, LLJI);
                            o.LJFF(deleteStreamRequest, "api.postStreamRequest(ne…oString(), body, headers)");
                            deleteStreamRequest.enqueue(new C37171EiN(this, c37620Epc, c37621Epd));
                            return new C37167EiJ(deleteStreamRequest);
                        }
                        StringBuilder LIZ622222 = X1D.LIZ();
                        LIZ622222.append(this.LIZ);
                        LIZ622222.append("Fetch failed (Reason: Invalid method!)");
                        C37238EjS.LIZLLL(6, X1D.LIZIZ(LIZ622222), null);
                        c37620Epc.LIZ(new Error("Invalid method!"));
                        return null;
                    case 106438728:
                        if (lowerCase.equals("patch")) {
                            deleteStreamRequest = iWorkerRetrofitApi.patchStreamRequest(z, parse.toString(), pvj, LLJI);
                            o.LJFF(deleteStreamRequest, "api.patchStreamRequest(n…oString(), body, headers)");
                            deleteStreamRequest.enqueue(new C37171EiN(this, c37620Epc, c37621Epd));
                            return new C37167EiJ(deleteStreamRequest);
                        }
                        StringBuilder LIZ6222222 = X1D.LIZ();
                        LIZ6222222.append(this.LIZ);
                        LIZ6222222.append("Fetch failed (Reason: Invalid method!)");
                        C37238EjS.LIZLLL(6, X1D.LIZIZ(LIZ6222222), null);
                        c37620Epc.LIZ(new Error("Invalid method!"));
                        return null;
                    default:
                        StringBuilder LIZ62222222 = X1D.LIZ();
                        LIZ62222222.append(this.LIZ);
                        LIZ62222222.append("Fetch failed (Reason: Invalid method!)");
                        C37238EjS.LIZLLL(6, X1D.LIZIZ(LIZ62222222), null);
                        c37620Epc.LIZ(new Error("Invalid method!"));
                        return null;
                }
            }
        }
        StringBuilder LIZ7 = X1D.LIZ();
        LIZ7.append(this.LIZ);
        LIZ7.append("Fetch failed (Reason: Invalid url!)");
        C37238EjS.LIZLLL(6, X1D.LIZIZ(LIZ7), null);
        c37620Epc.LIZ(new Error("Invalid url!"));
        return null;
    }

    public WorkerDelegate(String logTag, String userAgent, InterfaceC37169EiL retrofit, InterfaceC37599EpH resourceLoader) {
        o.LJIIJ(logTag, "logTag");
        o.LJIIJ(userAgent, "userAgent");
        o.LJIIJ(retrofit, "retrofit");
        o.LJIIJ(resourceLoader, "resourceLoader");
        this.LIZ = logTag;
        this.LIZIZ = userAgent;
        this.LIZJ = retrofit;
        this.LIZLLL = resourceLoader;
    }
}
