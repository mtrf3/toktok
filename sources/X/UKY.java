package X;

import com.bytedance.ies.sdk.widgets.GroupableElementSpecImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UKY extends AbstractC65781Prl implements InterfaceC88472Yns<GroupableElementSpecImpl, C76800UCe> {
    public static final UKY LJLIL = new UKY();

    public UKY() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(GroupableElementSpecImpl groupableElementSpecImpl) {
        GroupableElementSpecImpl groupableElement = groupableElementSpecImpl;
        o.LJIIIZ(groupableElement, "$this$groupableElement");
        groupableElement.bindGroups(C47261Igj.LJJIJ(Integer.valueOf(C12960f6.LIZ)));
        groupableElement.addSceneObserver(new C77027UKx());
        return C76800UCe.LIZ;
    }
}
