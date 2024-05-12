package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.services.BaseUserService;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.08h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C025908h {
    public static long LIZ() {
        return ((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId();
    }

    public static boolean LJFF(boolean z, String str) {
        return o.LJ(str, BaseUserService.createIUserServicebyMonsterPlugin(z).getCurrentUserID());
    }

    public static SY9 LIZJ(View view, String str, C2068389v c2068389v) {
        Context context = view.getContext();
        o.LJIIIIZZ(context, str);
        return c2068389v.LIZ(context);
    }

    public static String LIZIZ(StringBuilder sb, String str, String str2, String str3, StringBuilder sb2) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        return X1D.LIZIZ(sb2);
    }

    public static void LIZLLL(String str, String str2, AwemeRawAd awemeRawAd, String str3, String str4) {
        C58655N0h LIZLLL = C58704N2e.LIZLLL(str, str2, awemeRawAd);
        LIZLLL.LIZJ(str3, str4);
        LIZLLL.LJI();
    }

    public static void LJ(Object[] objArr, int i, String str, String str2, TuxTextView tuxTextView) {
        String LLLZ = C16880lQ.LLLZ(str, Arrays.copyOf(objArr, i));
        o.LJIIIIZZ(LLLZ, str2);
        tuxTextView.setText(LLLZ);
    }
}
