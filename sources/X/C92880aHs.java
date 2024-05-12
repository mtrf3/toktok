package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.zhiliaoapp.musically.R;

/* renamed from: X.aHs, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92880aHs extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public static final C92880aHs LJLIL = new C92880aHs();

    public C92880aHs() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            C0SR.LIZ(C79081V1x.LJJIIZ(R.drawable.kj, interfaceC24520xk2), "", C09290Yb.LJIIIIZZ(InterfaceC07790Sh.LJJJI, 100), null, null, 0.0f, null, interfaceC24520xk2, 440, LiveTryModeCountDownThresholdSetting.DEFAULT);
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
