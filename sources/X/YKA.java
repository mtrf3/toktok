package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import com.bytedance.android.livesdk.livesetting.other.LiveBottomRightLikeBehaviorSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveLikeAnimationOptConfig;
import com.bytedance.android.livesdk.livesetting.performance.LiveLikeOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikePerformanceOptimizeSettings;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class YKA extends C1KA {
    public static final int LLIIII = C15380j0.LIZ(36.0f);
    public static final int LLIIIILZ = C15380j0.LIZ(28.0f);
    public static final long LLIIIJ = 2000;
    public static final long LLIIIL = 300;
    public int LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public float LJLJLJ;
    public float LJLJLLL;
    public int LJLL;
    public int LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public boolean LJLLL;
    public float LJLLLL;
    public float LJLLLLLL;
    public long LJLZ;
    public long LJZ;
    public long LJZI;
    public long LJZL;
    public final Paint LL;
    public final Paint LLD;
    public final ArrayList<YKB> LLF;
    public final C1UB<YKD> LLFF;
    public final C1UB<YKE> LLFFF;
    public final boolean LLFII;
    public final boolean LLFZ;
    public final long LLI;
    public boolean LLIFFJFJJ;
    public final YKC LLII;

    public static boolean LIZLLL(float f) {
        return 0.0f <= f && f <= 1.0f;
    }

    public final void LIZ() {
        Iterator<YKB> it = this.LLF.iterator();
        while (it.hasNext()) {
            YKB next = it.next();
            o.LJIIIIZZ(next, "iterator.next()");
            it.remove();
            next.LJIIJJI.cancel();
        }
        C16880lQ.LLIIIJ().removeFrameCallback(this.LLII);
    }

    public final long getIcon_alpha_duration_optimization() {
        return this.LJZL;
    }

    public final float getOthersLikeAnimationDistanceRatio() {
        return this.LJLJLJ;
    }

    public final float getSelfLikeAnimationDistanceRatio() {
        return this.LJLLLL;
    }

    public final long getTotal_duration_optimization() {
        return this.LJZI;
    }

    public final void LIZJ(boolean z) {
        if (z) {
            LiveBottomRightLikeBehaviorSetting liveBottomRightLikeBehaviorSetting = LiveBottomRightLikeBehaviorSetting.INSTANCE;
            float rightBottomSelfAppearAnimationAlphaStart = liveBottomRightLikeBehaviorSetting.getRightBottomSelfAppearAnimationAlphaStart();
            if (LIZLLL(rightBottomSelfAppearAnimationAlphaStart)) {
                this.LJLL = O6R.LJJIIZ(255 * rightBottomSelfAppearAnimationAlphaStart);
            }
            float rightBottomSelfAppearAnimationAlphaEnd = liveBottomRightLikeBehaviorSetting.getRightBottomSelfAppearAnimationAlphaEnd();
            if (LIZLLL(rightBottomSelfAppearAnimationAlphaEnd)) {
                this.LJLLI = O6R.LJJIIZ(255 * rightBottomSelfAppearAnimationAlphaEnd);
            }
            float rightBottomSelfDisappearAnimationAlphaStart = liveBottomRightLikeBehaviorSetting.getRightBottomSelfDisappearAnimationAlphaStart();
            if (LIZLLL(rightBottomSelfDisappearAnimationAlphaStart)) {
                this.LJLLILLLL = O6R.LJJIIZ(255 * rightBottomSelfDisappearAnimationAlphaStart);
            }
            float rightBottomSelfDisappearAnimationAlphaEnd = liveBottomRightLikeBehaviorSetting.getRightBottomSelfDisappearAnimationAlphaEnd();
            if (LIZLLL(rightBottomSelfDisappearAnimationAlphaEnd)) {
                this.LJLLJ = O6R.LJJIIZ(255 * rightBottomSelfDisappearAnimationAlphaEnd);
            }
            this.LJLLL = liveBottomRightLikeBehaviorSetting.rightBottomSelfAnimationBezierEnable();
            float rightBottomSelfAnimationDistanceRatio = liveBottomRightLikeBehaviorSetting.getRightBottomSelfAnimationDistanceRatio();
            if (LIZLLL(rightBottomSelfAnimationDistanceRatio)) {
                this.LJLLLL = rightBottomSelfAnimationDistanceRatio;
            }
            float rightBottomSelfAnimationTimeRatio = liveBottomRightLikeBehaviorSetting.getRightBottomSelfAnimationTimeRatio();
            if (LIZLLL(rightBottomSelfAnimationTimeRatio)) {
                this.LJLLLLLL = rightBottomSelfAnimationTimeRatio;
            }
            this.LJLZ = LIZIZ(this.LJLLLLLL, 200L);
            this.LJZ = LIZIZ(this.LJLLLLLL, 100L);
            this.LJZI = LIZIZ(this.LJLLLLLL, LLIIIJ);
            this.LJZL = LIZIZ(this.LJLLLLLL, LLIIIL);
            return;
        }
        LiveBottomRightLikeBehaviorSetting liveBottomRightLikeBehaviorSetting2 = LiveBottomRightLikeBehaviorSetting.INSTANCE;
        float rightBottomOthersAppearAnimationAlphaStart = liveBottomRightLikeBehaviorSetting2.getRightBottomOthersAppearAnimationAlphaStart();
        if (LIZLLL(rightBottomOthersAppearAnimationAlphaStart)) {
            this.LJLJI = O6R.LJJIIZ(255 * rightBottomOthersAppearAnimationAlphaStart);
        }
        float rightBottomOthersAppearAnimationAlphaEnd = liveBottomRightLikeBehaviorSetting2.getRightBottomOthersAppearAnimationAlphaEnd();
        if (LIZLLL(rightBottomOthersAppearAnimationAlphaEnd)) {
            this.LJLJJI = O6R.LJJIIZ(255 * rightBottomOthersAppearAnimationAlphaEnd);
        }
        float rightBottomOthersDisAppearAnimationAlphaStart = liveBottomRightLikeBehaviorSetting2.getRightBottomOthersDisAppearAnimationAlphaStart();
        if (LIZLLL(rightBottomOthersDisAppearAnimationAlphaStart)) {
            this.LJLJJL = O6R.LJJIIZ(255 * rightBottomOthersDisAppearAnimationAlphaStart);
        }
        float rightBottomOthersDisAppearAnimationAlphaEnd = liveBottomRightLikeBehaviorSetting2.getRightBottomOthersDisAppearAnimationAlphaEnd();
        if (LIZLLL(rightBottomOthersDisAppearAnimationAlphaEnd)) {
            this.LJLJJLL = O6R.LJJIIZ(255 * rightBottomOthersDisAppearAnimationAlphaEnd);
        }
        this.LJLJL = liveBottomRightLikeBehaviorSetting2.rightBottomOthersAnimationBezierEnable();
        float rightBottomOthersAnimationDistanceRatio = liveBottomRightLikeBehaviorSetting2.getRightBottomOthersAnimationDistanceRatio();
        if (LIZLLL(rightBottomOthersAnimationDistanceRatio)) {
            this.LJLJLJ = rightBottomOthersAnimationDistanceRatio;
        }
        float rightBottomOthersAnimationTimeRatio = liveBottomRightLikeBehaviorSetting2.getRightBottomOthersAnimationTimeRatio();
        if (LIZLLL(rightBottomOthersAnimationTimeRatio)) {
            this.LJLJLLL = rightBottomOthersAnimationTimeRatio;
        }
        this.LJZI = LIZIZ(this.LJLJLLL, LLIIIJ);
        this.LJZL = LIZIZ(this.LJLJLLL, LLIIIL);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        o.LJIIIZ(canvas, "canvas");
        if (this.LLF.size() <= 0) {
            return;
        }
        if (!LiveLikePerformanceOptimizeSettings.INSTANCE.enableFunctionDowngrade()) {
            i = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        } else {
            i = 0;
        }
        Iterator<YKB> it = this.LLF.iterator();
        while (it.hasNext()) {
            YKB next = it.next();
            if (next.LIZJ.width() > 0.0f) {
                this.LL.setAlpha(next.LJI);
                Bitmap bitmap = next.LIZ;
                if (bitmap != null && !bitmap.isRecycled()) {
                    canvas.drawBitmap(next.LIZ, (Rect) null, next.LIZJ, this.LL);
                }
            }
            if (next.LIZLLL.width() > 0.0f) {
                this.LL.setAlpha(next.LJII);
                if (!next.LIZIZ.isRecycled()) {
                    canvas.drawBitmap(next.LIZIZ, (Rect) null, next.LIZLLL, this.LL);
                }
            }
            next.LJIIIZ = true;
        }
        if (!LiveLikePerformanceOptimizeSettings.INSTANCE.enableFunctionDowngrade()) {
            canvas.drawPaint(this.LLD);
            canvas.restoreToCount(i);
        }
    }

    public final void setIcon_alpha_duration_optimization(long j) {
        this.LJZL = j;
    }

    public final void setTotal_duration_optimization(long j) {
        this.LJZI = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YKA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C04560Fw.LIZ(context, "context", attributeSet, "attributeSet");
        this.LJLJJI = 255;
        this.LJLJJL = 255;
        this.LJLJL = true;
        this.LJLJLJ = 1.0f;
        this.LJLJLLL = 1.0f;
        this.LJLLI = 255;
        this.LJLLILLLL = 255;
        this.LJLLL = true;
        this.LJLLLL = 1.0f;
        this.LJLLLLLL = 1.0f;
        this.LJLZ = 200L;
        this.LJZ = 100L;
        this.LJZI = 2000L;
        this.LJZL = 300L;
        this.LL = C6D8.LIZIZ(true);
        Paint LIZIZ = C6D8.LIZIZ(true);
        LIZIZ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.LLD = LIZIZ;
        this.LLF = new ArrayList<>();
        this.LLFF = new C1UB<>(7);
        this.LLFFF = new C1UB<>(7);
        LiveLikeOptSetting liveLikeOptSetting = LiveLikeOptSetting.INSTANCE;
        this.LLFII = liveLikeOptSetting.isInterpolatorReuse();
        this.LLFZ = liveLikeOptSetting.isLikeNumTextviewSizeFixedAndDisappearOpt();
        this.LLI = 1000 / LiveLikeAnimationOptConfig.likeAnimationFps();
        this.LLII = new YKC(this);
    }

    public static long LIZIZ(float f, long j) {
        return O6R.LJJIJ(((float) j) * f);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.LLD.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, (getHeight() * 2) / 3, 0, -256, Shader.TileMode.CLAMP));
    }
}
