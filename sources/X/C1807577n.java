package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.comment.quickcomment.QuickEmojiExtension;

/* renamed from: X.77n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C1807577n extends AbstractC65781Prl implements InterfaceC65784Pro<QuickEmojiExtension[]> {
    public static final C1807577n LJLIL = new C1807577n();

    public C1807577n() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.ss.android.ugc.aweme.comment.quickcomment.QuickEmojiExtension[]] */
    @Override // X.InterfaceC65784Pro
    public final QuickEmojiExtension[] invoke() {
        ?? LJIIIIZZ = SettingsManager.LIZLLL().LJIIIIZZ("tt_quick_comment_emoji_extension", QuickEmojiExtension[].class, C1807477m.LIZIZ);
        if (LJIIIIZZ == 0) {
            return new QuickEmojiExtension[0];
        }
        return LJIIIIZZ;
    }
}
