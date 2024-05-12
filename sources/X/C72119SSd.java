package X;

import android.app.Activity;
import android.content.Intent;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcAvatarViewModel;
import com.ss.android.ugc.aweme.profile.presenter.AvatarPresenter;

/* renamed from: X.SSd, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72119SSd implements InterfaceC72138SSw {
    public final /* synthetic */ AvatarPresenter LIZ;
    public final /* synthetic */ ProfileAigcAvatarViewModel LIZIZ;
    public final /* synthetic */ String LIZJ;
    public final /* synthetic */ Activity LIZLLL;
    public final /* synthetic */ C72120SSe LJ;

    @Override // X.InterfaceC72138SSw
    public final void LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("failed to find the url from cache: ");
        LIZ.append(this.LIZJ);
        C221018lt.LIZ("ProfileAigcAvatarViewModel", X1D.LIZIZ(LIZ));
        C78999UzT.LJFF(C73542Ste.LJI(AbstractC73547Stj.LJI(new CallableC72122SSg(this.LIZJ, this.LIZLLL, this.LJ)).LJIILIIL(T16.LIZ()), C72131SSp.LJLIL, C73542Ste.LIZJ), this.LIZIZ.LJLILLLLZI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC72138SSw
    public final void LIZIZ(android.net.Uri uri) {
        AvatarPresenter avatarPresenter = this.LIZ;
        Intent intent = new Intent();
        ProfileAigcAvatarViewModel profileAigcAvatarViewModel = this.LIZIZ;
        intent.setData(uri);
        intent.putExtra("path_mode", ((SIN) profileAigcAvatarViewModel.getState()).LJLJJL.LIZ.toString());
        avatarPresenter.onActivityResult(10015, -1, intent);
    }

    public C72119SSd(AvatarPresenter avatarPresenter, ProfileAigcAvatarViewModel profileAigcAvatarViewModel, String str, ActivityC45651qj activityC45651qj, C72120SSe c72120SSe) {
        this.LIZ = avatarPresenter;
        this.LIZIZ = profileAigcAvatarViewModel;
        this.LIZJ = str;
        this.LIZLLL = activityC45651qj;
        this.LJ = c72120SSe;
    }
}
