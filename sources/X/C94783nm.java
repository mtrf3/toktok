package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.typingindicator.TypingStatusConfig;
import kotlin.jvm.internal.o;

/* renamed from: X.3nm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C94783nm extends AbstractC65781Prl implements InterfaceC65784Pro<TypingStatusConfig> {
    public static final C94783nm LJLIL = new C94783nm();

    public C94783nm() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final TypingStatusConfig invoke() {
        TypingStatusConfig typingStatusConfig;
        try {
            SettingsManager LIZLLL = SettingsManager.LIZLLL();
            typingStatusConfig = C94773nl.LIZ;
            TypingStatusConfig typingStatusConfig2 = (TypingStatusConfig) LIZLLL.LJIIIIZZ("typing_indicator_config", TypingStatusConfig.class, typingStatusConfig);
            if (typingStatusConfig2 != null) {
                typingStatusConfig = typingStatusConfig2;
            }
        } catch (Throwable unused) {
            typingStatusConfig = C94773nl.LIZ;
        }
        o.LJIIIIZZ(typingStatusConfig, "try {\n            Settin…        DEFAULT\n        }");
        return typingStatusConfig;
    }
}
