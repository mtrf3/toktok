package X;

import Y.ARunnableS32S0200000_13;
import Y.ARunnableS49S0100000_13;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.View;
import com.ss.android.ugc.aweme.live.livehostimpl.edit.SpotlightImageListPreviewDialogFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UFr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76891UFr implements UGI {
    public final /* synthetic */ SpotlightImageListPreviewDialogFragment LIZ;
    public final /* synthetic */ Bitmap LIZIZ;
    public final /* synthetic */ float LIZJ;
    public final /* synthetic */ C56K LIZLLL;

    public C76891UFr(SpotlightImageListPreviewDialogFragment spotlightImageListPreviewDialogFragment, Bitmap bitmap, float f, C56K c56k) {
        this.LIZ = spotlightImageListPreviewDialogFragment;
        this.LIZIZ = bitmap;
        this.LIZJ = f;
        this.LIZLLL = c56k;
    }

    @Override // X.UGI
    public final void LIZ() {
        int i;
        int i2;
        List<Bitmap> list;
        EnumC76880UFg enumC76880UFg;
        C76882UFi c76882UFi = this.LIZ.LJLJI;
        if (c76882UFi == null || (enumC76880UFg = c76882UFi.LIZJ) == null) {
            i = -1;
        } else {
            i = C76888UFo.LIZ[enumC76880UFg.ordinal()];
        }
        if (i != 1) {
            if (i == 2) {
                Bitmap bitmap = this.LIZIZ;
                if (bitmap != null && bitmap.getHeight() < this.LIZIZ.getWidth()) {
                    SpotlightImageListPreviewDialogFragment spotlightImageListPreviewDialogFragment = this.LIZ;
                    if (spotlightImageListPreviewDialogFragment.LJLLJ > 0) {
                        C81091Vs7 c81091Vs7 = (C81091Vs7) spotlightImageListPreviewDialogFragment._$_findCachedViewById(R.id.f12);
                        if (c81091Vs7 != null) {
                            c81091Vs7.LJIIIZ(new PointF(500.0f, 1000.0f), 1.0E-4f, 600.0f, new PointF(200.0f, 500.0f));
                        }
                        C81091Vs7 c81091Vs72 = (C81091Vs7) this.LIZ._$_findCachedViewById(R.id.f12);
                        if (c81091Vs72 != null) {
                            c81091Vs72.LJIIJ(1L);
                        }
                        View _$_findCachedViewById = this.LIZ._$_findCachedViewById(R.id.f12);
                        if (_$_findCachedViewById != null) {
                            _$_findCachedViewById.postDelayed(new ARunnableS32S0200000_13(this.LIZ, this.LIZLLL, 44), 50L);
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
            _$_findCachedViewById2.postDelayed(new ARunnableS49S0100000_13(this.LIZ, 92), 100L);
        }
        SpotlightImageListPreviewDialogFragment spotlightImageListPreviewDialogFragment2 = this.LIZ;
        C76882UFi c76882UFi2 = spotlightImageListPreviewDialogFragment2.LJLJI;
        if (c76882UFi2 != null && (list = c76882UFi2.LJI) != null) {
            i2 = list.size();
        } else {
            i2 = 0;
        }
        SpotlightImageListPreviewDialogFragment spotlightImageListPreviewDialogFragment3 = this.LIZ;
        ArrayList arrayList = new ArrayList(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            C81091Vs7 c81091Vs77 = (C81091Vs7) spotlightImageListPreviewDialogFragment3._$_findCachedViewById(R.id.f12);
            c81091Vs77.getClass();
            arrayList.add(new Matrix(c81091Vs77.LJLJLJ));
        }
        spotlightImageListPreviewDialogFragment2.LJLLI = arrayList;
        C81091Vs7 c81091Vs78 = (C81091Vs7) this.LIZ._$_findCachedViewById(R.id.f12);
        Matrix matrix = this.LIZ.LJZI;
        if (matrix == null) {
            c81091Vs78.getClass();
            new Matrix(c81091Vs78.LJLJLJ);
        } else {
            matrix.set(c81091Vs78.LJLJLJ);
        }
    }
}
