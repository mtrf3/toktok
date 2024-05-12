package X;

import com.bytedance.android.livesdkapi.host.IHostAction;

/* renamed from: X.236, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass236 extends AbstractC65781Prl implements InterfaceC65784Pro<FQE> {
    public static final AnonymousClass236 LJLIL = new AnonymousClass236();

    public AnonymousClass236() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final FQE invoke() {
        return ((IHostAction) CN1.LIZ(IHostAction.class)).getHostClientAiService();
    }
}
