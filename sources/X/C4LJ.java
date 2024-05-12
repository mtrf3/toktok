package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.sdk.common.controller.appsettings.MessageReactionV2EmojiSetSettings;
import java.util.List;

/* renamed from: X.4LJ, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4LJ extends AbstractC65781Prl implements InterfaceC65784Pro<List<? extends String>> {
    public static final C4LJ LJLIL = new C4LJ();

    public C4LJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final List<? extends String> invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        MessageReactionV2EmojiSetSettings.MessageReactionV2EmojiSetModel messageReactionV2EmojiSetModel = MessageReactionV2EmojiSetSettings.LIZ;
        MessageReactionV2EmojiSetSettings.MessageReactionV2EmojiSetModel messageReactionV2EmojiSetModel2 = (MessageReactionV2EmojiSetSettings.MessageReactionV2EmojiSetModel) LIZLLL.LJIIIIZZ("message_reaction_v2_emoji_set", MessageReactionV2EmojiSetSettings.MessageReactionV2EmojiSetModel.class, messageReactionV2EmojiSetModel);
        if (messageReactionV2EmojiSetModel2 != null) {
            messageReactionV2EmojiSetModel = messageReactionV2EmojiSetModel2;
        }
        List<String> list = messageReactionV2EmojiSetModel.reactionEmojiSetV4;
        if (list == null) {
            return C47261Igj.LJJIJIIJI("❤️", "😂", "😡", "😭", "👍", "🤔", "🎉", "🤗", "😳", "😱", "🤪", "🙈");
        }
        return list;
    }
}
