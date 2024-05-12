package X;

import com.ss.android.ugc.aweme.creatortools.creatorplus.service.CreatorToolServiceImpl;
import com.ss.android.ugc.aweme.setting.services.ICreatorToolService;

/* renamed from: X.9j9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C244799j9 extends AbstractC65781Prl implements InterfaceC65784Pro<ICreatorToolService> {
    public static final C244799j9 LJLIL = new C244799j9();

    public C244799j9() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.setting.services.ICreatorToolService] */
    @Override // X.InterfaceC65784Pro
    public final ICreatorToolService invoke() {
        ?? LIZ = C58096Mr6.LIZ(ICreatorToolService.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C58096Mr6.o == null) {
            synchronized (ICreatorToolService.class) {
                if (C58096Mr6.o == null) {
                    C58096Mr6.o = new CreatorToolServiceImpl();
                }
            }
        }
        return C58096Mr6.o;
    }
}
