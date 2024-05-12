package X;

import com.ss.android.ugc.aweme.feed.assem.share.VideoShareAssem;
import com.ss.android.ugc.aweme.feed.assem.share.VideoShareViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.7zg, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C204087zg extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoShareAssem, C43I<? extends Aweme>, C76800UCe> {
    public static final C204087zg LJLIL = new C204087zg();

    public C204087zg() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoShareAssem videoShareAssem, C43I<? extends Aweme> c43i) {
        Aweme aweme;
        String str;
        VideoShareAssem selectSubscribeOnAsync = videoShareAssem;
        C43I<? extends Aweme> c43i2 = c43i;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        if (c43i2 != null) {
            VideoShareViewModel z4 = selectSubscribeOnAsync.z4();
            Aweme aweme2 = (Aweme) c43i2.LIZ;
            VideoItemParams gv0 = z4.gv0();
            if (gv0 != null && (aweme = gv0.getAweme()) != null) {
                if (aweme2 != null) {
                    str = aweme2.getAid();
                } else {
                    str = null;
                }
                if (o.LJ(str, aweme.getAid())) {
                    synchronized (aweme) {
                        if (C80X.LIZLLL(aweme2) && C80X.LJIIIIZZ(aweme2, aweme.getAid(), z4.LJLLILLLL)) {
                            AnonymousClass804.LIZ = "like";
                            z4.yv0();
                        }
                    }
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
