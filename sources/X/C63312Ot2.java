package X;

import android.text.TextUtils;
import com.bytedance.im.core.proto.Request;
import com.bytedance.im.core.proto.RequestBody;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;

/* renamed from: X.Ot2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63312Ot2 {
    public static final String LIZ = C16880lQ.LJLLJ(C63312Ot2.class);

    public static String LJFF(int i) {
        switch (i) {
            case 0:
                return "init";
            case 1:
                return "more_page";
            case 2:
                return "cursor";
            case 3:
                return "net";
            case 4:
                return "manual";
            case 5:
            case 7:
            default:
                return "other";
            case 6:
                return "token";
            case 8:
                return "polling";
            case 9:
                return "migrate";
            case 10:
                return "switch_to_foreground";
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY /* 11 */:
                return "no_ws";
            case 12:
                return "stranger";
        }
    }

    public static int[] LIZLLL() {
        int[] iArr = C63308Osy.LJI().LIZLLL().LJIJ;
        if (iArr == null) {
            return C63308Osy.LJI().LIZLLL().LJIIZILJ;
        }
        return iArr;
    }

    public static boolean LIZIZ(Integer num) {
        if (num == null) {
            return false;
        }
        EnumC63625Oy5 enumC63625Oy5 = EnumC63625Oy5.REPORT_CLIENT_METRICS;
        if (enumC63625Oy5.getValue() == num.intValue() || EnumC63625Oy5.BROADCAST_RECV_MESSAGE.getValue() == num.intValue()) {
            return true;
        }
        if (C63308Osy.LJI().LJI == null) {
            return false;
        }
        if (num.intValue() != enumC63625Oy5.getValue()) {
            if (num.intValue() != EnumC63625Oy5.GET_CONVERSATION_PARTICIPANTS_READ_INDEX_V3.getValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean LJI(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String valueOf = String.valueOf(C63308Osy.LJI().LIZIZ().getUid());
        for (String str2 : str.split(",")) {
            if (str2 != null && (str2.equals(valueOf) || str2.equals(CardStruct.IStatusCode.DEFAULT))) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZJ(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return z;
        }
        try {
            return Boolean.parseBoolean(str);
        } catch (Exception e) {
            C63322OtC.LJ(LIZ, e);
            return z;
        }
    }

    public static long LJ(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return j;
        }
        try {
            return CastLongProtector.parseLong(str);
        } catch (Exception e) {
            C63322OtC.LJ(LIZ, e);
            return j;
        }
    }

    public static String LJII(String str, List list) {
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(ListProtector.get(list, i));
            if (i < list.size() - 1) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static Request LIZ(int i, int i2, RequestBody requestBody) {
        return C32151Nz.LJ(i, i2, requestBody, C63308Osy.LJI().LIZIZ(), C63308Osy.LJI().LIZLLL());
    }
}
