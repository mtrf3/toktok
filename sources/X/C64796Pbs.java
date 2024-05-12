package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.retrofit2.SsHttpCall;
import com.bytedance.retrofit2.client.Request;
import ee1.l;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Pbs, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64796Pbs implements InterfaceRunnableC64808Pc4 {
    public final /* synthetic */ C64738Paw LJLIL;
    public final /* synthetic */ InterfaceC37346ElC LJLILLLLZI;
    public final /* synthetic */ InterfaceC36621EYv LJLJI;
    public final /* synthetic */ SsHttpCall LJLJJI;

    @Override // java.lang.Runnable
    public final void run() {
        try {
            SsHttpCall ssHttpCall = this.LJLJJI;
            Throwable th = ssHttpCall.preBuildURLException;
            if (th == null) {
                if (ssHttpCall.originalRequest == null) {
                    this.LJLIL.LJIJ = SystemClock.uptimeMillis();
                    SsHttpCall ssHttpCall2 = this.LJLJJI;
                    ssHttpCall2.originalRequest = ssHttpCall2.requestFactory.toRequest(this.LJLILLLLZI, ssHttpCall2.args);
                    this.LJLIL.LJIJI = SystemClock.uptimeMillis();
                }
                C64797Pbt responseWithInterceptorChain = this.LJLJJI.getResponseWithInterceptorChain();
                this.LJLIL.LJJJJJ = SystemClock.uptimeMillis();
                try {
                    this.LJLJI.LJII(this.LJLJJI, responseWithInterceptorChain);
                    InterfaceC37346ElC interfaceC37346ElC = this.LJLILLLLZI;
                    if (interfaceC37346ElC != null) {
                        interfaceC37346ElC.LJ(this.LJLJJI, responseWithInterceptorChain);
                    }
                } catch (Throwable unused) {
                }
                this.LJLIL.LJJJJJL = SystemClock.uptimeMillis();
                if (!isStreaming()) {
                    this.LJLJJI.reportRequestOk(responseWithInterceptorChain, true);
                    return;
                }
                return;
            }
            throw th;
        } catch (Throwable th2) {
            this.LJLIL.LJJJJJ = SystemClock.uptimeMillis();
            try {
                this.LJLJI.LIZJ(this.LJLJJI, th2);
            } catch (Throwable unused2) {
            }
            this.LJLIL.LJJJJJL = SystemClock.uptimeMillis();
            this.LJLJJI.reportRequestError(th2, true);
        }
    }

    @Override // X.InterfaceRunnableC64808Pc4
    public final int LJJIIZI() {
        Request request;
        String str;
        InterfaceC64787Pbj interfaceC64787Pbj = SsHttpCall.sThrottleControl;
        int i = 0;
        if (interfaceC64787Pbj != null) {
            if (((C64736Pau) interfaceC64787Pbj).LIZIZ) {
                Request request2 = this.LJLJJI.originalRequest;
                if (request2 != null && !TextUtils.isEmpty(request2.getPath())) {
                    i = ((C64736Pau) SsHttpCall.sThrottleControl).LIZ(this.LJLJJI.originalRequest.getPath());
                }
            } else if ((!((ArrayList) l.LJ().LJFF).isEmpty()) && (request = this.LJLJJI.originalRequest) != null) {
                List<EJ6> headers = request.headers("x-tt-request-tag");
                if (headers != null && headers.size() >= 1 && !TextUtils.isEmpty(((EJ6) ListProtector.get(headers, 0)).LIZIZ)) {
                    str = ((EJ6) ListProtector.get(headers, 0)).LIZIZ;
                } else {
                    str = "";
                }
                i = C64736Pau.LIZIZ(this.LJLJJI.originalRequest.getUrl(), str);
            }
        }
        this.LJLIL.LJIILLIIL = i;
        return i;
    }

    @Override // X.InterfaceRunnableC64808Pc4
    public final boolean isStreaming() {
        return this.LJLJJI.requestFactory.isResponseStreaming;
    }

    @Override // X.InterfaceRunnableC64808Pc4
    public final int priority() {
        return this.LJLJJI.requestFactory.priorityLevel;
    }

    public C64796Pbs(SsHttpCall ssHttpCall, C64738Paw c64738Paw, InterfaceC37346ElC interfaceC37346ElC, InterfaceC36621EYv interfaceC36621EYv) {
        this.LJLJJI = ssHttpCall;
        this.LJLIL = c64738Paw;
        this.LJLILLLLZI = interfaceC37346ElC;
        this.LJLJI = interfaceC36621EYv;
    }
}
