package X;

import Y.ARunnableS24S0200000_5;
import com.bytedance.android.livesdk.model.message.GiftCollectionUpdateMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.YeW, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87892YeW extends C1PU implements InterfaceC31329CRh<GiftCollectionUpdateMessage> {
    public final C09800a0 LIZLLL;

    @Override // X.InterfaceC31329CRh
    public final void release() {
        this.LIZLLL.LJ();
    }

    @Override // X.C1PU
    public final C09800a0 LIZLLL() {
        return this.LIZLLL;
    }

    public C87892YeW(DataChannel dataChannel) {
        C09800a0 c09800a0 = new C09800a0(dataChannel, this.LIZJ);
        c09800a0.LIZ(new C1PT());
        this.LIZLLL = c09800a0;
    }

    @Override // X.InterfaceC31329CRh
    public final boolean LIZIZ(GiftCollectionUpdateMessage giftCollectionUpdateMessage, CQQ publicScreenContext) {
        GiftCollectionUpdateMessage message = giftCollectionUpdateMessage;
        o.LJIIIZ(message, "message");
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
        if (message.giftCollection.messageType == 2) {
            if (!this.LIZLLL.LIZIZ()) {
                LIZJ(new ARunnableS24S0200000_5(publicScreenContext, message, 82));
            }
            return !this.LIZLLL.LIZIZ();
        }
        return false;
    }
}
