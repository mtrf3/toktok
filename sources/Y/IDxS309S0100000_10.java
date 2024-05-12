package Y;

import X.C10K;
import X.C25574A1y;
import X.C38306F1q;
import X.C38333F2r;
import X.C62913Omb;
import X.C62914Omc;
import X.InterfaceC116954iR;
import X.InterfaceC62930Oms;
import X.InterfaceC92693kP;
import X.X1D;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.TopViewJsonManager;
import com.ss.android.ugc.aweme.compliance.api.model.CmplRespForEncrypt;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import defpackage.e1;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public class IDxS309S0100000_10 implements InterfaceC116954iR {
    public final int $t;
    public Object l0;

    public static final void onComplete$0(IDxS309S0100000_10 iDxS309S0100000_10) {
    }

    public static final void onComplete$1(IDxS309S0100000_10 iDxS309S0100000_10) {
    }

    public static final void onError$0(IDxS309S0100000_10 iDxS309S0100000_10, Throwable th) {
    }

    public static final void onSubscribe$0(IDxS309S0100000_10 iDxS309S0100000_10, InterfaceC92693kP interfaceC92693kP) {
    }

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        switch (this.$t) {
            case 0:
                onComplete$0(this);
                return;
            case 1:
                onComplete$1(this);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable th) {
        switch (this.$t) {
            case 0:
                onError$0(this, th);
                return;
            case 1:
                onError$1(this, th);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(Object obj) {
        switch (this.$t) {
            case 0:
                onNext$0(this, obj);
                return;
            case 1:
                onNext$1(this, obj);
                return;
            default:
                return;
        }
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP interfaceC92693kP) {
        switch (this.$t) {
            case 0:
                onSubscribe$0(this, interfaceC92693kP);
                return;
            case 1:
                o.LJIIIZ(interfaceC92693kP, "d");
                return;
            default:
                return;
        }
    }

    public IDxS309S0100000_10(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onError$1(IDxS309S0100000_10 iDxS309S0100000_10, Throwable e) {
        int i;
        String imprId;
        o.LJIIIZ(e, "e");
        StackTraceElement[] stackTrace = e.getStackTrace();
        o.LJIIIIZZ(stackTrace, "e.stackTrace");
        String str = "";
        String str2 = "";
        for (StackTraceElement stackTraceElement : stackTrace) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str2);
            LIZ.append(stackTraceElement.toString());
            LIZ.append('\n');
            str2 = X1D.LIZIZ(LIZ);
        }
        if (e instanceof C38333F2r) {
            Object rawResponse = ((C38333F2r) e).getRawResponse();
            o.LJII(rawResponse, "null cannot be cast to non-null type com.ss.android.ugc.aweme.compliance.api.model.CmplRespForEncrypt");
            LogPbBean logPb = ((CmplRespForEncrypt) rawResponse).getLogPb();
            if (logPb != null && (imprId = logPb.getImprId()) != null) {
                str = imprId;
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        if (e instanceof C38306F1q) {
            i = ((C38306F1q) e).getErrorCode();
        } else {
            i = -1;
        }
        LIZ2.append(i);
        LIZ2.append('\n');
        LIZ2.append(e.getMessage());
        LIZ2.append('\n');
        LIZ2.append(str2);
        C25574A1y.LIZJ("/aweme/v1/cmpl/set/settings/", str, X1D.LIZIZ(LIZ2));
        InterfaceC62930Oms interfaceC62930Oms = (InterfaceC62930Oms) iDxS309S0100000_10.l0;
        if (interfaceC62930Oms != null) {
            interfaceC62930Oms.onError();
        }
    }

    public static final void onNext$0(IDxS309S0100000_10 iDxS309S0100000_10, Object obj) {
        if (!((Boolean) obj).booleanValue() || !e1.LIZ(31744, "awesome_splash_del_when_background_enabled", true, false)) {
            return;
        }
        TopViewJsonManager topViewJsonManager = (TopViewJsonManager) iDxS309S0100000_10.l0;
        topViewJsonManager.getClass();
        C10K.LIZJ(new ACallableS81S0101000_10(0, topViewJsonManager, 0));
    }

    public static final void onNext$1(IDxS309S0100000_10 iDxS309S0100000_10, Object obj) {
        String str;
        CmplRespForEncrypt t = (CmplRespForEncrypt) obj;
        o.LJIIIZ(t, "t");
        if (t.status_code == 0) {
            String complianceEncrypt = t.getComplianceEncrypt();
            C62914Omc c62914Omc = C62913Omb.LIZIZ;
            c62914Omc.LJI = complianceEncrypt;
            c62914Omc.LIZIZ.storeString("cmpl_enc", complianceEncrypt);
            InterfaceC62930Oms interfaceC62930Oms = (InterfaceC62930Oms) iDxS309S0100000_10.l0;
            if (interfaceC62930Oms != null) {
                interfaceC62930Oms.onSuccess();
            }
            C25574A1y.LIZ(0, "compliance_api_status", "/aweme/v1/cmpl/set/settings/");
            return;
        }
        LogPbBean logPb = t.getLogPb();
        if (logPb == null || (str = logPb.getImprId()) == null) {
            str = "";
        }
        C25574A1y.LIZJ("/aweme/v1/cmpl/set/settings/", str, String.valueOf(t.status_code));
        InterfaceC62930Oms interfaceC62930Oms2 = (InterfaceC62930Oms) iDxS309S0100000_10.l0;
        if (interfaceC62930Oms2 == null) {
            return;
        }
        interfaceC62930Oms2.onError();
    }
}
