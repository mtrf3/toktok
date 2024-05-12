package X;

import com.ss.android.ugc.aweme.search.ecommerce.config.TiktokEcSearchRegionConfigSettings;
import kotlin.jvm.internal.o;

/* renamed from: X.Jy7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50887Jy7 extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final C50887Jy7 LJLIL = new C50887Jy7();

    public C50887Jy7() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(String it) {
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(TiktokEcSearchRegionConfigSettings.LIZ().disableSugFromMall);
    }
}
