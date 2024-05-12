package X;

import android.view.View;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchVideoSkipAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoHolderVM;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchVideoSkipVM;
import kotlin.jvm.internal.o;

/* renamed from: X.JOq, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49096JOq extends AbstractC65781Prl implements InterfaceC88471Ynr<SearchVideoSkipAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C49096JOq LJLIL = new C49096JOq();

    public C49096JOq() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(SearchVideoSkipAssem searchVideoSkipAssem, C43I<? extends Integer> c43i) {
        Integer num;
        SearchVideoSkipAssem selectSubscribe = searchVideoSkipAssem;
        C43I<? extends Integer> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        String str = null;
        if (c43i2 != null) {
            num = (Integer) c43i2.LIZ;
        } else {
            num = null;
        }
        if (num != null) {
            if (num.intValue() == 0) {
                View view = selectSubscribe.LLFF;
                if (view != null) {
                    view.setVisibility(0);
                    if (!selectSubscribe.LLFFF) {
                        Object value = selectSubscribe.LL.getValue();
                        JQA jqa = ((SearchVideoHolderVM) selectSubscribe.LJZL.getValue()).LJLJI;
                        Aweme aweme = selectSubscribe.LLD;
                        if (aweme != null) {
                            str = aweme.getAid();
                        }
                        value.getClass();
                        SearchVideoSkipVM.hv0(jqa, str, true);
                        selectSubscribe.LLFFF = true;
                    }
                } else {
                    o.LJIJI("videoSkipView");
                    throw null;
                }
            } else if (num.intValue() == 1) {
                View view2 = selectSubscribe.LLFF;
                if (view2 != null) {
                    view2.setVisibility(8);
                } else {
                    o.LJIJI("videoSkipView");
                    throw null;
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
