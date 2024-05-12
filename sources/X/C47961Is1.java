package X;

import android.content.Context;
import android.database.sqlite.SQLiteStatement;
import android.util.SparseArray;
import com.ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Is1, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47961Is1 {
    public static volatile C47961Is1 LJ;
    public final SparseArray<java.util.Map<String, C48111IuR>> LIZ;
    public final C47943Irj LIZIZ;
    public final PThreadPoolExecutor LIZJ;
    public volatile SQLiteStatement LIZLLL;

    public C47961Is1(Context context) {
        SparseArray<java.util.Map<String, C48111IuR>> sparseArray = new SparseArray<>(2);
        this.LIZ = sparseArray;
        this.LIZJ = new PThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new DefaultThreadFactory("/VideoProxyDB"));
        this.LIZIZ = new C47943Irj(C16880lQ.LLLLL(context));
        sparseArray.put(0, new ConcurrentHashMap());
        sparseArray.put(1, new ConcurrentHashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0083, code lost:
    
        if (r3 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C48111IuR LIZ(int r20, java.lang.String r21) {
        /*
            r19 = this;
            r2 = r21
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r6 = 0
            if (r0 == 0) goto La
            return r6
        La:
            r3 = r19
            android.util.SparseArray<java.util.Map<java.lang.String, X.IuR>> r0 = r3.LIZ
            r15 = r20
            java.lang.Object r1 = r0.get(r15)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 != 0) goto L1a
            r13 = r6
            goto L23
        L1a:
            java.lang.Object r13 = r1.get(r2)
            X.IuR r13 = (X.C48111IuR) r13
            if (r13 == 0) goto L23
            return r13
        L23:
            X.Irj r0 = r3.LIZIZ     // Catch: java.lang.Throwable -> L8e
            android.database.sqlite.SQLiteDatabase r4 = r0.getReadableDatabase()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r5 = "video_http_header_t"
            java.lang.String r7 = "key=? AND flag=?"
            r0 = 2
            java.lang.String[] r8 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L8e
            r0 = 0
            r8[r0] = r2     // Catch: java.lang.Throwable -> L8e
            java.lang.String r3 = java.lang.String.valueOf(r15)     // Catch: java.lang.Throwable -> L8e
            r0 = 1
            r8[r0] = r3     // Catch: java.lang.Throwable -> L8e
            java.lang.String r12 = "1"
            r9 = r6
            r10 = r6
            r11 = r6
            android.database.Cursor r3 = r4.query(r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L8e
            if (r3 == 0) goto L88
            int r0 = r3.getCount()     // Catch: java.lang.Throwable -> L89
            if (r0 <= 0) goto L85
            boolean r0 = r3.moveToNext()     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L85
            java.lang.String r0 = "key"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.String r16 = r3.getString(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = "mime"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.String r17 = r3.getString(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = "contentLength"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L89
            int r14 = r3.getInt(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.String r0 = "extra"
            int r0 = r3.getColumnIndex(r0)     // Catch: java.lang.Throwable -> L89
            java.lang.String r18 = r3.getString(r0)     // Catch: java.lang.Throwable -> L89
            X.IuR r13 = new X.IuR     // Catch: java.lang.Throwable -> L89
            r13.<init>(r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L89
            if (r1 == 0) goto L83
            r1.put(r2, r13)     // Catch: java.lang.Throwable -> L89
        L83:
            if (r3 == 0) goto L88
        L85:
            r3.close()
        L88:
            return r13
        L89:
            if (r3 == 0) goto L8e
            r3.close()
        L8e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47961Is1.LIZ(int, java.lang.String):X.IuR");
    }
}
