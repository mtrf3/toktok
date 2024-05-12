package X;

import com.ss.android.ugc.aweme.services.audio.VoiceDetectionListener;

/* renamed from: X.4xe, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C126384xe implements VoiceDetectionListener {
    public final /* synthetic */ InterfaceC88472Yns<Boolean, C76800UCe> LIZ;

    /* JADX WARN: Multi-variable type inference failed */
    public C126384xe(InterfaceC88472Yns<? super Boolean, C76800UCe> interfaceC88472Yns) {
        this.LIZ = interfaceC88472Yns;
    }

    @Override // com.ss.android.ugc.aweme.services.audio.VoiceDetectionListener
    public final void onVoiceActivityDetected(boolean z, double d) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("JDW: AUTO MUSIC: isReachTargetRate=");
        LIZ.append(z);
        LIZ.append(", targetRate=");
        LIZ.append(d);
        H78.LJI(X1D.LIZIZ(LIZ));
        InterfaceC88472Yns<Boolean, C76800UCe> interfaceC88472Yns = this.LIZ;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Boolean.valueOf(z));
        }
    }
}
