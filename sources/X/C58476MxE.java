package X;

import com.bytedance.android.livesdk.livesetting.other.LiveSetTextOptSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* renamed from: X.MxE, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58476MxE extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58476MxE LJLIL = new C58476MxE();

    public C58476MxE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean value;
        if (((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLocalTest()) {
            value = true;
        } else {
            value = LiveSetTextOptSetting.INSTANCE.getValue();
        }
        return Boolean.valueOf(value);
    }
}
