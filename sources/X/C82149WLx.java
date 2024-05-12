package X;

import Y.ARunnableS50S0100000_14;
import android.widget.TextView;
import com.bytedance.scene.ktx.SceneExtensionsKt;
import com.ss.android.ugc.aweme.ftc.components.cutmusic.FTCEditMusicCutViewModel;
import com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* renamed from: X.WLx, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82149WLx extends AbstractC163776bl<FTCEditMusicCutViewModel> implements InterfaceC135635Tz {
    public final C82622Wbi LJLJLJ;
    public final WMH LJLJLLL;
    public final int LJLL;
    public final C62822Ol8 LJLLI;
    public final C81646W2o LJLLILLLL;

    @Override // X.AbstractC165596eh
    public final void LJJLIIIJLLLLLLLZ() {
        boolean booleanValue;
        ViewOnTouchListenerC82148WLw viewOnTouchListenerC82148WLw = (ViewOnTouchListenerC82148WLw) this.LJLLI.getValue();
        VideoPublishEditModel LLJJ = viewOnTouchListenerC82148WLw.LLJJ();
        if (LLJJ.getMMusicPath() != null && !LLJJ.isStickPointMode) {
            viewOnTouchListenerC82148WLw.getEditPreviewApi().U2(false, false, false);
            if (LLJJ.hasOriginalSound()) {
                InterfaceC143655kP editPreviewApi = viewOnTouchListenerC82148WLw.getEditPreviewApi();
                VEVolumeChangeOp ofVoice = VEVolumeChangeOp.ofVoice(0.0f);
                o.LJIIIIZZ(ofVoice, "ofVoice(0f)");
                editPreviewApi.Dl0(ofVoice);
            }
            int musicDuration = C78934UyQ.LJLIL.getMusicService().getMusicDuration(LLJJ.getMMusicPath());
            viewOnTouchListenerC82148WLw.LJZ = musicDuration;
            TextView textView = viewOnTouchListenerC82148WLw.LJLJJL;
            Integer num = null;
            if (textView != null) {
                textView.setText(C78605Ut7.LJIIL(musicDuration));
                int mMusicStart = LLJJ.getMMusicStart();
                viewOnTouchListenerC82148WLw.LJLLL = mMusicStart;
                viewOnTouchListenerC82148WLw.LJLLLL = mMusicStart;
                Boolean isSoundLoop = LLJJ.getIsSoundLoop();
                if (isSoundLoop == null) {
                    booleanValue = false;
                } else {
                    booleanValue = isSoundLoop.booleanValue();
                }
                viewOnTouchListenerC82148WLw.LJLLLLLL = booleanValue;
                viewOnTouchListenerC82148WLw.LJLZ = booleanValue;
                SceneExtensionsKt.LIZIZ(viewOnTouchListenerC82148WLw, new ARunnableS50S0100000_14(viewOnTouchListenerC82148WLw, 222));
                if (!viewOnTouchListenerC82148WLw.LLIIIILZ) {
                    viewOnTouchListenerC82148WLw.LLJJIJI(true);
                }
                InterfaceC153045zY value = viewOnTouchListenerC82148WLw.getEditPreviewApi().Kh().getValue();
                if (value == null || (num = Integer.valueOf(value.LLJJJJJIL(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, viewOnTouchListenerC82148WLw.LLIFFJFJJ))) == null || num.intValue() != 0) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("cutMusic seek error: ");
                    LIZ.append(num);
                    H7B.LIZJ(X1D.LIZIZ(LIZ));
                }
                InterfaceC45540Hu4 interfaceC45540Hu4 = viewOnTouchListenerC82148WLw.LLF;
                if (interfaceC45540Hu4 != null) {
                    interfaceC45540Hu4.registerActivityOnKeyDownListener(viewOnTouchListenerC82148WLw.LLII);
                    return;
                }
                return;
            }
            o.LJIJI("mTextViewTotalTime");
            throw null;
        }
    }

    @Override // X.AbstractC165596eh
    public final WMH LJJLI() {
        return this.LJLJLLL;
    }

    @Override // X.AbstractC165596eh
    public final InterfaceC65784Pro<FTCEditMusicCutViewModel> LJJLIIIJILLIZJL() {
        return this.LJLLILLLL;
    }

    @Override // X.InterfaceC135635Tz
    public final C82622Wbi getDiContainer() {
        return this.LJLJLJ;
    }

    public C82149WLx(C82622Wbi diContainer, WMH parentScene) {
        o.LJIIIZ(diContainer, "diContainer");
        o.LJIIIZ(parentScene, "parentScene");
        this.LJLJLJ = diContainer;
        this.LJLJLLL = parentScene;
        this.LJLL = R.id.fns;
        this.LJLLI = C221108m2.LIZIZ(new AqS164S0100000_14(this, 425));
        this.LJLLILLLL = C81646W2o.LJLIL;
    }
}
