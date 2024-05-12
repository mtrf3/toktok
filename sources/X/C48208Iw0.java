package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.Iw0, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48208Iw0 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ() {
        String str;
        HashMap hashMap = new HashMap();
        if (C84763XOl.LJIIJJI) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        hashMap.put("IsBackground", str);
        C67128QWe.LIZIZ.LIZ.LJ(new byte[]{0}, hashMap);
    }

    public static int LIZ() {
        EnumC48204Ivw type = C48203Ivv.LIZIZ(EF7.LIZIZ());
        o.LJIIIZ(type, "type");
        int i = C48205Ivx.LIZ[type.ordinal()];
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i == 3) {
            return 3;
        }
        if (i == 4) {
            return 4;
        }
        return 0;
    }
}
