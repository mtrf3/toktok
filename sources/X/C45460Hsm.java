package X;

import android.content.Intent;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.port.in.IAnotherMusicService;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaState;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import kotlin.jvm.internal.AqS12S0010000_7;

/* renamed from: X.Hsm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45460Hsm implements InterfaceC144185lG {
    public final /* synthetic */ MvChoosePhotoScene LJLIL;

    public C45460Hsm(MvChoosePhotoScene mvChoosePhotoScene) {
        this.LJLIL = mvChoosePhotoScene;
    }

    @Override // X.InterfaceC144185lG
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        String str;
        Boolean bool;
        InterfaceC44718Hgo interfaceC44718Hgo;
        CreativeModel creativeModel;
        int i3;
        ChooseMediaState Hv0;
        if (this.LJLIL.LLLLLLL()) {
            if (intent != null && !intent.hasExtra("key_short_video_context")) {
                intent.putExtra("key_short_video_context", this.LJLIL.LLJLLIL);
            }
            MvChoosePhotoScene mvChoosePhotoScene = this.LJLIL;
            InterfaceC45496HtM interfaceC45496HtM = mvChoosePhotoScene.LLLLLILLIL;
            if (interfaceC45496HtM != null) {
                interfaceC45496HtM.LIZ(mvChoosePhotoScene.requireActivity(), i, i2, intent);
            }
            return true;
        }
        MvChoosePhotoScene mvChoosePhotoScene2 = this.LJLIL;
        if (i == mvChoosePhotoScene2.LLJJIJIIJIL) {
            int i4 = mvChoosePhotoScene2.LJLLJ;
            if ((i4 == 4 || i4 == 10 || i4 == 37) && i2 != -1) {
                return true;
            }
            if (!mvChoosePhotoScene2.LLLZIIL) {
                mvChoosePhotoScene2.requireActivity().setResult(i2, intent);
            }
            this.LJLIL.LLLIILIL();
        }
        MvChoosePhotoScene mvChoosePhotoScene3 = this.LJLIL;
        int LLLZ = mvChoosePhotoScene3.LLLZ(mvChoosePhotoScene3.LLJILJIL.size());
        ShortVideoContext shortVideoContext = this.LJLIL.LLJLLIL;
        if (shortVideoContext != null) {
            str = shortVideoContext.getMusicPath();
        } else {
            str = null;
        }
        ShortVideoContext shortVideoContext2 = this.LJLIL.LLJLLIL;
        if (shortVideoContext2 != null) {
            bool = Boolean.valueOf(shortVideoContext2.mIsPhotoMvModeMusic);
        } else {
            bool = null;
        }
        if (i == 12346) {
            if (C00F.LIZ(31744, 0, "studio_photo_ai_music_optimization", true) == 2 && ((LLLZ == 3 || LLLZ == 11) && (i3 = this.LJLIL.LJLLJ) != 9 && i3 != 31 && (str == null || str.length() <= 0 || bool == null || bool.booleanValue()))) {
                MvChoosePhotoScene mvChoosePhotoScene4 = this.LJLIL;
                ChooseMediaViewModel chooseMediaViewModel = mvChoosePhotoScene4.LLLLLIL;
                if (chooseMediaViewModel != null && (Hv0 = chooseMediaViewModel.Hv0(mvChoosePhotoScene4)) != null && Hv0.isChangeMusicDownloadSuccess()) {
                    IAnotherMusicService iAnotherMusicService = this.LJLIL.LLLLZ;
                    if (iAnotherMusicService != null) {
                        iAnotherMusicService.LJIL();
                        C43014GuQ.LJFF();
                    }
                    ChooseMediaViewModel chooseMediaViewModel2 = this.LJLIL.LLLLLIL;
                    if (chooseMediaViewModel2 != null) {
                        chooseMediaViewModel2.setState(new AqS12S0010000_7(false, 15));
                    }
                }
                this.LJLIL.LLLZLL(true);
            }
            return false;
        }
        if (i == 12347) {
            ShortVideoContext shortVideoContext3 = this.LJLIL.LLJLLIL;
            if (shortVideoContext3 != null && (creativeModel = shortVideoContext3.creativeModel) != null) {
                creativeModel.autoCutModel = new AutoCutModel(null, null, null, 0, 0, null, null, 0, false, null, null, null, null, null, null, null, null, 131071, null);
            }
            C82622Wbi LJJLIIIJJI = C44384HbQ.LJJLIIIJJI(this.LJLIL);
            if (LJJLIIIJJI != null && (interfaceC44718Hgo = (InterfaceC44718Hgo) LJJLIIIJJI.LJIIIIZZ(null, InterfaceC44718Hgo.class)) != null) {
                interfaceC44718Hgo.LJJJLL();
            }
            MvChoosePhotoScene mvChoosePhotoScene5 = this.LJLIL;
            ShortVideoContext shortVideoContext4 = mvChoosePhotoScene5.LLJLLIL;
            if (shortVideoContext4 != null) {
                C44703HgZ.LIZ(shortVideoContext4, mvChoosePhotoScene5.LLZZZZ, mvChoosePhotoScene5.a, mvChoosePhotoScene5.c, Integer.valueOf(mvChoosePhotoScene5.b));
            }
        }
        return false;
    }
}
