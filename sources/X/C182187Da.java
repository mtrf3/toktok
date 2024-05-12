package X;

import com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim.EmojiAnimAssem;
import kotlin.jvm.internal.o;

/* renamed from: X.7Da, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C182187Da extends AbstractC65781Prl implements InterfaceC88471Ynr<EmojiAnimAssem, C43I<? extends C195357lb>, C76800UCe> {
    public static final C182187Da LJLIL = new C182187Da();

    public C182187Da() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(EmojiAnimAssem emojiAnimAssem, C43I<? extends C195357lb> c43i) {
        EmojiAnimAssem selectSubscribe = emojiAnimAssem;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (selectSubscribe.LJLLL && C79488VHo.LIZIZ()) {
            C80985VqP c80985VqP = selectSubscribe.LLFFF;
            if (c80985VqP != null) {
                c80985VqP.LIZIZ();
            } else {
                o.LJIJI("animMgr");
                throw null;
            }
        }
        return C76800UCe.LIZ;
    }
}
