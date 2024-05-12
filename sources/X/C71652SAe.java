package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import kotlin.jvm.internal.o;

/* renamed from: X.SAe, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71652SAe extends AbstractC65781Prl implements InterfaceC88472Yns<Region, CharSequence> {
    public static final C71652SAe LJLIL = new C71652SAe();

    public C71652SAe() {
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
