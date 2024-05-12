package X;

import com.bytedance.android.livesdk.chatroom.widget.followguide.FollowGuideDialogWidget;
import com.bytedance.android.livesdk.model.message.GuideMessage;

/* renamed from: X.Bnn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29863Bnn extends AbstractC29877Bo1 {
    public final /* synthetic */ FollowGuideDialogWidget LJLILLLLZI;

    @Override // X.InterfaceC29920Boi
    public final void call() {
        ViewOnClickListenerC29861Bnl viewOnClickListenerC29861Bnl = this.LJLILLLLZI.LJLJLLL;
        if (viewOnClickListenerC29861Bnl == null) {
            return;
        }
        if (!new C03880Dg(2).LIZJ(300000, "com/bytedance/android/livesdk/chatroom/widget/followguide/RemindFollowDialog", "show", viewOnClickListenerC29861Bnl, new Object[0], "void", new C65300Pk0(false, "()V", "7546721030735420433")).LIZ) {
            viewOnClickListenerC29861Bnl.show();
        }
        FollowGuideDialogWidget followGuideDialogWidget = this.LJLILLLLZI;
        GuideMessage guideMessage = followGuideDialogWidget.LJLJJI;
        if (guideMessage != null) {
            long j = guideMessage.duration;
            if (j > 0) {
                followGuideDialogWidget.LJLILLLLZI.removeCallbacks(followGuideDialogWidget.LJLLI);
                FollowGuideDialogWidget followGuideDialogWidget2 = this.LJLILLLLZI;
                followGuideDialogWidget2.LJLILLLLZI.postDelayed(followGuideDialogWidget2.LJLLI, j);
            }
        }
        this.LJLILLLLZI.LLFF();
    }

    public C29863Bnn(FollowGuideDialogWidget followGuideDialogWidget) {
        this.LJLILLLLZI = followGuideDialogWidget;
    }
}
