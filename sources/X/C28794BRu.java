package X;

import com.bytedance.android.livesdk.impl.revenue.treasurebox.model.ActivityTreasureBoxInfo4FE;
import com.bytedance.android.livesdk.impl.revenue.treasurebox.model.ActivityTreasureBoxMessage4FE;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.BRu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28794BRu {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Boolean bool, String str, List list) {
        String str2;
        int i;
        String str3;
        InterfaceC29405BgP LIZIZ;
        InterfaceC05190Ih interfaceC05190Ih;
        ActivityTreasureBoxMessage4FE activityTreasureBoxMessage4FE;
        ActivityTreasureBoxInfo4FE activityTreasureBoxInfo4FE;
        String str4;
        ActivityTreasureBoxMessage4FE activityTreasureBoxMessage4FE2;
        ActivityTreasureBoxInfo4FE activityTreasureBoxInfo4FE2;
        Integer num;
        ActivityTreasureBoxMessage4FE activityTreasureBoxMessage4FE3;
        ActivityTreasureBoxInfo4FE activityTreasureBoxInfo4FE3;
        HashMap hashMap = new HashMap(7);
        String str5 = "";
        if (list == null || (activityTreasureBoxMessage4FE3 = (ActivityTreasureBoxMessage4FE) ListProtector.get(list, 0)) == null || (activityTreasureBoxInfo4FE3 = activityTreasureBoxMessage4FE3.envelopInfo) == null || (str2 = activityTreasureBoxInfo4FE3.envelopeId) == null) {
            str2 = "";
        }
        hashMap.put("envelope_id", str2);
        if (list != null && (activityTreasureBoxMessage4FE2 = (ActivityTreasureBoxMessage4FE) ListProtector.get(list, 0)) != null && (activityTreasureBoxInfo4FE2 = activityTreasureBoxMessage4FE2.envelopInfo) != null && (num = activityTreasureBoxInfo4FE2.businessType) != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        hashMap.put("business_type", String.valueOf(i));
        if (list != null && (activityTreasureBoxMessage4FE = (ActivityTreasureBoxMessage4FE) ListProtector.get(list, 0)) != null && (activityTreasureBoxInfo4FE = activityTreasureBoxMessage4FE.envelopInfo) != null && (str4 = activityTreasureBoxInfo4FE.sendUserId) != null) {
            str5 = str4;
        }
        hashMap.put("send_user_id", str5);
        hashMap.put("drop_reason", str);
        B83 LIZ2 = B83.LIZ();
        if (LIZ2 != null && (LIZIZ = LIZ2.LIZIZ()) != null && (interfaceC05190Ih = ((C29374Bfu) LIZIZ).LIZIZ) != null) {
            UFE.LIZJ(interfaceC05190Ih, hashMap, "user_id");
        }
        if (o.LJ(bool, Boolean.TRUE)) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("is_anchor", str3);
        BZI LIZ3 = C28787BRn.LIZ("livesdk_treasure_box_data_drop");
        LIZ3.LJJIFFI(hashMap);
        LIZ3.LJIIZILJ();
        LIZ3.LJIIJJI("live_detail");
        LIZ3.LJIIL("click");
        LIZ3.LJIIIZ("live");
        LIZ3.LJJIIJZLJL();
        C0K2.LJII(0, "ttlive_treasure_box_data_drop", hashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        if (r0 != null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(int r8, java.lang.String r9, java.util.List r10, java.lang.Boolean r11) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C28794BRu.LIZIZ(int, java.lang.String, java.util.List, java.lang.Boolean):void");
    }
}
