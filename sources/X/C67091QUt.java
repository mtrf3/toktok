package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sync.settings.SettingsV2;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* renamed from: X.QUt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67091QUt {
    public final AtomicBoolean LIZ;
    public final QD0 LIZIZ;
    public final Context LIZJ;

    public C67091QUt(Context context) {
        o.LJIIJ(context, "context");
        this.LIZJ = context;
        this.LIZ = new AtomicBoolean(true);
        this.LIZIZ = new QD0();
    }

    public final void LIZ(QW9 qw9, QUJ quj, QV9 qv9) {
        List<QV5> LJIIJJI;
        if (qv9 != null) {
            InterfaceC67090QUs interfaceC67090QUs = (InterfaceC67090QUs) QPG.LIZ(InterfaceC67090QUs.class);
            InterfaceC67090QUs interfaceC67090QUs2 = (InterfaceC67090QUs) QPG.LIZ(InterfaceC67090QUs.class);
            boolean z = false;
            try {
                if (qw9 == QW9.Device) {
                    String str = quj.LIZ;
                    o.LJFF(str, "deviceInfo.did");
                    LJIIJJI = interfaceC67090QUs2.LJJIJ(qw9, str);
                } else {
                    String uid = quj.LIZIZ;
                    String str2 = quj.LIZ;
                    o.LJFF(str2, "deviceInfo.did");
                    o.LJFF(uid, "uid");
                    LJIIJJI = interfaceC67090QUs2.LJIIJJI(qw9, str2, uid);
                }
            } catch (Exception e) {
                QUU.LIZJ().ensureNotReachHere(e, "execute sql failed when queryUploadMsgByDeviceInfo");
                C16880lQ.LLLLIIL(e);
            }
            if (LJIIJJI != null && !LJIIJJI.isEmpty()) {
                for (QV5 qv5 : LJIIJJI) {
                    qv5.LIZIZ = qv9.LIZ;
                    long j = qv9.LJI + 1;
                    qv9.LJI = j;
                    qv5.LJI = j;
                    qv5.LJFF = qv9.LJ;
                }
                if (interfaceC67090QUs2.LJIJJLI(LJIIJJI, qv9)) {
                    C66629QCz.LIZ("save distributed payload to db success");
                }
                C66629QCz.LIZIZ("save distributed payload to db failed");
                return;
            }
            try {
                String str3 = qv9.LIZ;
                o.LJFF(str3, "syncCursor.syncId");
                List LJJJJZ = interfaceC67090QUs.LJJJJZ(str3);
                if (LJJJJZ == null || LJJJJZ.isEmpty()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("local db is empty, not upload ");
                    LIZ.append(qw9);
                    C66629QCz.LIZJ(X1D.LIZIZ(LIZ));
                    return;
                }
                String str4 = qv9.LIZ;
                o.LJFF(str4, "syncCursor.syncId");
                ArrayList arrayList = new ArrayList();
                QUW LIZJ = QUW.LIZJ(this.LIZJ);
                o.LJFF(LIZJ, "SyncSettings.inst(context)");
                SettingsV2 settings = LIZJ.LIZIZ();
                int i = 0;
                while (true) {
                    if (!(!LJJJJZ.isEmpty())) {
                        break;
                    }
                    int length = ((QV5) ListProtector.get(LJJJJZ, 0)).LJII.length + i;
                    o.LJFF(settings, "settings");
                    if (length <= settings.reportSizeLimit) {
                        QV5 qv52 = (QV5) ListProtector.remove(LJJJJZ, 0);
                        arrayList.add(qv52);
                        i += qv52.LJII.length;
                    } else if (arrayList.isEmpty()) {
                        arrayList.add(ListProtector.remove(LJJJJZ, 0));
                        z = true;
                    }
                }
                if (!arrayList.isEmpty()) {
                    ((InterfaceC67096QUy) QPG.LIZ(InterfaceC67096QUy.class)).LJJIIJ(str4, arrayList, z);
                } else {
                    C66629QCz.LIZIZ("dataList is empty when send payload,maybe the first size too large or original data is empty");
                }
            } catch (Exception e2) {
                QUU.LIZJ().ensureNotReachHere(e2, "execute sql failed when queryDistributeMsgs");
                C16880lQ.LLLLIIL(e2);
            }
        }
    }
}
