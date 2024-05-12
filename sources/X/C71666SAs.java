package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import kotlin.jvm.internal.o;

/* renamed from: X.SAs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71666SAs extends AbstractC65781Prl implements InterfaceC88472Yns<Region, CharSequence> {
    public static final C71666SAs LJLIL = new C71666SAs();

    public C71666SAs() {
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
