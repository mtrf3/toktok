package X;

import Y.ARunnableS24S0200000_5;
import com.bytedance.android.livesdk.model.message.LinkMicAudienceNoticeMessage;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.o;

/* renamed from: X.YeU, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87890YeU extends C1PU implements InterfaceC31329CRh<LinkMicAudienceNoticeMessage> {
    public final C09800a0 LIZLLL;

    @Override // X.InterfaceC31329CRh
    public final void release() {
        this.LIZLLL.LJ();
    }

    @Override // X.C1PU
    public final C09800a0 LIZLLL() {
        return this.LIZLLL;
    }

    public C87890YeU(DataChannel dataChannel) {
        C09800a0 c09800a0 = new C09800a0(dataChannel, this.LIZJ);
        c09800a0.LIZ(new C1PT());
        this.LIZLLL = c09800a0;
    }

    @Override // X.InterfaceC31329CRh
    public final boolean LIZIZ(LinkMicAudienceNoticeMessage linkMicAudienceNoticeMessage, CQQ publicScreenContext) {
        LinkMicAudienceNoticeMessage message = linkMicAudienceNoticeMessage;
        o.LJIIIZ(message, "message");
        o.LJIIIZ(publicScreenContext, "publicScreenContext");
        if (!this.LIZLLL.LIZIZ()) {
            LIZJ(new ARunnableS24S0200000_5(publicScreenContext, message, 80));
        }
        return !this.LIZLLL.LIZIZ();
    }
}
