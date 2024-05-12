package X;

import android.content.Context;
import android.os.Parcel;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import kotlin.jvm.internal.o;

/* renamed from: X.1FL, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C1FL implements InterfaceC31922Cfu {
    public static RelativeLayout LIZJ(Context context, int i) {
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(i);
        return relativeLayout;
    }

    public static int LIZ(String str, int i, int i2) {
        return str.length() + i + i2;
    }

    public static void LJ(Parcel parcel, int i, Boolean bool) {
        parcel.writeInt(i);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public static void LJI(BZI bzi, String str, String str2) {
        bzi.LJIJJ(str, str2);
        bzi.LJIIZILJ();
        bzi.LJJIIJZLJL();
    }

    public static StringBuilder LIZLLL(String str, String str2, String str3, String str4) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(str2);
        LIZ.append(str3);
        LIZ.append(str4);
        return LIZ;
    }

    public static View LIZIZ(ViewGroup viewGroup, int i, ViewGroup viewGroup2, boolean z, String str) {
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(viewGroup.getContext()), i, viewGroup2, z);
        o.LJIIIIZZ(LLLLIILL, str);
        return LLLLIILL;
    }

    public static void LJFF(StringBuilder sb, boolean z, String str, int i, String str2) {
        sb.append(z);
        sb.append(str);
        sb.append(i);
        sb.append(str2);
    }
}
