package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.internal.o;

/* renamed from: X.EjA, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37220EjA extends AbstractC65781Prl implements InterfaceC65784Pro<String[]> {
    public static final C37220EjA LJLIL = new C37220EjA();

    public C37220EjA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String[] invoke() {
        try {
            SettingsManager.LIZLLL().getClass();
            Object LJII = SettingsManager.LJII("rrq_path_white_list", String[].class);
            o.LJIIIIZZ(LJII, "{\n        SettingsManage…ttings::class.java)\n    }");
            return (String[]) LJII;
        } catch (Throwable unused) {
            return new String[]{"/aweme/v1/aweme/stats/"};
        }
    }
}
