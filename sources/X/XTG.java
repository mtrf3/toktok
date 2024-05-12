package X;

import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import java.util.concurrent.Callable;

/* loaded from: classes16.dex */
public final class XTG<V> implements Callable {
    public final /* synthetic */ XTH LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ MusicWaveBean LJLJI;
    public final /* synthetic */ Boolean LJLJJI;

    public XTG(XTH xth, String str, MusicWaveBean musicWaveBean, Boolean bool) {
        this.LJLIL = xth;
        this.LJLILLLLZI = str;
        this.LJLJI = musicWaveBean;
        this.LJLJJI = bool;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.LJLIL.LIZ.LIZIZ(this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
        return C76800UCe.LIZ;
    }
}
