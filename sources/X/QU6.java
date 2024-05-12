package X;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QU6 implements InterfaceC67067QTv, QUH {
    public final Context LIZ;
    public final QUA LIZIZ;
    public final QVC LIZJ;
    public final QMV LIZLLL;
    public final C67087QUp LJ;
    public final J8W LJFF;
    public QU0 LJI;
    public final AtomicBoolean LJII = new AtomicBoolean(false);
    public final QU2 LJIIIIZZ = new QU2();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.QSk] */
    public final InterfaceC67030QSk LIZ(C67032QSm c67032QSm) {
        QUC quc;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("register business ");
        LIZ.append(c67032QSm.LIZ);
        C66629QCz.LIZ(X1D.LIZIZ(LIZ));
        QUA qua = this.LIZIZ;
        synchronized (qua) {
            QU8 qu8 = (QU8) ((ConcurrentHashMap) qua.LJLILLLLZI).get(Long.valueOf(c67032QSm.LIZ));
            if (qu8 != null) {
                qu8.LIZ(c67032QSm.LIZIZ);
                quc = ((QU8) ((ConcurrentHashMap) qua.LJLILLLLZI).get(Long.valueOf(c67032QSm.LIZ))).LIZIZ;
            } else {
                QUI qui = qua.LJLIL;
                Long valueOf = Long.valueOf(c67032QSm.LIZ);
                QUE que = (QUE) qui;
                que.getClass();
                QUC quc2 = new QUC(valueOf, que.LIZ.LIZIZ);
                QU8 qu82 = new QU8(c67032QSm, quc2, qua.LJLJI);
                qu82.LIZ(c67032QSm.LIZIZ);
                ((ConcurrentHashMap) qua.LJLILLLLZI).put(Long.valueOf(c67032QSm.LIZ), qu82);
                quc = quc2;
            }
        }
        return quc;
    }

    public QU6(Context context, C67040QSu c67040QSu) {
        this.LIZ = context;
        QUA qua = new QUA(this, new QUE(this));
        this.LIZIZ = qua;
        C67087QUp c67087QUp = new C67087QUp(c67040QSu, qua);
        this.LJ = c67087QUp;
        QMV qmv = new QMV(c67040QSu.LJ, c67040QSu.LJFF);
        this.LIZLLL = qmv;
        QVC qvc = new QVC(context);
        this.LIZJ = qvc;
        QUK quk = new QUK(context, c67040QSu.LIZLLL);
        QPG.LIZIZ(InterfaceC67059QTn.class, quk);
        QPG.LIZIZ(QU4.class, new QUB());
        QPG.LIZIZ(QUG.class, qmv);
        QPG.LIZIZ(InterfaceC67090QUs.class, new C68494QuQ(context));
        QPG.LIZIZ(InterfaceC67063QTr.class, new C67069QTx(c67040QSu));
        QPG.LIZIZ(QU3.class, new C67075QUd(context, c67040QSu, new QUD(this)));
        QPG.LIZIZ(QW4.class, new QVP(context, c67040QSu, qvc));
        QPA LIZ = QPG.LIZ(QW4.class);
        o.LJFF(LIZ, "UgBusFramework.getService(IMsgSender::class.java)");
        QPG.LIZIZ(InterfaceC67096QUy.class, new QVY((QW4) LIZ));
        QPG.LIZIZ(InterfaceC67044QSy.class, c67040QSu.LIZIZ);
        QPG.LIZIZ(InterfaceC67086QUo.class, new PV3(context));
        QPG.LIZIZ(QUT.class, new C67088QUq(context, c67087QUp));
        QPG.LIZIZ(InterfaceC67064QTs.class, new QUO(context, quk));
        QPG.LIZIZ(InterfaceC67097QUz.class, new QU9());
        QPG.LIZIZ(QVM.class, new QU7(c67040QSu));
        this.LJFF = new J8W();
    }
}
