package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class QNL extends Handler {
    public final /* synthetic */ QNB LIZ;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        ReentrantLock reentrantLock;
        ReentrantLock reentrantLock2;
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return;
                }
                try {
                    reentrantLock2 = QNM.LIZ;
                    reentrantLock2.lockInterruptibly();
                    ((LinkedList) QNM.LIZIZ).clear();
                } catch (Exception unused) {
                    reentrantLock2 = QNM.LIZ;
                } catch (Throwable th) {
                    QNM.LIZ.unlock();
                    throw th;
                }
                reentrantLock2.unlock();
                return;
            }
            OCR ocr = (OCR) message.obj;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("os_name", "android");
                reentrantLock = QNM.LIZ;
                reentrantLock.lockInterruptibly();
                List<JSONObject> list = QNM.LIZIZ;
                jSONObject.put("touch", new JSONArray((Collection) list));
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("responseGetTouchToJs motion list size ");
                LIZ.append(((LinkedList) list).size());
                X1D.LIZIZ(LIZ);
                ((LinkedList) list).clear();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("responseGetTouchToJs end motion list size ");
                LIZ2.append(((LinkedList) list).size());
                X1D.LIZIZ(LIZ2);
            } catch (Exception unused2) {
                reentrantLock = QNM.LIZ;
            } catch (Throwable th2) {
                QNM.LIZ.unlock();
                throw th2;
            }
            reentrantLock.unlock();
            try {
                ocr.LIZLLL(1, jSONObject);
                return;
            } catch (Exception unused3) {
                return;
            }
        }
        this.LIZ.getClass();
        Object obj = message.obj;
        if (obj == null) {
            return;
        }
        ((DialogC66909QNt) obj).LIZ();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QNL(QNB qnb, Looper looper) {
        super(looper);
        this.LIZ = qnb;
    }
}
