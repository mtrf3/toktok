package X;

import com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.PhotosensitiveVideoMaskAssem;
import com.ss.android.ugc.aweme.feed.assem.photosensitivevideomask.PhotosensitiveVideoMaskVM;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.8JG, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8JG extends AbstractC65781Prl implements InterfaceC88471Ynr<PhotosensitiveVideoMaskAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C8JG LJLIL = new C8JG();

    public C8JG() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(PhotosensitiveVideoMaskAssem photosensitiveVideoMaskAssem, C43I<? extends Boolean> c43i) {
        PhotosensitiveVideoMaskAssem selectSubscribeOnAsync = photosensitiveVideoMaskAssem;
        C43I<? extends Boolean> it = c43i;
        o.LJIIIZ(selectSubscribeOnAsync, "$this$selectSubscribeOnAsync");
        o.LJIIIZ(it, "it");
        if ((!C53324KwK.LIZ() || ((Boolean) it.LIZ).booleanValue()) && C220858ld.LJIIIIZZ(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribeOnAsync)).getAweme()) && selectSubscribeOnAsync.Y3().getVisibility() == 0) {
            PhotosensitiveVideoMaskVM p4 = selectSubscribeOnAsync.p4();
            Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribeOnAsync)).getAweme();
            o.LJIIIIZZ(aweme, "item.aweme");
            p4.getClass();
            if (C63081OpJ.LJLJI(aweme)) {
                NQH LIZ = C201697vp.LIZ();
                if (LIZ != null) {
                    LIZ.pausePlayer();
                }
            } else {
                IWF.LJJLIIIIJ().LJIILJJIL();
            }
            String aid = aweme.getAid();
            o.LJIIIIZZ(aid, "aweme.aid");
            C2U8.LIZ(new C8JF(true, aid, false));
        }
        return C76800UCe.LIZ;
    }
}
