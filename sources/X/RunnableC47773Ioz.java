package X;

import Y.ARunnableS14S0110000_8;
import android.os.Handler;
import com.ss.ttvideoengine.utils.TTVideoEngineLog;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: X.Ioz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class RunnableC47773Ioz implements Runnable {
    public final C47828Ips LJLIL;
    public final Handler LJLILLLLZI = new Handler(C16880lQ.LLJJJJ());
    public final C47752Ioe LJLJI;
    public final C47817Iph LJLJJI;

    public final void LIZ() {
        boolean z;
        if (this.LJLIL == null) {
            return;
        }
        C47752Ioe c47752Ioe = this.LJLJI;
        if (c47752Ioe != null && c47752Ioe.LJJZZI) {
            z = true;
        } else {
            z = false;
        }
        C47817Iph c47817Iph = this.LJLJJI;
        HashMap hashMap = new HashMap();
        if (c47752Ioe != null) {
            C60903NvH.LJJIJIIJI("player_sessionid", c47752Ioe.LJIILL, hashMap);
            C60903NvH.LJJIJIIJI("v", c47752Ioe.LJJI, hashMap);
            C60903NvH.LJJIJIIJI("pc", c47752Ioe.LJFF, hashMap);
            C60903NvH.LJJIJIIJI("sv", c47752Ioe.LJI, hashMap);
            C60903NvH.LJJIJIIJI("sdk_version", c47752Ioe.LJIIIIZZ, hashMap);
            C60903NvH.LJJIJIIJI("vtype", c47752Ioe.LJJIJLIJ, hashMap);
        }
        C60903NvH.LJJIJIIJI("abrv", c47817Iph.LIZLLL, hashMap);
        C60903NvH.LJJIJ(c47817Iph.LIZIZ, "cost_time", hashMap);
        C60903NvH.LJJIJ(c47817Iph.LIZ, "pr_time", hashMap);
        C60903NvH.LJJIJIIJI("end_type", c47817Iph.LIZJ, hashMap);
        C60903NvH.LJJIJ(c47817Iph.LJ, "old_br", hashMap);
        C60903NvH.LJJIJ(c47817Iph.LJFF, "new_br", hashMap);
        C60903NvH.LJJIJ(c47817Iph.LJI, "max_buf", hashMap);
        C60903NvH.LJJIJ(c47817Iph.LJII, "abuf", hashMap);
        C60903NvH.LJJIJ(c47817Iph.LJIIIIZZ, "vbuf", hashMap);
        C60903NvH.LJJIIZ(c47817Iph.LJIIIZ, "netspeed", hashMap);
        C60903NvH.LJJIJ(c47817Iph.LJIIJ, "delaytime", hashMap);
        C60903NvH.LJJIIZI(c47817Iph.LJIIJJI, "tonew", hashMap);
        C60903NvH.LJJIIZI(c47817Iph.LJIIL, "reason", hashMap);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AbrSwitch:");
        LIZ.append(hashMap.toString());
        TTVideoEngineLog.d("VideoEventAbrEvent", X1D.LIZIZ(LIZ));
        JSONObject jSONObject = new JSONObject(hashMap);
        Handler handler = this.LJLILLLLZI;
        if (handler == null || handler.getLooper() == null) {
            EnumC47567Ilf.instance.addEventV2(z, jSONObject, "videoplayer_abrswitch");
        } else {
            this.LJLILLLLZI.post(new ARunnableS14S0110000_8(z, jSONObject, 4));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC47773Ioz(C47828Ips c47828Ips, C47752Ioe c47752Ioe, C47817Iph c47817Iph) {
        this.LJLIL = c47828Ips;
        this.LJLJI = c47752Ioe;
        this.LJLJJI = c47817Iph;
    }
}
