package X;

import android.content.Context;
import android.view.View;
import ccb.t;

/* loaded from: classes14.dex */
public final /* synthetic */ class V10 {
    public static int LIZ() {
        return C259710f.LIZ.LIZJ();
    }

    public static View LIZIZ(Context context, int i) {
        View view = new View(context);
        view.setId(i);
        return view;
    }

    public static StringBuilder LIZJ(String str, long j, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(j);
        LIZ.append(str2);
        return LIZ;
    }

    public static void LJ(Boolean bool, BZI bzi, String str) {
        bzi.LJIJJ(Integer.valueOf(C29306Beo.LJJIFFI(bool) ? 1 : 0), str);
    }

    public static C24440xc LIZLLL(C35931b3 c35931b3, InterfaceC015404g interfaceC015404g, C45911r9 c45911r9, C35931b3 c35931b32) {
        C24830yF.LIZ(c35931b3, interfaceC015404g, c45911r9);
        c35931b3.LJIIIIZZ();
        return new C24440xc(c35931b32);
    }

    public static void LJFF(StringBuilder sb, int i, String str, long j) {
        sb.append(i);
        sb.append(str);
        sb.append(j);
    }

    public static void LJI(StringBuilder sb, int i, StringBuilder sb2, t tVar, int i2) {
        sb.append(i);
        tVar.K0(i2, X1D.LIZIZ(sb2));
    }
}
