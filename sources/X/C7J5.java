package X;

import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.7J5, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7J5 extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoDiggAssem, C43I<? extends C7J4>, C76800UCe> {
    public static final C7J5 LJLIL = new C7J5();

    public C7J5() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoDiggAssem videoDiggAssem, C43I<? extends C7J4> c43i) {
        String str;
        Aweme aweme;
        VideoDiggAssem selectSubscribe = videoDiggAssem;
        C43I<? extends C7J4> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        VideoDiggVM r4 = selectSubscribe.r4();
        r4.getClass();
        if (c43i2 != null) {
            C7J4 c7j4 = (C7J4) c43i2.LIZ;
            if (c7j4.LJLIL == EnumC183687Iu.UPVOTE_VIDEO_ASSEM) {
                String str2 = c7j4.LJLILLLLZI;
                VideoItemParams gv0 = r4.gv0();
                if (gv0 != null && (aweme = gv0.getAweme()) != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                if (o.LJ(str2, str)) {
                    r4.LJLLL = c7j4.LJLJI;
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
