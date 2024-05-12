package X;

import com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim.EmojiAnimAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.o;

/* renamed from: X.7DZ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C7DZ extends AbstractC65781Prl implements InterfaceC88471Ynr<EmojiAnimAssem, C178646zk, C76800UCe> {
    public static final C7DZ LJLIL = new C7DZ();

    public C7DZ() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(EmojiAnimAssem emojiAnimAssem, C178646zk c178646zk) {
        String str;
        EmojiAnimAssem selectSubscribe = emojiAnimAssem;
        C178646zk c178646zk2 = c178646zk;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (c178646zk2 != null) {
            String str2 = c178646zk2.LJLILLLLZI;
            Aweme aweme = ((VideoItemParams) C51029K0z.LJIILLIIL(selectSubscribe)).getAweme();
            if (aweme != null) {
                str = aweme.getAid();
            } else {
                str = null;
            }
            if (o.LJ(str2, str) && c178646zk2.LJLJI.length() != 0 && c178646zk2.LJLIL == 1) {
                C80985VqP c80985VqP = selectSubscribe.LLFFF;
                if (c80985VqP != null) {
                    c80985VqP.LIZJ(c178646zk2.LJLJI);
                } else {
                    o.LJIJI("animMgr");
                    throw null;
                }
            }
        }
        return C76800UCe.LIZ;
    }
}
