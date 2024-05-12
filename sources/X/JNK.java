package X;

import com.ss.android.ugc.aweme.search.ecommerce.EcomSearchServiceImpl;
import com.ss.android.ugc.aweme.search.ecommerce.IEcomSearchService;

/* loaded from: classes9.dex */
public final class JNK extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final JNK LJLIL = new JNK();

    public JNK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        IEcomSearchService LJJJJZI = EcomSearchServiceImpl.LJJJJZI();
        if (LJJJJZI != null) {
            i = LJJJJZI.LJJJJLI();
        } else {
            i = 0;
        }
        return Integer.valueOf(i);
    }
}
