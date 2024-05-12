package defpackage;

import X.C0NB;
import X.C38352F3k;
import X.C78273Unl;
import X.X1D;
import android.content.Context;
import android.view.ViewStub;

/* loaded from: classes13.dex */
public final /* synthetic */ class b1 {
    public static void LIZLLL() {
        C78273Unl.LJIIIZ().LJ().getClass();
    }

    public static StringBuilder LIZJ(String str, String str2) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(str2);
        return LIZ;
    }

    public static ViewStub LIZ(Context context, int i, int i2) {
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(i);
        viewStub.setLayoutResource(i2);
        return viewStub;
    }

    public static String LIZIZ(String str, StringBuilder sb, String str2, StringBuilder sb2) {
        sb.append(C38352F3k.LIZJ(str));
        sb.append(str2);
        return X1D.LIZIZ(sb2);
    }

    public static void LJ(StringBuilder sb, int i, StringBuilder sb2, String str) {
        sb.append(i);
        C0NB.LJIIIZ(str, X1D.LIZIZ(sb2));
    }
}
