package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.Iol, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47759Iol {
    public C47752Ioe LIZ;
    public final C47762Ioo LIZIZ;
    public long LJ;
    public ArrayList<String> LJFF = new ArrayList<>();
    public long LJI = -2147483648L;
    public int LJII = 0;
    public HashMap LIZJ = new HashMap();
    public C47785IpB LIZLLL = new C47785IpB();

    public final long LIZ() {
        if (this.LIZLLL.LJFF > 0) {
            return 0L;
        }
        synchronized (this.LIZJ) {
            if (this.LIZJ.containsKey("block_net")) {
                return ((Long) this.LIZJ.get("block_net")).longValue();
            }
            return -1L;
        }
    }

    public final void LIZIZ(String str) {
        InterfaceC46858IaE interfaceC46858IaE;
        C47785IpB c47785IpB = this.LIZLLL;
        if (c47785IpB.LJFF <= 0 || c47785IpB.LIZ.isEmpty()) {
            TTVideoEngineLog.d("VideoEventOneEvent", "movieStallEnd without movieStalled, return.");
            C47785IpB c47785IpB2 = this.LIZLLL;
            c47785IpB2.LIZLLL = -2147483648L;
            c47785IpB2.LJ = -1;
            return;
        }
        this.LIZLLL.LJI = System.currentTimeMillis();
        TTVideoEngineLog.d("VideoEventOneEvent", "movieStallEnd");
        C47785IpB c47785IpB3 = this.LIZLLL;
        long j = c47785IpB3.LJI - c47785IpB3.LJFF;
        c47785IpB3.LIZIZ = j;
        if (j > 0) {
            this.LJ += j;
        }
        c47785IpB3.LIZJ = str;
        c47785IpB3.LJII = this.LIZIZ.LIZIZ();
        C47785IpB c47785IpB4 = this.LIZLLL;
        if (c47785IpB4.LJII == 0) {
            c47785IpB4.LJII = c47785IpB4.LJFF;
        }
        C47752Ioe c47752Ioe = this.LIZ;
        if (c47752Ioe != null && (interfaceC46858IaE = c47752Ioe.LIZ) != null) {
            c47785IpB4.LJJIIZI = c47752Ioe.LJJJ;
            c47785IpB4.LJJIJIIJI = c47752Ioe.LJJJI;
            c47785IpB4.LJJIJL = c47752Ioe.LJJJZ;
            java.util.Map<String, Long> LIZ = ((C47619ImV) interfaceC46858IaE).LIZ();
            if (LIZ != null) {
                HashMap hashMap = (HashMap) LIZ;
                this.LIZLLL.LJIIL = C47756Ioi.LJIJI((Long) hashMap.get("vlen"));
                this.LIZLLL.LJIILIIL = C47756Ioi.LJIJI((Long) hashMap.get("alen"));
                this.LIZLLL.LJIIZILJ = C47756Ioi.LJIJI((Long) hashMap.get("vDecLen"));
                this.LIZLLL.LJIJJLI = C47756Ioi.LJIJI((Long) hashMap.get("vBaseLen"));
                this.LIZLLL.LJIJI = C47756Ioi.LJIJI((Long) hashMap.get("aDecLen"));
                this.LIZLLL.LJJ = C47756Ioi.LJIJI((Long) hashMap.get("aBaseLen"));
                this.LIZLLL.LJJIIJZLJL = C47756Ioi.LJIJI((Long) hashMap.get("avGap"));
            }
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("p", Integer.valueOf(this.LIZLLL.LJIIIIZZ));
        hashMap2.put("t", Long.valueOf(this.LIZLLL.LJI));
        hashMap2.put("c", Long.valueOf(this.LIZLLL.LIZIZ));
        C47752Ioe c47752Ioe2 = this.LIZ;
        if (c47752Ioe2 != null && "dash".equals(c47752Ioe2.LJJIJLIJ)) {
            C47785IpB c47785IpB5 = this.LIZLLL;
            long j2 = c47785IpB5.LJIIJ;
            if (j2 > -1 && c47785IpB5.LJIIJJI > -1) {
                hashMap2.put("vb", Long.valueOf(j2));
                hashMap2.put("ab", Long.valueOf(this.LIZLLL.LJIIJJI));
            }
        }
        this.LJFF.add(new JSONObject(hashMap2).toString());
        this.LIZ.LJIILJJIL();
        C78253UnR.LJI("VideoEventOneEvent", "report async");
        EngineThreadPool.addExecuteTask(new RunnableC47754Iog(this, this.LIZ, this.LIZLLL));
        C47752Ioe c47752Ioe3 = this.LIZ;
        if (c47752Ioe3 != null && c47752Ioe3.LIZ != null) {
            HashMap hashMap3 = new HashMap();
            hashMap3.put("cost_time", Long.valueOf(this.LIZLLL.LIZIZ));
            hashMap3.put("exit_type", this.LIZLLL.LIZJ);
            JSONObject LJIIIIZZ = this.LIZ.LJIIIIZZ();
            if (LJIIIIZZ != null) {
                if (!LJIIIIZZ.isNull("video")) {
                    try {
                        C47752Ioe c47752Ioe4 = this.LIZ;
                        JSONObject jSONObject = JSONObjectProtectorUtils.getJSONObject(LJIIIIZZ, "video");
                        c47752Ioe4.getClass();
                        C47782Ip8 c47782Ip8 = new C47782Ip8();
                        c47782Ip8.LIZ(jSONObject);
                        hashMap3.put("cur_url", c47782Ip8.LIZLLL);
                        hashMap3.put("cur_ip", c47782Ip8.LIZIZ);
                        hashMap3.put("cur_host", UriProtector.parse(c47782Ip8.LIZLLL).getHost());
                    } catch (Exception e) {
                        TTVideoEngineLog.d(e);
                    }
                }
            } else {
                hashMap3.put("cur_url", this.LIZ.LJIJ);
                hashMap3.put("cur_ip", this.LIZ.LJIJI);
                try {
                    hashMap3.put("cur_host", UriProtector.parse(this.LIZ.LJIJ).getHost());
                } catch (Exception e2) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("_triggerBufferEndCb:");
                    LIZ2.append(e2.toString());
                    C78253UnR.LJI("VideoEventOneEvent", X1D.LIZIZ(LIZ2));
                }
            }
            ((C47619ImV) this.LIZ.LIZ).LJI(1, hashMap3);
        }
        this.LIZLLL = new C47785IpB();
    }

    public C47759Iol(C47752Ioe c47752Ioe, C47762Ioo c47762Ioo) {
        this.LIZ = c47752Ioe;
        this.LIZIZ = c47762Ioo;
    }
}
