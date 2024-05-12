package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import kotlin.jvm.internal.o;

/* renamed from: X.WNo, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82192WNo implements WGG {
    public final /* synthetic */ C82188WNk LIZ;
    public final /* synthetic */ boolean LIZIZ;

    @Override // X.WGG
    public final void LIZ(MusicWaveBean musicWaveBean) {
        C82188WNk c82188WNk = this.LIZ;
        c82188WNk.LLIIJI = false;
        int i = c82188WNk.LJLLILLLL;
        int i2 = c82188WNk.LJLJLJ;
        c82188WNk.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("SoundLoop, EditMusicCutScene.updateMusicWaveData musicLength = ");
        LIZ.append(i);
        LIZ.append(" videoLength = ");
        LIZ.append(c82188WNk.LJLJL);
        LIZ.append(" bean = ");
        LIZ.append(musicWaveBean);
        H7B.LIZ(X1D.LIZIZ(LIZ));
        if (musicWaveBean != null) {
            c82188WNk.LJLLLL = i;
            InterfaceC82187WNj interfaceC82187WNj = c82188WNk.LLIIII;
            if (interfaceC82187WNj != null) {
                interfaceC82187WNj.Q1(musicWaveBean, i, i2, c82188WNk.LJLJL, C145595nX.LIZ());
            } else {
                o.LJIJI("mCutMusicPanel");
                throw null;
            }
        }
        if (this.LIZIZ) {
            this.LIZ.LLJJ();
        }
    }

    public C82192WNo(C82188WNk c82188WNk, boolean z) {
        this.LIZ = c82188WNk;
        this.LIZIZ = z;
    }
}
