package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.9vb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C252519vb implements InterfaceC69602oG {
    public static long LJLILLLLZI;
    public static final C252519vb LJLIL = new C252519vb();
    public static String LJLJI = "";

    public static final void LIZ(ActivityC45651qj activityC45651qj, String str) {
        C2NU.LIZ.LIZ(LJLIL);
        if (!o.LJ(str, LJLJI)) {
            LJLJI = str;
            return;
        }
        if (System.currentTimeMillis() < LJLILLLLZI) {
            return;
        }
        C26045AKb c26045AKb = new C26045AKb(activityC45651qj);
        c26045AKb.LJIIIIZZ(R.string.dtn);
        c26045AKb.LJIIJ();
        C40340FsO.LIZ(R.string.dtn);
        LJLILLLLZI = System.currentTimeMillis() + 3600000;
    }

    @Override // X.InterfaceC69602oG
    public final void onChange(EnumC111394Yt enumC111394Yt, EnumC111394Yt enumC111394Yt2) {
        LJLILLLLZI = (LJLILLLLZI - 3600000) + 600000;
    }
}
