package X;

import android.content.SharedPreferences;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class PB0 {
    public SharedPreferences LIZ;
    public volatile boolean LIZIZ;
    public File LIZJ;
    public final ConcurrentHashMap<String, PB1> LIZLLL = new ConcurrentHashMap<>();
    public long LJ = 0;
    public volatile boolean LJFF = false;
    public final ArrayList<String> LJI = new ArrayList<>();

    public final synchronized void LIZJ() {
        if (this.LIZIZ) {
            return;
        }
        File file = new File(O5Y.LJJIIZ(), "log");
        if (!file.exists()) {
            file.mkdirs();
        }
        this.LIZJ = file;
        this.LIZ = F9J.LIZIZ(C78248UnM.LJLJJI, 0, "log_report_message");
        this.LIZIZ = true;
    }

    public final synchronized void LJ() {
        int i = 0;
        if (!this.LJFF) {
            PB0 pb0 = PB2.LIZ;
            pb0.LIZJ();
            String[] list = pb0.LIZJ.list();
            int length = list.length;
            while (i < length) {
                String str = list[i];
                if (!this.LJI.contains(str)) {
                    LIZ(str);
                }
                i++;
            }
            this.LJFF = true;
        } else if (this.LJ > 0 && this.LJI.size() == 0) {
            PB0 pb02 = PB2.LIZ;
            pb02.LIZJ();
            String[] list2 = pb02.LIZJ.list();
            int length2 = list2.length;
            while (i < length2) {
                String str2 = list2[i];
                if (!this.LJI.contains(str2)) {
                    LIZ(str2);
                }
                i++;
            }
            this.LJ -= this.LJI.size();
        }
    }

    public final void LIZ(String str) {
        if (this.LJI.size() > 5000) {
            this.LJ++;
        } else {
            this.LJI.add(str);
        }
    }

    public final synchronized void LIZIZ(File file) {
        this.LJI.remove(file.getName());
        LIZJ();
        OPR.LIZ(file);
        this.LIZLLL.remove(file.getName());
        SharedPreferences.Editor edit = this.LIZ.edit();
        edit.remove(file.getName());
        edit.commit();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0049, code lost:
    
        if (0 != 0) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.PB1 LIZLLL(java.io.File r7) {
        /*
            r6 = this;
            r6.LIZJ()
            java.lang.String r5 = r7.getName()
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.PB1> r0 = r6.LIZLLL
            boolean r0 = r0.containsKey(r5)
            if (r0 == 0) goto L18
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.PB1> r0 = r6.LIZLLL
            java.lang.Object r0 = r0.get(r5)
            X.PB1 r0 = (X.PB1) r0
            return r0
        L18:
            android.content.SharedPreferences r0 = r6.LIZ
            boolean r0 = r0.contains(r5)
            r4 = 0
            if (r0 == 0) goto L52
            android.content.SharedPreferences r1 = r6.LIZ
            java.lang.String r0 = ""
            java.lang.String r1 = r1.getString(r5, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L52
            java.lang.String r0 = "_"
            java.lang.String[] r1 = r1.split(r0)     // Catch: java.lang.Exception -> L49
            X.PB1 r3 = new X.PB1     // Catch: java.lang.Exception -> L49
            r0 = 0
            r0 = r1[r0]     // Catch: java.lang.Exception -> L49
            int r2 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.parseInt(r0)     // Catch: java.lang.Exception -> L49
            r0 = 1
            r0 = r1[r0]     // Catch: java.lang.Exception -> L49
            long r0 = com.bytedance.mt.protector.impl.string2number.CastLongProtector.parseLong(r0)     // Catch: java.lang.Exception -> L49
            r3.<init>(r2, r0)     // Catch: java.lang.Exception -> L49
            goto L4c
        L49:
            if (r4 == 0) goto L52
            goto L4d
        L4c:
            r4 = r3
        L4d:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, X.PB1> r0 = r6.LIZLLL
            r0.put(r5, r4)
        L52:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PB0.LIZLLL(java.io.File):X.PB1");
    }

    public final void LJI(int i, long j, File file) {
        PB1 pb1;
        try {
            LIZJ();
            SharedPreferences.Editor edit = this.LIZ.edit();
            String name = file.getName();
            if (this.LIZLLL.containsKey(name)) {
                pb1 = this.LIZLLL.get(name);
            } else {
                pb1 = new PB1(i, j);
                this.LIZLLL.put(name, pb1);
            }
            pb1.LIZ = i;
            pb1.LIZIZ = j;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(pb1.LIZ);
            LIZ.append("_");
            LIZ.append(pb1.LIZIZ);
            edit.putString(name, X1D.LIZIZ(LIZ));
            edit.commit();
        } catch (Throwable th) {
            C64028PAy.LIZJ("APM-Slardar", "updateRetryMessage", th);
        }
    }

    public final synchronized boolean LJFF(long j, int i, String str, byte[] bArr) {
        LIZJ();
        if (this.LIZJ == null) {
            return false;
        }
        String LLLZ = C16880lQ.LLLZ("%d%s%s%s%s", new Object[]{Long.valueOf(System.currentTimeMillis()), "_", UUID.randomUUID().toString(), ".", str});
        File file = new File(this.LIZJ, LLLZ);
        FileChannel fileChannel = null;
        try {
            LJI(i, j, file);
            fileChannel = new FileOutputStream(file).getChannel();
            fileChannel.write(ByteBuffer.wrap(bArr));
            if (!this.LJI.contains(LLLZ)) {
                LIZ(LLLZ);
            }
            if (C78248UnM.LJIIJ()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("saveFile:");
                LIZ.append(file.getName());
                C64028PAy.LIZ("APM-Slardar", X1D.LIZIZ(LIZ));
            }
            return true;
        } catch (Throwable th) {
            try {
                C64028PAy.LIZJ("APM-Slardar", "saveFile", th);
                return false;
            } finally {
                C78685UuP.LJIIIIZZ(fileChannel);
            }
        }
    }
}
