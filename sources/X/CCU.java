package X;

import com.bytedance.android.livesdk.model.message.PollMessage;
import com.bytedance.ies.sdk.datachannel.NextLiveData;

/* loaded from: classes6.dex */
public final class CCU extends AbstractC65781Prl implements InterfaceC65784Pro<NextLiveData<PollMessage>> {
    public static final CCU LJLIL = new CCU();

    public CCU() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final NextLiveData<PollMessage> invoke() {
        return new NextLiveData<>();
    }
}
