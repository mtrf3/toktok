package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.LkK, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C55128LkK extends AbstractC65781Prl implements InterfaceC88472Yns<C55127LkJ, Boolean> {
    public static final C55128LkK LJLIL = new C55128LkK();

    public C55128LkK() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(C55127LkJ c55127LkJ) {
        Aweme aweme;
        C55127LkJ it = c55127LkJ;
        o.LJIIIZ(it, "it");
        boolean z = false;
        if (((Boolean) C52693Km9.LIZ.getValue()).booleanValue() && (aweme = it.LIZ) != null && aweme.isAd() && aweme.getAwemeType() == 0 && o.LJ("homepage_hot", it.LIZJ)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
