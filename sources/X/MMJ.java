package X;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public enum MMJ {
    JANUS_NETWORK_TIME("JANUS_NETWORK_TIME", "inbox_janus_network_time"),
    ENTRANCE_LIST_NETWORK_TIME("ENTRANCE_LIST_NETWORK_TIME", "inbox_entrance_list_network_time"),
    SKYLIGHT_SHOW_TIME("SKYLIGHT_SHOW_TIME", "inbox_skylight_show_time"),
    ENTRANCE_LIST_SHOW_TIME("ENTRANCE_LIST_SHOW_TIME", "inbox_entrance_list_show_time"),
    DM_SHOW_TIME("DM_SHOW_TIME", "inbox_dm_show_time"),
    ENTRANCE_LIST_IS_PRELOAD("ENTRANCE_LIST_IS_PRELOAD", "inbox_entrance_list_is_preload"),
    ENTRANCE_LIST_PRELOAD_IS_CANCELLED("ENTRANCE_LIST_PRELOAD_IS_CANCELLED", "inbox_entrance_list_preload_is_cancelled"),
    LAST_SHOW_SECTION("LAST_SHOW_SECTION", "inbox_last_show_section"),
    HAS_DM("HAS_DM", "inbox_has_dm"),
    SHOW_TOTAL_TIME("SHOW_TOTAL_TIME", "inbox_show_total_time");

    public final String LJLIL;
    public final int LJLILLLLZI;
    public volatile MMP LJLJI = new MMP();
    public volatile MMQ LJLJJI = new MMQ(0L);
    public final AtomicBoolean LJLJJL = new AtomicBoolean(false);

    public static MMJ valueOf(String str) {
        return (MMJ) V0N.LJJJ(MMJ.class, str);
    }

    /* renamed from: getValue, reason: collision with other method in class */
    public final synchronized Object m24getValue() {
        return this.LJLJJI.LIZ;
    }

    public final synchronized void intervalEnd() {
        this.LJLJI.LIZIZ = System.currentTimeMillis();
    }

    public final synchronized void intervalStart() {
        this.LJLJI.LIZ = System.currentTimeMillis();
    }

    public final String getEventKey() {
        return this.LJLIL;
    }

    public final int getEventType() {
        return this.LJLILLLLZI;
    }

    public final AtomicBoolean getHasRecord() {
        return this.LJLJJL;
    }

    public final MMP getInterval() {
        return this.LJLJI;
    }

    public final MMQ getValue() {
        return this.LJLJJI;
    }

    public final void setInterval(MMP mmp) {
        o.LJIIIZ(mmp, "<set-?>");
        this.LJLJI = mmp;
    }

    public final synchronized void setValue(Object result) {
        o.LJIIIZ(result, "result");
        MMQ mmq = this.LJLJJI;
        mmq.getClass();
        mmq.LIZ = result;
    }

    public final void setValue(MMQ mmq) {
        o.LJIIIZ(mmq, "<set-?>");
        this.LJLJJI = mmq;
    }

    MMJ(String str, String str2) {
        this.LJLIL = str2;
        this.LJLILLLLZI = r5;
    }
}
