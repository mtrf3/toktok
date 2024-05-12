package X;

import com.bytedance.ies.ugc.appcontext.AppBuildConfig;
import com.ss.android.ugc.AwemeAppBuildConfig;

/* renamed from: X.E5g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35852E5g extends AbstractC65781Prl implements InterfaceC65784Pro<AppBuildConfig> {
    public static final C35852E5g LJLIL = new C35852E5g();

    public C35852E5g() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.ies.ugc.appcontext.AppBuildConfig] */
    @Override // X.InterfaceC65784Pro
    public final AppBuildConfig invoke() {
        ?? LIZ = C58096Mr6.LIZ(AppBuildConfig.class, false);
        if (LIZ != 0) {
            return LIZ;
        }
        if (C58096Mr6.LJJJJZ == null) {
            synchronized (AppBuildConfig.class) {
                if (C58096Mr6.LJJJJZ == null) {
                    C58096Mr6.LJJJJZ = new AwemeAppBuildConfig();
                }
            }
        }
        return C58096Mr6.LJJJJZ;
    }
}
