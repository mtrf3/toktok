package X;

import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.search.core.repo.ISearchWidgetApi;

/* renamed from: X.2wF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74552wF extends AbstractC65781Prl implements InterfaceC65784Pro<ISearchWidgetApi> {
    public static final C74552wF LJLIL = new C74552wF();

    public C74552wF() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.ss.android.ugc.aweme.search.core.repo.ISearchWidgetApi, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final ISearchWidgetApi invoke() {
        IRetrofitFactory LIZLLL = RetrofitFactory.LIZLLL();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("https://");
        LIZ.append(EF7.LJI.LIZ);
        return LIZLLL.create(X1D.LIZIZ(LIZ)).create(ISearchWidgetApi.class);
    }
}
