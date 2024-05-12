package X;

import com.ss.android.ugc.aweme.config.SearchSecurityControlConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.JuQ, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50658JuQ extends AbstractC65781Prl implements InterfaceC88472Yns<String, Boolean> {
    public static final C50658JuQ LJLIL = new C50658JuQ();

    public C50658JuQ() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(String it) {
        o.LJIIIZ(it, "it");
        SearchSecurityControlConfig.LIZ.getClass();
        return Boolean.valueOf(SearchSecurityControlConfig.LIZ().disableSug);
    }
}
