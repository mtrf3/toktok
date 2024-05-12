package X;

import android.content.Context;
import android.os.Handler;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;

/* loaded from: classes12.dex */
public final class QMN implements QML {
    public final Handler LIZ;
    public final Context LIZIZ;
    public QMM LIZJ;
    public boolean LIZLLL;
    public QMO LJ;

    @Override // X.QML
    public final void B6() {
        try {
            boolean LIZJ = C66455Q6h.LIZIZ(this.LIZIZ).LIZJ();
            Logger.debug();
            if (LIZJ != this.LIZLLL) {
                this.LIZLLL = LIZJ;
            }
        } catch (Throwable unused) {
        }
        this.LJ = new QMO(this, this.LIZ);
        try {
            this.LIZIZ.getContentResolver().registerContentObserver(WsChannelMultiProcessSharedProvider.LIZ(this.LIZIZ, "frontier_enabled", "boolean"), true, this.LJ);
        } catch (Throwable unused2) {
        }
    }

    @Override // X.QML
    public final boolean isEnable() {
        return this.LIZLLL;
    }

    @Override // X.QML
    public final void LIZ(QMM qmm) {
        this.LIZJ = qmm;
    }

    public QMN(Context context, WeakHandler weakHandler) {
        this.LIZ = weakHandler;
        this.LIZIZ = context;
    }
}
