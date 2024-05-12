package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;
import n.b;
import o7a.m;
import p8.a;

/* renamed from: X.0Ne, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C06460Ne {
    public static boolean LJ(VideoItemParams videoItemParams, String str) {
        return o.LJ(str, videoItemParams.getAweme().getAid());
    }

    public static Drawable LIZ(View view, String str, C110614Vt c110614Vt) {
        Context context = view.getContext();
        o.LJIIIIZZ(context, str);
        return c110614Vt.LIZ(context);
    }

    public static ViewParent LIZIZ(String str, String str2, TuxTextView tuxTextView, LinearLayout.LayoutParams layoutParams, TuxTextView tuxTextView2) {
        new m();
        m.LIZ(str2, new a.c(str), tuxTextView, layoutParams);
        b.LIZ(tuxTextView2);
        return tuxTextView.getParent();
    }

    public static StringBuilder LIZJ(String str, int i, String str2, int i2, String str3) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append(i);
        LIZ.append(str2);
        LIZ.append(i2);
        LIZ.append(str3);
        return LIZ;
    }

    public static void LIZLLL(int i, C40431iJ c40431iJ, C24440xc c24440xc, C35931b3 c35931b3, int i2, int i3) {
        c40431iJ.invoke(c24440xc, c35931b3, Integer.valueOf(i));
        c35931b3.LJJIIJ(i2);
        c35931b3.LJJIIJ(i3);
    }
}
