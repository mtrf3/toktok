package X;

import Y.ARunnableS21S0200000_2;
import android.content.Intent;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.ftc.pages.FTCChooseCoverFragment;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import dmt.av.video.VEEditorAutoStartStopArbiter;
import java.io.Serializable;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Xr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162076Xr extends C08Z {
    public final ActivityC45651qj LIZ;
    public final FTCChooseCoverFragment LIZIZ;
    public final VideoPublishEditModel LIZJ;
    public final C138635cJ LIZLLL;
    public final InterfaceC65784Pro<ImageView> LJ;
    public final InterfaceC65784Pro<SurfaceView> LJFF;

    @Override // X.C08Z
    public final void onFragmentDetached(FragmentManager fm, Fragment f) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        super.onFragmentDetached(fm, f);
        if (f instanceof FTCChooseCoverFragment) {
            Intent intent = new Intent();
            VideoPublishEditModel model = this.LIZJ;
            o.LJIIIZ(model, "model");
            intent.putExtra("KEY_VIDEO_COVER_CHOOSE_RESULT", (Serializable) model);
            CreativeModel creativeModel = model.creativeModel;
            o.LJIIIIZZ(creativeModel, "model.creativeModel");
            C78996UzQ.LJJIZ(intent, creativeModel);
            this.LIZ.setResult(-1, intent);
            this.LIZ.finish();
        }
    }

    public final void LIZ(int i, int i2, int i3) {
        ViewGroup.LayoutParams layoutParams = this.LJ.invoke().getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin = i;
        layoutParams2.width = i2;
        layoutParams2.height = i3;
        this.LJ.invoke().setLayoutParams(layoutParams2);
    }

    @Override // X.C08Z
    public final void onFragmentActivityCreated(FragmentManager fm, Fragment f, Bundle bundle) {
        o.LJIIIZ(fm, "fm");
        o.LJIIIZ(f, "f");
        super.onFragmentActivityCreated(fm, f, bundle);
        if (f instanceof FTCChooseCoverFragment) {
            VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = this.LIZLLL.LJIIIIZZ;
            if (vEEditorAutoStartStopArbiter != null) {
                vEEditorAutoStartStopArbiter.LIZJ(true, false);
            }
            View view = f.getView();
            if (view != null) {
                view.postDelayed(new ARunnableS21S0200000_2(this, f, 44), 300L);
            }
        }
    }

    public C162076Xr(ActivityC45651qj mHost, FTCChooseCoverFragment fTCChooseCoverFragment, VideoPublishEditModel videoPublishEditModel, C135315St c135315St, AqS152S0100000_2 aqS152S0100000_2, AqS152S0100000_2 aqS152S0100000_22) {
        o.LJIIIZ(mHost, "mHost");
        this.LIZ = mHost;
        this.LIZIZ = fTCChooseCoverFragment;
        this.LIZJ = videoPublishEditModel;
        this.LIZLLL = c135315St;
        this.LJ = aqS152S0100000_2;
        this.LJFF = aqS152S0100000_22;
    }
}
