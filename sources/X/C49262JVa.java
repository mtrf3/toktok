package X;

import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.search.pages.core.ui.activity.SearchResultActivity;
import com.ss.android.ugc.aweme.search.performance.asyncprefetch.communicattion.AsyncViewHolderViewModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.JVa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49262JVa {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(JW4 viewHolder) {
        AsyncViewHolderViewModel asyncViewHolderViewModel;
        HashMap<JW4, ArrayList<Runnable>> hashMap;
        o.LJIIIZ(viewHolder, "viewHolder");
        SearchResultActivity LJ = C50989Jzl.LJ();
        if (!(LJ instanceof ActivityC45651qj) || LJ == null || (asyncViewHolderViewModel = (AsyncViewHolderViewModel) ViewModelProviders.of(LJ).get(AsyncViewHolderViewModel.class)) == null || (hashMap = asyncViewHolderViewModel.LJLIL) == null) {
            return null;
        }
        return hashMap.remove(viewHolder);
    }
}
