package X;

import com.byted.cast.common.api.ICastSink;
import com.byted.cast.common.auth.IAuthListener;
import com.byted.cast.common.config.IInitListener;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.Zl7, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90849Zl7 implements IAuthListener {
    public final /* synthetic */ IInitListener LIZ;
    public final /* synthetic */ C90547ZgF LIZIZ;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x008e, code lost:
    
        if (r3.size() == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        if (r3.contains(r1) != false) goto L38;
     */
    @Override // com.byted.cast.common.auth.IAuthListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSuccess() {
        /*
            r5 = this;
            X.ZgF r1 = r5.LIZIZ
            r0 = 1
            r1.LJJIJIIJI = r0
            com.byted.cast.common.auth.license.AuthWrapper r1 = r1.LJIILJJIL
            java.lang.String r0 = "protocols_link"
            com.byted.cast.common.auth.AuthService r0 = r1.getService(r0)
            java.lang.String r2 = "sink"
            java.util.List r4 = com.byted.cast.common.auth.AuthUtils.getProtocols(r0, r2)
            X.ZgF r0 = r5.LIZIZ
            com.byted.cast.common.auth.license.AuthWrapper r1 = r0.LJIILJJIL
            java.lang.String r0 = "protocols_mirror"
            com.byted.cast.common.auth.AuthService r0 = r1.getService(r0)
            java.util.List r3 = com.byted.cast.common.auth.AuthUtils.getProtocols(r0, r2)
            boolean r0 = com.byted.cast.common.PreferenceUtils.isByteUserToB()
            if (r0 == 0) goto L9a
            X.ZgF r2 = r5.LIZIZ
            r2.getClass()
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "filterByLicenseProtocols: protocols: "
            r1.append(r0)
            java.util.List<java.lang.String> r0 = r2.LJIILL
            r1.append(r0)
            java.lang.String r0 = ", licenseLinks: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", licenseMirrors: "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            java.lang.String r0 = "ByteCastSinkImpl"
            com.byted.cast.common.Logger.i(r0, r1)
            java.util.List<java.lang.String> r0 = r2.LJIILL
            if (r0 == 0) goto L9a
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 <= 0) goto L9a
            java.util.List<java.lang.String> r0 = r2.LJIILL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.util.Iterator r2 = r0.iterator()
        L67:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7a
            goto L67
        L7a:
            if (r4 == 0) goto L88
            int r0 = r4.size()
            if (r0 == 0) goto L88
            boolean r0 = r4.contains(r1)
            if (r0 != 0) goto L67
        L88:
            if (r3 == 0) goto L96
            int r0 = r3.size()
            if (r0 == 0) goto L96
            boolean r0 = r3.contains(r1)
            if (r0 != 0) goto L67
        L96:
            r2.remove()
            goto L67
        L9a:
            X.ZgF r0 = r5.LIZIZ
            r0.LJI()
            X.ZgF r0 = r5.LIZIZ
            X.ZgH r2 = r0.LJIIL
            Y.IDRunnableS86S0100000_24 r1 = new Y.IDRunnableS86S0100000_24
            r0 = 41
            r1.<init>(r5, r0)
            r2.execute(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90849Zl7.onSuccess():void");
    }

    public C90849Zl7(C90547ZgF c90547ZgF, IInitListener iInitListener) {
        this.LIZIZ = c90547ZgF;
        this.LIZ = iInitListener;
    }

    @Override // com.byted.cast.common.auth.IAuthListener
    public final void onFailed(int i, String str, Exception exc) {
        C90547ZgF c90547ZgF = this.LIZIZ;
        c90547ZgF.LJJIJIIJI = false;
        if (i == 10016) {
            List<String> list = c90547ZgF.LJIILL;
            if (list != null) {
                ((ArrayList) list).clear();
            }
            java.util.Map<String, ICastSink> map = c90547ZgF.LJIIIIZZ;
            if (map != null) {
                ((ConcurrentHashMap) map).clear();
            }
        }
        IInitListener iInitListener = this.LIZ;
        if (iInitListener != null) {
            iInitListener.onFail(i, str, exc);
        }
    }
}
