package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.broadcast.guide.GuidanceViewModel;
import com.bytedance.android.livesdk.model.message.NewAnchorGuideMessage;
import com.bytedance.android.livesdk.model.message.NewAnchorGuideMsgInfo;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;

/* renamed from: X.BvC, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30322BvC implements OnMessageListener {
    public final /* synthetic */ GuidanceViewModel LJLIL;
    public final /* synthetic */ LifecycleOwner LJLILLLLZI;

    public C30322BvC(GuidanceViewModel guidanceViewModel, LifecycleOwner lifecycleOwner) {
        this.LJLIL = guidanceViewModel;
        this.LJLILLLLZI = lifecycleOwner;
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        NewAnchorGuideMessage newAnchorGuideMessage;
        NewAnchorGuideMessage newAnchorGuideMessage2;
        GuidanceViewModel guidanceViewModel = this.LJLIL;
        NewAnchorGuideMsgInfo newAnchorGuideMsgInfo = null;
        if (guidanceViewModel.LJLJJLL != null || guidanceViewModel.LJLJLLL != null) {
            if ((iMessage instanceof NewAnchorGuideMessage) && (newAnchorGuideMessage = (NewAnchorGuideMessage) iMessage) != null) {
                newAnchorGuideMsgInfo = newAnchorGuideMessage.guideMsg;
            }
            guidanceViewModel.mv0(newAnchorGuideMsgInfo);
            return;
        }
        if ((iMessage instanceof NewAnchorGuideMessage) && (newAnchorGuideMessage2 = (NewAnchorGuideMessage) iMessage) != null) {
            newAnchorGuideMsgInfo = newAnchorGuideMessage2.guideMsg;
        }
        guidanceViewModel.kv0(newAnchorGuideMsgInfo, this.LJLILLLLZI);
    }
}
