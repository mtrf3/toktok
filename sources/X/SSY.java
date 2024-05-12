package X;

import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcAvatarViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS178S0100000_12;

/* loaded from: classes13.dex */
public final class SSY {
    public final /* synthetic */ ProfileAigcAvatarViewModel LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ() {
        String str;
        C221018lt.LIZ("ProfileAigcAvatarViewModel", "on save failed");
        ProfileAigcAvatarViewModel profileAigcAvatarViewModel = this.LIZ;
        EOY eoy = profileAigcAvatarViewModel.LJLL;
        String str2 = ((SIN) profileAigcAvatarViewModel.getState()).LJLJJL.LIZ.toString();
        ProfileAigcAvatarViewModel profileAigcAvatarViewModel2 = this.LIZ;
        SRW srw = profileAigcAvatarViewModel2.LJLIL;
        String str3 = null;
        if (srw != null) {
            str3 = srw.LJLILLLLZI;
            str = srw.LJLJI;
        } else {
            str = null;
        }
        eoy.LIZ(((SIN) profileAigcAvatarViewModel2.getState()).LJLILLLLZI.LIZ.size(), str2, "download_fail", str3, str);
        this.LIZ.mv0(SR2.AVATAR_CHANGE);
        this.LIZ.nv0(R.string.c0);
        ProfileAigcAvatarViewModel profileAigcAvatarViewModel3 = this.LIZ;
        profileAigcAvatarViewModel3.setState(new AqS178S0100000_12(profileAigcAvatarViewModel3, 245));
    }

    public SSY(ProfileAigcAvatarViewModel profileAigcAvatarViewModel) {
        this.LIZ = profileAigcAvatarViewModel;
    }
}
