package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import kotlin.jvm.internal.o;

/* renamed from: X.WkR, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83163WkR extends AbstractC65781Prl implements InterfaceC88472Yns<ComposerBeauty, CharSequence> {
    public static final C83163WkR LJLIL = new C83163WkR();

    public C83163WkR() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(ComposerBeauty composerBeauty) {
        ComposerBeauty it = composerBeauty;
        o.LJIIIZ(it, "it");
        return it.getEffect().getName();
    }
}
