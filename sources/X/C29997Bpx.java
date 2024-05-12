package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.android.livesdk.like.OptimizedLikeHelper;
import com.bytedance.android.livesdk.like.widget.SelfLikeViewOptimizedWidget;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveLikeDegradeSettings;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.Bpx, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29997Bpx extends AbstractC29998Bpy {
    public final Bitmap LIZ;
    public final /* synthetic */ SelfLikeViewOptimizedWidget LIZIZ;

    public C29997Bpx(SelfLikeViewOptimizedWidget selfLikeViewOptimizedWidget) {
        this.LIZIZ = selfLikeViewOptimizedWidget;
        this.LIZ = OptimizedLikeHelper.LJJIJIIJIL(BitmapFactory.decodeResource(selfLikeViewOptimizedWidget.context.getResources(), R.drawable.cuk), OptimizedLikeHelper.LLILZ);
    }

    public final void LIZ(Bitmap bitmap) {
        int LJFF;
        int i;
        o.LJIIIZ(bitmap, "bitmap");
        if (LiveLikeDegradeSettings.INSTANCE.disableBottomView(this.LIZIZ.dataChannel)) {
            return;
        }
        LikeHelper likeHelper = this.LIZIZ.LJLLI;
        if (likeHelper != null) {
            LJFF = likeHelper.LJJIIJ();
        } else {
            LJFF = C15380j0.LJFF(R.dimen.a_d);
        }
        int i2 = (LJFF - YK3.LJLJJL) / 2;
        if (i2 > 0) {
            i = V0Q.Default.nextInt(-i2, i2);
        } else {
            i = 0;
        }
        YK3 yk3 = this.LIZIZ.LJLJI;
        if (yk3 != null) {
            float f = LJFF / 2;
            float f2 = f + i;
            yk3.LIZ(bitmap, f, OptimizedLikeHelper.LLILZLL, f2, OptimizedLikeHelper.LLIZ, f2, OptimizedLikeHelper.LLILZIL);
            return;
        }
        o.LJIJI("bottomLikeOptimizedView");
        throw null;
    }
}
