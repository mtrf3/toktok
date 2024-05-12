package X;

import com.ss.android.ugc.aweme.app.host.AwemeHostApplication;
import kotlin.jvm.internal.o;

/* renamed from: X.Dp4, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C35038Dp4 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C35038Dp4 LJLIL = new C35038Dp4();

    public C35038Dp4() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        AwemeHostApplication LIZ = FKM.LIZ();
        o.LJI(LIZ);
        return Boolean.valueOf(C35820E4a.LIZIZ(LIZ, "optimize_cold_boot_hook_app_context", true));
    }
}
