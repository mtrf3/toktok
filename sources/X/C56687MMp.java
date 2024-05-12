package X;

import Y.IDFactoryS64S0000000_9;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.inbox.widget.multi.MultiViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.MMp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56687MMp {
    public static String LIZIZ() {
        return (String) MultiViewModel.LLJIJIL.getValue();
    }

    public static MultiViewModel LIZ(Fragment fragment) {
        o.LJIIIZ(fragment, "fragment");
        MultiViewModel multiViewModel = (MultiViewModel) ViewModelProviders.of(fragment, (IDFactoryS64S0000000_9) MultiViewModel.LLJI.getValue()).get(MultiViewModel.class);
        if (C53357Kwr.LIZIZ()) {
            multiViewModel.LLIIIL = C56690MMs.LIZ(fragment);
        }
        return multiViewModel;
    }
}
