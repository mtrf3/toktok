package X;

import com.bytedance.apm.doctor.DoctorManager;
import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PB6 {
    public final File LIZ;
    public final long LIZIZ;
    public final ByteBuffer LIZJ;

    public final synchronized String[] LIZJ() {
        File[] listFiles = O5Y.LJIL().listFiles(new PB8());
        if (listFiles == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (File file : listFiles) {
            arrayList.add(file.getName());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public final synchronized void LIZ() {
        boolean z = false;
        short s = this.LIZJ.getShort(0);
        long j = this.LIZJ.getLong(2);
        int i = this.LIZJ.getInt(10);
        int i2 = this.LIZJ.getInt(14);
        if (s == 2082 && i2 > 0 && i > 0) {
            if (C78248UnM.LJIIJ()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("flushing: headerId=");
                LIZ.append(j);
                LIZ.append(" totalCount=");
                LIZ.append(i);
                LIZ.append(" totalBytes=");
                LIZ.append(i2);
                C64028PAy.LIZ("APM-Slardar", X1D.LIZIZ(LIZ));
            }
            long nanoTime = System.nanoTime();
            FileChannel fileChannel = null;
            try {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(System.currentTimeMillis());
                LIZ2.append("_");
                LIZ2.append(UUID.randomUUID().toString());
                String LIZIZ = X1D.LIZIZ(LIZ2);
                try {
                    if (!this.LIZ.exists()) {
                        File parentFile = this.LIZ.getParentFile();
                        if (!parentFile.exists()) {
                            parentFile.mkdirs();
                        }
                        this.LIZ.mkdirs();
                    }
                } catch (Throwable th) {
                    C64028PAy.LIZJ("APM-Slardar", "flushDir create error.", th);
                }
                File file = new File(this.LIZ, LIZIZ + ".txt");
                if (file.exists()) {
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append("file is exist:");
                    LIZ3.append(file.getName());
                    C64028PAy.LIZIZ("APM-Slardar", X1D.LIZIZ(LIZ3));
                }
                fileChannel = new FileOutputStream(file, false).getChannel();
                this.LIZJ.position(i2 + 18);
                this.LIZJ.flip();
                fileChannel.write(this.LIZJ);
                File file2 = this.LIZ;
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(LIZIZ);
                LIZ4.append(".log");
                if (file.renameTo(new File(file2, X1D.LIZIZ(LIZ4)))) {
                    z = true;
                } else {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append("rename error");
                    LIZ5.append(file.getAbsolutePath());
                    C64028PAy.LIZIZ("APM-Slardar", X1D.LIZIZ(LIZ5));
                }
                if (C78248UnM.LJIIJ()) {
                    StringBuilder LIZ6 = X1D.LIZ();
                    LIZ6.append("flush to file success. flushFile=");
                    LIZ6.append(file.getAbsolutePath());
                    C64028PAy.LIZ("APM-Slardar", X1D.LIZIZ(LIZ6));
                }
            } catch (Throwable th2) {
                try {
                    StringBuilder LIZ7 = X1D.LIZ();
                    LIZ7.append(this.LIZ.exists());
                    LIZ7.append(" flush to file failed.");
                    C64028PAy.LIZJ("APM-Slardar", X1D.LIZIZ(LIZ7), th2);
                } catch (Throwable unused) {
                }
            }
            C78685UuP.LJIIIIZZ(fileChannel);
            if (!z) {
                LIZIZ();
            }
            LJ();
            if (C78248UnM.LJIIJ()) {
                C64028PAy.LIZ("APM-Slardar", "flush cost=" + (System.nanoTime() - nanoTime));
            }
            return;
        }
        if (C78248UnM.LJIIJ()) {
            C64028PAy.LIZ("APM-Slardar", "flushing: Skipped. no data to flush. reset buffer now.");
        }
        LJ();
    }

    public final void LIZIZ() {
        this.LIZJ.position(this.LIZJ.getInt(14) + 18);
        this.LIZJ.flip();
        PBF LIZ = PBF.LIZ(this.LIZJ);
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("flush to memory success. logFile=");
            LIZ2.append(LIZ);
            C64028PAy.LIZ("APM-Slardar", X1D.LIZIZ(LIZ2));
        }
        PBE pbe = PBB.LIZ;
        if (LIZ == null) {
            pbe.getClass();
        } else {
            pbe.LIZJ.LIZJ(LIZ);
        }
    }

    public final void LJ() {
        this.LIZJ.clear();
        this.LIZJ.putShort((short) 2082);
        this.LIZJ.putLong(this.LIZIZ);
        this.LIZJ.putInt(0);
        this.LIZJ.putInt(0);
    }

    public final synchronized void LIZLLL(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        String jSONObject2 = jSONObject.toString();
        if (C78248UnM.LJIIJ()) {
            try {
                DoctorManager.getInstance().LIZ("DATA_SAVE_TO_DB", new JSONObject(jSONObject.toString()));
            } catch (Exception unused) {
            }
        }
        byte[] bytes = jSONObject2.getBytes();
        int length = bytes.length + 4;
        if (length > 262144) {
            PC2.LIZ(new PBA());
            return;
        }
        if (length > this.LIZJ.remaining()) {
            LIZ();
        }
        this.LIZJ.putInt(bytes.length);
        this.LIZJ.put(bytes);
        this.LIZJ.putInt(10, this.LIZJ.getInt(10) + 1);
        this.LIZJ.putInt(14, this.LIZJ.getInt(14) + length);
        if (C78248UnM.LJIIJ()) {
            C64028PAy.LIZ("APM-Slardar", C16880lQ.LLLZ("push success: totalCount=%s, totalBytes=%s, logItem=%s", new Object[]{Integer.valueOf(this.LIZJ.getInt(10)), Integer.valueOf(this.LIZJ.getInt(14)), jSONObject2}));
        }
        if (this.LIZJ.position() >= 262134 || this.LIZJ.getInt(10) >= 256) {
            LIZ();
        }
    }

    public PB6(long j, File file, File file2) {
        this.LIZ = file2;
        this.LIZIZ = j;
        try {
            FileChannel channel = new RandomAccessFile(file, "rw").getChannel();
            channel.tryLock();
            this.LIZJ = channel.map(FileChannel.MapMode.READ_WRITE, 0L, 262162L);
            LIZ();
        } catch (Throwable th) {
            C64028PAy.LIZJ("APM-Slardar", "create MappedByteBuffer failed. will fallback into HeapByteBuffer", th);
        }
        if (this.LIZJ == null) {
            this.LIZJ = ByteBuffer.allocate(262162);
        }
        LJ();
    }
}
