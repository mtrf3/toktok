package X;

import android.os.Process;
import defpackage.i0;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PA8 {
    public static volatile PA8 LIZJ;
    public final ConcurrentHashMap<Long, ConcurrentHashMap<Long, JSONObject>> LIZ = new ConcurrentHashMap<>();
    public volatile boolean LIZIZ = false;

    public static PA8 LIZJ() {
        if (LIZJ == null) {
            synchronized (PA8.class) {
                if (LIZJ == null) {
                    LIZJ = new PA8();
                }
            }
        }
        return LIZJ;
    }

    public static String LIZ(long j, long j2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(j);
        LIZ.append("_");
        LIZ.append(j2);
        return X1D.LIZIZ(LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.json.JSONObject LIZIZ(long r6, long r8) {
        /*
            r5 = this;
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.util.concurrent.ConcurrentHashMap<java.lang.Long, org.json.JSONObject>> r1 = r5.LIZ
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            java.lang.Object r1 = r1.get(r0)
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            if (r1 == 0) goto L23
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L23
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            java.lang.Object r0 = r1.get(r0)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            return r0
        L23:
            java.lang.String r3 = LIZ(r6, r8)
            java.io.File r2 = X.C51029K0z.LJIILL()
            if (r2 != 0) goto L86
        L2d:
            r2 = 0
        L2e:
            java.lang.String r4 = "APM-SDK"
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.util.concurrent.ConcurrentHashMap<java.lang.Long, org.json.JSONObject>> r1 = r5.LIZ
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L4a
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.util.concurrent.ConcurrentHashMap<java.lang.Long, org.json.JSONObject>> r3 = r5.LIZ
            java.lang.Long r1 = java.lang.Long.valueOf(r6)
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r3.put(r1, r0)
        L4a:
            if (r2 == 0) goto L75
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, java.util.concurrent.ConcurrentHashMap<java.lang.Long, org.json.JSONObject>> r1 = r5.LIZ
            java.lang.Long r0 = java.lang.Long.valueOf(r6)
            java.lang.Object r1 = r1.get(r0)
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r1.put(r0, r2)
        L5f:
            if (r2 != 0) goto L74
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "header==null "
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = X.X1D.LIZIZ(r1)
            X.PAU.LIZ(r4, r0)
        L74:
            return r2
        L75:
            java.lang.Class<X.P9h> r3 = X.C63985P9h.class
            monitor-enter(r3)
            java.util.concurrent.ConcurrentHashMap<java.lang.Long, org.json.JSONObject> r1 = X.C63985P9h.LIZIZ     // Catch: java.lang.Throwable -> La2
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch: java.lang.Throwable -> La2
            java.lang.Object r2 = r1.get(r0)     // Catch: java.lang.Throwable -> La2
            org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch: java.lang.Throwable -> La2
            monitor-exit(r3)
            goto L5f
        L86:
            java.io.File r1 = new java.io.File
            java.lang.String r0 = ".bin"
            java.lang.String r0 = defpackage.i0.LJFF(r3, r0)
            r1.<init>(r2, r0)
            byte[] r1 = X.OPR.LIZIZ(r1)
            if (r1 == 0) goto L2d
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L2d
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L2d
            r0.<init>(r1)     // Catch: java.lang.Exception -> L2d
            r2.<init>(r0)     // Catch: java.lang.Exception -> L2d
            goto L2e
        La2:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PA8.LIZIZ(long, long):org.json.JSONObject");
    }

    public final long LIZLLL(JSONObject jSONObject, long j) {
        long currentTimeMillis = (System.currentTimeMillis() << 16) | Process.myPid();
        if (!this.LIZ.containsKey(Long.valueOf(j))) {
            this.LIZ.put(Long.valueOf(j), new ConcurrentHashMap<>());
        }
        this.LIZ.get(Long.valueOf(j)).put(Long.valueOf(currentTimeMillis), jSONObject);
        String LIZ = LIZ(j, currentTimeMillis);
        FileChannel fileChannel = null;
        if (jSONObject == null) {
            jSONObject = null;
        } else {
            try {
                jSONObject = new JSONObject(jSONObject.toString());
            } catch (Exception unused) {
            }
        }
        File LJIILL = C51029K0z.LJIILL();
        if (LJIILL != null && jSONObject != null) {
            try {
                fileChannel = new FileOutputStream(new File(LJIILL, i0.LJFF(LIZ, ".bin"))).getChannel();
                fileChannel.write(ByteBuffer.wrap(jSONObject.toString().getBytes()));
            } finally {
                try {
                } finally {
                }
            }
        }
        synchronized (this) {
            if (!this.LIZIZ) {
                this.LIZIZ = true;
                File LJIILL2 = C51029K0z.LJIILL();
                if (LJIILL2 != null) {
                    LJIILL2.listFiles(new PA9());
                }
            }
        }
        return currentTimeMillis;
    }
}
