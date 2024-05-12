package X;

import com.bytedance.android.livesdk.livesetting.watchlive.LandscapeCoverReverseExperiment;
import com.bytedance.ies.sdk.widgets.ElementSpecImplKt;
import com.bytedance.ies.sdk.widgets.GroupableElementSpecImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UL3 extends AbstractC65781Prl implements InterfaceC88472Yns<GroupableElementSpecImpl, C76800UCe> {
    public static final UL3 LJLIL = new UL3();

    public UL3() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(GroupableElementSpecImpl groupableElementSpecImpl) {
        GroupableElementSpecImpl groupableElement = groupableElementSpecImpl;
        o.LJIIIZ(groupableElement, "$this$groupableElement");
        if (LandscapeCoverReverseExperiment.INSTANCE.isDefaultGroup()) {
            groupableElement.bindGroup(C77019UKp.LIZIZ);
        }
        ElementSpecImplKt.onAttach(groupableElement, UL6.LJLIL);
        return C76800UCe.LIZ;
    }
}
