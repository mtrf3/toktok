package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.ecomsearch.viewmodel.EcSearchResultParamProvider;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.jvm.internal.o;

/* renamed from: X.K8j, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51221K8j {
    public static void LIZ(Context context, SearchResultParam param) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(param, "param");
        Activity LIZ = C27740Aue.LIZ(context);
        o.LJII(LIZ, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ViewModelProviders.of((ActivityC45651qj) LIZ).get(EcSearchResultParamProvider.class).getClass();
    }
}
