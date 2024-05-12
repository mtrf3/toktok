package X;

import android.os.Handler;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.ss.texturerender.VideoSurface;
import com.ss.videoarch.strategy.strategy.smartStrategy.BaseSmartStrategy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.VBc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79320VBc extends BaseSmartStrategy {
    public static volatile C79320VBc LJJIJIL;
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public Handler LJ;
    public C47988IsS LJIILJJIL;
    public final List<Integer> LJFF = new ArrayList();
    public int LJI = 5000;
    public int LJII = 1280;
    public int LJIIIIZZ = 600;
    public int LJIIIZ = 0;
    public int LJIIJ = 0;
    public boolean LJIIJJI = false;
    public final C38891FOd LJIIL = new C38891FOd();
    public final List<VideoSurface> LJIILIIL = new CopyOnWriteArrayList();
    public int LJIILL = -1;
    public int LJIILLIIL = -1;
    public double LJIIZILJ = -1.0d;
    public double LJIJ = -1.0d;
    public long LJIJI = -1;
    public long LJIJJ = -1;
    public long LJIJJLI = -1;
    public long LJIL = -1;
    public int LJJ = -1;
    public int LJJI = -1;
    public double LJJIFFI = -1.0d;
    public double LJJII = -1.0d;
    public long LJJIII = -1;
    public int LJJIIJ = -1;
    public int LJJIIJZLJL = -1;
    public int LJJIIZ = 0;
    public int LJJIIZI = 0;
    public int LJJIJ = 0;
    public final List<Integer> LJJIJIIJI = new ArrayList();
    public int LJJIJIIJIL = -1;

    /* JADX WARN: Removed duplicated region for block: B:108:0x0269 A[Catch: JSONException -> 0x02be, TryCatch #0 {JSONException -> 0x02be, blocks: (B:33:0x0096, B:35:0x00aa, B:37:0x00b5, B:38:0x00b9, B:40:0x00bf, B:41:0x00c3, B:43:0x00d1, B:45:0x00dc, B:46:0x00e0, B:48:0x00e6, B:49:0x00ea, B:51:0x00f6, B:53:0x0101, B:54:0x0105, B:56:0x0111, B:58:0x011c, B:63:0x028f, B:65:0x0299, B:66:0x02a1, B:68:0x02a7, B:75:0x02b2, B:71:0x02b8, B:86:0x0153, B:88:0x0157, B:92:0x015f, B:94:0x016f, B:96:0x0175, B:100:0x017f, B:102:0x0185, B:104:0x0189, B:106:0x025f, B:108:0x0269, B:109:0x0271, B:111:0x0277, B:119:0x0283, B:115:0x0287, B:123:0x028b, B:125:0x018f, B:127:0x019f, B:129:0x01a5, B:133:0x01af, B:135:0x01b5, B:137:0x01b9, B:141:0x0199, B:145:0x0169, B:151:0x01c5, B:153:0x01d5, B:155:0x01db, B:159:0x01e5, B:161:0x01eb, B:163:0x01ef, B:166:0x01cf, B:168:0x01f3, B:172:0x01fb, B:174:0x020b, B:176:0x0211, B:180:0x021b, B:182:0x0221, B:184:0x0225, B:187:0x0205, B:193:0x022f, B:195:0x023f, B:197:0x0245, B:201:0x024f, B:203:0x0255, B:205:0x0259, B:208:0x0239), top: B:32:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01f3 A[Catch: JSONException -> 0x02be, TryCatch #0 {JSONException -> 0x02be, blocks: (B:33:0x0096, B:35:0x00aa, B:37:0x00b5, B:38:0x00b9, B:40:0x00bf, B:41:0x00c3, B:43:0x00d1, B:45:0x00dc, B:46:0x00e0, B:48:0x00e6, B:49:0x00ea, B:51:0x00f6, B:53:0x0101, B:54:0x0105, B:56:0x0111, B:58:0x011c, B:63:0x028f, B:65:0x0299, B:66:0x02a1, B:68:0x02a7, B:75:0x02b2, B:71:0x02b8, B:86:0x0153, B:88:0x0157, B:92:0x015f, B:94:0x016f, B:96:0x0175, B:100:0x017f, B:102:0x0185, B:104:0x0189, B:106:0x025f, B:108:0x0269, B:109:0x0271, B:111:0x0277, B:119:0x0283, B:115:0x0287, B:123:0x028b, B:125:0x018f, B:127:0x019f, B:129:0x01a5, B:133:0x01af, B:135:0x01b5, B:137:0x01b9, B:141:0x0199, B:145:0x0169, B:151:0x01c5, B:153:0x01d5, B:155:0x01db, B:159:0x01e5, B:161:0x01eb, B:163:0x01ef, B:166:0x01cf, B:168:0x01f3, B:172:0x01fb, B:174:0x020b, B:176:0x0211, B:180:0x021b, B:182:0x0221, B:184:0x0225, B:187:0x0205, B:193:0x022f, B:195:0x023f, B:197:0x0245, B:201:0x024f, B:203:0x0255, B:205:0x0259, B:208:0x0239), top: B:32:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111 A[Catch: JSONException -> 0x02be, TryCatch #0 {JSONException -> 0x02be, blocks: (B:33:0x0096, B:35:0x00aa, B:37:0x00b5, B:38:0x00b9, B:40:0x00bf, B:41:0x00c3, B:43:0x00d1, B:45:0x00dc, B:46:0x00e0, B:48:0x00e6, B:49:0x00ea, B:51:0x00f6, B:53:0x0101, B:54:0x0105, B:56:0x0111, B:58:0x011c, B:63:0x028f, B:65:0x0299, B:66:0x02a1, B:68:0x02a7, B:75:0x02b2, B:71:0x02b8, B:86:0x0153, B:88:0x0157, B:92:0x015f, B:94:0x016f, B:96:0x0175, B:100:0x017f, B:102:0x0185, B:104:0x0189, B:106:0x025f, B:108:0x0269, B:109:0x0271, B:111:0x0277, B:119:0x0283, B:115:0x0287, B:123:0x028b, B:125:0x018f, B:127:0x019f, B:129:0x01a5, B:133:0x01af, B:135:0x01b5, B:137:0x01b9, B:141:0x0199, B:145:0x0169, B:151:0x01c5, B:153:0x01d5, B:155:0x01db, B:159:0x01e5, B:161:0x01eb, B:163:0x01ef, B:166:0x01cf, B:168:0x01f3, B:172:0x01fb, B:174:0x020b, B:176:0x0211, B:180:0x021b, B:182:0x0221, B:184:0x0225, B:187:0x0205, B:193:0x022f, B:195:0x023f, B:197:0x0245, B:201:0x024f, B:203:0x0255, B:205:0x0259, B:208:0x0239), top: B:32:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0157 A[Catch: JSONException -> 0x02be, TryCatch #0 {JSONException -> 0x02be, blocks: (B:33:0x0096, B:35:0x00aa, B:37:0x00b5, B:38:0x00b9, B:40:0x00bf, B:41:0x00c3, B:43:0x00d1, B:45:0x00dc, B:46:0x00e0, B:48:0x00e6, B:49:0x00ea, B:51:0x00f6, B:53:0x0101, B:54:0x0105, B:56:0x0111, B:58:0x011c, B:63:0x028f, B:65:0x0299, B:66:0x02a1, B:68:0x02a7, B:75:0x02b2, B:71:0x02b8, B:86:0x0153, B:88:0x0157, B:92:0x015f, B:94:0x016f, B:96:0x0175, B:100:0x017f, B:102:0x0185, B:104:0x0189, B:106:0x025f, B:108:0x0269, B:109:0x0271, B:111:0x0277, B:119:0x0283, B:115:0x0287, B:123:0x028b, B:125:0x018f, B:127:0x019f, B:129:0x01a5, B:133:0x01af, B:135:0x01b5, B:137:0x01b9, B:141:0x0199, B:145:0x0169, B:151:0x01c5, B:153:0x01d5, B:155:0x01db, B:159:0x01e5, B:161:0x01eb, B:163:0x01ef, B:166:0x01cf, B:168:0x01f3, B:172:0x01fb, B:174:0x020b, B:176:0x0211, B:180:0x021b, B:182:0x0221, B:184:0x0225, B:187:0x0205, B:193:0x022f, B:195:0x023f, B:197:0x0245, B:201:0x024f, B:203:0x0255, B:205:0x0259, B:208:0x0239), top: B:32:0x0096 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instructions count: 708
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C79320VBc.LIZ():void");
    }

    public final void LIZIZ(JSONObject jSONObject) {
        JSONArray optJSONArray;
        try {
            if (jSONObject.has("EnableSRAsyncInit")) {
                this.LIZIZ = jSONObject.optInt("EnableSRAsyncInit", 0);
            }
            if (this.LIZIZ == 1) {
                this.LJII = jSONObject.optInt("MaxTextureWidth", 1280);
                this.LJIIIIZZ = jSONObject.optInt("MaxTextureHeight", 600);
                this.LJIIIZ = jSONObject.optInt("MaxAlgorithumType", 0);
                this.LJIIJ = jSONObject.optInt("OpenMaliSync", 1);
            }
            if (jSONObject.has("EnableDynamicSRPredict")) {
                this.LIZJ = jSONObject.optInt("EnableDynamicSRPredict", 0);
            }
            if (this.LIZJ == 1) {
                this.LIZ = jSONObject.optInt("EnableSRPredictAlgorithum", 0);
                this.LJIIZILJ = jSONObject.optDouble("HighCpuRate", -1.0d);
                this.LJIJ = jSONObject.optDouble("LowCpuRate", -1.0d);
                this.LJIJI = jSONObject.optLong("HighAvaliableMem", -1L);
                this.LJIJJ = jSONObject.optLong("LowAvaliableMem", -1L);
                this.LJIJJLI = jSONObject.optLong("HighTotalMem", -1L);
                this.LJIL = jSONObject.optLong("LowTotalMem", -1L);
                this.LJJ = jSONObject.optInt("HighBatteryLevel", -1);
                this.LJJI = jSONObject.optInt("LowBatteryLevel", -1);
                this.LJJIFFI = jSONObject.optDouble("HighTemperature", -1.0d);
                this.LJJII = jSONObject.optDouble("LowTemperature", -1.0d);
                if (jSONObject.has("PredictTimeList") && (optJSONArray = jSONObject.optJSONArray("PredictTimeList")) != null) {
                    if (!((ArrayList) this.LJFF).isEmpty()) {
                        ((ArrayList) this.LJFF).clear();
                    }
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        ((ArrayList) this.LJFF).add(Integer.valueOf(JSONArrayProtectorUtils.getInt(optJSONArray, i)));
                    }
                }
                this.LJI = jSONObject.optInt("PredictMinInterval", 5000);
            }
            this.LIZLLL = jSONObject.optInt("ScreenResControl", 0);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void stopSession(JSONObject jSONObject) {
        if (!this.LJIIJJI || this.LIZJ == 0 || jSONObject == null) {
            return;
        }
        Handler handler = this.LJ;
        if (handler != null) {
            handler.removeMessages(1025);
        }
        Object opt = jSONObject.opt("textureSurface");
        if (opt == null || !(opt instanceof VideoSurface)) {
            return;
        }
        ((CopyOnWriteArrayList) this.LJIILIIL).remove(opt);
    }
}
