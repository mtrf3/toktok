package X;

import com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.PhotosensitiveVideoMaskAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;
import yq4.a;

/* renamed from: X.8JJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8JJ extends AbstractC65781Prl implements InterfaceC88471Ynr<PhotosensitiveVideoMaskAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final C8JJ LJLIL = new C8JJ();

    public C8JJ() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(PhotosensitiveVideoMaskAssem photosensitiveVideoMaskAssem, C43I<? extends C195357lb> c43i) {
        Integer valueOf;
        PhotosensitiveVideoMaskAssem selectSubscribeOnAsync = photosensitiveVideoMaskAssem;
        C43I<? extends C195357lb> c43i2 = c43i;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        if (c43i2 != null && ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribeOnAsync)).getAweme() != null) {
            if (C06460Ne.LJ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribeOnAsync), ((C195357lb) c43i2.LIZ).LIZ) && C220858ld.LJIIJ(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribeOnAsync)).getAweme()) && a.LJFF().LJJIJIIJI() == 0 && (valueOf = Integer.valueOf(a.LJFF().LJJIIJZLJL())) != null && valueOf.intValue() == 2) {
                a.LJFF().LJJIJ(valueOf.intValue(), null);
            }
        }
        return C76800UCe.LIZ;
    }
}
