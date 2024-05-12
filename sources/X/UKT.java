package X;

import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.GroupableElementSpecImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UKT extends AbstractC65781Prl implements InterfaceC88472Yns<GroupableElementSpecImpl, C76800UCe> {
    public static final UKT LJLIL = new UKT();

    public UKT() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(GroupableElementSpecImpl groupableElementSpecImpl) {
        GroupableElementSpecImpl groupableElement = groupableElementSpecImpl;
        o.LJIIIZ(groupableElement, "$this$groupableElement");
        groupableElement.bindGroups(C47261Igj.LJJIJ(Integer.valueOf(C12960f6.LIZ)));
        ElementSpecImplKt.onAttach(groupableElement, UKS.LJLIL);
        return C76800UCe.LIZ;
    }
}
