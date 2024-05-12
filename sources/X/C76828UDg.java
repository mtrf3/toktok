package X;

import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.UDg, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76828UDg {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str) {
        if (o.LJ(str, EnumC76826UDe.GIFT_GUIDE_POPUP_NEW_GIFTER.getValue())) {
            return EnumC76826UDe.GIFT_GUIDE_POPUP.getValue();
        }
        if (str != null) {
            return str;
        }
        return "";
    }

    public static boolean LIZIZ(String str) {
        EnumC76826UDe[] values = EnumC76826UDe.values();
        ArrayList arrayList = new ArrayList(values.length);
        for (EnumC76826UDe enumC76826UDe : values) {
            arrayList.add(enumC76826UDe.getValue());
        }
        return ORZ.LJLJJI(str, arrayList);
    }
}
