package X;

import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BJP {
    public static String LIZ = "";
    public static String LIZIZ = "";

    public static boolean LIZ() {
        if (o.LJ(LIZIZ, "ec_shop") || o.LJ(LIZ, "ec_shop")) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(String value) {
        BJE bje;
        String str;
        o.LJIIIZ(value, "value");
        LIZIZ = value;
        C28246B6s c28246B6s = (C28246B6s) DataChannelGlobal.LJLJJI.mv0(C29049Baf.class);
        if (c28246B6s == null || (bje = c28246B6s.LJ) == null) {
            return;
        }
        if (LIZ()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        bje.LJI = str;
    }

    public static void LIZJ(String value) {
        BJE bje;
        String str;
        o.LJIIIZ(value, "value");
        LIZ = value;
        C28246B6s c28246B6s = (C28246B6s) DataChannelGlobal.LJLJJI.mv0(C29049Baf.class);
        if (c28246B6s == null || (bje = c28246B6s.LJ) == null) {
            return;
        }
        if (LIZ()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        bje.LJI = str;
    }
}
