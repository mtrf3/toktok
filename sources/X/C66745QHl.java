package X;

import android.text.TextUtils;
import com.bytedance.applog.AppLog;
import defpackage.b1;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.QHl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66745QHl {
    public static final /* synthetic */ int LIZ = 0;

    public static QI3 LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator it = ((CopyOnWriteArrayList) QI3.LJJJI).iterator();
        while (it.hasNext()) {
            QI3 qi3 = (QI3) it.next();
            if (str.equals(qi3.LJIIIZ)) {
                return qi3;
            }
        }
        return null;
    }

    public static boolean LIZJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C66746QHm c66746QHm = new C66746QHm(str);
        Iterator it = ((CopyOnWriteArrayList) QI3.LJJJI).iterator();
        while (it.hasNext()) {
            if (c66746QHm.LIZ((QI3) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static String LIZIZ(InterfaceC66747QHn interfaceC66747QHn, String str) {
        if (AppLog.LIZ == interfaceC66747QHn) {
            return str;
        }
        StringBuilder LIZJ = b1.LIZJ(str, "_");
        LIZJ.append(interfaceC66747QHn.getAppId());
        return X1D.LIZIZ(LIZJ);
    }
}
