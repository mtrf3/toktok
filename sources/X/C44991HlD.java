package X;

import com.ss.android.ugc.aweme.bytebench.ByteBenchStrategyRecordVideoOutputSizeConfiguration;

/* renamed from: X.HlD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44991HlD extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C44991HlD LJLIL = new C44991HlD();

    public C44991HlD() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        ByteBenchStrategyRecordVideoOutputSizeConfiguration byteBenchStrategyRecordVideoOutputSizeConfiguration;
        String recordOutputSize;
        if (!((Boolean) C44994HlG.LIZ.getValue()).booleanValue() || (byteBenchStrategyRecordVideoOutputSizeConfiguration = (ByteBenchStrategyRecordVideoOutputSizeConfiguration) C44989HlB.LIZIZ.getValue()) == null || (recordOutputSize = byteBenchStrategyRecordVideoOutputSizeConfiguration.getRecordOutputSize()) == null) {
            return null;
        }
        return recordOutputSize;
    }
}
