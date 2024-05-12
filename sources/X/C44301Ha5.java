package X;

import Y.ARunnableS43S0100000_7;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.io.File;

/* renamed from: X.Ha5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44301Ha5 implements InterfaceC81592W0m {
    public TextView LJLIL;
    public W5G LJLILLLLZI;
    public View LJLJI;
    public FrameLayout LJLJJI;
    public final Effect LJLJJL;
    public View LJLJJLL;
    public final ShortVideoContext LJLJL;
    public boolean LJLJLJ;
    public final ARunnableS43S0100000_7 LJLJLLL = new ARunnableS43S0100000_7(this, 51);

    @Override // X.InterfaceC81592W0m
    public final boolean isShowing() {
        return this.LJLJLJ;
    }

    @Override // X.InterfaceC81592W0m
    public final void LIZ(FrameLayout frameLayout) {
        File file;
        boolean z;
        this.LJLJJI = frameLayout;
        Effect effect = this.LJLJJL;
        if (effect == null || TextUtils.isEmpty(effect.getHint()) || frameLayout == null) {
            return;
        }
        int i = 0;
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(frameLayout.getContext()), R.layout.bn5, frameLayout, false);
        this.LJLJI = LLLLIILL;
        this.LJLJJI.addView(LLLLIILL);
        this.LJLJJLL = this.LJLJI.findViewById(R.id.dc7);
        this.LJLIL = (TextView) this.LJLJI.findViewById(R.id.kir);
        String hint = this.LJLJJL.getHint();
        if (this.LJLJL.LJJJI() || this.LJLJL.LJJIJIIJI()) {
            return;
        }
        if (this.LJLJL.cameraComponentModel.mWorkspace.getMusicPath() != null && !C170626mo.LIZ(this.LJLJL.cameraComponentModel.mWorkspace.getMusicPath())) {
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.messageRes(R.string.bz0);
            C78915Uy7.LJJIJ(frameLayout, 3017, creativeToastBuilder);
            return;
        }
        if (this.LJLJL.cameraComponentModel.mWorkspace.getMusicPath() != null) {
            file = new File(this.LJLJL.cameraComponentModel.mWorkspace.getMusicPath());
        } else {
            file = null;
        }
        String rhythmMusicFilePath = C60903NvH.LJIIJJI().LJJIJ().getRhythmMusicFilePath(this.LJLJL.cameraComponentModel.mMusicPath);
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LJLJL.creativeModel.musicBuzModel);
        if (extractAVMusic != null && extractAVMusic.getStrongBeatUrl() != null && !TextUtils.isEmpty(rhythmMusicFilePath) && !C1B6.LIZIZ(rhythmMusicFilePath)) {
            CreativeToastBuilder creativeToastBuilder2 = new CreativeToastBuilder();
            creativeToastBuilder2.messageRes(R.string.byz);
            C78915Uy7.LJJIJ(frameLayout, 3016, creativeToastBuilder2);
            return;
        }
        if (file != null) {
            return;
        }
        this.LJLIL.setText(hint);
        this.LJLILLLLZI = (W5G) this.LJLJI.findViewById(R.id.kis);
        if (this.LJLJJL.getHintIcon() != null && !C77413UZt.LJIILL(this.LJLJJL.getHintIcon().getUrlList())) {
            z = true;
        } else {
            z = false;
        }
        W5G w5g = this.LJLILLLLZI;
        if (!z) {
            i = 8;
        }
        C162696a1.LIZLLL(i, w5g);
        if (z) {
            C78764Uvg.LJI(this.LJLILLLLZI, C78963Uyt.LJIL(this.LJLJJL.getHintIcon()), -1, -1);
        }
        this.LJLJJLL.startAnimation(C78605Ut7.LJIILIIL(300L, 0.0f, 1.0f));
        this.LJLJJLL.postDelayed(this.LJLJLLL, 5000L);
        this.LJLJLJ = true;
    }

    @Override // X.InterfaceC81592W0m
    public final void LJJLIIIJL(boolean z) {
        Effect effect = this.LJLJJL;
        if (effect == null || TextUtils.isEmpty(effect.getHint()) || this.LJLJJI == null) {
            return;
        }
        this.LJLIL.removeCallbacks(this.LJLJLLL);
        FrameLayout frameLayout = this.LJLJJI;
        if (frameLayout != null) {
            C16880lQ.LJLLLL(this.LJLJI, frameLayout);
        }
        this.LJLJLJ = false;
    }

    public C44301Ha5(ShortVideoContext shortVideoContext, Effect effect) {
        this.LJLJJL = effect;
        this.LJLJL = shortVideoContext;
    }
}
