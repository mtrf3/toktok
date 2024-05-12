package X;

import android.content.Context;
import androidx.fragment.app.FragmentManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class A1X {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, boolean z) {
        FragmentManager supportFragmentManager;
        if (z) {
            ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(context);
            if (LJJIFFI != null && (supportFragmentManager = LJJIFFI.getSupportFragmentManager()) != null) {
                C26224AQy c26224AQy = new C26224AQy();
                C2068389v c2068389v = new C2068389v();
                c2068389v.LIZ = R.raw.icon_tick_circle_fill;
                c2068389v.LJ = Integer.valueOf(R.attr.e8);
                c26224AQy.LIZ = c2068389v.LIZ(context);
                c26224AQy.LIZLLL = 3;
                c26224AQy.LJ = C29822Bn8.LIZ(context, R.string.p0c, "context.resources.getStr…_submitdiscard_apprecsug)");
                A1Z[] a1zArr = {new A1Z(2, context.getResources().getString(R.string.p0i), C29822Bn8.LIZ(context, R.string.p0f, "context.resources.getStr…scard_editsuggestimprove)")), new A1Z(1, context.getResources().getString(R.string.p0d), C29822Bn8.LIZ(context, R.string.p0j, "context.resources.getStr…t_submitdiscard_validsug)")), new A1Z(0, context.getResources().getString(R.string.p0e), C29822Bn8.LIZ(context, R.string.p0g, "context.resources.getStr…dit_submitdiscard_notfct)"))};
                ((ArrayList) c26224AQy.LJI).clear();
                ((ArrayList) c26224AQy.LJI).addAll(ORY.LJJZZIII(a1zArr));
                c26224AQy.LJIILIIL = true;
                String string = context.getResources().getString(R.string.p0h);
                A1Y a1y = A1Y.LJLIL;
                c26224AQy.LJII = string;
                c26224AQy.LJIIIZ = a1y;
                c26224AQy.LIZ().LIZ.show(supportFragmentManager, "submitDiscardIntroSheet");
                return;
            }
            return;
        }
        ActivityC45651qj LJJIFFI2 = C45804HyK.LJJIFFI(context);
        if (LJJIFFI2 == null) {
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(LJJIFFI2);
        c26045AKb.LJIIIZ(context.getResources().getString(R.string.p0c));
        c26045AKb.LJFF(R.raw.icon_tick_fill_small);
        c26045AKb.LJII(R.attr.e8);
        c26045AKb.LJIIJ();
    }
}
