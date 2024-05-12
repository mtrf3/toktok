package X;

import com.ss.android.ugc.aweme.commercialize.log.AdLogServiceImpl;
import com.ss.android.ugc.aweme.commercialize.log.IAdLogService;

/* renamed from: X.445, reason: invalid class name */
/* loaded from: classes2.dex */
public final class AnonymousClass445 extends AbstractC65781Prl implements InterfaceC65784Pro<IAdLogService> {
    public static final AnonymousClass445 LJLIL = new AnonymousClass445();

    public AnonymousClass445() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.commercialize.log.IAdLogService, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final IAdLogService invoke() {
        ?? LIZ = C58096Mr6.LIZ(IAdLogService.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C58096Mr6.LLLLLLIL == null) {
            synchronized (IAdLogService.class) {
                if (C58096Mr6.LLLLLLIL == null) {
                    C58096Mr6.LLLLLLIL = new AdLogServiceImpl();
                }
            }
        }
        return C58096Mr6.LLLLLLIL;
    }
}
