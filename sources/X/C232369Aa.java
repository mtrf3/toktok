package X;

import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.internal.o;

/* renamed from: X.9Aa, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C232369Aa extends AbstractC65781Prl implements InterfaceC88472Yns<C253379wz, Boolean> {
    public static final C232369Aa LJLIL = new C232369Aa();

    public C232369Aa() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C253379wz it) {
        o.LJIIIZ(it, "it");
        SettingsManager.LIZLLL().getClass();
        return Boolean.valueOf(!TextUtils.isEmpty(SettingsManager.LJI("security_center", "")));
    }
}
