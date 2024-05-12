package X;

import com.bytedance.android.livesdk.drawerfeed.LiveDrawerDialogV3;
import com.zhiliaoapp.musically.R;

/* loaded from: classes6.dex */
public final class BOQ implements BL7 {
    public final /* synthetic */ LiveDrawerDialogV3 LIZ;

    @Override // X.BL7
    public final void LIZ() {
        this.LIZ.T5(false, true);
    }

    @Override // X.BL7
    public final void LIZIZ() {
        LiveDrawerDialogV3 liveDrawerDialogV3 = this.LIZ;
        if (C16330kX.LIZIZ(liveDrawerDialogV3._$_findCachedViewById(R.id.chi))) {
            ((C025107z) liveDrawerDialogV3._$_findCachedViewById(R.id.chi)).requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // X.BL7
    public final void LJII() {
        ((CVT) this.LIZ._$_findCachedViewById(R.id.ce9)).setVisibility(0);
    }

    @Override // X.BL7
    public final void LJIJ() {
        ((CVT) this.LIZ._$_findCachedViewById(R.id.ce9)).setVisibility(8);
    }

    @Override // X.BL7
    public final boolean isOpen() {
        return this.LIZ.Dl();
    }

    public BOQ(LiveDrawerDialogV3 liveDrawerDialogV3) {
        this.LIZ = liveDrawerDialogV3;
    }
}
