package X;

import ccb.t;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftNewGifterBadgeSetting;
import com.ss.mediakit.medialoader.AVMDLDataLoader;
import com.ss.mediakit.medialoader.AVMDLDataLoaderConfigure;
import com.ss.mediakit.medialoader.AVMDLDataLoaderListener;
import com.ss.mediakit.medialoader.AVMDLDataLoaderNotifyInfo;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class VAW implements AVMDLDataLoaderListener {
    public VBN LIZ;
    public C48436Izg LIZIZ;

    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public final String getCheckSumInfo(String str) {
        return null;
    }

    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public final String getStringValue(int i, long j, String str) {
        return null;
    }

    public VAW() {
        AVMDLDataLoaderConfigure.getDefaultonfigure();
    }

    public static String LIZJ() {
        C46496IMq.LIZJ();
        AVMDLDataLoader aVMDLDataLoader = AVMDLDataLoader.getInstance();
        if (aVMDLDataLoader == null) {
            return null;
        }
        return aVMDLDataLoader.getStringValue(11);
    }

    public static VAW LIZ() {
        return VBB.LIZ;
    }

    public static long LIZIZ(int i) {
        C46496IMq.LIZJ();
        AVMDLDataLoader aVMDLDataLoader = AVMDLDataLoader.getInstance();
        if (i != 7218) {
            switch (i) {
                case 8100:
                    if (aVMDLDataLoader == null) {
                        return -1L;
                    }
                    return aVMDLDataLoader.getLongValue(8100);
                case 8101:
                    if (aVMDLDataLoader == null) {
                        return -1L;
                    }
                    return aVMDLDataLoader.getLongValue(8101);
                case 8102:
                    if (aVMDLDataLoader == null || aVMDLDataLoader.getLongValue(8102) != 1) {
                        return 0L;
                    }
                    return 1L;
                default:
                    return -1L;
            }
        }
        if (aVMDLDataLoader == null) {
            return -1L;
        }
        return aVMDLDataLoader.getLongValue(7218);
    }

    public final void LJ(VB2 vb2) {
        this.LIZ = vb2;
        try {
            AVMDLDataLoader.getInstance().setListener(107, this);
        } catch (Exception e) {
            StringBuilder LIZIZ = C59895Nf1.LIZIZ(e, "create loader failed: exception is");
            LIZIZ.append(e.toString());
            C16880lQ.LLLZ(X1D.LIZIZ(LIZIZ), new Object[0]);
            C46496IMq.LIZJ();
        }
    }

    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public final void onNotify(AVMDLDataLoaderNotifyInfo aVMDLDataLoaderNotifyInfo) {
        VAD vad;
        JSONObject LJFF;
        VAD vad2;
        JSONObject LJFF2;
        if (aVMDLDataLoaderNotifyInfo == null || this.LIZ == null) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("what:");
        UFE.LIZLLL(LIZ, aVMDLDataLoaderNotifyInfo.what, LIZ);
        int i = aVMDLDataLoaderNotifyInfo.what;
        if (i != 9) {
            if (i != 12) {
                return;
            }
            VBN vbn = this.LIZ;
            if (vbn != null) {
                int i2 = (int) aVMDLDataLoaderNotifyInfo.parameter;
                String str = aVMDLDataLoaderNotifyInfo.logInfo;
                t tVar = ((VB2) vbn).LIZ.get();
                if (tVar != null && tVar.LJLLL != null && (LJFF2 = (vad2 = tVar.LJLJJI).LJFF()) != null) {
                    try {
                        if (str.equals("cdn_to_p2p")) {
                            vad2.k = 1;
                        }
                        LJFF2.put("event_key", "p2p_switch").put("switch_info", str).put("p2p_vendor", LiveGiftNewGifterBadgeSetting.DEFAULT).put("reason", i2);
                        vad2.LJJI("live_client_monitor_log", LJFF2);
                        long j = vad2.LLLLII;
                        if (j > 0) {
                            vad2.LLLLII = j + 1;
                        }
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("switch reason:");
            LIZ2.append(aVMDLDataLoaderNotifyInfo.parameter);
            LIZ2.append(" switchInfo:");
            C64504PTg.LIZLLL(LIZ2, aVMDLDataLoaderNotifyInfo.logInfo, LIZ2);
            return;
        }
        VBN vbn2 = this.LIZ;
        if (vbn2 != null) {
            int i3 = (int) aVMDLDataLoaderNotifyInfo.parameter;
            String str2 = aVMDLDataLoaderNotifyInfo.logInfo;
            t tVar2 = ((VB2) vbn2).LIZ.get();
            if (tVar2 != null && tVar2.LJLLL != null && (LJFF = (vad = tVar2.LJLJJI).LJFF()) != null) {
                try {
                    LJFF.put("event_key", "p2p_error").put("error_msg", str2).put("code", i3);
                    vad.LJJI("live_client_monitor_log", LJFF);
                    long j2 = vad.LLLLII;
                    if (j2 > 0) {
                        vad.LLLLII = j2 + 1;
                    }
                } catch (JSONException e2) {
                    C16880lQ.LLLLIIL(e2);
                }
            }
        }
        StringBuilder LIZ3 = X1D.LIZ();
        LIZ3.append("live loader errorCode:");
        LIZ3.append(aVMDLDataLoaderNotifyInfo.parameter);
        LIZ3.append(" errorInfo:");
        C64504PTg.LIZLLL(LIZ3, aVMDLDataLoaderNotifyInfo.logInfo, LIZ3);
    }

    @Override // com.ss.mediakit.medialoader.AVMDLDataLoaderListener
    public final long getInt64Value(int i, long j) {
        t tVar;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getInt64Value:");
        LIZ.append(i);
        X1D.LIZIZ(LIZ);
        C46496IMq.LIZJ();
        if (i != 8003) {
            if (i != 8004) {
                return j;
            }
            VBN vbn = this.LIZ;
            if (vbn == null || (tVar = ((VB2) vbn).LIZ.get()) == null || tVar.LJLLL == null) {
                return j;
            }
            return tVar.LJLJJI.LJIIL(0, j);
        }
        C48436Izg c48436Izg = this.LIZIZ;
        if (c48436Izg != null) {
            return c48436Izg.getLongOption(73, 0L);
        }
        return j;
    }

    public static void LIZLLL(int i, int i2, String str) {
        AVMDLDataLoader aVMDLDataLoader = AVMDLDataLoader.getInstance();
        if (aVMDLDataLoader == null) {
            return;
        }
        if (i != 7213 && i != 7215) {
            aVMDLDataLoader.setInt64ValueByStrKey(i, str, System.currentTimeMillis());
        } else {
            aVMDLDataLoader.setInt64ValueByStrKey(i, str, i2);
        }
    }
}
