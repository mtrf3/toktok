package X;

import com.ss.android.ugc.aweme.offlinemode.viewmodel.OfflineModeListVM;

/* renamed from: X.9SE, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C9SE extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C9SE LJLIL = new C9SE();

    public C9SE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("offline_mode_video_list_vm_key");
        LIZ.append(OfflineModeListVM.LJLJI);
        return X1D.LIZIZ(LIZ);
    }
}
