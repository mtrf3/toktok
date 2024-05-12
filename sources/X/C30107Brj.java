package X;

import com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceWidget;
import com.bytedance.android.livesdk.chatroom.ui.AbsAudienceInteractionFragment;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Brj, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30107Brj implements InterfaceC31506CYc {
    public final /* synthetic */ AbsAudienceInteractionFragment LIZ;

    @Override // X.InterfaceC31506CYc
    public final RecyclableWidgetManager LIZJ() {
        return this.LIZ.mWidgetManager;
    }

    public C30107Brj(AbsAudienceInteractionFragment absAudienceInteractionFragment) {
        this.LIZ = absAudienceInteractionFragment;
    }

    @Override // X.InterfaceC31506CYc
    public final void LIZ(RankEntranceWidget rankEntranceWidget) {
        RecyclableWidgetManager recyclableWidgetManager = this.LIZ.mWidgetManager;
        if (recyclableWidgetManager != null) {
            recyclableWidgetManager.load(R.id.imh, (Widget) rankEntranceWidget, false);
        }
    }

    @Override // X.InterfaceC31506CYc
    public final void LIZIZ(RankEntranceWidget rankEntranceWidget) {
        RecyclableWidgetManager recyclableWidgetManager = this.LIZ.mWidgetManager;
        if (recyclableWidgetManager != null) {
            recyclableWidgetManager.load(R.id.img, (Widget) rankEntranceWidget, false);
        }
    }
}
