package X;

import com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoRelationAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.86B, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C86B extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoAuthorInfoRelationAssem, C43I<? extends Aweme>, C76800UCe> {
    public static final C86B LJLIL = new C86B();

    public C86B() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoAuthorInfoRelationAssem videoAuthorInfoRelationAssem, C43I<? extends Aweme> c43i) {
        Aweme aweme;
        Aweme aweme2;
        VideoAuthorInfoRelationAssem selectSubscribeOnAsync = videoAuthorInfoRelationAssem;
        C43I<? extends Aweme> c43i2 = c43i;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        if (c43i2 != null && (aweme = (Aweme) c43i2.LIZ) != null) {
            String aid = aweme.getAid();
            Aweme aweme3 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribeOnAsync)).getAweme();
            String str = null;
            if (aweme3 != null) {
                str = aweme3.getAid();
            }
            if (o.LJ(aid, str) && (aweme2 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribeOnAsync)).getAweme()) != null) {
                aweme2.setInteractionTagInfo(aweme.getInteractionTagInfo());
                selectSubscribeOnAsync.z4(aweme2);
            }
        }
        return C76800UCe.LIZ;
    }
}
