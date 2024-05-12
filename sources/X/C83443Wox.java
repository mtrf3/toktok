package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.actionai.config.ActionAITopKConfig;

/* renamed from: X.Wox, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83443Wox extends AbstractC65781Prl implements InterfaceC65784Pro<ActionAITopKConfig.ActionAITopK> {
    public static final C83443Wox LJLIL = new C83443Wox();

    public C83443Wox() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.aweme.actionai.config.ActionAITopKConfig$ActionAITopK, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final ActionAITopKConfig.ActionAITopK invoke() {
        return SettingsManager.LIZLLL().LJIIIIZZ("action_ai_bot_search_topk", ActionAITopKConfig.ActionAITopK.class, ActionAITopKConfig.LIZ);
    }
}
