package X;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.bytedance.push.PushBody;
import com.ss.android.ugc.awemepushapi.IPushApi;
import com.ss.android.ugc.awemepushlib.interaction.PushService;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class QRH {
    public static boolean LIZJ() {
        Cursor cursor;
        long LIZJ = C67257QaT.LIZJ(0);
        long currentTimeMillis = System.currentTimeMillis();
        QRI LIZLLL = QRI.LIZLLL(EF7.LIZIZ());
        synchronized (LIZLLL) {
            QRG.LIZIZ().getClass();
            if (QRG.LIZ()) {
                SQLiteDatabase LJ = LIZLLL.LJ();
                if (LJ != null) {
                    if (LJ.isOpen()) {
                        try {
                            cursor = LJ.query("message", QRI.LIZJ, "arrive_time >= ? AND arrive_time < ? AND has_been_shown = 1", new String[]{String.valueOf(LIZJ), String.valueOf(currentTimeMillis)}, null, null, null, null);
                            try {
                                r4 = cursor.getCount() >= 1;
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("[hasReceivedAndShownMsgDuringInterval]");
                                LIZ.append(r4);
                                LIZ.append(", has received and shown");
                                LIZ.append(cursor.getCount());
                                LIZ.append(" notifications duration[");
                                LIZ.append(LIZJ);
                                LIZ.append(", ");
                                LIZ.append(currentTimeMillis);
                                LIZ.append(")");
                                X1D.LIZIZ(LIZ);
                            } catch (Throwable unused) {
                            }
                        } catch (Throwable unused2) {
                            cursor = null;
                        }
                        QRI.LJFF(cursor);
                    }
                }
            }
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("has received msg during [");
        LIZ2.append(C67257QaT.LIZLLL(LIZJ));
        LIZ2.append(", ");
        LIZ2.append(C67257QaT.LIZLLL(currentTimeMillis));
        LIZ2.append("): ");
        LIZ2.append(r4);
        C47629Imf.LIZ("NotificationUtil", X1D.LIZIZ(LIZ2));
        return r4;
    }

    public static boolean LIZ(PushBody pushBody) {
        try {
            QRI LIZLLL = QRI.LIZLLL(EF7.LIZIZ());
            QRG.LIZIZ().getClass();
            LIZLLL.LIZJ(QRG.LIZLLL().LJJIII().LIZJ);
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("checkDuplicate() - delete expired msgs ERROR: ");
            LIZ.append(th.getMessage());
            LIZ.append('!');
            C47629Imf.LIZIZ("NotificationUtil", X1D.LIZIZ(LIZ));
        }
        QRG.LIZIZ().getClass();
        if (!QRG.LIZLLL().LJJIII().LIZ) {
            return false;
        }
        if (pushBody.expire_time > 0 && System.currentTimeMillis() / 1000 > pushBody.expire_time) {
            return true;
        }
        return QRI.LIZLLL(EF7.LIZIZ()).LIZIZ(pushBody.rid64);
    }

    public static boolean LIZIZ(PushBody pushBody) {
        InterfaceC66999QRf interfaceC66999QRf;
        boolean z;
        int i = (pushBody.id > 0L ? 1 : (pushBody.id == 0L ? 0 : -1));
        TextUtils.isEmpty(pushBody.open_url);
        TextUtils.isEmpty(pushBody.groupId);
        if (TextUtils.isEmpty(pushBody.targetSecUid) || (interfaceC66999QRf = QRM.LJIIIIZZ.LIZIZ.LJIJJ) == null) {
            return true;
        }
        if (pushBody.needFilterMsgByUid && !TextUtils.equals(interfaceC66999QRf.getSecUid(), pushBody.targetSecUid)) {
            z = true;
            IPushApi createIPushApibyMonsterPlugin = PushService.createIPushApibyMonsterPlugin(false);
            String LIZ = pushBody.LIZ();
            o.LJIIIIZZ(LIZ, "msg.originData");
            createIPushApibyMonsterPlugin.sendPushShowInterceptEvent(LIZ, 10000, "change_account");
        } else {
            z = false;
        }
        return !z;
    }

    public static void LIZLLL(int i, PushBody pushBody, boolean z) {
        long j;
        try {
            if (pushBody != null) {
                j = pushBody.rid64;
            } else {
                j = 0;
            }
            QRK qrk = new QRK(i, j, C36929EeT.LIZLLL(), z, String.valueOf(pushBody));
            qrk.LJFF = pushBody;
            QRI.LIZLLL(EF7.LIZIZ()).LIZ(qrk);
        } catch (Throwable th) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("recordNotification() - error: ");
            LIZ.append(th.getMessage());
            C47629Imf.LIZIZ("NotificationUtil", X1D.LIZIZ(LIZ));
        }
    }
}
