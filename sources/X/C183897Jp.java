package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS28S0100100_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7Jp, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C183897Jp extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoDiggAssem, C183887Jo, C76800UCe> {
    public static final C183897Jp LJLIL = new C183897Jp();

    public C183897Jp() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoDiggAssem videoDiggAssem, C183887Jo c183887Jo) {
        Aweme aweme;
        VideoDiggAssem selectSubscribeOnAsync = videoDiggAssem;
        C183887Jo c183887Jo2 = c183887Jo;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        VideoDiggVM r4 = selectSubscribeOnAsync.r4();
        r4.getClass();
        if (c183887Jo2 != null) {
            String str = c183887Jo2.LJLIL;
            VideoItemParams gv0 = r4.gv0();
            if (gv0 != null) {
                aweme = gv0.getAweme();
            } else {
                aweme = null;
            }
            if (TextUtils.equals(str, C227768wm.LIZIZ(aweme))) {
                if (c183887Jo2.LJLJI) {
                    r4.setState(new AqS169S0100000_3(r4, 46));
                } else {
                    r4.setState(new AqS28S0100100_3(r4, r4.LJLJLLL, 0));
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
