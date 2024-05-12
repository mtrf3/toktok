package X;

import android.os.Bundle;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCaptureVideoRecordDurationSetting;

/* renamed from: X.Bxc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30472Bxc<T> implements InterfaceC64592gB {
    public final /* synthetic */ C30529ByX LJLIL;

    public C30472Bxc(C30529ByX c30529ByX) {
        this.LJLIL = c30529ByX;
    }

    @Override // X.InterfaceC64592gB
    public final void accept(Object obj) {
        C0NB.LIZIZ("CaptureVideoUploadController", "catchVideo");
        Bundle bundle = new Bundle();
        bundle.putInt("mode", 0);
        bundle.putString("outputPathOrigin", (String) this.LJLIL.LJ.getValue());
        bundle.putString("outputPathWithEffect", (String) this.LJLIL.LJFF.getValue());
        bundle.putBoolean("hardwareEncode", this.LJLIL.LIZLLL);
        bundle.putFloat("duration", LiveCaptureVideoRecordDurationSetting.INSTANCE.getValue());
        C30529ByX c30529ByX = this.LJLIL;
        c30529ByX.LIZ.LJ(bundle, c30529ByX);
    }
}
