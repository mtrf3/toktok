package X;

import com.ss.android.ugc.aweme.setting.services.ICLALanguageService;
import com.ss.android.ugc.trill.setting.ICLALanguageServiceImpl;

/* renamed from: X.91P, reason: invalid class name */
/* loaded from: classes5.dex */
public final class C91P extends AbstractC65781Prl implements InterfaceC65784Pro<ICLALanguageService> {
    public static final C91P LJLIL = new C91P();

    public C91P() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.setting.services.ICLALanguageService] */
    @Override // X.InterfaceC65784Pro
    public final ICLALanguageService invoke() {
        ?? LIZ = C58096Mr6.LIZ(ICLALanguageService.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C58096Mr6.W8 == null) {
            synchronized (ICLALanguageService.class) {
                if (C58096Mr6.W8 == null) {
                    C58096Mr6.W8 = new ICLALanguageServiceImpl();
                }
            }
        }
        return C58096Mr6.W8;
    }
}
