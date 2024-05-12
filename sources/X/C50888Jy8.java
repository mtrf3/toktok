package X;

import com.ss.android.ugc.aweme.search.ecommerce.config.TiktokEcSearchRegionConfigSettings;
import kotlin.jvm.internal.o;

/* renamed from: X.Jy8, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50888Jy8 extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final C50888Jy8 LJLIL = new C50888Jy8();

    public C50888Jy8() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(String it) {
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(TiktokEcSearchRegionConfigSettings.LIZ().disableSuggestGuideFromMall);
    }
}
