package X;

import android.view.View;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.interaction.poll.ui.PollManageDialog;

/* renamed from: X.B4v, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class ViewOnClickListenerC28197B4v implements View.OnClickListener {
    public final /* synthetic */ float LJLIL;
    public final /* synthetic */ PollManageDialog LJLILLLLZI;

    public ViewOnClickListenerC28197B4v(float f, PollManageDialog pollManageDialog) {
        this.LJLIL = f;
        this.LJLILLLLZI = pollManageDialog;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sslocal://webcast_webview_popup?url=https%3A%2F%2Fsf19-draftcdn-sg.ibytedtos.com%2Fobj%2Fies-hotsoon-draft-sg%2Ftiktok-live-faq%2Fgift_pull.html&gravity=bottom&height=");
        LIZ.append(this.LJLIL);
        LIZ.append("rpx&radius=16rpx&use_spark=1");
        ((IActionHandlerService) CN1.LIZ(IActionHandlerService.class)).handle(this.LJLILLLLZI.getContext(), X1D.LIZIZ(LIZ));
    }
}
