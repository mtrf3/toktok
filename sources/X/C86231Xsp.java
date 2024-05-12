package X;

import android.app.Activity;
import kotlin.jvm.internal.o;

/* renamed from: X.Xsp, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86231Xsp implements InterfaceC61118Nyk {
    public final /* synthetic */ C86225Xsj LIZ;
    public final /* synthetic */ Activity LIZIZ;

    public C86231Xsp(C86225Xsj c86225Xsj, Activity activity) {
        this.LIZ = c86225Xsj;
        this.LIZIZ = activity;
    }

    /* JADX WARN: Failed to extract var names
    java.lang.NullPointerException
     */
    @Override // X.InterfaceC61118Nyk
    public final void LIZ(int[] grantResults, String[] strArr) {
        boolean z;
        o.LJIIIIZZ(strArr, OHQ.LIZIZ);
        if (strArr.length != 0) {
            o.LJIIIIZZ(grantResults, "grantResults");
            for (int i : grantResults) {
                if (i == 0) {
                }
            }
            C86225Xsj c86225Xsj = this.LIZ;
            Activity activity = this.LIZIZ;
            AsyncTaskC86227Xsl asyncTaskC86227Xsl = c86225Xsj.LJII;
            if (asyncTaskC86227Xsl != null) {
                asyncTaskC86227Xsl.cancel(false);
            }
            AsyncTaskC86227Xsl asyncTaskC86227Xsl2 = new AsyncTaskC86227Xsl(activity, c86225Xsj, c86225Xsj.LJIIJ);
            asyncTaskC86227Xsl2.executeOnExecutor(c86225Xsj.LIZJ, new C76800UCe[0]);
            c86225Xsj.LJII = asyncTaskC86227Xsl2;
            return;
        }
        if (strArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((!z) && grantResults[0] == -1) {
            this.LIZ.LIZIZ.LIZ(-6, "Camera permission denied");
        } else {
            if (strArr.length == 0 || grantResults.length != 2 || grantResults[1] != -1) {
                return;
            }
            this.LIZ.LIZIZ.LIZ(-6, "Storage permission denied");
        }
    }
}
