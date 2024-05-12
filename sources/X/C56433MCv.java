package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.trending.ui.detailpage.BottomBarAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.MCv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56433MCv implements InterfaceC84870XSo {
    public final /* synthetic */ BottomBarAssem LIZ;
    public final /* synthetic */ MusicModel LIZIZ;

    @Override // X.InterfaceC84870XSo
    public final void onCancel() {
        ProgressDialogC43241Gy5 progressDialogC43241Gy5 = this.LIZ.LJLJJL;
        if (progressDialogC43241Gy5 != null) {
            V1B.LJLILLLLZI(progressDialogC43241Gy5);
        }
        this.LIZ.C3(null, null);
    }

    @Override // X.InterfaceC84870XSo
    public final void onStart() {
        ProgressDialogC43241Gy5 progressDialogC43241Gy5;
        BottomBarAssem bottomBarAssem = this.LIZ;
        bottomBarAssem.getClass();
        ActivityC45651qj LIZ = C212428Vi.LIZ(bottomBarAssem);
        if (LIZ != null) {
            progressDialogC43241Gy5 = ProgressDialogC43241Gy5.LIZIZ(LIZ, LIZ.getResources().getString(R.string.hvo));
        } else {
            progressDialogC43241Gy5 = null;
        }
        bottomBarAssem.LJLJJL = progressDialogC43241Gy5;
    }

    @Override // X.InterfaceC84870XSo
    public final void LIZ(XSX error) {
        o.LJIIIZ(error, "error");
        ActivityC45651qj LIZ = C212428Vi.LIZ(this.LIZ);
        if (LIZ != null) {
            C40328FsC.LIZLLL(LIZ, R.string.igp);
        }
        ProgressDialogC43241Gy5 progressDialogC43241Gy5 = this.LIZ.LJLJJL;
        if (progressDialogC43241Gy5 != null) {
            V1B.LJLILLLLZI(progressDialogC43241Gy5);
        }
        this.LIZ.C3(null, null);
    }

    @Override // X.InterfaceC84870XSo
    public final void onProgress(int i) {
        ProgressDialogC43241Gy5 progressDialogC43241Gy5 = this.LIZ.LJLJJL;
        if (progressDialogC43241Gy5 == null) {
            return;
        }
        progressDialogC43241Gy5.setProgress(i);
    }

    public C56433MCv(BottomBarAssem bottomBarAssem, MusicModel musicModel) {
        this.LIZ = bottomBarAssem;
        this.LIZIZ = musicModel;
    }

    @Override // X.InterfaceC84870XSo
    public final void LIZIZ(String musicFile, MusicWaveBean musicWaveBean, Boolean bool) {
        o.LJIIIZ(musicFile, "musicFile");
        ProgressDialogC43241Gy5 progressDialogC43241Gy5 = this.LIZ.LJLJJL;
        if (progressDialogC43241Gy5 != null) {
            V1B.LJLILLLLZI(progressDialogC43241Gy5);
        }
        this.LIZ.C3(this.LIZIZ, musicFile);
    }
}
