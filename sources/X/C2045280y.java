package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.ui.feed.FeedPhotoSlideAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.80y, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2045280y extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedPhotoSlideAssem, Boolean, C76800UCe> {
    public static final C2045280y LJLIL = new C2045280y();

    public C2045280y() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedPhotoSlideAssem feedPhotoSlideAssem, Boolean bool) {
        FeedPhotoSlideAssem selectSubscribe = feedPhotoSlideAssem;
        boolean booleanValue = bool.booleanValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (!C1DJ.LJJ(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme())) {
            if (booleanValue) {
                C82A c82a = selectSubscribe.LLIL;
                if (c82a != null) {
                    C1DH.LJIIIZ(c82a, 150L, 2);
                }
            } else {
                C82A c82a2 = selectSubscribe.LLIL;
                if (c82a2 != null) {
                    C1DH.LJIIJ(c82a2);
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
