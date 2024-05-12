package X;

import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchCLASubtitleAssem;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.videwmodel.SearchCLASubtitleVM;
import com.ss.android.ugc.aweme.service.CaptionKevaServiceImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JOU extends AbstractC65781Prl implements InterfaceC88471Ynr<SearchCLASubtitleAssem, C43I<? extends EnumC48742JBa>, C76800UCe> {
    public static final JOU LJLIL = new JOU();

    public JOU() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(SearchCLASubtitleAssem searchCLASubtitleAssem, C43I<? extends EnumC48742JBa> c43i) {
        EnumC48742JBa enumC48742JBa;
        SearchCLASubtitleAssem selectSubscribe = searchCLASubtitleAssem;
        C43I<? extends EnumC48742JBa> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (enumC48742JBa = (EnumC48742JBa) c43i2.LIZ) != null) {
            JJR jjr = selectSubscribe.LLFF;
            if (jjr != null) {
                jjr.setState(enumC48742JBa);
                SearchCLASubtitleVM Z3 = selectSubscribe.Z3();
                int value = enumC48742JBa.getValue();
                Z3.getClass();
                CaptionKevaServiceImpl.LJJJJI().LJJIIZ(value);
            } else {
                o.LJIJI("subtitleView");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}
