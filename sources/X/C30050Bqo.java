package X;

import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.ui.LandscapeAudienceInteractionFragment;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.widget.GameLinkWidget;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Bqo, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30050Bqo implements InterfaceC30177Bsr {
    public final /* synthetic */ LandscapeAudienceInteractionFragment LIZ;

    public C30050Bqo(LandscapeAudienceInteractionFragment landscapeAudienceInteractionFragment) {
        this.LIZ = landscapeAudienceInteractionFragment;
    }

    @Override // X.InterfaceC30177Bsr
    public final void LIZ(LiveWidget liveWidget) {
        this.LIZ.mWidgetManager.unload(liveWidget);
    }

    @Override // X.InterfaceC30177Bsr
    public final void LIZIZ(GameLinkWidget gameLinkWidget) {
        gameLinkWidget.setParentView((ViewGroup) this.LIZ.rootView.findViewById(R.id.dqm));
        this.LIZ.mWidgetManager.load(R.id.dqm, (Widget) gameLinkWidget, false);
    }
}
