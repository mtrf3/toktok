package X;

import android.os.SystemClock;
import com.bytedance.geckox.model.UpdatePackage;

/* loaded from: classes11.dex */
public final class ODP {
    public static boolean LIZ;

    public static void LIZ() {
        if (LIZ) {
            return;
        }
        LIZ = true;
        C61541ODh.LIZIZ(ODA.class, new ODX());
        C61541ODh.LIZIZ(C61545ODl.class, new OEH());
        C61541ODh.LIZIZ(ODD.class, new OE2());
        C61541ODh.LIZIZ(ODB.class, new ODT());
        C61541ODh.LIZIZ(OD9.class, new C61557ODx());
        C61541ODh.LIZIZ(ODF.class, new C61552ODs());
        C61541ODh.LIZIZ(OD8.class, new C61553ODt());
    }

    public static <T> ODS LIZIZ(InterfaceC61556ODw<T> interfaceC61556ODw, boolean z) {
        UpdatePackage updatePackage = (UpdatePackage) interfaceC61556ODw.LIZIZ(C61545ODl.class);
        ODS statisticModel = updatePackage.getStatisticModel();
        if (statisticModel == null) {
            statisticModel = new ODS();
            statisticModel.LIZIZ = ((Integer) interfaceC61556ODw.LIZJ("req_type")).intValue();
            statisticModel.LIZJ = ((Integer) interfaceC61556ODw.LIZJ("sync_task_id")).intValue();
            statisticModel.LIZ = ((Integer) interfaceC61556ODw.LIZJ("update_priority")).intValue();
            statisticModel.LJIILL = SystemClock.uptimeMillis();
            updatePackage.setStatisticModel(statisticModel);
            if (!z) {
                statisticModel.LJ = true;
                OC6.LIZLLL("gecko-debug-tag", "UpdateListeners.getStatisticModel create by error");
            }
        }
        return statisticModel;
    }

    public static void LIZJ(C61546ODm c61546ODm, int i, Throwable th) {
        UpdatePackage updatePackage = (UpdatePackage) c61546ODm.LIZIZ(C61545ODl.class);
        ODS LIZIZ = LIZIZ(c61546ODm, false);
        LIZIZ.LJII = 0L;
        LIZIZ.LJIIIZ = 0L;
        LIZIZ.LJIIJ = 0L;
        LIZIZ.LJIIJJI = 0L;
        LIZIZ.LJIIL = 0L;
        LIZIZ.LJIILIIL = 0L;
        OE3 LIZIZ2 = LIZIZ.LIZIZ(updatePackage, false);
        LIZIZ2.LIZIZ = false;
        LIZIZ2.LIZJ = i;
        LIZIZ2.LIZLLL = th.getMessage();
        if (updatePackage.isLastStep()) {
            LIZIZ.LIZLLL = false;
            LIZIZ.LJFF = SystemClock.uptimeMillis() - LIZIZ.LJIILL;
            OD6.LJIIL(updatePackage);
        }
    }
}
