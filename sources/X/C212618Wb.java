package X;

import com.ss.android.ugc.aweme.feed.assem.friendeffect.FriendEffectPromptTrigger;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.8Wb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212618Wb extends AbstractC65781Prl implements InterfaceC88471Ynr<FriendEffectPromptTrigger, C43I<? extends C195357lb>, C76800UCe> {
    public static final C212618Wb LJLIL = new C212618Wb();

    public C212618Wb() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FriendEffectPromptTrigger friendEffectPromptTrigger, C43I<? extends C195357lb> c43i) {
        FriendEffectPromptTrigger selectSubscribe = friendEffectPromptTrigger;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            String LIZJ = C212688Wi.LIZJ(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme());
            if (LIZJ == null) {
                LIZJ = "";
            }
            if (!C212638Wd.LIZIZ(C212638Wd.LIZ, LIZJ)) {
                selectSubscribe.l4(((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme(), false);
            }
        }
        return C76800UCe.LIZ;
    }
}
