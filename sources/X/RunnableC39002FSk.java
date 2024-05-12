package X;

import android.os.SystemClock;

/* renamed from: X.FSk, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC39002FSk implements Runnable, Comparable {
    public final Runnable LJLIL;
    public final FSW LJLILLLLZI;
    public final long LJLJI = SystemClock.uptimeMillis();
    public Thread LJLJJI;

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5 A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:13:0x0065, B:15:0x0071, B:17:0x0079, B:19:0x0081, B:20:0x0089, B:22:0x0096, B:24:0x00a2, B:29:0x00c7, B:30:0x00c5, B:31:0x00ef, B:33:0x0101, B:37:0x010e, B:38:0x010c, B:42:0x00ab, B:45:0x00b9, B:48:0x013b, B:49:0x0140, B:44:0x00b0), top: B:12:0x0065, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010c A[Catch: all -> 0x0141, TryCatch #0 {all -> 0x0141, blocks: (B:13:0x0065, B:15:0x0071, B:17:0x0079, B:19:0x0081, B:20:0x0089, B:22:0x0096, B:24:0x00a2, B:29:0x00c7, B:30:0x00c5, B:31:0x00ef, B:33:0x0101, B:37:0x010e, B:38:0x010c, B:42:0x00ab, B:45:0x00b9, B:48:0x013b, B:49:0x0140, B:44:0x00b0), top: B:12:0x0065, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab A[Catch: all -> 0x0141, TRY_LEAVE, TryCatch #0 {all -> 0x0141, blocks: (B:13:0x0065, B:15:0x0071, B:17:0x0079, B:19:0x0081, B:20:0x0089, B:22:0x0096, B:24:0x00a2, B:29:0x00c7, B:30:0x00c5, B:31:0x00ef, B:33:0x0101, B:37:0x010e, B:38:0x010c, B:42:0x00ab, B:45:0x00b9, B:48:0x013b, B:49:0x0140, B:44:0x00b0), top: B:12:0x0065, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC39002FSk.LIZJ():void");
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Runnable runnable = this.LJLIL;
        if ((runnable instanceof Comparable) && (obj instanceof RunnableC39002FSk)) {
            return ((Comparable) runnable).compareTo(((RunnableC39002FSk) obj).LJLIL);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof RunnableC39002FSk) && this.LJLIL.equals(((RunnableC39002FSk) obj).LJLIL)) {
            return true;
        }
        return false;
    }

    public RunnableC39002FSk(FSW fsw, Runnable runnable) {
        this.LJLIL = runnable;
        this.LJLILLLLZI = fsw;
    }
}
