package X;

import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7B6, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7B6 extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoDiggAssem, AnonymousClass799, C76800UCe> {
    public static final C7B6 LJLIL = new C7B6();

    public C7B6() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoDiggAssem videoDiggAssem, AnonymousClass799 anonymousClass799) {
        VideoItemParams gv0;
        Aweme aweme;
        C79N c79n;
        VideoDiggAssem selectSubscribeOnAsync = videoDiggAssem;
        AnonymousClass799 anonymousClass7992 = anonymousClass799;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        VideoDiggVM r4 = selectSubscribeOnAsync.r4();
        r4.getClass();
        if (HG3.LJIILL().isLogin() && (gv0 = r4.gv0()) != null && (aweme = gv0.getAweme()) != null) {
            if (anonymousClass7992 != null) {
                c79n = anonymousClass7992.LJLJJI;
            } else {
                c79n = null;
            }
            if (c79n == C79N.LIST && o.LJ(anonymousClass7992.LJLIL, C227768wm.LIZIZ(aweme)) && anonymousClass7992.LJLILLLLZI != r4.LJLLILLLL) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("handleSyncDiggState, receive event=");
                LIZ.append(anonymousClass7992);
                LIZ.append(", origin=");
                LIZ.append(r4.LJLLILLLL);
                C221018lt.LJFF("VideoDiggVM", X1D.LIZIZ(LIZ));
                AwemeStatistics statistics = aweme.getStatistics();
                if (statistics != null) {
                    statistics.setDiggCount(anonymousClass7992.LJLILLLLZI);
                }
                aweme.setUserDigg(anonymousClass7992.LJLJI);
                r4.setState(new AqS134S0200000_3(r4, aweme, 18));
            }
        }
        return C76800UCe.LIZ;
    }
}
