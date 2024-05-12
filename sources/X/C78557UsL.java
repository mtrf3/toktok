package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* renamed from: X.UsL, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78557UsL extends AbstractC65781Prl implements InterfaceC65784Pro<InterfaceC78558UsM> {
    public static final C78557UsL LJLIL = new C78557UsL();

    public C78557UsL() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.UsM, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final InterfaceC78558UsM invoke() {
        return ServiceManager.get().getService(InterfaceC78558UsM.class);
    }
}
