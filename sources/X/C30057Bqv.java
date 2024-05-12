package X;

import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.ui.PortraitAudienceInteractionFragment;
import com.bytedance.android.livesdk.comp.impl.game.linkmic.widget.GameLinkWidget;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Bqv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30057Bqv implements InterfaceC30177Bsr {
    public final /* synthetic */ PortraitAudienceInteractionFragment LIZ;

    public C30057Bqv(PortraitAudienceInteractionFragment portraitAudienceInteractionFragment) {
        this.LIZ = portraitAudienceInteractionFragment;
    }

    @Override // X.InterfaceC30177Bsr
    public final void LIZ(LiveWidget liveWidget) {
        this.LIZ.mWidgetManager.unload(liveWidget);
    }

    @Override // X.InterfaceC30177Bsr
    public final void LIZIZ(GameLinkWidget gameLinkWidget) {
        gameLinkWidget.setParentView((ViewGroup) this.LIZ.rootView.findViewById(R.id.epk));
        this.LIZ.mWidgetManager.load(R.id.h3c, (Widget) gameLinkWidget, false);
    }
}
