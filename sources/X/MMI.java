package X;

import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public enum MMI {
    LAUNCH_TIMESTAMP("inbox_launch_timestamp"),
    NOTICE_COUNT_TIMESTAMP("inbox_notice_count_timestamp"),
    SWITCH_TAB_TIMESTAMP("inbox_switch_tab_timestamp"),
    LAUNCH_TO_TAB_INTERVAL("inbox_launch_to_tab_interval"),
    NOTICE_COUNT_TO_TAB_INTERVAL("inbox_notice_count_to_tab_interval"),
    LAUNCH_TO_NOTICE_COUNT_INTERVAL("inbox_launch_to_notice_count_interval"),
    TOTAL_UNREAD_COUNT("inbox_total_unread_count"),
    HAS_TAB_DOT("inbox_has_tab_dot");

    public final String LJLIL;
    public volatile long LJLILLLLZI = -1;

    public static MMI valueOf(String str) {
        return (MMI) V0N.LJJJ(MMI.class, str);
    }

    public final synchronized long getEventValue() {
        long j;
        if (this.LJLILLLLZI != -1) {
            j = this.LJLILLLLZI;
        } else {
            j = 0;
        }
        return j;
    }

    public final synchronized void trackTime() {
        setEventValue(System.currentTimeMillis());
    }

    public final String getEventKey() {
        return this.LJLIL;
    }

    public final long minus(MMI tabEvent) {
        o.LJIIIZ(tabEvent, "tabEvent");
        if (this.LJLILLLLZI == -1 || tabEvent.LJLILLLLZI == -1) {
            return 0L;
        }
        return this.LJLILLLLZI - tabEvent.LJLILLLLZI;
    }

    public final synchronized void setEventValue(long j) {
        this.LJLILLLLZI = j;
    }

    MMI(String str) {
        this.LJLIL = str;
    }
}
