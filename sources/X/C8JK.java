package X;

import com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.PhotosensitiveVideoMaskAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.8JK, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8JK extends AbstractC65781Prl implements InterfaceC88471Ynr<PhotosensitiveVideoMaskAssem, Integer, C76800UCe> {
    public static final C8JK LJLIL = new C8JK();

    public C8JK() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(PhotosensitiveVideoMaskAssem photosensitiveVideoMaskAssem, Integer num) {
        Aweme aweme;
        Aweme aweme2;
        PhotosensitiveVideoMaskAssem selectSubscribe = photosensitiveVideoMaskAssem;
        int intValue = num.intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        selectSubscribe.Y3().setVisibility(intValue);
        if (intValue == 0) {
            boolean z = true;
            if (a.LJFF().LJJIJIIJI() != 1) {
                z = false;
            }
            String str = null;
            if (z) {
                C188727au c188727au = new C188727au();
                VideoItemParams videoItemParams = (VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe);
                if (videoItemParams != null && (aweme2 = videoItemParams.getAweme()) != null) {
                    str = aweme2.getAid();
                }
                c188727au.LJIIIZ("group_id", str);
                FMX.LJIIL("tns_show_photosensitive_removed", c188727au.LIZ);
            } else {
                C188727au c188727au2 = new C188727au();
                c188727au2.LJIIIZ("scenario", "photosensitive");
                VideoItemParams videoItemParams2 = (VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe);
                if (videoItemParams2 != null && (aweme = videoItemParams2.getAweme()) != null) {
                    str = aweme.getAid();
                }
                c188727au2.LJIIIZ("group_id", str);
                FMX.LJIIL("tns_show_mask_layer", c188727au2.LIZ);
            }
        }
        return C76800UCe.LIZ;
    }
}
