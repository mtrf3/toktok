package X;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.choosemusic.cutpanel.CutMusicPanel;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.music.service.IMusicService;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.CameraComponentModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS173S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.WLr, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82143WLr extends WM7 implements InterfaceC82146WLu {
    public final InterfaceC88472Yns<Integer, C76800UCe> LJLIL;
    public ShortVideoContext LJLILLLLZI;
    public InterfaceC82187WNj LJLJI;
    public int LJLJJI;
    public RepeatMusicPlayer LJLJJL;
    public String LJLJJLL = "";
    public int LJLJL;
    public int LJLJLJ;

    @Override // X.WM7
    public final void onDestroyView() {
        super.onDestroyView();
        InterfaceC82187WNj interfaceC82187WNj = this.LJLJI;
        if (interfaceC82187WNj != null) {
            interfaceC82187WNj.onDestroy();
        } else {
            o.LJIJI("cutMusicPanel");
            throw null;
        }
    }

    @Override // X.WM7
    public final void onStart() {
        super.onStart();
        LLJILJIL(this.LJLJL, this.LJLJLJ);
    }

    @Override // X.WM7
    public final void onStop() {
        super.onStop();
        RepeatMusicPlayer repeatMusicPlayer = this.LJLJJL;
        if (repeatMusicPlayer != null) {
            repeatMusicPlayer.LIZIZ();
        }
        this.LJLJJL = null;
    }

    public C82143WLr(AqS173S0100000_7 aqS173S0100000_7) {
        this.LJLIL = aqS173S0100000_7;
    }

    @Override // X.WM7
    public final void onActivityCreated(Bundle bundle) {
        int i;
        super.onActivityCreated(bundle);
        ShortVideoContext shortVideoContext = ((ShortVideoContextViewModel) C165706es.LJIIIIZZ(this, null, null, 6).get(ShortVideoContextViewModel.class)).LJLIL;
        o.LJIIIIZZ(shortVideoContext, "of(this)\n            .ge…s.java).shortVideoContext");
        this.LJLILLLLZI = shortVideoContext;
        CameraComponentModel cameraComponentModel = shortVideoContext.cameraComponentModel;
        if (cameraComponentModel.curBackgroundVideo != null) {
            i = (int) C60903NvH.LJIIJJI().LJJIII().getMaxDurationResolver().getMaxShootingDuration();
            ShortVideoContext shortVideoContext2 = this.LJLILLLLZI;
            if (shortVideoContext2 != null) {
                if (!shortVideoContext2.cameraComponentModel.mCurrentDurationMode) {
                    i = 15000;
                }
            } else {
                o.LJIJI("shortVideoContext");
                throw null;
            }
        } else {
            i = (int) cameraComponentModel.mMaxDuration;
        }
        ShortVideoContext shortVideoContext3 = this.LJLILLLLZI;
        if (shortVideoContext3 != null) {
            AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext3.creativeModel.musicBuzModel);
            if (extractAVMusic != null && extractAVMusic.getShootDuration() > 0) {
                i = Math.min(i, extractAVMusic.getShootDuration());
            }
            this.LJLJLJ = i;
            ShortVideoContext shortVideoContext4 = this.LJLILLLLZI;
            if (shortVideoContext4 != null) {
                CameraComponentModel cameraComponentModel2 = shortVideoContext4.cameraComponentModel;
                int i2 = cameraComponentModel2.mMusicStart;
                this.LJLJL = i2;
                String str = cameraComponentModel2.mMusicPath;
                if (str == null) {
                    this.LJLIL.invoke(Integer.valueOf(i2));
                    return;
                }
                this.LJLJJLL = str;
                this.LJLJJI = C78934UyQ.LJLIL.getMusicService().getMusicDuration(this.LJLJJLL);
                LLJILJIL(this.LJLJL, this.LJLJLJ);
                IMusicService LJJLIIIJJI = MusicService.LJJLIIIJJI();
                String str2 = this.LJLJJLL;
                InterfaceC82187WNj interfaceC82187WNj = this.LJLJI;
                if (interfaceC82187WNj != null) {
                    LJJLIIIJJI.LJJIJL(str2, (interfaceC82187WNj.W1() * this.LJLJJI) / this.LJLJLJ, new C82145WLt(this));
                    return;
                } else {
                    o.LJIJI("cutMusicPanel");
                    throw null;
                }
            }
            o.LJIJI("shortVideoContext");
            throw null;
        }
        o.LJIJI("shortVideoContext");
        throw null;
    }

    @Override // X.InterfaceC82146WLu
    public final void onProgress(int i) {
        InterfaceC82187WNj interfaceC82187WNj = this.LJLJI;
        if (interfaceC82187WNj != null) {
            interfaceC82187WNj.LLLLLLZZ(((i - this.LJLJL) * 1.0f) / this.LJLJJI, true);
        } else {
            o.LJIJI("cutMusicPanel");
            throw null;
        }
    }

    public final void LLJILJIL(int i, int i2) {
        if (TextUtils.isEmpty(this.LJLJJLL)) {
            return;
        }
        if (this.LJLJJL == null) {
            this.LJLJJL = new RepeatMusicPlayer(i2, this, this.LJLJJLL);
        }
        RepeatMusicPlayer repeatMusicPlayer = this.LJLJJL;
        if (repeatMusicPlayer != null) {
            repeatMusicPlayer.LIZ(i);
        }
        RepeatMusicPlayer repeatMusicPlayer2 = this.LJLJJL;
        if (repeatMusicPlayer2 != null) {
            repeatMusicPlayer2.LJLJLJ = this;
        }
    }

    @Override // X.WM7
    public final View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        o.LJIIIZ(container, "container");
        CutMusicPanel LJJJJJ = MusicService.LJJLIIIJJI().LJJJJJ();
        o.LJIIIIZZ(LJJJJJ, "get().getService(IMusicS…class.java).cutMusicPanel");
        this.LJLJI = LJJJJJ;
        LJJJJJ.LLIILII = Boolean.TRUE;
        LJJJJJ.Qj(SceneExtensionsKt.LIZLLL(this), inflater, container, L7Q.DARK);
        InterfaceC82187WNj interfaceC82187WNj = this.LJLJI;
        if (interfaceC82187WNj != null) {
            interfaceC82187WNj.f5(new C82144WLs(this));
            View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.ds8, container, false);
            o.LJIIIIZZ(LLLLIILL, "inflater.inflate(R.layou…_scene, container, false)");
            return LLLLIILL;
        }
        o.LJIJI("cutMusicPanel");
        throw null;
    }
}
