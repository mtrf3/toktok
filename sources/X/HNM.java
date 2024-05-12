package X;

import com.bytedance.bpea.basics.Cert;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HNM {
    public final C82622Wbi LIZ;
    public final ActivityC45651qj LIZIZ;
    public final InterfaceC82086WJm LIZJ;
    public final I0N LIZLLL;
    public final I27 LJ;
    public final InterfaceC45979I2t LJFF;
    public final ShortVideoContext LJI;
    public final NavigationScene LJII;
    public final C62822Ol8 LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public final C62822Ol8 LJIIJ;
    public final C62822Ol8 LJIIJJI;

    public final void LIZJ() {
        Effect effect;
        TEZ LLLLL;
        I0N i0n = this.LIZLLL;
        if (i0n != null && (LLLLL = i0n.LLLLL()) != null) {
            effect = LLLLL.LLJJIJIIJIL();
        } else {
            effect = null;
        }
        if (V3N.LJJI(effect)) {
            this.LJ.startPreviewMusic(true);
        }
    }

    public final void LIZ(boolean z) {
        I0N i0n = this.LIZLLL;
        if (i0n != null && C82398WVm.LIZJ(i0n) != null) {
            this.LJ.setStickerMusicCancelState(new OSZ<>(C82398WVm.LIZJ(this.LIZLLL), Boolean.valueOf(z)));
        }
    }

    public final void LIZIZ(Cert cert) {
        I0N i0n;
        InterfaceC46236ICq Sc0;
        this.LIZJ.Nw();
        if (this.LJI.cameraComponentModel.curBackgroundVideo != null && (i0n = this.LIZLLL) != null && (Sc0 = i0n.Sc0()) != null) {
            Sc0.LIZIZ();
        }
        C60903NvH.LJIIJJI().LJIILIIL().updateCurrentScene("music_panel_show", false);
        this.LIZJ.jL().LIZIZ(I0E.CHOOSE_MUSIC_SCENE, cert);
    }

    public HNM(C82622Wbi diContainer, ActivityC45651qj activity, InterfaceC82086WJm cameraApi, I0N i0n, I27 chooseMusicApi, InterfaceC45979I2t bottomTabApiComponent, ShortVideoContext shortVideoContext, NavigationScene navigationScene) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(activity, "activity");
        o.LJIIIZ(cameraApi, "cameraApi");
        o.LJIIIZ(chooseMusicApi, "chooseMusicApi");
        o.LJIIIZ(bottomTabApiComponent, "bottomTabApiComponent");
        o.LJIIIZ(shortVideoContext, "shortVideoContext");
        this.LIZ = diContainer;
        this.LIZIZ = activity;
        this.LIZJ = cameraApi;
        this.LIZLLL = i0n;
        this.LJ = chooseMusicApi;
        this.LJFF = bottomTabApiComponent;
        this.LJI = shortVideoContext;
        this.LJII = navigationScene;
        this.LJIIIIZZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 365));
        this.LJIIIZ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 363));
        this.LJIIJ = C221108m2.LIZIZ(new AqS157S0100000_7(this, 364));
        this.LJIIJJI = C221108m2.LIZIZ(new AqS157S0100000_7(this, 362));
    }
}
