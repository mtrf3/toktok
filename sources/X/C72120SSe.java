package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.profile.aigc.ProfileAigcAvatarViewModel;
import com.ss.android.ugc.aweme.profile.presenter.AvatarPresenter;
import kotlin.jvm.internal.o;

/* renamed from: X.SSe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72120SSe implements InterfaceC78252UnQ {
    public final /* synthetic */ ProfileAigcAvatarViewModel LIZ;
    public final /* synthetic */ AvatarPresenter LIZIZ;

    @Override // X.InterfaceC78252UnQ
    public final void LIZ(String imageUrl) {
        o.LJIIIZ(imageUrl, "imageUrl");
        this.LIZ.setState(C72124SSi.LJLIL);
    }

    @Override // X.InterfaceC78252UnQ
    public final void LIZJ(String imageUrl) {
        o.LJIIIZ(imageUrl, "imageUrl");
        this.LIZ.setState(C72123SSh.LJLIL);
    }

    public C72120SSe(ProfileAigcAvatarViewModel profileAigcAvatarViewModel, AvatarPresenter avatarPresenter) {
        this.LIZ = profileAigcAvatarViewModel;
        this.LIZIZ = avatarPresenter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC78252UnQ
    public final void LIZIZ(android.net.Uri uri, String imageUrl) {
        o.LJIIIZ(imageUrl, "imageUrl");
        this.LIZ.setState(C72129SSn.LJLIL);
        if (uri != null) {
            AvatarPresenter avatarPresenter = this.LIZIZ;
            ProfileAigcAvatarViewModel profileAigcAvatarViewModel = this.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("file uri: ");
            LIZ.append(uri);
            C221018lt.LIZ("ProfileAigcAvatarViewModel", X1D.LIZIZ(LIZ));
            Intent intent = new Intent();
            intent.setData(uri);
            intent.putExtra("path_mode", ((SIN) profileAigcAvatarViewModel.getState()).LJLJJL.LIZ.toString());
            avatarPresenter.onActivityResult(10015, -1, intent);
        }
    }
}
