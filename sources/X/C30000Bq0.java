package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.like.OptimizedLikeHelper;
import com.bytedance.android.livesdk.like.widget.SelfLikeWidget;
import com.bytedance.android.livesdk.livesetting.performance.LiveLikeAnimationOptConfig;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikeDegradeSettings;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikePerformanceOptimizeSettings;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Bq0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30000Bq0 extends AbstractC30009Bq9 {
    public Bitmap LIZ;
    public final /* synthetic */ SelfLikeWidget LIZIZ;

    public C30000Bq0(SelfLikeWidget selfLikeWidget) {
        this.LIZIZ = selfLikeWidget;
        this.LIZ = OptimizedLikeHelper.LJJIJIIJIL(BitmapFactory.decodeResource(selfLikeWidget.context.getResources(), R.drawable.cuk), OptimizedLikeHelper.LLILZ);
    }

    public final void LIZ(Bitmap bitmap) {
        int LJFF;
        int i;
        o.LJIIIZ(bitmap, "bitmap");
        if (LiveLikeDegradeSettings.INSTANCE.disableBottomView(this.LIZIZ.dataChannel)) {
            return;
        }
        if (LiveLikePerformanceOptimizeSettings.INSTANCE.enableFunctionDowngrade()) {
            long currentTimeMillis = System.currentTimeMillis();
            SelfLikeWidget selfLikeWidget = this.LIZIZ;
            if (currentTimeMillis - selfLikeWidget.LJLLILLLL < selfLikeWidget.LJLLI) {
                return;
            } else {
                selfLikeWidget.LJLLILLLL = System.currentTimeMillis();
            }
        }
        Bitmap bitmap2 = this.LIZ;
        SelfLikeWidget selfLikeWidget2 = this.LIZIZ;
        LikeHelper likeHelper = selfLikeWidget2.LJLL;
        if (likeHelper != null) {
            LJFF = likeHelper.LJJIIJ();
        } else {
            LJFF = C15380j0.LJFF(R.dimen.a_d);
        }
        int i2 = (LJFF - YKA.LLIIII) / 2;
        if (i2 > 0) {
            i = V0Q.Default.nextInt(-i2, i2);
        } else {
            i = 0;
        }
        YKA yka = selfLikeWidget2.LJLJI;
        if (yka != null) {
            float f = LJFF / 2;
            PointF pointF = new PointF(f, C15380j0.LIZ(selfLikeWidget2.LJLLJ));
            float f2 = f + i;
            yka.LLF.add(new YKB(yka, true, bitmap2, bitmap, pointF, new PointF(f2, C15380j0.LIZ(selfLikeWidget2.LJLLL)), new PointF(f2, C15380j0.LIZ(selfLikeWidget2.LJLLLL))));
            if (LiveLikeAnimationOptConfig.likeAnimationFluencyOpt() && !yka.LLIFFJFJJ) {
                yka.LLII.doFrame(0L);
                yka.LLIFFJFJJ = true;
                return;
            }
            return;
        }
        o.LJIJI("bottomLikeView");
        throw null;
    }
}
