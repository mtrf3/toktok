package X;

import com.ss.android.ugc.aweme.commercialize.impl.CommerceServiceImpl;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;

/* renamed from: X.Mse, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58192Mse extends AbstractC65781Prl implements InterfaceC65784Pro<ICommerceService> {
    public static final C58192Mse INSTANCE = new C58192Mse();

    public C58192Mse() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final ICommerceService invoke() {
        return CommerceServiceImpl.LIZJ();
    }
}
