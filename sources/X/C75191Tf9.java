package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* renamed from: X.Tf9, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75191Tf9 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C75191Tf9 LJLIL = new C75191Tf9();

    public C75191Tf9() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).liveId());
    }
}
