package X;

import android.view.View;
import android.view.ViewStub;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarImageView;
import kotlin.jvm.internal.o;

/* renamed from: X.74o, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1799874o {
    public final ViewStub LIZ;
    public final M89 LIZIZ;
    public View LIZJ;
    public TuxTextView LIZLLL;
    public SmartAvatarImageView LJ;
    public final int LJFF;
    public final int LJI;

    public C1799874o(ViewStub vsb, M89 param) {
        o.LJIIIZ(vsb, "vsb");
        o.LJIIIZ(param, "param");
        this.LIZ = vsb;
        this.LIZIZ = param;
        this.LJFF = 24;
        this.LJI = 5;
    }

    public static String LIZ(TuxTextView tuxTextView, String str, String str2, int i) {
        float measureText = (i - tuxTextView.getPaint().measureText(str)) - tuxTextView.getPaint().measureText("...");
        if (tuxTextView.getPaint().measureText(str2) <= measureText) {
            return str2;
        }
        int i2 = 0;
        while (i2 < str2.length()) {
            int i3 = i2 + 1;
            measureText -= tuxTextView.getPaint().measureText(str2, i2, i3);
            if (measureText <= 0.0f) {
                break;
            }
            i2 = i3;
        }
        StringBuilder LIZ = X1D.LIZ();
        String substring = str2.substring(0, i2);
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        LIZ.append(substring);
        LIZ.append("...");
        return X1D.LIZIZ(LIZ);
    }
}
