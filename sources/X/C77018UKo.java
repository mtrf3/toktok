package X;

import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.GroupableElementSpecImpl;
import kotlin.jvm.internal.o;

/* renamed from: X.UKo, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C77018UKo extends AbstractC65781Prl implements InterfaceC88472Yns<GroupableElementSpecImpl, C76800UCe> {
    public static final C77018UKo LJLIL = new C77018UKo();

    public C77018UKo() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(GroupableElementSpecImpl groupableElementSpecImpl) {
        GroupableElementSpecImpl groupableElement = groupableElementSpecImpl;
        o.LJIIIZ(groupableElement, "$this$groupableElement");
        groupableElement.bindGroup(C77019UKp.LIZLLL);
        ElementSpecImplKt.onAttach(groupableElement, UKR.LJLIL);
        return C76800UCe.LIZ;
    }
}
