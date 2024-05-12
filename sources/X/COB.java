package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* loaded from: classes6.dex */
public final class COB extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final COB LJLIL = new COB();

    public COB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isLocalTest());
    }
}
