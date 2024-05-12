package X;

import com.ss.android.ugc.aweme.settings.NearbyTabConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.LaK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54508LaK extends AbstractC65781Prl implements InterfaceC88472Yns<C54665Lcr, Boolean> {
    public static final C54508LaK LJLIL = new C54508LaK();

    public C54508LaK() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C54665Lcr c54665Lcr) {
        boolean z;
        C54665Lcr it = c54665Lcr;
        o.LJIIIZ(it, "it");
        if (it.LJLILLLLZI && !(it.getLoadMoreState() instanceof C72922tc) && NearbyTabConfig.LJFF()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
