package X;

import com.ss.android.ugc.aweme.comment.service.KeyboardServiceImpl;
import com.ss.android.ugc.aweme.comment.services.IKeyboardService;

/* renamed from: X.722, reason: invalid class name */
/* loaded from: classes4.dex */
public final class AnonymousClass722 extends AbstractC65781Prl implements InterfaceC65784Pro<IKeyboardService> {
    public static final AnonymousClass722 LJLIL = new AnonymousClass722();

    public AnonymousClass722() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.comment.services.IKeyboardService, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final IKeyboardService invoke() {
        ?? LIZ = C58096Mr6.LIZ(IKeyboardService.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C58096Mr6.LLJZ == null) {
            synchronized (IKeyboardService.class) {
                if (C58096Mr6.LLJZ == null) {
                    C58096Mr6.LLJZ = new KeyboardServiceImpl();
                }
            }
        }
        return C58096Mr6.LLJZ;
    }
}
