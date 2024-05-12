package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FakeLandscapeInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.video.PillarBoxVideoInfo;
import kotlin.jvm.internal.o;

/* renamed from: X.Y7r, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C86875Y7r extends AbstractC86878Y7u {
    public final int LJI;
    public final C62822Ol8 LJII;
    public float LJIIIIZZ;
    public float LJIIIZ;
    public final boolean LJIIJ;
    public boolean LJIIJJI;

    @Override // X.AbstractC86878Y7u
    public final void LIZIZ(float f, float f2) {
        View videoView;
        ViewGroup Dp;
        RectF rectF;
        View videoView2;
        boolean z;
        int i;
        if (!this.LJIIJJI && (videoView = this.LIZIZ.getVideoView()) != null && (Dp = this.LIZIZ.Dp()) != null) {
            this.LJIIJJI = true;
            Video video = this.LIZ.getVideo();
            FakeLandscapeInfo fakeLandscapeInfo = video.getFakeLandscapeInfo();
            int height = videoView.getHeight();
            int height2 = Dp.getHeight();
            PillarBoxVideoInfo pillarBoxVideoInfo = video.getPillarBoxVideoInfo();
            o.LJIIIIZZ(fakeLandscapeInfo, "fakeLandscapeInfo");
            if (pillarBoxVideoInfo == null) {
                rectF = new RectF(fakeLandscapeInfo.getLeft(), fakeLandscapeInfo.getTop(), fakeLandscapeInfo.getRight(), fakeLandscapeInfo.getBottom());
            } else {
                RectF LIZIZ = C69665RVt.LIZIZ(pillarBoxVideoInfo);
                rectF = new RectF(Math.max(fakeLandscapeInfo.getLeft(), LIZIZ.left), Math.max(fakeLandscapeInfo.getTop(), LIZIZ.top), Math.min(fakeLandscapeInfo.getRight(), LIZIZ.right), Math.min(fakeLandscapeInfo.getBottom(), LIZIZ.bottom));
            }
            float f3 = rectF.bottom;
            float f4 = rectF.top;
            this.LJIIIIZZ = (f3 - f4) * height;
            this.LJIIIZ = ((f3 + f4) / 2.0f) * height2;
        }
        ViewGroup Dp2 = this.LIZIZ.Dp();
        if (Dp2 == null || (videoView2 = this.LIZIZ.getVideoView()) == null) {
            return;
        }
        int height3 = (Dp2.getHeight() - Dp2.getPaddingTop()) - Dp2.getPaddingBottom();
        float f5 = this.LJIIIIZZ;
        if (C61447O9r.LJIILIIL == 0) {
            z = true;
        } else {
            z = false;
        }
        float f6 = height3;
        float f7 = f6 - (f2 - C61447O9r.LJIILJJIL);
        if (z) {
            i = this.LJI;
        } else {
            i = 0;
        }
        float f8 = f7 - i;
        if (f5 == 0.0f || f2 == 0.0f) {
            return;
        }
        float f9 = f8 / f5;
        if (!this.LJIIJ) {
            f9 = C78842Uww.LJIIJJI(f9, 0.0f, 1.0f);
        }
        float f10 = f / f2;
        float f11 = 1;
        float LIZIZ2 = C06420Na.LIZIZ(f9, f11, f10, 1.0f);
        float f12 = this.LJIIIZ;
        float LIZ = LIZ() - ((C06420Na.LIZIZ(f11, f9, (f6 / 2.0f) - f12, f12) - (f8 / 2.0f)) * f10);
        videoView2.setScaleX(LIZIZ2);
        videoView2.setScaleY(LIZIZ2);
        videoView2.setTranslationY(LIZ);
        View view = this.LIZJ;
        if (view != null) {
            view.setScaleX(LIZIZ2);
            view.setScaleY(LIZIZ2);
            view.setTranslationY(LIZ);
        }
        if (f10 != 1.0f && f10 != 0.0f) {
            return;
        }
        ((AbstractC48820JEa) this.LJII.getValue()).LJIIIIZZ("fakelandscape " + LIZIZ2 + ' ' + videoView2.getTranslationY() + ' ' + f5 + ' ' + f8 + ' ' + f2);
    }

    public C86875Y7r(Aweme aweme, InterfaceC222708oc interfaceC222708oc, View view) {
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
        this.LJII = C221108m2.LIZIZ(C86874Y7q.LJLIL);
        this.LJIIJ = ((Number) C53064Ks8.LIZ.getValue()).intValue() == 1;
    }
}
