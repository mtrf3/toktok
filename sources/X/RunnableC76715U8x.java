package X;

import com.bytedance.android.livesdk.comp.impl.linkcore.layout.internal.LayoutSlardarMonitor;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicLayoutSlardarCombineSetting;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import org.json.JSONObject;

/* renamed from: X.U8x, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class RunnableC76715U8x implements Runnable {
    public final /* synthetic */ LayoutSlardarMonitor LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ Long LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ Integer LJLJJL;
    public final /* synthetic */ Integer LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ boolean LJLJLJ;

    public RunnableC76715U8x(LayoutSlardarMonitor layoutSlardarMonitor, boolean z, Long l, String str, Integer num, Integer num2, String str2, boolean z2) {
        this.LJLIL = layoutSlardarMonitor;
        this.LJLILLLLZI = z;
        this.LJLJI = l;
        this.LJLJJI = str;
        this.LJLJJL = num;
        this.LJLJJLL = num2;
        this.LJLJL = str2;
        this.LJLJLJ = z2;
    }

    public final void LIZ() {
        Object obj;
        if (!LivesdkLinkmicLayoutSlardarCombineSetting.INSTANCE.isLayoutGuestChangeReportEnable()) {
            return;
        }
        JSONObject LIZ = this.LJLIL.LIZ("linkmic_guest_change");
        boolean z = this.LJLILLLLZI;
        Long l = this.LJLJI;
        String str = this.LJLJJI;
        Integer num = this.LJLJJL;
        Integer num2 = this.LJLJJLL;
        String str2 = this.LJLJL;
        boolean z2 = this.LJLJLJ;
        String str3 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.put("opt", obj);
        LIZ.put("changed_uid", l);
        LIZ.put("changed_linkmic_id", str);
        LIZ.put("changed_logic_pos", num);
        LIZ.put("changed_ui_pos", num2);
        LIZ.put("hash", str2);
        if (!z2) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        LIZ.put("in_linked_list", str3);
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
