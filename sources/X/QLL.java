package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public class QLL extends Handler {
    public QLL(Looper looper) {
        super(looper);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        try {
            QLN qln = QLK.LIZ;
            switch (message.what) {
                case 0:
                    if (qln != null) {
                        Object[] objArr = (Object[]) message.obj;
                        ((Boolean) objArr[0]).booleanValue();
                        qln.LIZ((List) objArr[1]);
                        return;
                    }
                    return;
                case 1:
                    if (qln != null) {
                        qln.LIZIZ();
                        return;
                    }
                    return;
                case 2:
                    if (qln != null) {
                        Object[] objArr2 = (Object[]) message.obj;
                        ((Boolean) objArr2[0]).booleanValue();
                        ((Long) objArr2[1]).longValue();
                        qln.LIZJ();
                        return;
                    }
                    return;
                case 3:
                    if (qln != null) {
                        qln.onEventExpired((List) ((Object[]) message.obj)[0]);
                        return;
                    }
                    return;
                case 4:
                    if (qln != null) {
                        Iterator it = ((List) ((Object[]) message.obj)[0]).iterator();
                        while (it.hasNext()) {
                            qln.LJ((String) it.next());
                        }
                        return;
                    }
                    return;
                case 5:
                    if (qln != null) {
                        Object[] objArr3 = (Object[]) message.obj;
                        ((Integer) objArr3[3]).intValue();
                        qln.LIZLLL();
                        return;
                    }
                    return;
                case 6:
                    if (qln != null) {
                        qln.LJFF();
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (Throwable unused) {
        }
    }
}
