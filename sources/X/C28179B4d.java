package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* renamed from: X.B4d, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28179B4d extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C28179B4d LJLIL = new C28179B4d();

    public C28179B4d() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).isOffline());
    }
}
