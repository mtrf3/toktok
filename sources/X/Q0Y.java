package X;

import com.bytedance.bpea.basics.Cert;
import com.bytedance.pumbaa.common.interfaces.ILogger;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class Q0Y implements InterfaceC66315Q0x {
    @Override // X.InterfaceC66315Q0x
    public void onEvent(C66297Q0f event) {
        Object LIZ;
        String str;
        String str2;
        Cert cert;
        o.LJIIIZ(event, "event");
        try {
            if (o.LJ(event.LIZIZ, "MainCheck")) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("bpea_end_check_cert|");
                OHW ohw = event.LIZ;
                if (ohw != null && (cert = ohw.LIZIZ) != null) {
                    str = cert.certToken();
                } else {
                    str = null;
                }
                LIZ2.append(str);
                LIZ2.append('|');
                OHW ohw2 = event.LIZ;
                if (ohw2 != null) {
                    str2 = ohw2.LIZJ;
                } else {
                    str2 = null;
                }
                LIZ2.append(str2);
                LIZ2.append("|timeAnchor:");
                LIZ2.append(event.LJ);
                String message = X1D.LIZIZ(LIZ2);
                o.LJIIIZ(message, "message");
                ILogger iLogger = Q0N.LIZ;
                if (iLogger != null) {
                    iLogger.d("BPEA", message, null);
                }
                if (event.LJFF == EnumC66303Q0l.WARN) {
                    Q0T.LIZIZ(event);
                }
            } else {
                EnumC66303Q0l enumC66303Q0l = event.LJFF;
                if (enumC66303Q0l == EnumC66303Q0l.WARN || enumC66303Q0l == EnumC66303Q0l.ERROR) {
                    Q0T.LIZIZ(event);
                }
            }
            Q0T.LIZ(event);
            LIZ = C76800UCe.LIZ;
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        C3C5.m10exceptionOrNullimpl(LIZ);
    }
}
