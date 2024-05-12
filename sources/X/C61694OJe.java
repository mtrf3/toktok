package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

/* renamed from: X.OJe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61694OJe {
    static {
        C16880lQ.LJLLJ(C61694OJe.class);
    }

    public static long LIZ(String str) {
        Logger.debug();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        long j = 0;
        try {
            Date parse = simpleDateFormat.parse(str);
            if (parse == null) {
                return 0L;
            }
            j = parse.getTime();
            return j;
        } catch (ParseException e) {
            C16880lQ.LLLLIIL(e);
            return j;
        }
    }

    public static boolean LIZJ(String str, List<Long> list) {
        if (TextUtils.isEmpty(str) || !str.contains("~")) {
            return false;
        }
        String[] split = str.split("~");
        if (split.length == 2 && !TextUtils.isEmpty(split[0]) && !TextUtils.isEmpty(split[1])) {
            long LIZ = LIZ(split[0]);
            long LIZ2 = LIZ(split[1]);
            if (LIZ > 0 && LIZ2 > 0 && LIZ < LIZ2) {
                list.add(Long.valueOf(LIZ));
                list.add(Long.valueOf(LIZ2));
                return true;
            }
        }
        return false;
    }

    public static boolean LIZIZ(String str, String str2, List list) {
        String[] split;
        String[] split2;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty("=") || (split = str.split(str2)) == null) {
            return false;
        }
        for (int i = 0; i < split.length; i++) {
            if (!TextUtils.isEmpty(split[i]) && (split2 = split[i].trim().split("=")) != null && split2.length == 2 && !TextUtils.isEmpty(split2[0]) && !TextUtils.isEmpty(split2[1])) {
                ((ArrayList) list).add(new Pair(split2[0].trim(), split2[1].trim()));
            }
        }
        if (((ArrayList) list).size() == 0) {
            return false;
        }
        return true;
    }
}
