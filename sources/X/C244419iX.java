package X;

import com.bytedance.keva.Keva;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.9iX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C244419iX {
    public static final C62822Ol8 LIZ = C221108m2.LIZIZ(C244429iY.LJLIL);

    public static Keva LIZIZ() {
        return (Keva) LIZ.getValue();
    }

    public static final void LIZ() {
        String[] stringArray = LIZIZ().getStringArray(C9TY.LIZ("shown_notification_timestamp_array"), new String[0]);
        o.LJIIIIZZ(stringArray, "repo.getStringArray(SHOW…TAMP_ARRAY, emptyArray())");
        ArrayList arrayList = (ArrayList) ORY.LJLIIIL(stringArray);
        arrayList.add(String.valueOf(System.currentTimeMillis()));
        LIZIZ().storeStringArray(C9TY.LIZ("shown_notification_timestamp_array"), (String[]) arrayList.toArray(new String[0]));
    }
}
