package X;

import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarSocialPublishAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8Tx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C212058Tx extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedAvatarSocialPublishAssem, C43I<? extends Integer>, C76800UCe> {
    public static final C212058Tx LJLIL = new C212058Tx();

    public C212058Tx() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedAvatarSocialPublishAssem feedAvatarSocialPublishAssem, C43I<? extends Integer> c43i) {
        FeedAvatarSocialPublishAssem selectSubscribe = feedAvatarSocialPublishAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c43i != null) {
            boolean z = true;
            selectSubscribe.LLFFF = true;
            C53691L5j c53691L5j = selectSubscribe.LLF;
            if (c53691L5j != null) {
                if (c53691L5j.getMode() != EnumC53695L5n.NONE) {
                    InterfaceC100393wp interfaceC100393wp = (InterfaceC100393wp) selectSubscribe.LLD.getValue();
                    if (interfaceC100393wp != null) {
                        C53691L5j c53691L5j2 = selectSubscribe.LLF;
                        if (c53691L5j2 != null) {
                            interfaceC100393wp.LJFF(c53691L5j2.getMode());
                        } else {
                            o.LJIJI("socPubAvatarFrameLayout");
                            throw null;
                        }
                    }
                } else {
                    z = false;
                }
                selectSubscribe.LLFII = z;
            } else {
                o.LJIJI("socPubAvatarFrameLayout");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}
