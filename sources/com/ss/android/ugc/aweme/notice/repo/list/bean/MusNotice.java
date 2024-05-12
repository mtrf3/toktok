package com.ss.android.ugc.aweme.notice.repo.list.bean;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes10.dex */
public class MusNotice extends BaseNotice {
    public transient long generatedUniqueId;
    public transient long hackedUniqueId;
    public final transient boolean isMock;

    public MusNotice() {
        this(false, 1, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        if (r1 != 0) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long getGeneratedUniqueId() {
        /*
            r5 = this;
            long r1 = r5.generatedUniqueId
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L1c
            java.lang.String r0 = r5.nid
            if (r0 == 0) goto L1f
            java.lang.Long r0 = X.C38350F3i.LJJIZ(r0)
            if (r0 == 0) goto L1f
            long r1 = r0.longValue()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L1f
        L1a:
            r5.generatedUniqueId = r1
        L1c:
            long r0 = r5.generatedUniqueId
            return r0
        L1f:
            int r0 = r5.hashCode()
            long r1 = (long) r0
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice.getGeneratedUniqueId():long");
    }

    public final long getUniqueId() {
        long j = this.hackedUniqueId;
        if (j > 0) {
            return j;
        }
        return getGeneratedUniqueId();
    }

    public final boolean isMock() {
        return this.isMock;
    }

    public MusNotice(boolean z) {
        this.isMock = z;
    }

    public final void hackUniqueId(long j) {
        this.hackedUniqueId = j;
    }

    public /* synthetic */ MusNotice(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
