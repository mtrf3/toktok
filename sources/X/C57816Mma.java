package X;

import com.ss.android.ugc.aweme.relation.model.RecUser;
import com.ss.android.ugc.aweme.relation.recuser.inbox.UserCardAdapterWidget;
import kotlin.jvm.internal.o;

/* renamed from: X.Mma, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C57816Mma extends TBS implements InterfaceC88472Yns<RecUser, EnumC112694bZ> {
    public C57816Mma(UserCardAdapterWidget userCardAdapterWidget) {
        super(1, userCardAdapterWidget, UserCardAdapterWidget.class, "buildMutualText", "buildMutualText(Lcom/ss/android/ugc/aweme/relation/model/RecUser;)Lcom/ss/android/ugc/aweme/relation/follow/config/MutualFollowText;", 0);
    }

    @Override // X.InterfaceC88472Yns
    public final EnumC112694bZ invoke(RecUser p0) {
        o.LJIIIZ(p0, "p0");
        this.receiver.getClass();
        return EnumC112694bZ.MESSAGE_ICE_BREAKING;
    }
}
