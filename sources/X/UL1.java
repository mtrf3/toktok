package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LiveUnionPraiseGiftInToolBarSetting;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.GroupableElementSpecImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UL1 extends AbstractC65781Prl implements InterfaceC88472Yns<GroupableElementSpecImpl, C76800UCe> {
    public static final UL1 LJLIL = new UL1();

    public UL1() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(GroupableElementSpecImpl groupableElementSpecImpl) {
        GroupableElementSpecImpl groupableElement = groupableElementSpecImpl;
        o.LJIIIZ(groupableElement, "$this$groupableElement");
        if (LiveUnionPraiseGiftInToolBarSetting.isEnable()) {
            groupableElement.bindGroups(C77019UKp.LJFF);
        } else {
            groupableElement.bindGroup(C77019UKp.LIZIZ);
        }
        ElementSpecImplKt.onAttach(groupableElement, UL5.LJLIL);
        return C76800UCe.LIZ;
    }
}
