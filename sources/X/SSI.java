package X;

import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcAvatarViewModel;
import java.util.List;
import kotlin.jvm.internal.AqS16S0500000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SSI implements InterfaceC72138SSw {
    public final /* synthetic */ ProfileAigcAvatarViewModel LIZ;
    public final /* synthetic */ String LIZIZ;
    public final /* synthetic */ ActivityC45651qj LIZJ;
    public final /* synthetic */ C76732zl LIZLLL;
    public final /* synthetic */ C76732zl LJ;
    public final /* synthetic */ List<String> LJFF;
    public final /* synthetic */ InterfaceC88472Yns<String, C76800UCe> LJI;

    @Override // X.InterfaceC72138SSw
    public final void LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("failed to find image file with url: ");
        LIZ.append(this.LIZIZ);
        C221018lt.LIZ("ProfileAigcAvatarViewModel", X1D.LIZIZ(LIZ));
        this.LJI.invoke(this.LIZIZ);
    }

    @Override // X.InterfaceC72138SSw
    public final void LIZIZ(android.net.Uri uri) {
        String path = uri.getPath();
        if (path != null) {
            ProfileAigcAvatarViewModel profileAigcAvatarViewModel = this.LIZ;
            String url = this.LIZIZ;
            ActivityC45651qj activityC45651qj = this.LIZJ;
            C76732zl c76732zl = this.LIZLLL;
            C76732zl c76732zl2 = this.LJ;
            List<String> list = this.LJFF;
            EOY eoy = profileAigcAvatarViewModel.LJLL;
            eoy.getClass();
            o.LJIIIZ(url, "url");
            eoy.LIZJ.add(url);
            C78565UsT.LJJIJIIJI(profileAigcAvatarViewModel, C78613UtF.LIZJ, new SSH(profileAigcAvatarViewModel, activityC45651qj, path, url, c76732zl, c76732zl2, list, null));
            return;
        }
        InterfaceC88472Yns<String, C76800UCe> interfaceC88472Yns = this.LJI;
        String str = this.LIZIZ;
        C221018lt.LIZ("ProfileAigcAvatarViewModel", "file path is empty");
        interfaceC88472Yns.invoke(str);
    }

    public SSI(ProfileAigcAvatarViewModel profileAigcAvatarViewModel, String str, ActivityC45651qj activityC45651qj, C76732zl c76732zl, C76732zl c76732zl2, List list, AqS16S0500000_12 aqS16S0500000_12) {
        this.LIZ = profileAigcAvatarViewModel;
        this.LIZIZ = str;
        this.LIZJ = activityC45651qj;
        this.LIZLLL = c76732zl;
        this.LJ = c76732zl2;
        this.LJFF = list;
        this.LJI = aqS16S0500000_12;
    }
}
