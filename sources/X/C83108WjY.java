package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import kotlin.jvm.internal.o;

/* renamed from: X.WjY, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83108WjY extends AbstractC65781Prl implements InterfaceC88472Yns<ComposerBeauty, C76800UCe> {
    public static final C83108WjY LJLIL = new C83108WjY();

    public C83108WjY() {
        super(1);
    }

    public final void LIZ(ComposerBeauty clearBeautyState) {
        o.LJIIIZ(clearBeautyState, "$this$clearBeautyState");
        clearBeautyState.setSelected(false);
        clearBeautyState.setShowDot(false);
        clearBeautyState.setAdd2Nodes(false);
        clearBeautyState.setProgressValue(0);
        clearBeautyState.setEnable(true);
    }

    @Override // X.InterfaceC88472Yns
    public final /* bridge */ /* synthetic */ C76800UCe invoke(ComposerBeauty composerBeauty) {
        LIZ(composerBeauty);
        return C76800UCe.LIZ;
    }
}
