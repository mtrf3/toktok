package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.7zd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C204057zd extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoShareAssem, C46276IEe, C76800UCe> {
    public static final C204057zd LJLIL = new C204057zd();

    public C204057zd() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoShareAssem videoShareAssem, C46276IEe c46276IEe) {
        String str;
        Aweme aweme;
        VideoShareAssem selectSubscribeOnAsync = videoShareAssem;
        C46276IEe c46276IEe2 = c46276IEe;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        if (c46276IEe2 != null) {
            VideoShareViewModel z4 = selectSubscribeOnAsync.z4();
            z4.getClass();
            if (c46276IEe2.LJLIL == 7) {
                String str2 = c46276IEe2.LJLILLLLZI;
                VideoItemParams gv0 = z4.gv0();
                if (gv0 != null && (aweme = gv0.getAweme()) != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                if (TextUtils.equals(str2, str)) {
                    synchronized (z4) {
                        z4.pv0();
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
