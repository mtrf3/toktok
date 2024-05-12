package X;

import com.ss.android.ugc.aweme.feed.assem.FeedVideoAssem;
import com.ss.android.ugc.aweme.feed.assem.caution.VideoTopCautionAssem;
import com.ss.android.ugc.aweme.feed.assem.contentclassificationmask.ContentClassificationMaskAssem;
import com.ss.android.ugc.aweme.feed.assem.generalmask.GeneralVideoMaskAssem;
import com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.PhotosensitiveVideoMaskAssem;
import com.ss.android.ugc.aweme.feed.assem.report.ReportVideoMaskAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.8JI, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8JI extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedVideoAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C8JI LJLIL = new C8JI();

    public C8JI() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedVideoAssem feedVideoAssem, C43I<? extends Integer> c43i) {
        FeedVideoAssem selectSubscribe = feedVideoAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            if (selectSubscribe.LLFII.LIZJ(23) && o.LJ(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getContentClassificationMaskInfo().getShowMask(), Boolean.TRUE)) {
                C8VR.LIZJ(selectSubscribe, C65352Pkq.LIZ(ContentClassificationMaskAssem.class));
            }
            if (selectSubscribe.LLFII.LIZJ(7) && C220858ld.LJIIIZ(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme())) {
                C8VR.LIZJ(selectSubscribe, C65352Pkq.LIZ(GeneralVideoMaskAssem.class));
            }
            if (selectSubscribe.LLFII.LIZJ(8) && C220858ld.LJIIJJI(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme())) {
                C8VR.LIZJ(selectSubscribe, C65352Pkq.LIZ(ReportVideoMaskAssem.class));
            }
            if (selectSubscribe.LLFII.LIZJ(9) && C220858ld.LJIIJ(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme())) {
                C8VR.LIZJ(selectSubscribe, C65352Pkq.LIZ(PhotosensitiveVideoMaskAssem.class));
            }
            if (selectSubscribe.LLFII.LIZJ(10) && C72083SQt.LJLIIL(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme())) {
                C8VR.LIZJ(selectSubscribe, C65352Pkq.LIZ(VideoTopCautionAssem.class));
            }
            selectSubscribe.g4();
        }
        return C76800UCe.LIZ;
    }
}
