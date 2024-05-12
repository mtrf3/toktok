package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* renamed from: X.C8k, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30838C8k extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C30838C8k LJLIL = new C30838C8k();

    public C30838C8k() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
        if (iHostAppContext != null) {
            z = iHostAppContext.isOffline();
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
