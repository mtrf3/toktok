package X;

import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Rule;
import kotlin.jvm.internal.o;

/* renamed from: X.AmX, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27237AmX extends AbstractC65781Prl implements InterfaceC88472Yns<Rule, Boolean> {
    public static final C27237AmX LJLIL = new C27237AmX();

    public C27237AmX() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Rule rule) {
        boolean z;
        Rule it = rule;
        o.LJIIIZ(it, "it");
        String str = it.error;
        if (str == null || ujb.o.LJJJJJL(str)) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
