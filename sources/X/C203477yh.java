package X;

import com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl;
import com.ss.android.ugc.aweme.favorites.service.IFavoriteService;
import com.ss.android.ugc.aweme.feed.favorite.VideoFavoriteAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.7yh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C203477yh extends AbstractC65781Prl implements InterfaceC88471Ynr<VideoFavoriteAssem, C43I<? extends C76800UCe>, C76800UCe> {
    public static final C203477yh LJLIL = new C203477yh();

    public C203477yh() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(VideoFavoriteAssem videoFavoriteAssem, C43I<? extends C76800UCe> c43i) {
        ActivityC45651qj LIZ;
        VideoFavoriteAssem selectSubscribe = videoFavoriteAssem;
        C43I<? extends C76800UCe> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i2 != null && c43i2.LIZ() != null && (LIZ = C212428Vi.LIZ(selectSubscribe)) != null) {
            IFavoriteService LJIJJLI = FavoriteServiceImpl.LJIJJLI();
            String aid = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme().getAid();
            String str = "";
            if (aid == null) {
                aid = "";
            }
            String str2 = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).mEventType;
            if (str2 != null) {
                str = str2;
            }
            LJIJJLI.LIZJ(LIZ, aid, str);
        }
        return C76800UCe.LIZ;
    }
}
