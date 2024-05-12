package com.bytedance.bpea.entry.auth;

import X.C00F;
import X.C39205Fa5;
import X.C39207Fa7;
import X.C66300Q0i;
import X.C78923UyF;
import X.EnumC39200Fa0;
import X.InterfaceC39206Fa6;
import X.InterfaceC39218FaI;
import X.InterfaceC88472Yns;
import X.OHW;
import com.bytedance.bpea.basics.Cert;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class CertAuthEntry {
    public static final Companion Companion = new Companion();
    public static InterfaceC39218FaI certAuthContextInterceptor;

    public static final C66300Q0i checkCert(Cert cert, String[] strArr, String str, String str2, String str3) {
        return Companion.checkCert(cert, strArr, str, str2, str3);
    }

    public static final C66300Q0i checkSDKCert(Cert cert, String[] strArr, String str, String str2) {
        return Companion.checkSDKCert(cert, strArr, str, str2);
    }

    public static final JSONObject getTranslateResult(C66300Q0i c66300Q0i) {
        return Companion.getTranslateResult(c66300Q0i);
    }

    /* loaded from: classes7.dex */
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final JSONObject getTranslateResult(C66300Q0i getTranslateResult) {
            o.LJIIJ(getTranslateResult, "$this$getTranslateResult");
            return C78923UyF.LJIIIIZZ(getTranslateResult);
        }

        public final void setContextInterceptor(InterfaceC39218FaI interfaceC39218FaI) {
            CertAuthEntry.certAuthContextInterceptor = interfaceC39218FaI;
        }

        public final C66300Q0i checkSDKCert(Cert cert, String[] strArr, String sdkName, String methodName) {
            o.LJIIJ(sdkName, "sdkName");
            o.LJIIJ(methodName, "methodName");
            return checkCert(cert, strArr, sdkName, methodName, "Collect");
        }

        public final C66300Q0i checkCert(Cert cert, String[] strArr, String sdkName, String methodName, String domain) {
            o.LJIIJ(sdkName, "sdkName");
            o.LJIIJ(methodName, "methodName");
            o.LJIIJ(domain, "domain");
            OHW ohw = new OHW(cert, C00F.LIZIZ(sdkName, '_', methodName), strArr, Integer.valueOf(EnumC39200Fa0.DIRECT_AUTH.getType()), domain);
            ohw.LIZ.put("sdkName", sdkName);
            ohw.LIZ.put("methodName", methodName);
            InterfaceC39218FaI interfaceC39218FaI = CertAuthEntry.certAuthContextInterceptor;
            if (interfaceC39218FaI != null) {
                interfaceC39218FaI.LIZ(sdkName, methodName, domain, ohw);
            }
            InterfaceC39206Fa6 interfaceC39206Fa6 = C39205Fa5.LIZ;
            if (interfaceC39206Fa6 == null) {
                return null;
            }
            return interfaceC39206Fa6.check(ohw, null);
        }

        public final <T> T checkCertAndCall(Cert cert, String[] strArr, String sdkName, String methodName, String domain, InterfaceC88472Yns<? super C66300Q0i, ? extends T> block) {
            o.LJIIJ(sdkName, "sdkName");
            o.LJIIJ(methodName, "methodName");
            o.LJIIJ(domain, "domain");
            o.LJIIJ(block, "block");
            OHW ohw = new OHW(cert, C00F.LIZIZ(sdkName, '_', methodName), strArr, Integer.valueOf(EnumC39200Fa0.DIRECT_AUTH.getType()), domain);
            ohw.LIZ.put("sdkName", sdkName);
            ohw.LIZ.put("methodName", methodName);
            InterfaceC39218FaI interfaceC39218FaI = CertAuthEntry.certAuthContextInterceptor;
            if (interfaceC39218FaI != null) {
                interfaceC39218FaI.LIZ(sdkName, methodName, domain, ohw);
            }
            return (T) C39207Fa7.LIZ(ohw, block);
        }
    }
}
