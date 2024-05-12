package X;

import android.os.Parcel;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.bytedance.tux.input.TuxTextView;
import java.util.Map;
import n.b;
import o7a.m;
import p8.a;

/* renamed from: X.1FJ, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class C1FJ implements InterfaceC162186Yc {
    public static Integer LIZIZ(Integer num) {
        return Integer.valueOf(O6R.LJJIIZ(C32151Nz.LJIIZILJ(num)));
    }

    @Override // X.InterfaceC162186Yc
    public void onError(String str) {
        C0JU.LIZLLL(str);
    }

    public static void LJI(C38333F2r c38333F2r, C26045AKb c26045AKb) {
        c26045AKb.LJIIIZ(c38333F2r.getErrorMsg());
        c26045AKb.LJIIJ();
    }

    public static void LJ(Parcel parcel, int i, Integer num) {
        parcel.writeInt(i);
        parcel.writeInt(num.intValue());
    }

    public static Object LIZJ(StringBuilder sb, String str, String str2, Map.Entry entry) {
        sb.append(str);
        sb.append(str2);
        return entry.getValue();
    }

    public static StringBuilder LIZLLL(String str, int i, String str2, long j) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(i);
        LIZ.append(str2);
        LIZ.append(j);
        return LIZ;
    }

    public static ViewParent LIZ(String str, String str2, TuxTextView tuxTextView, RelativeLayout.LayoutParams layoutParams, TuxTextView tuxTextView2) {
        new m();
        m.LIZ(str2, new a.c(str), tuxTextView, layoutParams);
        b.LIZ(tuxTextView2);
        return tuxTextView.getParent();
    }

    public static void LJFF(StringBuilder sb, String str, StringBuilder sb2, int i, String str2) {
        sb.append(str);
        C36922EeM.LIZLLL(i, str2, X1D.LIZIZ(sb2));
    }
}
