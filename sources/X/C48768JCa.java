package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.o;

/* renamed from: X.JCa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C48768JCa extends AbstractC65781Prl implements InterfaceC88472Yns<Aweme, Boolean> {
    public static final C48768JCa LJLIL = new C48768JCa();

    public C48768JCa() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(Aweme aweme) {
        Aweme it = aweme;
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(it.getIsSubAweme());
    }
}
