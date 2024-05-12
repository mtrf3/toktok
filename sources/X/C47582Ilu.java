package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimerTask;

/* renamed from: X.Ilu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C47582Ilu extends TimerTask {
    public final /* synthetic */ C47750Ioc LJLIL;

    public final void LIZIZ() {
        int i;
        C47906Ir8 c47906Ir8;
        C47750Ioc c47750Ioc;
        float f;
        List arrayList;
        C47750Ioc c47750Ioc2 = this.LJLIL;
        C47752Ioe c47752Ioe = c47750Ioc2.LJI;
        C47751Iod c47751Iod = c47750Ioc2.LIZIZ;
        C47581Ilt c47581Ilt = C47578Ilq.LIZ().LIZ;
        InterfaceC47100Ie8 interfaceC47100Ie8 = C47578Ilq.LIZ().LIZ.LJ;
        int i2 = -1;
        if (interfaceC47100Ie8 != null) {
            i = ((C47089Idx) interfaceC47100Ie8).LIZ.LJIJJLI.getNetworkRttMs();
        } else {
            i = -1;
        }
        String LJIIIZ = C47752Ioe.LJIIIZ();
        String str = "unknown";
        if (!C47752Ioe.LJLI.equals("unknown")) {
            if (C47752Ioe.LJLIIIL.equals("unknown") && (c47906Ir8 = C47752Ioe.LJLIIL) != null) {
                C47752Ioe.LJLIIIL = C47752Ioe.LIZ(c47906Ir8.LIZIZ);
            }
            str = C47752Ioe.LJLIIIL;
        }
        if (TTVideoEngine.LJIIZILJ == 0) {
            int i3 = c47752Ioe.LJJJI;
            String str2 = c47752Ioe.LJIL;
            if (i3 < 0) {
                i3 = (int) ((C47619ImV) this.LJLIL.LIZ).LIZLLL(75);
            }
            if (i3 > 0) {
                LIZ(c47751Iod.LLLZIIL, c47751Iod.LLLZZ, Integer.valueOf(i3));
            }
            if (!TextUtils.isEmpty(str2)) {
                LIZ(c47751Iod.LLLZI, c47751Iod.LLLZZ, str2);
            }
            if (c47751Iod.LLLZIL.isEmpty()) {
                c47751Iod.LLLZIL.addAll(c47581Ilt.LIZ(c47581Ilt.LIZ));
            }
            int size = c47751Iod.LLLZIL.size();
            if (size >= this.LJLIL.LJLLI && size > 0) {
                ListProtector.remove(c47751Iod.LLLZIL, 0);
            }
            InterfaceC47100Ie8 interfaceC47100Ie82 = C47578Ilq.LIZ().LIZ.LJ;
            if (interfaceC47100Ie82 != null) {
                i2 = ((C47089Idx) interfaceC47100Ie82).LIZ.LJIJJLI.getNetworkType();
            }
            c47751Iod.LLLZIL.add(Integer.valueOf(i2));
        }
        if (c47751Iod.LLLZL.isEmpty()) {
            c47751Iod.LLLZL.addAll(c47581Ilt.LIZ(c47581Ilt.LIZIZ));
        }
        if (c47751Iod.LLLZ.isEmpty()) {
            ArrayList<Float> arrayList2 = c47751Iod.LLLZ;
            c47581Ilt.getClass();
            try {
                arrayList = c47581Ilt.LIZ(new ArrayList(c47581Ilt.LIZLLL.values()));
            } catch (Exception unused) {
                arrayList = new ArrayList();
            }
            arrayList2.addAll(arrayList);
        }
        int size2 = c47751Iod.LLLZL.size();
        if (size2 >= this.LJLIL.LJLLI && size2 > 0) {
            ListProtector.remove(c47751Iod.LLLZL, 0);
        }
        c47751Iod.LLLZL.add(Integer.valueOf(i));
        synchronized ("VideoEventLoggerV2") {
            c47750Ioc = this.LJLIL;
            long j = c47750Ioc.LJLLL;
            if (j > 0) {
                f = (((float) (c47750Ioc.LJLLJ * 8)) * 1000.0f) / ((float) j);
            } else {
                f = -1.0f;
            }
            c47750Ioc.LJLLL = 0L;
            c47750Ioc.LJLLJ = 0L;
        }
        if (f > 0.0f || !c47750Ioc.LJLJJI) {
            int size3 = c47751Iod.LLLZ.size();
            if (size3 >= this.LJLIL.LJLLI && size3 > 0) {
                ListProtector.remove(c47751Iod.LLLZ, 0);
            }
            c47751Iod.LLLZ.add(Float.valueOf(f));
        }
        c47581Ilt.getClass();
        try {
            java.util.Map<Long, Float> map = c47581Ilt.LIZLLL;
            if (map != Collections.EMPTY_MAP) {
                if (map.size() > c47581Ilt.LJII) {
                    c47581Ilt.LIZLLL.remove(c47581Ilt.LIZLLL.keySet().iterator().next());
                }
                c47581Ilt.LIZLLL.put(Long.valueOf(System.currentTimeMillis()), Float.valueOf(f));
            }
        } catch (Exception e) {
            C78253UnR.LIZLLL("NetworkPortraitData", e.getMessage());
        }
        if (!TextUtils.isEmpty(LJIIIZ)) {
            LIZ(c47751Iod.LLLLZLLIL, c47751Iod.LLLZZ, LJIIIZ);
        }
        if (!TextUtils.isEmpty(str)) {
            LIZ(c47751Iod.LLLLZLLLI, c47751Iod.LLLZZ, str);
        }
        int size4 = c47751Iod.LLLZLL.size();
        if (size4 >= this.LJLIL.LJLLI && size4 > 0) {
            ListProtector.remove(c47751Iod.LLLZLL, 0);
        }
        float LIZLLL = this.LJLIL.LJI.LIZLLL();
        if (LIZLLL != -1.0f) {
            c47751Iod.LLLZLL.add(Float.valueOf(LIZLLL));
        }
        c47751Iod.LLLZZ++;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public C47582Ilu(C47750Ioc c47750Ioc) {
        this.LJLIL = c47750Ioc;
    }

    public static void LIZ(LinkedHashMap linkedHashMap, int i, Object obj) {
        int size = linkedHashMap.size();
        if (size > 0) {
            if (!obj.equals(linkedHashMap.get(linkedHashMap.keySet().toArray()[size - 1]))) {
                linkedHashMap.put(Integer.toString(i), obj);
                return;
            }
            return;
        }
        linkedHashMap.put(Integer.toString(i), obj);
    }
}
