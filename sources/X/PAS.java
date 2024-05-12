package X;

import java.io.File;
import java.io.FileOutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PAS {
    public final File LIZ;
    public final ByteBuffer LIZIZ;

    public final synchronized void LIZ() {
        boolean z = false;
        int i = this.LIZIZ.getInt(0);
        this.LIZIZ.getInt(4);
        int i2 = this.LIZIZ.getInt(8);
        int i3 = this.LIZIZ.getInt(12);
        if (i == 1095781686 && i3 > 0 && i2 > 0) {
            System.nanoTime();
            FileChannel fileChannel = null;
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(System.currentTimeMillis());
                LIZ.append("_");
                LIZ.append(UUID.randomUUID().toString());
                String LIZIZ = X1D.LIZIZ(LIZ);
                try {
                    if (!this.LIZ.exists()) {
                        File parentFile = this.LIZ.getParentFile();
                        if (!parentFile.exists()) {
                            parentFile.mkdirs();
                        }
                        this.LIZ.mkdirs();
                    }
                } catch (Throwable th) {
                    PAU.LIZIZ("flushDir create error.", th);
                }
                File file = new File(this.LIZ, LIZIZ + ".tmp");
                if (file.exists()) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("file is exist:");
                    LIZ2.append(file.getName());
                    PAU.LIZ("APM-SDK", X1D.LIZIZ(LIZ2));
                }
                fileChannel = new FileOutputStream(file, false).getChannel();
                this.LIZIZ.position(i3 + 16);
                this.LIZIZ.flip();
                fileChannel.write(this.LIZIZ);
                File file2 = this.LIZ;
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(LIZIZ);
                LIZ3.append(".log");
                if (file.renameTo(new File(file2, X1D.LIZIZ(LIZ3)))) {
                    z = true;
                } else {
                    StringBuilder LIZ4 = X1D.LIZ();
                    LIZ4.append("rename error");
                    LIZ4.append(file.getAbsolutePath());
                    PAU.LIZ("APM-SDK", X1D.LIZIZ(LIZ4));
                }
            } catch (Throwable th2) {
                try {
                    StringBuilder LIZ5 = X1D.LIZ();
                    LIZ5.append(this.LIZ.exists());
                    LIZ5.append(" flush to file failed.");
                    PAU.LIZIZ(X1D.LIZIZ(LIZ5), th2);
                } catch (Throwable unused) {
                }
            }
            C78685UuP.LJIIIIZZ(fileChannel);
            if (!z) {
                LIZIZ();
            }
            LIZLLL();
            return;
        }
        LIZLLL();
    }

    public final void LIZIZ() {
        this.LIZIZ.position(this.LIZIZ.getInt(12) + 16);
        this.LIZIZ.flip();
        PAT LIZ = PAT.LIZ(this.LIZIZ);
        PAR par = PAW.LIZ;
        if (LIZ == null) {
            par.getClass();
        } else {
            par.LIZIZ.LIZJ(LIZ);
        }
    }

    public final void LIZLLL() {
        this.LIZIZ.clear();
        this.LIZIZ.putInt(1095781686);
        this.LIZIZ.putInt(1);
        this.LIZIZ.putInt(0);
        this.LIZIZ.putInt(0);
    }

    public PAS(File file, File file2) {
        this.LIZ = file2;
        try {
            this.LIZIZ = new RandomAccessFile(file, "rw").getChannel().map(FileChannel.MapMode.READ_WRITE, 0L, 262160L);
            LIZ();
        } catch (Throwable th) {
            PAU.LIZIZ("create MappedByteBuffer failed. will fallback into HeapByteBuffer", th);
        }
        if (this.LIZIZ == null) {
            this.LIZIZ = ByteBuffer.allocate(262160);
        }
        LIZLLL();
    }

    public final synchronized void LIZJ(JSONObject jSONObject, long j, long j2) {
        String jSONObject2 = jSONObject.toString();
        byte[] bytes = jSONObject2.getBytes();
        int length = bytes.length + 4 + 16;
        if (length > 262144) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LogItem ");
            LIZ.append(jSONObject2);
            LIZ.append(" is too large. please check it.");
            X1D.LIZIZ(LIZ);
            InterfaceC64004PAa interfaceC64004PAa = PAU.LIZ;
            if (interfaceC64004PAa != null) {
                interfaceC64004PAa.LIZ();
            }
            return;
        }
        if (length > this.LIZIZ.remaining()) {
            LIZ();
        }
        this.LIZIZ.putInt(bytes.length);
        this.LIZIZ.putLong(j);
        this.LIZIZ.putLong(j2);
        this.LIZIZ.put(bytes);
        this.LIZIZ.putInt(8, this.LIZIZ.getInt(8) + 1);
        this.LIZIZ.putInt(12, this.LIZIZ.getInt(12) + length);
        if (this.LIZIZ.position() >= 131072 || this.LIZIZ.getInt(8) >= 100) {
            LIZ();
        }
    }
}
