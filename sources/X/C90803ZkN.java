package X;

import Y.IDRunnableS86S0100000_24;
import android.text.TextUtils;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.PreferenceUtils;
import com.byted.cast.common.api.ICastSource;
import com.byted.cast.common.auth.AuthUtils;
import com.byted.cast.common.auth.IAuthListener;
import com.byted.cast.common.config.IInitListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.ZkN, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90803ZkN implements IAuthListener {
    public final /* synthetic */ IInitListener LIZ;
    public final /* synthetic */ C90801ZkL LIZIZ;

    @Override // com.byted.cast.common.auth.IAuthListener
    public final void onSuccess() {
        C90801ZkL c90801ZkL = this.LIZIZ;
        c90801ZkL.LJJ = true;
        List<String> protocols = AuthUtils.getProtocols(c90801ZkL.LJIJJLI.getService("protocols_link"), "source");
        List<String> protocols2 = AuthUtils.getProtocols(this.LIZIZ.LJIJJLI.getService("protocols_mirror"), "source");
        if (PreferenceUtils.isByteUserToB()) {
            C90801ZkL c90801ZkL2 = this.LIZIZ;
            CastLogger castLogger = c90801ZkL2.LIZIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("filterByLicenseProtocols: linkProtocols: ");
            LIZ.append(c90801ZkL2.LJIIZILJ);
            LIZ.append(", mirrorProtocols: ");
            LIZ.append(c90801ZkL2.LJIJ);
            LIZ.append(", licenseLinks: ");
            LIZ.append(protocols);
            LIZ.append(", licenseMirrors: ");
            LIZ.append(protocols2);
            castLogger.i("ByteCastSourceImpl", X1D.LIZIZ(LIZ));
            List<String> list = c90801ZkL2.LJIIZILJ;
            if (list != null && ((ArrayList) list).size() > 0) {
                Iterator it = ((ArrayList) c90801ZkL2.LJIIZILJ).iterator();
                while (it.hasNext()) {
                    String str = (String) it.next();
                    if (!TextUtils.isEmpty(str) && (protocols == null || protocols.size() == 0 || !protocols.contains(str))) {
                        it.remove();
                    }
                }
            }
            List<String> list2 = c90801ZkL2.LJIJ;
            if (list2 != null && ((ArrayList) list2).size() > 0) {
                Iterator it2 = ((ArrayList) c90801ZkL2.LJIJ).iterator();
                while (it2.hasNext()) {
                    String str2 = (String) it2.next();
                    if (!TextUtils.isEmpty(str2) && (protocols2 == null || protocols2.size() == 0 || !protocols2.contains(str2))) {
                        it2.remove();
                    }
                }
            }
        }
        this.LIZIZ.LIZJ();
        this.LIZIZ.LJIJJ.execute(new IDRunnableS86S0100000_24(this, 19));
    }

    public C90803ZkN(C90801ZkL c90801ZkL, IInitListener iInitListener) {
        this.LIZIZ = c90801ZkL;
        this.LIZ = iInitListener;
    }

    @Override // com.byted.cast.common.auth.IAuthListener
    public final void onFailed(int i, String str, Exception exc) {
        C90801ZkL c90801ZkL = this.LIZIZ;
        c90801ZkL.LJJ = false;
        if (i == 10016) {
            List<String> list = c90801ZkL.LJIIZILJ;
            if (list != null) {
                ((ArrayList) list).clear();
            }
            List<String> list2 = c90801ZkL.LJIJ;
            if (list2 != null) {
                ((ArrayList) list2).clear();
            }
            java.util.Map<String, ICastSource> map = c90801ZkL.LJIILL;
            if (map != null) {
                map.clear();
            }
            java.util.Map<String, ICastSource> map2 = c90801ZkL.LJIILLIIL;
            if (map2 != null) {
                map2.clear();
            }
            c90801ZkL.LJ();
        }
        IInitListener iInitListener = this.LIZ;
        if (iInitListener != null) {
            iInitListener.onFail(i, str, exc);
        }
    }
}
