package X;

import com.ss.ttvideoengine.TTVideoEngineImpl;
import java.lang.ref.WeakReference;

/* renamed from: X.Ilz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47587Ilz {
    public final WeakReference<TTVideoEngineImpl> LIZ;

    public C47587Ilz(TTVideoEngineImpl tTVideoEngineImpl) {
        this.LIZ = new WeakReference<>(tTVideoEngineImpl);
    }

    public final void LIZ(C47789IpF c47789IpF, String str) {
        TTVideoEngineImpl tTVideoEngineImpl = this.LIZ.get();
        if (tTVideoEngineImpl == null) {
            return;
        }
        C36071bH c36071bH = tTVideoEngineImpl.LLZLL;
        if (c36071bH != null && tTVideoEngineImpl.t5 > 0) {
            c36071bH.LJIILJJIL(c47789IpF, str);
        } else {
            C78253UnR.LIZLLL("TTVideoEngine", "mSubInfoListener is null");
        }
        if (str == null || c47789IpF != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("sub fetch info failed:");
            LIZ.append(c47789IpF.toString());
            C78253UnR.LIZLLL("TTVideoEngine", X1D.LIZIZ(LIZ));
            C47750Ioc c47750Ioc = tTVideoEngineImpl.e;
            if (c47750Ioc != null) {
                c47750Ioc.LLIIIZ = c47789IpF.toString();
                c47750Ioc.LLIIJI = C47750Ioc.LJIIZILJ(1, c47789IpF.LIZ);
                return;
            }
            return;
        }
        if (tTVideoEngineImpl.LJ != null && tTVideoEngineImpl.e != null) {
            tTVideoEngineImpl.LLFFF(str);
        }
    }
}
