package X;

import com.ss.ttvideoengine.TTVideoEngine;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.Ior, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47765Ior {
    public C47752Ioe LIZ;
    public ArrayList<String> LIZJ = new ArrayList<>();
    public int LIZLLL = 0;
    public int LJ = 0;
    public long LJFF = -2147483648L;
    public long LJI = -2147483648L;
    public long LJII = -2147483648L;
    public long LJIIIIZZ = -2147483648L;
    public int LJIIIZ = 0;
    public C47783Ip9 LIZIZ = new C47783Ip9();

    public final void LIZIZ() {
        long j;
        C47752Ioe c47752Ioe = this.LIZ;
        if (c47752Ioe != null && c47752Ioe.LIZ != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("begin_pos", Integer.valueOf(this.LIZIZ.LJIIZILJ));
            hashMap.put("end_pos", Integer.valueOf(this.LIZIZ.LJIJ));
            hashMap.put("render_drop_cnt", Integer.valueOf(this.LIZIZ.LIZLLL));
            hashMap.put("container_fps", Float.valueOf(((C47619ImV) this.LIZ.LIZ).LIZIZ(82)));
            hashMap.put("video_out_fps", Float.valueOf(((C47619ImV) this.LIZ.LIZ).LIZIZ(83)));
            hashMap.put("clock_diff", Long.valueOf(((C47619ImV) this.LIZ.LIZ).LIZLLL(45)));
            int LIZJ = ((C47619ImV) this.LIZ.LIZ).LIZJ(84);
            if (LIZJ > 0) {
                j = 1000 / LIZJ;
            } else {
                j = 0;
            }
            hashMap.put("decode_time", Long.valueOf(j));
            ((C47619ImV) this.LIZ.LIZ).LJI(4, hashMap);
        }
    }

    public C47765Ior(C47752Ioe c47752Ioe) {
        this.LIZ = c47752Ioe;
    }

    public final void LIZ(int i, String str) {
        if (this.LIZIZ.LIZ <= 0) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Invalid start time, return.");
            LIZ.append(this.LIZIZ.LIZ);
            TTVideoEngineLog.w("VideoEventOneOutSync", X1D.LIZIZ(LIZ));
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        C47783Ip9 c47783Ip9 = this.LIZIZ;
        long j = currentTimeMillis - c47783Ip9.LIZ;
        if (j <= 200) {
            LIZIZ();
            this.LIZIZ = new C47783Ip9();
            return;
        }
        c47783Ip9.LJIJJ = str;
        c47783Ip9.LJIJ = i;
        c47783Ip9.LIZIZ = currentTimeMillis;
        c47783Ip9.LJIJI = j;
        this.LJ++;
        this.LIZLLL++;
        C47752Ioe c47752Ioe = this.LIZ;
        if (c47752Ioe != null) {
            c47783Ip9.LJIIJJI = c47752Ioe.LJJJ;
            c47783Ip9.LJIILIIL = c47752Ioe.LJJJI;
            c47783Ip9.LJJ = c47752Ioe.LJJJZ;
            InterfaceC46858IaE interfaceC46858IaE = c47752Ioe.LIZ;
            if (interfaceC46858IaE != null) {
                c47783Ip9.LIZLLL = ((C47619ImV) interfaceC46858IaE).LIZJ(79);
                if (TTVideoEngine.LJIIZILJ == 0) {
                    this.LIZIZ.LIZJ = ((C47619ImV) this.LIZ.LIZ).LJ(78);
                    this.LIZIZ.LJIILJJIL = ((C47619ImV) this.LIZ.LIZ).LJ(80);
                }
                this.LIZIZ.LJJIJ = ((C47619ImV) this.LIZ.LIZ).LIZLLL(96);
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ps", Integer.valueOf(this.LIZIZ.LJIIZILJ));
        hashMap.put("pe", Integer.valueOf(this.LIZIZ.LJIJ));
        hashMap.put("st", Long.valueOf(this.LIZIZ.LIZ));
        hashMap.put("c", Long.valueOf(this.LIZIZ.LJIJI));
        this.LIZJ.add(new JSONObject(hashMap).toString());
        C78253UnR.LJI("VideoEventOneOutSync", "report oussync event");
        this.LIZ.LJIILJJIL();
        EngineThreadPool.addExecuteTask(new RunnableC47757Ioj(this, this.LIZ, this.LIZIZ));
        LIZIZ();
        this.LIZIZ = new C47783Ip9();
    }
}
