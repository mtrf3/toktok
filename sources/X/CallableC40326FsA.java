package X;

import com.ss.android.ugc.aweme.fe.method.DownloadFileMethod;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: X.FsA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class CallableC40326FsA<V> implements Callable {
    public final /* synthetic */ DownloadFileMethod LJLIL;
    public final /* synthetic */ JSONObject LJLJI;
    public final /* synthetic */ String LJLILLLLZI = "notification";
    public final /* synthetic */ int LJLJJI = 3;

    public CallableC40326FsA(DownloadFileMethod downloadFileMethod, JSONObject jSONObject) {
        this.LJLIL = downloadFileMethod;
        this.LJLJI = jSONObject;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        this.LJLIL.sendEvent(this.LJLILLLLZI, this.LJLJI, this.LJLJJI);
        return C76800UCe.LIZ;
    }
}
