package X;

import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AwemeToolFeedbackECode;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.strategy.AwemeToolFeedbackInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Gte, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42966Gte extends AbstractC43178Gx4 {
    @Override // X.AbstractC43178Gx4
    public final long LIZLLL() {
        return TimeUnit.HOURS.toMillis(2L);
    }

    public final List<AwemeToolFeedbackInfo> LJ() {
        long currentTimeMillis = System.currentTimeMillis() - LIZLLL();
        C43176Gx2.LIZ.getClass();
        List LJ = C43176Gx2.LJ(currentTimeMillis, "record_start");
        List LJ2 = C43176Gx2.LJ(currentTimeMillis, "record_error");
        List LJ3 = C43176Gx2.LJ(currentTimeMillis, "record_success");
        List LJ4 = C43176Gx2.LJ(currentTimeMillis, "camera_start");
        List LJ5 = C43176Gx2.LJ(currentTimeMillis, "camera_error");
        List LJ6 = C43176Gx2.LJ(currentTimeMillis, "camera_success");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = LJ2.iterator();
        while (it.hasNext()) {
            arrayList2.add(new AwemeToolFeedbackECode(((C43189GxF) it.next()).LIZLLL, null, 2, null));
        }
        arrayList.add(new AwemeToolFeedbackInfo("record", LJ.size(), LJ3.size(), 0, arrayList2));
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = LJ5.iterator();
        while (it2.hasNext()) {
            arrayList3.add(new AwemeToolFeedbackECode(((C43189GxF) it2.next()).LIZLLL, null, 2, null));
        }
        arrayList.add(new AwemeToolFeedbackInfo("camera start", LJ4.size(), LJ6.size(), 0, arrayList3));
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:3:0x000c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0043 A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC43178Gx4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZ(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            int r0 = r2.hashCode()
            switch(r0) {
                case -2122358630: goto L32;
                case -2109385996: goto L29;
                case -785402647: goto L20;
                case -603764626: goto L3b;
                case -590791992: goto L17;
                case 134640149: goto Le;
                default: goto Lc;
            }
        Lc:
            r0 = 0
        Ld:
            return r0
        Le:
            java.lang.String r0 = "record_success"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L43
            goto Lc
        L17:
            java.lang.String r0 = "camera_start"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L43
            goto Lc
        L20:
            java.lang.String r0 = "camera_success"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L43
            goto Lc
        L29:
            java.lang.String r0 = "record_start"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L43
            goto Lc
        L32:
            java.lang.String r0 = "record_error"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L43
            goto Lc
        L3b:
            java.lang.String r0 = "camera_error"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto Lc
        L43:
            r0 = 1
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC42966Gte.LIZ(java.lang.String):boolean");
    }
}
