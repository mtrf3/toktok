package com.bytedance.retrofit2;

import X.C03880Dg;
import X.C07780Sg;
import X.C09900aA;
import X.C16880lQ;
import X.C36910EeA;
import X.C39519Ff9;
import X.C64668PZo;
import X.C64735Pat;
import X.C64736Pau;
import X.C64738Paw;
import X.C64796Pbs;
import X.C64797Pbt;
import X.C64798Pbu;
import X.C64800Pbw;
import X.C65300Pk0;
import X.EJ6;
import X.F7S;
import X.InterfaceC36621EYv;
import X.InterfaceC37276Ek4;
import X.InterfaceC37346ElC;
import X.InterfaceC37818Eso;
import X.InterfaceC38642FEo;
import X.InterfaceC48115IuV;
import X.InterfaceC64760PbI;
import X.InterfaceC64786Pbi;
import X.InterfaceC64787Pbj;
import X.InterfaceC64791Pbn;
import X.InterfaceC64804Pc0;
import X.PJZ;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedInput;
import ee1.l;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class SsHttpCall<T> implements InterfaceC37276Ek4<T>, InterfaceC37818Eso, InterfaceC48115IuV {
    public static InterfaceC64786Pbi sCallMonitor;
    public static InterfaceC38642FEo sReqLevelControl;
    public static InterfaceC64787Pbj sThrottleControl;
    public long appCallTime;
    public final Object[] args;
    public final CallServerInterceptor callServerInterceptor;
    public final C64738Paw httpCallMetrics;
    public int mReqControlLevel = -1;
    public Request originalRequest;
    public Throwable preBuildURLException;
    public final RequestFactory<T> requestFactory;

    @Override // X.InterfaceC37276Ek4
    public C64797Pbt execute() {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(400204, "com/bytedance/retrofit2/SsHttpCall", "execute", this, new Object[0], "com.bytedance.retrofit2.SsResponse", new C65300Pk0(false, "()Lcom/bytedance/retrofit2/SsResponse;", "-6579986199434624504"));
        return LIZJ.LIZ ? (C64797Pbt) LIZJ.LIZIZ : com_bytedance_retrofit2_SsHttpCall_com_ss_android_ugc_aweme_net_lancet_NetIOCheckLancet_execute(this);
    }

    public C64797Pbt getResponseWithInterceptorChain() {
        C64738Paw c64738Paw = this.httpCallMetrics;
        c64738Paw.LJIIZILJ = SystemClock.uptimeMillis();
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(this.requestFactory.interceptors);
        linkedList.add(this.callServerInterceptor);
        c64738Paw.LJII = this.appCallTime;
        c64738Paw.LJIIIIZZ = System.currentTimeMillis();
        this.originalRequest.setMetrics(c64738Paw);
        Request request = this.originalRequest;
        C64797Pbt LIZ = new F7S(linkedList, 0, request, this, c64738Paw).LIZ(request);
        LIZ.LIZLLL = c64738Paw;
        return LIZ;
    }

    public synchronized boolean isExecuted() {
        boolean z;
        CallServerInterceptor callServerInterceptor = this.callServerInterceptor;
        if (callServerInterceptor != null) {
            if (callServerInterceptor.isExecuted()) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    @Override // X.InterfaceC37276Ek4
    public void cancel() {
        CallServerInterceptor callServerInterceptor = this.callServerInterceptor;
        if (callServerInterceptor != null) {
            callServerInterceptor.cancel();
        }
    }

    @Override // X.InterfaceC37276Ek4
    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public SsHttpCall<T> m90clone() {
        return new SsHttpCall<>(this.requestFactory, this.args);
    }

    public C64797Pbt<T> com_bytedance_retrofit2_SsHttpCall__execute$___twin___() {
        Request request;
        String str;
        int LIZIZ;
        C64738Paw c64738Paw = this.httpCallMetrics;
        c64738Paw.LJIILL = SystemClock.uptimeMillis();
        this.appCallTime = System.currentTimeMillis();
        c64738Paw.LJIJ = SystemClock.uptimeMillis();
        try {
            this.originalRequest = this.requestFactory.toRequest(null, this.args);
            c64738Paw.LJIJI = SystemClock.uptimeMillis();
            InterfaceC64787Pbj interfaceC64787Pbj = sThrottleControl;
            if (interfaceC64787Pbj != null && this.mReqControlLevel == -1) {
                if (((C64736Pau) interfaceC64787Pbj).LIZIZ) {
                    Request request2 = this.originalRequest;
                    if (request2 != null && !TextUtils.isEmpty(request2.getPath())) {
                        LIZIZ = ((C64736Pau) sThrottleControl).LIZ(this.originalRequest.getPath());
                        long j = LIZIZ;
                        c64738Paw.LJIILLIIL = j;
                        Thread.sleep(j);
                    }
                    LIZIZ = 0;
                    long j2 = LIZIZ;
                    c64738Paw.LJIILLIIL = j2;
                    Thread.sleep(j2);
                } else {
                    if ((!((ArrayList) l.LJ().LJFF).isEmpty()) && (request = this.originalRequest) != null) {
                        List<EJ6> headers = request.headers("x-tt-request-tag");
                        if (headers != null && headers.size() >= 1 && !TextUtils.isEmpty(((EJ6) ListProtector.get(headers, 0)).LIZIZ)) {
                            str = ((EJ6) ListProtector.get(headers, 0)).LIZIZ;
                        } else {
                            str = "";
                        }
                        LIZIZ = C64736Pau.LIZIZ(this.originalRequest.getUrl(), str);
                        long j22 = LIZIZ;
                        c64738Paw.LJIILLIIL = j22;
                        Thread.sleep(j22);
                    }
                    LIZIZ = 0;
                    long j222 = LIZIZ;
                    c64738Paw.LJIILLIIL = j222;
                    Thread.sleep(j222);
                }
            }
            try {
                C64797Pbt<T> responseWithInterceptorChain = getResponseWithInterceptorChain();
                c64738Paw.LJJJJL = SystemClock.uptimeMillis();
                if (!this.requestFactory.isResponseStreaming) {
                    reportRequestOk(responseWithInterceptorChain, false);
                }
                return responseWithInterceptorChain;
            } catch (Throwable th) {
                c64738Paw.LJJJJL = SystemClock.uptimeMillis();
                reportRequestError(th, false);
                throw th;
            }
        } catch (Exception e) {
            throw e;
        }
    }

    @Override // X.InterfaceC37818Eso
    public void doCollect() {
        CallServerInterceptor callServerInterceptor = this.callServerInterceptor;
        if (callServerInterceptor != null) {
            callServerInterceptor.doCollect();
        }
    }

    @Override // X.InterfaceC48115IuV
    public Object getRequestInfo() {
        CallServerInterceptor callServerInterceptor = this.callServerInterceptor;
        if (callServerInterceptor != null) {
            return callServerInterceptor.getRequestInfo();
        }
        return null;
    }

    @Override // X.InterfaceC37276Ek4
    public boolean isCanceled() {
        CallServerInterceptor callServerInterceptor = this.callServerInterceptor;
        if (callServerInterceptor != null && callServerInterceptor.isCanceled()) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC37276Ek4
    public Request request() {
        Request request;
        CallServerInterceptor callServerInterceptor = this.callServerInterceptor;
        if (callServerInterceptor != null && (request = callServerInterceptor.request()) != null) {
            return request;
        }
        if (this.originalRequest == null) {
            try {
                C64738Paw c64738Paw = this.httpCallMetrics;
                c64738Paw.LJIJ = SystemClock.uptimeMillis();
                this.originalRequest = this.requestFactory.toRequest(null, this.args);
                c64738Paw.LJIJI = SystemClock.uptimeMillis();
            } catch (IOException e) {
                throw new RuntimeException("Unable to create request.", e);
            } catch (RuntimeException e2) {
                throw e2;
            }
        }
        return this.originalRequest;
    }

    public C64738Paw getRetrofitMetrics() {
        return this.httpCallMetrics;
    }

    public static C64797Pbt com_bytedance_retrofit2_SsHttpCall_com_ss_android_ugc_aweme_net_lancet_NetIOCheckLancet_execute(SsHttpCall ssHttpCall) {
        if (C16880lQ.LLLLIIIILLL() == C16880lQ.LLJJJJ().getThread()) {
            long currentTimeMillis = System.currentTimeMillis();
            C64797Pbt<T> com_bytedance_retrofit2_SsHttpCall__execute$___twin___ = ssHttpCall.com_bytedance_retrofit2_SsHttpCall__execute$___twin___();
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            String str = "";
            try {
                Field declaredField = C64797Pbt.class.getDeclaredField("LIZ");
                declaredField.setAccessible(true);
                str = ((C36910EeA) declaredField.get(com_bytedance_retrofit2_SsHttpCall__execute$___twin___)).LIZ;
                Uri parse = UriProtector.parse(str);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("path", parse.getPath());
                jSONObject.put("status", 0);
                C09900aA.LJI("ttlive_network_main_thread", jSONObject, null, null);
            } catch (Exception unused) {
            }
            StringBuilder LIZIZ = C07780Sg.LIZIZ("do network IO on UI thread，url=", str, "，duration=");
            LIZIZ.append((currentTimeMillis2 / 100) * 100);
            PJZ.LIZLLL("core_java_custom_exception_monitor", LIZIZ.toString(), new Throwable());
            return com_bytedance_retrofit2_SsHttpCall__execute$___twin___;
        }
        return ssHttpCall.com_bytedance_retrofit2_SsHttpCall__execute$___twin___();
    }

    public static void setCallMonitor(InterfaceC64786Pbi interfaceC64786Pbi) {
        sCallMonitor = interfaceC64786Pbi;
    }

    public static void setReqLevelControl(InterfaceC38642FEo interfaceC38642FEo) {
        sReqLevelControl = interfaceC38642FEo;
    }

    public static void setThrottleControl(InterfaceC64787Pbj interfaceC64787Pbj) {
        sThrottleControl = interfaceC64787Pbj;
    }

    @Override // X.InterfaceC37276Ek4
    public void enqueue(InterfaceC36621EYv<T> interfaceC36621EYv) {
        InterfaceC37346ElC interfaceC37346ElC;
        if (new C03880Dg(2).LIZJ(400205, "com/bytedance/retrofit2/SsHttpCall", "enqueue", this, new Object[]{interfaceC36621EYv}, "void", new C65300Pk0(false, "(Lcom/bytedance/retrofit2/Callback;)V", "-6579986199434624504")).LIZ) {
            return;
        }
        C64738Paw c64738Paw = this.httpCallMetrics;
        c64738Paw.LJIILJJIL = SystemClock.uptimeMillis();
        this.appCallTime = System.currentTimeMillis();
        if (interfaceC36621EYv != null) {
            CallServerInterceptor callServerInterceptor = this.callServerInterceptor;
            if (callServerInterceptor == null || !callServerInterceptor.isExecuted()) {
                Executor executor = this.requestFactory.httpExecutor;
                if (interfaceC36621EYv instanceof InterfaceC37346ElC) {
                    interfaceC37346ElC = (InterfaceC37346ElC) interfaceC36621EYv;
                } else {
                    interfaceC37346ElC = null;
                }
                C64796Pbs c64796Pbs = new C64796Pbs(this, c64738Paw, interfaceC37346ElC, interfaceC36621EYv);
                try {
                    c64738Paw.LJIJ = SystemClock.uptimeMillis();
                    this.originalRequest = this.requestFactory.toRequest(interfaceC37346ElC, this.args);
                    c64738Paw.LJIJI = SystemClock.uptimeMillis();
                    InterfaceC64787Pbj interfaceC64787Pbj = sThrottleControl;
                    if (interfaceC64787Pbj != null && ((((C64736Pau) interfaceC64787Pbj).LIZIZ || (!((ArrayList) l.LJ().LJFF).isEmpty())) && this.mReqControlLevel == -1)) {
                        executor.execute(new C64798Pbu(this, interfaceC37346ElC, executor, c64796Pbs));
                        return;
                    } else {
                        executor.execute(c64796Pbs);
                        return;
                    }
                } catch (Throwable th) {
                    interfaceC36621EYv.LIZJ(this, th);
                    return;
                }
            }
            throw new IllegalStateException("Already executed.");
        }
        throw new NullPointerException("callback == null");
    }

    public boolean setThrottleNetSpeed(long j) {
        CallServerInterceptor callServerInterceptor = this.callServerInterceptor;
        if (callServerInterceptor != null) {
            return callServerInterceptor.setThrottleNetSpeed(j);
        }
        return false;
    }

    public T toResponseBody(TypedInput typedInput) {
        return (T) this.requestFactory.toResponse(typedInput);
    }

    public SsHttpCall(RequestFactory<T> requestFactory, Object[] objArr) {
        this.requestFactory = requestFactory;
        this.args = objArr;
        this.callServerInterceptor = new CallServerInterceptor(requestFactory);
        C64738Paw c64738Paw = requestFactory.retrofitMetrics;
        c64738Paw.getClass();
        C64738Paw c64738Paw2 = new C64738Paw();
        c64738Paw2.LJJJJI = c64738Paw.LJJJJI;
        c64738Paw2.LJI = c64738Paw.LJII;
        c64738Paw2.LJIIL = c64738Paw.LJIIL;
        c64738Paw2.LJIILIIL = c64738Paw.LJIILIIL;
        this.httpCallMetrics = c64738Paw2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void reportRequestError(Throwable th, boolean z) {
        long j;
        if (sCallMonitor == null) {
            return;
        }
        if (z) {
            j = this.httpCallMetrics.LJIILJJIL;
        } else {
            j = this.httpCallMetrics.LJIILL;
        }
        long uptimeMillis = SystemClock.uptimeMillis() - j;
        if (th instanceof C64800Pbw) {
            C64800Pbw c64800Pbw = (C64800Pbw) th;
            if (c64800Pbw.needReport) {
                if (c64800Pbw.reportMonitorOk) {
                    InterfaceC64786Pbi interfaceC64786Pbi = sCallMonitor;
                    String str = c64800Pbw.url;
                    String str2 = c64800Pbw.traceCode;
                    Object obj = c64800Pbw.infoObj;
                    interfaceC64786Pbi.getClass();
                    InterfaceC64760PbI interfaceC64760PbI = C64735Pat.LJII;
                    if (interfaceC64760PbI != null) {
                        interfaceC64760PbI.LIZ(uptimeMillis, j, str, str2, (C64668PZo) obj);
                    }
                }
                if (c64800Pbw.reportMonitorError) {
                    InterfaceC64786Pbi interfaceC64786Pbi2 = sCallMonitor;
                    String str3 = c64800Pbw.url;
                    String str4 = c64800Pbw.traceCode;
                    Object obj2 = c64800Pbw.infoObj;
                    interfaceC64786Pbi2.getClass();
                    InterfaceC64760PbI interfaceC64760PbI2 = C64735Pat.LJII;
                    if (interfaceC64760PbI2 == null) {
                        return;
                    }
                    interfaceC64760PbI2.LIZIZ(uptimeMillis, j, str3, str4, (C64668PZo) obj2, th);
                    return;
                }
                return;
            }
            return;
        }
        if (this.httpCallMetrics.LJJI) {
            cancelNormalRequest(false, null, false);
            return;
        }
        if (th instanceof InterfaceC64791Pbn) {
            if (!((InterfaceC64791Pbn) th).shouldReport()) {
                return;
            }
            cancelNormalRequest(false, th, false);
        } else {
            sCallMonitor.getClass();
            InterfaceC64804Pc0 interfaceC64804Pc0 = C64735Pat.LIZ;
            if (interfaceC64804Pc0 == null) {
                return;
            }
            interfaceC64804Pc0.LIZ();
            cancelNormalRequest(false, th, true);
        }
    }

    public void reportRequestOk(C64797Pbt<T> c64797Pbt, boolean z) {
        long j;
        if (sCallMonitor != null && !isCanceled()) {
            if (z) {
                j = this.httpCallMetrics.LJIILJJIL;
            } else {
                j = this.httpCallMetrics.LJIILL;
            }
            long uptimeMillis = SystemClock.uptimeMillis() - j;
            InterfaceC64786Pbi interfaceC64786Pbi = sCallMonitor;
            C36910EeA c36910EeA = c64797Pbt.LIZ;
            String str = c36910EeA.LIZ;
            String str2 = c36910EeA.LJI;
            Object obj = c36910EeA.LJFF;
            interfaceC64786Pbi.getClass();
            InterfaceC64760PbI interfaceC64760PbI = C64735Pat.LJII;
            if (interfaceC64760PbI == null) {
                return;
            }
            interfaceC64760PbI.LIZ(uptimeMillis, j, str, str2, (C64668PZo) obj);
        }
    }

    public void cancelNormalRequest(boolean z, Throwable th, boolean z2) {
        CallServerInterceptor callServerInterceptor = this.callServerInterceptor;
        if (callServerInterceptor != null) {
            callServerInterceptor.cancelNormalRequest(z, th, z2);
        }
    }
}
