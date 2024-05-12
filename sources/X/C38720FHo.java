package X;

import com.bytedance.ttmock.TTMock;
import com.bytedance.ttmock.data.ABReverseMock;
import kotlin.jvm.internal.o;

/* renamed from: X.FHo, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38720FHo extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C38720FHo LJLIL = new C38720FHo();

    public C38720FHo() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        TTMock tTMock = TTMock.INSTANCE;
        if (tTMock.getMockDelegate(ABReverseMock.class) != null) {
            ABReverseMock aBReverseMock = (ABReverseMock) tTMock.getMockDelegate(ABReverseMock.class);
            if (aBReverseMock != null) {
                z = o.LJ(aBReverseMock.get(), Boolean.FALSE);
            } else {
                z = false;
            }
            return Boolean.valueOf(!z);
        }
        return Boolean.TRUE;
    }
}
