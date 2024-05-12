package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.actionai.jni.SessionConfig;
import com.bytedance.ies.actionai.jni.SessionConfigBuilder;

/* renamed from: X.Yp7, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88549Yp7 extends AbstractC65781Prl implements InterfaceC65784Pro<SessionConfig> {
    public static final C88549Yp7 LJLIL = new C88549Yp7();

    public C88549Yp7() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final SessionConfig invoke() {
        SessionConfigBuilder llmTimeoutSecond = new SessionConfigBuilder().setBizId("").setLlmKey("").setLlmType("azure").setLlmTimeoutSecond(40);
        SettingsManager.LIZLLL().getClass();
        SessionConfigBuilder enableDynamicActionList = llmTimeoutSecond.setDebugMode(SettingsManager.LIZ("action_ai_enable_debug_mode", false)).setEnableDynamicActionList(true);
        SettingsManager.LIZLLL().getClass();
        SessionConfigBuilder enableChatHistory = enableDynamicActionList.setEnableChatHistory(SettingsManager.LIZ("action_ai_enable_chat_history", false));
        SettingsManager.LIZLLL().getClass();
        return enableChatHistory.setEnableLLMCache(SettingsManager.LIZ("action_ai_enable_llm_cache", true)).setHost(FO5.LIZ()).build();
    }
}
