package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class PA5 {
    public SharedPreferences LIZ;
    public volatile boolean LIZIZ;
    public final ConcurrentHashMap<String, PA6> LIZJ = new ConcurrentHashMap<>();

    public final synchronized void LIZIZ() {
        if (this.LIZIZ) {
            return;
        }
        this.LIZ = F9J.LIZIZ(C63985P9h.LIZ, 0, "sdk_log_report_message");
        this.LIZIZ = true;
    }

    public final synchronized void LIZ(File file) {
        LIZIZ();
        OPR.LIZ(file);
        this.LIZJ.remove(file.getName());
        SharedPreferences.Editor edit = this.LIZ.edit();
        edit.remove(file.getName());
        edit.commit();
    }

    public final PA6 LIZJ(File file) {
        LIZIZ();
        String name = file.getName();
        if (this.LIZJ.containsKey(name)) {
            return this.LIZJ.get(name);
        }
        PA6 pa6 = null;
        if (this.LIZ.contains(name)) {
            String string = this.LIZ.getString(name, "");
            if (!TextUtils.isEmpty(string)) {
                try {
                    String[] split = string.split("_");
                    if (split.length == 2) {
                        pa6 = new PA6(CastIntegerProtector.parseInt(split[0]), CastLongProtector.parseLong(split[1]));
                    } else {
                        pa6 = new PA6(0, 0L);
                    }
                    this.LIZJ.put(name, pa6);
                } catch (Exception e) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("parseRetryMessage ");
                    LIZ.append(string);
                    PAU.LIZIZ(X1D.LIZIZ(LIZ), e);
                }
            }
        }
        return pa6;
    }

    public final synchronized boolean LIZLLL(int i, byte[] bArr, long j) {
        LIZIZ();
        if (C51029K0z.LJIJ() == null) {
            return false;
        }
        File file = new File(C51029K0z.LJIJ(), C16880lQ.LLLZ("%d%s%s%s", new Object[]{Long.valueOf(System.currentTimeMillis()), "_", UUID.randomUUID().toString(), ".log"}));
        FileChannel fileChannel = null;
        try {
            LJ(i, j, file);
            fileChannel = new FileOutputStream(file).getChannel();
            fileChannel.write(ByteBuffer.wrap(bArr));
            return true;
        } catch (Throwable th) {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("saveFile:");
                LIZ.append(file.getName());
                PAU.LIZIZ(X1D.LIZIZ(LIZ), th);
                return false;
            } finally {
                C78685UuP.LJIIIIZZ(fileChannel);
            }
        }
    }

    public final void LJ(int i, long j, File file) {
        PA6 pa6;
        LIZIZ();
        SharedPreferences.Editor edit = this.LIZ.edit();
        String name = file.getName();
        if (this.LIZJ.containsKey(name)) {
            pa6 = this.LIZJ.get(name);
        } else {
            pa6 = new PA6(i, j);
            this.LIZJ.put(name, pa6);
        }
        pa6.LIZ = i;
        pa6.LIZIZ = j;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(pa6.LIZ);
        LIZ.append("_");
        LIZ.append(pa6.LIZIZ);
        edit.putString(name, X1D.LIZIZ(LIZ));
        edit.commit();
    }
}
