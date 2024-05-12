package Y;

import X.C76800UCe;
import X.InterfaceC64672gJ;
import X.InterfaceC67352kd;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.bot.model.PollingInfoResponse;
import com.ss.android.ugc.aweme.search.pages.result.bot.viewmodel.TakoPollingVM;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchCLASubtitleAssem;
import kotlin.jvm.internal.AqS139S0200000_8;

/* loaded from: classes9.dex */
public class IDfS129S0100000_8 implements InterfaceC64672gJ {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC64672gJ
    public final Object emit(String str, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        switch (this.$t) {
            case 0:
                return emit$0(this, str, interfaceC67352kd);
            case 1:
                return emit$1(this, str, interfaceC67352kd);
            case 2:
                return emit$2(this, str, interfaceC67352kd);
            default:
                return null;
        }
    }

    public IDfS129S0100000_8(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final Object emit$0(IDfS129S0100000_8 iDfS129S0100000_8, Object obj, InterfaceC67352kd interfaceC67352kd) {
        SearchCLASubtitleAssem searchCLASubtitleAssem = (SearchCLASubtitleAssem) iDfS129S0100000_8.l0;
        Aweme aweme = searchCLASubtitleAssem.LLFFF;
        if (aweme != null) {
            searchCLASubtitleAssem.e4(aweme);
        }
        return C76800UCe.LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0149, code lost:
    
        if (r7.getVisibility() == 8) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object emit$1(Y.IDfS129S0100000_8 r10, java.lang.Object r11, X.InterfaceC67352kd r12) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.IDfS129S0100000_8.emit$1(Y.IDfS129S0100000_8, java.lang.Object, X.2kd):java.lang.Object");
    }

    public static final Object emit$2(IDfS129S0100000_8 iDfS129S0100000_8, Object obj, InterfaceC67352kd interfaceC67352kd) {
        TakoPollingVM takoPollingVM = (TakoPollingVM) iDfS129S0100000_8.l0;
        takoPollingVM.setState(new AqS139S0200000_8((PollingInfoResponse) obj, takoPollingVM, 33));
        return C76800UCe.LIZ;
    }
}
