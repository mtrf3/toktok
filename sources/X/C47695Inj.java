package X;

import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.vcloud.networkpredictor.DefaultSpeedPredictor;
import com.bytedance.vcloud.networkpredictor.ISpeedPredictor;
import com.ss.ttvideoengine.TTVideoEngine;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.Inj, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47695Inj implements InterfaceC47696Ink {
    public float LIZ;
    public float LIZIZ;
    public int LIZJ;
    public final WeakReference<TTVideoEngine> LIZLLL;
    public final ISpeedPredictor LJ;
    public long LJFF;
    public final ISpeedPredictor LJI;

    public final java.util.Map<String, Integer> LIZ() {
        InterfaceC47616ImS LJJIFFI;
        List<C47160If6> LIZLLL;
        TTVideoEngine tTVideoEngine = this.LIZLLL.get();
        if (tTVideoEngine == null || (LJJIFFI = tTVideoEngine.LJJIFFI()) == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        if (LJJIFFI.LIZ() && (LIZLLL = LJJIFFI.LIZLLL()) != null && LIZLLL.size() > 0) {
            for (C47160If6 c47160If6 : LIZLLL) {
                hashMap.put(c47160If6.LIZIZ(15), Integer.valueOf(c47160If6.LIZ()));
            }
        }
        return hashMap;
    }

    public final void LIZJ(java.util.Map<String, Integer> map) {
        TTVideoEngine tTVideoEngine = this.LIZLLL.get();
        if (tTVideoEngine == null || map == null) {
            return;
        }
        long LJJIIJZLJL = tTVideoEngine.LJJIIJZLJL(62);
        long LJJIIJZLJL2 = tTVideoEngine.LJJIIJZLJL(61);
        int LJJII = tTVideoEngine.LJJII(0) * 1000;
        int LJJII2 = tTVideoEngine.LJJII(0) * 1000;
        map.put("playerVideoBufLen", Integer.valueOf((int) LJJIIJZLJL));
        map.put("playerAudioBufLen", Integer.valueOf((int) LJJIIJZLJL2));
        map.put("playerVideoMaxBufLen", Integer.valueOf(LJJII));
        map.put("playerAudioMaxBufLen", Integer.valueOf(LJJII2));
    }

    public C47695Inj(TTVideoEngine tTVideoEngine, ISpeedPredictor iSpeedPredictor, DefaultSpeedPredictor defaultSpeedPredictor) {
        this.LIZLLL = new WeakReference<>(tTVideoEngine);
        this.LJ = iSpeedPredictor;
        this.LJI = defaultSpeedPredictor;
    }

    public static float LIZIZ(java.util.Map map, StringBuffer stringBuffer, java.util.Map map2) {
        float f;
        if (map != null && map.size() > 1 && map.get("download_speed") != null) {
            try {
                f = CastFloatProtector.parseFloat((String) map.get("download_speed"));
            } catch (NumberFormatException e) {
                C78253UnR.LIZLLL("TTVideoEngine", C16880lQ.LLLZI(Locale.US, "[SPEEDPREDICT] exception %s", new Object[]{e.toString()}));
                f = 0.0f;
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (str != null && !str.equals("stream_id") && !str.equals("download_speed")) {
                    ((HashMap) map2).put(entry.getKey(), entry.getValue());
                }
            }
            String str2 = (String) map.get("stream_id");
            if (str2 != null && !str2.equals("-1")) {
                stringBuffer.delete(0, stringBuffer.capacity());
                stringBuffer.append((String) map.get("stream_id"));
                return f;
            }
        }
        return 0.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(java.lang.String r23, java.lang.String r24, java.lang.String r25, long r26, long r28) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47695Inj.LIZLLL(java.lang.String, java.lang.String, java.lang.String, long, long):void");
    }
}
