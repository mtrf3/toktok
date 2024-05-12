package X;

import com.bytedance.lighten.core.config.ILightenConfigOutService;
import com.ss.android.ugc.aweme.image.LightenConfigOutService;

/* renamed from: X.Mry, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58150Mry extends AbstractC65781Prl implements InterfaceC65784Pro<ILightenConfigOutService> {
    public static final C58150Mry LJLIL = new C58150Mry();

    public C58150Mry() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.lighten.core.config.ILightenConfigOutService] */
    @Override // X.InterfaceC65784Pro
    public final ILightenConfigOutService invoke() {
        ?? LIZ = C58096Mr6.LIZ(ILightenConfigOutService.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C58096Mr6.n1 == null) {
            synchronized (ILightenConfigOutService.class) {
                if (C58096Mr6.n1 == null) {
                    C58096Mr6.n1 = new LightenConfigOutService();
                }
            }
        }
        return C58096Mr6.n1;
    }
}
