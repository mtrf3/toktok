package X;

import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.google.gson.g;
import com.google.gson.j;
import com.google.gson.m;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.PtM, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC65880PtM implements Runnable {
    public final /* synthetic */ C64738Paw LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ C64668PZo<?> LJLJI;
    public final /* synthetic */ long LJLJJI;
    public final /* synthetic */ long LJLJJL;
    public final /* synthetic */ BLW LJLJJLL;

    public RunnableC65880PtM(long j, long j2, long j3, BLW blw, C64672PZs c64672PZs, C64738Paw c64738Paw) {
        this.LJLIL = c64738Paw;
        this.LJLILLLLZI = j;
        this.LJLJI = c64672PZs;
        this.LJLJJI = j2;
        this.LJLJJL = j3;
        this.LJLJJLL = blw;
    }

    public final void LIZ() {
        boolean z;
        m mVar;
        m mVar2;
        m mVar3;
        long j;
        long j2;
        long j3;
        long j4;
        g LJJIJIIJI;
        j LJJIJ;
        j LJJIJ2;
        j LJJIJ3;
        HashMap hashMap = new HashMap();
        if (this.LJLIL.LJIILL != 0) {
            hashMap.put("sync", "1");
            z = true;
        } else {
            hashMap.put("sync", CardStruct.IStatusCode.DEFAULT);
            z = false;
        }
        hashMap.put("start_request", String.valueOf(this.LJLILLLLZI));
        C7MY.LJFF(this.LJLIL.LJII, this.LJLILLLLZI, hashMap, "observer_time");
        if (!z) {
            C64738Paw c64738Paw = this.LJLIL;
            C7MY.LJFF(c64738Paw.LJIIZILJ, c64738Paw.LJIJI, hashMap, "async_schedule_time");
        }
        C64738Paw c64738Paw2 = this.LJLIL;
        C7MY.LJFF(c64738Paw2.LJIIZILJ, c64738Paw2.LJIJ, hashMap, "request_serializer_time");
        C64738Paw c64738Paw3 = this.LJLIL;
        C7MY.LJFF(c64738Paw3.LJIIIZ, c64738Paw3.LJIIIIZZ, hashMap, "request_filter_time");
        hashMap.put("real_call_start", String.valueOf(this.LJLJI.LJ));
        m LJ = C38393F4z.LJ(this.LJLJI.LJIL);
        m mVar4 = null;
        if (LJ != null) {
            mVar = LJ.LJJIJIL("timing");
        } else {
            mVar = null;
        }
        m LJ2 = C38393F4z.LJ(this.LJLJI.LJIL);
        if (LJ2 != null) {
            mVar2 = LJ2.LJJIJIL("base");
        } else {
            mVar2 = null;
        }
        if (mVar != null) {
            mVar4 = mVar.LJJIJIL("detailed_duration");
            mVar3 = mVar.LJJIJIL("request");
        } else {
            mVar3 = null;
        }
        if (mVar4 != null && (LJJIJ3 = mVar4.LJJIJ("inner")) != null) {
            j = LJJIJ3.LJIJJLI();
        } else {
            j = -1;
        }
        if (mVar3 != null && (LJJIJ2 = mVar3.LJJIJ("duration")) != null) {
            j2 = LJJIJ2.LJIJJLI();
        } else {
            j2 = -1;
        }
        hashMap.put("dns_time", String.valueOf(this.LJLJI.LJIIIZ));
        if (mVar4 != null && (LJJIJ = mVar4.LJJIJ("rtt")) != null) {
            j3 = LJJIJ.LJIJJLI();
        } else {
            j3 = -1;
        }
        hashMap.put("rtt_time", String.valueOf(j3));
        hashMap.put("connect_time", String.valueOf(this.LJLJI.LJIIJ));
        hashMap.put("inner_time", String.valueOf(j));
        hashMap.put("ttnet_total_time", String.valueOf(j2));
        hashMap.put("network_time", String.valueOf(j2 - j));
        hashMap.put("real_call_end", String.valueOf(this.LJLJI.LJII));
        C64738Paw c64738Paw4 = this.LJLIL;
        C7MY.LJFF(c64738Paw4.LJJ, c64738Paw4.LJIL, hashMap, "response_serializer_time");
        if (z) {
            j4 = this.LJLIL.LJJJJL;
        } else {
            j4 = this.LJLIL.LJJJJJL;
        }
        C7MY.LJFF(j4, this.LJLIL.LJJ, hashMap, "response_filter_time");
        C7MY.LJFF(this.LJLJJI, j4, hashMap, "observer_callback_time");
        hashMap.put("finish_request", String.valueOf(this.LJLJJL));
        C7MY.LJFF(this.LJLJJL, this.LJLILLLLZI, hashMap, "request_total_time");
        C64668PZo<?> c64668PZo = this.LJLJI;
        C7MY.LJFF(c64668PZo.LJII, c64668PZo.LJ, hashMap, "net_call_time");
        String str = this.LJLJJLL.LIZIZ;
        if (str != null) {
            hashMap.put("enter_from_merge", str);
        }
        String str2 = this.LJLJJLL.LIZJ;
        if (str2 != null) {
            hashMap.put("enter_method", str2);
        }
        String str3 = this.LJLJJLL.LIZ;
        if (str3 != null) {
            hashMap.put("action_type", str3);
        }
        String str4 = this.LJLJJLL.LIZLLL;
        if (str4 != null) {
            hashMap.put("log_id", str4);
        }
        String str5 = this.LJLJJLL.LJ;
        if (str5 != null) {
            hashMap.put("path", str5);
        }
        String str6 = this.LJLJJLL.LJFF;
        if (str6 != null) {
            hashMap.put(WM7.SCENE_SERVICE, str6);
        }
        String str7 = this.LJLJJLL.LJI;
        if (str7 != null) {
            hashMap.put("is_from_ec", str7);
        }
        if (mVar2 != null && (LJJIJIIJI = mVar2.LJJIJIIJI("redirecting_list")) != null && LJJIJIIJI.size() > 0) {
            String jVar = LJJIJIIJI.LJJIIZ(LJJIJIIJI.size() - 1).toString();
            o.LJIIIIZZ(jVar, "it[it.size() - 1].toString()");
            hashMap.put("host", jVar);
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_room_enter_full_link_duration");
        LIZ.LJIIZILJ();
        LIZ.LJJIFFI(hashMap);
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(LIZ.LJIILL())) {
            LIZ.LJJIIJZLJL();
        } else {
            LIZ.LJJIJ();
            LIZ.LJJIIZI();
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
}
