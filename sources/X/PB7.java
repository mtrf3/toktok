package X;

import com.bytedance.apm.doctor.DoctorManager;
import java.nio.ByteBuffer;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PB7 {
    public final long LIZ;
    public final ByteBuffer LIZIZ = ByteBuffer.allocate(262162);

    public final synchronized void LIZ() {
        short s = this.LIZIZ.getShort(0);
        long j = this.LIZIZ.getLong(2);
        int i = this.LIZIZ.getInt(10);
        int i2 = this.LIZIZ.getInt(14);
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
            LIZIZ();
            LIZLLL();
            if (C78248UnM.LJIIJ()) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("flushToLimitedQueue cost=");
                LIZ2.append(System.nanoTime() - nanoTime);
                C64028PAy.LIZ("APM-Slardar", X1D.LIZIZ(LIZ2));
            }
            return;
        }
        if (C78248UnM.LJIIJ()) {
            C64028PAy.LIZ("APM-Slardar", "flushing: Skipped. no data to flush. reset buffer now.");
        }
        LIZLLL();
    }

    public final void LIZIZ() {
        this.LIZIZ.position(this.LIZIZ.getInt(14) + 18);
        this.LIZIZ.flip();
        PBF LIZ = PBF.LIZ(this.LIZIZ);
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

    public final void LIZLLL() {
        this.LIZIZ.clear();
        this.LIZIZ.putShort((short) 2082);
        this.LIZIZ.putLong(this.LIZ);
        this.LIZIZ.putInt(0);
        this.LIZIZ.putInt(0);
    }

    public PB7(long j) {
        this.LIZ = j;
        LIZLLL();
    }

    public final synchronized void LIZJ(JSONObject jSONObject) {
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
            PC2.LIZ(new PB9());
            return;
        }
        if (length > this.LIZIZ.remaining()) {
            LIZ();
        }
        this.LIZIZ.putInt(bytes.length);
        this.LIZIZ.put(bytes);
        this.LIZIZ.putInt(10, this.LIZIZ.getInt(10) + 1);
        this.LIZIZ.putInt(14, this.LIZIZ.getInt(14) + length);
        if (C78248UnM.LJIIJ()) {
            C64028PAy.LIZ("APM-Slardar", C16880lQ.LLLZ("push success: totalCount=%s, totalBytes=%s, logItem=%s", new Object[]{Integer.valueOf(this.LIZIZ.getInt(10)), Integer.valueOf(this.LIZIZ.getInt(14)), jSONObject2}));
        }
        if (this.LIZIZ.position() >= 262134 || this.LIZIZ.getInt(10) >= 256) {
            LIZ();
        }
    }
}
