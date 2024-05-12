package X;

import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.vcloud.abrmodule.ABRResult;
import com.bytedance.vcloud.abrmodule.ABRResultElement;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.ImI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47606ImI {
    public static C47542IlG LIZ = new C47542IlG();
    public static final Lock LIZIZ = new ReentrantLock();
    public static final LruCache<String, java.util.Map<Long, java.util.Map<String, Object>>> LIZJ = new LruCache<>(100);

    public static C47542IlG LIZLLL() {
        return LIZ;
    }

    public static java.util.Map<String, Object> LJIIIIZZ(ABRResult aBRResult) {
        HashMap hashMap = new HashMap();
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        if (aBRResult != null) {
            for (int i = 0; i < aBRResult.size(); i++) {
                ABRResultElement aBRResultElement = aBRResult.get(i);
                long bitrate = aBRResultElement.getBitrate();
                int onceSelectType = aBRResultElement.getOnceSelectType();
                int mediaType = aBRResultElement.getMediaType();
                if (mediaType == 0) {
                    if (onceSelectType == 0) {
                        j2 = bitrate;
                    } else if (1 == onceSelectType) {
                        j3 = bitrate;
                    } else if (2 == onceSelectType) {
                        j4 = bitrate;
                    }
                } else if (1 == mediaType) {
                    j = bitrate;
                }
            }
            long j5 = j;
            j = j2;
            j2 = j5;
        }
        hashMap.put("video_bitrarte", Long.valueOf(j));
        hashMap.put("audio_bitrarte", Long.valueOf(j2));
        if (j3 > j) {
            hashMap.put("video_bitrarte_origin", Long.valueOf(j3));
            hashMap.put("downgrade_type", 1);
        } else if (j4 > j) {
            hashMap.put("video_bitrarte_origin", Long.valueOf(j4));
            hashMap.put("downgrade_type", 2);
        } else {
            hashMap.put("video_bitrarte_origin", Long.valueOf(j));
            hashMap.put("downgrade_type", 0);
        }
        return hashMap;
    }

    public static JSONArray LJ(InterfaceC47616ImS interfaceC47616ImS, int i) {
        int i2;
        long LJIILJJIL;
        JSONArray jSONArray = new JSONArray();
        if (interfaceC47616ImS == null) {
            return jSONArray;
        }
        List<C47160If6> LIZLLL = interfaceC47616ImS.LIZLLL();
        if (LIZLLL != null && LIZLLL.size() != 0) {
            try {
                for (C47160If6 c47160If6 : LIZLLL) {
                    if (c47160If6 != null) {
                        JSONObject jSONObject = new JSONObject();
                        if (c47160If6.LIZ() == 0) {
                            jSONObject.put("mtype", c47160If6.LIZ());
                            jSONObject.put("bitrate", c47160If6.LIZLLL(3));
                            EnumC47176IfM resolution = c47160If6.getResolution();
                            if (resolution != null) {
                                i2 = resolution.getIndex();
                            } else {
                                i2 = -1;
                            }
                            jSONObject.put("res", i2);
                            jSONObject.put("quality", c47160If6.LIZIZ(32));
                            jSONObject.put("width", c47160If6.LIZLLL(1));
                            jSONObject.put("height", c47160If6.LIZLLL(2));
                            if (i != -1) {
                                String LIZIZ2 = c47160If6.LIZIZ(15);
                                if (1 == i) {
                                    LJIILJJIL = TTVideoEngine.LJJLIIIJ(LIZIZ2);
                                } else {
                                    LJIILJJIL = TTVideoEngine.LJIILJJIL(LIZIZ2);
                                }
                                jSONObject.put("cache", LJIILJJIL);
                            }
                        } else {
                            jSONObject.put("mtype", c47160If6.LIZ());
                            jSONObject.put("bitrate", c47160If6.LIZLLL(3));
                        }
                        jSONArray.put(jSONObject);
                    }
                }
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return jSONArray;
    }

    public static java.util.Map LJFF(long j, String str) {
        java.util.Map<String, Object> map = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Lock lock = LIZIZ;
        ((ReentrantLock) lock).lock();
        java.util.Map<Long, java.util.Map<String, Object>> map2 = LIZJ.get(str);
        if (map2 != null) {
            map = map2.get(Long.valueOf(j));
        }
        ((ReentrantLock) lock).unlock();
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x09c5  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0a3f  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0a72  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0ada  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0afa  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x037a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LJIIIZ(X.InterfaceC47616ImS r27, X.C47542IlG r28) {
        /*
            Method dump skipped, instructions count: 2815
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47606ImI.LJIIIZ(X.ImS, X.IlG):java.util.Map");
    }

    public static void LIZ(InterfaceC47616ImS interfaceC47616ImS, C47542IlG c47542IlG, java.util.Map<String, String> map) {
        long LJIILJJIL;
        int LIZJ2 = c47542IlG.LIZJ(23);
        List<C47160If6> LIZLLL = interfaceC47616ImS.LIZLLL();
        if (LIZLLL == null || LIZLLL.size() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            for (C47160If6 c47160If6 : LIZLLL) {
                if (c47160If6 != null) {
                    String LIZIZ2 = c47160If6.LIZIZ(15);
                    if (LIZJ2 == 1) {
                        LJIILJJIL = TTVideoEngine.LJJLIIIJ(LIZIZ2);
                    } else {
                        LJIILJJIL = TTVideoEngine.LJIILJJIL(LIZIZ2);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("bitrate", c47160If6.LIZLLL(3));
                    jSONObject2.put("fileSize", LJIILJJIL);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("caches", jSONArray);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        ((HashMap) map).put(Integer.toString(57), jSONObject.toString());
    }

    public static void LJI(InterfaceC47616ImS interfaceC47616ImS, C47768Iou c47768Iou, C47542IlG c47542IlG) {
        LinkedList linkedList = new LinkedList();
        List<C47160If6> LIZLLL = interfaceC47616ImS.LIZLLL();
        if (LIZLLL != null && LIZLLL.size() > 0) {
            for (C47160If6 c47160If6 : LIZLLL) {
                if (c47160If6 != null && c47160If6.LIZ() == 0) {
                    int LIZLLL2 = c47160If6.LIZLLL(3);
                    if (c47768Iou.LJII(c47160If6, LIZLLL).booleanValue()) {
                        linkedList.add(Integer.valueOf(LIZLLL2));
                    }
                }
            }
        }
        if (!c47542IlG.LIZIZ.containsKey(43)) {
            c47542IlG.LIZIZ.put(43, linkedList);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0047 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x000a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C47160If6 LJII(X.InterfaceC47616ImS r7, int r8, int r9) {
        /*
            java.util.List r0 = r7.LIZLLL()
            if (r0 == 0) goto L46
            java.util.Iterator r7 = r0.iterator()
        La:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r6 = r7.next()
            X.If6 r6 = (X.C47160If6) r6
            if (r6 == 0) goto La
            int r0 = r6.LIZ()
            r1 = 1
            if (r0 == r1) goto La
            X.IfM r0 = r6.getResolution()
            if (r0 != 0) goto L26
            goto La
        L26:
            r5 = 3
            if (r1 != r9) goto L41
            r0 = 44
            int r0 = r6.LIZLLL(r0)
            long r3 = (long) r0
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L3b
            int r0 = r6.LIZLLL(r5)
        L3a:
            long r3 = (long) r0
        L3b:
            long r1 = (long) r8
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto La
            goto L47
        L41:
            int r0 = r6.LIZLLL(r5)
            goto L3a
        L46:
            r6 = 0
        L47:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47606ImI.LJII(X.ImS, int, int):X.If6");
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x016e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIJ(int r11, X.C47156If2 r12, java.util.Map r13) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47606ImI.LJIIJ(int, X.If2, java.util.Map):void");
    }

    public static float LJIIJJI(float f, String str, java.util.Map map) {
        String str2 = (String) ((HashMap) map).get(str);
        if (str2 != null) {
            try {
                return CastFloatProtector.parseFloat(str2);
            } catch (NumberFormatException unused) {
                return f;
            }
        }
        return f;
    }

    public static int LJIIL(int i, String str, java.util.Map map) {
        String str2 = (String) ((HashMap) map).get(str);
        if (str2 != null) {
            try {
                return CastIntegerProtector.parseInt(str2);
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        return i;
    }

    public static String LJIILIIL(String str, String str2, java.util.Map map) {
        String str3 = (String) ((HashMap) map).get(str);
        if (str3 != null) {
            return str3;
        }
        return str2;
    }

    public static void LIZIZ(C47542IlG c47542IlG, int i, java.util.Map<String, String> map, int i2) {
        ((HashMap) map).put(Integer.toString(i), Integer.toString(c47542IlG.LIZLLL(i, i2, true)));
    }

    public static int LIZJ(InterfaceC47616ImS interfaceC47616ImS, int i, String str, int i2) {
        EnumC47176IfM valueOf = EnumC47176IfM.valueOf(i);
        if (valueOf != EnumC47176IfM.Undefine || !TextUtils.isEmpty(str)) {
            HashMap hashMap = new HashMap();
            hashMap.put(32, str);
            C47160If6 LJIJJLI = interfaceC47616ImS.LJIJJLI(valueOf, hashMap, false);
            if (LJIJJLI != null) {
                if (1 == i2) {
                    return LJIJJLI.LIZLLL(44);
                }
                return LJIJJLI.LIZLLL(3);
            }
        }
        return -1;
    }
}
