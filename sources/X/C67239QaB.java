package X;

import android.app.NotificationManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.QaB, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67239QaB {
    public final String LIZ;
    public C67240QaC LIZIZ = new C67240QaC(0, "", "undefined", Long.MAX_VALUE);
    public final ArrayList<C67240QaC> LIZJ = new ArrayList<>();
    public long LIZLLL = Long.MIN_VALUE;
    public long LJ = Long.MAX_VALUE;

    public C67239QaB(String str) {
        this.LIZ = str;
    }

    public final void LIZ(C67240QaC c67240QaC) {
        this.LIZJ.add(c67240QaC);
        if (!TextUtils.equals(c67240QaC.LIZJ, "app_summary_tag")) {
            long j = c67240QaC.LIZIZ;
            if (j < this.LIZIZ.LIZIZ) {
                this.LIZIZ = c67240QaC;
                this.LJ = j;
            }
        }
        if (!TextUtils.equals(c67240QaC.LIZJ, "app_summary_tag")) {
            long j2 = c67240QaC.LIZIZ;
            if (j2 > this.LIZLLL) {
                this.LIZLLL = j2;
            }
        }
    }

    public final void LIZIZ(NotificationManager notificationManager) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PushMsgManager cancel one in group: ");
        LIZ.append(this.LIZ);
        QSI.LIZIZ(X1D.LIZIZ(LIZ));
        this.LIZIZ.LIZ(notificationManager);
        if (this.LIZJ.size() == 2) {
            Iterator<C67240QaC> it = this.LIZJ.iterator();
            while (it.hasNext()) {
                C67240QaC notifyItems = it.next();
                o.LJIIIIZZ(notifyItems, "notifyItems");
                C67240QaC c67240QaC = notifyItems;
                if (TextUtils.equals(c67240QaC.LIZJ, "app_summary_tag")) {
                    c67240QaC.LIZ(notificationManager);
                }
            }
        }
    }
}
