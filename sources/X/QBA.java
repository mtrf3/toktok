package X;

import android.content.Intent;
import android.os.Bundle;
import com.bytedance.lobby.internal.LobbyCore;
import com.bytedance.lobby.internal.LobbyInvisibleActivity;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class QBA {
    public static volatile QBA LIZIZ;
    public final C1HQ LIZ = new C1HQ();

    public static QBA LIZIZ() {
        if (LIZIZ == null) {
            synchronized (QBA.class) {
                if (LIZIZ == null) {
                    LIZIZ = new QBA();
                }
            }
        }
        return LIZIZ;
    }

    public static void LIZJ(QBH qbh) {
        Bundle bundle = qbh.LIZLLL;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("provider_id", qbh.LIZIZ);
        bundle.putInt("action_type", 1);
        if (qbh.LIZJ != null) {
            QBB LIZ = QBB.LIZ();
            String str = qbh.LIZIZ;
            QBC qbc = qbh.LIZJ;
            synchronized (LIZ.LIZ) {
                C15070iV c15070iV = new C15070iV(str, 1);
                List list = (List) LIZ.LIZ.getOrDefault(c15070iV, null);
                if (list == null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(qbc);
                    LIZ.LIZ.put(c15070iV, arrayList);
                } else if (!list.contains(qbc)) {
                    list.add(qbc);
                }
            }
        }
        Intent intent = new Intent(qbh.LIZ, (Class<?>) LobbyInvisibleActivity.class);
        intent.putExtras(bundle);
        C16880lQ.LJI(qbh.LIZ, intent, 101);
    }

    public final synchronized QB3 LIZ(String str) {
        LobbyCore.tryInitProviderConfig();
        QB3 qb3 = (QB3) this.LIZ.getOrDefault(str, null);
        if (qb3 == null) {
            return null;
        }
        qb3.wv();
        qb3.init();
        return qb3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
    
        if (r6 != null) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(int r5, java.util.List r6) {
        /*
            r4 = this;
            boolean r0 = X.C77119UOl.LIZIZ
            r3 = 0
            if (r0 == 0) goto L4e
            if (r6 == 0) goto L14
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L41
        Ld:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L14
            r3 = 1
        L14:
            com.bytedance.lobby.internal.LobbyCore.tryInitProviderConfig()
            X.1HQ r0 = r4.LIZ
            java.util.Collection r0 = r0.values()
            X.0M9$e r0 = (X.C0M9.e) r0
            java.util.Iterator r2 = r0.iterator()
        L23:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L51
            java.lang.Object r1 = r2.next()
            X.QB3 r1 = (X.QB3) r1
            if (r3 == 0) goto L3d
            X.QCI r0 = r1.getConfig()
            java.lang.String r0 = r0.LIZIZ
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L23
        L3d:
            r1.Ml0(r5)
            goto L23
        L41:
            r1 = 0
        L42:
            int r0 = r6.size()
            if (r1 >= r0) goto Ld
            com.bytedance.mt.protector.impl.collections.ListProtector.get(r6, r1)
            int r1 = r1 + 1
            goto L42
        L4e:
            if (r6 == 0) goto L14
            goto Ld
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QBA.LIZLLL(int, java.util.List):void");
    }
}
