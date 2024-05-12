package X;

import Y.ARunnableS30S0200000_11;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import kotlin.jvm.internal.AqS161S0100000_11;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QVC implements QW8 {
    public static final /* synthetic */ InterfaceC74236TBo[] LJFF;
    public final String LIZ;
    public final C62822Ol8 LIZIZ;
    public final C62822Ol8 LIZJ;
    public final C62822Ol8 LIZLLL;
    public final Context LJ;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(QVC.class), "mMsgProcessors", "getMMsgProcessors()Ljava/util/List;");
        C65352Pkq.LIZ.getClass();
        LJFF = new InterfaceC74236TBo[]{tbt, new TBT(C65352Pkq.LIZ(QVC.class), "mCtrlMsgProcessors", "getMCtrlMsgProcessors()Ljava/util/List;"), new TBT(C65352Pkq.LIZ(QVC.class), "mHandler", "getMHandler()Landroid/os/Handler;")};
    }

    public QVC(Context context) {
        o.LJIIJ(context, "context");
        this.LJ = context;
        this.LIZ = "[ProtocolProcessor] ";
        this.LIZIZ = C221108m2.LIZIZ(new AqS161S0100000_11(this, 80));
        this.LIZJ = C221108m2.LIZIZ(QVE.LJLIL);
        this.LIZLLL = C221108m2.LIZIZ(QUS.LJLIL);
    }

    @Override // X.QW8
    public final void LIZ(C67101QVd c67101QVd) {
        ARunnableS30S0200000_11 aRunnableS30S0200000_11 = new ARunnableS30S0200000_11(c67101QVd, this, 49);
        if (o.LJ(Looper.myLooper(), ((Handler) this.LIZLLL.getValue()).getLooper())) {
            aRunnableS30S0200000_11.run();
        } else {
            ((Handler) this.LIZLLL.getValue()).post(aRunnableS30S0200000_11);
        }
    }

    public final void LIZIZ(QVX qvx, C67098QVa c67098QVa, List<QVZ> list) {
        for (QVG qvg : (List) this.LIZIZ.getValue()) {
            if (qvg.LIZIZ(qvx)) {
                qvg.LIZ(c67098QVa, list);
                return;
            }
        }
    }
}
