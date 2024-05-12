package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusicWaveBean;

/* loaded from: classes15.dex */
public final class WG1 implements WG3 {
    public final /* synthetic */ WG2 LIZ;

    public WG1(WG2 wg2) {
        this.LIZ = wg2;
    }

    @Override // X.WG3
    public final void LIZ(Object obj) {
        boolean z;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("OLD_DRAFT AudioWaveDataIsNull:");
        if (obj == null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        H7B.LIZ(X1D.LIZIZ(LIZ));
        WG2 wg2 = this.LIZ;
        if (wg2 != null) {
            if (obj != null && (obj instanceof AVMusicWaveBean)) {
                wg2.LIZ((AVMusicWaveBean) obj);
            } else {
                wg2.LIZ(null);
            }
        }
    }
}
