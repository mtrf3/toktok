package X;

import Y.ACallableS2S1000000_3;
import com.ss.android.ugc.aweme.feed.assem.friendstab.FriendsTabEducateButtonAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.8tX, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C225758tX extends AbstractC65781Prl implements InterfaceC88471Ynr<FriendsTabEducateButtonAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final C225758tX LJLIL = new C225758tX();

    public C225758tX() {
        super(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(FriendsTabEducateButtonAssem friendsTabEducateButtonAssem, C43I<? extends C195357lb> c43i) {
        C195357lb c195357lb;
        FriendsTabEducateButtonAssem selectSubscribe = friendsTabEducateButtonAssem;
        C43I<? extends C195357lb> c43i2 = c43i;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        selectSubscribe.LLII = false;
        selectSubscribe.LLIIII = false;
        selectSubscribe.LLIIIILZ = "";
        if (selectSubscribe.Y3().getVisibility() != 8 && c43i2 != null && (c195357lb = (C195357lb) c43i2.LIZ) != null) {
            if (c195357lb.LIZIZ) {
                C10K.LIZJ(new ACallableS2S1000000_3("draw_up", 0));
            } else {
                C10K.LIZJ(new ACallableS2S1000000_3("draw_down", 0));
            }
            C17N.LJJIIJZLJL(selectSubscribe.Y3());
            selectSubscribe.q4();
            C226068u2.LIZLLL();
        }
        return C76800UCe.LIZ;
    }
}
