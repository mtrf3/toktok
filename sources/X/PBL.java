package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class PBL {
    public static final AtomicInteger LIZ = new AtomicInteger(0);
    public static final List<String> LIZIZ = Arrays.asList("tracing");
    public static final List<PBM> LIZJ;
    public static final PBW LIZLLL;
    public static final PBR LJ;
    public static final PBQ LJFF;
    public static final PBS LJI;

    static {
        PBW pbw = new PBW();
        LIZLLL = pbw;
        PBR pbr = new PBR();
        LJ = pbr;
        PBQ pbq = new PBQ();
        LJFF = pbq;
        PBS pbs = new PBS();
        LJI = pbs;
        ArrayList arrayList = new ArrayList();
        LIZJ = arrayList;
        arrayList.add(pbw);
        arrayList.add(pbr);
        arrayList.add(pbq);
        arrayList.add(pbs);
    }

    public static void LIZ(java.util.Map<Long, List<PBJ>> map) {
        if (C78248UnM.LJIIJ()) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("sendLog: input sendList merged into ");
            HashMap hashMap = (HashMap) map;
            LIZ2.append(hashMap.size());
            LIZ2.append(" group(s)");
            C64028PAy.LIZ("APM-Slardar", X1D.LIZIZ(LIZ2));
            int i = 0;
            for (Map.Entry entry : hashMap.entrySet()) {
                Object key = entry.getKey();
                List list = (List) entry.getValue();
                C64028PAy.LIZ("APM-Slardar", "----------------");
                PCA LIZ3 = PC6.LIZIZ().LIZ(String.valueOf(key));
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append("group ");
                int i2 = i + 1;
                LIZ4.append(i);
                LIZ4.append(" header:");
                LIZ4.append(LIZ3);
                C64028PAy.LIZ("APM-Slardar", X1D.LIZIZ(LIZ4));
                for (int i3 = 0; i3 < list.size(); i3++) {
                    StringBuilder LJ2 = C7MY.LJ("  log[", i3, "]=");
                    LJ2.append(((PBJ) ListProtector.get(list, i3)).toString());
                    C64028PAy.LIZ("APM-Slardar", X1D.LIZIZ(LJ2));
                }
                C64028PAy.LIZ("APM-Slardar", "----------------");
                i = i2;
            }
        }
    }

    public static java.util.Map LIZIZ(int i, List list) {
        int i2;
        Object obj;
        String[] list2;
        try {
            HashMap hashMap = new HashMap();
            ArrayList arrayList = (ArrayList) list;
            long size = arrayList.size();
            Iterator it = arrayList.iterator();
            long j = 0;
            long j2 = 0;
            while (it.hasNext()) {
                PBF pbf = (PBF) it.next();
                long j3 = pbf.LIZ;
                List list3 = (List) hashMap.get(Long.valueOf(j3));
                if (list3 == null) {
                    list3 = new ArrayList();
                    hashMap.put(Long.valueOf(j3), list3);
                }
                j += pbf.LIZJ;
                j2 += pbf.LIZIZ;
                list3.addAll(pbf.LJ);
            }
            LIZ(hashMap);
            PB0 pb0 = PB2.LIZ;
            pb0.LIZJ();
            File file = pb0.LIZJ;
            if (file != null && (list2 = file.list()) != null) {
                i2 = list2.length;
            } else {
                i2 = 0;
            }
            HashMap hashMap2 = new HashMap();
            ArrayList arrayList2 = new ArrayList();
            for (Map.Entry entry : hashMap.entrySet()) {
                Long l = (Long) entry.getKey();
                List list4 = (List) entry.getValue();
                if (list4 != null) {
                    for (int i3 = 0; i3 < list4.size(); i3++) {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(((PBJ) ListProtector.get(list4, i3)).LIZ));
                            if (!C64025PAv.LIZ.LIZJ(PC5.LJIIZILJ(), jSONObject)) {
                                if (C78248UnM.LJIIJ()) {
                                    C64028PAy.LIZ("APM-Downgrade", jSONObject.toString());
                                }
                            } else {
                                String optString = jSONObject.optString("log_type");
                                if (PEA.LIZ.contains(optString)) {
                                    obj = LIZLLL;
                                } else if (LIZIZ.contains(optString)) {
                                    obj = LJ;
                                } else if (jSONObject.optBoolean("api_double_send")) {
                                    obj = LJI;
                                } else {
                                    obj = LJFF;
                                }
                                if (obj instanceof PBQ) {
                                    try {
                                        JSONObject optJSONObject = jSONObject.optJSONObject("_debug_self");
                                        if (optJSONObject == null) {
                                            optJSONObject = new JSONObject();
                                            jSONObject.put("_debug_self", optJSONObject);
                                        }
                                        optJSONObject.put("debug_sender_number", LIZ.getAndIncrement());
                                        optJSONObject.put("debug_sender_sid", PC5.LJJII());
                                        optJSONObject.put("debug_total_bytes", j);
                                        optJSONObject.put("debug_total_count", j2);
                                        optJSONObject.put("debug_merge_file_count", size);
                                        optJSONObject.put("debug_second_file_count", i2);
                                        optJSONObject.put("debug_left_file_count", i);
                                    } catch (Exception unused) {
                                    }
                                    if (jSONObject.has("seq_no")) {
                                        arrayList2.add(String.valueOf(jSONObject.get("seq_no")));
                                    }
                                }
                                java.util.Map map = (java.util.Map) hashMap2.get(obj);
                                if (map == null) {
                                    map = new HashMap();
                                    hashMap2.put(obj, map);
                                }
                                if (!map.containsKey(l)) {
                                    map.put(l, new JSONArray());
                                }
                                ((JSONArray) map.get(l)).put(jSONObject);
                            }
                        } catch (Exception unused2) {
                        }
                    }
                }
            }
            HashMap hashMap3 = new HashMap();
            for (PBM pbm : hashMap2.keySet()) {
                hashMap3.put(pbm, pbm.LIZIZ((HashMap) hashMap2.get(pbm)));
            }
            return hashMap3;
        } catch (Throwable th) {
            C64028PAy.LIZJ("APM-Slardar", "LogSender serialize failed.", th);
            return null;
        }
    }
}
