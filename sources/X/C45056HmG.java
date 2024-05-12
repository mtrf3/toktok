package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.HmG, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45056HmG implements InterfaceC84897XTp {
    public final /* synthetic */ C45054HmE LIZ;
    public final /* synthetic */ int LIZIZ;
    public final /* synthetic */ C63A LIZJ;

    @Override // X.InterfaceC84897XTp
    public final void onStart() {
    }

    @Override // X.InterfaceC84897XTp
    public final void onProgress(int i) {
        this.LIZ.LLLL(this.LIZIZ, this.LIZJ);
    }

    @Override // X.InterfaceC84897XTp
    public final void LIZ(String musicFile, MusicWaveBean musicWaveBean) {
        o.LJIIIZ(musicFile, "musicFile");
        if (!this.LIZ.LLLL(this.LIZIZ, this.LIZJ)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditAutoCutComponent download music onSuccess: musicPath: ");
        LIZ.append(musicFile);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        C45054HmE c45054HmE = this.LIZ;
        C44716Hgm c44716Hgm = c45054HmE.LLIIJLIL;
        if (c44716Hgm != null) {
            c44716Hgm.LJFF = musicFile;
        }
        c45054HmE.LLIIL = 1.0f;
        C6QQ.LIZ(new AqS157S0100000_7(c45054HmE, 188));
        this.LIZ.LLLLLJIL();
        this.LIZ.LLLLZIL(this.LIZIZ, this.LIZJ);
    }

    @Override // X.InterfaceC84897XTp
    public final void LIZIZ(Integer num, String str) {
        if (!this.LIZ.LLLL(this.LIZIZ, this.LIZJ)) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("EditAutoCutComponent download music onFailed: code = ");
        LIZ.append(num);
        LIZ.append(", msg = ");
        LIZ.append(str);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        C45054HmE.LLLJ(this.LIZ, 1007, str, 0, 4, null);
    }

    public C45056HmG(C45054HmE c45054HmE, int i, C63A c63a) {
        this.LIZ = c45054HmE;
        this.LIZIZ = i;
        this.LIZJ = c63a;
    }
}
