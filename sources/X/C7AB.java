package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.nows.interaction.assem.NowCommentAssem;
import com.ss.android.ugc.aweme.nows.interaction.viewmodel.NowCommentViewModel;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7AB, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7AB extends AbstractC65781Prl implements InterfaceC88471Ynr<NowCommentAssem, C50420Jqa, C76800UCe> {
    public static final C7AB LJLIL = new C7AB();

    public C7AB() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(NowCommentAssem nowCommentAssem, C50420Jqa c50420Jqa) {
        NowCommentAssem selectSubscribeOnAsync = nowCommentAssem;
        C50420Jqa c50420Jqa2 = c50420Jqa;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        if (c50420Jqa2 != null && c50420Jqa2.LJLIL == 14 && o.LJ(c50420Jqa2.LJLILLLLZI, ((C7ML) C51029K0z.LJIILLIIL(selectSubscribeOnAsync)).getAweme().getAid())) {
            AwemeStatistics statistics = ((C7ML) C51029K0z.LJIILLIIL(selectSubscribeOnAsync)).getAweme().getStatistics();
            Long l = c50420Jqa2.LJLLLLLL;
            o.LJIIIIZZ(l, "event.realCommentCount");
            statistics.setCommentCount(l.longValue());
            NowCommentViewModel m4 = selectSubscribeOnAsync.m4();
            Aweme aweme = ((C7ML) C51029K0z.LJIILLIIL(selectSubscribeOnAsync)).getAweme();
            m4.getClass();
            o.LJIIIZ(aweme, "aweme");
            m4.setState(new AqS134S0200000_3(m4, aweme, 189));
        }
        return C76800UCe.LIZ;
    }
}
