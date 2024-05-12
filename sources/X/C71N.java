package X;

import com.bytedance.assem.arch.core.UIAssem;
import com.ss.android.ugc.aweme.comment.keyboard.keyboardv2.refactor.IKeyboardCommentEmojiAssemAbility;
import kotlin.jvm.internal.o;

/* renamed from: X.71N, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C71N extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, Integer, C76800UCe> {
    public static final C71N LJLIL = new C71N();

    public C71N() {
        super(2);
    }

    @Override // X.InterfaceC88471Ynr
    public final C76800UCe invoke(UIAssem uIAssem, Integer num) {
        IKeyboardCommentEmojiAssemAbility iKeyboardCommentEmojiAssemAbility;
        UIAssem selectSubscribe = uIAssem;
        int intValue = num.intValue();
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        if (intValue > 0 && (iKeyboardCommentEmojiAssemAbility = (IKeyboardCommentEmojiAssemAbility) C55096Ljo.LIZ(C55096Ljo.LJIIZILJ(selectSubscribe), IKeyboardCommentEmojiAssemAbility.class, null)) != null) {
            iKeyboardCommentEmojiAssemAbility.Da0(intValue);
        }
        return C76800UCe.LIZ;
    }
}
