package X;

import android.content.res.Resources;
import android.os.Parcel;
import android.util.TypedValue;
import com.bytedance.router.SmartRoute;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.0Hs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C05040Hs {
    public static ArrayList LIZIZ(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return arrayList;
    }

    public static int LIZ(int i, float f) {
        return O6R.LJJIIZ(TypedValue.applyDimension(i, f, Resources.getSystem().getDisplayMetrics()));
    }

    public static C85323Wm LIZJ(String str, String str2, String str3) {
        C85323Wm LIZ = C772831o.LIZ();
        o.LJIIIZ(str, str2);
        o.LJIIIZ(LIZ, str3);
        return LIZ;
    }

    public static void LIZLLL(Parcel parcel, int i, Long l) {
        parcel.writeInt(i);
        parcel.writeLong(l.longValue());
    }

    public static void LJ(SmartRoute smartRoute, String str, String str2, String str3, String str4) {
        smartRoute.withParam(str, str2);
        smartRoute.withParam(str3, str4);
        smartRoute.open();
    }
}
