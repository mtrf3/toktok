package X;

import com.ss.android.ugc.aweme.openauthorize.entity.ScanCommonResponse;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OTV implements InterfaceC73463SsN<ScanCommonResponse> {
    public final /* synthetic */ InterfaceC61959OTj LJLIL;

    @Override // X.InterfaceC73463SsN
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
    }

    public OTV(OTY oty) {
        this.LJLIL = oty;
    }

    @Override // X.InterfaceC73463SsN
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
        this.LJLIL.LIZ(new ScanCommonResponse(null, null, 3, null));
    }

    @Override // X.InterfaceC73463SsN
    public final void onSuccess(ScanCommonResponse scanCommonResponse) {
        ScanCommonResponse t = scanCommonResponse;
        o.LJIIIZ(t, "t");
        this.LJLIL.LIZ(t);
    }
}
