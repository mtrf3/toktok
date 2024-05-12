package X;

import android.view.ViewGroup;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.JPu, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49126JPu {
    public static C49124JPs LIZ(ViewGroup parent, JIB containerStatusProvider, JGU jgu) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(containerStatusProvider, "containerStatusProvider");
        C49124JPs c49124JPs = new C49124JPs(C50365Jph.LIZIZ(R.layout.chv, parent), containerStatusProvider, jgu);
        c49124JPs.LJLLLLLL = (SearchStateViewModel) ViewModelProviders.of(c49124JPs.getActivity()).get(SearchStateViewModel.class);
        return c49124JPs;
    }
}
