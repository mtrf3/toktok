package X;

import com.ss.android.ugc.aweme.feed.landscape.LandscapeInteractEntrancesContainer;
import com.ss.android.ugc.feed.platform.cell.interact.InteractBizTopAreaAttachAbility;
import kotlin.jvm.internal.o;

/* renamed from: X.8fw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C217328fw extends AbstractC65781Prl implements InterfaceC88471Ynr<LandscapeInteractEntrancesContainer, C43I<? extends C195357lb>, C76800UCe> {
    public static final C217328fw LJLIL = new C217328fw();

    public C217328fw() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(LandscapeInteractEntrancesContainer landscapeInteractEntrancesContainer, C43I<? extends C195357lb> c43i) {
        InteractBizTopAreaAttachAbility p4;
        LandscapeInteractEntrancesContainer selectSubscribe = landscapeInteractEntrancesContainer;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null && (p4 = selectSubscribe.p4()) != null) {
            p4.rB(selectSubscribe.LLIILZL);
        }
        return C76800UCe.LIZ;
    }
}
