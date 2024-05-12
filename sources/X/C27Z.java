package X;

import com.bytedance.android.livesdkapi.host.IHostAction;

/* renamed from: X.27Z, reason: invalid class name */
/* loaded from: classes.dex */
public final class C27Z extends AbstractC65781Prl implements InterfaceC65784Pro<FQE> {
    public static final C27Z LJLIL = new C27Z();

    public C27Z() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final FQE invoke() {
        return ((IHostAction) CN1.LIZ(IHostAction.class)).getHostClientAiService();
    }
}
