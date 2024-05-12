package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Region;
import kotlin.jvm.internal.o;

/* renamed from: X.AeK, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26728AeK extends AbstractC65781Prl implements InterfaceC88472Yns<Region, CharSequence> {
    public static final C26728AeK LJLIL = new C26728AeK();

    public C26728AeK() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(Region region) {
        Region it = region;
        o.LJIIIZ(it, "it");
        if (C78857UxB.LJJJIL(it.code)) {
            return it.code;
        }
        String str = it.name;
        if (str != null) {
            return str;
        }
        return "";
    }
}
