package X;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.ugc.aweme.im.sdk.dmfilter.data.api.FilterKeywordsService;

/* renamed from: X.2wH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74572wH extends AbstractC65781Prl implements InterfaceC65784Pro<FilterKeywordsService> {
    public static final C74572wH LJLIL = new C74572wH();

    public C74572wH() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.ss.android.ugc.aweme.im.sdk.dmfilter.data.api.FilterKeywordsService] */
    @Override // X.InterfaceC65784Pro
    public final FilterKeywordsService invoke() {
        return RetrofitFactory.LIZLLL().create(C30Y.LIZIZ).create(FilterKeywordsService.class);
    }
}
