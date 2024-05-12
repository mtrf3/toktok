package X;

import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import kotlin.jvm.internal.o;

/* renamed from: X.ArF, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27529ArF extends AbstractC65781Prl implements InterfaceC88472Yns<SaleProp, CharSequence> {
    public static final C27529ArF LJLIL = new C27529ArF();

    public C27529ArF() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(SaleProp saleProp) {
        SaleProp it = saleProp;
        o.LJIIIZ(it, "it");
        return String.valueOf(it.propName);
    }
}
