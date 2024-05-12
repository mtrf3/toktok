package X;

import Y.ARunnableS49S0100000_13;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.SpotlightImageListPreviewDialogFragment;
import com.zhiliaoapp.musically.R;

/* renamed from: X.UFs, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76892UFs extends C76894UFu {
    public final /* synthetic */ SpotlightImageListPreviewDialogFragment LIZ;

    public C76892UFs(SpotlightImageListPreviewDialogFragment spotlightImageListPreviewDialogFragment) {
        this.LIZ = spotlightImageListPreviewDialogFragment;
    }

    @Override // X.UGX
    public final void LJJJJ(MotionEvent motionEvent) {
        boolean z;
        Rect rect;
        this.LIZ.LJZ = true;
        if (motionEvent != null) {
            if (motionEvent.getAction() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                UGS ugs = (UGS) this.LIZ._$_findCachedViewById(R.id.i24);
                if (ugs != null) {
                    ugs.LIZIZ();
                    return;
                }
                return;
            }
            if (motionEvent == null || motionEvent.getAction() != 1) {
                return;
            }
            SpotlightImageListPreviewDialogFragment spotlightImageListPreviewDialogFragment = this.LIZ;
            if (spotlightImageListPreviewDialogFragment.LJLL == null) {
                UGS ugs2 = (UGS) spotlightImageListPreviewDialogFragment._$_findCachedViewById(R.id.i24);
                if (ugs2 != null) {
                    rect = ugs2.getVisibleRect();
                } else {
                    rect = null;
                }
                spotlightImageListPreviewDialogFragment.LJLL = rect;
            }
            UGS ugs3 = (UGS) this.LIZ._$_findCachedViewById(R.id.i24);
            if (ugs3 != null) {
                ugs3.LIZJ();
            }
            SpotlightImageListPreviewDialogFragment spotlightImageListPreviewDialogFragment2 = this.LIZ;
            BZI LIZ = C28787BRn.LIZ("livesdk_anchor_subscriptoon_highlight_drag_click");
            spotlightImageListPreviewDialogFragment2.xl(LIZ);
            LIZ.LJIJJ(spotlightImageListPreviewDialogFragment2.LJLJL, "show_entrance");
            LIZ.LJJIIJZLJL();
            View _$_findCachedViewById = this.LIZ._$_findCachedViewById(R.id.f12);
            if (_$_findCachedViewById == null) {
                return;
            }
            _$_findCachedViewById.postDelayed(new ARunnableS49S0100000_13(this.LIZ, 91), 310L);
        }
    }
}
