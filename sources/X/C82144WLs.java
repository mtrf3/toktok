package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.RepeatMusicPlayer;
import kotlin.jvm.internal.o;

/* renamed from: X.WLs, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82144WLs implements WGL {
    public final /* synthetic */ C82143WLr LIZ;

    @Override // X.WGL
    public final void LIZ() {
        String str;
        C82143WLr c82143WLr = this.LIZ;
        c82143WLr.LJLIL.invoke(Integer.valueOf(c82143WLr.LJLJL));
        C82143WLr c82143WLr2 = this.LIZ;
        RepeatMusicPlayer repeatMusicPlayer = c82143WLr2.LJLJJL;
        if (repeatMusicPlayer != null) {
            repeatMusicPlayer.LIZIZ();
        }
        String str2 = null;
        c82143WLr2.LJLJJL = null;
        ShortVideoContext shortVideoContext = this.LIZ.LJLILLLLZI;
        if (shortVideoContext != null) {
            AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(shortVideoContext.creativeModel.musicBuzModel);
            C145995oB c145995oB = new C145995oB();
            ShortVideoContext shortVideoContext2 = this.LIZ.LJLILLLLZI;
            if (shortVideoContext2 != null) {
                c145995oB.LJI("creation_id", shortVideoContext2.LJI());
                c145995oB.LJI("enter_from", "video_shoot_page");
                if (extractAVMusic != null) {
                    str = extractAVMusic.getMusicId();
                } else {
                    str = null;
                }
                c145995oB.LJI("music_id", str);
                if (extractAVMusic != null) {
                    str2 = extractAVMusic.getEditFrom();
                }
                c145995oB.LJI("music_edited_from", str2);
                c145995oB.LJI("enter_method", "entrance_icon");
                c145995oB.LIZ(0, "is_editor_pro");
                FMX.LJIIL("edit_music_complete", c145995oB.LIZ);
                return;
            }
            o.LJIJI("shortVideoContext");
            throw null;
        }
        o.LJIJI("shortVideoContext");
        throw null;
    }

    @Override // X.WGL
    public final void LIZIZ() {
        C82143WLr c82143WLr = this.LIZ;
        InterfaceC88472Yns<Integer, C76800UCe> interfaceC88472Yns = c82143WLr.LJLIL;
        ShortVideoContext shortVideoContext = c82143WLr.LJLILLLLZI;
        if (shortVideoContext != null) {
            interfaceC88472Yns.invoke(Integer.valueOf(shortVideoContext.cameraComponentModel.mMusicStart));
            C82143WLr c82143WLr2 = this.LIZ;
            RepeatMusicPlayer repeatMusicPlayer = c82143WLr2.LJLJJL;
            if (repeatMusicPlayer != null) {
                repeatMusicPlayer.LIZIZ();
            }
            c82143WLr2.LJLJJL = null;
            return;
        }
        o.LJIJI("shortVideoContext");
        throw null;
    }

    public C82144WLs(C82143WLr c82143WLr) {
        this.LIZ = c82143WLr;
    }

    @Override // X.WGL
    public final int LIZJ(float f) {
        return (int) (this.LIZ.LJLJJI * f);
    }

    @Override // X.WGL
    public final void LIZLLL(float f) {
        if (TextUtils.isEmpty(this.LIZ.LJLJJLL)) {
            return;
        }
        C82143WLr c82143WLr = this.LIZ;
        int i = (int) (c82143WLr.LJLJJI * f);
        c82143WLr.LJLJL = i;
        c82143WLr.LLJILJIL(i, c82143WLr.LJLJLJ);
    }
}
