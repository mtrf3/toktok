package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* renamed from: X.22N, reason: invalid class name */
/* loaded from: classes.dex */
public final class C22N extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C22N LJLIL = new C22N();

    public C22N() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        return String.valueOf(Math.abs(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).getServerDeviceId().hashCode()));
    }
}
