package X;

import com.ss.android.ugc.aweme.services.external.ability.IQRCodeScanner;
import kotlin.jvm.internal.o;

/* renamed from: X.Wu6, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83762Wu6 implements InterfaceC83737Wth {
    public final /* synthetic */ C83758Wu2 LIZ;

    @Override // X.InterfaceC83737Wth
    public final void LIZIZ(int i) {
    }

    public C83762Wu6(C83758Wu2 c83758Wu2) {
        this.LIZ = c83758Wu2;
    }

    @Override // X.InterfaceC83737Wth
    public final void LIZ(int i, int i2, String info) {
        o.LJIIIZ(info, "info");
        IQRCodeScanner.OnEnigmaScanListener onEnigmaScanListener = this.LIZ.LIZIZ;
        if (onEnigmaScanListener != null) {
            o.LJI(onEnigmaScanListener);
            onEnigmaScanListener.onFail(-1000);
        }
    }
}
