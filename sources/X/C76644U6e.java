package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LiveLinkmicDslLoadOptimizeSetting;

/* renamed from: X.U6e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76644U6e extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC75011TcF> {
    public static final C76644U6e LJLIL = new C76644U6e();

    public C76644U6e() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final InterfaceC75011TcF invoke() {
        if (LiveLinkmicDslLoadOptimizeSetting.INSTANCE.getValue()) {
            return new UCC();
        }
        return new UCD();
    }
}
