package X;

import com.ss.android.elearning.lingo.roma.RomaHostService;
import com.ss.android.elearning.lingo.roma.RomaServiceImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.Mra, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58126Mra implements RomaHostService {
    public static final C58126Mra LIZIZ = new C58126Mra();
    public final /* synthetic */ RomaHostService LIZ;

    @Override // com.ss.android.elearning.lingo.roma.RomaHostService
    public final String k7(String url) {
        o.LJIIIZ(url, "url");
        return this.LIZ.k7(url);
    }

    public C58126Mra() {
        RomaHostService romaHostService;
        Object LIZ = C58096Mr6.LIZ(RomaHostService.class, false);
        if (LIZ != null) {
            romaHostService = (RomaHostService) LIZ;
        } else {
            if (C58096Mr6.LJJJJIZL == null) {
                synchronized (RomaHostService.class) {
                    if (C58096Mr6.LJJJJIZL == null) {
                        C58096Mr6.LJJJJIZL = new RomaServiceImpl();
                    }
                }
            }
            romaHostService = C58096Mr6.LJJJJIZL;
        }
        this.LIZ = romaHostService;
    }
}
