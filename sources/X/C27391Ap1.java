package X;

import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.MatchedAddress;
import kotlin.jvm.internal.o;

/* renamed from: X.Ap1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27391Ap1 extends AbstractC65781Prl implements InterfaceC88472Yns<MatchedAddress, Boolean> {
    public static final C27391Ap1 LJLIL = new C27391Ap1();

    public C27391Ap1() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(MatchedAddress matchedAddress) {
        String str;
        MatchedAddress it = matchedAddress;
        o.LJIIIZ(it, "it");
        String str2 = it.zipcodeInfo;
        boolean z = true;
        if (str2 != null && str2.length() != 0 && (str = it.relatedCityInfo) != null && str.length() != 0) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
