package X;

import com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyRecordVideoOutputSizeConfiguration;

/* renamed from: X.HlE, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44992HlE extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C44992HlE LJLIL = new C44992HlE();

    public C44992HlE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        ByteBenchStrategyRecordVideoOutputSizeConfiguration byteBenchStrategyRecordVideoOutputSizeConfiguration;
        if (!((Boolean) C44994HlG.LIZ.getValue()).booleanValue() || (byteBenchStrategyRecordVideoOutputSizeConfiguration = (ByteBenchStrategyRecordVideoOutputSizeConfiguration) C44989HlB.LIZIZ.getValue()) == null) {
            return null;
        }
        return byteBenchStrategyRecordVideoOutputSizeConfiguration.getStaticRecordOutputSize();
    }
}
