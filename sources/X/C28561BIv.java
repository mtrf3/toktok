package X;

import com.bytedance.ies.sdk.datachannel.DataChannel;

/* renamed from: X.BIv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28561BIv {
    public static void LIZ(DataChannel dataChannel, String str, String str2) {
        Long l;
        InterfaceC05190Ih interfaceC05190Ih;
        BZI LIZIZ = C0JU.LIZIZ("livesdk_violation_list_appeal_submit_toast", str, "record_id", str2, "appeal_result");
        Long l2 = null;
        if (dataChannel != null) {
            l = Long.valueOf(C29306Beo.LJJIZ(dataChannel));
        } else {
            l = null;
        }
        LIZIZ.LJIJJ(l, "room_id");
        InterfaceC29405BgP LIZIZ2 = B83.LIZ().LIZIZ();
        if (LIZIZ2 != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ2).LIZIZ) != null) {
            l2 = Long.valueOf(interfaceC05190Ih.getId());
        }
        LIZIZ.LJIJJ(l2, "anchor_id");
        LIZIZ.LJJIIJZLJL();
    }
}
