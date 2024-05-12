package Y;

import X.ActivityC86117Xqz;
import X.C32I;
import X.C41319GJn;
import X.C42318GjC;
import X.C42470Gle;
import X.C43001GuD;
import X.C51029K0z;
import X.FMX;
import X.GUH;
import X.GUI;
import X.GUQ;
import X.GUU;
import X.GUX;
import X.GXR;
import X.InterfaceC41605GUn;
import X.InterfaceC42874GsA;
import X.ViewOnClickListenerC42873Gs9;
import android.app.Activity;
import com.ss.android.ugc.aweme.shortvideo.cut.VEMediaParserFrameProviderImpl;
import com.ss.android.ugc.aweme.shortvideo.cut.videoeditv2.VEMediaParserProviderV2;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import com.ss.android.ugc.aweme.tools.mvtemplate.ugcpreview.play.PlayViewComponent;
import com.ss.android.vesdk.VEMediaParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class ARunnableS8S1100000_7 implements Runnable {
    public final int $t;
    public Object l1;
    public String s0;

    public final void LIZ$0() {
        String str = this.s0;
        Map map = (Map) this.l1;
        Map<String, Double> cpuRate = C42318GjC.LIZ().getCpuRate();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C51029K0z.LJJIIZ(cpuRate.size()));
        for (Map.Entry<String, Double> entry : cpuRate.entrySet()) {
            linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue().doubleValue()));
        }
        map.putAll(linkedHashMap);
        Map<String, Long> memory = C42318GjC.LIZ().getMemory();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C51029K0z.LJJIIZ(memory.size()));
        for (Map.Entry<String, Long> entry2 : memory.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), String.valueOf(entry2.getValue().longValue()));
        }
        map.putAll(linkedHashMap2);
        map.put("thermal", C42318GjC.LIZ().getBatteryTemperature());
        map.put("battery_level", C42318GjC.LIZ().getBatteryPercent());
        map.put("memory_rate", C42318GjC.LIZ().getMemoryUsedRate());
        GXR.LIZ(str, map);
    }

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
            default:
                return;
        }
    }

    public final void LIZ$1() {
        if (o.LJ(((C41319GJn) this.l1).LJ.peek(), this.s0)) {
            ((C41319GJn) this.l1).LJ.pop();
            ((C41319GJn) this.l1).LJIIIIZZ().storeString("exit_monitor_key_last_page", ((C41319GJn) this.l1).LJ.peek());
        }
    }

    public final void LIZ$2() {
        ActivityC86117Xqz activityC86117Xqz = ((PlayViewComponent) this.l1).LJLJI;
        String str = null;
        if (activityC86117Xqz != null) {
            if (!o.LJ(activityC86117Xqz.getLocalClassName(), this.s0)) {
                ActivityC86117Xqz activityC86117Xqz2 = ((PlayViewComponent) this.l1).LJLJI;
                if (activityC86117Xqz2 != null) {
                    String localClassName = activityC86117Xqz2.getLocalClassName();
                    Activity LIZ = C42470Gle.LIZ();
                    if (LIZ != null) {
                        str = LIZ.getLocalClassName();
                    }
                    if (o.LJ(localClassName, str)) {
                        String shootWay = ((PlayViewComponent) this.l1).LJLILLLLZI.LIZJ();
                        o.LJIIIZ(shootWay, "shootWay");
                        FMX.LJIIL("enter_template_preview_page", C43001GuD.LJIIIZ(shootWay).LIZ);
                        return;
                    }
                    return;
                }
                o.LJIJI("activity");
                throw null;
            }
            return;
        }
        o.LJIJI("activity");
        throw null;
    }

    public final void LIZ$3() {
        GUI gui = GUH.LIZJ;
        String publishId = this.s0;
        GUX callback = (GUX) this.l1;
        ExecutorService executor = GUH.LIZLLL;
        synchronized (gui) {
            o.LJIIIZ(publishId, "publishId");
            o.LJIIIZ(callback, "callback");
            o.LJIIIZ(executor, "executor");
            List<GUU> mPublishRecordList = gui.LIZ;
            o.LJIIIIZZ(mPublishRecordList, "mPublishRecordList");
            for (GUU guu : mPublishRecordList) {
                if (o.LJ(guu.LIZIZ, publishId)) {
                    executor.execute(new ARunnableS26S0200000_7(callback, guu, 14));
                }
            }
        }
    }

    public final void LIZ$4() {
        GUQ guq = GUH.LJI;
        if (guq != null) {
            guq.LJ((InterfaceC41605GUn) this.l1);
        }
        GUI gui = GUH.LIZJ;
        String str = this.s0;
        InterfaceC41605GUn callback = (InterfaceC41605GUn) this.l1;
        ExecutorService executor = GUH.LIZLLL;
        synchronized (gui) {
            o.LJIIIZ(callback, "callback");
            o.LJIIIZ(executor, "executor");
            if (str != null) {
                List<GUU> mPublishRecordList = gui.LIZ;
                o.LJIIIIZZ(mPublishRecordList, "mPublishRecordList");
                for (GUU guu : mPublishRecordList) {
                    if (o.LJ(guu.LIZIZ, str)) {
                        executor.execute(new ARunnableS26S0200000_7(callback, guu, 15));
                    }
                }
            } else {
                List<GUU> mPublishRecordList2 = gui.LIZ;
                o.LJIIIIZZ(mPublishRecordList2, "mPublishRecordList");
                ArrayList arrayList = new ArrayList(C32I.LJJL(mPublishRecordList2, 10));
                Iterator<GUU> it = mPublishRecordList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().LJI);
                }
                executor.execute(new ARunnableS26S0200000_7(callback, arrayList, 16));
            }
        }
    }

    public static final void run$0(ARunnableS8S1100000_7 aRunnableS8S1100000_7) {
        boolean LIZ;
        try {
            aRunnableS8S1100000_7.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS8S1100000_7 aRunnableS8S1100000_7) {
        boolean LIZ;
        try {
            aRunnableS8S1100000_7.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS8S1100000_7 aRunnableS8S1100000_7) {
        boolean LIZ;
        try {
            VEMediaParser vEMediaParser = (VEMediaParser) ((LinkedHashMap) ((VEMediaParserFrameProviderImpl) aRunnableS8S1100000_7.l1).LJLILLLLZI).get(aRunnableS8S1100000_7.s0);
            if (vEMediaParser != null) {
                vEMediaParser.release();
                ((VEMediaParserFrameProviderImpl) aRunnableS8S1100000_7.l1).LJLILLLLZI.put(aRunnableS8S1100000_7.s0, null);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS8S1100000_7 aRunnableS8S1100000_7) {
        boolean LIZ;
        try {
            aRunnableS8S1100000_7.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS8S1100000_7 aRunnableS8S1100000_7) {
        boolean LIZ;
        try {
            ((MvChoosePhotoScene) aRunnableS8S1100000_7.l1).LLZL(aRunnableS8S1100000_7.s0);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$5(ARunnableS8S1100000_7 aRunnableS8S1100000_7) {
        boolean LIZ;
        try {
            GUH.LIZIZ(aRunnableS8S1100000_7.s0, (GUX) aRunnableS8S1100000_7.l1);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$6(ARunnableS8S1100000_7 aRunnableS8S1100000_7) {
        boolean LIZ;
        try {
            aRunnableS8S1100000_7.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$7(ARunnableS8S1100000_7 aRunnableS8S1100000_7) {
        boolean LIZ;
        try {
            aRunnableS8S1100000_7.LIZ$4();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$8(ARunnableS8S1100000_7 aRunnableS8S1100000_7) {
        boolean LIZ;
        try {
            InterfaceC42874GsA interfaceC42874GsA = ((ViewOnClickListenerC42873Gs9) aRunnableS8S1100000_7.l1).LJLIL;
            if (interfaceC42874GsA != null) {
                interfaceC42874GsA.LJLJLLL(aRunnableS8S1100000_7.s0);
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$9(ARunnableS8S1100000_7 aRunnableS8S1100000_7) {
        boolean LIZ;
        try {
            VEMediaParser vEMediaParser = (VEMediaParser) ((LinkedHashMap) ((VEMediaParserProviderV2) aRunnableS8S1100000_7.l1).LJLILLLLZI).get(aRunnableS8S1100000_7.s0);
            if (vEMediaParser != null) {
                VEMediaParserProviderV2 vEMediaParserProviderV2 = (VEMediaParserProviderV2) aRunnableS8S1100000_7.l1;
                vEMediaParserProviderV2.LJLILLLLZI.put(aRunnableS8S1100000_7.s0, null);
                vEMediaParser.release();
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public ARunnableS8S1100000_7(java.lang.String r2, X.GUX r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            switch(r4) {
                case 5: goto Le;
                default: goto L5;
            }
        L5:
            r0 = r1
            r0.s0 = r2
            r0.l1 = r3
        La:
            r0.<init>()
            return
        Le:
            r0 = r1
            r0.l1 = r3
            r0.s0 = r2
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ARunnableS8S1100000_7.<init>(java.lang.String, X.GUX, int):void");
    }

    public ARunnableS8S1100000_7(Object obj, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.s0 = str;
    }
}
