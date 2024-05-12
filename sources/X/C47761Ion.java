package X;

import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ttvideoengine.utils.EngineThreadPool;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONObject;

/* renamed from: X.Ion, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C47761Ion {
    public float LIZIZ;
    public boolean LIZJ;
    public C47752Ioe LJFF;
    public int LIZ = 200;
    public int LIZLLL = LiveLayoutPreloadThreadPriority.DEFAULT;
    public final ReentrantLock LJI = new ReentrantLock();
    public C47781Ip7 LJ = new C47781Ip7();

    public final void LIZIZ() {
        C47781Ip7 c47781Ip7 = this.LJ;
        int i = c47781Ip7.LIZLLL;
        int i2 = this.LIZ;
        if (i > i2 || c47781Ip7.LJIILLIIL > i2) {
            if (!c47781Ip7.LJJIIZI.isEmpty()) {
                ListProtector.remove(this.LJ.LJJIIZI, 0);
            }
            if (!this.LJ.LJJIIJZLJL.isEmpty()) {
                ListProtector.remove(this.LJ.LJJIIJZLJL, 0);
            }
            if (!this.LJ.LJJIIZ.isEmpty()) {
                ListProtector.remove(this.LJ.LJJIIZ, 0);
            }
            if (!this.LJ.LJ.isEmpty()) {
                ListProtector.remove(this.LJ.LJ, 0);
            }
            if (!this.LJ.LJFF.isEmpty()) {
                ListProtector.remove(this.LJ.LJFF, 0);
            }
            if (!this.LJ.LJI.isEmpty()) {
                ListProtector.remove(this.LJ.LJI, 0);
            }
            if (!this.LJ.LJII.isEmpty()) {
                ListProtector.remove(this.LJ.LJII, 0);
            }
            if (!this.LJ.LJIIIIZZ.isEmpty()) {
                ListProtector.remove(this.LJ.LJIIIIZZ, 0);
            }
            if (!this.LJ.LJIIJ.isEmpty()) {
                ListProtector.remove(this.LJ.LJIIJ, 0);
            }
            if (!this.LJ.LJIIIZ.isEmpty()) {
                ListProtector.remove(this.LJ.LJIIIZ, 0);
            }
            if (!this.LJ.LJIIJJI.isEmpty()) {
                ListProtector.remove(this.LJ.LJIIJJI, 0);
            }
            if (!this.LJ.LJIIL.isEmpty()) {
                ListProtector.remove(this.LJ.LJIIL, 0);
            }
            if (!this.LJ.LJIILIIL.isEmpty()) {
                ListProtector.remove(this.LJ.LJIILIIL, 0);
            }
            if (!this.LJ.LJIILJJIL.isEmpty()) {
                ListProtector.remove(this.LJ.LJIILJJIL, 0);
            }
            if (!this.LJ.LJIILL.isEmpty()) {
                ListProtector.remove(this.LJ.LJIILL, 0);
            }
            r2.LIZLLL--;
            if (!this.LJ.LJIIZILJ.isEmpty()) {
                ListProtector.remove(this.LJ.LJIIZILJ, 0);
            }
            if (!this.LJ.LJIJ.isEmpty()) {
                ListProtector.remove(this.LJ.LJIJ, 0);
            }
            if (!this.LJ.LJIJI.isEmpty()) {
                ListProtector.remove(this.LJ.LJIJI, 0);
            }
            if (!this.LJ.LJIJJ.isEmpty()) {
                ListProtector.remove(this.LJ.LJIJJ, 0);
            }
            if (!this.LJ.LJIJJLI.isEmpty()) {
                ListProtector.remove(this.LJ.LJIJJLI, 0);
            }
            if (!this.LJ.LJIL.isEmpty()) {
                ListProtector.remove(this.LJ.LJIL, 0);
            }
            if (!this.LJ.LJJ.isEmpty()) {
                ListProtector.remove(this.LJ.LJJ, 0);
            }
            if (!this.LJ.LJJI.isEmpty()) {
                ListProtector.remove(this.LJ.LJJI, 0);
            }
            if (!this.LJ.LJJIFFI.isEmpty()) {
                ListProtector.remove(this.LJ.LJJIFFI, 0);
            }
            if (!this.LJ.LJJII.isEmpty()) {
                ListProtector.remove(this.LJ.LJJII, 0);
            }
            if (!this.LJ.LJJIII.isEmpty()) {
                ListProtector.remove(this.LJ.LJJIII, 0);
            }
            if (!this.LJ.LJJIIJ.isEmpty()) {
                ListProtector.remove(this.LJ.LJJIIJ, 0);
            }
            C47781Ip7 c47781Ip72 = this.LJ;
            c47781Ip72.LJIILLIIL--;
        }
    }

    public final void LIZLLL() {
        C47752Ioe c47752Ioe = this.LJFF;
        if (c47752Ioe != null) {
            InterfaceC46858IaE interfaceC46858IaE = c47752Ioe.LIZ;
            if (interfaceC46858IaE != null) {
                this.LJ.LJJIIZI.add(Integer.valueOf(((C47619ImV) interfaceC46858IaE).LIZJ(67)));
                this.LJ.LJJIIJZLJL.add(Long.valueOf(((C47619ImV) this.LJFF.LIZ).LIZLLL(68)));
                java.util.Map map = this.LJFF.LJJJJLL;
                if (map != null) {
                    HashMap hashMap = (HashMap) map;
                    java.util.Map map2 = (java.util.Map) hashMap.get("bitrate");
                    if (map2 != null) {
                        Integer num = (Integer) map2.get(this.LJFF.LJJJ);
                        if (num == null) {
                            this.LJ.LJIIIZ.add(-1);
                        } else if (num.intValue() == 0) {
                            this.LJ.LJIIIZ.add(-1);
                        } else {
                            this.LJ.LJIIIZ.add(LIZ(num));
                        }
                    }
                    ArrayList arrayList = (ArrayList) hashMap.get("audio_bitrate");
                    if (arrayList != null && !arrayList.isEmpty()) {
                        if (ListProtector.get(arrayList, 0) == null) {
                            this.LJ.LJIL.add(-1);
                        } else if (((Integer) ListProtector.get(arrayList, 0)).intValue() == 0) {
                            this.LJ.LJIL.add(-1);
                        } else {
                            this.LJ.LJIL.add(LIZ((Integer) ListProtector.get(arrayList, 0)));
                        }
                    }
                }
            }
            this.LJ.LJJIIZ.add(Float.valueOf(this.LJFF.LJJJJJ));
        }
    }

    public final void LJFF() {
        this.LJI.lock();
        try {
            if (this.LIZJ) {
                this.LIZJ = false;
                LIZJ(1);
            }
        } finally {
            this.LJI.unlock();
        }
    }

    public C47761Ion(C47752Ioe c47752Ioe) {
        this.LJFF = c47752Ioe;
    }

    public final Integer LIZ(Integer num) {
        C47752Ioe c47752Ioe = this.LJFF;
        if (c47752Ioe == null) {
            return num;
        }
        java.util.Map map = c47752Ioe.LJJJJLL;
        if (map == null) {
            return num;
        }
        java.util.Map map2 = (java.util.Map) ((HashMap) map).get("bitrateMapTable");
        if (map2 != null) {
            if (map2.get(num) == null) {
                return -1;
            }
            return (Integer) map2.get(num);
        }
        return num;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ(int i) {
        C47781Ip7 c47781Ip7 = this.LJ;
        if (c47781Ip7.LIZLLL == 0 && c47781Ip7.LJIILLIIL == 0) {
            java.util.Map map = this.LJFF.LJJJJLL;
            if (map == null) {
                return;
            }
            java.util.Map map2 = (java.util.Map) ((HashMap) map).get("fileKey");
            ArrayList arrayList = new ArrayList();
            if (map2 != null) {
                for (String str : map2.values()) {
                    if (str.equals("") || str.equals(CardStruct.IStatusCode.DEFAULT)) {
                        return;
                    } else {
                        arrayList.add(str);
                    }
                }
            }
            int i2 = 0;
            while (i2 < arrayList.size()) {
                String str2 = (String) ListProtector.get(arrayList, i2);
                i2++;
                for (int i3 = i2; i3 < arrayList.size(); i3++) {
                    if (str2.equals(ListProtector.get(arrayList, i3))) {
                        return;
                    }
                }
            }
        }
        this.LJ.LIZ = System.currentTimeMillis();
        C47781Ip7 c47781Ip72 = this.LJ;
        c47781Ip72.LIZJ = this.LIZLLL;
        C47752Ioe c47752Ioe = this.LJFF;
        if (c47752Ioe != null) {
            c47781Ip72.LIZIZ = c47752Ioe.LJJLIL;
            c47781Ip72.LJJIZ = c47752Ioe.LJJLJ;
            c47781Ip72.LJJJ = c47752Ioe.LJJLJLI;
            c47781Ip72.LJJIJIIJI = c47752Ioe.LJIILL;
            c47781Ip72.LJJIJIIJIL = c47752Ioe.LJJI;
            c47781Ip72.LJJIL = c47752Ioe.LJJIJLIJ;
            java.util.Map map3 = c47752Ioe.LJJJJLL;
            if (map3 != null) {
                HashMap hashMap = (HashMap) map3;
                if (hashMap.get("bitrateMapTable") != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry entry : ((java.util.Map) hashMap.get("bitrateMapTable")).entrySet()) {
                            jSONObject.put(((Integer) entry.getKey()).toString(), entry.getValue());
                        }
                        this.LJ.LJJIJLIJ = jSONObject;
                    } catch (Exception e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
                HashMap hashMap2 = (HashMap) map3;
                if (hashMap2.get("video_bitrate") != null) {
                    Iterator it = ((ArrayList) hashMap2.get("video_bitrate")).iterator();
                    while (it.hasNext()) {
                        this.LJ.LJJIJIL.add(it.next());
                    }
                }
                HashMap hashMap3 = (HashMap) map3;
                if (hashMap3.get("audio_bitrate") != null) {
                    Iterator it2 = ((ArrayList) hashMap3.get("audio_bitrate")).iterator();
                    while (it2.hasNext()) {
                        this.LJ.LJJIJL.add(it2.next());
                    }
                }
            }
        }
        EngineThreadPool.addExecuteTask(new RunnableC47770Iow(this, this.LJ));
        C47781Ip7 c47781Ip73 = new C47781Ip7();
        this.LJ = c47781Ip73;
        if (i == 0) {
            c47781Ip73.LJJIJ = 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJ(int i, java.util.Map map) {
        HashMap hashMap = (HashMap) map;
        if (hashMap.size() <= 0 || i > 1) {
            return;
        }
        if (i == 0) {
            String str = (String) hashMap.get("download_size");
            String str2 = (String) hashMap.get("download_time");
            String str3 = (String) hashMap.get("rtt");
            String str4 = (String) hashMap.get("last_data_recv");
            Object obj = hashMap.get("mdl_loader_type");
            if (str != null) {
                this.LJ.LJIIJJI.add(Float.valueOf(CastFloatProtector.parseFloat(str)));
            }
            if (str2 != null) {
                this.LJ.LJIIL.add(Long.valueOf(CastLongProtector.parseLong(str2)));
            }
            if (str3 != null) {
                this.LJ.LJIILIIL.add(Long.valueOf(CastLongProtector.parseLong(str3)));
            }
            if (str4 != null) {
                this.LJ.LJIILJJIL.add(Long.valueOf(CastLongProtector.parseLong(str4)));
            }
            if (obj == null) {
                return;
            }
            this.LJ.LJIILL.add(obj);
            return;
        }
        if (i != 1) {
            return;
        }
        String str5 = (String) hashMap.get("download_size");
        String str6 = (String) hashMap.get("download_time");
        String str7 = (String) hashMap.get("rtt");
        String str8 = (String) hashMap.get("last_data_recv");
        Object obj2 = hashMap.get("mdl_loader_type");
        if (str5 != null) {
            this.LJ.LJJI.add(Float.valueOf(CastFloatProtector.parseFloat(str5)));
        }
        if (str6 != null) {
            this.LJ.LJJIFFI.add(Long.valueOf(CastLongProtector.parseLong(str6)));
        }
        if (str7 != null) {
            this.LJ.LJJII.add(Long.valueOf(CastLongProtector.parseLong(str7)));
        }
        if (str8 != null) {
            this.LJ.LJJIII.add(Long.valueOf(CastLongProtector.parseLong(str8)));
        }
        if (obj2 == null) {
            return;
        }
        this.LJ.LJJIIJ.add(obj2);
    }
}
