package X;

import com.ss.android.ugc.aweme.music.api.MusicApi;
import java.util.concurrent.Callable;

/* loaded from: classes16.dex */
public final class XVZ implements Callable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ int LJLILLLLZI;
    public final /* synthetic */ int LJLJI;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return MusicApi.LIZ(this.LJLILLLLZI, this.LJLJI, this.LJLIL);
    }

    public XVZ(String str, int i, int i2) {
        this.LJLIL = str;
        this.LJLILLLLZI = i;
        this.LJLJI = i2;
    }
}
