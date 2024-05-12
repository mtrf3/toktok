package X;

import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcAvatarViewModel;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SSZ implements InterfaceC78252UnQ {
    public final /* synthetic */ ProfileAigcAvatarViewModel LIZ;
    public final /* synthetic */ ActivityC45651qj LIZIZ;
    public final /* synthetic */ C76732zl LIZJ;
    public final /* synthetic */ C76732zl LIZLLL;
    public final /* synthetic */ List<String> LJ;

    @Override // X.InterfaceC78252UnQ
    public final void LIZ(String imageUrl) {
        o.LJIIIZ(imageUrl, "imageUrl");
    }

    @Override // X.InterfaceC78252UnQ
    public final void LIZJ(String imageUrl) {
        o.LJIIIZ(imageUrl, "imageUrl");
        this.LIZ.LJLL.LIZIZ(imageUrl, EnumC35502DwY.FILE_DOWNLOAD);
        this.LIZ.LJLLI.LIZ();
    }

    @Override // X.InterfaceC78252UnQ
    public final void LIZIZ(android.net.Uri uri, String imageUrl) {
        String path;
        o.LJIIIZ(imageUrl, "imageUrl");
        if (uri != null && (path = uri.getPath()) != null) {
            ProfileAigcAvatarViewModel profileAigcAvatarViewModel = this.LIZ;
            C78565UsT.LJJIJIIJI(profileAigcAvatarViewModel, C78613UtF.LIZJ, new SSG(profileAigcAvatarViewModel, this.LIZIZ, path, imageUrl, this.LIZJ, this.LIZLLL, this.LJ, null));
        } else {
            ProfileAigcAvatarViewModel profileAigcAvatarViewModel2 = this.LIZ;
            profileAigcAvatarViewModel2.LJLL.LIZIZ(imageUrl, EnumC35502DwY.FILE_DOWNLOAD);
            profileAigcAvatarViewModel2.LJLLI.LIZ();
        }
    }

    public SSZ(ActivityC45651qj activityC45651qj, ProfileAigcAvatarViewModel profileAigcAvatarViewModel, List list, C76732zl c76732zl, C76732zl c76732zl2) {
        this.LIZ = profileAigcAvatarViewModel;
        this.LIZIZ = activityC45651qj;
        this.LIZJ = c76732zl;
        this.LIZLLL = c76732zl2;
        this.LJ = list;
    }
}
