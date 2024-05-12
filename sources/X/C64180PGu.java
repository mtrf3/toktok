package X;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.PGu, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64180PGu {
    public int LIZ;
    public int LIZIZ;
    public long LIZJ;
    public long LIZLLL;
    public long LJ;
    public String LJFF;
    public String LJI;
    public String LJII;
    public String LJIIIIZZ;

    public JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("msg", this.LJFF);
            jSONObject.put("cpuDuration", this.LJ);
            jSONObject.put("duration", this.LIZLLL);
            jSONObject.put("tick", this.LIZJ);
            jSONObject.put("type", this.LIZIZ);
            jSONObject.put("count", this.LIZ);
            String str = this.LJI;
            if (str != null) {
                jSONObject.put("block_stack", str);
                jSONObject.put("block_uuid", this.LJIIIIZZ);
            }
            String str2 = this.LJII;
            if (str2 != null) {
                jSONObject.put("sblock_stack", str2);
                jSONObject.put("sblock_uuid", this.LJIIIIZZ);
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject;
    }

    public final String toString() {
        int i = this.LIZIZ;
        if (i == 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("[[[ IDLE  ]]] cost ");
            LIZ.append(this.LIZJ);
            LIZ.append(" tick , mDuration：");
            LIZ.append(this.LIZLLL);
            LIZ.append(",cpuTime:");
            LIZ.append(this.LJ);
            return X1D.LIZIZ(LIZ);
        }
        if (i == 1) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("[[[ Long IDLE  ]]] cost ");
            LIZ2.append(this.LIZJ);
            LIZ2.append(" tick , mDuration：");
            LIZ2.append(this.LIZLLL);
            LIZ2.append(",cpuTime:");
            LIZ2.append(this.LJ);
            return X1D.LIZIZ(LIZ2);
        }
        if (i == 2) {
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("[[[  1 msg  ]]] cost ");
            LIZ3.append(this.LIZJ);
            LIZ3.append(" tick , mDuration：");
            LIZ3.append(this.LIZLLL);
            LIZ3.append(",cpuTime:");
            LIZ3.append(this.LJ);
            LIZ3.append(", msg:");
            LIZ3.append(this.LJFF);
            return X1D.LIZIZ(LIZ3);
        }
        if (i == 3) {
            StringBuilder LIZ4 = X1D.LIZ();
            LIZ4.append("[[[ 1 msg + IDLE  ]]] cost ");
            LIZ4.append(this.LIZJ);
            LIZ4.append(" tick , mDuration：");
            LIZ4.append(this.LIZLLL);
            LIZ4.append(",cpuTime:");
            LIZ4.append(this.LJ);
            return X1D.LIZIZ(LIZ4);
        }
        if (i == 4) {
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append("[[[ ");
            LIZ5.append(this.LIZ - 1);
            LIZ5.append(" msgs  ]]] cost less than 1 tick, [[[  last msg ]]] cost more than ");
            C48339Iy7.LIZLLL(this.LIZJ, 1L, LIZ5, "tick ,, mDuration：");
            LIZ5.append(this.LIZLLL);
            LIZ5.append("cpuTime:");
            LIZ5.append(this.LJ);
            LIZ5.append(" msg:");
            LIZ5.append(this.LJFF);
            return X1D.LIZIZ(LIZ5);
        }
        if (i == 5) {
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append("[[[ ");
            LIZ6.append(this.LIZ);
            LIZ6.append(" msgs ]]] cost less than 1 tick but [[[  IDLE ]]] cost more than");
            C48339Iy7.LIZLLL(this.LIZJ, 1L, LIZ6, " ticks, , mDuration：");
            LIZ6.append(this.LIZLLL);
            LIZ6.append("cpuTime:");
            LIZ6.append(this.LJ);
            return X1D.LIZIZ(LIZ6);
        }
        if (i == 6) {
            StringBuilder LIZ7 = X1D.LIZ();
            LIZ7.append("[[[  1 msg  ]]] cost less than 1 tick , but [[[  IDLE ]]] cost more than");
            C48339Iy7.LIZLLL(this.LIZJ, 1L, LIZ7, ", , mDuration：");
            LIZ7.append(this.LIZLLL);
            LIZ7.append("cpuTime:");
            LIZ7.append(this.LJ);
            return X1D.LIZIZ(LIZ7);
        }
        if (i == 7) {
            StringBuilder LIZ8 = X1D.LIZ();
            LIZ8.append("[[[ ");
            LIZ8.append(this.LIZ);
            LIZ8.append(" msgs + IDLE  ]]] cost 1 tick , mDuration：");
            LIZ8.append(this.LIZLLL);
            LIZ8.append(" cost cpuTime:");
            LIZ8.append(this.LJ);
            return X1D.LIZIZ(LIZ8);
        }
        if (i == 8) {
            StringBuilder LIZ9 = X1D.LIZ();
            LIZ9.append("[[[ 1 msgs ]]] cost ");
            LIZ9.append(this.LIZJ);
            LIZ9.append(" ticks , mDuration：");
            LIZ9.append(this.LIZLLL);
            LIZ9.append(" cost cpuTime:");
            LIZ9.append(this.LJ);
            LIZ9.append(" msg:");
            LIZ9.append(this.LJFF);
            return X1D.LIZIZ(LIZ9);
        }
        if (i == 9) {
            StringBuilder LIZ10 = X1D.LIZ();
            LIZ10.append("[[[ ");
            LIZ10.append(this.LIZ);
            LIZ10.append(" msgs ]]] cost 1 tick , mDuration：");
            LIZ10.append(this.LIZLLL);
            LIZ10.append(" cost cpuTime:");
            LIZ10.append(this.LJ);
            return X1D.LIZIZ(LIZ10);
        }
        StringBuilder LIZ11 = X1D.LIZ();
        LIZ11.append("=========   UNKNOW =========  Type:");
        LIZ11.append(this.LIZIZ);
        LIZ11.append(" cost ticks ");
        LIZ11.append(this.LIZJ);
        LIZ11.append(" msgs:");
        LIZ11.append(this.LIZ);
        return X1D.LIZIZ(LIZ11);
    }
}
