package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.video.PillarBoxVideoInfo;

/* renamed from: X.Y7t, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86877Y7t extends AbstractC86878Y7u {
    public final int LJI;
    public final C62822Ol8 LJII;
    public final boolean LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public float LJIIJ;
    public float LJIIJJI;
    public boolean LJIIL;

    @Override // X.AbstractC86878Y7u
    public final void LIZIZ(float f, float f2) {
        View videoView;
        ViewGroup Dp;
        View videoView2;
        boolean z;
        int i;
        if (!this.LJIIL && (videoView = this.LIZIZ.getVideoView()) != null && (Dp = this.LIZIZ.Dp()) != null) {
            this.LJIIL = true;
            int height = videoView.getHeight();
            int height2 = Dp.getHeight();
            PillarBoxVideoInfo pillarBoxVideoInfo = this.LIZ.getVideo().getPillarBoxVideoInfo();
            if (((Boolean) this.LJIIIZ.getValue()).booleanValue() && pillarBoxVideoInfo != null && C69665RVt.LIZ(pillarBoxVideoInfo)) {
                RectF LIZIZ = C69665RVt.LIZIZ(pillarBoxVideoInfo);
                float f3 = LIZIZ.bottom;
                float f4 = LIZIZ.top;
                float f5 = height;
                this.LJIIJ = (f3 - f4) * f5;
                this.LJIIJJI = ((height2 - height) / 2.0f) + (((f3 + f4) * f5) / 2.0f);
            } else {
                this.LJIIJ = height;
                this.LJIIJJI = height2 / 2.0f;
            }
        }
        ViewGroup Dp2 = this.LIZIZ.Dp();
        if (Dp2 == null || (videoView2 = this.LIZIZ.getVideoView()) == null) {
            return;
        }
        int height3 = Dp2.getHeight();
        float f6 = this.LJIIJ;
        if (f2 <= 0.0f || f6 <= 0.0f) {
            return;
        }
        int i2 = C61447O9r.LJIILJJIL;
        if (C61447O9r.LJIILIIL == 0) {
            z = true;
        } else {
            z = false;
        }
        float f7 = height3;
        float f8 = f7 - (f2 - i2);
        if (z) {
            i = this.LJI;
        } else {
            i = 0;
        }
        float f9 = f8 - i;
        float f10 = f9 / f6;
        if (!this.LJIIIIZZ) {
            f10 = C78842Uww.LJIIJJI(f10, 0.0f, 1.0f);
        }
        float f11 = this.LJIIJJI;
        float f12 = 1;
        float LIZIZ2 = C06420Na.LIZIZ(f12, f10, (f7 / 2.0f) - f11, f11) - (f9 / 2.0f);
        float f13 = f / f2;
        float LIZIZ3 = C06420Na.LIZIZ(f10, f12, f13, 1.0f);
        float LIZ = LIZ() - (LIZIZ2 * f13);
        videoView2.setScaleX(LIZIZ3);
        videoView2.setScaleY(LIZIZ3);
        videoView2.setTranslationY(LIZ);
        View view = this.LIZJ;
        if (view != null) {
            view.setScaleX(LIZIZ3);
            view.setScaleY(LIZIZ3);
            view.setTranslationY(LIZ);
        }
        if (f13 != 1.0f && f13 != 0.0f) {
            return;
        }
        ((AbstractC48820JEa) this.LJII.getValue()).LJIIIIZZ("landscape " + LIZIZ3 + ' ' + videoView2.getTranslationY() + ' ' + f6 + ' ' + f9 + ' ' + f2);
    }

    public C86877Y7t(Aweme aweme, InterfaceC222708oc interfaceC222708oc, View view) {
        super(aweme, interfaceC222708oc, view);
        int i;
        Context context;
        View videoView = interfaceC222708oc.getVideoView();
        if (videoView != null && (context = videoView.getContext()) != null) {
            i = C63081OpJ.LJJJJLI(context);
        } else {
            i = 0;
        }
        this.LJI = i;
        this.LJII = C221108m2.LIZIZ(C86879Y7v.LJLIL);
        this.LJIIIIZZ = ((Number) C53064Ks8.LIZ.getValue()).intValue() == 1;
        this.LJIIIZ = C221108m2.LIZIZ(C86871Y7n.LJLIL);
    }
}
