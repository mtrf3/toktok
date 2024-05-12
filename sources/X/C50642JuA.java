package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.core.model.SearchResultParamProvider;
import kotlin.jvm.internal.o;

/* renamed from: X.JuA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50642JuA {
    public static void LIZ(Context context, SearchResultParam param) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(param, "param");
        Activity LIZ = C27740Aue.LIZ(context);
        o.LJII(LIZ, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        ((SearchResultParamProvider) ViewModelProviders.of((ActivityC45651qj) LIZ).get(SearchResultParamProvider.class)).LJLIL = param;
    }
}
