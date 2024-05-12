package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.internal.o;

/* renamed from: X.7CX, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7CX extends AbstractC65781Prl implements InterfaceC88472Yns<C253579xJ, Boolean> {
    public static final C7CX LJLIL = new C7CX();

    public C7CX() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C253579xJ it) {
        boolean z;
        o.LJIIIZ(it, "it");
        boolean z2 = false;
        try {
            SettingsManager.LIZLLL().getClass();
            z = SettingsManager.LIZ("enable_income_plus_reauth", false);
        } catch (Throwable unused) {
            z = false;
        }
        if (z) {
            HG3.LJIIL();
            if (HG3.LJLJL.LJFF().getCurUser().getAccountType() == 2) {
                z2 = true;
            }
        }
        return Boolean.valueOf(z2);
    }
}
