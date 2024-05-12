package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;

/* loaded from: classes15.dex */
public final class WM1 implements WG2 {
    public final /* synthetic */ ViewOnTouchListenerC82148WLw LIZ;
    public final /* synthetic */ AVMusic LIZIZ;

    @Override // X.WG2
    public final void LIZ(AVMusicWaveBean aVMusicWaveBean) {
        ViewOnTouchListenerC82148WLw viewOnTouchListenerC82148WLw = this.LIZ;
        viewOnTouchListenerC82148WLw.LLIIIILZ = false;
        viewOnTouchListenerC82148WLw.LLJJIJI(true);
        this.LIZ.LLJJIJIL(aVMusicWaveBean, this.LIZIZ.getDuration(), this.LIZ.LLJJ().getMMusicStart());
    }

    public WM1(ViewOnTouchListenerC82148WLw viewOnTouchListenerC82148WLw, AVMusic aVMusic) {
        this.LIZ = viewOnTouchListenerC82148WLw;
        this.LIZIZ = aVMusic;
    }
}
