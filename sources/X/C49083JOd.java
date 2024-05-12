package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchCLASubtitleAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.JOd, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49083JOd extends AbstractC65781Prl implements InterfaceC88471Ynr<SearchCLASubtitleAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C49083JOd LJLIL = new C49083JOd();

    public C49083JOd() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(SearchCLASubtitleAssem searchCLASubtitleAssem, C43I<? extends Boolean> c43i) {
        SearchCLASubtitleAssem selectSubscribe = searchCLASubtitleAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        Aweme aweme = selectSubscribe.LLFFF;
        if (aweme != null) {
            selectSubscribe.e4(aweme);
            selectSubscribe.g4();
        }
        return C76800UCe.LIZ;
    }
}
