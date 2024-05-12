package Y;

import X.C09650Zl;
import X.C0K2;
import X.U8I;
import android.view.SurfaceView;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.comp.impl.linkcore.layout.internal.LayoutSlardarMonitor;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicLayoutSlardarCombineSetting;
import com.google.gson.Gson;
import com.ss.ttlivestreamer.livestreamv2.core.ILayerControl;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class ARunnableS10S1300000_13 implements Runnable {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
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
            default:
                return;
        }
    }

    public final void LIZ$0() {
        if (!LivesdkLinkmicLayoutSlardarCombineSetting.INSTANCE.isLayoutRenderEnable()) {
            return;
        }
        JSONObject LIZ = ((LayoutSlardarMonitor) this.l1).LIZ("linkmic_biz_render");
        List list = (List) this.l2;
        String str = this.s0;
        LayoutSlardarMonitor.Player player = (LayoutSlardarMonitor.Player) this.l3;
        try {
            LIZ.put("biz_windows", new JSONArray(C09650Zl.LIZIZ.LJIILL(list)));
            LIZ.put("hash", str);
        } catch (Exception unused) {
        }
        if (player != null) {
            try {
                LIZ.put("player", new JSONObject(C09650Zl.LIZIZ.LJIILL(player)));
            } catch (Exception unused2) {
            }
        }
        C0K2.LJIIIIZZ("ttlive_link_interact_layout_event_monitor", 0, LIZ);
    }

    public final void LIZ$1() {
        LayoutSlardarMonitor.Container container;
        if (!LivesdkLinkmicLayoutSlardarCombineSetting.INSTANCE.isLayoutMeasureReportEnable()) {
            return;
        }
        ViewGroup invoke = ((LayoutSlardarMonitor) this.l1).LIZ.LJI.invoke();
        if (invoke == null) {
            container = new LayoutSlardarMonitor.Container(0, 0, 0, 0, 15, null);
        } else {
            container = new LayoutSlardarMonitor.Container(invoke.getLeft(), invoke.getTop(), invoke.getWidth(), invoke.getHeight());
        }
        JSONObject LIZ = ((LayoutSlardarMonitor) this.l1).LIZ("linkmic_layout_measure");
        LayoutSlardarMonitor.Container container2 = (LayoutSlardarMonitor.Container) this.l2;
        List list = (List) this.l3;
        String str = this.s0;
        try {
            Gson gson = C09650Zl.LIZIZ;
            LIZ.put("real_container", new JSONObject(gson.LJIILL(container)));
            LIZ.put("measured_container", new JSONObject(gson.LJIILL(container2)));
            LIZ.put("windows", new JSONArray(gson.LJIILL(list)));
        } catch (Exception unused) {
        }
        LIZ.put("hash", str);
        C0K2.LJIIIIZZ("ttlive_link_interact_layout_event_monitor", 0, LIZ);
    }

    public static final void run$0(ARunnableS10S1300000_13 aRunnableS10S1300000_13) {
        boolean LIZ;
        try {
            ((U8I) aRunnableS10S1300000_13.l1).LIZ(aRunnableS10S1300000_13.s0, (SurfaceView) aRunnableS10S1300000_13.l2, (ILayerControl.ILayer) aRunnableS10S1300000_13.l3);
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS10S1300000_13 aRunnableS10S1300000_13) {
        boolean LIZ;
        try {
            aRunnableS10S1300000_13.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS10S1300000_13 aRunnableS10S1300000_13) {
        boolean LIZ;
        try {
            aRunnableS10S1300000_13.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS10S1300000_13(Object obj, LayoutSlardarMonitor layoutSlardarMonitor, LayoutSlardarMonitor.Container container, List<LayoutSlardarMonitor.Window> list, String str) {
        this.$t = str;
        this.l1 = obj;
        this.l2 = layoutSlardarMonitor;
        this.l3 = container;
        this.s0 = list;
    }
}
