package X;

import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.GroupableElementSpecImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UK7 extends AbstractC65781Prl implements InterfaceC88472Yns<GroupableElementSpecImpl, C76800UCe> {
    public static final UK7 LJLIL = new UK7();

    public UK7() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(GroupableElementSpecImpl groupableElementSpecImpl) {
        GroupableElementSpecImpl groupableElement = groupableElementSpecImpl;
        o.LJIIIZ(groupableElement, "$this$groupableElement");
        groupableElement.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(C12960f6.LIZ), Integer.valueOf(C11110c7.LJII)));
        ElementSpecImplKt.onAttach(groupableElement, ULP.LJLIL);
        return C76800UCe.LIZ;
    }
}
