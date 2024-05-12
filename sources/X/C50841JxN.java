package X;

import com.ss.android.ugc.aweme.search.ecommerce.config.TiktokEcSearchRegionConfigSettings;
import kotlin.jvm.internal.o;

/* renamed from: X.JxN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50841JxN extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final C50841JxN LJLIL = new C50841JxN();

    public C50841JxN() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(String it) {
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(TiktokEcSearchRegionConfigSettings.LIZ().specifyHistoryFromMall);
    }
}
