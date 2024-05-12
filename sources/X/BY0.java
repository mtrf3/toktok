package X;

import com.bytedance.android.livesdk.model.message.DonationInfoMessage;
import com.bytedance.android.livesdkapi.message.BaseMessage;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class BY0 extends AbstractC31497CXt<InterfaceC28955BXz> implements OnMessageListener {
    @Override // X.AbstractC31497CXt
    /* renamed from: LJJJJ, reason: merged with bridge method [inline-methods] */
    public final void attachView(InterfaceC28955BXz iView) {
        o.LJIIIZ(iView, "iView");
        super.attachView((BY0) iView);
        IMessageManager iMessageManager = this.mMessageManager;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.DONATION_INFO.getIntType(), this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage message) {
        o.LJIIIZ(message, "message");
        if ((message instanceof CR6) && ((BaseMessage) message).getMessageType() == EnumC31509CYf.DONATION_INFO) {
            DonationInfoMessage donationInfoMessage = (DonationInfoMessage) message;
            InterfaceC28955BXz interfaceC28955BXz = (InterfaceC28955BXz) this.mView;
            if (interfaceC28955BXz != null) {
                interfaceC28955BXz.K50(donationInfoMessage);
            }
        }
    }
}
