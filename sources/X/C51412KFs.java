package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ab.SearchResultConfig;

/* renamed from: X.KFs, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51412KFs extends AbstractC65781Prl implements InterfaceC65784Pro<SearchResultConfig> {
    public static final C51412KFs LJLIL = new C51412KFs();

    public C51412KFs() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.ab.SearchResultConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final SearchResultConfig invoke() {
        return SettingsManager.LIZLLL().LJIIIIZZ("ecom_search_result_config", SearchResultConfig.class, KFS.LIZ);
    }
}
