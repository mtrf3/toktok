package X;

import com.bytedance.ies.sdk.widgets.GroupableElementSpecImpl;
import kotlin.jvm.internal.o;

/* loaded from: classes14.dex */
public final class UMH extends AbstractC65781Prl implements InterfaceC88472Yns<GroupableElementSpecImpl, C76800UCe> {
    public static final UMH LJLIL = new UMH();

    public UMH() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(GroupableElementSpecImpl groupableElementSpecImpl) {
        GroupableElementSpecImpl groupableElement = groupableElementSpecImpl;
        o.LJIIIZ(groupableElement, "$this$groupableElement");
        int i = C12960f6.LIZLLL;
        groupableElement.bindGroups(C47261Igj.LJJIJIIJI(Integer.valueOf(i), Integer.valueOf(C11110c7.LIZLLL), Integer.valueOf(i), Integer.valueOf(C12960f6.LIZ), Integer.valueOf(UMB.LIZ), Integer.valueOf(C11110c7.LJ)));
        groupableElement.addSceneObserver(new C77004UKa());
        return C76800UCe.LIZ;
    }
}