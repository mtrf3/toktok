package X;

import com.ss.android.ugc.aweme.paidcontent.manageseries.notification.SeriesVideoUploadServiceImpl;
import com.ss.android.ugc.aweme.service.ISeriesVideoUploadService;

/* renamed from: X.4lE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118684lE extends AbstractC65781Prl implements InterfaceC65784Pro<ISeriesVideoUploadService> {
    public static final C118684lE LJLIL = new C118684lE();

    public C118684lE() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.service.ISeriesVideoUploadService, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final ISeriesVideoUploadService invoke() {
        ?? LIZ = C58096Mr6.LIZ(ISeriesVideoUploadService.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C58096Mr6.N3 == null) {
            synchronized (ISeriesVideoUploadService.class) {
                if (C58096Mr6.N3 == null) {
                    C58096Mr6.N3 = new SeriesVideoUploadServiceImpl();
                }
            }
        }
        return C58096Mr6.N3;
    }
}
