package X;

import com.bytedance.android.livesdk.comp.impl.linkcore.layout.internal.LayoutSlardarMonitor;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicLayoutSlardarCombineSetting;
import org.json.JSONObject;

/* renamed from: X.U8v, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC76713U8v implements Runnable {
    public final /* synthetic */ LayoutSlardarMonitor LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ boolean LJLJJI;
    public final /* synthetic */ String LJLJJL;

    public RunnableC76713U8v(LayoutSlardarMonitor layoutSlardarMonitor, String str, String str2, boolean z, String str3) {
        this.LJLIL = layoutSlardarMonitor;
        this.LJLILLLLZI = str;
        this.LJLJI = str2;
        this.LJLJJI = z;
        this.LJLJJL = str3;
    }

    public final void LIZ() {
        LayoutSlardarMonitor layoutSlardarMonitor = this.LJLIL;
        long j = layoutSlardarMonitor.LIZIZ + 1;
        layoutSlardarMonitor.LIZIZ = j;
        U8K.LIZJ = j;
        if (!LivesdkLinkmicLayoutSlardarCombineSetting.INSTANCE.isLayoutSwitchReportEnable()) {
            return;
        }
        LayoutSlardarMonitor layoutSlardarMonitor2 = this.LJLIL;
        String str = layoutSlardarMonitor2.LIZJ;
        layoutSlardarMonitor2.LIZJ = this.LJLILLLLZI;
        layoutSlardarMonitor2.LIZLLL = this.LJLJI;
        JSONObject LIZ = layoutSlardarMonitor2.LIZ("linkmic_layout_switch");
        boolean z = this.LJLJJI;
        String str2 = this.LJLJJL;
        LIZ.put("from_layout_id", str);
        LIZ.put("is_horizontal", z);
        LIZ.put("hash", str2);
        C0K2.LJIIIIZZ("ttlive_link_interact_layout_event_monitor", 0, LIZ);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
