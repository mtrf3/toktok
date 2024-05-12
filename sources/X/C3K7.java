package X;

import java.util.LinkedHashMap;

/* renamed from: X.3K7, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3K7 extends AbstractC65781Prl implements InterfaceC65784Pro<C76800UCe> {
    public static final C3K7 LJLIL = new C3K7();

    public C3K7() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final C76800UCe invoke() {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        C3K5 c3k5 = C3K5.LJLIL;
        synchronized (c3k5) {
            if (!C3K5.LJLJI) {
                if (C3K5.LIZ("fast_load", "click_tab", "first_item_show", "first_dm_item_attach")) {
                    C3K5.LJLJI = true;
                    OSZ[] oszArr = new OSZ[10];
                    java.util.Map<String, Long> map = C3K5.LJLILLLLZI;
                    Long l = (Long) ((LinkedHashMap) map).get("refresh_end");
                    long j13 = 0;
                    if (l != null) {
                        long longValue = l.longValue();
                        Long l2 = (Long) ((LinkedHashMap) map).get("refresh_start");
                        if (l2 != null) {
                            j12 = l2.longValue();
                        } else {
                            j12 = 0;
                        }
                        j = longValue - j12;
                    } else {
                        j = 0;
                    }
                    oszArr[0] = new OSZ("refresh_duration", String.valueOf(j));
                    Long l3 = (Long) ((LinkedHashMap) map).get("received_dm_data");
                    if (l3 != null) {
                        long longValue2 = l3.longValue();
                        Long l4 = (Long) ((LinkedHashMap) map).get("click_tab");
                        if (l4 != null) {
                            j11 = l4.longValue();
                        } else {
                            j11 = 0;
                        }
                        j2 = longValue2 - j11;
                    } else {
                        j2 = 0;
                    }
                    oszArr[1] = new OSZ("receive_data_duration", String.valueOf(j2));
                    Long l5 = (Long) ((LinkedHashMap) map).get("submit_data");
                    if (l5 != null) {
                        long longValue3 = l5.longValue();
                        Long l6 = (Long) ((LinkedHashMap) map).get("click_tab");
                        if (l6 != null) {
                            j10 = l6.longValue();
                        } else {
                            j10 = 0;
                        }
                        j3 = longValue3 - j10;
                    } else {
                        j3 = 0;
                    }
                    oszArr[2] = new OSZ("submit_data_duration", String.valueOf(j3));
                    Long l7 = (Long) ((LinkedHashMap) map).get("first_dm_item_attach");
                    if (l7 != null) {
                        long longValue4 = l7.longValue();
                        Long l8 = (Long) ((LinkedHashMap) map).get("click_tab");
                        if (l8 != null) {
                            j9 = l8.longValue();
                        } else {
                            j9 = 0;
                        }
                        j4 = longValue4 - j9;
                    } else {
                        j4 = 0;
                    }
                    oszArr[3] = new OSZ("first_item_attach_duration", String.valueOf(j4));
                    Long l9 = (Long) ((LinkedHashMap) map).get("first_item_show");
                    if (l9 != null) {
                        long longValue5 = l9.longValue();
                        Long l10 = (Long) ((LinkedHashMap) map).get("click_tab");
                        if (l10 != null) {
                            j8 = l10.longValue();
                        } else {
                            j8 = 0;
                        }
                        j5 = longValue5 - j8;
                    } else {
                        j5 = 0;
                    }
                    oszArr[4] = new OSZ("first_item_show_duration", String.valueOf(j5));
                    oszArr[5] = new OSZ("fast_load_conv_size", String.valueOf(C3K5.LJLJLJ));
                    oszArr[6] = new OSZ("total_conv_size", String.valueOf(C3K5.LJLJLLL));
                    Long l11 = (Long) ((LinkedHashMap) map).get("on_node_show");
                    if (l11 != null) {
                        long longValue6 = l11.longValue();
                        Long l12 = (Long) ((LinkedHashMap) map).get("click_tab");
                        if (l12 != null) {
                            j7 = l12.longValue();
                        } else {
                            j7 = 0;
                        }
                        j6 = longValue6 - j7;
                    } else {
                        j6 = 0;
                    }
                    oszArr[7] = new OSZ("inbox_show_duration", String.valueOf(j6));
                    oszArr[8] = new OSZ("has_conv_cache_inbox_first_click", String.valueOf(false));
                    Long l13 = (Long) ((LinkedHashMap) map).get("received_notice_data");
                    if (l13 != null) {
                        long longValue7 = l13.longValue();
                        Long l14 = (Long) ((LinkedHashMap) map).get("received_dm_data");
                        if (l14 != null) {
                            j13 = l14.longValue();
                        }
                        j13 = longValue7 - j13;
                    }
                    oszArr[9] = new OSZ("interval_between_notice_and_dm_data", String.valueOf(j13));
                    C3K5.LIZLLL(c3k5, "im_conv_list_perf", C113554cx.LJJL(oszArr), null, 4);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
