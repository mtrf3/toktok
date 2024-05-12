package defpackage;

import X.C221018lt;
import X.O0Z;
import X.X1D;
import android.content.Context;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.services.LoginService;

/* loaded from: classes9.dex */
public final /* synthetic */ class b0 implements O0Z {
    @Override // X.O0Z
    public void onComplete() {
        LoginService.LIZIZ();
    }

    public static String LIZIZ(String str, Object obj) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(obj);
        return X1D.LIZIZ(LIZ);
    }

    public static TuxTextView LIZ(Context context, int i, int i2) {
        TuxTextView tuxTextView = new TuxTextView(context);
        tuxTextView.setId(i);
        tuxTextView.setText(i2);
        return tuxTextView;
    }

    public static String LIZJ(StringBuilder sb, int i, char c, StringBuilder sb2) {
        sb.append(i);
        sb.append(c);
        return X1D.LIZIZ(sb2);
    }

    public static void LJ(StringBuilder sb, String str, String str2, long j) {
        sb.append(str);
        sb.append(str2);
        sb.append(j);
    }

    public static void LJFF(StringBuilder sb, String str, StringBuilder sb2, String str2) {
        sb.append(str);
        C221018lt.LJFF(str2, X1D.LIZIZ(sb2));
    }
}
