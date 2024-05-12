package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.video.PillarBoxVideoInfo;

/* renamed from: X.Y7s, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86876Y7s extends AbstractC86878Y7u {
    public final int LJI;
    public final C62822Ol8 LJII;
    public final boolean LJIIIIZZ;
    public final C62822Ol8 LJIIIZ;
    public boolean LJIIJ;
    public float LJIIJJI;
    public float LJIIL;

    @Override // X.AbstractC86878Y7u
    public final void LIZIZ(float f, float f2) {
        View videoView;
        ViewGroup Dp;
        ViewGroup Dp2;
        boolean z;
        int i;
        if (!this.LJIIJ && (videoView = this.LIZIZ.getVideoView()) != null && (Dp = this.LIZIZ.Dp()) != null) {
            this.LJIIJ = true;
            int height = videoView.getHeight();
            int height2 = Dp.getHeight();
            PillarBoxVideoInfo pillarBoxVideoInfo = this.LIZ.getVideo().getPillarBoxVideoInfo();
            if (((Boolean) this.LJIIIZ.getValue()).booleanValue() && pillarBoxVideoInfo != null && C69665RVt.LIZ(pillarBoxVideoInfo)) {
                RectF LIZIZ = C69665RVt.LIZIZ(pillarBoxVideoInfo);
                float f3 = LIZIZ.bottom;
                float f4 = LIZIZ.top;
                this.LJIIJJI = (f3 - f4) * height;
                this.LJIIL = ((f3 + f4) / 2.0f) * height2;
            } else {
                this.LJIIJJI = height;
                this.LJIIL = height2 / 2.0f;
            }
        }
        View videoView2 = this.LIZIZ.getVideoView();
        if (videoView2 == null || (Dp2 = this.LIZIZ.Dp()) == null) {
            return;
        }
        int height3 = (Dp2.getHeight() - Dp2.getPaddingTop()) - Dp2.getPaddingBottom();
        float f5 = this.LJIIJJI;
        int i2 = C61447O9r.LJIILJJIL;
        if (f5 <= 0.0f || f2 <= 0.0f) {
            return;
        }
        if (C61447O9r.LJIILIIL == 0) {
            z = true;
        } else {
            z = false;
        }
        float f6 = height3;
        float f7 = f2 - i2;
        if (f7 < 0.0f) {
            f7 = 0.0f;
        }
        float f8 = f6 - f7;
        if (z) {
            i = this.LJI;
        } else {
            i = 0;
        }
        float f9 = f8 - i;
        boolean z2 = this.LJIIIIZZ;
        if (z2) {
            f9 *= 1.3333334f;
        }
        float f10 = f9 / f5;
        float f11 = this.LJIIL;
        float f12 = 1;
        float LIZIZ2 = C06420Na.LIZIZ(f12, f10, (f6 / 2.0f) - f11, f11) - (f9 / 2.0f);
        if (z2) {
            LIZIZ2 *= 1.1666666f;
        }
        float f13 = f / f2;
        float LIZIZ3 = C06420Na.LIZIZ(f10, f12, f13, f12);
        float LIZ = LIZ() - ((LIZ() + LIZIZ2) * f13);
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
        ((AbstractC48820JEa) this.LJII.getValue()).LJIIIIZZ("portrait " + LIZIZ3 + ' ' + videoView2.getTranslationY() + ' ' + f9 + ' ' + LIZIZ2 + ' ' + LIZ() + ' ' + f2);
    }

    public C86876Y7s(Aweme aweme, InterfaceC222708oc interfaceC222708oc, View view) {
        super(aweme, interfaceC222708oc, view);
        int i;
        PillarBoxVideoInfo pillarBoxVideoInfo;
        Context context;
        View videoView = interfaceC222708oc.getVideoView();
        boolean z = false;
        if (videoView != null && (context = videoView.getContext()) != null) {
            i = C63081OpJ.LJJJJLI(context);
        } else {
            i = 0;
        }
        this.LJI = i;
        this.LJII = C221108m2.LIZIZ(C86880Y7w.LJLIL);
        this.LJIIIZ = C221108m2.LIZIZ(C86872Y7o.LJLIL);
        if (((Number) C52881KpB.LIZ.getValue()).intValue() == 1) {
            Video video = aweme.getVideo();
            if (video != null && video.getWidth() != 0 && (((pillarBoxVideoInfo = video.getPillarBoxVideoInfo()) == null || !C69665RVt.LIZ(pillarBoxVideoInfo)) && video.getHeight() / video.getWidth() >= 1.3333334f)) {
                z = true;
            }
            this.LJIIIIZZ = z;
        }
    }
}
