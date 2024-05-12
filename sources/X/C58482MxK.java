package X;

import com.bytedance.android.livesdk.livesetting.linkmic.CoHostMinCapSetting;

/* renamed from: X.MxK, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58482MxK extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58482MxK LJLIL = new C58482MxK();

    public C58482MxK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(CoHostMinCapSetting.INSTANCE.getValue());
    }
}
