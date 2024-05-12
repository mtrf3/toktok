package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import kotlin.jvm.internal.o;

/* renamed from: X.WkS, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83164WkS extends AbstractC65781Prl implements InterfaceC88472Yns<ComposerBeauty, CharSequence> {
    public static final C83164WkS LJLIL = new C83164WkS();

    public C83164WkS() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final CharSequence invoke(ComposerBeauty composerBeauty) {
        ComposerBeauty it = composerBeauty;
        o.LJIIIZ(it, "it");
        return it.getEffect().getEffectId();
    }
}
