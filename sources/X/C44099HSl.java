package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import kotlin.jvm.internal.o;

/* renamed from: X.HSl, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44099HSl extends AbstractC65781Prl implements InterfaceC88472Yns<AnchorCommonStruct, C76800UCe> {
    public static final C44099HSl LJLIL = new C44099HSl();

    public C44099HSl() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(AnchorCommonStruct anchorCommonStruct) {
        AnchorCommonStruct withAnchor = anchorCommonStruct;
        o.LJIIIZ(withAnchor, "$this$withAnchor");
        C38499F9b.LIZ.LIZIZ().preloadMiniApp(withAnchor.getSchema());
        return C76800UCe.LIZ;
    }
}
