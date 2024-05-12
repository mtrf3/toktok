package X;

import com.ss.android.ugc.aweme.qrcode.api.QRCodeApi;
import java.util.concurrent.Callable;

/* renamed from: X.OaV, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class CallableC62163OaV implements Callable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ String LJLILLLLZI;
    public final /* synthetic */ String LJLJI = null;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return QRCodeApi.LIZ(this.LJLIL, this.LJLILLLLZI, this.LJLJI);
    }

    public CallableC62163OaV(int i, String str) {
        this.LJLIL = i;
        this.LJLILLLLZI = str;
    }
}
