package X;

import android.app.Activity;
import android.view.View;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.ecomsearch.viewmodel.EcSearchTabViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.977, reason: invalid class name */
/* loaded from: classes5.dex */
public final class AnonymousClass977 {
    public static EcSearchTabViewModel LIZ(View view) {
        o.LJIIIZ(view, "view");
        Activity LIZIZ = C27740Aue.LIZIZ(view);
        o.LJII(LIZIZ, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (EcSearchTabViewModel) ViewModelProviders.of((ActivityC45651qj) LIZIZ).get(EcSearchTabViewModel.class);
    }
}
