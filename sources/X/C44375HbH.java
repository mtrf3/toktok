package X;

import com.bytedance.android.livesdk.widgets.giftwidget.GiftWidget;
import com.ss.android.ugc.aweme.draft.model.AVDraftExtras;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: X.HbH, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C44375HbH implements InterfaceC30078BrG, InterfaceC43592H8y {
    public final /* synthetic */ Object LJLIL;

    public /* synthetic */ C44375HbH(Object obj) {
        this.LJLIL = obj;
    }

    @Override // X.InterfaceC43592H8y
    public final String LIZIZ(HBR hbr) {
        AVDraftExtras aVDraftExtras = (AVDraftExtras) this.LJLIL;
        switch (HBQ.LIZ[hbr.ordinal()]) {
            case 1:
                return aVDraftExtras.mainBusinessData;
            case 2:
                return aVDraftExtras.socialData;
            case 3:
                return aVDraftExtras.commerceData;
            case 4:
                return aVDraftExtras.ugData;
            case 5:
                return aVDraftExtras.techData;
            case 6:
                return aVDraftExtras.globalData;
            default:
                return null;
        }
    }

    @Override // X.InterfaceC30078BrG
    public final void LIZJ(final InterfaceC29879Bo3 interfaceC29879Bo3) {
        ((GiftWidget) this.LJLIL).LJLJL.addMessageListener(EnumC31509CYf.GIFT_GUIDE_MESSAGE.getIntType(), new OnMessageListener() { // from class: X.HbI
            @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
            public final void onMessage(IMessage iMessage) {
                InterfaceC29879Bo3.this.invoke(iMessage);
            }
        });
    }
}
