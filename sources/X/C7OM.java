package X;

import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem;
import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7OM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7OM extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoCommentAssem, C50420Jqa, C76800UCe> {
    public static final C7OM LJLIL = new C7OM();

    public C7OM() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoCommentAssem videoCommentAssem, C50420Jqa c50420Jqa) {
        AwemeStatistics statistics;
        VideoCommentAssem selectSubscribeOnAsync = videoCommentAssem;
        C50420Jqa c50420Jqa2 = c50420Jqa;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        if (c50420Jqa2 != null && c50420Jqa2.LJLIL == 14) {
            Object obj = c50420Jqa2.LJLILLLLZI;
            Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribeOnAsync)).getAweme();
            String str = null;
            if (aweme != null) {
                str = aweme.getAid();
            }
            if (o.LJ(obj, str)) {
                Long l = c50420Jqa2.LJLLLLLL;
                if (l != null) {
                    long longValue = l.longValue();
                    Aweme aweme2 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribeOnAsync)).getAweme();
                    if (aweme2 != null && (statistics = aweme2.getStatistics()) != null) {
                        statistics.setCommentCount(longValue);
                    }
                }
                VideoCommentVM u4 = selectSubscribeOnAsync.u4();
                Aweme aweme3 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribeOnAsync)).getAweme();
                u4.getClass();
                u4.setState(new AqS134S0200000_3(u4, aweme3, 243));
            }
        }
        return C76800UCe.LIZ;
    }
}
