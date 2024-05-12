package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WjU, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83104WjU extends AbstractC65781Prl implements InterfaceC88471Ynr<ComposerBeauty, InterfaceC88472Yns<? super ComposerBeauty, ? extends C76800UCe>, C76800UCe> {
    public static final C83104WjU LJLIL = new C83104WjU();

    public C83104WjU() {
        super(2);
    }

    public final void LIZ(ComposerBeauty composerBeauty, InterfaceC88472Yns<? super ComposerBeauty, C76800UCe> action) {
        o.LJIIIZ(composerBeauty, "composerBeauty");
        o.LJIIIZ(action, "action");
        if (composerBeauty.isCollectionType()) {
            List<ComposerBeauty> childList = composerBeauty.getChildList();
            if (childList != null) {
                for (ComposerBeauty composerBeauty2 : childList) {
                    if (composerBeauty2.getSelected()) {
                        if (composerBeauty2 != null) {
                            action.invoke(composerBeauty2);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            return;
        }
        action.invoke(composerBeauty);
    }

    @Override // X.InterfaceC88471Ynr
    public final /* bridge */ /* synthetic */ C76800UCe invoke(ComposerBeauty composerBeauty, InterfaceC88472Yns<? super ComposerBeauty, ? extends C76800UCe> interfaceC88472Yns) {
        LIZ(composerBeauty, interfaceC88472Yns);
        return C76800UCe.LIZ;
    }
}
