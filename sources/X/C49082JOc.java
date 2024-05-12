package X;

import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchCLASubtitleAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.JOc, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49082JOc extends AbstractC65781Prl implements InterfaceC88471Ynr<SearchCLASubtitleAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C49082JOc LJLIL = new C49082JOc();

    public C49082JOc() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(SearchCLASubtitleAssem searchCLASubtitleAssem, C43I<? extends Integer> c43i) {
        Integer num;
        SearchCLASubtitleAssem selectSubscribe = searchCLASubtitleAssem;
        C43I<? extends Integer> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && (num = (Integer) c43i2.LIZ) != null) {
            if (num.intValue() == 0) {
                selectSubscribe.k4();
            } else if (num.intValue() == 1) {
                selectSubscribe.c4();
            } else if (num.intValue() != 2 && num.intValue() != 3) {
                num.intValue();
            }
        }
        return C76800UCe.LIZ;
    }
}
