package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoSkipAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoHolderVM;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoSkipVM;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.JOr, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49097JOr extends AbstractC65781Prl implements InterfaceC88471Ynr<SearchVideoSkipAssem, C43I<? extends View>, C76800UCe> {
    public static final C49097JOr LJLIL = new C49097JOr();

    public C49097JOr() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(SearchVideoSkipAssem searchVideoSkipAssem, C43I<? extends View> c43i) {
        String str;
        SearchVideoSkipAssem selectSubscribe = searchVideoSkipAssem;
        C43I<? extends View> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && ((View) c43i2.LIZ).getId() == R.id.n82) {
            Object value = selectSubscribe.LL.getValue();
            JQA jqa = ((SearchVideoHolderVM) selectSubscribe.LJZL.getValue()).LJLJI;
            Aweme aweme = selectSubscribe.LLD;
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            value.getClass();
            SearchVideoSkipVM.hv0(jqa, str, false);
        }
        return C76800UCe.LIZ;
    }
}
