package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.Ioo, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47762Ioo {
    public C47752Ioe LIZ;
    public int LJFF;
    public boolean LJII;
    public long LIZLLL = -2147483648L;
    public long LJ = -2147483648L;
    public ArrayList<String> LJI = new ArrayList<>();
    public HashMap LIZIZ = new HashMap();
    public C47794IpK LIZJ = new C47794IpK();

    public final long LIZIZ() {
        if (this.LIZJ.LJFF > 0) {
            return 0L;
        }
        synchronized (this.LIZIZ) {
            if (this.LIZIZ.containsKey("seek")) {
                return ((Long) this.LIZIZ.get("seek")).longValue();
            }
            return -1L;
        }
    }

    public final void LIZJ() {
        synchronized (this.LIZIZ) {
            this.LIZIZ = new HashMap();
        }
        this.LJFF = 0;
        this.LJI = new ArrayList<>();
    }

    public C47762Ioo(C47752Ioe c47752Ioe) {
        this.LIZ = c47752Ioe;
    }

    public final void LIZ(int i, String str) {
        InterfaceC46858IaE interfaceC46858IaE;
        String[] split;
        C47794IpK c47794IpK = this.LIZJ;
        if (c47794IpK.LJFF <= 0 || c47794IpK.LIZ.isEmpty()) {
            TTVideoEngineLog.d("VideoEventOneOpera", "endSeek without beginSeek, return.");
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("endSeek, from ");
        LIZ.append(this.LIZJ.LIZIZ);
        LIZ.append(" to ");
        LIZ.append(this.LIZJ.LIZJ);
        TTVideoEngineLog.d("VideoEventOneOpera", X1D.LIZIZ(LIZ));
        long currentTimeMillis = System.currentTimeMillis();
        C47794IpK c47794IpK2 = this.LIZJ;
        c47794IpK2.LJI = currentTimeMillis;
        long j = currentTimeMillis - c47794IpK2.LJFF;
        c47794IpK2.LIZLLL = j;
        if (j > 0) {
            this.LJFF = (int) (this.LJFF + j);
        }
        c47794IpK2.LJ = str;
        c47794IpK2.LJIIIIZZ = i;
        C47752Ioe c47752Ioe = this.LIZ;
        if (c47752Ioe != null && (interfaceC46858IaE = c47752Ioe.LIZ) != null) {
            String LJ = ((C47619ImV) interfaceC46858IaE).LJ(151);
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(LJ) && (split = LJ.split(";|=")) != null && split.length != 0) {
                for (int i2 = 0; i2 < split.length - 1; i2 += 2) {
                    try {
                        hashMap.put(split[i2], Long.valueOf(CastLongProtector.parseLong(split[i2 + 1])));
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
            if (hashMap.get("s_looper_t") != null) {
                this.LIZJ.LJJ = ((Long) hashMap.get("s_looper_t")).longValue();
            }
            if (hashMap.get("s_operate_t") != null) {
                this.LIZJ.LJJI = ((Long) hashMap.get("s_operate_t")).longValue();
            }
            if (hashMap.get("s_exe_begin_t") != null) {
                this.LIZJ.LJJIFFI = ((Long) hashMap.get("s_exe_begin_t")).longValue();
            }
            if (hashMap.get("s_avformat_seek_t") != null) {
                this.LIZJ.LJJII = ((Long) hashMap.get("s_avformat_seek_t")).longValue();
            }
            if (hashMap.get("s_c_complete_t") != null) {
                this.LIZJ.LJJIII = ((Long) hashMap.get("s_c_complete_t")).longValue();
            }
            if (hashMap.get("s_re_f_packet_t") != null) {
                this.LIZJ.LJJIIJ = ((Long) hashMap.get("s_re_f_packet_t")).longValue();
            }
            if (hashMap.get("s_de_f_audiopacket_t") != null) {
                this.LIZJ.LJJIIJZLJL = ((Long) hashMap.get("s_de_f_audiopacket_t")).longValue();
            }
            if (hashMap.get("s_de_f_audioframe_t") != null) {
                this.LIZJ.LJJIIZ = ((Long) hashMap.get("s_de_f_audioframe_t")).longValue();
            }
            if (hashMap.get("s_render_f_t") != null) {
                this.LIZJ.LJJIIZI = ((Long) hashMap.get("s_render_f_t")).longValue();
            }
            C47794IpK c47794IpK3 = this.LIZJ;
            C47752Ioe c47752Ioe2 = this.LIZ;
            c47794IpK3.LJIILL = c47752Ioe2.LJJJ;
            c47794IpK3.LJIIZILJ = c47752Ioe2.LJJJI;
            java.util.Map<String, Long> LIZ2 = ((C47619ImV) c47752Ioe2.LIZ).LIZ();
            if (LIZ2 != null) {
                C47794IpK c47794IpK4 = this.LIZJ;
                HashMap hashMap2 = (HashMap) LIZ2;
                Object obj = hashMap2.get("vlen");
                Long valueOf = Long.valueOf(this.LIZJ.LJIIIZ);
                if (obj == null) {
                    obj = valueOf;
                }
                c47794IpK4.LJIIIZ = ((Long) obj).longValue();
                C47794IpK c47794IpK5 = this.LIZJ;
                Object obj2 = hashMap2.get("alen");
                Long valueOf2 = Long.valueOf(this.LIZJ.LJIIJ);
                if (obj2 == null) {
                    obj2 = valueOf2;
                }
                c47794IpK5.LJIIJ = ((Long) obj2).longValue();
            }
        }
        HashMap hashMap3 = new HashMap();
        hashMap3.put("fr", this.LIZJ.LIZIZ);
        hashMap3.put("to", this.LIZJ.LIZJ);
        hashMap3.put("t", Long.valueOf(this.LIZJ.LJI));
        hashMap3.put("c", Long.valueOf(this.LIZJ.LIZLLL));
        this.LJI.add(new JSONObject(hashMap3).toString());
        this.LIZ.LJIILJJIL();
        synchronized (this.LIZIZ) {
            if (this.LIZIZ.containsKey(this.LIZJ.LIZ)) {
                long longValue = ((Long) this.LIZIZ.get(this.LIZJ.LIZ)).longValue();
                if (longValue > 0) {
                    C47794IpK c47794IpK6 = this.LIZJ;
                    c47794IpK6.LJIJ = c47794IpK6.LJFF - longValue;
                }
            }
            this.LIZIZ.remove(this.LIZJ.LIZ);
            HashMap hashMap4 = this.LIZIZ;
            C47794IpK c47794IpK7 = this.LIZJ;
            hashMap4.put(c47794IpK7.LIZ, Long.valueOf(c47794IpK7.LJI));
        }
        this.LIZLLL = -2147483648L;
        this.LJ = -2147483648L;
        if (this.LJII) {
            C78253UnR.LJI("VideoEventOneOpera", "report async");
            EngineThreadPool.addExecuteTask(new RunnableC47760Iom(this, this.LIZ, this.LIZJ));
        }
        this.LIZJ = new C47794IpK();
    }
}
