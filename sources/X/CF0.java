package X;

import com.bytedance.android.livesdk.chatroom.model.LivePublicScreenMsgPriorityConfig;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenMessageDefaultPrioritySetting;

/* loaded from: classes6.dex */
public final class CF0 extends AbstractC65781Prl implements InterfaceC65784Pro<LivePublicScreenMsgPriorityConfig> {
    public static final CF0 LJLIL = new CF0();

    public CF0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final LivePublicScreenMsgPriorityConfig invoke() {
        return LivePublicScreenMessageDefaultPrioritySetting.INSTANCE.getValue();
    }
}
