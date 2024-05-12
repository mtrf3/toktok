package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.emoji.sysemoji.SystemEmojiVersionId;

/* renamed from: X.4VF, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4VF extends AbstractC65781Prl implements InterfaceC65784Pro<SystemEmojiVersionId> {
    public static final C4VF LJLIL = new C4VF();

    public C4VF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final SystemEmojiVersionId invoke() {
        try {
            SystemEmojiVersionId systemEmojiVersionId = (SystemEmojiVersionId) SettingsManager.LIZLLL().LJIIIIZZ("sys_emoji_config", SystemEmojiVersionId.class, null);
            if (systemEmojiVersionId == null) {
                return C4VA.LIZ;
            }
            return systemEmojiVersionId;
        } catch (Throwable unused) {
            return C4VA.LIZ;
        }
    }
}
