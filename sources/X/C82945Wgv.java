package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.tools.beauty.data.BeautySyncData;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* renamed from: X.Wgv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C82945Wgv extends AbstractC65781Prl implements InterfaceC88472Yns<ComposerBeauty, C76800UCe> {
    public static final C82945Wgv LJLIL = new C82945Wgv();

    public C82945Wgv() {
        super(1);
    }

    public final void LIZ(ComposerBeauty beauty) {
        o.LJIIIZ(beauty, "beauty");
        ((ArrayList) C82944Wgu.LIZIZ).add(new BeautySyncData(beauty.getEffect().getEffectId(), beauty.getEffect().getResourceId(), beauty.getCategoryId(), beauty.getParentId()));
    }

    @Override // X.InterfaceC88472Yns
    public final /* bridge */ /* synthetic */ C76800UCe invoke(ComposerBeauty composerBeauty) {
        LIZ(composerBeauty);
        return C76800UCe.LIZ;
    }
}
