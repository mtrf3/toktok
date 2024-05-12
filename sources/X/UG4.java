package X;

import Y.ARunnableS32S0200000_13;
import Y.ARunnableS49S0100000_13;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.view.View;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.SpotlightImageEditDialogFragment;
import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public final class UG4 implements UGI {
    public final /* synthetic */ SpotlightImageEditDialogFragment LIZ;
    public final /* synthetic */ Bitmap LIZIZ;
    public final /* synthetic */ float LIZJ;
    public final /* synthetic */ C56K LIZLLL;

    public UG4(SpotlightImageEditDialogFragment spotlightImageEditDialogFragment, Bitmap bitmap, float f, C56K c56k) {
        this.LIZ = spotlightImageEditDialogFragment;
        this.LIZIZ = bitmap;
        this.LIZJ = f;
        this.LIZLLL = c56k;
    }

    @Override // X.UGI
    public final void LIZ() {
        int i;
        EnumC76880UFg enumC76880UFg;
        C76883UFj c76883UFj = this.LIZ.LJLIL;
        if (c76883UFj == null || (enumC76880UFg = c76883UFj.LIZIZ) == null) {
            i = -1;
        } else {
            i = C76887UFn.LIZ[enumC76880UFg.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                Bitmap bitmap = this.LIZIZ;
                if (bitmap != null && bitmap.getHeight() < this.LIZIZ.getWidth()) {
                    SpotlightImageEditDialogFragment spotlightImageEditDialogFragment = this.LIZ;
                    if (spotlightImageEditDialogFragment.LJLZ > 0) {
                        C81091Vs7 c81091Vs7 = (C81091Vs7) spotlightImageEditDialogFragment._$_findCachedViewById(R.id.f12);
                        if (c81091Vs7 != null) {
                            c81091Vs7.LJIIIZ(new PointF(500.0f, 1000.0f), 1.0E-4f, 600.0f, new PointF(200.0f, 500.0f));
                        }
                        C81091Vs7 c81091Vs72 = (C81091Vs7) this.LIZ._$_findCachedViewById(R.id.f12);
                        if (c81091Vs72 != null) {
                            c81091Vs72.LJIIJ(1L);
                        }
                        View _$_findCachedViewById = this.LIZ._$_findCachedViewById(R.id.f12);
                        if (_$_findCachedViewById != null) {
                            _$_findCachedViewById.postDelayed(new ARunnableS32S0200000_13(this.LIZ, this.LIZLLL, 43), 50L);
                        }
                    }
                }
                C81091Vs7 c81091Vs73 = (C81091Vs7) this.LIZ._$_findCachedViewById(R.id.f12);
                if (c81091Vs73 != null) {
                    c81091Vs73.LJIIIZ(new PointF(0.0f, this.LIZJ), 1.0f, 1.0f, new PointF(0.0f, 0.0f));
                }
                C81091Vs7 c81091Vs74 = (C81091Vs7) this.LIZ._$_findCachedViewById(R.id.f12);
                if (c81091Vs74 != null) {
                    c81091Vs74.LJIIJ(null);
                }
            }
        } else {
            C81091Vs7 c81091Vs75 = (C81091Vs7) this.LIZ._$_findCachedViewById(R.id.f12);
            if (c81091Vs75 != null) {
                c81091Vs75.LJIIIZ(new PointF(500.0f, 1000.0f), 1.0E-4f, 600.0f, new PointF(200.0f, 500.0f));
            }
            C81091Vs7 c81091Vs76 = (C81091Vs7) this.LIZ._$_findCachedViewById(R.id.f12);
            if (c81091Vs76 != null) {
                c81091Vs76.LJIIJ(1L);
            }
        }
        View _$_findCachedViewById2 = this.LIZ._$_findCachedViewById(R.id.f12);
        if (_$_findCachedViewById2 != null) {
            _$_findCachedViewById2.postDelayed(new ARunnableS49S0100000_13(this.LIZ, 89), 100L);
        }
    }
}
