package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;

/* renamed from: X.JFy, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48870JFy {
    public static volatile boolean LIZ;
    public static List<C48871JFz> LIZIZ = new ArrayList();
    public static final Lock LIZJ;
    public static final Lock LIZLLL;

    static {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        LIZJ = reentrantReadWriteLock.readLock();
        LIZLLL = reentrantReadWriteLock.writeLock();
    }

    public static String LIZ(java.net.URI uri) {
        boolean z;
        try {
            LIZJ.lock();
            Iterator<C48871JFz> it = LIZIZ.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().LIZ(uri)) {
                        LIZJ.unlock();
                        z = true;
                        break;
                    }
                } else {
                    LIZJ.unlock();
                    z = false;
                    break;
                }
            }
            if (z) {
                return UUID.randomUUID().toString();
            }
            return null;
        } catch (Throwable th) {
            LIZJ.unlock();
            throw th;
        }
    }

    public static void LIZIZ(JSONArray jSONArray, int i) {
        if (i > 0) {
            ArrayList arrayList = new ArrayList();
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    String optString = jSONArray.optString(i2);
                    if (!TextUtils.isEmpty(optString)) {
                        C48871JFz c48871JFz = new C48871JFz();
                        try {
                            c48871JFz.LIZ = PatternProtector.compile(optString);
                            arrayList.add(c48871JFz);
                        } catch (PatternSyntaxException e) {
                            C16880lQ.LLLLIIL(e);
                        }
                    }
                }
                try {
                    Lock lock = LIZLLL;
                    lock.lock();
                    LIZIZ = arrayList;
                    lock.unlock();
                } catch (Throwable th) {
                    LIZLLL.unlock();
                    throw th;
                }
            }
            LIZ = true;
            return;
        }
        LIZ = false;
    }
}
