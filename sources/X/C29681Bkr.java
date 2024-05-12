package X;

import com.bytedance.android.live.rank.impl.entrance.widget.RankEntranceWidget;
import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.zhiliaoapp.musically.R;

/* renamed from: X.Bkr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29681Bkr implements InterfaceC31506CYc {
    public final /* synthetic */ C30087BrP LIZ;

    @Override // X.InterfaceC31506CYc
    public final RecyclableWidgetManager LIZJ() {
        return this.LIZ.LJLJJL;
    }

    public C29681Bkr(C30087BrP c30087BrP) {
        this.LIZ = c30087BrP;
    }

    @Override // X.InterfaceC31506CYc
    public final void LIZ(RankEntranceWidget rankEntranceWidget) {
        this.LIZ.LJLJJL.load(R.id.imh, (Widget) rankEntranceWidget, false);
    }

    @Override // X.InterfaceC31506CYc
    public final void LIZIZ(RankEntranceWidget rankEntranceWidget) {
        this.LIZ.LJLJJL.load(R.id.img, (Widget) rankEntranceWidget, false);
    }
}
