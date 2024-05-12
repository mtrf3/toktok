package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.profile.model.AvatarUri;
import kotlin.jvm.internal.o;

/* renamed from: X.SfK, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72654SfK extends AbstractC65781Prl implements InterfaceC88472Yns<AvatarUri, C76800UCe> {
    public static final C72654SfK LJLIL = new C72654SfK();

    public C72654SfK() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AvatarUri avatarUri) {
        AvatarUri avatarUrl = avatarUri;
        o.LJIIIZ(avatarUrl, "avatarUrl");
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(avatarUrl.urlList);
        urlModel.setUri(avatarUrl.uri);
        C72653SfJ c72653SfJ = C72593SeL.LIZLLL;
        if (c72653SfJ != null) {
            c72653SfJ.LIZIZ = urlModel;
        }
        C72650SfG.LIZ();
        return C76800UCe.LIZ;
    }
}
