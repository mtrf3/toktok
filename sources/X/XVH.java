package X;

import com.ss.android.ugc.aweme.choosemusic.fragment.BaseChooseMusicFragment;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import defpackage.b1;

/* loaded from: classes16.dex */
public final class XVH {
    public final /* synthetic */ BaseChooseMusicFragment LIZ;

    public XVH(BaseChooseMusicFragment baseChooseMusicFragment) {
        this.LIZ = baseChooseMusicFragment;
    }

    public final void LIZ(MusicModel musicModel) {
        BaseChooseMusicFragment baseChooseMusicFragment = this.LIZ;
        baseChooseMusicFragment.LLIIIILZ.LJLILLLLZI = true;
        StringBuilder LIZJ = b1.LIZJ("change_music_page", "_");
        LIZJ.append(XVF.LIZ.split("_")[1]);
        String LIZIZ = X1D.LIZIZ(LIZJ);
        C188727au c188727au = new C188727au();
        c188727au.LJIIIZ("creation_id", baseChooseMusicFragment.LLF);
        c188727au.LJIIIZ("enter_from", LIZIZ);
        c188727au.LJIIIZ("enter_method", "change_music_bar");
        c188727au.LJIIIZ("shoot_way", baseChooseMusicFragment.LLFF);
        c188727au.LJIIIZ("music_id", musicModel.getMusicId());
        if (XVF.LIZLLL().booleanValue()) {
            c188727au.LJIIIZ("from_location", XVF.LJII);
            c188727au.LJIIIZ("type", XVF.LJIIIIZZ);
            c188727au.LIZLLL(1, "is_editor_pro");
        } else {
            c188727au.LIZLLL(0, "is_editor_pro");
        }
        c188727au.LJI("music_selected_method", baseChooseMusicFragment.LJZ);
        FMX.LJIIL("unselect_music", c188727au.LIZ);
    }
}
