package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import com.ss.android.ugc.aweme.search.pages.middlepage.core.utils.IntermediatePreload;
import kotlin.jvm.internal.o;

/* renamed from: X.JvQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50720JvQ {
    public static void LIZ(SearchResultParam param, C50431Jql c50431Jql) {
        o.LJIIIZ(param, "param");
        C50789JwX c50789JwX = C50768JwC.LIZIZ;
        if (c50789JwX != null && c50789JwX.LIZJ > 0) {
            c50789JwX.LJIILJJIL = System.currentTimeMillis() - c50789JwX.LIZJ;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("search_enter_param", param);
        bundle.putSerializable("search_global_param", c50431Jql);
        C74782wc.LIZ().LIZIZ(bundle, IntermediatePreload.class, new C50657JuP());
    }
}
