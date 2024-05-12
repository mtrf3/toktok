package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import ujb.o;

/* renamed from: X.NVa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59454NVa {
    public static final boolean LIZIZ(CharSequence charSequence) {
        String str;
        if (charSequence == null || (str = charSequence.toString()) == null) {
            str = "";
        }
        if (!o.LJJJLIIL(str, "http", false) && !o.LJJJLIIL(str, "https", false) && !o.LJJJLIIL(str, "about:", false)) {
            return false;
        }
        return true;
    }

    public static final void LIZJ(Activity activity, String str) {
        if (C38354F3m.LJ(str)) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setData(UriProtector.parse(str));
            intent.setAction("android.intent.action.VIEW");
            intent.putExtra("pns.sandbox.dataflow_id", 1207967489);
            if (activity != null) {
                C16880lQ.LIZIZ(activity, intent);
            }
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
        }
    }

    public static final void LIZ(Activity activity, String str, C78862UxG c78862UxG) {
        if (C38354F3m.LJ(str)) {
            return;
        }
        try {
            OHT.LIZ("", str, activity, c78862UxG);
        } catch (Exception e) {
            C78983UzD.LJIIZILJ(e);
            C36922EeM.LIZ(e);
        }
        if (activity != null) {
            C26045AKb c26045AKb = new C26045AKb(activity);
            c26045AKb.LJIIIIZZ(R.string.se6);
            c26045AKb.LJFF(R.drawable.anx);
            c26045AKb.LJIIJ();
        }
    }
}
