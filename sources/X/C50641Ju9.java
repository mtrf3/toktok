package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.result.core.model.SearchResultParamProvider;
import kotlin.jvm.internal.AqS32S0001000_8;
import kotlin.jvm.internal.o;

/* renamed from: X.Ju9, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50641Ju9 {
    public static Long LIZ = 0L;
    public static final C62822Ol8 LIZIZ = C221108m2.LIZIZ(C50640Ju8.LJLIL);

    public static java.util.Map LIZ() {
        return (java.util.Map) LIZIZ.getValue();
    }

    public static void LIZIZ(Context context, int i, SearchResultParam searchResultParam, Long l) {
        SearchResultParam searchResultParam2;
        if (context == null) {
            return;
        }
        C110564Vo c110564Vo = new C110564Vo(OJ4.LJJJJLL(OJ4.LJJJJ(C5UN.LJJLJ(LIZ()), new AqS32S0001000_8(i, 4)), C50643JuB.LJLIL));
        while (c110564Vo.hasNext()) {
            InterfaceC50639Ju7 interfaceC50639Ju7 = (InterfaceC50639Ju7) c110564Vo.next();
            if (searchResultParam == null) {
                Activity LIZ2 = C27740Aue.LIZ(context);
                o.LJII(LIZ2, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
                searchResultParam2 = ((SearchResultParamProvider) ViewModelProviders.of((ActivityC45651qj) LIZ2).get(SearchResultParamProvider.class)).LJLIL;
                if (searchResultParam2 == null) {
                    searchResultParam2 = new SearchResultParam();
                }
            } else {
                searchResultParam2 = searchResultParam;
            }
            interfaceC50639Ju7.LIZ(context, searchResultParam2, l);
        }
    }
}
