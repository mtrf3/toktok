package X;

import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.vesdk.VEEditor;
import kotlin.jvm.internal.o;

/* renamed from: X.WLy, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82150WLy {
    public final /* synthetic */ ViewOnTouchListenerC82148WLw LIZ;

    public final void LIZ() {
        int min;
        AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(this.LIZ.LLJJ().creativeModel.musicBuzModel);
        InterfaceC153045zY value = this.LIZ.getEditPreviewApi().Kh().getValue();
        if (value == null) {
            return;
        }
        if (extractAVMusic != null && extractAVMusic.getShootDuration() > 0) {
            if (Math.abs(value.getDuration() - extractAVMusic.getShootDuration()) >= 1000) {
                min = extractAVMusic.getShootDuration();
            } else {
                min = value.getDuration();
            }
        } else {
            min = Math.min(15000, value.getDuration());
        }
        int min2 = Math.min(min, value.getDuration());
        InterfaceC143655kP editPreviewApi = this.LIZ.getEditPreviewApi();
        ViewOnTouchListenerC82148WLw viewOnTouchListenerC82148WLw = this.LIZ;
        int i = viewOnTouchListenerC82148WLw.LJLLL;
        if (viewOnTouchListenerC82148WLw.LJLJJLL != null) {
            editPreviewApi.uC(new C123774tR(i, min2, false));
            int LLJJJJJIL = value.LLJJJJJIL(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek, this.LIZ.LLIFFJFJJ);
            if (LLJJJJJIL != 0) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("onPlayMusic seek error: ");
                LIZ.append(LLJJJJJIL);
                H7B.LIZJ(X1D.LIZIZ(LIZ));
                return;
            }
            return;
        }
        o.LJIJI("cutMusicLayout");
        throw null;
    }

    public C82150WLy(ViewOnTouchListenerC82148WLw viewOnTouchListenerC82148WLw) {
        this.LIZ = viewOnTouchListenerC82148WLw;
    }
}
