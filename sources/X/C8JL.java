package X;

import com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.PhotosensitiveVideoMaskAssem;
import com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.PhotosensitiveVideoMaskVM;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* renamed from: X.8JL, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8JL extends AbstractC65781Prl implements InterfaceC88471Ynr<PhotosensitiveVideoMaskAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C8JL LJLIL = new C8JL();

    public C8JL() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(PhotosensitiveVideoMaskAssem photosensitiveVideoMaskAssem, C43I<? extends Integer> c43i) {
        PhotosensitiveVideoMaskAssem selectSubscribeOnAsync = photosensitiveVideoMaskAssem;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        if (c43i != null) {
            if (C220858ld.LJIIJ(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribeOnAsync)).getAweme())) {
                selectSubscribeOnAsync.p4().kv0();
            } else {
                PhotosensitiveVideoMaskVM p4 = selectSubscribeOnAsync.p4();
                p4.getClass();
                p4.withState(new AqS169S0100000_3(p4, 915));
            }
        }
        return C76800UCe.LIZ;
    }
}
