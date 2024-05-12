package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;

/* loaded from: classes15.dex */
public final class WGF implements WGH {
    public final /* synthetic */ WGG LIZ;
    public final /* synthetic */ String LIZIZ;

    @Override // X.WGH
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
        WGG wgg = this.LIZ;
        if (wgg != null) {
            if (obj != null && (obj instanceof MusicWaveBean)) {
                wgg.LIZ((MusicWaveBean) obj);
                String str = this.LIZIZ;
                if (str != null) {
                    WGE.LIZ.put(str, obj);
                    return;
                }
                return;
            }
            wgg.LIZ(null);
        }
    }

    public WGF(WGG wgg, String str) {
        this.LIZ = wgg;
        this.LIZIZ = str;
    }
}
