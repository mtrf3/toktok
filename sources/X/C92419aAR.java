package X;

import androidx.compose.ui.platform.g1;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import com.zhiliaoapp.musically.R;

/* renamed from: X.aAR, reason: case insensitive filesystem */
/* loaded from: classes20.dex */
public final class C92419aAR extends AbstractC65781Prl implements InterfaceC88471Ynr<InterfaceC24520xk, Integer, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJI;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLJJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C92419aAR(boolean z, boolean z2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3) {
        super(2);
        this.LJLIL = z;
        this.LJLILLLLZI = z2;
        this.LJLJI = interfaceC65784Pro;
        this.LJLJJI = interfaceC65784Pro2;
        this.LJLJJL = interfaceC65784Pro3;
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(InterfaceC24520xk interfaceC24520xk, Integer num) {
        InterfaceC24520xk interfaceC24520xk2 = interfaceC24520xk;
        if (((num.intValue() & 11) ^ 2) != 0 || !interfaceC24520xk2.LIZ()) {
            if (this.LJLIL) {
                AbstractC16010k1 LJJIIZ = C79081V1x.LJJIIZ(R.drawable.j3, interfaceC24520xk2);
                C1M1 c1m1 = InterfaceC07790Sh.LJJJI;
                boolean z = this.LJLILLLLZI;
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.LJLJI;
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = this.LJLJJI;
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro3 = this.LJLJJL;
                C0SR.LIZ(LJJIIZ, null, C07770Sf.LIZ(c1m1, g1.LIZ, new C92416aAO(z, null, new C42191l9(), interfaceC65784Pro, interfaceC65784Pro2, interfaceC65784Pro3)), null, null, 0.0f, null, interfaceC24520xk2, 56, LiveTryModeCountDownThresholdSetting.DEFAULT);
            }
        } else {
            interfaceC24520xk2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
