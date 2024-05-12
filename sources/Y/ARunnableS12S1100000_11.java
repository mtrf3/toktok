package Y;

import X.C0MT;
import X.C10060aQ;
import X.C16880lQ;
import X.C40700FyC;
import X.C64264PKa;
import X.C64278PKo;
import X.C64863Pcx;
import X.C64869Pd3;
import X.C65819PsN;
import X.C65926Pu6;
import X.C67714Qhq;
import X.C68542QvC;
import X.C78248UnM;
import X.C78685UuP;
import X.C78939UyV;
import X.EGD;
import X.InterfaceC64313PLx;
import X.J8T;
import X.PCB;
import X.PEF;
import X.PHC;
import X.PI9;
import X.PK0;
import X.PK8;
import X.PKO;
import X.PKQ;
import X.PL1;
import X.PL9;
import X.Q6Y;
import X.QET;
import X.QTX;
import X.QTZ;
import X.X1D;
import android.text.TextUtils;
import com.bytedance.common.wschannel.channel.IWsChannelClient;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ttnet.org.chromium.net.impl.CronetUrlRequest;
import com.ttnet.org.chromium.net.impl.CronetWebsocketConnection;
import defpackage.b0;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AqS161S0100000_11;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class ARunnableS12S1100000_11 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            case 5:
                run$5(this);
                return;
            case 6:
                run$6(this);
                return;
            case 7:
                run$7(this);
                return;
            case 8:
                run$8(this);
                return;
            case 9:
                run$9(this);
                return;
            case 10:
                run$10(this);
                return;
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                run$11(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        ((CronetUrlRequest) this.l1).LJIJJ();
        synchronized (((CronetUrlRequest) this.l1).LJFF) {
            if (((CronetUrlRequest) this.l1).LJJIFFI()) {
                return;
            }
            CronetUrlRequest cronetUrlRequest = (CronetUrlRequest) this.l1;
            cronetUrlRequest.LJ = true;
            try {
                cronetUrlRequest.LJIIIZ.LJI(cronetUrlRequest, cronetUrlRequest.LJJII, this.s0);
            } catch (Exception e) {
                ((CronetUrlRequest) this.l1).LJJIII(e);
            }
        }
    }

    public final void LIZ$1() {
        QET qet = (QET) this.l1;
        qet.LJIIJ = URI.create(qet.LJII).resolve(this.s0).toString();
        QET qet2 = (QET) this.l1;
        ((ArrayList) qet2.LIZIZ).add(qet2.LJIIJ);
        ((QET) this.l1).LJIL(2, 3, new ARunnableS47S0100000_11(this, 75));
    }

    public final void LIZ$2() {
        long currentTimeMillis;
        if (PKQ.LJII) {
            return;
        }
        String[] split = this.s0.substring(9).split("_");
        if (split.length >= 1) {
            try {
                currentTimeMillis = Long.decode(split[0]).longValue();
            } catch (Throwable unused) {
                currentTimeMillis = System.currentTimeMillis();
            }
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        try {
            C78685UuP.LJLILLLLZI();
            File file = new File(((PL9) this.l1).LIZ, this.s0);
            PKO.LJIIJ(file, PK8.LJ(file), currentTimeMillis, false);
        } catch (IOException unused2) {
        }
    }

    public final void LIZ$3() {
        if (((PHC) this.l1).LJLZ == null) {
            C78248UnM.LJIIJ();
        }
        Map<String, PI9<Long, Long>> map = ((PHC) this.l1).LJLJJL;
        if (map == null || !map.containsKey(this.s0)) {
            if (C78248UnM.LJIIJ()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("stopMetric metric(");
                C0MT.LJ(LIZ, this.s0, ") not found", LIZ);
                return;
            }
            return;
        }
        long longValue = ((PHC) this.l1).LJLJJL.get(this.s0).LIZ.longValue();
        long LIZ2 = ((PHC) this.l1).LJLLLLLL.LIZ() - ((PHC) this.l1).LJLJJL.get(this.s0).LIZIZ.longValue();
        long LIZJ = ((PHC) this.l1).LJLLLLLL.LIZ.LIZJ() - ((PHC) this.l1).LJLJJLL.get(this.s0).LIZIZ.longValue();
        long LJIILL = ((PHC) this.l1).LJLLLLLL.LIZ.LJIILL() - ((PHC) this.l1).LJLJL.get(this.s0).LIZIZ.longValue();
        ((PHC) this.l1).LJLJJL.remove(this.s0);
        ((PHC) this.l1).LJLJJLL.remove(this.s0);
        ((PHC) this.l1).LJLJL.remove(this.s0);
        if (LIZ2 < 0) {
            if (C78248UnM.LJIIJ()) {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append("stopMetric metric(");
                b0.LJ(LIZ3, this.s0, ") metricValue < 0:", LIZ2);
                X1D.LIZIZ(LIZ3);
            }
            EGD.LIZ.LJI(this.s0);
            return;
        }
        Map<String, J8T> LJIILIIL = EGD.LIZ.LJIILIIL(this.s0);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("init_ts", longValue);
            jSONObject.put("usage_ts", System.currentTimeMillis());
            if (LJIILIIL != null && LJIILIIL.size() > 0) {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                try {
                    Iterator<Map.Entry<String, J8T>> it = LJIILIIL.entrySet().iterator();
                    while (it.hasNext()) {
                        JSONObject LIZ4 = it.next().getValue().LIZ();
                        LIZ4.put("traffic_category", this.s0);
                        jSONArray.put(LIZ4);
                    }
                    jSONObject2.put("usage", jSONArray);
                    jSONObject.put("detail", jSONObject2);
                } catch (JSONException unused) {
                }
            }
            EGD.LIZ.LJI(this.s0);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(this.s0, LIZ2);
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(this.s0);
            LIZ5.append("$");
            LIZ5.append("wifi");
            jSONObject3.put(X1D.LIZIZ(LIZ5), LIZJ);
            StringBuilder LIZ6 = X1D.LIZ();
            LIZ6.append(this.s0);
            LIZ6.append("$");
            LIZ6.append("mobile");
            jSONObject3.put(X1D.LIZIZ(LIZ6), LJIILL);
            PEF pef = new PEF();
            pef.LIZ = "traffic";
            pef.LIZLLL = jSONObject3;
            pef.LJI = jSONObject;
            PCB pcb = new PCB("performance_monitor", pef.LIZ());
            if (((PHC) this.l1).LJLZ == null) {
                ((PHC) this.l1).LJLJI.LIZJ(pcb);
                ((PHC) this.l1).LJLJJI.LIZJ(this.s0);
                if (C78248UnM.LJIIJ()) {
                    return;
                } else {
                    return;
                }
            }
            PHC.LJ(pcb, ((PHC) this.l1).LJLZ.LIZ, this.s0);
        } catch (Exception e) {
            C10060aQ.LIZ.LIZIZ(e, "apm_error");
        }
    }

    public static final void run$0(ARunnableS12S1100000_11 aRunnableS12S1100000_11) {
        boolean LIZ;
        try {
            EGD.LIZ.LJ(aRunnableS12S1100000_11.s0, (JSONObject) aRunnableS12S1100000_11.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS12S1100000_11 aRunnableS12S1100000_11) {
        boolean LIZ;
        try {
            if (C64264PKa.LJII(PK0.LIZ)) {
                String str = aRunnableS12S1100000_11.s0;
                InterfaceC64313PLx interfaceC64313PLx = (InterfaceC64313PLx) aRunnableS12S1100000_11.l1;
                PL1 pl1 = C64278PKo.LIZLLL;
                if (pl1 != null) {
                    pl1.stopWatching();
                }
                PL1 pl12 = new PL1(str, interfaceC64313PLx, str);
                C64278PKo.LIZLLL = pl12;
                pl12.startWatching();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$10(ARunnableS12S1100000_11 aRunnableS12S1100000_11) {
        boolean LIZ;
        try {
            aRunnableS12S1100000_11.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$11(ARunnableS12S1100000_11 aRunnableS12S1100000_11) {
        boolean LIZ;
        try {
            C64869Pd3 c64869Pd3 = ((C64863Pcx) aRunnableS12S1100000_11.l1).LJLIL.LJLLI;
            if (c64869Pd3 != null) {
                String str = aRunnableS12S1100000_11.s0;
                IWsChannelClient iWsChannelClient = c64869Pd3.LIZ;
                if (iWsChannelClient != null) {
                    try {
                        iWsChannelClient.onMessage(str.getBytes("UTF-8"));
                    } catch (UnsupportedEncodingException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS12S1100000_11 aRunnableS12S1100000_11) {
        boolean LIZ;
        try {
            C65926Pu6.LIZIZ(aRunnableS12S1100000_11.s0, new AqS161S0100000_11(aRunnableS12S1100000_11, 1), 2, null, 8);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS12S1100000_11 aRunnableS12S1100000_11) {
        boolean LIZ;
        try {
            aRunnableS12S1100000_11.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS12S1100000_11 aRunnableS12S1100000_11) {
        boolean LIZ;
        try {
            try {
                ((CronetWebsocketConnection) aRunnableS12S1100000_11.l1).LIZIZ.LIZJ(aRunnableS12S1100000_11.s0);
            } catch (Exception e) {
                C78939UyV.LJII("Exception in callback: ", e);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS12S1100000_11 aRunnableS12S1100000_11) {
        boolean LIZ;
        try {
            aRunnableS12S1100000_11.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS12S1100000_11 aRunnableS12S1100000_11) {
        boolean LIZ;
        try {
            if (!C40700FyC.LIZ(aRunnableS12S1100000_11)) {
                try {
                    ((Q6Y) aRunnableS12S1100000_11.l1).getActivity().runOnUiThread(new ARunnableS30S0200000_11(aRunnableS12S1100000_11, C65819PsN.LJFF(aRunnableS12S1100000_11.s0), 48));
                } catch (Throwable unused) {
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS12S1100000_11 aRunnableS12S1100000_11) {
        boolean LIZ;
        try {
            C68542QvC c68542QvC = C68542QvC.LIZ;
            QTZ qtz = (QTZ) aRunnableS12S1100000_11.l1;
            String str = aRunnableS12S1100000_11.s0;
            c68542QvC.getClass();
            C68542QvC.LIZLLL(qtz, str);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS12S1100000_11 aRunnableS12S1100000_11) {
        boolean LIZ;
        try {
            aRunnableS12S1100000_11.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS12S1100000_11 aRunnableS12S1100000_11) {
        C67714Qhq c67714Qhq = (C67714Qhq) aRunnableS12S1100000_11.l1;
        String str = aRunnableS12S1100000_11.s0;
        c67714Qhq.LJLJI.setText(str);
        if (!TextUtils.isEmpty(str)) {
            c67714Qhq.LJLJI.setSelection(str.length());
        }
    }

    public ARunnableS12S1100000_11(QTX qtx, int i) {
        this.$t = i;
        this.l1 = qtx;
        this.s0 = "async refresh passport user info";
    }

    public ARunnableS12S1100000_11(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
