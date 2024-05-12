package X;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FYX extends AbstractC65781Prl implements InterfaceC88472Yns<Fragment, CharSequence> {
    public static final FYX LJLIL = new FYX();

    public FYX() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(Fragment fragment) {
        String LIZ;
        Fragment it = fragment;
        o.LJIIIZ(it, "it");
        if (!(it instanceof FYY)) {
            it = null;
        }
        FYY fyy = (FYY) it;
        if (fyy == null || (LIZ = fyy.LIZ()) == null) {
            return "";
        }
        return ujb.o.LJJJJZ(LIZ, "Fragment", "", false);
    }
}
