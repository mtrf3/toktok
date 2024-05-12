package X;

import com.ss.android.ugc.aweme.feed.assem.friendeffect.FriendEffectPromptTrigger;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.8Wc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212628Wc extends AbstractC65781Prl implements InterfaceC88471Ynr<FriendEffectPromptTrigger, C43I<? extends Integer>, C76800UCe> {
    public static final C212628Wc LJLIL = new C212628Wc();

    public C212628Wc() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FriendEffectPromptTrigger friendEffectPromptTrigger, C43I<? extends Integer> c43i) {
        FriendEffectPromptTrigger selectSubscribe = friendEffectPromptTrigger;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            String LIZJ = C212688Wi.LIZJ(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme());
            if (LIZJ == null) {
                LIZJ = "";
            }
            if (C212638Wd.LIZIZ(C212638Wd.LIZ, LIZJ)) {
                C212648We.LIZIZ().storeLong("transform_total_count", C212648We.LIZIZ().getLong("transform_total_count", 0L) + 1);
                long j = C212648We.LIZIZ().getLong(C212648We.LIZ(LIZJ, "effect_%s_transform_count"), 0L) + 1;
                C212648We.LIZIZ().storeLong(C212648We.LIZ(LIZJ, "effect_%s_transform_count"), j);
                C212688Wi.LJ(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme(), ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).mEventType);
            }
        }
        return C76800UCe.LIZ;
    }
}
