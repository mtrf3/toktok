package com.bytedance.retrofit2;

import X.C36910EeA;
import X.C47821Ipl;
import X.C56662Kg;
import X.C64738Paw;
import X.C64797Pbt;
import X.EJ6;
import X.FBZ;
import X.InterfaceC37216Ej6;
import X.InterfaceC37818Eso;
import X.InterfaceC48115IuV;
import X.InterfaceC64703PaN;
import X.InterfaceC64803Pbz;
import android.os.SystemClock;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.TypedInput;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public class CallServerInterceptor<T> implements InterfaceC37216Ej6, InterfaceC37818Eso, InterfaceC48115IuV {
    public volatile boolean mCanceled;
    public Throwable mCreationFailure;
    public volatile boolean mExecuted;
    public Request mOriginalRequest;
    public volatile InterfaceC64803Pbz mRawCall;
    public final RequestFactory<T> mRequestFactory;
    public volatile long mThrottleNetSpeed;

    private InterfaceC64803Pbz createRawCall(Request request) {
        return com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_createRawCall(this, request);
    }

    private C36910EeA executeCall(InterfaceC64803Pbz interfaceC64803Pbz, C64738Paw c64738Paw) {
        return com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_executeCall(this, interfaceC64803Pbz, c64738Paw);
    }

    public void cancel() {
        this.mCanceled = true;
        if (this.mRawCall != null) {
            this.mRawCall.cancel();
        }
    }

    public synchronized boolean isExecuted() {
        return this.mExecuted;
    }

    public C64797Pbt parseResponse(C36910EeA c36910EeA, C64738Paw c64738Paw) {
        return com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_parseResponse(this, c36910EeA, c64738Paw);
    }

    public synchronized void resetExecuted() {
        this.mExecuted = false;
    }

    @Override // X.InterfaceC37818Eso
    public void doCollect() {
        if (this.mRawCall instanceof InterfaceC37818Eso) {
            ((InterfaceC37818Eso) this.mRawCall).doCollect();
        }
    }

    @Override // X.InterfaceC48115IuV
    public Object getRequestInfo() {
        if (this.mRawCall instanceof InterfaceC48115IuV) {
            return ((InterfaceC48115IuV) this.mRawCall).getRequestInfo();
        }
        return null;
    }

    public boolean isCanceled() {
        return this.mCanceled;
    }

    public Request request() {
        return this.mOriginalRequest;
    }

    public CallServerInterceptor(RequestFactory<T> requestFactory) {
        this.mRequestFactory = requestFactory;
    }

    public InterfaceC64803Pbz com_bytedance_retrofit2_CallServerInterceptor__createRawCall$___twin___(Request request) {
        return this.mRequestFactory.clientProvider.get().LIZ(request);
    }

    @Override // X.InterfaceC37216Ej6
    public C64797Pbt intercept(FBZ fbz) {
        C64738Paw LIZIZ = fbz.LIZIZ();
        if (LIZIZ != null) {
            LIZIZ.LJIIIZ = System.currentTimeMillis();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        Request request = fbz.request();
        this.mOriginalRequest = request;
        LIZIZ.LJJJJLI = request.getPriorityLevel();
        LIZIZ.LJJJJLL = this.mOriginalRequest.getRequestPriorityLevel();
        synchronized (this) {
            if (!this.mExecuted) {
                this.mExecuted = true;
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        Throwable th = this.mCreationFailure;
        if (th != null) {
            if (th instanceof IOException) {
                throw th;
            }
            throw new Exception(this.mCreationFailure);
        }
        Request request2 = this.mOriginalRequest;
        if (request2 != null) {
            request2.setMetrics(LIZIZ);
        }
        this.mRequestFactory.getClass();
        try {
            this.mRawCall = com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_createRawCall(this, this.mOriginalRequest);
            if (this.mThrottleNetSpeed > 0) {
                this.mRawCall.LIZIZ(this.mThrottleNetSpeed);
            }
            if (this.mCanceled) {
                this.mRawCall.cancel();
            }
            ((ConcurrentHashMap) LIZIZ.LJJIFFI).put("CallServerInterceptor", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
            List<EJ6> headers = this.mOriginalRequest.headers("content-encoding");
            if (headers != null && headers.size() > 0) {
                LIZIZ.LJJJJZI = ((EJ6) ListProtector.get(this.mOriginalRequest.headers("content-encoding"), 0)).LIZIZ;
            }
            LIZIZ.LJ();
            C36910EeA com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_executeCall = com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_executeCall(this, this.mRawCall, LIZIZ);
            LIZIZ.LJJI = true;
            this.mRequestFactory.getClass();
            List<EJ6> LIZIZ2 = com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_executeCall.LIZIZ("content-encoding");
            if (LIZIZ2 != null) {
                LIZIZ.LJJJJZ = ((EJ6) ListProtector.get(LIZIZ2, 0)).LIZIZ;
            }
            LIZIZ.LJFF(this);
            long uptimeMillis2 = SystemClock.uptimeMillis();
            C64797Pbt parseResponse = parseResponse(com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_executeCall, LIZIZ);
            ((ConcurrentHashMap) LIZIZ.LJJII).put("CallServerInterceptor", Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis2));
            return parseResponse;
        } catch (IOException e) {
            e = e;
            this.mCreationFailure = e;
            throw e;
        } catch (RuntimeException e2) {
            e = e2;
            this.mCreationFailure = e;
            throw e;
        } catch (Throwable th2) {
            this.mCreationFailure = th2;
            if (th2 instanceof Exception) {
                throw th2;
            }
            throw new Exception(th2);
        }
    }

    public boolean setThrottleNetSpeed(long j) {
        this.mThrottleNetSpeed = j;
        if (this.mRawCall != null) {
            return this.mRawCall.LIZIZ(j);
        }
        return false;
    }

    public static InterfaceC64803Pbz com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_createRawCall(CallServerInterceptor callServerInterceptor, Request request) {
        long currentTimeMillis = System.currentTimeMillis();
        InterfaceC64803Pbz com_bytedance_retrofit2_CallServerInterceptor__createRawCall$___twin___ = callServerInterceptor.com_bytedance_retrofit2_CallServerInterceptor__createRawCall$___twin___(request);
        if (C56662Kg.LIZ().LIZLLL && C47821Ipl.LIZ(request) != -1) {
            C56662Kg.LIZ().LIZLLL(System.currentTimeMillis() - currentTimeMillis, "feed_create_sslcall");
        }
        return com_bytedance_retrofit2_CallServerInterceptor__createRawCall$___twin___;
    }

    public C36910EeA com_bytedance_retrofit2_CallServerInterceptor__executeCall$___twin___(InterfaceC64803Pbz interfaceC64803Pbz, C64738Paw c64738Paw) {
        if (c64738Paw != null) {
            c64738Paw.LJIJJ = SystemClock.uptimeMillis();
        }
        return interfaceC64803Pbz.execute();
    }

    public C64797Pbt<T> com_bytedance_retrofit2_CallServerInterceptor__parseResponse$___twin___(C36910EeA c36910EeA, C64738Paw c64738Paw) {
        if (c36910EeA != null) {
            TypedInput typedInput = c36910EeA.LJ;
            int i = c36910EeA.LIZIZ;
            if (i < 200 || i >= 300) {
                return C64797Pbt.LIZ(typedInput, c36910EeA);
            }
            if (i == 204 || i == 205) {
                return C64797Pbt.LIZLLL(null, c36910EeA);
            }
            if (c64738Paw != null) {
                try {
                    c64738Paw.LJIL = SystemClock.uptimeMillis();
                } catch (Throwable th) {
                    if (c64738Paw != null) {
                        c64738Paw.LJJJJIZL = false;
                    }
                    throw th;
                }
            }
            Object response = this.mRequestFactory.toResponse(typedInput);
            if (c64738Paw != null) {
                c64738Paw.LJJ = SystemClock.uptimeMillis();
            }
            return C64797Pbt.LIZLLL(response, c36910EeA);
        }
        throw new IOException("SsResponse is null");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00c7 A[Catch: Exception -> 0x0172, TryCatch #2 {Exception -> 0x0172, blocks: (B:37:0x00c3, B:39:0x00c7, B:42:0x014c, B:44:0x00eb, B:46:0x00ef, B:47:0x0144), top: B:36:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb A[Catch: Exception -> 0x0172, TryCatch #2 {Exception -> 0x0172, blocks: (B:37:0x00c3, B:39:0x00c7, B:42:0x014c, B:44:0x00eb, B:46:0x00ef, B:47:0x0144), top: B:36:0x00c3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C36910EeA com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_executeCall(com.bytedance.retrofit2.CallServerInterceptor r5, X.InterfaceC64803Pbz r6, X.C64738Paw r7) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.retrofit2.CallServerInterceptor.com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_executeCall(com.bytedance.retrofit2.CallServerInterceptor, X.Pbz, X.Paw):X.EeA");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00f6, code lost:
    
        if (r5 != null) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C64797Pbt com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_parseResponse(com.bytedance.retrofit2.CallServerInterceptor r10, X.C36910EeA r11, X.C64738Paw r12) {
        /*
            java.lang.String r7 = "feed_parse_to_ui"
            com.bytedance.retrofit2.client.Request r5 = r10.mOriginalRequest
            X.FAM r0 = X.C56662Kg.LIZ()
            boolean r9 = r0.LIZLLL
            r2 = -1
            r3 = 1
            java.lang.String r8 = "feed_parse_duration"
            if (r9 == 0) goto L32
            int r6 = X.C47821Ipl.LIZ(r5)
            if (r6 == r2) goto L33
            X.FAM r1 = X.C56662Kg.LIZ()
            java.lang.String r0 = "feed_network_duration"
            r1.LJFF(r0, r3)
            X.FAM r0 = X.C56662Kg.LIZ()
            boolean r0 = r0.LJII(r8)
            if (r0 != 0) goto L33
            X.FAM r0 = X.C56662Kg.LIZ()
            r0.LIZJ(r8, r3)
            goto L33
        L32:
            r6 = -1
        L33:
            X.Pbt r4 = r10.com_bytedance_retrofit2_CallServerInterceptor__parseResponse$___twin___(r11, r12)     // Catch: java.lang.Throwable -> Lb8
            if (r9 == 0) goto L84
            if (r6 == r2) goto L84
            X.FAM r0 = X.C56662Kg.LIZ()     // Catch: java.lang.Throwable -> Lb8
            boolean r1 = r0.LJII(r8)     // Catch: java.lang.Throwable -> Lb8
            X.FAM r0 = X.C56662Kg.LIZ()     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r0.LJIIIIZZ(r8)     // Catch: java.lang.Throwable -> Lb8
            r2 = 0
            if (r1 == 0) goto L60
            if (r0 != 0) goto L60
            X.FAM r0 = X.C56662Kg.LIZ()     // Catch: java.lang.Throwable -> Lb8
            r0.LJFF(r8, r3)     // Catch: java.lang.Throwable -> Lb8
            X.FAM r1 = X.C56662Kg.LIZ()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r0 = "feed_parse_end_to_video_preload"
            r1.LIZJ(r0, r2)     // Catch: java.lang.Throwable -> Lb8
        L60:
            X.FAM r0 = X.C56662Kg.LIZ()     // Catch: java.lang.Throwable -> Lb8
            boolean r0 = r0.LJII(r7)     // Catch: java.lang.Throwable -> Lb8
            if (r0 != 0) goto L71
            X.FAM r0 = X.C56662Kg.LIZ()     // Catch: java.lang.Throwable -> Lb8
            r0.LIZJ(r7, r3)     // Catch: java.lang.Throwable -> Lb8
        L71:
            X.FAM r1 = X.C56662Kg.LIZ()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r0 = "feed_net_api_to_feed_api"
            r1.LIZJ(r0, r2)     // Catch: java.lang.Throwable -> Lb8
            X.FAM r3 = X.C56662Kg.LIZ()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r2 = "feed_api_type"
            long r0 = (long) r6     // Catch: java.lang.Throwable -> Lb8
            r3.LIZLLL(r0, r2)     // Catch: java.lang.Throwable -> Lb8
        L84:
            if (r5 == 0) goto L93
            com.ss.android.ugc.aweme.services.ApiMonitorService$Companion r0 = com.ss.android.ugc.aweme.services.ApiMonitorService.Companion     // Catch: java.lang.Throwable -> Lb8
            com.ss.android.ugc.aweme.services.ApiMonitorService r1 = r0.getInstance()     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r0 = r5.getUrl()     // Catch: java.lang.Throwable -> Lb8
            r1.addALog(r0, r4)     // Catch: java.lang.Throwable -> Lb8
        L93:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.ss.android.ugc.aweme.service.INetworkDebugService> r0 = com.ss.android.ugc.aweme.service.INetworkDebugService.class
            java.lang.Object r0 = r1.getService(r0)
            com.ss.android.ugc.aweme.service.INetworkDebugService r0 = (com.ss.android.ugc.aweme.service.INetworkDebugService) r0
            if (r0 == 0) goto Lb7
            if (r5 == 0) goto La6
            r5.getPath()
        La6:
            java.util.Map r1 = r0.LIZ()
            if (r1 == 0) goto Lb7
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto Lb7
            java.lang.String r0 = "useless_key_analyzer"
            X.FMX.LJIIL(r0, r1)
        Lb7:
            return r4
        Lb8:
            r4 = move-exception
            boolean r0 = r4 instanceof X.C38333F2r
            if (r0 == 0) goto Lf6
            if (r11 == 0) goto Lf6
            r3 = r4
            X.F2r r3 = (X.C38333F2r) r3
            int r1 = r3.getErrorCode()
            r0 = 8
            if (r1 != r0) goto Ldc
            java.lang.String r2 = r11.LIZ
            if (r5 != 0) goto Lf1
            r1 = 0
        Lcf:
            com.ss.android.ugc.aweme.IAccountUserService r0 = X.HG3.LJIILL()
            X.RBX r0 = (X.RBX) r0
            boolean r0 = r0.isLogin()
            X.C38901fq.LJII(r2, r1, r0)
        Ldc:
            java.lang.String r0 = r5.getPath()
            r3.setPath(r0)
        Le3:
            com.ss.android.ugc.aweme.services.ApiMonitorService$Companion r0 = com.ss.android.ugc.aweme.services.ApiMonitorService.Companion
            com.ss.android.ugc.aweme.services.ApiMonitorService r1 = r0.getInstance()
            java.lang.String r0 = r5.getUrl()
            r1.addFailLog(r0, r4, r11)
        Lf0:
            throw r4
        Lf1:
            java.util.List r1 = r5.getHeaders()
            goto Lcf
        Lf6:
            if (r5 == 0) goto Lf0
            goto Le3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.retrofit2.CallServerInterceptor.com_bytedance_retrofit2_CallServerInterceptor_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_parseResponse(com.bytedance.retrofit2.CallServerInterceptor, X.EeA, X.Paw):X.Pbt");
    }

    public void cancelNormalRequest(boolean z, Throwable th, boolean z2) {
        this.mCanceled = z;
        if (this.mRawCall != null && (this.mRawCall instanceof InterfaceC64703PaN)) {
            ((InterfaceC64703PaN) this.mRawCall).LIZ(th, z2);
        }
    }
}
