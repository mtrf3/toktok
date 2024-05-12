package X;

import android.text.TextUtils;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.Ip0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47774Ip0 {
    public C47752Ioe LIZ;
    public boolean LIZJ;
    public int LIZLLL;
    public int LJFF;
    public ArrayList<String> LJI;
    public ArrayList<String> LJII;
    public long LJ = -2147483648L;
    public C47784IpA LIZIZ = new C47784IpA();

    public C47774Ip0(C47752Ioe c47752Ioe) {
        this.LIZ = c47752Ioe;
    }

    public final void LIZ(String str) {
        String str2;
        InterfaceC46858IaE interfaceC46858IaE;
        if (!this.LIZJ) {
            return;
        }
        this.LIZJ = false;
        long currentTimeMillis = System.currentTimeMillis();
        C47784IpA c47784IpA = this.LIZIZ;
        long j = c47784IpA.LJIIIIZZ;
        if (j > 0) {
            c47784IpA.LJIIIZ = currentTimeMillis - j;
        }
        c47784IpA.LJIIZILJ = str;
        c47784IpA.LJIILLIIL = 0;
        c47784IpA.LJIIJJI = currentTimeMillis;
        C47752Ioe c47752Ioe = this.LIZ;
        if (c47752Ioe != null && (interfaceC46858IaE = c47752Ioe.LIZ) != null) {
            c47784IpA.LJJIIJZLJL = ((C47619ImV) interfaceC46858IaE).LIZJ(113);
            C47784IpA c47784IpA2 = this.LIZIZ;
            if (c47784IpA2.LIZ == 0) {
                c47784IpA2.LJJIZ = ((C47619ImV) this.LIZ.LIZ).LIZLLL(152);
                this.LIZIZ.LJJJ = ((C47619ImV) this.LIZ.LIZ).LIZLLL(153);
                this.LIZIZ.LJJJI = ((C47619ImV) this.LIZ.LIZ).LIZJ(154);
            }
        }
        C47784IpA c47784IpA3 = this.LIZIZ;
        HashMap hashMap = new HashMap();
        hashMap.put("st", Long.valueOf(c47784IpA3.LJIIIIZZ));
        hashMap.put("c", Long.valueOf(c47784IpA3.LJIIIZ));
        hashMap.put("reason", Integer.valueOf(c47784IpA3.LIZIZ));
        try {
            str2 = new JSONObject(hashMap).toString();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            str2 = null;
        }
        if (!TextUtils.isEmpty(str2)) {
            int i = this.LIZIZ.LIZ;
            if (i == 0) {
                if (this.LJII == null) {
                    this.LJII = new ArrayList<>();
                }
                this.LJII.add(str2);
            } else if (i == 1) {
                if (this.LJI == null) {
                    this.LJI = new ArrayList<>();
                }
                this.LJI.add(str2);
            }
        }
        if (this.LIZIZ.LJIIIZ < 1000) {
            TTVideoEngineLog.d("VideoEventOneNoRender", "duration less than threshold, abort event");
        } else {
            this.LIZLLL++;
            this.LIZ.LJIILJJIL();
            EngineThreadPool.addExecuteTask(new RunnableC47758Iok(this, this.LIZ, this.LIZIZ));
        }
        this.LIZIZ = new C47784IpA();
    }
}
