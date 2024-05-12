package X;

import com.bytedance.android.livesdk.livesetting.other.LiveRequestLayoutOptSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* renamed from: X.C5q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30766C5q extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C30766C5q LJLIL = new C30766C5q();

    public C30766C5q() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int value;
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLocalTest()) {
            value = 7;
        } else {
            value = LiveRequestLayoutOptSetting.INSTANCE.getValue();
        }
        return Integer.valueOf(value);
    }
}
