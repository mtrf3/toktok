package X;

import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.json.JSONObject;

/* renamed from: X.IpW, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47806IpW implements InterfaceC47844Iq8 {
    public final WeakReference<C47805IpV> LIZ;

    public C47806IpW(C47805IpV c47805IpV) {
        this.LIZ = new WeakReference<>(c47805IpV);
    }

    @Override // X.InterfaceC47844Iq8
    public final void LIZ(C47789IpF c47789IpF) {
        C47805IpV c47805IpV = this.LIZ.get();
        if (c47805IpV == null || c47805IpV.LIZ() == null) {
            return;
        }
        c47805IpV.LIZ().LIZ(c47789IpF);
    }

    @Override // X.InterfaceC47844Iq8
    public final void LIZIZ(String str) {
        C47805IpV c47805IpV = this.LIZ.get();
        if (c47805IpV == null || c47805IpV.LIZ() == null) {
            return;
        }
        c47805IpV.LIZ().LIZIZ(str);
    }

    @Override // X.InterfaceC47844Iq8
    public final void LIZJ(C47164IfA c47164IfA, C47789IpF c47789IpF) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onCompletion model ");
        LIZ.append(c47164IfA);
        LIZ.append(", error ");
        LIZ.append(c47789IpF);
        C78253UnR.LJI("MDLFetcherNew", X1D.LIZIZ(LIZ));
        C47805IpV c47805IpV = this.LIZ.get();
        if (c47805IpV == null) {
            C78253UnR.LJI("MDLFetcherNew", "onCompletion but fetcher is null");
            return;
        }
        if (c47789IpF != null) {
            c47805IpV.LIZLLL(c47789IpF, true);
            return;
        }
        if (c47164IfA == null) {
            c47805IpV.LIZLLL(new C47789IpF("kTTVideoErrorDomainMDLRetry", -9997, 0, "fetch empty"), true);
            return;
        }
        c47805IpV.LIZLLL = C47805IpV.LIZIZ(c47805IpV.LIZJ, c47164IfA);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("onCompletion newUrls ");
        JBR.LJIIIZ(LIZ2, Arrays.toString(c47805IpV.LIZLLL), LIZ2, "MDLFetcherNew");
        String[] strArr = c47805IpV.LIZLLL;
        if (strArr == null || strArr.length == 0) {
            c47805IpV.LIZLLL(new C47789IpF("kTTVideoErrorDomainMDLRetry", -10003, 0, "file hash invalid"), true);
            JSONObject LJIILL = c47164IfA.LJIILL();
            if (LJIILL != null) {
                C78253UnR.LJI("MDLFetcherNew", C16880lQ.LLLZ("new video model: %s", new Object[]{LJIILL.toString()}));
                return;
            }
            return;
        }
        if (C47805IpV.LIZJ(c47805IpV.LJI, strArr)) {
            c47805IpV.LJFF.onCompletion(0, c47805IpV.LIZIZ, c47805IpV.LIZJ, c47805IpV.LIZLLL);
            InterfaceC47822Ipm LIZ3 = c47805IpV.LIZ();
            if (LIZ3 != null) {
                LIZ3.LIZLLL(c47164IfA, true, c47805IpV.LIZJ);
            }
            c47805IpV.close();
            return;
        }
        c47805IpV.LIZLLL(new C47789IpF("kTTVideoErrorDomainMDLRetry", -10004, 0, "fetch videoModel is expired"), true);
    }

    @Override // X.InterfaceC47844Iq8
    public final void LIZLLL(int i, String str) {
        C47805IpV c47805IpV = this.LIZ.get();
        if (c47805IpV == null) {
            C78253UnR.LJI("MDLFetcherNew", "onStatusException but fetcher is null");
        } else {
            c47805IpV.LIZLLL(new C47789IpF("kTTVideoErrorDomainMDLRetry", -10005, i, str), true);
        }
    }
}
