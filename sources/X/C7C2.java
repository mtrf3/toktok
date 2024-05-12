package X;

import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggAssem;
import com.ss.android.ugc.aweme.feed.assem.digg.VideoDiggVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.AqS12S0200100_3;
import kotlin.jvm.internal.o;

/* renamed from: X.7C2, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7C2 extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoDiggAssem, C43I<? extends Aweme>, C76800UCe> {
    public static final C7C2 LJLIL = new C7C2();

    public C7C2() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoDiggAssem videoDiggAssem, C43I<? extends Aweme> c43i) {
        long diggCount;
        VideoDiggAssem selectSubscribeOnAsync = videoDiggAssem;
        C43I<? extends Aweme> c43i2 = c43i;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        if (c43i2 != null) {
            VideoDiggVM r4 = selectSubscribeOnAsync.r4();
            Aweme aweme = (Aweme) c43i2.LIZ;
            r4.getClass();
            if (aweme != null && aweme.isAd()) {
                boolean z = true;
                if (aweme.getUserDigg() != 1) {
                    z = false;
                }
                r4.LJLL = z;
                if (aweme.getStatistics() == null) {
                    diggCount = 0;
                } else {
                    diggCount = aweme.getStatistics().getDiggCount();
                }
                r4.LJLJLLL = diggCount;
                if (diggCount < 0) {
                    r4.LJLJLLL = 0L;
                }
                r4.setState(new AqS12S0200100_3(r4, r4.LJLJLLL, aweme, 0));
            }
        }
        return C76800UCe.LIZ;
    }
}
