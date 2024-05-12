package X;

import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.WjV, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83105WjV extends AbstractC65781Prl implements InterfaceC88471Ynr<List<? extends ComposerBeauty>, InterfaceC88472Yns<? super ComposerBeauty, ? extends C76800UCe>, C76800UCe> {
    public static final C83105WjV LJLIL = new C83105WjV();

    public C83105WjV() {
        super(2);
    }

    public final void LIZ(InterfaceC88472Yns action, List list) {
        o.LJIIIZ(action, "action");
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ComposerBeauty composerBeauty = (ComposerBeauty) it.next();
                if (composerBeauty.isCollectionType()) {
                    List<ComposerBeauty> childList = composerBeauty.getChildList();
                    if (childList != null) {
                        Iterator<ComposerBeauty> it2 = childList.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                ComposerBeauty next = it2.next();
                                ComposerBeauty composerBeauty2 = next;
                                if (composerBeauty2.getSelected() && !composerBeauty2.getExtra().isNone()) {
                                    if (next != null) {
                                        action.invoke(next);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    action.invoke(composerBeauty);
                }
            }
        }
    }

    @Override // X.InterfaceC88471Ynr
    public final /* bridge */ /* synthetic */ C76800UCe invoke(List<? extends ComposerBeauty> list, InterfaceC88472Yns<? super ComposerBeauty, ? extends C76800UCe> interfaceC88472Yns) {
        LIZ(interfaceC88472Yns, list);
        return C76800UCe.LIZ;
    }
}
