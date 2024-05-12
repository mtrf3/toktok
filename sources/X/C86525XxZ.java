package X;

import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import java.util.Comparator;

/* renamed from: X.XxZ, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86525XxZ implements Comparator<InnerPushMessage> {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r4 < 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (r4 < 0) goto L17;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int compare(com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r8, com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r9) {
        /*
            r7 = this;
            com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r8 = (com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage) r8
            com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage r9 = (com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage) r9
            java.lang.String r0 = "o1"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            java.lang.String r0 = "o2"
            kotlin.jvm.internal.o.LJIIIZ(r9, r0)
            com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig r0 = r8.getConfig()
            r6 = 0
            if (r0 == 0) goto L55
            int r1 = r0.getPriority()
        L19:
            com.ss.android.ugc.aweme.innerpush.api.model.InnerPushConfig r0 = r9.getConfig()
            if (r0 == 0) goto L53
            int r0 = r0.getPriority()
        L23:
            int r1 = r1 - r0
            if (r1 == 0) goto L27
        L26:
            return r1
        L27:
            long r4 = r8.getCreateTime()
            long r0 = r9.getCreateTime()
            long r4 = r4 - r0
            int r0 = r8.getType()
            r2 = 0
            r1 = 21
            if (r0 != r1) goto L4a
            int r0 = r9.getType()
            if (r0 != r1) goto L4a
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L47
        L44:
            r6 = 1
        L45:
            r1 = r6
            goto L26
        L47:
            if (r0 >= 0) goto L45
            goto L4e
        L4a:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L50
        L4e:
            r6 = -1
            goto L45
        L50:
            if (r0 >= 0) goto L45
            goto L44
        L53:
            r0 = 0
            goto L23
        L55:
            r1 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C86525XxZ.compare(java.lang.Object, java.lang.Object):int");
    }
}
