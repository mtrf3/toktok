package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SDH extends AbstractC65781Prl implements InterfaceC88472Yns<Region, CharSequence> {
    public static final SDH LJLIL = new SDH();

    public SDH() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(Region region) {
        Region it = region;
        o.LJIIIZ(it, "it");
        String str = it.name;
        if (str != null) {
            return str;
        }
        return "";
    }
}
