package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import kotlin.jvm.internal.AqS74S1100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HmP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45065HmP implements InterfaceC84897XTp {
    public final /* synthetic */ C45059HmJ LIZ;

    @Override // X.InterfaceC84897XTp
    public final void onProgress(int i) {
    }

    @Override // X.InterfaceC84897XTp
    public final void onStart() {
    }

    public C45065HmP(C45059HmJ c45059HmJ) {
        this.LIZ = c45059HmJ;
    }

    @Override // X.InterfaceC84897XTp
    public final void LIZ(String musicFile, MusicWaveBean musicWaveBean) {
        o.LJIIIZ(musicFile, "musicFile");
        this.LIZ.getClass();
        C5OG.LIZJ(new AqS74S1100000_7(this.LIZ, musicFile, 12));
    }

    @Override // X.InterfaceC84897XTp
    public final void LIZIZ(Integer num, String str) {
        C45059HmJ c45059HmJ = this.LIZ;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("fetchAndDownloadMusic onFailed: downloadMusic code=");
        LIZ.append(num);
        LIZ.append(", msg=");
        LIZ.append(str);
        X1D.LIZIZ(LIZ);
        c45059HmJ.getClass();
        this.LIZ.LIZIZ(1007, num, str);
    }
}
