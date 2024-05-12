package X;

import Y.ARunnableS17S0110000_11;
import Y.ARunnableS30S0200000_11;
import android.app.Application;
import android.os.Build;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.common.utility.Logger;
import com.bytedance.push.settings.AliveOnlineSettings;
import com.bytedance.push.third.PushManager;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public final class QRQ {
    public QRR LIZ;
    public final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public final AtomicBoolean LIZJ = new AtomicBoolean(false);

    public final void LIZ(QRR qrr) {
        int i;
        if (this.LIZIZ.getAndSet(true)) {
            return;
        }
        this.LIZ = qrr;
        if (qrr.LJFF) {
            i = 3;
        } else {
            i = 4;
        }
        QSB.LIZ = i;
        TextUtils.isEmpty(qrr.LJIILIIL);
        QM0.LIZ(this.LIZ.LIZ);
        QRR qrr2 = this.LIZ;
        C66970QQc c66970QQc = new C66970QQc(qrr2);
        QRM qrm = QRM.LJIIIIZZ;
        qrm.LIZIZ = qrr;
        qrm.LIZJ = c66970QQc;
        C60016Ngy c60016Ngy = new C60016Ngy(qrr2);
        QPG.LIZIZ(QP9.class, new C66969QQb(qrr));
        QPG.LIZIZ(QQS.class, new QRL(qrr, c60016Ngy, c66970QQc));
        QRS.LJI().LIZ = qrr.LJIIJ;
        QRS.LJI().LIZLLL(this.LIZ.LIZ, c60016Ngy);
        if (TextUtils.equals(qrr.LJII, this.LIZ.LIZ.getPackageName())) {
            if (qrr.LJIJI) {
                AliveOnlineSettings aliveOnlineSettings = (AliveOnlineSettings) PT6.LIZ(qrr.LIZ, AliveOnlineSettings.class);
                aliveOnlineSettings.LJJI();
                aliveOnlineSettings.LJIILLIIL();
                aliveOnlineSettings.LJIL();
                aliveOnlineSettings.LJIIIZ();
            }
        } else if (qrr.LJII.endsWith(":pushservice")) {
            qrm.LJ().getClass();
            QRT.LIZJ(this.LIZ.LIZ).LIZ();
        } else if (qrr.LJII.endsWith(":push")) {
            QRT.LIZJ(this.LIZ.LIZ).LIZ();
        }
        QRM.LJFF().init();
    }

    public final void LIZIZ(java.util.Map map) {
        Application application = this.LIZ.LIZ;
        if (!C36929EeT.LJFF(application)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ssidsMap = [");
        LIZ.append(map);
        LIZ.append("] forceUpdate = ");
        LIZ.append(false);
        X1D.LIZIZ(LIZ);
        if (map != null && !map.isEmpty()) {
            String str = (String) map.get("clientudid");
            String str2 = (String) map.get("device_id");
            String str3 = (String) map.get("install_id");
            if (!C38354F3m.LJ(str) && !C38354F3m.LJ(str2) && !C38354F3m.LJ(str3)) {
                QRG.LIZIZ().getClass();
                QQO LIZ2 = QQO.LIZ();
                LIZ2.getClass();
                Logger.debug();
                try {
                    String LJFF = C38354F3m.LJFF(map);
                    C66873QMj LIZIZ = LIZ2.LIZ.LIZIZ();
                    LIZIZ.LIZIZ.put("ssids", LJFF);
                    LIZIZ.LIZ();
                } catch (Exception unused) {
                }
                QRM qrm = QRM.LJIIIIZZ;
                if (this.LIZJ.compareAndSet(false, true)) {
                    QS5 LIZIZ2 = QRT.LIZJ(this.LIZ.LIZ).LIZIZ();
                    if (LIZIZ2 != null) {
                        LIZIZ2.LIZJ();
                    }
                    if (QSB.LIZ()) {
                        if (!PushManager.inst().checkThirdPushConfig("BDPush", this.LIZ.LIZ)) {
                            throw new IllegalArgumentException("configuration error，please filter \"BDPush\" in logcat to correct the error");
                        }
                    }
                    QP5 LIZ3 = QP5.LIZ();
                    ARunnableS30S0200000_11 aRunnableS30S0200000_11 = new ARunnableS30S0200000_11(this, application, 51);
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    LIZ3.LIZIZ(timeUnit.toMillis(15L), aRunnableS30S0200000_11);
                    QRO LIZJ = qrm.LIZJ();
                    QS6 qs6 = this.LIZ.LJIIIZ;
                    LIZJ.getClass();
                    if (application != null && Build.VERSION.SDK_INT >= 26) {
                        RunnableC39007FSp.LIZIZ(new QS7(qs6, application));
                    }
                    QP5.LIZ().LIZIZ(timeUnit.toMillis(15L), new ARunnableS30S0200000_11(application, qrm, 50));
                    InterfaceC66999QRf interfaceC66999QRf = this.LIZ.LJIJJ;
                    QS1 qs1 = new QS1(qrm, interfaceC66999QRf);
                    interfaceC66999QRf.LIZLLL(new QS3(qs1));
                    interfaceC66999QRf.LIZJ(new QS4(qs1));
                    interfaceC66999QRf.LIZ(new QS2(qs1));
                }
                qrm.LIZIZ().LJIILLIIL();
                QRP LJ = qrm.LJ();
                LJ.getClass();
                if (C16880lQ.LLJJJJ() == Looper.myLooper()) {
                    RunnableC39007FSp.LIZIZ(new ARunnableS17S0110000_11(LJ, 5));
                } else {
                    LJ.LIZIZ.LIZJ(false);
                }
                QRS.LJI().LIZIZ(application, map);
            }
        }
    }
}
