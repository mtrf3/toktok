package X;

import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchCLASubtitleAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.JOf, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49085JOf extends AbstractC65781Prl implements InterfaceC88471Ynr<SearchCLASubtitleAssem, C49086JOg, C76800UCe> {
    public static final C49085JOf LJLIL = new C49085JOf();

    public C49085JOf() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(SearchCLASubtitleAssem searchCLASubtitleAssem, C49086JOg c49086JOg) {
        SearchCLASubtitleAssem selectSubscribe = searchCLASubtitleAssem;
        C49086JOg c49086JOg2 = c49086JOg;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c49086JOg2 != null) {
            if (c49086JOg2.LJLILLLLZI == 1) {
                selectSubscribe.k4();
            } else {
                selectSubscribe.c4();
            }
        }
        return C76800UCe.LIZ;
    }
}
