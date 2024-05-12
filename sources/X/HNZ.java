package X;

import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class HNZ implements InterfaceC84897XTp {
    public final /* synthetic */ InterfaceC88472Yns<Integer, C76800UCe> LIZ;
    public final /* synthetic */ InterfaceC88471Ynr<TNW, String, C76800UCe> LIZIZ;
    public final /* synthetic */ AVMusic LIZJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LIZLLL;

    @Override // X.InterfaceC84897XTp
    public final void onStart() {
    }

    @Override // X.InterfaceC84897XTp
    public final void onProgress(int i) {
        this.LIZ.invoke(Integer.valueOf(i));
    }

    @Override // X.InterfaceC84897XTp
    public final void LIZ(String musicFile, MusicWaveBean musicWaveBean) {
        o.LJIIIZ(musicFile, "musicFile");
        this.LIZIZ.invoke(this.LIZJ, musicFile);
    }

    @Override // X.InterfaceC84897XTp
    public final void LIZIZ(Integer num, String str) {
        this.LIZLLL.invoke();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HNZ(InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super TNW, ? super String, C76800UCe> interfaceC88471Ynr, AVMusic aVMusic, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        this.LIZ = interfaceC88472Yns;
        this.LIZIZ = interfaceC88471Ynr;
        this.LIZJ = aVMusic;
        this.LIZLLL = interfaceC65784Pro;
    }
}
