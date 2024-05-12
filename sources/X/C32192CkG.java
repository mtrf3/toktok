package X;

import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerVM;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnIMMessageListener;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.CkG, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32192CkG implements InterfaceC32193CkH {
    public final /* synthetic */ LivePreviewPlayerVM LIZ;

    public C32192CkG(LivePreviewPlayerVM livePreviewPlayerVM) {
        this.LIZ = livePreviewPlayerVM;
    }

    @Override // X.InterfaceC32193CkH
    public final void LIZ(List messageTypeList, C76308TxA imListener) {
        IMessageManager iMessageManager;
        IMessageManager iMessageManager2;
        o.LJIIIZ(messageTypeList, "messageTypeList");
        o.LJIIIZ(imListener, "imListener");
        C0NB.LJIIIZ("LivePreviewPlayerVM", "registerIM");
        if (!messageTypeList.isEmpty()) {
            Iterator it = messageTypeList.iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                C86343Xud hv0 = this.LIZ.hv0();
                if (hv0 != null && (iMessageManager2 = hv0.LJIL) != null) {
                    iMessageManager2.addMessageListener(intValue, (OnIMMessageListener) imListener);
                }
            }
            C86343Xud hv02 = this.LIZ.hv0();
            if (hv02 != null && (iMessageManager = hv02.LJIL) != null) {
                iMessageManager.needMessage();
            }
        }
    }

    @Override // X.InterfaceC32193CkH
    public final void LIZIZ(List messageTypeList, C76308TxA imListener) {
        IMessageManager iMessageManager;
        o.LJIIIZ(messageTypeList, "messageTypeList");
        o.LJIIIZ(imListener, "imListener");
        C0NB.LJIIIZ("LivePreviewPlayerVM", "unRegisterIM");
        C86343Xud hv0 = this.LIZ.hv0();
        if (hv0 != null && (iMessageManager = hv0.LJIL) != null) {
            iMessageManager.removeMessageListener((OnIMMessageListener) imListener);
        }
    }
}
