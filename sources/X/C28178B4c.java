package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* renamed from: X.B4c, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28178B4c extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C28178B4c LJLIL = new C28178B4c();

    public C28178B4c() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline());
    }
}
