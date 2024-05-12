package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import kotlin.jvm.internal.AqS157S0100000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hoi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45208Hoi implements InterfaceC84897XTp {
    public final /* synthetic */ C45199HoZ LIZ;
    public final /* synthetic */ InterfaceC45222How LIZIZ;
    public final /* synthetic */ AVMusic LIZJ;

    @Override // X.InterfaceC84897XTp
    public final void onProgress(int i) {
    }

    @Override // X.InterfaceC84897XTp
    public final void onStart() {
    }

    @Override // X.InterfaceC84897XTp
    public final void LIZ(String musicFile, MusicWaveBean musicWaveBean) {
        o.LJIIIZ(musicFile, "musicFile");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutComponent download music onSuccess: musicPath: ");
        LIZ.append(musicFile);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        C45199HoZ c45199HoZ = this.LIZ;
        C44716Hgm c44716Hgm = c45199HoZ.LJLLL;
        if (c44716Hgm != null) {
            c44716Hgm.LJFF = musicFile;
        }
        c45199HoZ.LJLZ = 1.0f;
        C6QQ.LIZ(new AqS157S0100000_7(c45199HoZ, 58));
        InterfaceC45222How interfaceC45222How = this.LIZIZ;
        if (interfaceC45222How != null) {
            interfaceC45222How.LIZLLL(this.LIZJ.getMusicId());
        }
        this.LIZ.LLF(this.LIZIZ);
    }

    @Override // X.InterfaceC84897XTp
    public final void LIZIZ(Integer num, String str) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AutoCutComponent download music onFailed: code = ");
        LIZ.append(num);
        LIZ.append(", msg = ");
        LIZ.append(str);
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        C45199HoZ.LJLZ(this.LIZ, 1007, num, str, null, 8, null);
    }

    public C45208Hoi(C45199HoZ c45199HoZ, InterfaceC45222How interfaceC45222How, AVMusic aVMusic) {
        this.LIZ = c45199HoZ;
        this.LIZIZ = interfaceC45222How;
        this.LIZJ = aVMusic;
    }
}
