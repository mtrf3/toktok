package X;

import Y.ARunnableS49S0100000_13;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.SpotlightImageEditDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.Map;

/* loaded from: classes14.dex */
public final class UG5 extends C76894UFu {
    public final /* synthetic */ SpotlightImageEditDialogFragment LIZ;

    public UG5(SpotlightImageEditDialogFragment spotlightImageEditDialogFragment) {
        this.LIZ = spotlightImageEditDialogFragment;
    }

    @Override // X.UGX
    public final void LJJJJ(MotionEvent motionEvent) {
        boolean z;
        java.util.Map<String, Object> map;
        Rect rect;
        this.LIZ.LLD = true;
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
            SpotlightImageEditDialogFragment spotlightImageEditDialogFragment = this.LIZ;
            if (spotlightImageEditDialogFragment.LJLJLJ == null) {
                UGS ugs2 = (UGS) spotlightImageEditDialogFragment._$_findCachedViewById(R.id.i24);
                if (ugs2 != null) {
                    rect = ugs2.getVisibleRect();
                } else {
                    rect = null;
                }
                spotlightImageEditDialogFragment.LJLJLJ = rect;
            }
            UGS ugs3 = (UGS) this.LIZ._$_findCachedViewById(R.id.i24);
            if (ugs3 != null) {
                ugs3.LIZJ();
            }
            BZI LIZ = C28787BRn.LIZ("livesdk_sub_emote_edit_page_cut_up");
            C76883UFj c76883UFj = this.LIZ.LJLIL;
            if (c76883UFj != null && (map = c76883UFj.LJ) != null) {
                for (Map.Entry<String, Object> entry : map.entrySet()) {
                    LIZ.LJIJJ(entry.getValue().toString(), entry.getKey());
                }
            }
            LIZ.LJJIIJZLJL();
            View _$_findCachedViewById = this.LIZ._$_findCachedViewById(R.id.f12);
            if (_$_findCachedViewById == null) {
                return;
            }
            _$_findCachedViewById.postDelayed(new ARunnableS49S0100000_13(this.LIZ, 86), 310L);
        }
    }
}