package X;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FYW extends AbstractC65781Prl implements InterfaceC88472Yns<Fragment, CharSequence> {
    public static final FYW LJLIL = new FYW();

    public FYW() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(Fragment fragment) {
        String LIZIZ;
        Fragment it = fragment;
        o.LJIIIZ(it, "it");
        if (!(it instanceof FYY)) {
            it = null;
        }
        FYY fyy = (FYY) it;
        if (fyy == null || (LIZIZ = fyy.LIZIZ()) == null) {
            return "";
        }
        return ujb.o.LJJJJZ(LIZIZ, "Fragment", "", false);
    }
}
