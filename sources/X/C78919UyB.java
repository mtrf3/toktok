package X;

import com.ss.android.ugc.aweme.setting.verification.VerificationResponse;
import kotlin.jvm.internal.o;

/* renamed from: X.UyB, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78919UyB implements InterfaceC116954iR<VerificationResponse> {
    public final /* synthetic */ C78915Uy7 LJLIL;
    public final /* synthetic */ C78975Uz5 LJLILLLLZI;

    @Override // X.InterfaceC116954iR
    public final void onComplete() {
        this.LJLIL.LJJIFFI();
    }

    @Override // X.InterfaceC116954iR
    public final void onError(Throwable e) {
        o.LJIIIZ(e, "e");
        this.LJLIL.LJJII();
        this.LJLIL.LJJIFFI();
    }

    @Override // X.InterfaceC116954iR
    public final void onNext(VerificationResponse verificationResponse) {
        VerificationResponse t = verificationResponse;
        o.LJIIIZ(t, "t");
        this.LJLIL.LJJIII(t);
    }

    @Override // X.InterfaceC116954iR
    public final void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
        this.LJLILLLLZI.LIZ.LIZ(d);
    }

    public C78919UyB(C78915Uy7 c78915Uy7, C78975Uz5 c78975Uz5) {
        this.LJLIL = c78915Uy7;
        this.LJLILLLLZI = c78975Uz5;
    }
}
