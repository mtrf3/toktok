package X;

import android.content.Context;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sdk.account.idv.model.IDVDecisionConf;
import com.google.gson.Gson;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QXZ implements InterfaceC64764PbM {
    public final /* synthetic */ Context LIZ;

    public QXZ(Context context) {
        this.LIZ = context;
    }

    @Override // X.InterfaceC64764PbM
    public final C64687Pa7 LIZ(java.util.Map<String, List<String>> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        AtomicBoolean atomicBoolean2 = new AtomicBoolean(false);
        CountDownLatch countDownLatch = new CountDownLatch(1);
        List list = (List) ((TreeMap) map).get("x-tt-verify-idv-decision-conf");
        if (list != null) {
            QWO qwo = QWO.LIZLLL;
            Semaphore semaphore = QWO.LIZJ;
            if (semaphore.tryAcquire()) {
                qwo.getClass();
                IDVDecisionConf decisionConf = (IDVDecisionConf) GsonProtectorUtils.fromJson((Gson) QWO.LIZIZ.getValue(), (String) ListProtector.get(list, 0), IDVDecisionConf.class);
                C67150QXa c67150QXa = new C67150QXa(decisionConf, countDownLatch, atomicBoolean, atomicBoolean2, linkedHashMap);
                Context context = this.LIZ;
                o.LJFF(decisionConf, "decisionConf");
                C67152QXc c67152QXc = new C67152QXc(context, c67150QXa, decisionConf);
                C72818Shy.LIZLLL("idv_result_event", c67152QXc);
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("idv_extra:");
                LIZ.append(c67152QXc.LJLJJI.passportTicket);
                C72264SXs.LIZ(c67152QXc.LJLILLLLZI).LJIIIIZZ(c67152QXc.LJLJJI.extra, X1D.LIZIZ(LIZ));
                SparkContext sparkContext = new SparkContext();
                sparkContext.LJJIJLIJ(c67152QXc.LJLJJI.url);
                sparkContext.LJJI(new C67151QXb(c67152QXc));
                OKG.LIZLLL(C40343FsR.LJIILJJIL, c67152QXc.LJLILLLLZI, sparkContext);
                c67152QXc.LJLIL = sparkContext;
                try {
                    try {
                        countDownLatch.await();
                        semaphore.release();
                    } catch (InterruptedException e) {
                        C16880lQ.LLLLIIL(e);
                        QWO.LIZJ.release();
                    }
                } catch (Throwable th) {
                    QWO.LIZJ.release();
                    throw th;
                }
            }
        }
        return new C64687Pa7(linkedHashMap, atomicBoolean.get(), !atomicBoolean2.get());
    }
}
