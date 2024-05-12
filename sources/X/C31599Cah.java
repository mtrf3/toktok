package X;

import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* renamed from: X.Cah, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31599Cah extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C31599Cah LJLIL = new C31599Cah();

    public C31599Cah() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(((IHostAppContext) CN1.LIZ(IHostAppContext.class)).liveId());
    }
}
