package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.JPt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49125JPt extends AbstractC49114JPi {
    public static final /* synthetic */ int LJZI = 0;
    public final int LJLLILLLL;
    public final String LJLLJ;
    public final C80001VaX LJLLL;
    public final View LJLLLL;
    public final View LJLLLLLL;
    public ViewGroup LJLZ;
    public final C62822Ol8 LJZ;

    @Override // X.AbstractC49114JPi
    public final boolean LJIILIIL() {
        java.util.Set LJII = C77275UUl.LJII(0);
        FHD.LIZLLL().getClass();
        return LJII.contains(Integer.valueOf(FHD.LJ(0, 0, "search_live_swipe_action", true)));
    }

    public C49125JPt(JTI jti, JIB jib, JGU jgu, View view, int i, String str) {
        super(jti, jib, jgu);
        Integer num;
        this.LJLLILLLL = i;
        this.LJLLJ = str;
        this.LJLLLLLL = LJIIIZ().findViewById(R.id.e3c);
        this.LJZ = C221108m2.LIZIZ(new AqS158S0100000_8(this, 489));
        C80001VaX c80001VaX = (C80001VaX) view.findViewById(R.id.jck);
        o.LJIIIIZZ(c80001VaX, "view.scroll_for_more_layout");
        this.LJLLL = c80001VaX;
        View findViewById = view.findViewById(R.id.n_i);
        o.LJIIIIZZ(findViewById, "view.view_blank_for_scroll");
        this.LJLLLL = findViewById;
        C49098JOs.LIZ.getClass();
        Integer valueOf = Integer.valueOf(C49098JOs.LJFF());
        if (valueOf.intValue() > 0) {
            if (1 != 0) {
                int intValue = valueOf.intValue();
                View findViewById2 = view.findViewById(R.id.b5o);
                if (findViewById2 != null) {
                    Integer valueOf2 = Integer.valueOf(C49098JOs.LJ());
                    int intValue2 = valueOf2.intValue();
                    if (intValue2 > 0 && intValue - intValue2 > 0) {
                        num = Integer.valueOf(intValue - valueOf2.intValue());
                    } else {
                        num = null;
                    }
                    C26338AVi.LJIIIZ(findViewById2, AnonymousClass391.LIZJ(intValue), null, num != null ? C1FJ.LIZIZ(num) : null, null, 26);
                }
            }
        }
    }
}
