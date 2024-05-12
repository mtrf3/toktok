package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveFixNonstandardBubblesPhaseTwoSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Calendar;
import kotlin.jvm.internal.o;

/* renamed from: X.Cr2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32612Cr2 {
    public final C73318Sq2 LIZ = new C73318Sq2();
    public DataChannel LIZIZ;
    public InterfaceC32645CrZ LIZJ;
    public boolean LIZLLL;

    public static boolean LIZ() {
        boolean z;
        Boolean LIZJ = InterfaceC30442Bx8.b.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_GIFT_COLOR_ENTERED.value");
        if (LIZJ.booleanValue()) {
            return false;
        }
        java.util.Map<String, String> LIZJ2 = InterfaceC30442Bx8.a.LIZJ();
        o.LJIIIIZZ(LIZJ2, "LIVE_GIFT_COLOR_BUBBLE_HIST.value");
        java.util.Map<String, String> map = LIZJ2;
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        String str = map.get("time_slot");
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (str == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        calendar2.setTimeInMillis(CastLongProtector.parseLong(str));
        if (calendar2.get(1) == calendar.get(1) && calendar2.get(6) == calendar.get(6)) {
            z = true;
        } else {
            z = false;
        }
        String str3 = map.get("day_count");
        if (str3 == null) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        int parseInt = CastIntegerProtector.parseInt(str3);
        String str4 = map.get("show_count");
        if (str4 != null) {
            str2 = str4;
        }
        int parseInt2 = CastIntegerProtector.parseInt(str2);
        if (LiveFixNonstandardBubblesPhaseTwoSetting.INSTANCE.isInExperiment()) {
            if (z) {
                if (parseInt2 >= 1) {
                    return false;
                }
            } else if (parseInt >= 1) {
                return false;
            }
        } else if (z) {
            if (parseInt2 >= 1) {
                return false;
            }
        } else if (parseInt >= 3) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ() {
        boolean z;
        Boolean LIZJ = InterfaceC30442Bx8.b.LIZJ();
        o.LJIIIIZZ(LIZJ, "LIVE_GIFT_COLOR_ENTERED.value");
        if (LIZJ.booleanValue()) {
            return false;
        }
        java.util.Map<String, String> LIZJ2 = InterfaceC30442Bx8.LLZZZZ.LIZJ();
        o.LJIIIIZZ(LIZJ2, "LIVE_GIFT_COLOR_ANIM_HIST.value");
        java.util.Map<String, String> map = LIZJ2;
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        String str = map.get("time_slot");
        String str2 = CardStruct.IStatusCode.DEFAULT;
        if (str == null) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        calendar2.setTimeInMillis(CastLongProtector.parseLong(str));
        if (calendar2.get(1) == calendar.get(1) && calendar2.get(6) == calendar.get(6)) {
            z = true;
        } else {
            z = false;
        }
        String str3 = map.get("day_count");
        if (str3 == null) {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        int parseInt = CastIntegerProtector.parseInt(str3);
        String str4 = map.get("show_count");
        if (str4 != null) {
            str2 = str4;
        }
        int parseInt2 = CastIntegerProtector.parseInt(str2);
        if (z) {
            if (parseInt2 >= 5) {
                return false;
            }
        } else if (parseInt >= 3) {
            return false;
        }
        return true;
    }
}
