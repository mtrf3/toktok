package X;

import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownThresholdSetting;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class V6G extends AbstractC65781Prl implements InterfaceC88472Yns<InterfaceC33691Tx, C76800UCe> {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ float LJLILLLLZI;
    public final /* synthetic */ C79188V6a LJLJI;
    public final /* synthetic */ float LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V6G(boolean z, float f, C79188V6a c79188V6a, float f2) {
        super(1);
        this.LJLIL = z;
        this.LJLILLLLZI = f;
        this.LJLJI = c79188V6a;
        this.LJLJJI = f2;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(InterfaceC33691Tx interfaceC33691Tx) {
        long j;
        long j2;
        InterfaceC33691Tx Canvas = interfaceC33691Tx;
        o.LJIIIZ(Canvas, "$this$Canvas");
        if (this.LJLIL) {
            j = C79175V5n.LIZIZ;
        } else {
            j = C79175V5n.LIZ;
        }
        float f = this.LJLILLLLZI * 0.25f;
        C79188V6a c79188V6a = this.LJLJI;
        float f2 = c79188V6a.LJLJI;
        C14720hw.LIZJ(Canvas, j, f2 + (f * f2), C78923UyF.LIZ(this.LJLJJI, c79188V6a.LJLILLLLZI), 0.0f, null, LiveTryModeCountDownThresholdSetting.DEFAULT);
        InterfaceC11750d9 LIZ = Canvas.LJJIII().LIZ();
        C79188V6a c79188V6a2 = this.LJLJI;
        float f3 = c79188V6a2.LJLJI;
        float f4 = f3 - ((this.LJLILLLLZI * 0.375f) * f3);
        long LIZ2 = C78923UyF.LIZ(c79188V6a2.LJLIL - this.LJLJJI, c79188V6a2.LJLILLLLZI);
        C1QW c1qw = new C1QW();
        boolean z = this.LJLIL;
        c1qw.LJFF(16);
        if (z) {
            j2 = C79175V5n.LIZ;
        } else {
            j2 = C79175V5n.LIZIZ;
        }
        c1qw.LIZLLL(j2);
        LIZ.LIZ(f4, LIZ2, c1qw);
        return C76800UCe.LIZ;
    }
}
