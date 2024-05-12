package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import kotlin.jvm.internal.o;

/* renamed from: X.WkT, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83165WkT extends AbstractC65781Prl implements InterfaceC88472Yns<ComposerBeauty, CharSequence> {
    public static final C83165WkT LJLIL = new C83165WkT();

    public C83165WkT() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(ComposerBeauty composerBeauty) {
        ComposerBeauty it = composerBeauty;
        o.LJIIIZ(it, "it");
        return it.getEffect().getId();
    }
}
