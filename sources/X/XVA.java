package X;

import com.ss.android.ugc.aweme.choosemusic.view.ChooseMusicSelectView;
import com.ss.android.ugc.aweme.choosemusic.viewmodel.SelectedMusicViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XVA implements InterfaceC47330Ihq {
    public final /* synthetic */ ChooseMusicSelectView LIZ;

    public XVA(ChooseMusicSelectView chooseMusicSelectView) {
        this.LIZ = chooseMusicSelectView;
    }

    @Override // X.InterfaceC47330Ihq
    public final void LIZ(int i, int i2) {
        SelectedMusicViewModel selectedMusicViewModel = this.LIZ.LJLLLL;
        if (selectedMusicViewModel != null) {
            selectedMusicViewModel.iv0().postValue(2);
        } else {
            o.LJIJI("mSelectedMusicViewModel");
            throw null;
        }
    }
}
