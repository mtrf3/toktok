package X;

import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.ies.sdk.widgets.GroupableElementSpecImpl;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UKV extends AbstractC65781Prl implements InterfaceC88472Yns<GroupableElementSpecImpl, C76800UCe> {
    public static final UKV LJLIL = new UKV();

    public UKV() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(GroupableElementSpecImpl groupableElementSpecImpl) {
        List<Integer> LJJIJ;
        GroupableElementSpecImpl groupableElement = groupableElementSpecImpl;
        o.LJIIIZ(groupableElement, "$this$groupableElement");
        if (!((IProgrammedLiveService) CN1.LIZ(IProgrammedLiveService.class)).lj()) {
            LJJIJ = C47261Igj.LJJIJIIJI(Integer.valueOf(C12960f6.LIZ), Integer.valueOf(UKC.LIZ), Integer.valueOf(UKC.LIZJ));
        } else {
            LJJIJ = C47261Igj.LJJIJ(Integer.valueOf(C12960f6.LIZ));
        }
        groupableElement.bindGroups(LJJIJ);
        groupableElement.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(C12960f6.LIZLLL), Integer.valueOf(C11110c7.LJII)));
        return C76800UCe.LIZ;
    }
}
