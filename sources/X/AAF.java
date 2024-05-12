package X;

import android.content.Context;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class AAF extends AbstractC65781Prl implements InterfaceC88472Yns<Context, View> {
    public static final AAF INSTANCE = new AAF();

    public AAF() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final View invoke(Context it) {
        o.LJIIIZ(it, "it");
        View LIZ = C7W6.LIZ(it, R.layout.ayp, null);
        View findViewById = LIZ.findViewById(R.id.egk);
        C110614Vt c110614Vt = new C110614Vt();
        c110614Vt.LIZIZ = Integer.valueOf(R.attr.db);
        c110614Vt.LIZJ = Float.valueOf(C32151Nz.LJIIZILJ(48));
        c110614Vt.LJI = O6R.LJJIIZ(C32151Nz.LJIIZILJ(48));
        c110614Vt.LJII = O6R.LJJIIZ(C32151Nz.LJIIZILJ(48));
        findViewById.setBackground(c110614Vt.LIZ(it));
        C16880lQ.LJIIJ(AAG.LJLIL, LIZ);
        AAI.LIZJ(LIZ, "homepage_friends_empty_invite", AAH.LJLIL);
        return LIZ;
    }
}
