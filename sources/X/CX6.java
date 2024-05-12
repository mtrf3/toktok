package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.android.livesdk.livesetting.other.LiveSelfLinkedLikeBehaviorSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import defpackage.a1;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class CX6 extends View {
    public static final int LJLJJL = C15380j0.LIZ(42.0f);
    public DataChannel LJLIL;
    public final Paint LJLILLLLZI;
    public final ConcurrentLinkedQueue<CXC> LJLJI;
    public final ConcurrentLinkedQueue<CX7> LJLJJI;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        o.LJIIIZ(canvas, "canvas");
        Iterator<CXC> it = this.LJLJI.iterator();
        while (it.hasNext()) {
            CXC next = it.next();
            if (!next.LIZ.isRecycled()) {
                canvas.save();
                this.LJLILLLLZI.setAlpha(next.LIZJ);
                float f = next.LIZLLL;
                if (f != 0.0f) {
                    canvas.rotate(f, next.LIZIZ.centerX(), next.LIZIZ.centerY());
                }
                canvas.drawBitmap(next.LIZ, (Rect) null, next.LIZIZ, this.LJLILLLLZI);
                canvas.restore();
            }
        }
        Iterator<CX7> it2 = this.LJLJJI.iterator();
        while (it2.hasNext()) {
            CX7 next2 = it2.next();
            if (!next2.LIZ.isRecycled()) {
                this.LJLILLLLZI.setAlpha(next2.LIZIZ);
                canvas.drawBitmap(next2.LIZ, (Rect) null, next2.LIZJ, this.LJLILLLLZI);
            }
        }
    }

    public final void setDataChannel(DataChannel dataChannel) {
        this.LJLIL = dataChannel;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CX6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a1.LJFF(context, "context");
        this.LJLILLLLZI = new Paint(1);
        this.LJLJI = new ConcurrentLinkedQueue<>();
        this.LJLJJI = new ConcurrentLinkedQueue<>();
    }

    public final void LIZ(Bitmap bitmap, PointF pointF, PointF pointF2) {
        LiveSelfLinkedLikeBehaviorSetting liveSelfLinkedLikeBehaviorSetting = LiveSelfLinkedLikeBehaviorSetting.INSTANCE;
        if (liveSelfLinkedLikeBehaviorSetting.isSelfLikePathAnimationEnable()) {
            CXC cxc = new CXC(this, bitmap, pointF, pointF2);
            this.LJLJI.add(cxc);
            cxc.LJFF.start();
        }
        if (liveSelfLinkedLikeBehaviorSetting.isSelfLikeSimpleAnimationEnable()) {
            CX7 cx7 = new CX7(this, bitmap, pointF);
            this.LJLJJI.add(cx7);
            cx7.LIZLLL.start();
        }
    }
}
