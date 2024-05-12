package X;

import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

/* renamed from: X.PbV, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64773PbV implements QNS {
    public final /* synthetic */ CountDownLatch LJLIL;
    public final /* synthetic */ boolean[] LJLILLLLZI;

    @Override // X.QNS
    public final void onFail(int i) {
        this.LJLIL.countDown();
    }

    public C64773PbV(CountDownLatch countDownLatch, boolean[] zArr) {
        this.LJLIL = countDownLatch;
        this.LJLILLLLZI = zArr;
    }

    @Override // X.QNS
    public final void LIZ(int i, JSONObject jSONObject) {
        this.LJLILLLLZI[0] = true;
        this.LJLIL.countDown();
    }
}
