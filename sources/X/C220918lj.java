package X;

import com.ss.android.ugc.aweme.feed.assem.avatar.FeedAvatarLiveAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8lj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C220918lj extends AbstractC65781Prl implements InterfaceC88471Ynr<FeedAvatarLiveAssem, C43I<? extends Boolean>, C76800UCe> {
    public static final C220918lj LJLIL = new C220918lj();

    public C220918lj() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FeedAvatarLiveAssem feedAvatarLiveAssem, C43I<? extends Boolean> c43i) {
        FeedAvatarLiveAssem selectSubscribe = feedAvatarLiveAssem;
        C43I<? extends Boolean> it = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIIZ(it, "it");
        if (((Boolean) it.LIZ).booleanValue()) {
            C53887LCx c53887LCx = selectSubscribe.LLF;
            if (c53887LCx != null) {
                c53887LCx.LJ();
            } else {
                o.LJIJI("avatarBorderViewController");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}