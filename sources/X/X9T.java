package X;

import com.bytedance.ttmock.TTMock;
import com.bytedance.ttmock.data.RegionMock;
import com.bytedance.ttmock.data.RegionMockConfig;

/* loaded from: classes16.dex */
public final class X9T extends AbstractC65781Prl implements InterfaceC65784Pro<RegionMockConfig> {
    public static final X9T LJLIL = new X9T();

    public X9T() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.bytedance.ttmock.data.RegionMockConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final RegionMockConfig invoke() {
        RegionMock regionMock = (RegionMock) TTMock.INSTANCE.getMockDelegate(RegionMock.class);
        if (regionMock != null) {
            return regionMock.get();
        }
        return null;
    }
}
