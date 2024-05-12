package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.music.ui.reuseaudio.ReuseAudioPlayer;
import com.ss.android.ugc.aweme.music.ui.reuseaudio.ReuseAudioViewModel;
import defpackage.e1;
import kotlin.jvm.internal.AqS162S0200000_15;
import kotlin.jvm.internal.AqS82S1100000_15;

/* loaded from: classes16.dex */
public final class XUW implements X6G {
    public final /* synthetic */ ReuseAudioViewModel LIZ;

    @Override // X.X6G
    public final void LIZ() {
    }

    @Override // X.X6G
    public final void LIZLLL() {
    }

    @Override // X.X6G
    public final void LJ() {
    }

    @Override // X.X6G
    public final void LIZIZ() {
        this.LIZ.LJLJJLL.postValue(C76800UCe.LIZ);
    }

    @Override // X.X6G
    public final void LIZJ() {
        this.LIZ.LJLJJLL.postValue(C76800UCe.LIZ);
    }

    public XUW(ReuseAudioViewModel reuseAudioViewModel) {
        this.LIZ = reuseAudioViewModel;
    }

    @Override // X.X6G
    public final void onDownloadSuccess(String str) {
        ReuseAudioPlayer reuseAudioPlayer;
        if (this.LIZ.LJLJJI.getValue() == XUX.LOADING) {
            this.LIZ.LJLJJI.postValue(XUX.PLAY);
        }
        this.LIZ.LJLILLLLZI.postValue(str);
        if (e1.LIZ(31744, "enable_reuse_original_sound_auto_play", true, false) && ((reuseAudioPlayer = this.LIZ.LJLJL) == null || !reuseAudioPlayer.LJLIL.isPlaying())) {
            C2VQ.LIZIZ(new AqS82S1100000_15(this.LIZ, str, 1), 0L);
        }
        XKX.LIZLLL(C780334l.LJLIL, C36636EZk.LIZ, null, new EGS(this.LIZ, str, null), 2);
    }

    @Override // X.X6G
    public final void LJFF(UrlModel urlModel, Aweme aweme) {
        this.LIZ.LJLIL.postValue(aweme);
        this.LIZ.LJLJJL.postValue(urlModel);
        if (urlModel == null) {
            this.LIZ.LJLJJLL.postValue(C76800UCe.LIZ);
        } else if (e1.LIZ(31744, "enable_reuse_original_sound_auto_play", true, false)) {
            C2VQ.LIZIZ(new AqS162S0200000_15(this.LIZ, urlModel, 78), 0L);
        }
    }
}
