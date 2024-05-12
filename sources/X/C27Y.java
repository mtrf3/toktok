package X;

import com.bytedance.android.livesdkapi.host.IHostAction;

/* renamed from: X.27Y, reason: invalid class name */
/* loaded from: classes.dex */
public final class C27Y extends AbstractC65781Prl implements InterfaceC65784Pro<FQE> {
    public static final C27Y LJLIL = new C27Y();

    public C27Y() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final FQE invoke() {
        return ((IHostAction) CN1.LIZ(IHostAction.class)).getHostClientAiService();
    }
}
