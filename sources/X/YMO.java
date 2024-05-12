package X;

import android.os.Message;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YMO implements YMF {
    public final /* synthetic */ YMJ LIZ;
    public final /* synthetic */ YMI LIZIZ;

    @Override // X.YMF
    public final void LIZ(XM9<YME, ? extends Exception> result) {
        Message obtainMessage;
        o.LJIIIZ(result, "result");
        YMJ ymj = this.LIZ;
        ymj.LJI = result;
        VLD vld = this.LIZIZ.LJII;
        if (vld != null && (obtainMessage = vld.obtainMessage(YMI.LJIIL, ymj)) != null) {
            obtainMessage.sendToTarget();
        }
    }

    public YMO(YMJ ymj, YMI ymi) {
        this.LIZ = ymj;
        this.LIZIZ = ymi;
    }
}
