package X;

import com.bytedance.ies.sdk.widgets.ConstraintProperty;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.UIn, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* synthetic */ class C76965UIn {
    public static String LJ(int i) {
        switch (i) {
            case 0:
                return "Reset";
            case 1:
                return "Prepare";
            case 2:
                return "Prepared";
            case 3:
                return "Start";
            case 4:
                return "Resume";
            case 5:
                return "Pause";
            case 6:
                return "Stop";
            case 7:
                return "Release";
            default:
                return "Unknown";
        }
    }

    public static ArrayList LIZ(Class cls) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(cls);
        return arrayList;
    }

    public static void LIZIZ(float f, C65403Plf c65403Plf, String str) {
        c65403Plf.LJIJJ(Float.valueOf(f));
        c65403Plf.LJI(str);
    }

    public static void LIZJ(StringBuilder sb, boolean z, String str, boolean z2, String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(z2);
        sb.append(str2);
    }

    public static boolean LIZLLL(Boolean bool, LayeredElementContext layeredElementContext, String str, ConstraintProperty constraintProperty, String str2) {
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(layeredElementContext, str);
        o.LJIIIZ(constraintProperty, str2);
        return booleanValue;
    }
}
