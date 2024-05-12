package X;

import com.ss.android.ugc.aweme.download.component_api.service.IDownloadService;
import com.ss.android.ugc.aweme.download.impl.component_impl.DownloadServiceImpl;

/* renamed from: X.Gbe, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C41850Gbe extends AbstractC65781Prl implements InterfaceC65784Pro<IDownloadService> {
    public static final C41850Gbe LJLIL = new C41850Gbe();

    public C41850Gbe() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final IDownloadService invoke() {
        return DownloadServiceImpl.LIZJ();
    }
}
